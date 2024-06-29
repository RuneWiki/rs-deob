import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class90 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "J")
    public long field1622 = 0L;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lhn;")
    public static class317 field1625 = new class317(64);

    @OriginalMember(owner = "client!em", name = "l", descriptor = "[I")
    public static int[] field1627 = new int[256];

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lrm;")
    public class175 field1617;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lrm;")
    public class175 field1626;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1630;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
    public static int[] field1631;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 7)
    public static final void method639() {
        class312.field5328 = 0;
        label194: for (int var0 = 0; var0 < class181.field3097; var0++) {
            class60 var1 = class171.field2952[var0];
            if (class150.field2548 != null) {
                for (int var2 = 0; var2 < class150.field2548.length; var2++) {
                    if (class150.field2548[var2] != -1000000 && (var1.field937 <= class150.field2548[var2] || var1.field922 <= class150.field2548[var2]) && (var1.field932 <= class133.field2296[var2] || var1.field924 <= class133.field2296[var2]) && (var1.field932 >= class112.field2013[var2] || var1.field924 >= class112.field2013[var2]) && (var1.field942 <= class33.field498[var2] || var1.field939 <= class33.field498[var2]) && (var1.field942 >= class40.field705[var2] || var1.field939 >= class40.field705[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field938 == 1) {
                int var3 = var1.field946 + class71.field1095 - class137.field2363;
                if (var3 >= 0 && var3 <= class71.field1095 + class71.field1095) {
                    int var4 = var1.field941 + class71.field1095 - class325.field5585;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field923 + class71.field1095 - class325.field5585;
                    if (var5 > class71.field1095 + class71.field1095) {
                        var5 = class71.field1095 + class71.field1095;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class42.field743[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class129.field2252 - var1.field932;
                        if (var7 > 32) {
                            var1.field935 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field935 = 2;
                            var7 = -var7;
                        }
                        var1.field930 = (var1.field942 - class37.field621 << 8) / var7;
                        var1.field936 = (var1.field939 - class37.field621 << 8) / var7;
                        var1.field934 = (var1.field937 - class191.field3210 << 8) / var7;
                        var1.field944 = (var1.field922 - class191.field3210 << 8) / var7;
                        class286.field4811[class312.field5328++] = var1;
                    }
                }
            } else if (var1.field938 == 2) {
                int var8 = var1.field941 + class71.field1095 - class325.field5585;
                if (var8 >= 0 && var8 <= class71.field1095 + class71.field1095) {
                    int var9 = var1.field946 + class71.field1095 - class137.field2363;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field948 + class71.field1095 - class137.field2363;
                    if (var10 > class71.field1095 + class71.field1095) {
                        var10 = class71.field1095 + class71.field1095;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class42.field743[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class37.field621 - var1.field942;
                        if (var12 > 32) {
                            var1.field935 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field935 = 4;
                            var12 = -var12;
                        }
                        var1.field928 = (var1.field932 - class129.field2252 << 8) / var12;
                        var1.field926 = (var1.field924 - class129.field2252 << 8) / var12;
                        var1.field934 = (var1.field937 - class191.field3210 << 8) / var12;
                        var1.field944 = (var1.field922 - class191.field3210 << 8) / var12;
                        class286.field4811[class312.field5328++] = var1;
                    }
                }
            } else if (var1.field938 == 4) {
                int var13 = var1.field937 - class191.field3210;
                if (var13 > 128) {
                    int var14 = var1.field941 + class71.field1095 - class325.field5585;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field923 + class71.field1095 - class325.field5585;
                    if (var15 > class71.field1095 + class71.field1095) {
                        var15 = class71.field1095 + class71.field1095;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field946 + class71.field1095 - class137.field2363;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field948 + class71.field1095 - class137.field2363;
                        if (var17 > class71.field1095 + class71.field1095) {
                            var17 = class71.field1095 + class71.field1095;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class42.field743[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field935 = 5;
                            var1.field928 = (var1.field932 - class129.field2252 << 8) / var13;
                            var1.field926 = (var1.field924 - class129.field2252 << 8) / var13;
                            var1.field930 = (var1.field942 - class37.field621 << 8) / var13;
                            var1.field936 = (var1.field939 - class37.field621 << 8) / var13;
                            class286.field4811[class312.field5328++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 232)
    public static final void method640(boolean arg0) {
        if (arg0) {
            class15.field120 = class238.field4139;
            class245.field4255 = class150.field2560;
            class171.field2949 = class260.field4439;
        } else {
            class15.field120 = class142.field2431;
            class245.field4255 = class180.field3073;
            class171.field2949 = class112.field2029;
        }
        class62.field974 = class15.field120.length;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 253)
    public static final void method641(byte arg0) {
        field1616++;
        if (arg0 < 83) {
            return;
        }
        if (class120.field2120.toLowerCase().indexOf("microsoft") != -1) {
            class267.field4541[221] = 43;
            class267.field4541[188] = 71;
            class267.field4541[219] = 42;
            class267.field4541[220] = 74;
            class267.field4541[223] = 28;
            class267.field4541[191] = 73;
            class267.field4541[189] = 26;
            class267.field4541[190] = 72;
            class267.field4541[222] = 59;
            class267.field4541[192] = 58;
            class267.field4541[186] = 57;
            class267.field4541[187] = 27;
            return;
        }
        class267.field4541[46] = 72;
        class267.field4541[91] = 42;
        class267.field4541[44] = 71;
        class267.field4541[59] = 57;
        class267.field4541[47] = 73;
        class267.field4541[92] = 74;
        if (class120.field2126 == null) {
            class267.field4541[192] = 58;
            class267.field4541[222] = 59;
        } else {
            class267.field4541[222] = 58;
            class267.field4541[192] = 28;
            class267.field4541[520] = 59;
        }
        class267.field4541[45] = 26;
        class267.field4541[61] = 27;
        class267.field4541[93] = 43;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 307)
    public static final void method642(int arg0, int arg1, int arg2) {
        class130.field2268 = arg2 - class166.field2905;
        int var3 = class130.field2268 - ((int) ((float) class293.field4917.field1216 / class69.field1065));
        field1618++;
        if (arg1 >= -105) {
            return;
        }
        class78.field1330 = class157.field2719 - (arg0 - class17.field181) - 1;
        int var4 = class130.field2268 + ((int) ((float) class293.field4917.field1216 / class69.field1065));
        if (var3 < 0) {
            class130.field2268 = (int) ((float) class293.field4917.field1216 / class69.field1065);
        }
        if (class244.field4242 < var4) {
            class130.field2268 = class244.field4242 - ((int) ((float) class293.field4917.field1216 / class69.field1065));
        }
        int var5 = (int) ((float) class293.field4917.field1205 / class69.field1065) + class78.field1330;
        int var6 = class78.field1330 - ((int) ((float) class293.field4917.field1205 / class69.field1065));
        if (var6 < 0) {
            class78.field1330 = (int) ((float) class293.field4917.field1205 / class69.field1065);
        }
        if (class157.field2719 < var5) {
            class78.field1330 = class157.field2719 - (int) ((float) class293.field4917.field1205 / class69.field1065);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 343)
    public static void method643(int arg0) {
        field1630 = null;
        if (arg0 != 9937) {
            field1632 = 120;
        }
        field1631 = null;
        field1625 = null;
        field1627 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V", line = 365)
    public static final void method644(boolean arg0, int arg1) {
        class193.field3280 = 99;
        field1623++;
        class9.field80 = new int[104];
        class29.field401 = new int[104];
        class296.field5006 = new int[104];
        class311.field5314 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class17.field185 = new int[104];
        class325.field5582 = new int[var2][105][105];
        class256.field4405 = new byte[var2][104][104];
        if (arg1 <= 5) {
            method643(-95);
        }
        class204.field3581 = new byte[var2][104][104];
        class138.field2371 = new byte[var2][104][104];
        class255.field4389 = new byte[var2][105][105];
        class77.field1323 = new byte[var2][104][104];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1627[var0] = var1;
        }
        field1632 = 0;
    }
}
