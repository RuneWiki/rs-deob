import java.util.Random;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class108 extends class270 {

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    private int field1742 = 16;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    private int field1739 = 4096;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    private int field1755 = 0;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    private int field1754 = 0;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
    private int field1757 = 2000;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Lmh;")
    public static class62 field1741;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "[Lfd;")
    public static class61[] field1748;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 5)
    public static final void method830(int arg0) {
        field1743++;
        class309.method2102(-43);
        System.gc();
        if (arg0 != 1024) {
            method837(-62, 101, 39, false);
        }
        class276.method1889(-128, 25);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)V", line = 18)
    public static final void method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 27) {
            method834(31, (byte) -107, 0, 41, -47, 72, -34, -65);
        }
        if (arg4 <= class81.field1348 && arg3 >= class99.field1630) {
            boolean var6;
            if (arg0 < class176.field2819) {
                arg0 = class176.field2819;
                var6 = false;
            } else if (class52.field755 < arg0) {
                var6 = false;
                arg0 = class52.field755;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class176.field2819 > arg2) {
                arg2 = class176.field2819;
                var7 = false;
            } else if (arg2 <= class52.field755) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class52.field755;
            }
            if (arg4 >= class99.field1630) {
                class271.method1861(arg1, true, class282.field4817[arg4++], arg2, arg0);
            } else {
                arg4 = class99.field1630;
            }
            if (arg3 > class81.field1348) {
                arg3 = class81.field1348;
            } else {
                class271.method1861(arg1, true, class282.field4817[arg3--], arg2, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg3; var8++) {
                    int[] var9 = class282.field4817[var8];
                    var9[arg0] = var9[arg2] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg3; var11++) {
                    class282.field4817[var11][arg0] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg3; var10++) {
                    class282.field4817[var10][arg2] = arg1;
                }
            }
        }
        field1746++;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V", line = 124)
    public static final void method832(int arg0, int arg1, int arg2) {
        field1747++;
        if (class20.method95(true, arg2)) {
            class194.method1362(class275.field4713[arg2], true, arg0);
            if (arg1 != 0) {
                method838(30L, 67);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I", line = 139)
    public final int[] method6(int arg0, int arg1) {
        field1756++;
        if (arg0 != 18693) {
            field1741 = (class62) null;
        }
        int[] var3 = this.field4573.method919(arg1, arg0 ^ 0x2CDD);
        if (this.field4573.field1984) {
            int var4 = this.field1739 >> 1;
            int[][] var5 = this.field4573.method920(arg0 ^ 0xFFFFB68D);
            Random var6 = new Random((long) this.field1754);
            for (int var7 = 0; var7 < this.field1757; var7++) {
                int var8 = this.field1739 <= 0 ? this.field1755 : this.field1755 + class73.method525(this.field1739, var6, true) - var4;
                int var9 = class73.method525(class109.field1770, var6, true);
                int var10 = (var8 & 0xFFE) >> 4;
                int var11 = class73.method525(class266.field4496, var6, true);
                int var12 = var9 + (class63.field953[var10] * this.field1742 >> 12);
                int var13 = (class269.field4563[var10] * this.field1742 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var9 > var12) {
                        int var19 = var11;
                        int var20 = var9;
                        var9 = var12;
                        var11 = var13;
                        var13 = var19;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var9;
                    int var23 = var13 - var11;
                    int var24 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 1024 - (class73.method525(4096, var6, true) >> 2);
                    int var26 = -var22 / 2;
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var9; var28 < var12; var28++) {
                        var26 += var23;
                        int var29 = (var28 - var9) * var24 + var25 + 1024;
                        int var30 = class49.field717 & var28;
                        int var31 = class307.field5268 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var26 > 0) {
                            var26 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 274)
    public static final void method833(int arg0) {
        int var1 = 101 % ((arg0 - 26) / 46);
        class154.method1127();
        field1750++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class278.method1898(-75, class243.field4132);
        class301.method2061(-120, class243.field4132);
        if (class94.field1549 != null) {
            class94.field1549.method1264((byte) 84, class243.field4132);
        }
        class39.method269((byte) -10);
        class209.method1462(class243.field4132, (byte) -120);
        class74.method557((byte) 77, class243.field4132);
        if (class94.field1549 != null) {
            class94.field1549.method1263(65280, class243.field4132);
        }
        class148.method1072(-82);
        class154.method1117(class243.field4132, class97.field1596 * 2);
        class91.method683(29639);
        class294.method1998((byte) 118);
        class282.field4816 = 0L;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIIII)V", line = 315)
    public static final void method834(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class176.field2819 <= arg5 && class52.field755 >= arg3 && arg6 >= class99.field1630 && class81.field1348 >= arg2) {
            class16.method60(arg2, -116, arg6, arg0, arg4, arg5, arg7, arg3);
        } else {
            class39.method266(524287, arg5, arg0, arg4, arg7, arg3, arg6, arg2);
        }
        if (arg1 == -63) {
            field1744++;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 411)
    public class108() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(B)V", line = 355)
    public static void method835(byte arg0) {
        field1748 = null;
        if (arg0 == 18) {
            field1741 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(B)V", line = 372)
    public final void method231(byte arg0) {
        class96.method767((byte) -121);
        if (arg0 != 90) {
            method830(55);
        }
        field1751++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lsg;I)Lmh;", line = 387)
    public static final class62 method836(class191 arg0, int arg1) {
        field1745++;
        if (arg1 == class161.method1170(client.method2058(arg0), -21132)) {
            return null;
        } else if (arg0.field3082 == null || arg0.field3082.method440((byte) 59).method439(arg1 ^ 0xFFFFFFD8) == 0) {
            return class263.field4433 ? class137.field2225 : null;
        } else {
            return arg0.field3082;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZ)I", line = 415)
    public static final int method837(int arg0, int arg1, int arg2, boolean arg3) {
        field1753++;
        int var4 = arg1 & 0x3;
        if (arg3) {
            method834(120, (byte) 125, -67, -97, -53, 83, -105, -110);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lmi;II)V", line = 437)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -66 % ((-arg2 - 8) / 53);
        if (arg1 == 0) {
            this.field1754 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field1757 = arg0.method721(67);
        } else if (arg1 == 2) {
            this.field1742 = arg0.method702(-1);
        } else if (arg1 == 3) {
            this.field1755 = arg0.method721(106);
        } else if (arg1 == 4) {
            this.field1739 = arg0.method721(123);
        }
        field1740++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JI)V", line = 498)
    public static final void method838(long arg0, int arg1) {
        field1738++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class190.field3042 < 100 || class166.field2703 == 1) || class190.field3042 >= 200) {
            class116.method901(0, class275.field4694, class216.field3693, (byte) 70);
            return;
        }
        class62 var3 = class170.method1227(0, arg0).method419(arg1 + 28768);
        for (int var4 = 0; var4 < class190.field3042; var4++) {
            if (class64.field963[var4] == arg0) {
                class116.method901(0, class275.field4694, class254.method1772(new class62[] { var3, class136.field2216 }, 0), (byte) 72);
                return;
            }
        }
        for (int var5 = 0; var5 < class141.field2269; var5++) {
            if (class55.field808[var5] == arg0) {
                class116.method901(0, class275.field4694, class254.method1772(new class62[] { class240.field4097, var3, class230.field4001 }, 0), (byte) 113);
                return;
            }
        }
        if (var3.method446((byte) -100, class268.field4551.field2430)) {
            class116.method901(0, class275.field4694, class308.field5283, (byte) 60);
            return;
        }
        class294.field5022[class190.field3042] = var3;
        class64.field963[class190.field3042] = arg0;
        class124.field2050++;
        class26.field311[class190.field3042] = 0;
        class234.field4034[class190.field3042] = class275.field4694;
        class144.field2299[class190.field3042] = arg1;
        class203.field3430[class190.field3042] = false;
        class17.field153 = class105.field1716;
        class190.field3042++;
        class170.field2772.method1693(229, false);
        class170.field2772.method694(arg0, (byte) -34);
    }
}
