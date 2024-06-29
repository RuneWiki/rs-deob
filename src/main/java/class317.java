import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class317 {

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Lwk;")
    public class172 field4897 = new class172();

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4880 = 0;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4884 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lwk;")
    private class172 field4898;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[I")
    public static int[] field4889;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method2230(byte arg0) {
        field4890++;
        if (arg0 <= 104) {
            method2231(-76);
        }
        return this.field4897.field2737 == this.field4897;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2231(int arg0) {
        field4877++;
        if (class243.method1832((byte) 95) != 2) {
            return;
        }
        int var1 = class192.field3027 % 104;
        byte var2 = (byte) (class192.field3027 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class157.field2521[var3][var1][var4] = var2;
            }
        }
        if (class119.field1826 == 3) {
            return;
        }
        if (arg0 <= 73) {
            method2239(-116);
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class102.field1533[var5] = -1000000;
            class31.field479[var5] = 1000000;
            class83.field1199[var5] = 0;
            class120.field1870[var5] = 1000000;
            class223.field3467[var5] = 0;
        }
        if (class314.field4858 != 1) {
            int var6 = class193.method1469(class10.field143, class151.field2465, (byte) -47, class119.field1826);
            if (var6 - class64.field975 < 800 && (class146.field2386[class119.field1826][class151.field2465 >> 7][class10.field143 >> 7] & 0x4) != 0) {
                class45.method453(false, 1, class151.field2465 >> 7, class170.field2689, class10.field143 >> 7, 1179648);
            }
            return;
        }
        if ((class146.field2386[class119.field1826][class173.field2746.field1359 >> 7][class173.field2746.field1286 >> 7] & 0x4) != 0) {
            class45.method453(false, 0, class173.field2746.field1359 >> 7, class170.field2689, class173.field2746.field1286 >> 7, 1179648);
        }
        if (class191.field3005 >= 310) {
            return;
        }
        int var7 = class151.field2465 >> 7;
        int var8 = class10.field143 >> 7;
        int var9 = class173.field2746.field1359 >> 7;
        int var10 = class173.field2746.field1286 >> 7;
        int var11;
        if (var8 >= var10) {
            var11 = var8 - var10;
        } else {
            var11 = var10 - var8;
        }
        int var12;
        if (var7 >= var9) {
            var12 = var7 - var9;
        } else {
            var12 = var9 - var7;
        }
        if (var12 == 0 && var11 == 0 || var12 <= -104 || var12 >= 104 || var11 <= -104 || var11 >= 104) {
            client.method1023((byte) -113, "RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class358.field5696 + "," + class49.field755, (Throwable) null);
            return;
        }
        if (var11 < var12) {
            int var15 = var11 * 65536 / var12;
            int var16 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class146.field2386[class119.field1826][var7][var8] & 0x4) != 0) {
                    class45.method453(false, 1, var7, class170.field2689, var8, 1179648);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class146.field2386[class119.field1826][var7][var8] & 0x4) != 0) {
                        class45.method453(false, 1, var7, class170.field2689, var8, 1179648);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class146.field2386[class119.field1826][var7][var8] & 0x4) != 0) {
                class45.method453(false, 1, var7, class170.field2689, var8, 1179648);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var14 -= 65536;
                if ((class146.field2386[class119.field1826][var7][var8] & 0x4) != 0) {
                    class45.method453(false, 1, var7, class170.field2689, var8, 1179648);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lwk;", line = 205)
    public final class172 method2232(byte arg0) {
        field4879++;
        int var2 = 61 % ((-arg0 - 42) / 40);
        class172 var3 = this.field4898;
        if (this.field4897 == var3) {
            this.field4898 = null;
            return null;
        } else {
            this.field4898 = var3.field2740;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 229)
    public final void method2233(int arg0) {
        while (true) {
            class172 var2 = this.field4897.field2737;
            if (this.field4897 == var2) {
                this.field4898 = null;
                if (arg0 > -29) {
                    this.method2241(-24);
                }
                field4883++;
                return;
            }
            var2.method1357(947647010);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 247)
    public static void method2234(int arg0) {
        field4889 = null;
        if (arg0 >= -69) {
            field4893 = 79;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 258)
    public static final void method2235(byte arg0) {
        class15.field240 = 0;
        class221.field3439 = 0;
        class248.field3849 = -3;
        class222.field3447 = -1;
        int var1 = -81 / ((-arg0 - 20) / 60);
        class226.field3520 = 0;
        class287.field4452 = false;
        class290.field4509 = 1;
        field4895++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLrn;)Lqi;", line = 280)
    public static final class246 method2236(int arg0, byte arg1, class18 arg2) {
        field4881++;
        if (class122.method1058(-15575, arg0, arg2)) {
            if (arg1 != 38) {
                method2236(8, (byte) -109, (class18) null);
            }
            return class187.method1436((byte) -45);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLwk;)V", line = 295)
    public final void method2237(boolean arg0, class172 arg1) {
        field4888++;
        if (arg1.field2740 != null) {
            arg1.method1357(947647010);
        }
        arg1.field2737 = this.field4897.field2737;
        if (!arg0) {
            this.field4898 = (class172) null;
        }
        arg1.field2740 = this.field4897;
        arg1.field2740.field2737 = arg1;
        arg1.field2737.field2740 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Lwk;", line = 323)
    public final class172 method2238(byte arg0) {
        field4882++;
        class172 var2 = this.field4897.field2740;
        if (this.field4897 == var2) {
            this.field4898 = null;
            return null;
        }
        this.field4898 = var2.field2740;
        if (arg0 != 107) {
            field4880 = -6;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 353)
    public static final void method2239(int arg0) {
        class18.field295 = null;
        class355.field5652 = null;
        if (arg0 != 4) {
            method2236(-42, (byte) -5, (class18) null);
        }
        class83.field1206 = null;
        class67.field1026 = null;
        field4892++;
        class262.field4021 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIZILhm;I)Lhm;", line = 369)
    public static final class52 method2240(int arg0, int arg1, int arg2, boolean arg3, int arg4, class52 arg5, int arg6) {
        long var7 = (long) arg0;
        field4887++;
        class52 var9 = (class52) class148.field2423.method654(88, var7);
        if (var9 == null) {
            class40 var10 = class40.method415(class81.field1188, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method410(64, 768, -50, -10, -50);
            class148.field2423.method652(105, var9, var7);
        }
        int var11 = arg5.method488();
        int var12 = arg5.method502();
        int var13 = arg5.method489();
        int var14 = arg5.method503();
        class52 var15 = var9.method513(arg3, true, true);
        if (arg2 != 0) {
            var15.method491(arg2);
        }
        if (class240.field3737) {
            class56 var18 = (class56) var15;
            if (arg4 != class193.method1469(arg6 + var13, arg1 + var11, (byte) -47, class119.field1826) || class193.method1469(arg6 + var14, arg1 - -var12, (byte) -47, class119.field1826) != arg4) {
                for (int var19 = 0; var19 < var18.field846; var19++) {
                    var18.field857[var19] += class193.method1469(var18.field842[var19] + arg6, var18.field844[var19] + arg1, (byte) -47, class119.field1826) - arg4;
                }
                var18.field834.field1396 = false;
                var18.field837.field2213 = false;
            }
        } else {
            class124 var16 = (class124) var15;
            if (class193.method1469(arg6 + var13, arg1 + var11, (byte) -47, class119.field1826) != arg4 || arg4 != class193.method1469(arg6 + var14, arg1 + var12, (byte) -47, class119.field1826)) {
                for (int var17 = 0; var17 < var16.field1994; var17++) {
                    var16.field1984[var17] += class193.method1469(var16.field2023[var17] + arg6, var16.field2003[var17] + arg1, (byte) -47, class119.field1826) - arg4;
                }
                var16.field1982 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)Lwk;", line = 448)
    public final class172 method2241(int arg0) {
        if (arg0 != -1) {
            this.field4897 = (class172) null;
        }
        class172 var2 = this.field4898;
        field4896++;
        if (this.field4897 == var2) {
            this.field4898 = null;
            return null;
        } else {
            this.field4898 = var2.field2737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Lwk;", line = 482)
    public final class172 method2242(byte arg0) {
        field4878++;
        class172 var2 = this.field4897.field2737;
        if (this.field4897 == var2) {
            return null;
        } else {
            int var3 = -94 % ((arg0 + 54) / 55);
            var2.method1357(947647010);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 501)
    public static final void method2243(int arg0, int arg1) {
        class172 var2 = class149.field2435.method371(arg1 + 1110788941);
        if (arg1 != -1110808080) {
            field4893 = 95;
        }
        while (var2 != null) {
            if ((long) arg0 == (var2.field2734 >> 48 & 0xFFFFL)) {
                var2.method1357(947647010);
            }
            var2 = class149.field2435.method378((byte) -65);
        }
        field4894++;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)Lwk;", line = 521)
    public final class172 method2244(byte arg0) {
        field4885++;
        class172 var2 = this.field4897.field2737;
        if (this.field4897 == var2) {
            this.field4898 = null;
            return null;
        }
        if (arg0 >= -124) {
            method2243(6, 60);
        }
        this.field4898 = var2.field2737;
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwk;I)V", line = 542)
    public final void method2245(class172 arg0, int arg1) {
        field4891++;
        if (arg0.field2740 != null) {
            arg0.method1357(947647010);
        }
        if (arg1 <= 20) {
            this.field4898 = (class172) null;
        }
        arg0.field2740 = this.field4897.field2740;
        arg0.field2737 = this.field4897;
        arg0.field2740.field2737 = arg0;
        arg0.field2737.field2740 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 571)
    public class317() {
        this.field4897.field2740 = this.field4897;
        this.field4897.field2737 = this.field4897;
    }
}
