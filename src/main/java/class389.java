import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class389 extends class530 {

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!fea", name = "O", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!fea", name = "Q", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLjj;)V")
    public static final void method2326(byte arg0, class398 arg1) {
        if (arg0 != 118) {
            method2326((byte) -117, (class398) null);
        }
        ++field5607;
        class253.field3491.method749(arg0 ^ -2079959247, arg1.method2356(-48));
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lrq;IIIILrq;IIII)V")
    public static final void method2327(class39 arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5606;
        int var10 = arg0.method234(false);
        if (~var10 != 0) {
            Object var11 = null;
            class424 var12 = (class424) class154.field1910.method3134((long) var10, -113);
            if (var12 == null) {
                class366[] var13 = class366.method2248(class39.field510, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class9.field103.method1951(var13[0], true);
                class154.field1910.method3130((long) var10, true, var12);
            }
            class93.method519(arg5.method241(-25747) * 256, arg4, 0, arg1, arg5.field3925, arg5.field3929, arg2 >> 1, arg3 >> 1, arg5.field3917, (byte) 73);
            int var14 = class558.field7608[0] + -18 + arg8;
            int var15 = arg6 / 4 * 18 + var14;
            int var16 = arg9 - -class558.field7608[1] + -70;
            int var17 = arg6 % 4 * 18 + var16;
            var12.method2450(var15, var17);
            if (arg0 == arg5) {
                class9.field103.method3819(18, arg7 + -24446, var17 + -1, -256, var15 + -1, 18);
            }
            class184 var18 = class101.method549(true);
            var18.field2267 = var15;
            if (arg7 != 24442) {
                field5604 = false;
            }
            var18.field2268 = arg0;
            var18.field2264 = var17;
            var18.field2265 = var15 + 16;
            var18.field2263 = var17 - -16;
            class69.field909.method2216(4, var18);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        int var3 = 80 / ((-32 - arg1) / 47);
        ++field5605;
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314 && this.method3012(-117)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % super.field7336 * super.field7336;
            for (int var9 = 0; var9 < class39.field497; ++var9) {
                int var10 = super.field7332[var9 % super.field7329 + var8];
                var7[var9] = class230.method1424(var10 << 4, 4080);
                var6[var9] = class230.method1424(65280, var10) >> 4;
                var5[var9] = class230.method1424(var10 >> 12, 4080);
            }
        }
        return var4;
    }
}
