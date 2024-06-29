import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class199 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lp;")
    public static class280 field3481 = class18.method140((byte) -124, " <col=ffff00>");

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lp;")
    public static class280 field3493 = class18.method140((byte) -123, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ltg;")
    public static class180 field3485;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Ltg;")
    public static class180 field3492;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[Lti;")
    public static class5[] field3487;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JIII)Z")
    public static final boolean method1364(long arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 32) {
            method1365((byte) 88);
        }
        field3480++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x3F6E21) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class130 var8 = class32.method277((byte) -111, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field2265;
                var10 = var8.field2277;
            } else {
                var9 = var8.field2277;
                var10 = var8.field2265;
            }
            int var11 = var8.field2292;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class49.method362(2, arg2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], var9, arg1, var10, true, 0, var11);
        } else {
            class49.method362(2, arg2, 2, var5 + 1, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, arg1, 0, true, var6, 0);
        }
        class22.field401 = class187.field3268;
        class60.field964 = class98.field1572;
        class34.field632 = 0;
        class97.field1563 = 2;
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method1365(byte arg0) {
        field3484++;
        class21.field383 = new class90();
        int var1 = -91 / ((arg0 + 30) / 41);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lp;")
    public static final class280 method1366(int arg0, int arg1) {
        field3489++;
        return ~class258.field4566[arg0].method1889(-1) >= arg1 ? class197.field3441[arg0] : class30.method266(new class280[] { class197.field3441[arg0], class158.field2760, class258.field4566[arg0] }, (byte) -87);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field3487 = null;
        field3493 = null;
        field3485 = null;
        field3492 = null;
        if (arg0 <= 79) {
            field3483 = 0;
        }
        field3481 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Lpe;")
    public static final class241 method1368(int arg0, int arg1) {
        if (arg0 != -940) {
            return null;
        }
        class241 var2 = (class241) class237.field4119.method1480((byte) 50, (long) arg1);
        field3482++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2196.method1258(class219.method1460(100, arg1), class13.method110(arg1, -105), (byte) 124);
        class241 var4 = new class241();
        var4.field4205 = arg1;
        if (var3 != null) {
            var4.method1638(new class25(var3), -1);
        }
        class237.field4119.method1483((byte) -127, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILrf;)V")
    public static final void method1369(int arg0, class277 arg1) {
        arg1.field4836 = false;
        if (arg1.field4803 != -1) {
            class78 var2 = class207.method1401((byte) -22, arg1.field4803);
            if (var2 == null || var2.field1275 == null) {
                arg1.field4803 = -1;
            } else {
                arg1.field4815++;
                if (var2.field1275.length > arg1.field4825 && arg1.field4815 > var2.field1268[arg1.field4825]) {
                    arg1.field4825++;
                    arg1.field4815 = 1;
                    class150.method1034(arg1.field4793, false, var2, arg1.field4825, arg1.field4791, class262.field4631 == arg1);
                }
                if (var2.field1275.length <= arg1.field4825) {
                    arg1.field4825 = 0;
                    arg1.field4815 = 0;
                    class150.method1034(arg1.field4793, false, var2, arg1.field4825, arg1.field4791, class262.field4631 == arg1);
                }
            }
        }
        if (arg1.field4827 != -1 && class117.field2104 >= arg1.field4800) {
            int var3 = method1368(-940, arg1.field4827).field4210;
            if (var3 == -1) {
                arg1.field4827 = -1;
            } else {
                class78 var4 = class207.method1401((byte) -22, var3);
                if (var4 == null || var4.field1275 == null) {
                    arg1.field4827 = -1;
                } else {
                    if (arg1.field4857 < 0) {
                        arg1.field4857 = 0;
                        class150.method1034(arg1.field4793, false, var4, 0, arg1.field4791, class262.field4631 == arg1);
                    }
                    arg1.field4790++;
                    if (var4.field1275.length > arg1.field4857 && var4.field1268[arg1.field4857] < arg1.field4790) {
                        arg1.field4857++;
                        arg1.field4790 = 1;
                        class150.method1034(arg1.field4793, false, var4, arg1.field4857, arg1.field4791, class262.field4631 == arg1);
                    }
                    if (var4.field1275.length <= arg1.field4857) {
                        arg1.field4827 = -1;
                    }
                }
            }
        }
        field3490++;
        if (arg1.field4853 != -1 && arg1.field4821 <= 1) {
            class78 var5 = class207.method1401((byte) -22, arg1.field4853);
            if (var5.field1291 == 1 && arg1.field4864 > 0 && arg1.field4826 <= class117.field2104 && class117.field2104 > arg1.field4852) {
                arg1.field4821 = 1;
                return;
            }
        }
        if (arg1.field4853 != -1 && arg1.field4821 == 0) {
            class78 var6 = class207.method1401((byte) -22, arg1.field4853);
            if (var6 == null || var6.field1275 == null) {
                arg1.field4853 = -1;
            } else {
                arg1.field4861++;
                if (arg1.field4830 < var6.field1275.length && arg1.field4861 > var6.field1268[arg1.field4830]) {
                    arg1.field4830++;
                    arg1.field4861 = 1;
                    class150.method1034(arg1.field4793, false, var6, arg1.field4830, arg1.field4791, class262.field4631 == arg1);
                }
                if (arg1.field4830 >= var6.field1275.length) {
                    arg1.field4830 -= var6.field1285;
                    arg1.field4801++;
                    if (arg1.field4801 >= var6.field1280) {
                        arg1.field4853 = -1;
                    } else if (arg1.field4830 >= 0 && var6.field1275.length > arg1.field4830) {
                        class150.method1034(arg1.field4793, false, var6, arg1.field4830, arg1.field4791, class262.field4631 == arg1);
                    } else {
                        arg1.field4853 = -1;
                    }
                }
                arg1.field4836 = var6.field1261;
            }
        }
        if (arg0 != -1954) {
            field3493 = null;
        }
        if (arg1.field4821 > 0) {
            arg1.field4821--;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lp;ZI)V")
    public static final void method1370(class280 arg0, boolean arg1, int arg2) {
        if (arg2 != -1) {
            method1371(32, (class178) null);
        }
        field3486++;
        if (arg1) {
            try {
                class130.field2303.getAppletContext().showDocument(arg0.method1873(class130.field2303.getCodeBase(), (byte) 28), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class130.field2303.getAppletContext().showDocument(arg0.method1873(class130.field2303.getCodeBase(), (byte) 28), "_top");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILk;)V")
    public static final void method1371(int arg0, class178 arg1) {
        class73.method545(arg0, -5310, arg1);
        field3488++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIZIII)V")
    public static final void method1372(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 1) {
            method1369(-70, (class277) null);
        }
        field3491++;
        if (arg5 <= arg0) {
            return;
        }
        int var7 = (arg0 + arg5) / 2;
        int var8 = arg0;
        class2 var9 = class96.field1534[var7];
        class96.field1534[var7] = class96.field1534[arg5];
        class96.field1534[arg5] = var9;
        for (int var10 = arg0; var10 < arg5; var10++) {
            if (class191.method1325(arg3, -1, arg2, class96.field1534[var10], arg6, arg1, var9) <= 0) {
                class2 var11 = class96.field1534[var10];
                class96.field1534[var10] = class96.field1534[var8];
                class96.field1534[var8++] = var11;
            }
        }
        class96.field1534[arg5] = class96.field1534[var8];
        class96.field1534[var8] = var9;
        method1372(arg0, arg1, arg2, arg3, 1, var8 - 1, arg6);
        method1372(var8 + 1, arg1, arg2, arg3, 1, arg5, arg6);
    }
}
