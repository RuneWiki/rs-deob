import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class407 extends class65 {

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "Ljava/lang/String;")
    public String field6029;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "Lwe;")
    public static class357 field6031 = new class357();

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "Z")
    public static boolean field6033 = true;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V", line = 5)
    public static void method2518(int arg0) {
        if (arg0 != -28333) {
            method2520(-85);
        }
        field6031 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method2519(boolean arg0) {
        field6034++;
        class654.field9289.method2292(-106, 1, class654.field9289.field5403);
        class654.field9289.method2292(67, 1, class654.field9289.field5453);
        class654.field9289.method2292(-102, 1, class654.field9289.field5444);
        class654.field9289.method2292(110, 1, class654.field9289.field5404);
        class654.field9289.method2292(79, 1, class654.field9289.field5433);
        class654.field9289.method2292(121, 1, class654.field9289.field5427);
        class654.field9289.method2292(116, 0, class654.field9289.field5434);
        class654.field9289.method2292(117, 0, class654.field9289.field5438);
        class654.field9289.method2292(-87, 0, class654.field9289.field5445);
        class654.field9289.method2292(-112, 0, class654.field9289.field5431);
        class654.field9289.method2292(70, 0, class654.field9289.field5448);
        class654.field9289.method2292(67, 0, class654.field9289.field5447);
        class654.field9289.method2292(84, 0, class654.field9289.field5440);
        class654.field9289.method2292(100, 0, class654.field9289.field5436);
        class654.field9289.method2292(-66, 0, class654.field9289.field5412);
        class654.field9289.method2292(-68, 0, class654.field9289.field5417);
        class654.field9289.method2292(81, 0, class654.field9289.field5441);
        class654.field9289.method2292(-75, 0, class654.field9289.field5422);
        class654.field9289.method2292(-43, 0, class654.field9289.field5429);
        class298.method1916(123);
        class654.field9289.method2292(110, 2, class654.field9289.field5407);
        class654.field9289.method2292(-46, 2, class654.field9289.field5443);
        class710.method3930((byte) 35);
        class525.method3121(-11701);
        class515.field7466 = true;
        if (arg0) {
            method2518(30);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)I", line = 59)
    public static final int method2520(int arg0) {
        field6030++;
        if (class654.field9289.field5424.method1347(3) == 0) {
            for (int var1 = 0; var1 < class576.field8166; var1++) {
                if (class354.field5372[var1].method611(7692) == 's' || class354.field5372[var1].method611(7692) == 'S') {
                    class654.field9289.method2292(-115, 1, class654.field9289.field5424);
                    class147.field2307 = true;
                    break;
                }
            }
        }
        if (class432.field6303 == class159.field2475) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class18.method109(-11121);
            if (class226.field3628 == 0L) {
                class226.field3628 = var4;
            }
            if (var3 > 16384 && var4 - class226.field3628 < 5000L) {
                if (var4 - class730.field10241 > 1000L) {
                    System.gc();
                    class730.field10241 = var4;
                }
                return 0;
            }
        }
        if (class432.field6311 == class159.field2475) {
            if (class438.field6394 == null) {
                class438.field6394 = new class410(class570.field8089, class458.field6650, class583.field8241, class543.field7746);
            }
            if (!class438.field6394.method2527(true)) {
                return 0;
            }
            class500.method3034(true, 0, 0, null);
            class186.field3117 = !class413.method2542(4);
            class291.field4485 = class483.method2928(1, false, (byte) -110, class186.field3117 ? 34 : 32);
            class264.field4095 = class483.method2928(1, false, (byte) -67, 33);
            class312.field4704 = class483.method2928(1, false, (byte) -38, 13);
        }
        if (class432.field6314 == class159.field2475) {
            boolean var6 = class264.field4095.method2632(0);
            int var7 = class442.field6424[33].method3588(-26239);
            int var8 = var7 + class442.field6424[class186.field3117 ? 34 : 32].method3588(-26239);
            int var9 = var8 + class442.field6424[13].method3588(-26239);
            int var10 = var9 + (var6 ? 100 : class264.field4095.method2637(-102));
            if (var10 != 400) {
                return var10 / 4;
            }
            class403.field5985 = class291.field4485.method2634((byte) 0);
            class99.field1468 = class264.field4095.method2634((byte) 0);
            class258.method1734(0, class291.field4485);
            int var11 = class654.field9289.field5452.method2647(3);
            class343.field5091 = new class237(class519.field7498, class467.field6804, class264.field4095);
            int[] var12 = class343.field5091.method1631(var11, 0);
            if (var12.length == 0) {
                var12 = class343.field5091.method1631(0, 0);
            }
            class311 var13 = new class311(class291.field4485, class312.field4704);
            if (var12.length > 0) {
                class13.field130 = new class409[var12.length];
                for (int var14 = 0; var14 < class13.field130.length; var14++) {
                    class13.field130[var14] = new class659(class343.field5091.method1629(var12[var14], (byte) -14), var13);
                }
            }
        }
        if (class432.field6316 == class159.field2475) {
            class659.method3707(class312.field4704, -119, class291.field4485, class719.method3968(-120));
        }
        if (class432.field6317 == class159.field2475) {
            int var15 = class468.method2867(-84);
            int var16 = class219.method1567(125);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class432.field6318 == class159.field2475) {
            if (class13.field130 != null && class13.field130.length > 0) {
                if (class13.field130[0].method1756((byte) 56) < 100) {
                    return 0;
                }
                if (class13.field130.length > 1 && class343.field5091.method1633((byte) -126) && class13.field130[1].method1756((byte) 56) < 100) {
                    return 0;
                }
            }
            class186.method1421(94, class364.field5573);
            class723.method3987(class364.field5573, (byte) 101);
            class658.method3704(-5697, 1);
        }
        if (class432.field6319 == class159.field2475) {
            for (int var17 = 0; var17 < 4; var17++) {
                class247.field3958[var17] = class37.method210(class314.field4720, (byte) 112, class191.field3229);
            }
        }
        if (class432.field6320 == class159.field2475) {
            class101.field1494 = class483.method2928(1, false, (byte) -89, 8);
            class189.field3192 = class483.method2928(1, false, (byte) -93, 0);
            class131.field2130 = class483.method2928(1, false, (byte) -31, 1);
            class564.field7992 = class483.method2928(1, false, (byte) -53, 2);
            class460.field6677 = class483.method2928(1, false, (byte) -45, 3);
            class431.field6296 = class483.method2928(1, false, (byte) -85, 4);
            class193.field3342 = class483.method2928(1, true, (byte) -116, 5);
            class521.field7518 = class483.method2928(1, true, (byte) -85, 6);
            class532.field7662 = class483.method2928(1, false, (byte) -117, 7);
            class159.field2460 = class483.method2928(1, false, (byte) -81, 9);
            class236.field3799 = class483.method2928(1, false, (byte) -49, 10);
            class110.field1724 = class483.method2928(1, false, (byte) -120, 11);
            class403.field5986 = class483.method2928(1, false, (byte) -118, 12);
            class518.field7495 = class483.method2928(1, false, (byte) -120, 14);
            class621.field8730 = class483.method2928(1, false, (byte) -73, 15);
            class86.field1267 = class483.method2928(1, false, (byte) -61, 16);
            class68.field1065 = class483.method2928(1, false, (byte) -63, 17);
            class17.field182 = class483.method2928(1, false, (byte) -123, 18);
            class666.field9462 = class483.method2928(1, false, (byte) -64, 19);
            class383.field5748 = class483.method2928(1, false, (byte) -58, 20);
            class602.field8511 = class483.method2928(1, false, (byte) -49, 21);
            class92.field1375 = class483.method2928(1, false, (byte) -115, 22);
            class147.field2306 = class483.method2928(1, true, (byte) -120, 23);
            class714.field10034 = class483.method2928(1, false, (byte) -63, 24);
            class735.field10364 = class483.method2928(1, false, (byte) -107, 25);
            class695.field9862 = class483.method2928(1, true, (byte) -113, 26);
            class371.field5635 = class483.method2928(1, false, (byte) -94, 27);
            class686.field9693 = class483.method2928(1, true, (byte) -117, 28);
            class386.field5772 = class483.method2928(1, false, (byte) -56, 29);
            class182.field3079 = class483.method2928(1, true, (byte) -95, 30);
            class172.field2951 = class483.method2928(1, true, (byte) -50, 31);
            class637.field8949 = class483.method2928(2, true, (byte) -48, 36);
        }
        if (class432.field6321 == class159.field2475) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class442.field6424[var19] != null) {
                    var18 += class442.field6424[var19].method3588(-26239) * class142.field2216[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class747.field10446 < 0) {
                    class747.field10446 = var18;
                }
                return (var18 - class747.field10446) * 100 / (100 - class747.field10446);
            }
            class218.method1561(-115, class101.field1494);
            class659.method3707(class312.field4704, 53, class101.field1494, class719.method3968(93));
        }
        if (class432.field6322 == class159.field2475) {
            if (class643.field9184 == -1) {
                class643.field9184 = class521.field7518.method2629("scape main", 10912);
            }
            class665.method3731(-120);
            class658.method3704(-5697, 2);
        }
        if (class432.field6323 == class159.field2475) {
            class344.method2208(class706.field9962, class182.field3079, (byte) 33);
        }
        if (class432.field6324 == class159.field2475) {
            int var20 = class231.method1608(false);
            if (var20 < 100) {
                return var20;
            }
            class548.method3204(5, class686.field9693.method2633(true, 1));
            class416.method2553(class686.field9693.method2633(true, 3), -8942);
        }
        if (class432.field6325 == class159.field2475) {
            if (class430.field6288 != -1 && !class532.field7662.method2640(class430.field6288, 0, 126)) {
                return 99;
            }
            class352.field5158 = new class346(class695.field9862, class159.field2460, class101.field1494);
            class382.field5728 = new class303(class519.field7498, class467.field6804, class564.field7992);
            class581.field8222 = new class215(class519.field7498, class467.field6804, class564.field7992);
            class520.field7513 = new class184(class519.field7498, class467.field6804, class564.field7992, class101.field1494);
            class316.field4738 = new class274(class519.field7498, class467.field6804, class68.field1065);
            class497.field7205 = new class231(class519.field7498, class467.field6804, class564.field7992);
            class338.field4951 = new class245(class519.field7498, class467.field6804, class564.field7992);
            class430.field6290 = new class724(class519.field7498, class467.field6804, class564.field7992, class101.field1494);
            class174.field2980 = new class128(class519.field7498, class467.field6804, class564.field7992, class532.field7662);
            class398.field5919 = new class384(class519.field7498, class467.field6804, class564.field7992);
            class451.field6568 = new class380(class519.field7498, class467.field6804, class564.field7992);
            class576.field8167 = new class511(class519.field7498, class467.field6804, true, class86.field1267, class532.field7662);
            class617.field8704 = new class416(class519.field7498, class467.field6804, class564.field7992, class101.field1494);
            class629.field8840 = new class689(class519.field7498, class467.field6804, class564.field7992, class101.field1494);
            class740.field10382 = new class598(class519.field7498, class467.field6804, true, class17.field182, class532.field7662);
            class556.field7917 = new class83(class519.field7498, class467.field6804, true, class382.field5728, class666.field9462, class532.field7662);
            class122.field1882 = new class645(class519.field7498, class467.field6804, class564.field7992);
            class83.field1219 = new class368(class519.field7498, class467.field6804, class383.field5748, class189.field3192, class131.field2130);
            class691.field9803 = new class412(class519.field7498, class467.field6804, class564.field7992);
            class416.field6122 = new class756(class519.field7498, class467.field6804, class564.field7992);
            class41.field718 = new class211(class519.field7498, class467.field6804, class602.field8511, class532.field7662);
            class184.field3100 = new class25(class519.field7498, class467.field6804, class564.field7992);
            class59.field929 = new class187(class519.field7498, class467.field6804, class564.field7992);
            class193.field3333 = new class197(class519.field7498, class467.field6804, class564.field7992);
            class52.field836 = new class252(class519.field7498, class467.field6804, class92.field1375);
            class346.field5119 = new class656(class519.field7498, class467.field6804, class564.field7992);
            class340.method2176(2493, class101.field1494, class460.field6677, class312.field4704, class532.field7662);
            class526.method3127(-1, class386.field5772);
            class543.field7748 = new class421(class467.field6804, class714.field10034, class735.field10364);
            class536.field7684 = new class200(class467.field6804, class714.field10034, class735.field10364, new class133());
            class18.method108(127);
            class576.field8167.method3068(83, class654.field9289.field5453.method3878(3) == 0);
            class422.field6216 = new class306();
            class710.method3930((byte) 103);
            class753.method4199((byte) -122, class371.field5635);
            class328.method2116(class532.field7662, (byte) 119, class352.field5158);
            class613 var21 = new class613(class236.field3799.method2638("", 93, "huffman"));
            class732.method4079(var21, -84);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class751.field10473 = class167.method1345(96);
            class547.field7815 = new class36(true, class706.field9962);
        }
        if (class432.field6327 == class159.field2475) {
            int var22 = class617.method3524(0, class101.field1494) + class643.method3632((byte) -119, true);
            int var23 = class249.method1710((byte) 85) + class219.method1567(126);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (arg0 > -56) {
            method2518(-118);
        }
        if (class432.field6328 == class159.field2475) {
            class729.method4041(class147.field2306, class497.field7205, class338.field4951, class576.field8167, class617.field8704, class629.field8840, class422.field6216);
        }
        if (class432.field6329 == class159.field2475) {
            class472.field6852 = new int[class193.field3333.field3393];
            class52.field843 = new String[class59.field929.field3119];
            class618.field8712 = new boolean[class193.field3333.field3393];
            for (int var24 = 0; var24 < class193.field3333.field3393; var24++) {
                if (class193.field3333.method1480(var24, -103).field9966 == 0) {
                    class618.field8712[var24] = true;
                    class315.field4733++;
                }
                class472.field6852[var24] = -1;
            }
            class733.method4096(0);
            class706.field9964 = class460.field6677.method2629("loginscreen", 10912);
            class575.field8159 = class460.field6677.method2629("lobbyscreen", 10912);
            class193.field3342.method2620(false, true, true);
            class521.field7518.method2620(true, true, true);
            class101.field1494.method2620(true, true, true);
            class312.field4704.method2620(true, true, true);
            class236.field3799.method2620(true, true, true);
            class460.field6677.method2620(true, true, true);
            class564.field7992.field6219 = 2;
            class243.field3924 = true;
            class68.field1065.field6219 = 2;
            class86.field1267.field6219 = 2;
            class17.field182.field6219 = 2;
            class666.field9462.field6219 = 2;
            class383.field5748.field6219 = 2;
            class602.field8511.field6219 = 2;
        }
        if (class432.field6330 == class159.field2475) {
            if (!class118.method934(class706.field9964, 76)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class158.field2453[class706.field9964].length; var26++) {
                class353 var27 = class158.field2453[class706.field9964][var26];
                if (var27.field5306 == 5 && var27.field5279 != -1 && !class101.field1494.method2640(var27.field5279, 0, 126)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class432.field6331 == class159.field2475) {
            class453.method2775(true, (byte) -92);
        }
        if (class432.field6332 == class159.field2475) {
            class346.field5112.method3977(-15785);
            try {
                class719.field10081.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class291.field4485 = null;
            class346.field5112 = null;
            class13.field130 = null;
            class264.field4095 = null;
            class343.field5091 = null;
            class719.field10081 = null;
            class357.method2282(-223);
            class485.field7010 = class654.field9289.field5424.method1347(3) == 1;
            class654.field9289.method2292(86, 1, class654.field9289.field5424);
            if (class485.field7010) {
                class654.field9289.method2292(78, 0, class654.field9289.field5446);
            } else if (class654.field9289.field5446.field4622 && class547.field7815.field364 < 512 && class547.field7815.field364 != 0) {
                class654.field9289.method2292(93, 0, class654.field9289.field5446);
            }
            class580.method3351((byte) -113);
            if (class485.field7010) {
                class526.method3125(1221653740, 0, false);
            } else {
                class526.method3125(1221653740, class654.field9289.field5446.method2004(3), false);
            }
            class562.method3253(false, false, class654.field9289.field5421.method2689(3), -1, -1);
            class186.method1421(119, class364.field5573);
            class723.method3987(class364.field5573, (byte) 101);
            class468.method2865((byte) 46, class101.field1494, class364.field5573);
            class401.method2489(class438.field6393, 119);
        }
        return class208.method1518(-105);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V", line = 508)
    public class407() {
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 517)
    public class407(String arg0, int arg1) {
        this.field6029 = arg0;
    }
}
