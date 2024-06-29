import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class118 extends class199 {

    @OriginalMember(owner = "client!no", name = "X", descriptor = "I")
    private int field1540 = 4096;

    @OriginalMember(owner = "client!no", name = "T", descriptor = "Z")
    private boolean field1536 = true;

    @OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!no", name = "Z", descriptor = "I")
    public static int field1542 = -1;

    @OriginalMember(owner = "client!no", name = "ab", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!no", name = "U", descriptor = "Lfd;")
    public static class299 field1537 = new class299(new byte[5000]);

    @OriginalMember(owner = "client!no", name = "S", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!no", name = "V", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!no", name = "W", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!no", name = "bb", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLfd;I)V", line = 14)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field1538++;
        if (arg0 != -43) {
            this.method215(-125, -106);
        }
        if (arg2 == 0) {
            this.field1540 = arg1.method2083((byte) -110);
        } else if (arg2 == 1) {
            this.field1536 = arg1.method2096((byte) -122) == 1;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 151)
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I", line = 55)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            method865(false);
        }
        field1535++;
        int[][] var3 = this.field2796.method2187(arg0, -117);
        if (this.field2796.field4667) {
            int[] var4 = this.method1467(arg1 ^ 0x6AFF, class156.field2165 & arg0 - 1, 0);
            int[] var5 = this.method1467(-7764, arg0, 0);
            int[] var6 = this.method1467(arg1 + 22105, arg0 + 1 & class156.field2165, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class95.field1235; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1540;
                int var12 = (var5[var10 + 1 & class245.field3573] - var5[var10 - 1 & class245.field3573]) * this.field1540;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var15 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field1536) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 135)
    public static void method865(boolean arg0) {
        field1537 = null;
        if (!arg0) {
            field1542 = 79;
        }
    }
}
