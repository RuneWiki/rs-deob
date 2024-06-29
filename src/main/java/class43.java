import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends RuntimeException {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Ljava/lang/String;")
    public String field1157;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1156;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "La;")
    public static class1 field1151 = class113.method934(-11538, "Regelversto-8 melden");

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "La;")
    public static class1 field1148 = class113.method934(-11538, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "La;")
    private static class1 field1152 = class113.method934(-11538, "Select");

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "La;")
    public static class1 field1153 = field1152;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1154;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1158;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method468(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 17)
    public static void method463(int arg0) {
        field1152 = null;
        field1148 = null;
        field1151 = null;
        if (arg0 >= -39) {
            field1146 = 95;
        }
        field1153 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 30)
    public static final void method464(byte arg0) {
        field1147++;
        if (class5.field218 == null) {
            return;
        }
        long var1 = class103.method872(1);
        if (var1 <= class14.field463) {
            return;
        }
        class5.field218.method256(var1);
        int var3 = (int) (var1 - class14.field463);
        class14.field463 = var1;
        synchronized (field1158 == null ? (field1158 = method468("ca")) : field1158) {
            if (arg0 <= 81) {
                method464((byte) -96);
            }
            class44.field1159 += class5.field193 * var3;
            int var5 = (class44.field1159 - class5.field193 * 2000) / 1000;
            if (var5 > 0) {
                if (class52.field1384 != null) {
                    class52.field1384.method128(var5);
                }
                class44.field1159 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BBLsa;I)V", line = 70)
    public static final void method465(byte[] arg0, byte arg1, class109 arg2, int arg3) {
        int var4 = 0 / ((arg1 - 17) / 35);
        field1150++;
        class57 var5 = new class57();
        var5.field2076 = arg3;
        var5.field1457 = arg0;
        var5.field1467 = 0;
        var5.field1472 = arg2;
        class92 var6 = class62.field1550;
        synchronized (class62.field1550) {
            class62.field1550.method807(var5, -82);
        }
        class48.method502(600);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 99)
    public static final void method466(Component arg0, byte arg1) {
        arg0.addMouseListener(class54.field1415);
        int var2 = -23 / ((-arg1 - 32) / 47);
        field1154++;
        arg0.addMouseMotionListener(class54.field1415);
        arg0.addFocusListener(class54.field1415);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 124)
    public static final void method467(int arg0) {
        class70.field1750.method573(10);
        for (int var1 = 0; var1 < 32; var1++) {
            class64.field1604[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class133.field3284[var2] = 0L;
        }
        if (arg0 <= 67) {
            field1146 = -3;
        }
        field1149++;
        class22.field682 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 153)
    public class43(Throwable arg0, String arg1) {
        this.field1157 = arg1;
        this.field1156 = arg0;
    }
}
