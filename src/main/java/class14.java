import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class14 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[Lof;")
    public volatile class225[] field153 = new class225[2];

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
    public volatile boolean field150 = false;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Z")
    public volatile boolean field146 = false;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lbe;")
    public static class283 field143 = class153.method941(-62, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lbe;")
    public static class283 field148 = class153.method941(-40, "VOLL");

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "D")
    public static double field152 = -1.0D;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lbe;")
    private static class283 field157 = class153.method941(-102, "Players");

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lbe;")
    public static class283 field149 = field157;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lbe;")
    public static class283 field151 = class153.method941(126, "<col=ffff00>");

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[S")
    public static short[] field155 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lbe;")
    public static class283 field158 = class153.method941(-118, ")3)3)3");

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lui;")
    public class251 field156;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[[B")
    public static byte[][] field147;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 18)
    public static final void method74(int arg0) {
        field154++;
        class222.method1457((byte) 127);
        class241.method1624(-70);
        class302.method2047(110);
        class151.method935((byte) -28);
        class272.method1831((byte) -106);
        class302.method2046((byte) -15);
        class256.method1730(0);
        class180.method1185(true);
        class74.method492(4);
        class279.method1859(true);
        class203.method1298((byte) 34);
        class89.method575((byte) -29);
        if (arg0 != 4550) {
            field148 = (class283) null;
        }
        class292.method1986(-95);
        class223.method1466(-120);
        class217.field3678.method1636(arg0 - 4438);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I", line = 50)
    public static final int method75(int arg0, int arg1, int arg2, int arg3) {
        field144++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return arg1 == 4626 ? (arg2 >> 5 << 7) + ((arg3 >> 2 << 10) + (arg0 >> 1)) : 38;
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 91)
    public final void run() {
        this.field146 = true;
        field145++;
        try {
            while (!this.field150) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class225 var2 = this.field153[var1];
                    if (var2 != null) {
                        var2.method1481((byte) 120);
                    }
                }
                class2.method11((byte) -20, 10L);
                class65.method419(this.field156, (Object) null, 1);
            }
        } catch (Exception var7) {
            class296.method2011(true, (String) null, var7);
        } finally {
            this.field146 = false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 135)
    public static void method76(boolean arg0) {
        field158 = null;
        field143 = null;
        field155 = null;
        field148 = null;
        field151 = null;
        field149 = null;
        if (arg0) {
            method76(false);
        }
        field157 = null;
        field147 = (byte[][]) null;
    }
}
