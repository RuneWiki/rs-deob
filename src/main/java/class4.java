import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class14 {

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Z")
    public boolean field121 = false;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Led;")
    private class41 field123;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "Z")
    public boolean field136;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Z")
    public boolean field132;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "J")
    public static long field117 = 0L;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "Lea;")
    private static class38 field122 = class9.method46((byte) 116, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "[J")
    public static long[] field124 = new long[32];

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "Lea;")
    public static class38 field133 = class9.method46((byte) 125, "<col=ff9040>");

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "Lea;")
    public static class38 field135 = field122;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "F")
    private float field137;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "[I")
    private static int[] field130;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldd;Lue;Z)Z")
    public final boolean method19(class32 arg0, class184 arg1, boolean arg2) {
        field134++;
        if (!arg2) {
            this.method19(null, null, false);
        }
        return this.field123.method307(arg1, arg0, (byte) -83);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILdd;B)[Lk;")
    public static final class89[] method20(int arg0, int arg1, class32 arg2, byte arg3) {
        field126++;
        if (arg3 <= 44) {
            field117 = 0L;
        }
        return class74.method592(arg0, arg2, (byte) 124, arg1) ? class52.method382(124) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILue;Ldd;I)[I")
    public final int[] method21(int arg0, class184 arg1, class32 arg2, int arg3) {
        field114++;
        if (this.field123.method307(arg1, arg2, (byte) -89)) {
            int var5 = -98 % ((-arg0 - 44) / 60);
            int var6 = this.field127 <= arg3 ? this.field127 : arg3;
            return this.field123.method304(var6, 1.0F, var6, false, arg2, true, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        field128++;
        if (this.field129 == null) {
            return;
        }
        if (arg1 != 64) {
            this.method21(-3, null, null, 107);
        }
        if (this.field131 != 0) {
            if (field130 == null || field130.length < this.field129.length) {
                field130 = new int[this.field129.length];
            }
            short var3;
            if (this.field129.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field120 * arg0 * var3;
            if (this.field131 == 2) {
                var4 = -var4;
            }
            int var5 = this.field129.length;
            int var6 = var5 - 1;
            for (int var7 = 0; var7 < var5; var7++) {
                int var9 = var7 + var4 & var6;
                field130[var7] = this.field129[var9];
            }
            int[] var8 = this.field129;
            this.field129 = field130;
            field130 = var8;
        }
        if (this.field116 == 0) {
            return;
        }
        if (field130 == null || field130.length < this.field129.length) {
            field130 = new int[this.field129.length];
        }
        int var10 = this.field129.length;
        short var11;
        if (this.field129.length == 4096) {
            var11 = 64;
        } else {
            var11 = 128;
        }
        int var12 = this.field120 * arg0;
        if (this.field116 == 1) {
            var12 = -var12;
        }
        int var13 = var11 - 1;
        for (int var14 = 0; var14 < var10; var14 += var11) {
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = var14 + var16;
                int var18 = (var12 + var16 & var13) + var14;
                field130[var17] = this.field129[var18];
            }
        }
        int[] var15 = this.field129;
        this.field129 = field130;
        field130 = var15;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IFLue;Ldd;I)[I")
    public final int[] method23(int arg0, float arg1, class184 arg2, class32 arg3, int arg4) {
        field125++;
        if (this.field129 == null || this.field137 != arg1) {
            if (!this.field123.method307(arg2, arg3, (byte) -90)) {
                return null;
            }
            int var6 = this.field127 <= arg4 ? this.field127 : arg4;
            this.field129 = this.field123.method304(var6, arg1, var6, true, arg3, true, arg2);
            this.field137 = arg1;
        }
        if (arg0 != -10538) {
            this.field120 = -52;
        }
        return this.field129;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public static void method24(int arg0) {
        field124 = null;
        field133 = null;
        int var1 = -22 / ((-arg0 - 45) / 32);
        field122 = null;
        field135 = null;
        field130 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lhc;)V")
    public class4(class66 arg0) {
        this.field123 = new class41(arg0);
        int var2 = arg0.method509(127);
        this.field136 = (var2 & 0x2) != 0;
        this.field132 = (var2 & 0x1) != 0;
        this.field127 = arg0.method509(124);
        this.field115 = arg0.method511(79);
        this.field119 = arg0.method509(121);
        if (this.field119 == 255) {
            this.field119 = 256;
        }
        int var3 = arg0.method509(126);
        int var4 = arg0.method509(125);
        this.field116 = var3 >> 6 & 0x3;
        this.field131 = var4 >> 6 & 0x3;
        this.field120 = (var4 & 0x3F) - 6;
        arg0.method509(121);
        arg0.method509(126);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        this.field123 = new class41();
        this.field132 = true;
        this.field127 = 1;
    }
}
