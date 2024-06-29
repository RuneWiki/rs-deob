import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class60 extends class137 {

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "Ljava/lang/String;")
    public static String field977 = null;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field984 = -1;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field975 = 1;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field979 = -1;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "C")
    private char field989;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lvb;")
    public static class140 field983;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "Ldk;")
    public static class251 field988;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "Ljava/lang/String;")
    public String field986;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "[I")
    public static int[] field976;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "[S")
    public static short[] field990;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ldk;IBI)[Lqi;")
    public static final class232[] method407(class251 arg0, int arg1, byte arg2, int arg3) {
        field991++;
        if (arg2 != 111) {
            field983 = null;
        }
        return class290.method1932(-18, arg1, arg3, arg0) ? class253.method1709(true) : null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lwd;II)V")
    private final void method408(class162 arg0, int arg1, int arg2) {
        if (arg1 != 28674) {
            return;
        }
        if (arg2 == 1) {
            this.field989 = class309.method2061(arg0.method1107((byte) -106), (byte) -54);
        } else if (arg2 == 2) {
            this.field974 = arg0.method1157(65280);
        } else if (arg2 == 5) {
            this.field986 = arg0.method1152(-88);
        }
        field980++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static final void method409(byte arg0) {
        if (arg0 <= -53) {
            class274.field4404.method1255(-126);
            field981++;
            class160.field2547.method1255(-121);
        }
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)Z")
    public final boolean method410(int arg0) {
        if (arg0 <= 21) {
            return true;
        } else {
            field982++;
            return this.field989 == 's';
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILwd;)V")
    public final void method411(int arg0, class162 arg1) {
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                if (arg0 != -116) {
                    field984 = 122;
                }
                field987++;
                return;
            }
            this.method408(arg1, arg0 + 28790, var3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
    public static final void method412(int arg0, int arg1) {
        field985++;
        class175 var2 = class182.method1317(arg0, arg1, false);
        var2.method1278((byte) 99);
    }

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "(I)V")
    public static void method413(int arg0) {
        field983 = null;
        field988 = null;
        if (arg0 != -22787) {
            field978 = -15;
        }
        field990 = null;
        field976 = null;
        field977 = null;
    }
}
