import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class374 extends class194 {

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
    private int field5067 = 4096;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    private int field5068 = 4096;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    private int field5064 = 4096;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "[I")
    public static int[] field5062 = new int[1000];

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "Z")
    public static boolean field5061 = false;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "Z")
    public static boolean field5070 = false;

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
    public static int field5072 = 0;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "(I)V")
    public static void method2339(int arg0) {
        field5062 = null;
        if (arg0 != 37) {
            field5069 = -38;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2340(long arg0, int arg1) {
        if (arg1 != -6279) {
            return null;
        } else {
            ++field5066;
            if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
                if (arg0 % 37L == 0L) {
                    return null;
                } else {
                    int var3 = 0;
                    for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (arg0 != 0L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        var6.append(class134.field1530[(int) (-(arg0 * 37L) + var7)]);
                    }
                    return var6.reverse().toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field5063;
        int[][] var3 = super.field2283.method1667(arg1, -64);
        if (arg0 != -730) {
            method2340(-70L, -95);
        }
        if (super.field2283.field3451) {
            int[][] var4 = this.method1200(arg0 + 790, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class138.field1579; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field5064 * var12 >> 12;
                    var9[var11] = this.field5067 * var13 >> 12;
                    var10[var11] = this.field5068 * var14 >> 12;
                } else {
                    var8[var11] = this.field5064;
                    var9[var11] = this.field5067;
                    var10[var11] = this.field5068;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field5065;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field5068 = arg2.method1587((byte) -102);
                }
            } else {
                this.field5067 = arg2.method1587((byte) -102);
            }
        } else {
            this.field5064 = arg2.method1587((byte) -102);
        }
        int var5 = 0 % ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class374() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "(I)V")
    public static final void method2341(int arg0) {
        if (class427.field5840 != null) {
            class427.field5840.method745(2);
            class308.field4183 = null;
            class427.field5840 = null;
        }
        if (arg0 != 0) {
            field5070 = false;
        }
        ++field5071;
    }
}
