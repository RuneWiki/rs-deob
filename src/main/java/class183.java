import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class183 extends class71 {

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field3362 = 585;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "F")
    public static float field3356;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "Lok;")
    public static class149 field3355;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V", line = 9)
    public static void method1415(int arg0) {
        field3355 = null;
        int var1 = 93 / ((arg0 + 52) / 32);
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V", line = 23)
    public static final void method1416(int arg0) {
        if (class80.field1537 != null) {
            class80.field1537.method748(-101);
        }
        field3359++;
        if (class120.field2163 != null) {
            class120.field2163.method748(-103);
        }
        class159.method1253(class80.field1525, 22050, 2, 8000);
        class80.field1537 = class94.method793(class110.field2022, class132.field2419, 22050, 0, (byte) -118);
        class80.field1537.method745(class141.field2558, 2000);
        int var1 = 2 % ((-arg0 - 51) / 51);
        class120.field2163 = class94.method793(class110.field2022, class132.field2419, 2048, 1, (byte) -88);
        class120.field2163.method745(class322.field5630, 2000);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 52)
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZLvh;)V", line = 67)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field3362 = arg2.method468(28214);
        }
        field3354++;
        if (!arg1) {
            this.field3362 = -36;
        }
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V", line = 89)
    public static final void method1417(int arg0) {
        field3357++;
        class54.field1183.method1338((byte) -120);
        class210.field3697.method1338((byte) -126);
        if (arg0 != -29744) {
            field3356 = 1.4702095F;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)V", line = 101)
    public static final void method1418(byte arg0) {
        if (arg0 != -86) {
            method1417(-118);
        }
        class282.field5034.method1338((byte) -108);
        field3358++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(IB)[I", line = 118)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 > -69) {
            return (int[]) null;
        }
        field3360++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0];
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                int var6 = class133.field2424[var5];
                if (var6 > this.field3362 && (4096 - this.field3362) > var6 && var4 > (2048 - this.field3362) && (this.field3362 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3362);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field3362 && var6 < (this.field3362 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3362;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3362);
                } else if (var4 < this.field3362 || var4 > (4096 - this.field3362)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3362;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3362);
                } else if (this.field3362 <= var6 && var6 <= (4096 - this.field3362)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3362);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
