import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class225 extends class456 {

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    private int field3261 = 4096;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
    private int field3267 = 4096;

    @OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
    private int field3269 = 4096;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field3263 = new String[100];

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "[I")
    public static int[] field3262 = new int[2];

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
    public static int field3268 = 0;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "D")
    public static double field3264 = -1.0D;

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "Lo;")
    public static class332 field3256 = new class332("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!pr", name = "X", descriptor = "[Z")
    public static boolean[] field3270 = new boolean[100];

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "[Z")
    public static boolean[] field3265;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
    public static final void method1459(boolean arg0, int arg1) {
        ++field3266;
        class378.method2320(class305.field4546, (byte) 119);
        ++class395.field5814;
        for (class468 var2 = (class468) class466.field6564.method2296((byte) 39); var2 != null; var2 = (class468) class466.field6564.method2297(true)) {
            if (!var2.method282(125)) {
                var2 = (class468) class466.field6564.method2296((byte) 39);
                if (var2 == null) {
                    break;
                }
            }
            if (~var2.field6587 == -1) {
                class479.method2811(1711162608, arg0, var2, true);
            }
        }
        if (class232.field3403 != null) {
            class205.method1396(81, class232.field3403);
            class232.field3403 = null;
        }
        int var3 = -99 % ((-58 - arg1) / 56);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method1460(boolean arg0, Object arg1, byte arg2) {
        ++field3258;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return !arg0 ? var3 : class171.method1181(-91, var3);
        } else if (arg1 instanceof class158) {
            class158 var4 = (class158) arg1;
            return var4.method1080(109);
        } else if (arg2 >= -20) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V")
    public static void method1461(int arg0) {
        field3262 = null;
        field3265 = null;
        field3256 = null;
        field3270 = null;
        int var1 = -113 / ((arg0 - 54) / 55);
        field3263 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            field3270 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3267 = arg2.method2631(2530);
                }
            } else {
                this.field3269 = arg2.method2631(2530);
            }
        } else {
            this.field3261 = arg2.method2631(2530);
        }
        ++field3259;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field3260;
        int[][] var3 = super.field6468.method1090(arg0 ^ -2, arg1);
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class156.field2169; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field3261 * var12 >> 12;
                    var9[var11] = this.field3269 * var13 >> 12;
                    var10[var11] = this.field3267 * var14 >> 12;
                } else {
                    var8[var11] = this.field3261;
                    var9[var11] = this.field3269;
                    var10[var11] = this.field3267;
                }
            }
        }
        if (arg0 != 0) {
            field3268 = 108;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)Lcj;")
    public static final class123 method1462(int arg0, int arg1) {
        if (arg1 > -12) {
            method1459(true, -36);
        }
        ++field3255;
        class250[] var2 = class96.field1390;
        synchronized (class96.field1390) {
            class123 var3;
            if (arg0 < class96.field1390.length && !class96.field1390[arg0].method1592((byte) 125)) {
                var3 = (class123) class96.field1390[arg0].method1595((byte) -10);
                var3.method1847(true);
                int var10002 = class456.field6470[arg0]--;
            } else {
                var3 = new class123();
                var3.field1695 = new class117[arg0];
                for (int var4 = 0; ~var4 > ~arg0; ++var4) {
                    var3.field1695[var4] = new class117();
                }
            }
            return var3;
        }
    }
}
