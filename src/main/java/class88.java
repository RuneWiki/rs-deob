import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class88 {

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "Lmha;")
    public static class701 field1209 = new class701(15, 0, 1, 0);

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "Lwu;")
    public static class557 field1211;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([BIII)I", line = 3)
    public static final int method530(byte[] arg0, int arg1, int arg2, int arg3) {
        field1208++;
        if (arg1 != 2) {
            field1211 = null;
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = class566.field8048[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIII)V", line = 37)
    public static final void method531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1210++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = arg3;
        int var9 = class325.method1901(arg1 + arg4, class490.field6592, class116.field1628, true);
        int var10 = class325.method1901(arg1 - arg4, class490.field6592, class116.field1628, true);
        class721.method4044(class591.field8480[arg0], var10, (byte) -122, var9, arg2);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class675.field9512 <= var12 && var11 <= class395.field5484) {
                    int var13 = class325.method1901(arg1 + var5, class490.field6592, class116.field1628, true);
                    int var14 = class325.method1901(arg1 - var5, class490.field6592, class116.field1628, true);
                    if (class395.field5484 >= var12) {
                        class721.method4044(class591.field8480[var12], var14, (byte) -126, var13, arg2);
                    }
                    if (class675.field9512 <= var11) {
                        class721.method4044(class591.field8480[var11], var14, (byte) -123, var13, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class675.field9512 && class395.field5484 >= var15) {
                int var17 = class325.method1901(arg1 + var6, class490.field6592, class116.field1628, true);
                int var18 = class325.method1901(arg1 - var6, class490.field6592, class116.field1628, true);
                if (var16 <= class395.field5484) {
                    class721.method4044(class591.field8480[var16], var18, (byte) -127, var17, arg2);
                }
                if (class675.field9512 <= var15) {
                    class721.method4044(class591.field8480[var15], var18, (byte) -120, var17, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V", line = 111)
    public static void method532(int arg0) {
        field1211 = null;
        field1209 = null;
        if (arg0 < 15) {
            method532(39);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lwu;ILmr;)V", line = 122)
    public static final void method533(class557 arg0, int arg1, class613 arg2) {
        int var3 = -65 / ((56 - arg1) / 41);
        class548.field7717 = arg2;
        field1207++;
        class61.field828 = arg0;
        class271.field3662 = "";
        if (class66.field910.startsWith("win")) {
            class271.field3662 = class271.field3662 + "windows/";
        } else if (class66.field910.startsWith("linux")) {
            class271.field3662 = class271.field3662 + "linux/";
        } else if (class66.field910.startsWith("mac")) {
            class271.field3662 = class271.field3662 + "macos/";
        }
        if (class548.field7717.field8720) {
            class271.field3662 = class271.field3662 + "msjava/";
        } else if (class66.field911.startsWith("amd64") || class66.field911.startsWith("x86_64")) {
            class271.field3662 = class271.field3662 + "x86_64/";
        } else if (class66.field911.startsWith("i386") || class66.field911.startsWith("i486") || class66.field911.startsWith("i586") || class66.field911.startsWith("x86")) {
            class271.field3662 = class271.field3662 + "x86/";
        } else if (class66.field911.startsWith("ppc")) {
            class271.field3662 = class271.field3662 + "ppc/";
        } else {
            class271.field3662 = class271.field3662 + "universal/";
        }
    }
}
