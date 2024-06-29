import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class79 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lui;")
    public static class98 field1170 = new class98(4);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[Ldb;")
    public static class146[] field1177 = new class146[14];

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1175 = -1;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 6)
    public static final void method535(int arg0) {
        class141.field2271.method651(0);
        int var1 = 80 % ((arg0 - 43) / 35);
        field1172++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)[Loh;", line = 16)
    public static final class187[] method536(boolean arg0) {
        field1178++;
        if (!arg0) {
            field1177 = (class146[]) null;
        }
        class187[] var1 = new class187[class2.field9];
        for (int var2 = 0; var2 < class2.field9; var2++) {
            if (class245.field3886) {
                var1[var2] = new class87(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], class105.field1522[var2], class201.field3085);
            } else {
                var1[var2] = new class239(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], class105.field1522[var2], class201.field3085);
            }
        }
        class167.method1164(!arg0);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 44)
    public static final void method537(byte arg0) {
        field1176++;
        if (class270.field4456 == -1 || class250.field3998 == -1) {
            return;
        }
        int var1 = ((class170.field2661 - class257.field4060) * class21.field254 >> 16) + class257.field4060;
        float[] var2 = new float[3];
        class21.field254 += var1;
        if (class21.field254 >= 65535) {
            class21.field254 = 65535;
            if (class15.field197) {
                class328.field5363 = false;
            } else {
                class328.field5363 = true;
            }
            class15.field197 = true;
        } else {
            class15.field197 = false;
            class328.field5363 = false;
        }
        float var3 = (float) class21.field254 / 65535.0F;
        int var4 = class284.field4658 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class118.field1726[class270.field4456][var4 + 1][var5] * 3;
            int var7 = class118.field1726[class270.field4456][var4][var5];
            int var8 = class118.field1726[class270.field4456][var4][var5] * 3;
            int var9 = var6 - var8;
            int var10 = (class118.field1726[class270.field4456][var4 + 2][var5] + class118.field1726[class270.field4456][var4 + 2][var5] - class118.field1726[class270.field4456][var4 + 3][var5]) * 3;
            int var11 = var6 + class118.field1726[class270.field4456][var4 + 2][var5] - var7 - var10;
            int var12 = var8 + var10 - (var6 * 2);
            var2[var5] = (((float) var11 * var3 + (float) var12) * var3 + (float) var9) * var3 + (float) var7;
        }
        if (arg0 <= 26) {
            method537((byte) 39);
        }
        float[] var13 = new float[3];
        class259.field4098 = (int) var2[2] - (class150.field2420 * 128);
        class41.field625 = (int) var2[0] - (class215.field3313 * 128);
        class74.field1117 = (int) var2[1] * -1;
        int var14 = class89.field1282 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class118.field1726[class250.field3998][var14][var15] * 3;
            int var17 = class118.field1726[class250.field3998][var14 + 1][var15] * 3;
            int var18 = class118.field1726[class250.field3998][var14][var15];
            int var19 = (class118.field1726[class250.field3998][var14 + 2][var15] + class118.field1726[class250.field3998][var14 + 2][var15] - class118.field1726[class250.field3998][var14 + 3][var15]) * 3;
            int var20 = var17 - var16;
            int var21 = var19 + var16 - (var17 * 2);
            int var22 = class118.field1726[class250.field3998][var14 + 2][var15] + var17 - var18 - var19;
            var13[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var20) * var3 + (float) var18;
        }
        float var23 = var13[2] - var2[2];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[0] - var2[0];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class117.field1700 = (float) Math.atan2((double) var24, var26);
        class329.field5380 = -((float) Math.atan2((double) var25, (double) var23));
        class147.field2369 = (int) ((double) class329.field5380 * 325.949D) & 0x7FF;
        class54.field817 = (int) ((double) class117.field1700 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 157)
    public static void method538(int arg0) {
        if (arg0 != -1) {
            method538(-62);
        }
        field1177 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z", line = 169)
    public static final boolean method539(int arg0, int arg1) {
        field1171++;
        if (class111.field1652 == arg0) {
            return false;
        }
        class273.field4482 = new int[104][104];
        class276.field4549 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class124.field1860[var2] = new class154(104, 104);
        }
        class148.field2392 = new byte[4][104][104];
        class138.field2175 = new byte[4][104][104];
        int var3 = -67 % ((30 - arg1) / 41);
        class171.field2668 = new class150[4][104][104];
        if (class245.field3886) {
            class254.method1811(4, 104, 104);
            class149.method1070(104, 104);
            class236.field3742 = new class52[13][13];
        }
        class111.field1652 = arg0;
        return true;
    }
}
