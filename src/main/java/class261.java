import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class261 extends class282 {

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[B")
    public byte[] field4526;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "[I")
    public static int[] field4535 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Ljf;")
    public static class229 field4527 = class212.method1457((byte) 59, "Sprites charg-Bs");

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "Ljf;")
    public static class229 field4528 = class212.method1457((byte) 110, " <col=ffffff>");

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "[I")
    public static int[] field4537 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "Ljf;")
    public static class229 field4534 = class212.method1457((byte) 60, "::wm3");

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "Lri;")
    public static class68 field4532 = new class68(0, 0);

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V", line = 14)
    public static final void method1856(int arg0) {
        field4533++;
        class84.field1608.method1397(157, 0);
        class84.field1608.method118(0L, (byte) -123);
        if (arg0 != 32643) {
            field4536 = 110;
        }
        client.field4458++;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V", line = 27)
    public class261(byte[] arg0) {
        this.field4526 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)V", line = 67)
    public static final void method1857(byte arg0) {
        field4529++;
        if (class329.field5601 == -1 || class30.field521 == -1) {
            return;
        }
        int var1 = ((class5.field47 - class156.field2662) * class89.field1642 >> 16) + class156.field2662;
        class89.field1642 += var1;
        if (class89.field1642 < 65535) {
            class329.field5610 = false;
            class83.field1591 = false;
        } else {
            if (class329.field5610) {
                class83.field1591 = false;
            } else {
                class83.field1591 = true;
            }
            class89.field1642 = 65535;
            class329.field5610 = true;
        }
        float var2 = (float) class89.field1642 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class30.field519 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class41.field732[class329.field5601][var4][var5] * 3;
            int var7 = class41.field732[class329.field5601][var4 + 1][var5] * 3;
            int var8 = (class41.field732[class329.field5601][var4 + 2][var5] + class41.field732[class329.field5601][var4 + 2][var5] - class41.field732[class329.field5601][var4 + 3][var5]) * 3;
            int var9 = class41.field732[class329.field5601][var4][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - var7 * 2;
            int var12 = class41.field732[class329.field5601][var4 + 2][var5] + var7 - (var9 - -var8);
            var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
        }
        class243.field4301 = (int) var3[2] - (class213.field3649 * 128);
        if (arg0 != -10) {
            field4532 = (class68) null;
        }
        float[] var13 = new float[3];
        class97.field1721 = (int) var3[0] - (class258.field4503 * 128);
        class107.field1881 = (int) var3[1] * -1;
        int var14 = class124.field2185 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class41.field732[class30.field521][var14][var15] * 3;
            int var17 = class41.field732[class30.field521][var14 + 1][var15] * 3;
            int var18 = class41.field732[class30.field521][var14][var15];
            int var19 = var17 - var16;
            int var20 = (class41.field732[class30.field521][var14 + 2][var15] + class41.field732[class30.field521][var14 + 2][var15] - class41.field732[class30.field521][var14 + 3][var15]) * 3;
            int var21 = var17 + class41.field732[class30.field521][var14 + 2][var15] - var20 - var18;
            int var22 = var16 + var20 - (var17 * 2);
            var13[var15] = (((float) var21 * var2 + (float) var22) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class127.field2276 = (float) Math.atan2((double) var24, var26);
        class249.field4391 = -((float) Math.atan2((double) var23, (double) var25));
        class203.field3550 = (int) ((double) class127.field2276 * 325.949D) & 0x7FF;
        class174.field3043 = (int) ((double) class249.field4391 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V", line = 188)
    public static void method1858(boolean arg0) {
        field4528 = null;
        field4535 = null;
        field4534 = null;
        field4527 = null;
        field4532 = null;
        if (arg0) {
            field4537 = null;
        }
    }
}
