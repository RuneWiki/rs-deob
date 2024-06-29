import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 extends class69 {

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lmb;")
    public static class160 field1434 = new class160();

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lnh;")
    public static class54 field1438 = new class54(50);

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lcf;")
    public static class93 field1440 = class147.method1066("Bitte warten Sie)3)3)3", -48);

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lnh;")
    public static class54 field1443 = new class54(64);

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Lwh;")
    public static final class193 method535(int arg0) {
        ++field1433;
        class173 var1 = new class173(class153.field2693, class226.field4044, class169.field2974[arg0], class67.field1230[0], class246.field4435[0], class42.field663[0], class255.field4614[0], class248.field4475);
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(III)V")
    public final void method470(int arg0, int arg1, int arg2) {
        ++field1439;
        int var4 = this.field1436 * arg0 >> 12;
        int var5 = this.field1430 * arg0 >> 12;
        if (arg2 != 8) {
            this.field1430 = 1;
        }
        int var6 = this.field1431 * arg1 >> 12;
        int var7 = this.field1435 * arg1 >> 12;
        class49.method271(super.field1253, var6, var5, arg2 + -9, var7, var4);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        ++field1444;
        if (arg1 >= -64) {
            field1434 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public static final void method536(int arg0) {
        ++field1429;
        if (class213.method1503(arg0 ^ -10976) == 2) {
            byte var1 = (byte) (255 & class278.field4975 + -4);
            int var2 = class278.field4975 % 104;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; ~var16 > -105; ++var16) {
                    class42.field659[var3][var2][var16] = var1;
                }
            }
            if (~class138.field2405 != -4) {
                int var4 = 0;
                if (arg0 == -10918) {
                    while (var4 < 2) {
                        class144.field2498[var4] = -1000000;
                        class69.field1249[var4] = 1000000;
                        class124.field2212[var4] = 0;
                        class144.field2496[var4] = 1000000;
                        class268.field4787[var4] = 0;
                        ++var4;
                    }
                    if (class18.field234 == 1) {
                        if ((class4.field53[class138.field2405][class166.field2927.field3868 >> 7][class166.field2927.field3784 >> 7] & 4) != 0) {
                            class266.method1777(0, 3931, class166.field2927.field3784 >> 7, class166.field2927.field3868 >> 7, class232.field4138, false);
                        }
                        if (class198.field3602 < 310) {
                            int var5 = class165.field2919 >> 7;
                            int var6 = class166.field2925 >> 7;
                            int var7 = class166.field2927.field3868 >> 7;
                            int var8 = class166.field2927.field3784 >> 7;
                            int var9;
                            if (~var5 <= ~var8) {
                                var9 = -var8 + var5;
                            } else {
                                var9 = var8 - var5;
                            }
                            int var10;
                            if (~var6 > ~var7) {
                                var10 = -var6 + var7;
                            } else {
                                var10 = -var7 + var6;
                            }
                            if (~var9 <= ~var10) {
                                int var11 = 32768;
                                int var12 = var10 * 65536 / var9;
                                while (var5 != var8) {
                                    if (var8 > var5) {
                                        ++var5;
                                    } else if (~var5 < ~var8) {
                                        --var5;
                                    }
                                    if ((class4.field53[class138.field2405][var6][var5] & 4) != 0) {
                                        class266.method1777(1, 3931, var5, var6, class232.field4138, false);
                                        return;
                                    }
                                    var11 += var12;
                                    if (~var11 <= -65537) {
                                        if (~var7 < ~var6) {
                                            ++var6;
                                        } else if (var7 < var6) {
                                            --var6;
                                        }
                                        var11 -= 65536;
                                        if ((4 & class4.field53[class138.field2405][var6][var5]) != 0) {
                                            class266.method1777(1, 3931, var5, var6, class232.field4138, false);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var9 * 65536 / var10;
                            int var14 = 32768;
                            while (var6 != var7) {
                                if (var6 < var7) {
                                    ++var6;
                                } else if (var7 < var6) {
                                    --var6;
                                }
                                if ((4 & class4.field53[class138.field2405][var6][var5]) != 0) {
                                    class266.method1777(1, arg0 ^ -9727, var5, var6, class232.field4138, false);
                                    return;
                                }
                                var14 += var13;
                                if (var14 >= 65536) {
                                    var14 -= 65536;
                                    if (var5 >= var8) {
                                        if (var5 > var8) {
                                            --var5;
                                        }
                                    } else {
                                        ++var5;
                                    }
                                    if ((class4.field53[class138.field2405][var6][var5] & 4) != 0) {
                                        class266.method1777(1, arg0 + 14849, var5, var6, class232.field4138, false);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        int var15 = class13.method56(class165.field2919, class166.field2925, (byte) 73, class138.field2405);
                        if (~(-field1442 + var15) <= -801 || (class4.field53[class138.field2405][class166.field2925 >> 7][class165.field2919 >> 7] & 4) == 0) {
                            return;
                        }
                        class266.method1777(1, 3931, class165.field2919 >> 7, class166.field2925 >> 7, class232.field4138, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)V")
    public final void method467(byte arg0, int arg1, int arg2) {
        ++field1432;
        int var4 = -39 % ((arg0 - 15) / 49);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIII)V")
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1430 = arg2;
        this.field1431 = arg3;
        this.field1436 = arg0;
        this.field1435 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1440 = null;
        if (arg0 != 0) {
            field1441 = -52;
        }
        field1434 = null;
        field1443 = null;
        field1438 = null;
    }
}
