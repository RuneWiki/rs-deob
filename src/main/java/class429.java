import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class429 {

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    private int field5879;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
    public static int[] field5880 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 6)
    public static void method2476(byte arg0) {
        if (arg0 == 125) {
            field5880 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILit;)I", line = 16)
    public static final int method2477(int arg0, class455 arg1) {
        if (arg0 > -11) {
            field5883 = 90;
        }
        field5874++;
        if (arg1.field6177 == 0) {
            return 0;
        }
        if (arg1.field6202 != -1) {
            class455 var2 = null;
            if (arg1.field6202 < 32768) {
                var2 = class291.field3822[arg1.field6202];
            } else if (arg1.field6202 >= 32768) {
                var2 = class499.field6901[arg1.field6202 - 32768];
            }
            if (var2 != null) {
                int var3 = arg1.field584 - var2.field584;
                int var4 = arg1.field574 - var2.field574;
                if (var3 != 0 || var4 != 0) {
                    arg1.method2595((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, false);
                }
            }
        }
        if ((arg1 instanceof class515)) {
            class515 var8 = (class515) arg1;
            if (var8.field7611 != -1 && (var8.field6257 == 0 || var8.field6263 > 0)) {
                var8.method2595(var8.field7611, false);
                var8.field7611 = -1;
            }
        } else if (arg1 instanceof class117) {
            class117 var5 = (class117) arg1;
            if (var5.field1671 != -1 && (var5.field6257 == 0 || var5.field6263 > 0)) {
                int var6 = var5.field584 - ((var5.field1671 - (class401.field5382 + class401.field5382)) * 64);
                int var7 = var5.field574 - ((var5.field1658 - class421.field5762 - class421.field5762) * 64);
                if (var6 != 0 || var7 != 0) {
                    var5.method2595((int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF, false);
                }
                var5.field1671 = -1;
            }
        }
        return arg1.method2591(98);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 91)
    public static final void method2478(String arg0, byte arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field5881++;
        System.exit(1);
        if (arg1 <= 9) {
            field5880 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 103)
    public final void method2479(int arg0) {
        field5878++;
        OpenGL.glEndList();
        if (arg0 != -16981) {
            field5880 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CI)V", line = 117)
    public final void method2480(char arg0, int arg1) {
        if (arg1 != -1) {
            this.method2480((char) 65534, -34);
        }
        OpenGL.glCallList(this.field5879 + arg0);
        field5875++;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)Z", line = 133)
    public static final boolean method2481(int arg0, int arg1, int arg2) {
        if (arg2 != 393216) {
            method2478(null, (byte) -28);
        }
        field5877++;
        return (arg1 & 0x60000) != 0 | class206.method1322(arg0, (byte) 53, arg1) || class480.method2760(arg0, 98, arg1) || class422.method2428(arg1, arg0, 16);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V", line = 146)
    public final void method2482(int arg0, int arg1) {
        if (arg1 >= -24) {
            this.field5879 = 118;
        }
        OpenGL.glNewList(this.field5879 + arg0, 4864);
        field5876++;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lbo;I)V", line = 156)
    public class429(class511 arg0, int arg1) {
        this.field5879 = OpenGL.glGenLists(arg1);
    }
}
