import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class319 extends class440 {

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lkj;")
    public static class525 field4696 = new class525();

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "J")
    public static long field4697 = 0L;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field4698 = -1;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "[I")
    public static int[] field4699 = new int[13];

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lnea;")
    public static class664 field4700 = new class664(9, 6);

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class319() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)V")
    private final void method2000(int arg0, byte arg1, int arg2) {
        ++field4694;
        int var4 = class499.field7073[arg0];
        if (arg1 >= -16) {
            this.method234(-83, (class695) null, -89);
        }
        int var5 = class418.field6099[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class299.field4462 = arg0;
            class528.field7432 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class528.field7432 = arg0;
            class299.field4462 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class299.field4462 = class549.field7715 - arg2;
            class528.field7432 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class299.field4462 = arg0;
            class528.field7432 = -arg2 + class221.field3098;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class528.field7432 = -arg2 + class221.field3098;
            class299.field4462 = class549.field7715 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class299.field4462 = -arg2 + class549.field7715;
            class528.field7432 = -arg0 + class221.field3098;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class528.field7432 = -arg0 + class221.field3098;
            class299.field4462 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class528.field7432 = arg2;
            class299.field4462 = -arg0 + class549.field7715;
        }
        class528.field7432 &= class651.field9116;
        class299.field4462 &= class420.field6112;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field4693;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -24 % ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            for (int var5 = 0; ~var5 > ~class549.field7715; ++var5) {
                this.method2000(var5, (byte) -57, arg1);
                int[] var6 = this.method2611(110, class528.field7432, 0);
                var3[var5] = var6[class299.field4462];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field6424 = arg1.method3826(false) == 1;
        }
        ++field4692;
        if (arg0 != 5) {
            field4700 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field4695;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class549.field7715; ++var7) {
                this.method2000(var7, (byte) -125, arg1);
                int[][] var8 = this.method2606(class528.field7432, 0, -1);
                var4[var7] = var8[0][class299.field4462];
                var5[var7] = var8[1][class299.field4462];
                var6[var7] = var8[2][class299.field4462];
            }
        }
        if (arg0 != -5766) {
            this.method229((byte) -4, -88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public static void method2001(int arg0) {
        if (arg0 != 0) {
            field4700 = null;
        }
        field4696 = null;
        field4700 = null;
        field4699 = null;
    }
}
