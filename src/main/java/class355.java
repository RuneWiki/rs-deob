import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class355 {

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    private int field5208 = 0;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lsf;")
    private class143 field5211;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Lsf;")
    public static class143 field5207 = new class143(16);

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "[I")
    public static int[] field5210 = new int[200];

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[I")
    public static int[] field5213 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lqj;")
    public static class238 field5212;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lo;")
    private class393 field5202;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V")
    public static final void method2327(int arg0, byte arg1) {
        class24 var2 = class79.field1080;
        synchronized (class79.field1080) {
            class79.field1080.method215(arg1 + 60, arg0);
        }
        field5203++;
        if (arg1 != -60) {
            method2331(51);
        }
        class24 var3 = class29.field500;
        synchronized (class29.field500) {
            class29.field500.method215(0, arg0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method2328(int arg0) {
        field5210 = null;
        field5212 = null;
        field5213 = null;
        field5207 = null;
        int var1 = 59 / ((arg0 + 13) / 55);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
    public static final void method2329(byte arg0) {
        class146.field1921 = new class321(8);
        field5209++;
        if (arg0 != -6) {
            method2329((byte) 1);
        }
        class416.field6206 = 0;
        for (class279 var1 = (class279) class175.field2291.method976((byte) 42); var1 != null; var1 = (class279) class175.field2291.method979(120)) {
            var1.method1787();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZILc;ZLc;)I")
    public static final int method2330(boolean arg0, int arg1, class159 arg2, boolean arg3, class159 arg4) {
        field5214++;
        if (arg1 == 1) {
            int var5 = arg4.field3444;
            int var6 = arg2.field3444;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class18.method124(arg4.method1007(20203).field1244, 110, class58.field833, arg2.method1007(20203).field1244);
        } else if (arg1 == 3) {
            if (arg4.field2086.equals("-")) {
                if (arg2.field2086.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2086.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class18.method124(arg4.field2086, 117, class58.field833, arg2.field2086);
            }
        } else if (arg1 != 4) {
            if (!arg3) {
                field5210 = null;
            }
            if (arg1 == 5) {
                if (arg4.method1526(34)) {
                    return arg2.method1526(68) ? 0 : 1;
                } else if (arg2.method1526(124)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 6) {
                if (arg4.method1527(77)) {
                    return arg2.method1527(113) ? 0 : 1;
                } else if (arg2.method1527(-92)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 7) {
                if (arg4.method1522(59)) {
                    return arg2.method1522(52) ? 0 : 1;
                } else if (arg2.method1522(89)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 8) {
                int var7 = arg4.field2081;
                int var8 = arg2.field2081;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field2088 - arg2.field2088;
            }
        } else if (arg4.method1521((byte) -91)) {
            return arg2.method1521((byte) -79) ? 0 : 1;
        } else if (arg2.method1521((byte) -86)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public static final void method2331(int arg0) {
        field5204++;
        int var1 = class95.field1306 * 128 + 64;
        int var2 = class148.field1956 * 128 + 64;
        int var3 = class139.method935(var2, -111, var1, class193.field2688) - class153.field2003;
        if (class344.field5053 >= 100) {
            class237.field3326 = class95.field1306 * 128 + 64;
            class7.field71 = class148.field1956 * 128 + 64;
            class130.field1745 = class139.method935(class7.field71, -84, class237.field3326, class193.field2688) - class153.field2003;
        } else {
            if (class237.field3326 < var1) {
                class237.field3326 += class37.field599 + ((var1 - class237.field3326) * class344.field5053 / 1000);
                if (var1 < class237.field3326) {
                    class237.field3326 = var1;
                }
            }
            if (class130.field1745 < var3) {
                class130.field1745 += (var3 - class130.field1745) * class344.field5053 / 1000 + class37.field599;
                if (class130.field1745 > var3) {
                    class130.field1745 = var3;
                }
            }
            if (class237.field3326 > var1) {
                class237.field3326 -= (class237.field3326 - var1) * class344.field5053 / 1000 + class37.field599;
                if (class237.field3326 < var1) {
                    class237.field3326 = var1;
                }
            }
            if (var2 > class7.field71) {
                class7.field71 += (var2 - class7.field71) * class344.field5053 / 1000 + class37.field599;
                if (var2 < class7.field71) {
                    class7.field71 = var2;
                }
            }
            if (class130.field1745 > var3) {
                class130.field1745 -= (class130.field1745 - var3) * class344.field5053 / 1000 + class37.field599;
                if (var3 > class130.field1745) {
                    class130.field1745 = var3;
                }
            }
            if (var2 < class7.field71) {
                class7.field71 -= (class7.field71 - var2) * class344.field5053 / 1000 + class37.field599;
                if (var2 > class7.field71) {
                    class7.field71 = var2;
                }
            }
        }
        int var4 = class235.field3309 * 128 + 64;
        int var5 = class387.field5781 * 128 + 64;
        int var6 = class139.method935(var4, 113, var5, class193.field2688) - class79.field1082;
        int var7 = var5 - class237.field3326;
        int var8 = var6 - class130.field1745;
        int var9 = var4 - class7.field71;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class265.field3878 < var11) {
            class265.field3878 += (var11 - class265.field3878 >> 3) * class100.field1358 / 1000 + class274.field4035 << 3;
            if (class265.field3878 > var11) {
                class265.field3878 = var11;
            }
        }
        if (arg0 != -2511) {
            field5207 = null;
        }
        if (class265.field3878 > var11) {
            class265.field3878 -= (class265.field3878 - var11 >> 3) * class100.field1358 / 1000 + class274.field4035 << 3;
            if (var11 > class265.field3878) {
                class265.field3878 = var11;
            }
        }
        int var13 = var12 - class179.field2364;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class179.field2364 += class100.field1358 * var14 / 1000 + class274.field4035 << 3;
            class179.field2364 &= 0x3FFF;
        }
        if (var14 < 0) {
            class179.field2364 -= -var14 * class100.field1358 / 1000 + class274.field4035 << 3;
            class179.field2364 &= 0x3FFF;
        }
        int var15 = var12 - class179.field2364;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class179.field2364 = var12;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lo;")
    public final class393 method2332(byte arg0) {
        field5206++;
        if (this.field5208 > 0 && this.field5211.field1876[this.field5208 - 1] != this.field5202) {
            class393 var2 = this.field5202;
            this.field5202 = var2.field5895;
            return var2;
        } else if (arg0 < 3) {
            return null;
        } else {
            while (this.field5208 < this.field5211.field1888) {
                class393 var3 = this.field5211.field1876[this.field5208++].field5895;
                if (this.field5211.field1876[this.field5208 - 1] != var3) {
                    this.field5202 = var3.field5895;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lo;")
    public final class393 method2333(int arg0) {
        this.field5208 = 0;
        field5205++;
        if (arg0 != 24056) {
            method2330(false, 80, (class159) null, false, (class159) null);
        }
        return this.method2332((byte) 90);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lsf;)V")
    public class355(class143 arg0) {
        this.field5211 = arg0;
    }
}
