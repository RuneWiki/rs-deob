import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class35 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field431 = "Loading...";

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field434 = "Loading - please wait.";

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Llm;")
    public static class210 field433;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 9)
    public static final int method246(String arg0, int arg1) {
        int var2 = -43 % ((-arg1 - 4) / 54);
        field437++;
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class193.field2892; var3++) {
            if (arg0.equalsIgnoreCase(class156.field2347[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILgl;Ljava/lang/Object;)V", line = 33)
    public static final void method247(int arg0, class262 arg1, Object arg2) {
        field438++;
        if (arg1.field3973 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 1) {
            field432 = 41;
        }
        while (var3 < 50 && arg1.field3973.peekEvent() != null) {
            class93.method662(-553, 1L);
            var3++;
        }
        if (arg2 != null) {
            arg1.field3973.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 64)
    public static final void method248(byte arg0) {
        class150.method1082(false, -2049);
        class28.field377 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class73.field947.length; var2++) {
            if (class110.field1692[var2] != -1 && class73.field947[var2] == null) {
                class73.field947[var2] = class222.field3389.method1441(0, (byte) -44, class110.field1692[var2]);
                if (class73.field947[var2] == null) {
                    var1 = false;
                    class28.field377++;
                }
            }
            if (class158.field2371[var2] != -1 && class304.field4631[var2] == null) {
                class304.field4631[var2] = class222.field3389.method1459(false, class158.field2371[var2], 0, class51.field637[var2]);
                if (class304.field4631[var2] == null) {
                    class28.field377++;
                    var1 = false;
                }
            }
            if (class117.field1817) {
                if (class211.field3217[var2] != -1 && class21.field257[var2] == null) {
                    class21.field257[var2] = class222.field3389.method1441(0, (byte) -44, class211.field3217[var2]);
                    if (class21.field257[var2] == null) {
                        class28.field377++;
                        var1 = false;
                    }
                }
                if (class205.field3100[var2] != -1 && class21.field262[var2] == null) {
                    class21.field262[var2] = class222.field3389.method1441(0, (byte) -44, class205.field3100[var2]);
                    if (class21.field262[var2] == null) {
                        class28.field377++;
                        var1 = false;
                    }
                }
            }
            if (class28.field381 != null && class96.field1443[var2] == null && class28.field381[var2] != -1) {
                class96.field1443[var2] = class222.field3389.method1459(false, class28.field381[var2], 0, class51.field637[var2]);
                if (class96.field1443[var2] == null) {
                    class28.field377++;
                    var1 = false;
                }
            }
        }
        field435++;
        if (class179.field2649 == null) {
            if (class140.field2115 == null || !class49.field620.method1438(-64, class140.field2115.field814 + "_labels")) {
                class179.field2649 = new class129(0);
            } else if (class49.field620.method1451(class140.field2115.field814 + "_labels", -64)) {
                class179.field2649 = class44.method291(31336, class49.field620, class140.field2115.field814 + "_labels");
            } else {
                class28.field377++;
                var1 = false;
            }
        }
        if (!var1) {
            class21.field249 = 1;
            return;
        }
        boolean var3 = true;
        class271.field4154 = 0;
        for (int var4 = 0; var4 < class73.field947.length; var4++) {
            byte[] var5 = class304.field4631[var4];
            if (var5 != null) {
                int var6 = (client.field1947[var4] & 0xFF) * 64 - class189.field2807;
                int var7 = (client.field1947[var4] >> 8) * 64 - class217.field3309;
                if (class296.field4534) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class172.method1198(var6, (byte) 102, var7, var5);
            }
            if (class117.field1817) {
                byte[] var8 = class21.field262[var4];
                if (var8 != null) {
                    int var9 = (client.field1947[var4] >> 8) * 64 - class217.field3309;
                    int var10 = (client.field1947[var4] & 0xFF) * 64 - class189.field2807;
                    if (class296.field4534) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class172.method1198(var10, (byte) 106, var9, var8);
                }
            }
        }
        if (!var3) {
            class21.field249 = 2;
            return;
        }
        if (class21.field249 != 0) {
            class274.method1930(field434 + "<br>(100%)", true, 1);
        }
        class237.method1621(90);
        boolean var11 = false;
        class241.method1634(126);
        if (class117.field1817 && class45.field569) {
            for (int var12 = 0; var12 < class73.field947.length; var12++) {
                if (class21.field262[var12] != null || class21.field257[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class67.method449(4, 104, 104, class117.field1817 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class325.field4896[var13].method1303((byte) -75);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class179.field2645[var14][var15][var16] = 0;
                }
            }
        }
        class48.method328(128, false);
        if (class117.field1817) {
            class32.field424.method401();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class32.field427[var17][var18].field3150 = true;
                }
            }
        }
        if (class117.field1817) {
            class31.method215();
        }
        if (class117.field1817) {
            class287.method1996(75);
        }
        class237.method1621(124);
        System.gc();
        class150.method1082(true, -2049);
        class146.method1043(false, 116);
        if (!class296.field4534) {
            class149.method1079(false, -29213);
            class150.method1082(true, -2049);
            if (class117.field1817) {
                int var19 = class114.field1750.field1541[0] >> 3;
                int var20 = class114.field1750.field1516[0] >> 3;
                class113.method781(4096, var20, var19);
            }
            class253.method1720((byte) -125, false);
            if (class96.field1443 != null) {
                class271.method1911(false);
            }
        }
        if (class296.field4534) {
            class271.method1913((byte) 115, false);
            class150.method1082(true, -2049);
            if (class117.field1817) {
                int var21 = class114.field1750.field1541[0] >> 3;
                int var22 = class114.field1750.field1516[0] >> 3;
                class113.method781(4096, var22, var21);
            }
            class124.method894(-113, false);
        }
        class241.method1634(118);
        class150.method1082(true, -2049);
        int var23 = -54 / ((-arg0 - 24) / 55);
        class12.method69(class325.field4896, false, 18071);
        if (class117.field1817) {
            class31.method206();
        }
        class150.method1082(true, -2049);
        int var24 = class311.field4736;
        if (class180.field2697 < var24) {
            var24 = class180.field2697;
        }
        if (var24 < (class180.field2697 - 1)) {
            int var25 = class180.field2697 - 1;
        }
        if (class80.method540(-116)) {
            class266.method1873(0);
        } else {
            class266.method1873(class311.field4736);
        }
        class40.method272(true);
        if (class117.field1817 && var11) {
            class152.method1092(true);
            class146.method1043(true, 93);
            if (!class296.field4534) {
                class149.method1079(true, -29213);
                class150.method1082(true, -2049);
                class253.method1720((byte) 116, true);
            }
            if (class296.field4534) {
                class271.method1913((byte) 115, true);
                class150.method1082(true, -2049);
                class124.method894(75, true);
            }
            class241.method1634(97);
            class150.method1082(true, -2049);
            class12.method69(class325.field4896, true, 18071);
            class150.method1082(true, -2049);
            class40.method272(true);
            class152.method1092(false);
        }
        if (class117.field1817) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    class32.field427[var26][var27].method1426(class294.field4502[0], var26 * 8, var27 * 8);
                }
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class245.method1655(var28, var29, (byte) -19);
            }
        }
        class243.method1649(-4);
        class237.method1621(113);
        class187.method1282(0);
        class241.method1634(120);
        class325.field4897 = false;
        if (class106.field1661 != null && class168.field2517 != null && class293.field4490 == 25) {
            class234.field3507.method28(241, false);
            class234.field3507.method1815(74, 1057001181);
            class113.field1740++;
        }
        if (!class296.field4534) {
            int var30 = (class66.field859 - 6) / 8;
            int var31 = (class302.field4613 - 6) / 8;
            int var32 = (class66.field859 + 6) / 8;
            int var33 = (class302.field4613 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= (var32 + 1); var34++) {
                for (int var35 = var31 - 1; var35 <= var33 + 1; var35++) {
                    if (var30 > var34 || var34 > var32 || var35 < var31 || var35 > var33) {
                        class222.field3389.method1454("m" + var34 + "_" + var35, 118);
                        class222.field3389.method1454("l" + var34 + "_" + var35, 35);
                    }
                }
            }
        }
        if (class293.field4490 == 28) {
            class163.method1155(10, 10);
        } else {
            class163.method1155(30, 10);
            if (class168.field2517 != null) {
                class234.field3507.method28(53, false);
            }
        }
        class129.method962(-118);
        class237.method1621(103);
        class142.method1021(-38);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 569)
    public static final void method249(boolean arg0) {
        field439++;
        class246.field3666.method2176((byte) -39);
        if (arg0) {
            method247(62, (class262) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 584)
    public static void method250(byte arg0) {
        int var1 = -100 % ((arg0 + 42) / 40);
        field433 = null;
        field431 = null;
        field434 = null;
    }
}
