import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class181 extends class175 {

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Z")
    private boolean field2376 = true;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    private int field2382 = 4096;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Ljb;")
    public static class519 field2374 = new class519(95, 6);

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Z")
    public static boolean field2378 = false;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field2380 = 0;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Z")
    public static boolean field2375;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public static final boolean method1230(int arg0, int arg1) {
        if (arg1 != -18) {
            field2374 = null;
        }
        ++field2379;
        return ~arg0 <= -13 && ~arg0 >= -18;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static void method1231(byte arg0) {
        field2374 = null;
        if (arg0 > -87) {
            method1231((byte) -53);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field2377;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2376 = arg1.method1731((byte) 64) == 1;
            }
        } else {
            this.field2382 = arg1.method1728((byte) 101);
        }
        if (arg2) {
            field2375 = true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZB)V")
    public static final void method1232(boolean arg0, byte arg1) {
        ++class172.field2260;
        ++field2381;
        class43 var2 = class492.method2903(class408.field5781, 0, class73.field983);
        if (arg1 != 95) {
            field2375 = true;
        }
        class409.method2457((byte) -100, var2);
        for (class73 var3 = (class73) class355.field5178.method1249((byte) -111); var3 != null; var3 = (class73) class355.field5178.method1246(true)) {
            if (!var3.method1104(3)) {
                var3 = (class73) class355.field5178.method1249((byte) -102);
                if (var3 == null) {
                    break;
                }
            }
            if (~var3.field993 == -1) {
                class314.method2010(var3, true, arg1 ^ 31, arg0);
            }
        }
        if (class186.field2440 != null) {
            class151.method1062((byte) -117, class186.field2440);
            class186.field2440 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field2383;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            this.method238(103, (byte) -71);
        }
        if (super.field2316.field8746) {
            int[] var4 = this.method1202(class698.field9254 & arg0 + -1, -1150480797, 0);
            int[] var5 = this.method1202(arg0, -1150480797, 0);
            int[] var6 = this.method1202(class698.field9254 & arg0 - -1, -1150480797, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class598.field8136 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2382;
                int var12 = (var5[class412.field5896 & var10 + 1] + -var5[class412.field5896 & var10 - 1]) * this.field2382;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field2376) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }
}
