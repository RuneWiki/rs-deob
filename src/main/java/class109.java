import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class109 extends class571 {

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
    public static int[] field1605 = new int[1000];

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
    public static boolean field1607 = true;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field1612 = new int[14];

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Lgj;")
    public static class660 field1610;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method833(byte arg0) {
        if (arg0 != 47) {
            method834(120);
        }
        field1612 = null;
        field1605 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method834(int arg0) {
        field1606++;
        if (class733.field10150 == -1 || class276.field4014 == -1) {
            return;
        }
        int var1 = ((class41.field530 - class436.field5892) * class159.field2544 >> 16) + class436.field5892;
        class159.field2544 += var1;
        if (class159.field2544 < 65535) {
            class672.field9365 = false;
            class174.field2696 = false;
        } else {
            class159.field2544 = 65535;
            if (class672.field9365) {
                class174.field2696 = false;
            } else {
                class174.field2696 = true;
            }
            class672.field9365 = true;
        }
        float var2 = (float) class159.field2544 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class46.field580 * 2;
        if (arg0 <= 79) {
            return;
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class483.field6811[class733.field10150][var4][var5] * 3;
            int var22 = class483.field6811[class733.field10150][var4 + 1][var5] * 3;
            int var23 = (class483.field6811[class733.field10150][var4 + 2][var5] + class483.field6811[class733.field10150][var4 + 2][var5] - class483.field6811[class733.field10150][var4 + 3][var5]) * 3;
            int var24 = class483.field6811[class733.field10150][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class483.field6811[class733.field10150][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class546.field7862 = (int) var3[1] * -1;
        class472.field6622 = (int) var3[2] - (class88.field999 * 512);
        class614.field8619 = (int) var3[0] - (class124.field1922 * 512);
        float[] var6 = new float[3];
        int var7 = class182.field2810 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class483.field6811[class276.field4014][var7][var8] * 3;
            int var15 = class483.field6811[class276.field4014][var7 + 1][var8] * 3;
            int var16 = (class483.field6811[class276.field4014][var7 + 2][var8] + class483.field6811[class276.field4014][var7 + 2][var8] - class483.field6811[class276.field4014][var7 + 3][var8]) * 3;
            int var17 = class483.field6811[class276.field4014][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class483.field6811[class276.field4014][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class589.field8310 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class544.field7813 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class565.field8018 = ((class483.field6811[class733.field10150][var4 + 2][3] - class483.field6811[class733.field10150][var4][3]) * class159.field2544 >> 16) + class483.field6811[class733.field10150][var4][3];
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
    public class109(int arg0) {
        this.field1609 = arg0;
    }
}
