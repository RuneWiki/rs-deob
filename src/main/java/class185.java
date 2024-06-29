import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class185 extends class112 {

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field2937 = 2048;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    private int field2938 = 12288;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    private int field2939 = 4096;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    private int field2934 = 0;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
    private int field2946 = 0;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    private int field2936 = 8192;

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "I")
    private int field2948 = 2048;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "[B")
    public static byte[] field2932 = new byte[520];

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "Lwm;")
    public static class152 field2945 = class157.method1048("runes", 92);

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "I")
    public static int field2947 = -1;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "Lek;")
    public static class183 field2944 = new class183();

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "Lwm;")
    public static class152 field2950 = class157.method1048("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", 116);

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ldi;I)[Llb;", line = 4)
    public static final class210[] method1229(class151 arg0, int arg1) {
        field2935++;
        if (!arg0.method953(-6801)) {
            return new class210[0];
        }
        class188 var2 = arg0.method970(true);
        while (var2.field2980 == 0) {
            class4.method19(0, 10L);
        }
        if (var2.field2980 == 2) {
            return new class210[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2977);
        class210[] var4 = new class210[var3.length >> 2];
        int var5 = 0;
        int var6 = 62 % ((23 - arg1) / 51);
        while (var5 < var4.length) {
            class210 var7 = new class210();
            var4[var5] = var7;
            var7.field3412 = var3[var5 << 2];
            var7.field3411 = var3[(var5 << 2) + 1];
            var7.field3414 = var3[(var5 << 2) + 2];
            var7.field3413 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)Z", line = 47)
    private final boolean method1230(boolean arg0, int arg1, int arg2) {
        field2941++;
        if (!arg0) {
            field2932 = (byte[]) null;
        }
        int var4 = (arg1 + arg2) * this.field2938 >> 12;
        int var5 = class268.field4522[(var4 * 255 & 0xFFA3D) >> 12];
        int var6 = (var5 << 12) / this.field2938;
        int var7 = (var6 << 12) / this.field2936;
        int var8 = this.field2939 * var7 >> 12;
        return var8 > arg1 - arg2 && -var8 < arg1 - arg2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[I", line = 70)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            this.field2948 = -28;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 113);
        field2942++;
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1] - 2048;
            for (int var5 = 0; var5 < class58.field889; var5++) {
                int var6 = class131.field1992[var5] - 2048;
                int var7 = this.field2937 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = this.field2946 + var4;
                int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = var4 + this.field2948;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field2934 + var6;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method1231(47, var12, var10) || this.method1230(true, var15, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 120)
    public final void method673(int arg0) {
        if (arg0 != 8) {
            this.method53((byte) 73, 57);
        }
        field2933++;
        class243.method1667(14);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)Z", line = 135)
    private final boolean method1231(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - arg2) * this.field2938 >> 12;
        field2943++;
        int var5 = -14 % ((arg0 + 33) / 44);
        int var6 = class268.field4522[(var4 * 255 & 0xFF03A) >> 12];
        int var7 = (var6 << 12) / this.field2938;
        int var8 = (var7 << 12) / this.field2936;
        int var9 = this.field2939 * var8 >> 12;
        return var9 > arg1 + arg2 && -var9 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 150)
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)Lie;", line = 156)
    public static final class87 method1232(int arg0, int arg1) {
        field2949++;
        class87 var2 = (class87) class85.field1194.method1620(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1007.method1381(33, arg1, arg0 - 21584);
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method571(arg1, 0, new class291(var3));
        }
        if (arg0 != 21584) {
            method1232(18, 50);
        }
        class85.field1194.method1614(var4, (long) arg1, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V", line = 183)
    public static void method1233(int arg0) {
        field2932 = null;
        if (arg0 == 31422) {
            field2944 = null;
            field2945 = null;
            field2950 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILhi;)V", line = 221)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field2937 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field2946 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field2934 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field2948 = arg2.method2021((byte) 74);
        } else if (arg1 == 4) {
            this.field2938 = arg2.method2021((byte) 74);
        } else if (arg1 == 5) {
            this.field2939 = arg2.method2021((byte) 74);
        } else if (arg1 == 6) {
            this.field2936 = arg2.method2021((byte) 74);
        }
        field2931++;
        if (arg0 != 31164) {
            this.method673(-89);
        }
    }
}
