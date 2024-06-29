import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class495 extends class571 {

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "Lfba;")
    public static class27 field7065 = new class27(32, 3);

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "Lje;")
    public class421 field7063;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "Z")
    public boolean field7062;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "[Lag;")
    public class711[] field7067;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILha;I)Z", line = 3)
    public final boolean method3006(int arg0, int arg1, class65 arg2, int arg3) {
        field7066++;
        int var5 = this.field7063.method2546((byte) -76);
        if (this.field7067 != null) {
            for (int var6 = 0; var6 < this.field7067.length; var6++) {
                this.field7067[var6].field9873 <<= var5;
                if (this.field7067[var6].method4004(arg3, arg0) && this.field7063.method902(arg3, -17458, arg0, arg2)) {
                    this.field7067[var6].field9873 >>= var5;
                    return true;
                }
                this.field7067[var6].field9873 >>= var5;
            }
        }
        if (arg1 < 55) {
            field7065 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZIII)V", line = 37)
    public static final void method3007(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field7064++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class504.field7155 - class37.field490) * var6 / 100 + class37.field490;
        if (var7 < class695.field9713) {
            var7 = class695.field9713;
        } else if (class210.field3252 < var7) {
            var7 = class210.field3252;
        }
        int var8 = arg5 * var7 * 512 / (arg3 * 334);
        if (class96.field1099 > var8) {
            short var9 = class96.field1099;
            var7 = arg3 * var9 * 334 / (arg5 * 512);
            if (class210.field3252 < var7) {
                var7 = class210.field3252;
                int var10 = var7 * 512 * arg5 / (var9 * 334);
                int var11 = (arg3 - var10) / 2;
                if (arg2) {
                    class37.field491.method511();
                    class37.field491.method436(arg1, var11, -16777216, arg0, true, arg5);
                    class37.field491.method436(arg1 + arg3 - var11, var11, -16777216, arg0, true, arg5);
                }
                arg3 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class311.field4438 < var8) {
            short var12 = class311.field4438;
            var7 = arg3 * var12 * 334 / (arg5 * 512);
            if (var7 < class695.field9713) {
                var7 = class695.field9713;
                int var13 = arg3 * var12 * 334 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg2) {
                    class37.field491.method511();
                    class37.field491.method436(arg1, arg3, -16777216, arg0, true, var14);
                    class37.field491.method436(arg1, arg3, -16777216, arg0 + arg5 - var14, true, var14);
                }
                arg5 -= var14 * 2;
                arg0 += var14;
            }
        }
        class193.field2979 = arg5 * var7 / 334;
        class353.field4962 = (short) arg3;
        class670.field9317 = arg0;
        class6.field66 = arg1;
        if (arg4 == 2) {
            class250.field3688 = (short) arg5;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)V", line = 148)
    public static final void method3008(int arg0, int arg1) {
        field7068++;
        class313 var2 = class312.method1998((long) arg1, arg0, arg0 - 9);
        var2.method2006(-45);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 159)
    public static void method3009(int arg0) {
        field7065 = null;
        if (arg0 != 3512) {
            field7065 = null;
        }
    }
}
