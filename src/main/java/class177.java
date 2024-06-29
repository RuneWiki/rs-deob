import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class177 extends class139 {

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field3574 = 3216;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "[I")
    private int[] field3583 = new int[3];

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    private int field3579 = 4096;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    private int field3584 = 3216;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lrf;")
    public static class163 field3577 = class53.method392(91, "scape main");

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Lrf;")
    private static class163 field3569 = class53.method392(-61, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "Lrf;")
    public static class163 field3575 = field3569;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static volatile int field3573 = 0;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lrf;")
    private static class163 field3586 = class53.method392(46, "This world is full)3");

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Lrf;")
    public static class163 field3566 = field3586;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lu;")
    public static class184 field3580;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "[Lrh;")
    public static class165[] field3568;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V")
    private final void method1200(byte arg0) {
        ++field3567;
        double var2 = Math.cos((double) (this.field3574 / 4096));
        if (arg0 != -102) {
            method1203(20, -51);
        }
        this.field3583[0] = (int) (var2 * Math.sin((double) (this.field3584 / 4096)) * 4096.0D);
        this.field3583[1] = (int) (4096.0D * Math.cos((double) (this.field3584 / 4096)) * var2);
        this.field3583[2] = (int) (4096.0D * Math.sin((double) (this.field3574 / 4096)));
        int var4 = this.field3583[0] * this.field3583[0] >> 12;
        int var5 = this.field3583[1] * this.field3583[1] >> 12;
        int var6 = this.field3583[2] * this.field3583[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field3583[0] = (this.field3583[0] << 12) / var7;
            this.field3583[1] = (this.field3583[1] << 12) / var7;
            this.field3583[2] = (this.field3583[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3574 = arg2.method390((byte) 118);
                }
            } else {
                this.field3584 = arg2.method390((byte) 112);
            }
        } else {
            this.field3579 = arg2.method390((byte) 110);
        }
        if (arg1 != 21) {
            method1203(-119, -110);
        }
        ++field3570;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3586 = null;
        if (arg0 != 0) {
            field3580 = null;
        }
        field3566 = null;
        field3568 = null;
        field3580 = null;
        field3569 = null;
        field3577 = null;
        field3575 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILu;Lrf;Lrf;)[Lrh;")
    public static final class165[] method1202(int arg0, class184 arg1, class163 arg2, class163 arg3) {
        ++field3565;
        int var4 = arg1.method1228(arg0 + 851066692, arg2);
        int var5 = arg1.method1231(arg3, var4, 2);
        return arg0 != -851066580 ? null : class56.method405(var4, false, var5, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.method1200((byte) -102);
        ++field3585;
        if (arg0 != 0) {
            this.method1200((byte) -52);
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)Lrf;")
    public static final class163 method1203(int arg0, int arg1) {
        ++field3582;
        if (arg1 != 22025) {
            return null;
        } else {
            return ~class197.field3918[arg0].method1029(arg1 + -21900) < -1 ? class180.method1216(new class163[] { client.field610[arg0], class4.field69, class197.field3918[arg0] }, false) : client.field610[arg0];
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            field3573 = 115;
        }
        ++field3572;
        int[] var3 = super.field2859.method1319(arg1 ^ -7523, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0 + -1 & class15.field260, 0, true);
            int[] var5 = this.method917(arg0, 0, true);
            int[] var6 = this.method917(arg0 + 1 & class15.field260, 0, true);
            for (int var7 = 0; ~var7 > ~class23.field402; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3579;
                int var9 = (var5[var7 + 1 & class29.field542] + -var5[var7 + -1 & class29.field542]) * this.field3579;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + var13 + 4096) / 4096)));
                int var15;
                int var16;
                int var17;
                if (var14 != 0) {
                    var15 = var9 / var14;
                    var16 = 16777216 / var14;
                    var17 = var8 / var14;
                } else {
                    var17 = 0;
                    var16 = 0;
                    var15 = 0;
                }
                int var18 = this.field3583[0] * var15 >> 12;
                int var19 = this.field3583[2] * var16 >> 12;
                int var20 = this.field3583[1] * var17 >> 12;
                var3[var7] = var18 + var20 + var19;
            }
        }
        return var3;
    }
}
