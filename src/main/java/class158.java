import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class158 {

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "Laq;")
    private class494 field2472 = new class494(16);

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "Lgga;")
    private class513 field2468;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "Lin;")
    public static class380 field2465 = new class380(101, -1);

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 5)
    public final void method1217(byte arg0) {
        field2471++;
        class494 var2 = this.field2472;
        synchronized (this.field2472) {
            int var3 = 37 / ((-arg0 - 82) / 43);
            this.field2472.method2881((byte) -95);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)I", line = 19)
    public static final int method1218(int arg0) {
        if (class420.field5820.field9458.method1457(17539) == 0) {
            for (int var1 = 0; var1 < class125.field2147; var1++) {
                if (class321.field4560[var1].method764((byte) -57) == 's' || class321.field4560[var1].method764((byte) -64) == 'S') {
                    class420.field5820.method3781(class420.field5820.field9458, arg0 + 96, 1);
                    class689.field9728 = true;
                    break;
                }
            }
        }
        field2469++;
        if (class40.field464 == class346.field4904) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class337.method2062(false);
            if (class347.field4937 == 0L) {
                class347.field4937 = var4;
            }
            if (var3 > 16384 && var4 - class347.field4937 < 5000L) {
                if (var4 - class371.field5234 > 1000L) {
                    System.gc();
                    class371.field5234 = var4;
                }
                return 0;
            }
        }
        if (class40.field464 == class346.field4909) {
            if (class330.field4697 == null) {
                class330.field4697 = new class604(class138.field2286, class628.field8909, class6.field82, class616.field8739);
            }
            if (!class330.field4697.method3508((byte) 112)) {
                return 0;
            }
            class442.method2620(true, (byte) -80, 0, null);
            class646.field9184 = !class720.method4005(76);
            class13.field162 = class144.method1153(false, class646.field9184 ? 34 : 32, 1, arg0 ^ 0xFFFFFFC9);
            class472.field6425 = class144.method1153(false, 33, 1, arg0 ^ 0x42);
            class77.field1161 = class144.method1153(false, 13, 1, -55);
        }
        if (class40.field464 == class346.field4910) {
            boolean var6 = class472.field6425.method3004((byte) -128);
            int var7 = class429.field5942[33].method3796(arg0 - 14971);
            int var8 = var7 + class429.field5942[class646.field9184 ? 34 : 32].method3796(-14963);
            int var9 = var8 + class429.field5942[13].method3796(-14963);
            int var10 = var9 + (var6 ? 100 : class472.field6425.method2998(0));
            if (var10 != 400) {
                return var10 / 4;
            }
            class140.field2301 = class13.field162.method2993(true);
            class213.field3130 = class472.field6425.method2993(true);
            class97.method799(class13.field162, true);
            int var11 = class420.field5820.field9463.method2184(arg0 + 17531);
            class514.field7083 = new class432(class113.field1647, class423.field5892, class472.field6425);
            int[] var12 = class514.field7083.method2589((byte) -122, var11);
            if (var12.length == 0) {
                var12 = class514.field7083.method2589((byte) -122, 0);
            }
            class319 var13 = new class319(class13.field162, class77.field1161);
            if (var12.length > 0) {
                class223.field3276 = new class204[var12.length];
                for (int var14 = 0; var14 < class223.field3276.length; var14++) {
                    class223.field3276[var14] = new class744(class514.field7083.method2585(var12[var14], arg0 - 24479), var13);
                }
            }
        }
        if (class40.field464 == class346.field4911) {
            class651.method3670(class13.field162, class340.method2091(-112), 65535, class77.field1161);
        }
        if (class40.field464 == class346.field4912) {
            int var15 = class377.method2269((byte) 53);
            int var16 = class693.method3893((byte) -100);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class40.field464 == class346.field4913) {
            if (class223.field3276 != null && class223.field3276.length > 0) {
                if (class223.field3276[0].method733(false) < 100) {
                    return 0;
                }
                if (class223.field3276.length > 1 && class514.field7083.method2590((byte) 72) && class223.field3276[1].method733(false) < 100) {
                    return 0;
                }
            }
            class657.method3686(false, class686.field9702);
            class431.method2551(class686.field9702, 3);
            class75.method690(true, 1);
        }
        if (class40.field464 == class346.field4914) {
            for (int var17 = 0; var17 < 4; var17++) {
                class605.field8591[var17] = class362.method2172(class192.field2891, 1, class456.field6225);
            }
        }
        if (class40.field464 == class346.field4915) {
            class176.field2648 = class144.method1153(false, 8, 1, 105);
            class161.field2494 = class144.method1153(false, 0, 1, arg0 ^ 0xFFFFFFAC);
            class679.field9599 = class144.method1153(false, 1, 1, -121);
            class461.field6293 = class144.method1153(false, 2, 1, -100);
            class427.field5919 = class144.method1153(false, 3, 1, 91);
            class12.field151 = class144.method1153(false, 4, 1, -125);
            class562.field7790 = class144.method1153(true, 5, 1, 105);
            class399.field5495 = class144.method1153(true, 6, 1, -72);
            class762.field10561 = class144.method1153(false, 7, 1, 62);
            class227.field3308 = class144.method1153(false, 9, 1, -110);
            class234.field3395 = class144.method1153(false, 10, 1, -78);
            class397.field5478 = class144.method1153(false, 11, 1, -119);
            class522.field7317 = class144.method1153(false, 12, 1, -57);
            class224.field3296 = class144.method1153(false, 14, 1, -59);
            class104.field1517 = class144.method1153(false, 15, 1, -108);
            class265.field3739 = class144.method1153(false, 16, 1, arg0 ^ 0xFFFFFFAB);
            class123.field2091 = class144.method1153(false, 17, 1, -100);
            class724.field10088 = class144.method1153(false, 18, 1, -119);
            class469.field6386 = class144.method1153(false, 19, 1, 111);
            class629.field8924 = class144.method1153(false, 20, 1, arg0 + 89);
            class58.field898 = class144.method1153(false, 21, 1, arg0 + 88);
            class216.field3156 = class144.method1153(false, 22, 1, arg0 - 91);
            class576.field8310 = class144.method1153(true, 23, 1, -105);
            class275.field3849 = class144.method1153(false, 24, 1, 100);
            class194.field2908 = class144.method1153(false, 25, 1, 66);
            class40.field467 = class144.method1153(true, 26, 1, arg0 ^ 0xFFFFFFBF);
            class272.field3829 = class144.method1153(false, 27, 1, -79);
            class636.field8992 = class144.method1153(true, 28, 1, 64);
            class725.field10100 = class144.method1153(false, 29, 1, 113);
            class144.field2338 = class144.method1153(true, 30, 1, -123);
            class570.field7914 = class144.method1153(true, 31, 1, -117);
            class30.field334 = class144.method1153(true, 36, 2, arg0 ^ 0x6F);
        }
        if (class40.field464 == class346.field4916) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class429.field5942[var19] != null) {
                    var18 += class429.field5942[var19].method3796(-14963) * class283.field4152[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class239.field3458 < 0) {
                    class239.field3458 = var18;
                }
                return (var18 - class239.field3458) * 100 / (100 - class239.field3458);
            }
            class7.method52(class176.field2648, (byte) 124);
            class651.method3670(class176.field2648, class340.method2091(-122), 65535, class77.field1161);
        }
        if (class40.field464 == class346.field4917) {
            if (class743.field10326 == -1) {
                class743.field10326 = class399.field5495.method3016(122, "scape main");
            }
            class58.method617((byte) 91);
            class75.method690(true, 2);
        }
        if (class40.field464 == class346.field4918) {
            class473.method2763(class336.field4775, class144.field2338, false);
        }
        if (class40.field464 == class346.field4919) {
            int var20 = class759.method4193((byte) -62);
            if (var20 < 100) {
                return var20;
            }
            class544.method3150(19800, class636.field8992.method2988(1, 0));
            class190.method1365((byte) 99, class636.field8992.method2988(3, 0));
            class87.field1296 = new class390(class636.field8992);
        }
        if (class40.field464 == class346.field4920) {
            if (class315.field4466 != -1 && !class762.field10561.method2987(class315.field4466, 0, 0)) {
                return 99;
            }
            class425.field5903 = new class733(class40.field467, class227.field3308, class176.field2648);
            class498.field6854 = new class585(class113.field1647, class423.field5892, class461.field6293);
            class150.field2404 = new class277(class113.field1647, class423.field5892, class461.field6293, class87.field1296);
            class422.field5876 = new class538(class113.field1647, class423.field5892, class461.field6293, class176.field2648);
            class433.field6045 = new class670(class113.field1647, class423.field5892, class123.field2091);
            class613.field8701 = new class12(class113.field1647, class423.field5892, class461.field6293);
            class452.field6197 = new class556(class113.field1647, class423.field5892, class461.field6293);
            class153.field2446 = new class467(class113.field1647, class423.field5892, class461.field6293, class176.field2648);
            class38.field451 = new class498(class113.field1647, class423.field5892, class461.field6293, class762.field10561);
            class510.field7010 = new class496(class113.field1647, class423.field5892, class461.field6293);
            class402.field5547 = new class213(class113.field1647, class423.field5892, class461.field6293);
            class312.field4418 = new class47(class113.field1647, class423.field5892, true, class265.field3739, class762.field10561);
            class451.field6195 = new class743(class113.field1647, class423.field5892, class461.field6293, class176.field2648);
            class309.field4401 = new class65(class113.field1647, class423.field5892, class461.field6293, class176.field2648);
            class677.field9511 = new class660(class113.field1647, class423.field5892, true, class724.field10088, class762.field10561);
            class422.field5873 = new class503(class113.field1647, class423.field5892, true, class498.field6854, class469.field6386, class762.field10561);
            class523.field7326 = new class456(class113.field1647, class423.field5892, class461.field6293);
            class168.field2552 = new class564(class113.field1647, class423.field5892, class629.field8924, class161.field2494, class679.field9599);
            class648.field9192 = new class397(class113.field1647, class423.field5892, class461.field6293);
            class606.field8616 = new class158(class113.field1647, class423.field5892, class461.field6293);
            class620.field8760 = new class290(class113.field1647, class423.field5892, class58.field898, class762.field10561);
            class233.field3382 = new class582(class113.field1647, class423.field5892, class461.field6293);
            class21.field239 = new class593(class113.field1647, class423.field5892, class461.field6293);
            class402.field5548 = new class273(class113.field1647, class423.field5892, class461.field6293);
            class600.field8552 = new class619(class113.field1647, class423.field5892, class216.field3156);
            class4.field60 = new class663(class113.field1647, class423.field5892, class461.field6293);
            class662.field9323 = new class265(class113.field1647, class423.field5892, class461.field6293);
            class547.method3162(class427.field5919, class762.field10561, (byte) 123, class176.field2648, class77.field1161);
            class246.method1638(class725.field10100, -9);
            class709.field9922 = new class739(class423.field5892, class275.field3849, class194.field2908);
            class502.field6884 = new class402(class423.field5892, class275.field3849, class194.field2908, new class533());
            class530.method3093(27);
            class312.field4418.method361(-1, class420.field5820.field9495.method1677(17539) == 0);
            class578.field8328 = new class786();
            class319.method1936((byte) 110);
            class358.method2167(-12866, class272.field3829);
            class528.method3088(false, class425.field5903, class762.field10561);
            class712 var21 = new class712(class234.field3395.method3017(0, "", "huffman"));
            class425.method2499(var21, (byte) 111);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class56.field876 = class728.method4044((byte) -114);
            class63.field964 = new class791(true, class336.field4775);
        }
        if (class40.field464 == class346.field4922) {
            int var22 = class437.method2607((byte) -58, class176.field2648) + class406.method2405(true, (byte) -117);
            int var23 = class255.method1680(true) + class693.method3893((byte) -106);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (arg0 != 8) {
            field2465 = null;
        }
        if (class40.field464 == class346.field4923) {
            class751.method4132(class576.field8310, class613.field8701, class452.field6197, class312.field4418, class451.field6195, class309.field4401, class578.field8328);
        }
        if (class40.field464 == class346.field4924) {
            class17.field187 = new String[class21.field239.field8491];
            class362.field5135 = new int[class402.field5548.field3831];
            class769.field10616 = new boolean[class402.field5548.field3831];
            for (int var24 = 0; var24 < class402.field5548.field3831; var24++) {
                if (class402.field5548.method1738(false, var24).field3398 == 0) {
                    class769.field10616[var24] = true;
                    class652.field9237++;
                }
                class362.field5135[var24] = -1;
            }
            class221.method1522(34336);
            class222.field3265 = class427.field5919.method3016(111, "loginscreen");
            class420.field5819 = class427.field5919.method3016(104, "lobbyscreen");
            class562.field7790.method2989(true, true, false);
            class399.field5495.method2989(true, true, true);
            class176.field2648.method2989(true, true, true);
            class77.field1161.method2989(true, true, true);
            class234.field3395.method2989(true, true, true);
            class427.field5919.method2989(true, true, true);
            class640.field9011 = true;
            class461.field6293.field7051 = 2;
            class123.field2091.field7051 = 2;
            class265.field3739.field7051 = 2;
            class724.field10088.field7051 = 2;
            class469.field6386.field7051 = 2;
            class629.field8924.field7051 = 2;
            class58.field898.field7051 = 2;
        }
        if (class40.field464 == class346.field4925) {
            if (!class484.method2853(class222.field3265, (byte) -104)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class610.field8661[class222.field3265].length; var26++) {
                class519 var27 = class610.field8661[class222.field3265][var26];
                if (var27.field7190 == 5 && var27.field7246 != -1 && !class176.field2648.method2987(var27.field7246, 0, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class40.field464 == class346.field4926) {
            class98.method811(true, (byte) 42);
        }
        if (class40.field464 == class346.field4927) {
            class138.field2289.method2709(11309);
            try {
                class254.field3642.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class13.field162 = null;
            class254.field3642 = null;
            class514.field7083 = null;
            class472.field6425 = null;
            class223.field3276 = null;
            class138.field2289 = null;
            class217.method1497(arg0 + 92);
            class770.field10631 = class420.field5820.field9458.method1457(17539) == 1;
            class420.field5820.method3781(class420.field5820.field9458, 103, 1);
            if (class770.field10631) {
                class420.field5820.method3781(class420.field5820.field9466, arg0 + 97, 0);
            } else if (class420.field5820.field9466.field5431 && class63.field964.field10844 < 512 && class63.field964.field10844 != 0) {
                class420.field5820.method3781(class420.field5820.field9466, 124, 0);
            }
            class95.method797(80);
            if (class770.field10631) {
                class636.method3625(false, 0, -50);
            } else {
                class636.method3625(false, class420.field5820.field9466.method2338(17539), 125);
            }
            class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
            class657.method3686(false, class686.field9702);
            class431.method2551(class686.field9702, arg0 - 5);
            class256.method1682(class686.field9702, arg0 + 100, class176.field2648);
            class552.method3187(arg0 - 17088, class581.field8365);
        }
        return class68.method667((byte) 66);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V", line = 470)
    public final void method1219(int arg0) {
        class494 var2 = this.field2472;
        synchronized (this.field2472) {
            if (arg0 != 0) {
                field2465 = null;
            }
            this.field2472.method2893((byte) -81);
        }
        field2467++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V", line = 484)
    public final void method1220(int arg0, int arg1) {
        field2470++;
        if (arg1 < 47) {
            this.field2468 = null;
        }
        class494 var3 = this.field2472;
        synchronized (this.field2472) {
            this.field2472.method2888(arg0, 119);
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)V", line = 498)
    public static void method1221(int arg0) {
        if (arg0 <= 9) {
            field2465 = null;
        }
        field2465 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IB)Lgaa;", line = 509)
    public final class481 method1222(int arg0, byte arg1) {
        field2473++;
        class494 var3 = this.field2472;
        class481 var4;
        synchronized (this.field2472) {
            var4 = (class481) this.field2472.method2882((long) arg0, (byte) -88);
        }
        if (arg1 > -64) {
            return null;
        } else if (var4 == null) {
            class513 var5 = this.field2468;
            byte[] var6;
            synchronized (this.field2468) {
                var6 = this.field2468.method3019(30, arg0, 119);
            }
            class481 var7 = new class481();
            if (var6 != null) {
                var7.method2844(-86, new class431(var6));
            }
            class494 var8 = this.field2472;
            synchronized (this.field2472) {
                this.field2472.method2890(-7307, (long) arg0, var7);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lmca;ILgga;)V", line = 548)
    private class158(class41 arg0, int arg1, class513 arg2) {
        this.field2468 = arg2;
        this.field2468.method3007(-1, 30);
    }
}
