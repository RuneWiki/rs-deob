import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class85 {

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public int field901 = 8;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public int field903 = 16777215;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Ljo;")
    public static class303 field900;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
    public boolean field907;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[I")
    public static int[] field906;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method535(int arg0, int arg1, int arg2) {
        field905++;
        if (arg1 == -24976) {
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Liaa;I)V", line = 17)
    public final void method536(class452 arg0, int arg1) {
        int var3 = -52 / ((44 - arg1) / 50);
        while (true) {
            int var4 = arg0.method2541(126);
            if (var4 == 0) {
                field909++;
                return;
            }
            this.method538(6, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V", line = 38)
    public static void method537(boolean arg0) {
        field900 = null;
        field906 = null;
        if (arg0) {
            method539(-77, 73, null, 1, -45);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILiaa;I)V", line = 58)
    private final void method538(int arg0, class452 arg1, int arg2) {
        if (arg0 != 6) {
            this.field908 = -119;
        }
        field911++;
        if (arg2 == 1) {
            this.field901 = arg1.method2574(-1758460248);
        } else if (arg2 == 2) {
            this.field907 = true;
        } else if (arg2 == 3) {
            this.field910 = arg1.method2549((byte) 32);
            this.field904 = arg1.method2549((byte) 32);
            this.field908 = arg1.method2549((byte) 32);
        } else if (arg2 == 4) {
            this.field902 = arg1.method2541(120);
        } else if (arg2 == 5) {
            this.field898 = arg1.method2574(-1758460248);
        } else if (arg2 == 6) {
            this.field903 = arg1.method2524(3);
            return;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILse;II)V", line = 110)
    public static final void method539(int arg0, int arg1, class232 arg2, int arg3, int arg4) {
        field899++;
        long var5 = (long) (arg4 << 28 | arg1 << 14 | arg0);
        class43 var7 = (class43) class152.field1725.method3234((byte) -32, var5);
        if (var7 == null) {
            class43 var8 = new class43();
            class152.field1725.method3235(var5, arg3 ^ 0x1, var8);
            var8.field451.method3164(arg2, arg3 ^ 0xFFFFFEFE);
            return;
        }
        class537 var9 = class472.field6588.method1903(arg2.field2958, (byte) -116);
        int var10 = var9.field7724;
        if (var9.field7741 == 1) {
            var10 = (arg2.field2951 + 1) * var10;
        }
        for (class232 var11 = (class232) var7.field451.method3174((byte) 49); var11 != null; var11 = (class232) var7.field451.method3168(false)) {
            class537 var12 = class472.field6588.method1903(var11.field2958, (byte) 51);
            int var13 = var12.field7724;
            if (var12.field7741 == 1) {
                var13 = (var11.field2951 + 1) * var13;
            }
            if (var10 > var13) {
                class243.method1410(arg2, var11, arg3 ^ 0xFFFFEC76);
                return;
            }
        }
        var7.field451.method3164(arg2, 256);
        if (arg3 != -2) {
            field906 = null;
        }
    }
}
