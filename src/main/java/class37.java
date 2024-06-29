import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 {

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lng;")
    private class226 field386 = new class226(64);

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lng;")
    public class226 field391 = new class226(2);

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lic;")
    public class491 field385;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lic;")
    private class491 field384;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field387 = 999999;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Lri;")
    public static class73 field390 = new class73(19, 8);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Ldh;")
    public static class209 field392 = new class209(new byte[5000]);

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Lic;")
    public static class491 field396;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method211(int arg0) {
        class226 var2 = this.field386;
        synchronized (this.field386) {
            this.field386.method1539(-92);
        }
        field380++;
        class226 var3 = this.field391;
        synchronized (this.field391) {
            if (arg0 != 0) {
                method215((byte) -26);
            }
            this.field391.method1539(-100);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public final void method212(boolean arg0) {
        field389++;
        class226 var2 = this.field386;
        synchronized (this.field386) {
            this.field386.method1540(0);
        }
        class226 var3 = this.field391;
        synchronized (this.field391) {
            if (arg0) {
                method214(null, -20, true, 111);
            }
            this.field391.method1540(0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Li;")
    public final class31 method213(int arg0, int arg1) {
        field381++;
        class226 var3 = this.field386;
        class31 var4;
        synchronized (this.field386) {
            var4 = (class31) this.field386.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 < 110) {
            this.field385 = null;
        }
        byte[] var5 = this.field384.method2945(33, arg1, true);
        class31 var6 = new class31();
        var6.field337 = this;
        if (var5 != null) {
            var6.method185(new class209(var5), -106);
        }
        class226 var7 = this.field386;
        synchronized (this.field386) {
            this.field386.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lwp;IZI)V")
    public static final void method214(class118 arg0, int arg1, boolean arg2, int arg3) {
        field382++;
        if (arg0 == null || class312.field4467.field1879 == arg0) {
            return;
        }
        int var4 = arg0.field1780;
        int var5 = arg0.field1788;
        int var6 = arg0.field1781;
        int var7 = (int) arg0.field1775;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field1775;
        if (var6 == 1006) {
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class423.field6351++;
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class291.method1861((byte) -104, class272.field3956);
            class356.field5471.method1413(-127, var7);
        }
        if (var6 == 9) {
            class239 var10 = class44.field707[var7];
            if (var10 != null) {
                class412.field6198 = arg3;
                class202.field2919++;
                class347.field4994 = 0;
                class490.field7240 = 2;
                class66.field1025 = arg1;
                class291.method1861((byte) -104, class169.field2502);
                class356.field5471.method1410(class162.field2368.method1352(82, 100) ? 1 : 0, -27645);
                class356.field5471.method1439(125, var7);
                class343.method2105(var10.field1996[0], var10.method847(-1), var10.field1997[0], var10.method847(-1), (byte) 119, true, 0, 0, -2);
            }
        }
        if (var6 == 18) {
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class3.field42++;
            class291.method1861((byte) -104, class271.field3933);
            class356.field5471.method1413(-120, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class356.field5471.method1429((byte) -51, class267.field3903);
            class356.field5471.method1437(class49.field785, -42);
            class356.field5471.method1457((byte) 57, class266.field3893);
            class356.field5471.method1429((byte) 108, class24.field259 + var5);
            class356.field5471.method1413(-117, var4 + class68.field1038);
            class356.field5471.method1408(class162.field2368.method1352(82, 103) ? 1 : 0, -1244);
            class527.method3110(var8, var5, (byte) 118, var4);
        }
        if (var6 == 4) {
            class239 var11 = class44.field707[var7];
            if (var11 != null) {
                class347.field4994 = 0;
                class326.field4647++;
                class490.field7240 = 2;
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class291.method1861((byte) -104, class496.field7331);
                class356.field5471.method1457((byte) 57, class266.field3893);
                class356.field5471.method1429((byte) -86, class49.field785);
                class356.field5471.method1429((byte) 109, var7);
                class356.field5471.method1408(class162.field2368.method1352(82, 104) ? 1 : 0, -1244);
                class356.field5471.method1439(-14, class267.field3903);
                class343.method2105(var11.field1996[0], var11.method847(-1), var11.field1997[0], var11.method847(-1), (byte) 127, true, 0, 0, -2);
            }
        }
        if (var6 == 30) {
            class38 var12 = class229.method1575(var4, 0, var5);
            if (var12 != null) {
                class389.method2369(var12, 0);
            }
        }
        if (var6 == 46 && class191.field2809 == null) {
            class286.method1846((byte) 47, var5, var4);
            class191.field2809 = class229.method1575(var4, 0, var5);
            class350.method2203((byte) -124, class191.field2809);
        }
        if (var6 == 15 || var6 == 1007) {
            class361.method2251(arg0.field1778, (byte) -71, var7, var5, var4);
        }
        if (var6 == 6) {
            class239 var13 = class44.field707[var7];
            if (var13 != null) {
                class490.field7240 = 2;
                class66.field1025 = arg1;
                class347.field4994 = 0;
                class149.field2214++;
                class412.field6198 = arg3;
                class291.method1861((byte) -104, class412.field6190);
                class356.field5471.method1413(-125, var7);
                class356.field5471.method1408(class162.field2368.method1352(82, 111) ? 1 : 0, -1244);
                class343.method2105(var13.field1996[0], var13.method847(-1), var13.field1997[0], var13.method847(-1), (byte) 113, true, 0, 0, -2);
            }
        }
        if (var6 == 57) {
            class159.field2344++;
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class347.field4994 = 0;
            class291.method1861((byte) -104, class164.field2405);
            class356.field5471.method1413(-116, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class356.field5471.method1437(var4 + class68.field1038, -115);
            class356.field5471.method1413(-122, class24.field259 + var5);
            class356.field5471.method1408(class162.field2368.method1352(82, 112) ? 1 : 0, -1244);
            class527.method3110(var8, var5, (byte) 88, var4);
        }
        if (var6 == 5) {
            if (class402.field6053 > 0 && class162.field2368.method1352(82, 107) && class162.field2368.method1352(81, 95)) {
                class404.method2433(class500.field7365.field1768, class68.field1038 + var4, 4566, class24.field259 + var5);
            } else {
                class359.method2229(var5, var4, var7, (byte) 124);
                if (var7 == 1) {
                    class356.field5471.method1410(-1, -27645);
                    class356.field5471.method1410(-1, -27645);
                    class356.field5471.method1413(-118, (int) class382.field5792);
                    class356.field5471.method1410(57, -27645);
                    class356.field5471.method1410(class289.field4132, -27645);
                    class356.field5471.method1410(class410.field6171, -27645);
                    class356.field5471.method1410(89, -27645);
                    class356.field5471.method1413(-125, class500.field7365.field1763);
                    class356.field5471.method1413(-118, class500.field7365.field1769);
                    class356.field5471.method1410(63, -27645);
                } else {
                    class412.field6198 = arg3;
                    class347.field4994 = 0;
                    class490.field7240 = 1;
                    class66.field1025 = arg1;
                }
                class343.method2105(var5, 1, var4, 1, (byte) 89, true, 0, 0, -4);
            }
        }
        if (var6 == 19) {
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class326.field4647++;
            class66.field1025 = arg1;
            class291.method1861((byte) -104, class496.field7331);
            class356.field5471.method1457((byte) 57, class266.field3893);
            class356.field5471.method1429((byte) 102, class49.field785);
            class356.field5471.method1429((byte) 88, class500.field7365.field1942);
            class356.field5471.method1408(class162.field2368.method1352(82, 127) ? 1 : 0, -1244);
            class356.field5471.method1439(-45, class267.field3903);
        }
        if (var6 == 16) {
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class102.field1468++;
            class291.method1861((byte) -104, class44.field697);
            class356.field5471.method1413(-128, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class356.field5471.method1429((byte) 101, var4 + class68.field1038);
            class356.field5471.method1429((byte) -81, class24.field259 + var5);
            class356.field5471.method1410(class162.field2368.method1352(82, 112) ? 1 : 0, -27645);
            class527.method3110(var8, var5, (byte) 116, var4);
        }
        if (var6 == 49) {
            class239 var14 = class44.field707[var7];
            if (var14 != null) {
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class490.field7240 = 2;
                class347.field4994 = 0;
                class259.field3820++;
                class291.method1861((byte) -104, class25.field269);
                class356.field5471.method1410(class162.field2368.method1352(82, 125) ? 1 : 0, -27645);
                class356.field5471.method1429((byte) 93, var7);
                class343.method2105(var14.field1996[0], var14.method847(-1), var14.field1997[0], var14.method847(-1), (byte) 115, true, 0, 0, -2);
            }
        }
        if (var6 == 11) {
            class167 var15 = class193.field2821[var7];
            if (var15 != null) {
                class66.field1025 = arg1;
                class106.field1527++;
                class412.field6198 = arg3;
                class347.field4994 = 0;
                class490.field7240 = 2;
                class291.method1861((byte) -104, class89.field1358);
                class356.field5471.method1413(-128, var7);
                class356.field5471.method1419(class162.field2368.method1352(82, 114) ? 1 : 0, -127);
                class343.method2105(var15.field1996[0], var15.method847(-1), var15.field1997[0], var15.method847(-1), (byte) 92, true, 0, 0, -2);
            }
        }
        if (var6 == 47) {
            class167 var16 = class193.field2821[var7];
            if (var16 != null) {
                field383++;
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class490.field7240 = 2;
                class347.field4994 = 0;
                class291.method1861((byte) -104, class202.field2923);
                class356.field5471.method1408(class162.field2368.method1352(82, 127) ? 1 : 0, -1244);
                class356.field5471.method1439(-4, var7);
                class343.method2105(var16.field1996[0], var16.method847(-1), var16.field1997[0], var16.method847(-1), (byte) 116, true, 0, 0, -2);
            }
        }
        if (var6 == 20) {
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class357.field5484++;
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class291.method1861((byte) -104, class531.field7821);
            class356.field5471.method1413(-123, class24.field259 + var5);
            class356.field5471.method1439(117, var7);
            class356.field5471.method1410(class162.field2368.method1352(82, 92) ? 1 : 0, -27645);
            class356.field5471.method1437(class68.field1038 + var4, -125);
            class26.method161(var4, var5, true);
        }
        if (var6 == 48) {
            class167 var17 = class193.field2821[var7];
            if (var17 != null) {
                class66.field1025 = arg1;
                class246.field3627++;
                class347.field4994 = 0;
                class490.field7240 = 2;
                class412.field6198 = arg3;
                class291.method1861((byte) -104, class511.field7457);
                class356.field5471.method1410(class162.field2368.method1352(82, 117) ? 1 : 0, -27645);
                class356.field5471.method1413(-127, var7);
                class343.method2105(var17.field1996[0], var17.method847(-1), var17.field1997[0], var17.method847(-1), (byte) 83, true, 0, 0, -2);
            }
        }
        if (var6 == 8) {
            class66.field1025 = arg1;
            class490.field7240 = 2;
            class310.field4456++;
            class412.field6198 = arg3;
            class347.field4994 = 0;
            class291.method1861((byte) -104, class268.field3908);
            class356.field5471.method1437(class68.field1038 + var4, 99);
            class356.field5471.method1437(Integer.MAX_VALUE & (int) (var8 >>> 32), -61);
            class356.field5471.method1429((byte) 56, class24.field259 + var5);
            class356.field5471.method1419(class162.field2368.method1352(82, 91) ? 1 : 0, -127);
            class527.method3110(var8, var5, (byte) 127, var4);
        }
        if (var6 == 50) {
            class140.field2108++;
            class66.field1025 = arg1;
            class412.field6198 = arg3;
            class347.field4994 = 0;
            class490.field7240 = 2;
            class291.method1861((byte) -104, class465.field6884);
            class356.field5471.method1467(0, class162.field2368.method1352(82, 118) ? 1 : 0);
            class356.field5471.method1429((byte) -119, class24.field259 + var5);
            class356.field5471.method1413(-121, class68.field1038 + var4);
            class356.field5471.method1429((byte) -86, var7);
            class26.method161(var4, var5, true);
        }
        if (var6 == 22) {
            class66.field1025 = arg1;
            class412.field6198 = arg3;
            class99.field1449++;
            class347.field4994 = 0;
            class490.field7240 = 2;
            class291.method1861((byte) -104, class490.field7237);
            class356.field5471.method1429((byte) 78, class68.field1038 + var4);
            class356.field5471.method1437(class24.field259 + var5, -37);
            class356.field5471.method1439(-78, var7);
            class356.field5471.method1419(class162.field2368.method1352(82, 106) ? 1 : 0, -127);
            class26.method161(var4, var5, true);
        }
        if (var6 == 1009 || var6 == 1010 || var6 == 1003 || var6 == 1001 || var6 == 1002) {
            class514.method3034(var7, 0, var6, var4);
        }
        if (var6 == 17) {
            class239 var18 = class44.field707[var7];
            if (var18 != null) {
                class490.field7240 = 2;
                class66.field1025 = arg1;
                class412.field6198 = arg3;
                class69.field1053++;
                class347.field4994 = 0;
                class291.method1861((byte) -104, class337.field4739);
                class356.field5471.method1429((byte) 75, var7);
                class356.field5471.method1408(class162.field2368.method1352(82, 119) ? 1 : 0, -1244);
                class343.method2105(var18.field1996[0], var18.method847(-1), var18.field1997[0], var18.method847(-1), (byte) 83, true, 0, 0, -2);
            }
        }
        if (var6 == 1012) {
            class147.field2174++;
            class412.field6198 = arg3;
            class66.field1025 = arg1;
            class347.field4994 = 0;
            class490.field7240 = 2;
            class291.method1861((byte) -104, class166.field2454);
            class356.field5471.method1437(class68.field1038 + var4, 91);
            class356.field5471.method1439(-9, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class356.field5471.method1419(class162.field2368.method1352(82, 104) ? 1 : 0, -126);
            class356.field5471.method1429((byte) 58, class24.field259 + var5);
            class527.method3110(var8, var5, (byte) 87, var4);
        }
        if (var6 == 21) {
            class167 var19 = class193.field2821[var7];
            if (var19 != null) {
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class228.field3387++;
                class490.field7240 = 2;
                class347.field4994 = 0;
                class291.method1861((byte) -104, class335.field4728);
                class356.field5471.method1429((byte) -122, var7);
                class356.field5471.method1419(class162.field2368.method1352(82, 118) ? 1 : 0, -128);
                class356.field5471.method1429((byte) 112, class49.field785);
                class356.field5471.method1415(class266.field3893, (byte) -64);
                class356.field5471.method1439(-124, class267.field3903);
                class343.method2105(var19.field1996[0], var19.method847(-1), var19.field1997[0], var19.method847(-1), (byte) 89, true, 0, 0, -2);
            }
        }
        if (var6 == 1004) {
            class412.field6198 = arg3;
            class302.field4271++;
            class490.field7240 = 2;
            class66.field1025 = arg1;
            class347.field4994 = 0;
            class291.method1861((byte) -104, class479.field7037);
            class356.field5471.method1413(-121, var7);
        }
        if (var6 == 25) {
            class239 var20 = class44.field707[var7];
            if (var20 != null) {
                class490.field7240 = 2;
                class412.field6198 = arg3;
                class347.field4994 = 0;
                class66.field1025 = arg1;
                class209.field3038++;
                class291.method1861((byte) -104, class338.field4758);
                class356.field5471.method1419(class162.field2368.method1352(82, 104) ? 1 : 0, -128);
                class356.field5471.method1413(-119, var7);
                class343.method2105(var20.field1996[0], var20.method847(-1), var20.field1997[0], var20.method847(-1), (byte) 105, true, 0, 0, -2);
            }
        }
        if (var6 == 45) {
            class490.field7240 = 1;
            class347.field4994 = 0;
            class412.field6198 = arg3;
            class66.field1025 = arg1;
            class445.field6619++;
            class291.method1861((byte) -104, class79.field1193);
            class356.field5471.method1439(114, class24.field259 + var5);
            class356.field5471.method1439(-6, class68.field1038 + var4);
            class356.field5471.method1429((byte) -110, class267.field3903);
            class356.field5471.method1439(-21, class49.field785);
            class356.field5471.method1415(class266.field3893, (byte) -75);
            class343.method2105(var5, 1, var4, 1, (byte) 117, true, 0, 0, -4);
        }
        if (var6 == 13) {
            class66.field1025 = arg1;
            class411.field6181++;
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class347.field4994 = 0;
            class291.method1861((byte) -104, class317.field4543);
            class356.field5471.method1439(115, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class356.field5471.method1437(class68.field1038 + var4, -40);
            class356.field5471.method1439(-93, class24.field259 + var5);
            class356.field5471.method1408(class162.field2368.method1352(82, 106) ? 1 : 0, -1244);
            class527.method3110(var8, var5, (byte) 120, var4);
        }
        if (var6 == 51) {
            class38 var21 = class229.method1575(var4, 0, var5);
            if (var21 != null) {
                class138.method920((byte) -43);
                class387 var22 = client.method1328(var21);
                class353.method2211((byte) 92, var22.method2361((byte) 75), var22.field5860, var21);
                class509.field7432 = class487.method2889(3644, var21);
                if (class509.field7432 == null) {
                    class509.field7432 = "Null";
                }
                class187.field2779 = var21.field499 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 2) {
            class347.field4994 = 0;
            class490.field7240 = 2;
            class412.field6198 = arg3;
            class66.field1025 = arg1;
            class272.field3951++;
            class291.method1861((byte) -104, class81.field1224);
            class356.field5471.method1413(-128, class68.field1038 + var4);
            class356.field5471.method1419(class162.field2368.method1352(82, 99) ? 1 : 0, -127);
            class356.field5471.method1439(-29, var5 + class24.field259);
            class356.field5471.method1437(var7, -108);
            class26.method161(var4, var5, !arg2);
        }
        if (var6 == 3) {
            class239 var23 = class44.field707[var7];
            if (var23 != null) {
                class412.field6198 = arg3;
                class490.field7240 = 2;
                class347.field4994 = 0;
                class318.field4567++;
                class66.field1025 = arg1;
                class291.method1861((byte) -104, class150.field2228);
                class356.field5471.method1467(0, class162.field2368.method1352(82, 90) ? 1 : 0);
                class356.field5471.method1437(var7, -74);
                class343.method2105(var23.field1996[0], var23.method847(-1), var23.field1997[0], var23.method847(-1), (byte) 125, true, 0, 0, -2);
            }
        }
        if (var6 == 1011) {
            class412.field6198 = arg3;
            class490.field7240 = 2;
            class347.field4994 = 0;
            class66.field1025 = arg1;
            class167 var24 = class193.field2821[var7];
            if (var24 != null) {
                class342 var25 = var24.field2472;
                if (var25.field4938 != null) {
                    var25 = var25.method2094(-127, class49.field796);
                }
                if (var25 != null) {
                    class291.method1861((byte) -104, class294.field4198);
                    class187.field2776++;
                    class356.field5471.method1413(-122, var25.field4936);
                }
            }
        }
        if (var6 == 23) {
            class167 var26 = class193.field2821[var7];
            if (var26 != null) {
                class66.field1025 = arg1;
                class165.field2427++;
                class490.field7240 = 2;
                class347.field4994 = 0;
                class412.field6198 = arg3;
                class291.method1861((byte) -104, class415.field6236);
                class356.field5471.method1413(-125, var7);
                class356.field5471.method1410(class162.field2368.method1352(82, 120) ? 1 : 0, -27645);
                class343.method2105(var26.field1996[0], var26.method847(-1), var26.field1997[0], var26.method847(-1), (byte) 123, true, 0, 0, -2);
            }
        }
        if (arg2) {
            method215((byte) -34);
        }
        if (var6 == 10) {
            class239 var27 = class44.field707[var7];
            if (var27 != null) {
                class412.field6198 = arg3;
                class490.field7240 = 2;
                class66.field1025 = arg1;
                class347.field4994 = 0;
                class151.field2250++;
                class291.method1861((byte) -104, class326.field4649);
                class356.field5471.method1410(class162.field2368.method1352(82, 108) ? 1 : 0, -27645);
                class356.field5471.method1439(-109, var7);
                class343.method2105(var27.field1996[0], var27.method847(-1), var27.field1997[0], var27.method847(-1), (byte) 83, true, 0, 0, -2);
            }
        }
        if (var6 == 58) {
            class66.field1025 = arg1;
            class412.field6198 = arg3;
            class347.field4994 = 0;
            class217.field3189++;
            class490.field7240 = 2;
            class291.method1861((byte) -104, class525.field7767);
            class356.field5471.method1439(109, class68.field1038 + var4);
            class356.field5471.method1467(0, class162.field2368.method1352(82, 106) ? 1 : 0);
            class356.field5471.method1439(126, var7);
            class356.field5471.method1437(class24.field259 + var5, 80);
            class26.method161(var4, var5, !arg2);
        }
        if (var6 == 12) {
            class347.field4994 = 0;
            class66.field1025 = arg1;
            class43.field650++;
            class490.field7240 = 2;
            class412.field6198 = arg3;
            class291.method1861((byte) -104, class287.field4105);
            class356.field5471.method1429((byte) -72, class49.field785);
            class356.field5471.method1408(class162.field2368.method1352(82, 102) ? 1 : 0, -1244);
            class356.field5471.method1429((byte) 62, class68.field1038 + var4);
            class356.field5471.method1413(-118, class267.field3903);
            class356.field5471.method1437(class24.field259 + var5, 103);
            class356.field5471.method1439(95, var7);
            class356.field5471.method1415(class266.field3893, (byte) -78);
            class26.method161(var4, var5, true);
        }
        if (var6 == 60) {
            class239 var28 = class44.field707[var7];
            if (var28 != null) {
                class347.field4994 = 0;
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class182.field2662++;
                class490.field7240 = 2;
                class291.method1861((byte) -104, class219.field3209);
                class356.field5471.method1408(class162.field2368.method1352(82, 116) ? 1 : 0, -1244);
                class356.field5471.method1439(-108, var7);
                class343.method2105(var28.field1996[0], var28.method847(-1), var28.field1997[0], var28.method847(-1), (byte) 117, true, 0, 0, -2);
            }
        }
        if (var6 == 59) {
            class167 var29 = class193.field2821[var7];
            if (var29 != null) {
                class412.field6198 = arg3;
                class66.field1025 = arg1;
                class347.field4994 = 0;
                class490.field7240 = 2;
                class1.field3++;
                class291.method1861((byte) -104, class84.field1290);
                class356.field5471.method1419(class162.field2368.method1352(82, 92) ? 1 : 0, -128);
                class356.field5471.method1429((byte) 107, var7);
                class343.method2105(var29.field1996[0], var29.method847(-1), var29.field1997[0], var29.method847(-1), (byte) 110, true, 0, 0, -2);
            }
        }
        if (var6 == 44) {
            if (class402.field6053 > 0 && class162.field2368.method1352(82, 96) && class162.field2368.method1352(81, 95)) {
                class404.method2433(class500.field7365.field1768, class68.field1038 + var4, 4566, class24.field259 + var5);
            } else {
                class267.field3905++;
                class412.field6198 = arg3;
                class490.field7240 = 1;
                class347.field4994 = 0;
                class66.field1025 = arg1;
                class291.method1861((byte) -104, class284.field4086);
                class356.field5471.method1439(118, class68.field1038 + var4);
                class356.field5471.method1429((byte) 72, class24.field259 + var5);
            }
        }
        if (class61.field932) {
            class138.method920((byte) -43);
        }
        if (class57.field876 != null && class221.field3284 == 0) {
            class350.method2203((byte) -120, class57.field876);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field390 = null;
        if (arg0 != 87) {
            field390 = null;
        }
        field396 = null;
        field392 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V")
    public final void method216(int arg0, int arg1) {
        class226 var3 = this.field386;
        synchronized (this.field386) {
            this.field386.method1534(0, arg1);
        }
        field388++;
        class226 var4 = this.field391;
        synchronized (this.field391) {
            this.field391.method1534(0, arg1);
        }
        int var5 = -117 / ((-arg0 - 6) / 56);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lai;ILic;Lic;)V")
    public class37(class423 arg0, int arg1, class491 arg2, class491 arg3) {
        this.field385 = arg3;
        this.field384 = arg2;
        this.field384.method2942(false, 33);
    }
}
