import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class144 extends class53 {

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Z")
    private boolean field2487 = true;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Z")
    private boolean field2481 = true;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Lwa;")
    public static class75 field2482 = class66.method560("Fertigkeit)2", false);

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
    public static boolean field2480 = false;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lwa;")
    public static class75 field2489 = class66.method560("; Max)2Age=", false);

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "S")
    public static short field2485 = 256;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "[I")
    public static int[] field2493;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 20)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILja;Z)V", line = 36)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2481 = arg1.method501(0) == 1;
        } else if (arg0 == 1) {
            this.field2487 = arg1.method501(0) == 1;
        } else if (arg0 == 2) {
            this.field880 = arg1.method501(0) == 1;
        }
        field2490++;
        if (!arg2) {
            method1108(-24, -114);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[[I", line = 72)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -102 / ((76 - arg1) / 42);
        field2483++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(107, 0, this.field2487 ? class3.field31 - arg0 : arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var4[0];
            if (this.field2481) {
                for (int var12 = 0; var12 < class269.field4644; var12++) {
                    var11[var12] = var7[class157.field2697 - var12];
                    var10[var12] = var6[class157.field2697 - var12];
                    var9[var12] = var8[class157.field2697 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class269.field4644; var13++) {
                    var11[var13] = var7[var13];
                    var10[var13] = var6[var13];
                    var9[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[I", line = 162)
    public final int[] method59(int arg0, int arg1) {
        field2491++;
        int[] var3 = this.field878.method1603(arg1, (byte) 122);
        if (arg0 != -15196) {
            return (int[]) null;
        }
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, this.field2487 ? class3.field31 - arg1 : arg1);
            if (this.field2481) {
                for (int var5 = 0; var5 < class269.field4644; var5++) {
                    var3[var5] = var4[class157.field2697 - var5];
                }
            } else {
                class231.method1689(var4, 0, var3, 0, class269.field4644);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I", line = 205)
    public static final int method1108(int arg0, int arg1) {
        field2492++;
        return arg0 == 0 ? arg1 >>> 8 : 28;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V", line = 216)
    public static void method1109(int arg0) {
        field2482 = null;
        field2493 = null;
        field2489 = null;
        if (arg0 != 0) {
            method1109(-55);
        }
    }
}
