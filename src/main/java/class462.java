import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class462 extends class537 {

    @OriginalMember(owner = "client!lda", name = "Z", descriptor = "I")
    public static int field6640 = 0;

    @OriginalMember(owner = "client!lda", name = "W", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!lda", name = "X", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!lda", name = "Y", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!lda", name = "V", descriptor = "Ln;")
    public static class678 field6636;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILek;)Lsm;", line = 3)
    public static final class96 method2683(int arg0, class465 arg1) {
        ++field6638;
        String var2 = arg1.method2717(true);
        class186 var3 = class405.method2437((byte) -118)[arg1.method2705(-42)];
        class409 var4 = class113.method919(false)[arg1.method2705(-114)];
        int var5 = arg1.method2744(-1);
        int var6 = arg1.method2744(-1);
        int var7 = arg1.method2705(-125);
        int var8 = arg1.method2705(-42);
        int var9 = arg1.method2705(arg0 ^ 23685);
        if (arg0 != -23728) {
            method2683(10, (class465) null);
        }
        int var10 = arg1.method2755((byte) -59);
        int var11 = arg1.method2755((byte) -100);
        int var12 = arg1.method2691((byte) -67);
        int var13 = arg1.method2691((byte) -67);
        int var14 = arg1.method2691((byte) -67);
        return new class96(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "(I)V", line = 44)
    public static void method2684(int arg0) {
        if (arg0 <= 17) {
            method2685(-116, 26, 81);
        }
        field6636 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)[[I", line = 54)
    public final int[][] method298(int arg0, int arg1) {
        ++field6639;
        int[][] var3 = super.field9164.method1002(arg0 ^ -12460, arg1);
        if (arg0 != -12424) {
            return null;
        } else {
            if (super.field9164.field2082 && this.method3149(arg0 ^ -12523)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field7883 * super.field7883;
                for (int var8 = 0; ~var8 > ~class89.field1330; ++var8) {
                    int var9 = super.field7885[var8 % super.field7880 + var7];
                    var6[var8] = class248.method1593(var9, 255) << 4;
                    var5[var8] = class248.method1593(65280, var9) >> 4;
                    var4[var8] = class248.method1593(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(III)Z", line = 104)
    public static final boolean method2685(int arg0, int arg1, int arg2) {
        if (arg1 != 16767) {
            field6636 = null;
        }
        ++field6637;
        return ~(2048 & arg0) != -1;
    }
}
