import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class389 extends class627 {

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
    public int field5413 = 0;

    @OriginalMember(owner = "client!hca", name = "G", descriptor = "Lga;")
    public static class70 field5423 = new class70("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public int field5401;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!hca", name = "I", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!hca", name = "K", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!hca", name = "M", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!hca", name = "O", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!hca", name = "P", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!hca", name = "L", descriptor = "Ldv;")
    public class124 field5428;

    @OriginalMember(owner = "client!hca", name = "J", descriptor = "Lqg;")
    public class290 field5426;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Llea;")
    public class546 field5408;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Lma;")
    public class639 field5400;

    @OriginalMember(owner = "client!hca", name = "N", descriptor = "Lma;")
    public class639 field5430;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "Lbf;")
    public class729 field5418;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "Lbf;")
    public class729 field5419;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Ltea;")
    public class759 field5406;

    @OriginalMember(owner = "client!hca", name = "E", descriptor = "Ltea;")
    public class759 field5421;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "Z")
    public boolean field5414;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "Z")
    public boolean field5417;

    @OriginalMember(owner = "client!hca", name = "D", descriptor = "Z")
    public boolean field5420;

    @OriginalMember(owner = "client!hca", name = "F", descriptor = "[I")
    public int[] field5422;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BFIFF)F")
    public static final float method2321(byte arg0, float arg1, int arg2, float arg3, float arg4) {
        field5411++;
        float[] var5 = class183.field2400[arg2];
        return arg0 == -60 ? var5[2] * arg1 + var5[0] * arg4 + var5[1] * arg3 : 0.5128761F;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public final void method2322(int arg0) {
        field5410++;
        int var2 = this.field5425;
        boolean var3 = this.field5417;
        if (this.field5426 != null) {
            class290 var6 = this.field5426.method1739((byte) -120, class461.field6637);
            if (var6 == null) {
                this.field5417 = false;
                this.field5422 = null;
                this.field5407 = 0;
                this.field5401 = 256;
                this.field5415 = 256;
                this.field5405 = 0;
                this.field5402 = 0;
                this.field5403 = 0;
                this.field5414 = false;
                this.field5425 = -1;
            } else {
                this.field5425 = var6.field3750;
                this.field5422 = var6.field3683;
                this.field5403 = var6.field3717;
                this.field5407 = var6.field3756;
                this.field5405 = var6.field3709;
                this.field5417 = var6.field3729;
                this.field5414 = var6.field3725;
                this.field5415 = var6.field3697;
                this.field5402 = var6.field3704 << 9;
                this.field5401 = var6.field3731;
            }
        } else if (this.field5428 != null) {
            int var4 = class519.method2982(this.field5428, -1);
            if (var2 != var4) {
                this.field5425 = var4;
                class155 var5 = this.field5428.field1486;
                if (var5.field1929 != null) {
                    var5 = var5.method968((byte) -76, class461.field6637);
                }
                if (var5 == null) {
                    this.field5401 = 256;
                    this.field5403 = this.field5402 = 0;
                    this.field5417 = this.field5428.field1486.field1904;
                    this.field5415 = 256;
                } else {
                    this.field5403 = var5.field1956;
                    this.field5417 = var5.field1904;
                    this.field5402 = var5.field1965 << 9;
                    this.field5415 = var5.field1930;
                    this.field5401 = var5.field1916;
                }
            }
        } else if (this.field5408 != null) {
            this.field5425 = class62.method478(this.field5408, -1);
            this.field5403 = this.field5408.field7672;
            this.field5415 = 256;
            this.field5402 = this.field5408.field7676 << 9;
            this.field5401 = 256;
            this.field5417 = this.field5408.field7699;
        }
        if ((this.field5425 != var2 || var3 != this.field5417) && this.field5419 != null) {
            class668.field9148.method664(this.field5419);
            this.field5419 = null;
            this.field5421 = null;
            this.field5400 = null;
        }
        if (arg0 <= 92) {
            this.method2322(55);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lgaa;I)Lgaa;")
    public static final class460 method2323(class460 arg0, int arg1) {
        field5429++;
        if (arg1 <= 29) {
            field5423 = null;
        }
        if (arg0.field6528 != -1) {
            return class102.method684(5025, arg0.field6528);
        }
        int var2 = arg0.field6524 >>> 16;
        class700 var3 = new class700(class148.field1802);
        for (class157 var4 = (class157) var3.method3877(2431); var4 != null; var4 = (class157) var3.method3876(-1)) {
            if (var4.field2028 == var2) {
                return class102.method684(5025, (int) var4.field8746);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public static void method2324(int arg0) {
        field5423 = null;
        if (arg0 < 75) {
            field5423 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V")
    public static final void method2325(byte arg0, boolean arg1) {
        field5404++;
        if (arg0 != -75) {
            field5412 = -109;
        }
        if (class534.field7501.length() == 0) {
            return;
        }
        class192.method1210(63, "--> " + class534.field7501);
        class417.method2482(arg1, class534.field7501, false, (byte) 77);
        class534.field7501 = "";
        class607.field8420 = 0;
        class542.field7641 = 0;
    }
}
