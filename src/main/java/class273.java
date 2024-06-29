import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class273 extends class137 {

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field4416 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4407 = "wave:";

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field4405 = -1;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[I")
    public static int[] field4404 = new int[14];

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Z")
    public static boolean field4420 = false;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Luk;")
    public class104 field4417;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lhd;")
    public class12 field4414;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lgi;")
    public static class164 field4412;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lsg;")
    public class172 field4409;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Lll;")
    public class222 field4413;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lll;")
    public class222 field4419;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Z")
    public boolean field4392;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "[I")
    public int[] field4399;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[Lrk;")
    public static class292[] field4401;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4407 = null;
        field4401 = null;
        if (arg0 > 51) {
            field4412 = null;
            field4404 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1806(byte arg0, int arg1) {
        if (arg0 != 108) {
            method1805((byte) -4);
        }
        field4408++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF57) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method1807(int arg0, int arg1) {
        field4402++;
        if (arg0 == -1 || arg1 != -1754690448 || !class118.method816(arg0, 0)) {
            return;
        }
        class248[] var2 = class208.field3315[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class248 var4 = var2[var3];
            if (var4.field3989 != null) {
                class78 var5 = new class78();
                var5.field1265 = var4.field3989;
                var5.field1251 = var4;
                class79.method572((byte) -51, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public final void method1808(int arg0) {
        field4415++;
        if (arg0 != -30174) {
            field4401 = null;
        }
        int var2 = this.field4418;
        if (this.field4409 != null) {
            class172 var5 = this.field4409.method1214(-94);
            if (var5 == null) {
                this.field4411 = 0;
                this.field4418 = -1;
                this.field4403 = 0;
                this.field4395 = 0;
                this.field4399 = null;
                this.field4406 = 0;
            } else {
                this.field4403 = var5.field2882;
                this.field4411 = var5.field2854;
                this.field4418 = var5.field2859;
                this.field4399 = var5.field2829;
                this.field4406 = var5.field2864 * 128;
                this.field4395 = var5.field2845;
            }
        } else if (this.field4417 != null) {
            int var3 = class92.method644((byte) 120, this.field4417);
            if (var2 != var3) {
                this.field4418 = var3;
                class242 var4 = this.field4417.field1645;
                if (var4.field3779 != null) {
                    var4 = var4.method1649(false);
                }
                if (var4 == null) {
                    this.field4395 = this.field4406 = 0;
                } else {
                    this.field4395 = var4.field3778;
                    this.field4406 = var4.field3787 * 128;
                }
            }
        } else if (this.field4414 != null) {
            this.field4418 = class83.method595((byte) -29, this.field4414);
            this.field4406 = this.field4414.field215 * 128;
            this.field4395 = this.field4414.field228;
        }
        if (this.field4418 != var2 && this.field4413 != null) {
            class89.field1397.method1357(this.field4413);
            this.field4413 = null;
        }
    }
}
