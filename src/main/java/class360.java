import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class360 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field5145 = -1;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field5151 = -1;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
    public static int[] field5155 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field5154 = 0;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field5147 = 0;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "B")
    public static byte field5146;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
    public int[] field5153;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)I", line = 7)
    public static final int method2123(int arg0, int arg1, byte arg2, int arg3) {
        field5149++;
        int var4 = ((arg1 & 0xFF00) * arg3 & 0xFF0000 | (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg3;
        if (arg2 != 40) {
            method2128(-55);
        }
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 25)
    public static void method2124(int arg0) {
        field5155 = null;
        if (arg0 != -16711936) {
            method2123(44, 19, (byte) -62, -79);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 42)
    public static final void method2125(int arg0) {
        field5156++;
        if (class488.field6832 == 6) {
            class287.method1771(false, -2049);
            return;
        }
        class251.field3742 = class50.field608;
        if (arg0 < -120) {
            class50.field608 = null;
            class86.method623(12, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILwm;I)V", line = 65)
    private final void method2126(int arg0, class403 arg1, int arg2) {
        if (arg2 != 160) {
            field5144 = -76;
        }
        if (arg0 == 1) {
            this.field5145 = arg1.method2338(0);
        } else if (arg0 == 2) {
            this.field5153 = new int[arg1.method2357((byte) 107)];
            for (int var4 = 0; var4 < this.field5153.length; var4++) {
                this.field5153[var4] = arg1.method2338(0);
            }
        } else if (arg0 == 3) {
            this.field5151 = arg1.method2357((byte) 125);
        }
        field5148++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwm;B)V", line = 104)
    public final void method2127(class403 arg0, byte arg1) {
        field5150++;
        while (true) {
            int var3 = arg0.method2357((byte) 114);
            if (var3 == 0) {
                if (arg1 > -82) {
                    field5155 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2126(var3, arg0, 160);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 128)
    public static final void method2128(int arg0) {
        field5152++;
        class322.field4640.method1096((byte) -59);
        class188.field2699.method1096((byte) -24);
        if (arg0 == 255) {
            class362.field5182.method1096((byte) 118);
            class293.field4289.method1096((byte) -52);
            class62.field783.method1096((byte) -103);
        }
    }
}
