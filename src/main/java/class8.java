import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field98 = "Loading title screen - ";

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "S")
    public static short field103 = 205;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[B")
    public byte[] field92;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[B")
    public byte[] field93;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static final void method41(byte arg0) {
        field97++;
        class15.field196.method1699(0);
        int var1 = 1 % ((arg0 + 12) / 39);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static final void method42(byte arg0) {
        field91++;
        class66.method377(false, 0);
        class77.field972 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class121.field1713.length; var2++) {
            if (class156.field2520[var2] != -1 && class121.field1713[var2] == null) {
                class121.field1713[var2] = class137.field2191.method928(class156.field2520[var2], (byte) 109, 0);
                if (class121.field1713[var2] == null) {
                    var1 = false;
                    class77.field972++;
                }
            }
            if (class117.field1662[var2] != -1 && class281.field4451[var2] == null) {
                class281.field4451[var2] = class137.field2191.method937(-105, class117.field1662[var2], class39.field487[var2], 0);
                if (class281.field4451[var2] == null) {
                    class77.field972++;
                    var1 = false;
                }
            }
            if (class250.field4083 != null && class209.field3343[var2] == null && class250.field4083[var2] != -1) {
                class209.field3343[var2] = class137.field2191.method937(-89, class250.field4083[var2], class39.field487[var2], 0);
                if (class209.field3343[var2] == null) {
                    var1 = false;
                    class77.field972++;
                }
            }
        }
        if (class289.field4609 == null) {
            if (class228.field3686 == null || !class17.field204.method944(0, class228.field3686.field2323 + "_labels")) {
                class289.field4609 = new class40(0);
            } else if (class17.field204.method958(class228.field3686.field2323 + "_labels", (byte) -123)) {
                class289.field4609 = class288.method1940(class17.field204, 0, class228.field3686.field2323 + "_labels");
            } else {
                class77.field972++;
                var1 = false;
            }
        }
        if (!var1) {
            class135.field2135 = 1;
            return;
        }
        class204.field3224 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class121.field1713.length; var4++) {
            byte[] var21 = class281.field4451[var4];
            if (var21 != null) {
                int var22 = (class86.field1056[var4] >> 8) * 64 - class167.field2683;
                int var23 = (class86.field1056[var4] & 0xFF) * 64 - class181.field2883;
                if (class102.field1376) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class143.method992(var23, -30979, var22, var21);
            }
        }
        if (!var3) {
            class135.field2135 = 2;
            return;
        }
        if (class135.field2135 != 0) {
            class210.method1478(true, class62.field813 + "<br>(100%)", (byte) -87);
        }
        class51.method294((byte) -127);
        boolean var5 = false;
        class101.method616((byte) 59);
        class211.method1484(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class187.field2975[var6].method1009(63);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var19 = 0; var19 < 104; var19++) {
                for (int var20 = 0; var20 < 104; var20++) {
                    class117.field1664[var7][var19][var20] = 0;
                }
            }
        }
        class161.method1121(false, -1);
        class51.method294((byte) -127);
        System.gc();
        class66.method377(true, 0);
        class70.method395(true, false);
        if (!class102.field1376) {
            class123.method804(64, false);
            class66.method377(true, 0);
            class239.method1682(false, false);
            if (class209.field3343 != null) {
                class178.method1241(false);
            }
        }
        if (class102.field1376) {
            class198.method1383(99999999, false);
            class66.method377(true, 0);
            class170.method1160(false, 8);
        }
        class101.method616((byte) 59);
        class66.method377(true, 0);
        class196.method1380(false, class187.field2975, class102.field1376 ? class67.field843 : null, -21217);
        class66.method377(true, 0);
        int var8 = class294.field4656;
        if (var8 > class244.field4011) {
            var8 = class244.field4011;
        }
        if (class244.field4011 - 1 > var8) {
            int var9 = class244.field4011 - 1;
        }
        if (class226.method1599((byte) 87)) {
            class104.method631(0);
        } else {
            class104.method631(class294.field4656);
        }
        class113.method745(49);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var18 = 0; var18 < 104; var18++) {
                class40.method221(var18, -95, var10);
            }
        }
        class176.method1222(false);
        class51.method294((byte) -127);
        class184.method1291((byte) 88);
        class101.method616((byte) 59);
        if (class41.field517 != null && class28.field400 != null && class250.field4085 == 25) {
            class4.field57.method1932(false, 155);
            class24.field330++;
            class4.field57.method574(1057001181, -1);
        }
        if (!class102.field1376) {
            int var11 = (class83.field1030 - 6) / 8;
            int var12 = (class83.field1030 + 6) / 8;
            int var13 = (class118.field1674 + 6) / 8;
            int var14 = (class118.field1674 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var14 - 1; var16 <= var13 + 1; var16++) {
                    if (var15 < var11 || var15 > var12 || var14 > var16 || var13 < var16) {
                        class137.field2191.method924(100, "m" + var15 + "_" + var16);
                        class137.field2191.method924(100, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class250.field4085 == 28) {
            class2.method13(false, 10);
        } else {
            class2.method13(false, 30);
            if (class28.field400 != null) {
                class4.field57.method1932(false, 240);
            }
        }
        class179.method1248(-1);
        class51.method294((byte) -127);
        class228.method1622((byte) -125);
        int var17 = -41 / ((arg0 + 27) / 60);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method43(int arg0) {
        int var1 = 127 / ((arg0 + 32) / 33);
        field98 = null;
    }
}
