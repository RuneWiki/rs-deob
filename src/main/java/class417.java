import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class417 extends class80 {

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    private int field6280 = 0;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    private int field6283 = 4096;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    private int field6281 = 2000;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field6286 = 16;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    private int field6285 = 0;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lcd;")
    public static class208 field6287 = new class208("", 15);

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "[Lvg;")
    public static class39[] field6290;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 4)
    public class417() {
        super(0, true);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V", line = 7)
    public static final void method2554(int arg0, int arg1, int arg2) {
        ++field6284;
        class18 var3 = class140.method1047(15, arg2, false);
        var3.method122(true);
        var3.field291 = arg1;
        var3.field283 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Z)V", line = 21)
    public static void method2555(boolean arg0) {
        if (arg0) {
            field6287 = null;
            field6290 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V", line = 39)
    public final void method23(boolean arg0) {
        if (!arg0) {
            this.method23(false);
        }
        ++field6289;
        class488.method2956(-15926);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(III)V", line = 51)
    public static final void method2556(int arg0, int arg1, int arg2) {
        class459.method2765(class76.field1546, (byte) 87);
        ++class102.field1933;
        if (arg1 > -57) {
            field6287 = null;
        }
        ++field6282;
        class335.field5062.method1853(arg0, 63);
        class335.field5062.method1879(arg2, -329997008);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I", line = 67)
    public final int[] method25(int arg0, int arg1) {
        ++field6279;
        if (arg1 != -16828) {
            this.field6280 = -39;
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = this.field6283 >> 1;
            int[][] var5 = super.field1601.method47(-106);
            Random var6 = new Random((long) this.field6285);
            for (int var7 = 0; this.field6281 > var7; ++var7) {
                int var8 = this.field6283 <= 0 ? this.field6280 : -var4 + this.field6280 + class32.method222(var6, -13086, this.field6283);
                int var9 = (var8 & 4086) >> 4;
                int var10 = class32.method222(var6, arg1 ^ 29350, class137.field2308);
                int var11 = class32.method222(var6, -13086, class278.field4199);
                int var12 = (class482.field7106[var9] * this.field6286 >> 12) + var10;
                int var13 = (class352.field5192[var9] * this.field6286 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class32.method222(var6, -13086, 4096) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = var26 - -1024 - -((var28 - var10) * var25);
                        int var30 = class308.field4672 & var28;
                        int var31 = var21 & class359.field5269;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILnn;)V", line = 216)
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field6283 = arg2.method1841((byte) -120);
                        }
                    } else {
                        this.field6280 = arg2.method1841((byte) 106);
                    }
                } else {
                    this.field6286 = arg2.method1858(-3256);
                }
            } else {
                this.field6281 = arg2.method1841((byte) 94);
            }
        } else {
            this.field6285 = arg2.method1858(-3256);
        }
        ++field6278;
        int var5 = -18 % ((arg1 - 28) / 53);
    }
}
