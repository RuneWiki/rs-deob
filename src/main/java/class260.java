import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class260 extends class254 {

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[J")
    public static long[] field3927 = new long[32];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3926 = "Close";

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method1738(byte arg0) {
        if (arg0 > -58) {
            method1740(15);
        }
        class48.field682.method257(false);
        class28.field407.method257(false);
        class190.field2691.method257(false);
        field3935++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V")
    public static final void method1739(long arg0, byte arg1) {
        if (arg1 != -86) {
            return;
        }
        field3932++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class55.field836; var3++) {
            if (class95.field1452[var3] == arg0) {
                class231.field3454++;
                class55.field836--;
                for (int var4 = var3; var4 < class55.field836; var4++) {
                    class70.field1089[var4] = class70.field1089[var4 + 1];
                    class95.field1439[var4] = class95.field1439[var4 + 1];
                    class79.field1222[var4] = class79.field1222[var4 + 1];
                    class95.field1452[var4] = class95.field1452[var4 + 1];
                    class35.field498[var4] = class35.field498[var4 + 1];
                    class152.field2194[var4] = class152.field2194[var4 + 1];
                }
                class113.field1611 = class213.field3063;
                class95.field1451.method522(92, 28727);
                class95.field1451.method765(arg1 ^ 0xE044330A, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public static void method1740(int arg0) {
        if (arg0 != 32767) {
            method1741(-120, (class53) null);
        }
        field3926 = null;
        field3927 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
    public class260(int arg0, int arg1) {
        this.field3930 = arg0;
        this.field3931 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILde;)V")
    public static final void method1741(int arg0, class53 arg1) {
        if (arg0 <= 126) {
            field3926 = null;
        }
        class30 var2 = (class30) class124.field1801.method1218(class109.method712((byte) 84, arg1.field766), 122);
        if (var2 != null) {
            if (var2.field438 != null) {
                class152.field2201.method279(var2.field438);
                var2.field438 = null;
            }
            var2.method1706(-64);
        }
        field3928++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvi;I)V")
    public static final void method1742(class5 arg0, int arg1) {
        field3934++;
        if (arg0.field66 == 0) {
            return;
        }
        class35 var2 = arg0.method73((byte) -44);
        if (arg0.field97 != -1 && arg0.field97 < 32768) {
            class72 var3 = class82.field1268[arg0.field97];
            if (var3 != null) {
                int var4 = arg0.field45 - var3.field45;
                int var5 = arg0.field94 - var3.field94;
                if (var4 != 0 || var5 != 0) {
                    arg0.field127 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field97 >= 32768) {
            int var6 = arg0.field97 - 32768;
            if (class73.field1133 == var6) {
                var6 = 2047;
            }
            class53 var7 = class194.field2777[var6];
            if (var7 != null) {
                int var8 = arg0.field45 - var7.field45;
                int var9 = arg0.field94 - var7.field94;
                if (var8 != 0 || var9 != 0) {
                    arg0.field127 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field95 != 0 || arg0.field51 != 0) && (arg0.field84 == 0 || arg0.field124 > 0)) {
            int var10 = arg0.field94 - ((arg0.field51 - class95.field1445 - class95.field1445) * 64);
            int var11 = arg0.field45 - ((arg0.field95 - (class113.field1615 + class113.field1615)) * 64);
            if (var11 != 0 || var10 != 0) {
                arg0.field127 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field51 = 0;
            arg0.field95 = 0;
        }
        if (arg1 != 1024) {
            method1739(-57L, (byte) 111);
        }
        int var12 = arg0.field127 - arg0.field104 & 0x7FF;
        if (var12 == 0) {
            arg0.field118 = 0;
            arg0.field102 = 0;
        } else if (var2.field517 == 0) {
            arg0.field118++;
            if (var12 <= 1024) {
                boolean var20 = true;
                arg0.field104 += arg0.field66;
                if (arg0.field66 > var12 || (2048 - arg0.field66) < var12) {
                    var20 = false;
                    arg0.field104 = arg0.field127;
                }
                if (arg0.field112 == var2.field531 && (arg0.field118 > 25 || var20)) {
                    if (var2.field501 == -1) {
                        arg0.field112 = var2.field519;
                    } else {
                        arg0.field112 = var2.field501;
                    }
                }
            } else {
                arg0.field104 -= arg0.field66;
                boolean var21 = true;
                if (arg0.field66 > var12 || (2048 - arg0.field66) < var12) {
                    var21 = false;
                    arg0.field104 = arg0.field127;
                }
                if (arg0.field112 == var2.field531 && (arg0.field118 > 25 || var21)) {
                    if (var2.field502 == -1) {
                        arg0.field112 = var2.field519;
                    } else {
                        arg0.field112 = var2.field502;
                    }
                }
            }
            arg0.field104 &= 0x7FF;
        } else {
            if (arg0.field112 == var2.field531 && arg0.field118 > 25) {
                if (var2.field501 == -1) {
                    arg0.field112 = var2.field519;
                } else {
                    arg0.field112 = var2.field501;
                }
            }
            int var13 = arg0.field127 << 5;
            if (arg0.field74 != var13) {
                arg0.field74 = var13;
                int var14 = var13 - arg0.field117 & 0xFFFF;
                arg0.field109 = 0;
                int var15 = arg0.field102 * arg0.field102 / (var2.field517 * 2);
                if (arg0.field102 > 0 && var14 >= var15 && var14 - var15 < 32768) {
                    arg0.field52 = var14 / 2;
                    int var16 = var2.field514 * var2.field514 / (var2.field517 * 2);
                    arg0.field100 = true;
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (var16 < arg0.field52) {
                        arg0.field52 = var14 - var16;
                    }
                } else if (arg0.field102 < 0 && 65536 - var14 >= var15 && (65536 - var14 - var15) < 32768) {
                    arg0.field52 = (65536 - var14) / 2;
                    arg0.field100 = true;
                    int var17 = var2.field514 * var2.field514 / (var2.field517 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (var17 < arg0.field52) {
                        arg0.field52 = 65536 - var17 - var14;
                    }
                } else {
                    arg0.field100 = false;
                }
            }
            if (arg0.field102 == 0) {
                int var18 = arg0.field74 - arg0.field117 & 0xFFFF;
                if (var18 < var2.field517) {
                    arg0.field117 = arg0.field74;
                } else {
                    int var19 = var2.field514 * var2.field514 / (var2.field517 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 >= 32768) {
                        arg0.field102 = -var2.field517;
                        arg0.field52 = (65536 - var18) / 2;
                        if (arg0.field52 > var19) {
                            arg0.field52 = 65536 - var19 - var18;
                        }
                    } else {
                        arg0.field102 = var2.field517;
                        arg0.field52 = var18 / 2;
                        if (var19 < arg0.field52) {
                            arg0.field52 = var18 - var19;
                        }
                    }
                    arg0.field109 = 0;
                    arg0.field100 = true;
                }
            } else if (arg0.field102 <= 0) {
                if (arg0.field52 <= arg0.field109) {
                    arg0.field100 = false;
                }
                if (!arg0.field100) {
                    arg0.field102 += var2.field517;
                    if (arg0.field102 > 0) {
                        arg0.field102 = 0;
                    }
                } else if (arg0.field102 > -var2.field514) {
                    arg0.field102 -= var2.field517;
                }
            } else {
                if (arg0.field109 >= arg0.field52) {
                    arg0.field100 = false;
                }
                if (!arg0.field100) {
                    arg0.field102 -= var2.field517;
                    if (arg0.field102 < 0) {
                        arg0.field102 = 0;
                    }
                } else if (arg0.field102 < var2.field514) {
                    arg0.field102 += var2.field517;
                }
            }
            if (arg0.field102 <= 0) {
                arg0.field109 -= arg0.field102;
            } else {
                arg0.field109 += arg0.field102;
            }
            arg0.field117 += arg0.field102;
            arg0.field117 &= 0xFFFF;
            arg0.field104 = arg0.field117 >> 5;
        }
    }
}
