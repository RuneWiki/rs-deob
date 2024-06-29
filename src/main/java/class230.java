import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class230 extends class32 {

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Lqk;")
    private class207 field4213 = class209.field3711;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Lqk;")
    public static class207 field4215 = class24.method212(255, ":trade:");

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field4226 = -1;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Z")
    public static boolean field4214 = true;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    private int field4220;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Ldk;")
    public class275 field4217;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "Ldk;")
    private class275 field4230;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Lpk;")
    public static class99 field4216;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqk;I)Z")
    public final boolean method1643(class207 arg0, int arg1) {
        field4233++;
        if (this.field4217 == null) {
            return false;
        }
        if (this.field4230 == null) {
            this.method1645(arg1 ^ 0xFFFFADC4);
        }
        class54 var3 = (class54) this.field4230.method1867(arg0.method1425(false), true);
        if (arg1 != -7505) {
            return true;
        }
        while (var3 != null) {
            if (var3.field1014.method1436(arg0, (byte) 47)) {
                return true;
            }
            var3 = (class54) this.field4230.method1869(255);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILv;)V")
    public final void method1644(int arg0, class149 arg1) {
        if (arg0 != 0) {
            this.method1652((byte) -101);
        }
        while (true) {
            int var3 = arg1.method1045((byte) 92);
            if (var3 == 0) {
                field4227++;
                return;
            }
            this.method1648(-4316, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    private final void method1645(int arg0) {
        field4234++;
        this.field4230 = new class275(this.field4217.method1876(-1));
        if (arg0 != 20331) {
            this.method1652((byte) 60);
        }
        for (class165 var2 = (class165) this.field4217.method1873((byte) -85); var2 != null; var2 = (class165) this.field4217.method1866((byte) -26)) {
            class54 var3 = new class54(var2.field2921, (int) var2.field3407);
            this.field4230.method1863((byte) 109, var3, var2.field2921.method1425(false));
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)Z")
    public final boolean method1646(int arg0, int arg1) {
        if (arg1 >= -80) {
            this.field4213 = null;
        }
        field4221++;
        if (this.field4217 == null) {
            return false;
        }
        if (this.field4230 == null) {
            this.method1652((byte) -64);
        }
        class178 var3 = (class178) this.field4230.method1867((long) arg0, true);
        return var3 != null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Lqk;")
    public final class207 method1647(int arg0, byte arg1) {
        field4222++;
        if (this.field4217 == null) {
            return this.field4213;
        }
        if (arg1 <= 18) {
            field4226 = -103;
        }
        class165 var3 = (class165) this.field4217.method1867((long) arg0, true);
        return var3 == null ? this.field4213 : var3.field2921;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILv;I)V")
    private final void method1648(int arg0, class149 arg1, int arg2) {
        field4229++;
        if (arg2 == 1) {
            this.field4228 = arg1.method1045((byte) 108);
        } else if (arg2 == 2) {
            this.field4231 = arg1.method1045((byte) -35);
        } else if (arg2 == 3) {
            this.field4213 = arg1.method1034(-27220);
        } else if (arg2 == 4) {
            this.field4220 = arg1.method1076(65280);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1050(1272006568);
            this.field4217 = new class275(class54.method408(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1076(arg0 ^ 0xFFFF1024);
                class194 var7;
                if (arg2 == 5) {
                    var7 = new class165(arg1.method1034(-27220));
                } else {
                    var7 = new class178(arg1.method1076(65280));
                }
                this.field4217.method1863((byte) -82, var7, (long) var6);
            }
        }
        if (arg0 != -4316) {
            this.field4228 = 127;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lbc;Z)V")
    public static final void method1649(class174 arg0, boolean arg1) {
        class243.field4416.method931(arg0, 120);
        while (true) {
            class174 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class174[][] var7;
            class174 var66;
            do {
                class174 var65;
                do {
                    class174 var64;
                    do {
                        class174 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class174) class243.field4416.method927(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3153);
                                            var3 = var2.field3146;
                                            var4 = var2.field3143;
                                            var5 = var2.field3132;
                                            var6 = var2.field3139;
                                            var7 = class82.field1498[var5];
                                            if (!var2.field3134) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class174 var8 = class82.field1498[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3153) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class157.field2787 && var3 > class279.field4892) {
                                                    class174 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3153 && (var9.field3134 || (var2.field3150 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class157.field2787 && var3 < class164.field2898 - 1) {
                                                    class174 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3153 && (var10.field3134 || (var2.field3150 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class73.field1348 && var4 > class141.field2442) {
                                                    class174 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3153 && (var11.field3134 || (var2.field3150 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class73.field1348 && var4 < class204.field3591 - 1) {
                                                    class174 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3153 && (var12.field3134 || (var2.field3150 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3134 = false;
                                            if (var2.field3131 != null) {
                                                class174 var13 = var2.field3131;
                                                if (var13.field3141 == null) {
                                                    if (var13.field3135 != null) {
                                                        if (class88.method642(0, var3, var4)) {
                                                            class278.method1888(var13.field3135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, true);
                                                        } else {
                                                            class278.method1888(var13.field3135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class88.method642(0, var3, var4)) {
                                                    class117.method833(var13.field3141, 0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, true);
                                                } else {
                                                    class117.method833(var13.field3141, 0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, false);
                                                }
                                                class209 var14 = var13.field3136;
                                                if (var14 != null) {
                                                    var14.field3704.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var14.field3709 - class207.field3676, var14.field3703 - class134.field2322, var14.field3698 - class59.field1084, var14.field3710, var5, (class64) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field3138; var15++) {
                                                    class288 var16 = var13.field3140[var15];
                                                    if (var16 != null) {
                                                        var16.field5136.method87(var16.field5135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var16.field5132 - class207.field3676, var16.field5151 - class134.field2322, var16.field5153 - class59.field1084, var16.field5129, var5, (class64) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3141 == null) {
                                                if (var2.field3135 != null) {
                                                    if (class88.method642(var6, var3, var4)) {
                                                        class278.method1888(var2.field3135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class278.method1888(var2.field3135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, false);
                                                    }
                                                }
                                            } else if (class88.method642(var6, var3, var4)) {
                                                class117.method833(var2.field3141, var6, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3141.field2250 != 12345678 || class15.field243 && var5 <= class105.field1860) {
                                                    class117.method833(var2.field3141, var6, class191.field3378, class13.field192, class176.field3176, class233.field4281, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class246 var18 = var2.field3152;
                                                if (var18 != null && (var18.field4464 & 0x80000000L) != 0L) {
                                                    var18.field4465.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var18.field4459 - class207.field3676, var18.field4454 - class134.field2322, var18.field4456 - class59.field1084, var18.field4464, var5, (class64) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class209 var21 = var2.field3136;
                                            class28 var22 = var2.field3142;
                                            if (var21 != null || var22 != null) {
                                                if (class157.field2787 == var3) {
                                                    var19++;
                                                } else if (class157.field2787 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class73.field1348 == var4) {
                                                    var19 += 3;
                                                } else if (class73.field1348 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class68.field1214[var19];
                                                var2.field3133 = class187.field3311[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3699 & class242.field4410[var19]) == 0) {
                                                    var2.field3137 = 0;
                                                } else if (var21.field3699 == 16) {
                                                    var2.field3137 = 3;
                                                    var2.field3148 = class196.field3449[var19];
                                                    var2.field3147 = 3 - var2.field3148;
                                                } else if (var21.field3699 == 32) {
                                                    var2.field3137 = 6;
                                                    var2.field3148 = class176.field3177[var19];
                                                    var2.field3147 = 6 - var2.field3148;
                                                } else if (var21.field3699 == 64) {
                                                    var2.field3137 = 12;
                                                    var2.field3148 = class144.field2486[var19];
                                                    var2.field3147 = 12 - var2.field3148;
                                                } else {
                                                    var2.field3137 = 9;
                                                    var2.field3148 = class69.field1241[var19];
                                                    var2.field3147 = 9 - var2.field3148;
                                                }
                                                if ((var21.field3699 & var20) != 0 && !class18.method111(var6, var3, var4, var21.field3699)) {
                                                    var21.field3704.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var21.field3709 - class207.field3676, var21.field3703 - class134.field2322, var21.field3698 - class59.field1084, var21.field3710, var5, (class64) null);
                                                }
                                                if ((var21.field3706 & var20) != 0 && !class18.method111(var6, var3, var4, var21.field3706)) {
                                                    var21.field3712.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var21.field3709 - class207.field3676, var21.field3703 - class134.field2322, var21.field3698 - class59.field1084, var21.field3710, var5, (class64) null);
                                                }
                                            }
                                            if (var22 != null && !class215.method1536(var6, var3, var4, var22.field564.method80())) {
                                                if ((var22.field570 & var20) != 0) {
                                                    var22.field564.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var22.field562 + var22.field561 - class207.field3676, var22.field567 - class134.field2322, var22.field566 + var22.field568 - class59.field1084, var22.field560, var5, (class64) null);
                                                } else if (var22.field570 == 256) {
                                                    int var23 = var22.field562 - class207.field3676;
                                                    int var24 = var22.field567 - class134.field2322;
                                                    int var25 = var22.field566 - class59.field1084;
                                                    int var26 = var22.field575;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field564.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var22.field561 + var23, var24, var22.field568 + var25, var22.field560, var5, (class64) null);
                                                    } else if (var22.field577 != null) {
                                                        var22.field577.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var23, var24, var25, var22.field560, var5, (class64) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class246 var29 = var2.field3152;
                                                if (var29 != null && (var29.field4464 & 0x80000000L) == 0L) {
                                                    var29.field4465.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var29.field4459 - class207.field3676, var29.field4454 - class134.field2322, var29.field4456 - class59.field1084, var29.field4464, var5, (class64) null);
                                                }
                                                class98 var30 = var2.field3145;
                                                if (var30 != null && var30.field1727 == 0) {
                                                    if (var30.field1731 != null) {
                                                        var30.field1731.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var30.field1726 - class207.field3676, var30.field1721 - class134.field2322, var30.field1735 - class59.field1084, var30.field1720, var5, (class64) null);
                                                    }
                                                    if (var30.field1722 != null) {
                                                        var30.field1722.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var30.field1726 - class207.field3676, var30.field1721 - class134.field2322, var30.field1735 - class59.field1084, var30.field1720, var5, (class64) null);
                                                    }
                                                    if (var30.field1736 != null) {
                                                        var30.field1736.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var30.field1726 - class207.field3676, var30.field1721 - class134.field2322, var30.field1735 - class59.field1084, var30.field1720, var5, (class64) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3150;
                                            if (var31 != 0) {
                                                if (var3 < class157.field2787 && (var31 & 0x4) != 0) {
                                                    class174 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3153) {
                                                        class243.field4416.method931(var32, 122);
                                                    }
                                                }
                                                if (var4 < class73.field1348 && (var31 & 0x2) != 0) {
                                                    class174 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3153) {
                                                        class243.field4416.method931(var33, 114);
                                                    }
                                                }
                                                if (var3 > class157.field2787 && (var31 & 0x1) != 0) {
                                                    class174 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3153) {
                                                        class243.field4416.method931(var34, 119);
                                                    }
                                                }
                                                if (var4 > class73.field1348 && (var31 & 0x8) != 0) {
                                                    class174 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3153) {
                                                        class243.field4416.method931(var35, 123);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3137 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3138; var37++) {
                                                if (class147.field2528 != var2.field3140[var37].field5137 && (var2.field3155[var37] & var2.field3137) == var2.field3148) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class209 var38 = var2.field3136;
                                                if (!class18.method111(var6, var3, var4, var38.field3699)) {
                                                    var38.field3704.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var38.field3709 - class207.field3676, var38.field3703 - class134.field2322, var38.field3698 - class59.field1084, var38.field3710, var5, (class64) null);
                                                }
                                                var2.field3137 = 0;
                                            }
                                        }
                                        if (!var2.field3144) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3138;
                                            var2.field3144 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class288 var42 = var2.field3140[var41];
                                                if (class147.field2528 != var42.field5137) {
                                                    for (int var43 = var42.field5150; var43 <= var42.field5146; var43++) {
                                                        for (int var44 = var42.field5140; var44 <= var42.field5142; var44++) {
                                                            class174 var45 = var7[var43][var44];
                                                            if (var45.field3134) {
                                                                var2.field3144 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3137 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field5150) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field5146) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field5140) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field5142) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3137) == var2.field3147) {
                                                                    var2.field3144 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class48.field947[var40++] = var42;
                                                    int var47 = class157.field2787 - var42.field5150;
                                                    int var48 = var42.field5146 - class157.field2787;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class73.field1348 - var42.field5140;
                                                    int var50 = var42.field5142 - class73.field1348;
                                                    if (var50 > var49) {
                                                        var42.field5141 = var47 + var50;
                                                    } else {
                                                        var42.field5141 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class288 var54 = class48.field947[var53];
                                                    if (class147.field2528 != var54.field5137) {
                                                        if (var54.field5141 > var51) {
                                                            var51 = var54.field5141;
                                                            var52 = var53;
                                                        } else if (var54.field5141 == var51) {
                                                            int var55 = var54.field5132 - class207.field3676;
                                                            int var56 = var54.field5153 - class59.field1084;
                                                            int var57 = class48.field947[var52].field5132 - class207.field3676;
                                                            int var58 = class48.field947[var52].field5153 - class59.field1084;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class288 var59 = class48.field947[var52];
                                                var59.field5137 = class147.field2528;
                                                if (!class5.method30(var6, var59.field5150, var59.field5146, var59.field5140, var59.field5142, var59.field5136.method80())) {
                                                    var59.field5136.method87(var59.field5135, class191.field3378, class13.field192, class176.field3176, class233.field4281, var59.field5132 - class207.field3676, var59.field5151 - class134.field2322, var59.field5153 - class59.field1084, var59.field5129, var5, (class64) null);
                                                }
                                                for (int var60 = var59.field5150; var60 <= var59.field5146; var60++) {
                                                    for (int var61 = var59.field5140; var61 <= var59.field5142; var61++) {
                                                        class174 var62 = var7[var60][var61];
                                                        if (var62.field3137 != 0) {
                                                            class243.field4416.method931(var62, 122);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3153) {
                                                            class243.field4416.method931(var62, 114);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3144) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3144 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3153);
                            } while (var2.field3137 != 0);
                            if (var3 > class157.field2787 || var3 <= class279.field4892) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3153);
                        if (var3 < class157.field2787 || var3 >= class164.field2898 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3153);
                    if (var4 > class73.field1348 || var4 <= class141.field2442) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3153);
                if (var4 < class73.field1348 || var4 >= class204.field3591 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3153);
            var2.field3153 = false;
            class246.field4467--;
            class98 var67 = var2.field3145;
            if (var67 != null && var67.field1727 != 0) {
                if (var67.field1731 != null) {
                    var67.field1731.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var67.field1726 - class207.field3676, var67.field1721 - class134.field2322 - var67.field1727, var67.field1735 - class59.field1084, var67.field1720, var5, (class64) null);
                }
                if (var67.field1722 != null) {
                    var67.field1722.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var67.field1726 - class207.field3676, var67.field1721 - class134.field2322 - var67.field1727, var67.field1735 - class59.field1084, var67.field1720, var5, (class64) null);
                }
                if (var67.field1736 != null) {
                    var67.field1736.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var67.field1726 - class207.field3676, var67.field1721 - class134.field2322 - var67.field1727, var67.field1735 - class59.field1084, var67.field1720, var5, (class64) null);
                }
            }
            if (var2.field3133 != 0) {
                class28 var68 = var2.field3142;
                if (var68 != null && !class215.method1536(var6, var3, var4, var68.field564.method80())) {
                    if ((var68.field570 & var2.field3133) != 0) {
                        var68.field564.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var68.field562 + var68.field561 - class207.field3676, var68.field567 - class134.field2322, var68.field566 + var68.field568 - class59.field1084, var68.field560, var5, (class64) null);
                    } else if (var68.field570 == 256) {
                        int var69 = var68.field562 - class207.field3676;
                        int var70 = var68.field567 - class134.field2322;
                        int var71 = var68.field566 - class59.field1084;
                        int var72 = var68.field575;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field564.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var68.field561 + var69, var70, var68.field568 + var71, var68.field560, var5, (class64) null);
                        } else if (var68.field577 != null) {
                            var68.field577.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var69, var70, var71, var68.field560, var5, (class64) null);
                        }
                    }
                }
                class209 var75 = var2.field3136;
                if (var75 != null) {
                    if ((var75.field3706 & var2.field3133) != 0 && !class18.method111(var6, var3, var4, var75.field3706)) {
                        var75.field3712.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var75.field3709 - class207.field3676, var75.field3703 - class134.field2322, var75.field3698 - class59.field1084, var75.field3710, var5, (class64) null);
                    }
                    if ((var75.field3699 & var2.field3133) != 0 && !class18.method111(var6, var3, var4, var75.field3699)) {
                        var75.field3704.method87(0, class191.field3378, class13.field192, class176.field3176, class233.field4281, var75.field3709 - class207.field3676, var75.field3703 - class134.field2322, var75.field3698 - class59.field1084, var75.field3710, var5, (class64) null);
                    }
                }
            }
            if (var5 < class100.field1801 - 1) {
                class174 var76 = class82.field1498[var5 + 1][var3][var4];
                if (var76 != null && var76.field3153) {
                    class243.field4416.method931(var76, 122);
                }
            }
            if (var3 < class157.field2787) {
                class174 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3153) {
                    class243.field4416.method931(var77, 127);
                }
            }
            if (var4 < class73.field1348) {
                class174 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3153) {
                    class243.field4416.method931(var78, 123);
                }
            }
            if (var3 > class157.field2787) {
                class174 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3153) {
                    class243.field4416.method931(var79, 117);
                }
            }
            if (var4 > class73.field1348) {
                class174 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3153) {
                    class243.field4416.method931(var80, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V")
    public static final void method1650(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class79 var5 = (class79) class78.field1415.method922((byte) 97); var5 != null; var5 = (class79) class78.field1415.method928(104)) {
            class81.method607(arg4, var5, arg0, arg1, arg3, (byte) -76);
        }
        field4225++;
        for (class79 var6 = (class79) class47.field942.method922((byte) 91); var6 != null; var6 = (class79) class47.field942.method928(arg2 ^ 0xFFFFFFA0)) {
            byte var11 = 1;
            class200 var12 = var6.field1432.method1947(arg2 ^ 0xFFFFFFD4);
            if (var6.field1432.field5039 == var12.field3539) {
                var11 = 0;
            } else if (var6.field1432.field5039 == var12.field3528 || var6.field1432.field5039 == var12.field3541 || var6.field1432.field5039 == var12.field3519 || var6.field1432.field5039 == var12.field3527) {
                var11 = 2;
            } else if (var6.field1432.field5039 == var12.field3531 || var6.field1432.field5039 == var12.field3545 || var6.field1432.field5039 == var12.field3536 || var6.field1432.field5039 == var12.field3540) {
                var11 = 3;
            }
            if (var6.field1437 != var11) {
                int var13 = class279.method1896((byte) -6, var6.field1432);
                if (var6.field1451 != var13) {
                    if (var6.field1438 != null) {
                        class65.field1177.method661(var6.field1438);
                        var6.field1438 = null;
                    }
                    var6.field1451 = var13;
                }
                var6.field1437 = var11;
            }
            var6.field1445 = var6.field1432.field5104;
            var6.field1435 = var6.field1432.field5104 + var6.field1432.method83(true) * 64;
            var6.field1450 = var6.field1432.field5072;
            var6.field1431 = var6.field1432.field5072 + (var6.field1432.method83(true) * 64);
            class81.method607(arg4, var6, arg0, arg1, arg3, (byte) -76);
        }
        for (class79 var7 = (class79) class175.field3168.method1873((byte) 88); var7 != null; var7 = (class79) class175.field3168.method1866((byte) -90)) {
            byte var8 = 1;
            class200 var9 = var7.field1448.method1947(9);
            if (var7.field1448.field5039 == var9.field3539) {
                var8 = 0;
            } else if (var7.field1448.field5039 == var9.field3528 || var7.field1448.field5039 == var9.field3541 || var7.field1448.field5039 == var9.field3519 || var7.field1448.field5039 == var9.field3527) {
                var8 = 2;
            } else if (var7.field1448.field5039 == var9.field3531 || var7.field1448.field5039 == var9.field3545 || var7.field1448.field5039 == var9.field3536 || var7.field1448.field5039 == var9.field3540) {
                var8 = 3;
            }
            if (var7.field1437 != var8) {
                int var10 = class275.method1871(-1, var7.field1448);
                if (var7.field1451 != var10) {
                    if (var7.field1438 != null) {
                        class65.field1177.method661(var7.field1438);
                        var7.field1438 = null;
                    }
                    var7.field1451 = var10;
                }
                var7.field1437 = var8;
            }
            var7.field1445 = var7.field1448.field5104;
            var7.field1435 = var7.field1448.field5104 + (var7.field1448.method83(true) * 64);
            var7.field1450 = var7.field1448.field5072;
            var7.field1431 = var7.field1448.field5072 + var7.field1448.method83(true) * 64;
            class81.method607(arg4, var7, arg0, arg1, arg3, (byte) -76);
        }
        if (arg2 != -35) {
            method1650(23, -67, (byte) -33, 47, -105);
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)I")
    public final int method1651(int arg0, int arg1) {
        field4232++;
        if (this.field4217 == null) {
            return this.field4220;
        }
        class178 var3 = (class178) this.field4217.method1867((long) arg1, true);
        if (arg0 < 12) {
            this.method1652((byte) -63);
        }
        return var3 == null ? this.field4220 : var3.field3212;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
    private final void method1652(byte arg0) {
        field4218++;
        if (arg0 != -64) {
            return;
        }
        this.field4230 = new class275(this.field4217.method1876(-1));
        for (class178 var2 = (class178) this.field4217.method1873((byte) -106); var2 != null; var2 = (class178) this.field4217.method1866((byte) -32)) {
            class178 var3 = new class178((int) var2.field3407);
            this.field4230.method1863((byte) -103, var3, (long) var2.field3212);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
    public static final void method1653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4223++;
        int var9 = arg5 + 1;
        class215.method1544(arg2, arg3, class15.field238[arg5], arg4, -11);
        int var8 = arg0 - 1;
        class215.method1544(arg2, arg3, class15.field238[arg0], arg4, arg1 + 87);
        if (arg1 != 1) {
            method1650(73, 84, (byte) -30, 50, -122);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class15.field238[var6];
            var7[arg2] = var7[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V")
    public static void method1654(byte arg0) {
        if (arg0 == 47) {
            field4215 = null;
            field4216 = null;
        }
    }
}
