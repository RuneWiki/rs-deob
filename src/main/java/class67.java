import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class67 extends class118 {

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    private int field866 = 0;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    private int field863 = 20;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    private int field867 = 1365;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field868 = 0;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "[I")
    public static int[] field864 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Z")
    public static boolean field865 = false;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field862;
        int[] var3 = super.field1537.method2395(arg0 + 30962, arg1);
        if (super.field1537.field5756) {
            for (int var4 = 0; ~class440.field6474 < ~var4; ++var4) {
                int var5 = (class6.field73[var4] << 12) / this.field867 + this.field866;
                int var6 = (class160.field2210[arg1] << 12) / this.field867 + this.field868;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field863 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field863 + -1) ? (var13 << 12) / this.field863 : 0;
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static final void method454(int arg0) {
        if (arg0 != -1824122228) {
            method456(-26);
        }
        ++field869;
        class241 var1 = class306.field4617;
        synchronized (class306.field4617) {
            class306.field4617.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLiq;)V")
    public static final void method455(boolean arg0, class134 arg1) {
        ++field861;
        class357.field5266 = arg1;
        if (arg0) {
            field864 = null;
        }
        class45.field566 = class357.field5266.method812(15, (byte) -41);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            method454(59);
        }
        ++field871;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field868 = arg2.method2323(arg1 + -129);
                    }
                } else {
                    this.field866 = arg2.method2323(arg1 ^ -21);
                }
            } else {
                this.field863 = arg2.method2323(-108);
            }
        } else {
            this.field867 = arg2.method2323(arg1 + -56);
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static void method456(int arg0) {
        field864 = null;
        if (arg0 >= -45) {
            method455(true, (class134) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JBLdr;)V")
    public static final void method457(long arg0, byte arg1, class261 arg2) {
        class162.field2255 = class388.field5742;
        ++field870;
        class280.field4292 = 0;
        class388.field5742 = 0;
        long var4 = class445.method2750(-27580);
        if (arg1 > 119) {
            for (class336 var6 = (class336) class261.field3979.method2127(-1489721243); var6 != null; var6 = (class336) class261.field3979.method2126(-123)) {
                if (var6.method2061(arg2, arg0)) {
                    ++class280.field4292;
                }
            }
            if (class394.field5917 && arg0 % 100L == 0L) {
                System.out.println("Particle system count: " + class261.field3979.method2122(-54) + ", running: " + class280.field4292 + ". Particles: " + class388.field5742 + ". Time taken: " + (class445.method2750(-27580) + -var4) + "ms");
            }
        }
    }
}
