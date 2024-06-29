import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class477 extends class440 {

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
    private int field6793 = -1;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    private int field6787;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    private int field6791;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Lns;")
    public static class368 field6781;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "[I")
    private int[] field6782;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "[[[J")
    public static long[][][] field6789;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I")
    public final int method2609(int arg0) {
        if (arg0 >= -95) {
            this.method763(2, 49);
        }
        ++field6786;
        return this.field6793;
    }

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "(I)V")
    public static void method2796(int arg0) {
        field6789 = null;
        field6781 = null;
        if (arg0 != 0) {
            field6781 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)V")
    public final void method2605(int arg0, int arg1, boolean arg2) {
        super.method2605(arg0, arg1, arg2);
        ++field6783;
        if (~this.field6793 <= -1 && class386.field5437 != null) {
            int var4 = !class386.field5437.method1386(this.field6793, -6514).field2304 ? 128 : 64;
            this.field6782 = class386.field5437.method1381(var4, this.field6793, 1.0F, var4, -90, false);
            this.field6787 = var4;
            this.field6791 = var4;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
    public final void method2301(int arg0) {
        super.method2301(arg0);
        if (arg0 == -1) {
            ++field6790;
            this.field6782 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field6784;
        if (~arg2 == -1) {
            this.field6793 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            this.method2609(-12);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2797(long arg0, int arg1) {
        ++field6780;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                if (arg1 != 12095) {
                    method2797(90L, -106);
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class23.field314[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class477() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field6785;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int var4 = this.field6787 * (class221.field3098 == this.field6791 ? arg1 : this.field6791 * arg1 / class221.field3098);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class549.field7715 != this.field6787) {
                for (int var8 = 0; var8 < class549.field7715; ++var8) {
                    int var9 = this.field6787 * var8 / class549.field7715;
                    int var10 = this.field6782[var4 + var9];
                    var7[var8] = class689.method3797(4080, var10 << 4);
                    var6[var8] = class689.method3797(65280, var10) >> 4;
                    var5[var8] = class689.method3797(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class549.field7715 > var11; ++var11) {
                    int var12 = this.field6782[var4++];
                    var7[var11] = class689.method3797(4080, var12 << 4);
                    var6[var11] = class689.method3797(var12, 65280) >> 4;
                    var5[var11] = class689.method3797(var12, 16711680) >> 12;
                }
            }
        }
        if (arg0 != -5766) {
            this.method2609(109);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)J")
    public static final long method2798(byte arg0) {
        ++field6792;
        if (arg0 != -66) {
            method2797(102L, 33);
        }
        return class458.field6557.method451(-75);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)I")
    public static final int method2799(int arg0, int arg1, int arg2) {
        ++field6788;
        int var3 = (arg1 & 127) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != -20439) {
            field6781 = null;
        }
        return (65408 & arg1) + var3;
    }
}
