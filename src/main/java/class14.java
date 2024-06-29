import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public abstract class class14 {

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lna;")
    public static class26 field166 = class6.method40("Sword Shop", 48);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lna;")
    public static class26 field168 = class6.method40("Dairy Churn", 48);

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lna;")
    public static class26 field170 = class6.method40("Short)2cut", 48);

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "I")
    public static int field169 = 1;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[I")
    public static int[] field165 = new int[128];

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "[B")
    public static byte[] field167;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 5)
    public static final int method83(int arg0, KeyEvent arg1) {
        if (arg0 != -257) {
            return 6;
        }
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 48)
    public static void method84(int arg0) {
        field170 = null;
        field165 = null;
        field166 = null;
        field167 = null;
        field168 = null;
        if (arg0 != -20514) {
            field168 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 63)
    public static final Object method85(int arg0, byte[] arg1, boolean arg2) {
        int var3 = -82 % ((68 - arg0) / 41);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class6.field75) {
            try {
                class19 var4 = (class19) Class.forName("f").getDeclaredConstructor().newInstance();
                var4.method118(45, arg1);
                return var4;
            } catch (Throwable var6) {
                class6.field75 = true;
            }
        }
        return arg2 ? class1.method12(arg1, (byte) -94) : arg1;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I)V", line = 109)
    public static final void method86(int arg0) {
        class7 var1 = class8.field93;
        synchronized (class8.field93) {
            class6.field69 = class19.field204;
            if (class25.field363 >= 0) {
                while (class33.field432 != class25.field363) {
                    int var2 = field165[class33.field432];
                    class33.field432 = class33.field432 + 1 & 0x7F;
                    if (var2 < 0) {
                        class8.field92[~var2] = false;
                    } else {
                        class8.field92[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class8.field92[var3] = false;
                }
                class25.field363 = class33.field432;
            }
            class19.field204 = class31.field410;
            if (arg0 != 32) {
                field169 = -95;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lh;", line = 150)
    public static final class13 method87(Throwable arg0, String arg1) {
        class13 var2;
        if (arg0 instanceof class13) {
            var2 = (class13) arg0;
            var2.field162 = var2.field162 + ' ' + arg1;
        } else {
            var2 = new class13(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V")
    public abstract void method75(byte arg0);

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(III)I")
    public abstract int method73(int arg0, int arg1, int arg2);
}
