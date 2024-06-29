import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class96 extends class188 {

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lji;")
    public static class121 field1316 = null;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "B")
    public byte field1315;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lti;")
    public static class248 field1317;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/lang/String;")
    public String field1318;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Ljava/lang/String;")
    public String field1321;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILgi;)V", line = 9)
    public static final void method624(int arg0, class242 arg1) {
        arg1.field3728 = false;
        field1319++;
        if (arg1.field3778 != -1) {
            class111 var2 = class289.method2067((byte) -21, arg1.field3778);
            if (var2 == null || var2.field1533 == null) {
                arg1.field3778 = -1;
            } else {
                arg1.field3748++;
                if (var2.field1533.length > arg1.field3715 && arg1.field3748 > var2.field1524[arg1.field3715]) {
                    arg1.field3710++;
                    arg1.field3715++;
                    arg1.field3748 = 1;
                    class313.method2210(var2, arg1.field3715, arg0 + 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                }
                if (arg1.field3715 >= var2.field1533.length) {
                    arg1.field3715 = 0;
                    arg1.field3748 = 0;
                    class313.method2210(var2, arg1.field3715, arg0 + 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                }
                arg1.field3710 = arg1.field3715 + 1;
                if (var2.field1533.length <= arg1.field3710) {
                    arg1.field3710 = 0;
                }
            }
        }
        if (~arg1.field3703 != arg0 && class102.field1381 >= arg1.field3736) {
            class314 var3 = class255.method1803(arg1.field3703, (byte) -51);
            int var4 = var3.field4919;
            if (var4 == -1) {
                arg1.field3703 = -1;
            } else {
                label310: {
                    class111 var5 = class289.method2067((byte) -101, var4);
                    if (var3.field4934) {
                        if (var5.field1550 == 3) {
                            if (arg1.field3802 > 0 && arg1.field3773 <= class102.field1381 && class102.field1381 > arg1.field3780) {
                                arg1.field3703 = -1;
                                break label310;
                            }
                        } else if (var5.field1550 == 1 && arg1.field3802 > 0 && arg1.field3773 <= class102.field1381 && arg1.field3780 < class102.field1381) {
                            arg1.field3736 = class102.field1381 + 1;
                            break label310;
                        }
                    }
                    if (var5 == null || var5.field1533 == null) {
                        arg1.field3703 = -1;
                    } else {
                        if (arg1.field3803 < 0) {
                            arg1.field3803 = 0;
                            class313.method2210(var5, 0, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                        }
                        arg1.field3752++;
                        if (arg1.field3803 < var5.field1533.length && var5.field1524[arg1.field3803] < arg1.field3752) {
                            arg1.field3803++;
                            arg1.field3752 = 1;
                            class313.method2210(var5, arg1.field3803, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                        }
                        if (var5.field1533.length <= arg1.field3803) {
                            if (var3.field4934) {
                                arg1.field3803 -= var5.field1552;
                                arg1.field3776++;
                                if (var5.field1535 <= arg1.field3776) {
                                    arg1.field3703 = -1;
                                } else if (arg1.field3803 >= 0 && var5.field1533.length > arg1.field3803) {
                                    class313.method2210(var5, arg1.field3803, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                                } else {
                                    arg1.field3703 = -1;
                                }
                            } else {
                                arg1.field3703 = -1;
                            }
                        }
                        arg1.field3791 = arg1.field3803 + 1;
                        if (arg1.field3791 >= var5.field1533.length) {
                            if (var3.field4934) {
                                arg1.field3791 -= var5.field1552;
                                if (var5.field1535 <= arg1.field3776 + 1) {
                                    arg1.field3791 = -1;
                                } else if (arg1.field3791 < 0 || arg1.field3791 >= var5.field1533.length) {
                                    arg1.field3791 = -1;
                                }
                            } else {
                                arg1.field3791 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3807 != -1 && arg1.field3796 <= 1) {
            class111 var6 = class289.method2067((byte) -78, arg1.field3807);
            if (var6.field1550 == 3) {
                if (arg1.field3802 > 0 && arg1.field3773 <= class102.field1381 && arg1.field3780 < class102.field1381) {
                    arg1.field3807 = -1;
                }
            } else if (var6.field1550 == 1 && arg1.field3802 > 0 && arg1.field3773 <= class102.field1381 && class102.field1381 > arg1.field3780) {
                arg1.field3796 = 2;
            }
        }
        if (arg1.field3807 != -1 && arg1.field3796 == 0) {
            class111 var7 = class289.method2067((byte) -122, arg1.field3807);
            if (var7 == null || var7.field1533 == null) {
                arg1.field3807 = -1;
            } else {
                arg1.field3740++;
                if (var7.field1533.length > arg1.field3738 && arg1.field3740 > var7.field1524[arg1.field3738]) {
                    arg1.field3740 = 1;
                    arg1.field3738++;
                    class313.method2210(var7, arg1.field3738, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                }
                if (var7.field1533.length <= arg1.field3738) {
                    arg1.field3738 -= var7.field1552;
                    arg1.field3739++;
                    if (arg1.field3739 >= var7.field1535) {
                        arg1.field3807 = -1;
                    } else if (arg1.field3738 >= 0 && arg1.field3738 < var7.field1533.length) {
                        class313.method2210(var7, arg1.field3738, arg0 ^ 0x32, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                    } else {
                        arg1.field3807 = -1;
                    }
                }
                arg1.field3717 = arg1.field3738 + 1;
                if (arg1.field3717 >= var7.field1533.length) {
                    arg1.field3717 -= var7.field1552;
                    if (arg1.field3739 + 1 >= var7.field1535) {
                        arg1.field3717 = -1;
                    } else if (arg1.field3717 < 0 || var7.field1533.length <= arg1.field3717) {
                        arg1.field3717 = -1;
                    }
                }
                arg1.field3728 = var7.field1541;
            }
        }
        if (arg1.field3796 > 0) {
            arg1.field3796--;
        }
        for (int var8 = 0; var8 < arg1.field3769.length; var8++) {
            class69 var9 = arg1.field3769[var8];
            if (var9 != null) {
                if (var9.field854 > 0) {
                    var9.field854--;
                } else {
                    class111 var10 = class289.method2067((byte) -97, var9.field867);
                    if (var10 == null || var10.field1533 == null) {
                        arg1.field3769[var8] = null;
                    } else {
                        var9.field858++;
                        if (var9.field862 < var10.field1533.length && var9.field858 > var10.field1524[var9.field862]) {
                            var9.field858 = 1;
                            var9.field862++;
                            class313.method2210(var10, var9.field862, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                        }
                        if (var9.field862 >= var10.field1533.length) {
                            var9.field862 -= var10.field1552;
                            var9.field855++;
                            if (var9.field855 >= var10.field1535) {
                                arg1.field3769[var8] = null;
                            } else if (var9.field862 >= 0 && var10.field1533.length > var9.field862) {
                                class313.method2210(var10, var9.field862, arg0 ^ 0x32, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                            } else {
                                arg1.field3769[var8] = null;
                            }
                        }
                        var9.field864 = var9.field862 + 1;
                        if (var10.field1533.length <= var9.field864) {
                            var9.field864 -= var10.field1552;
                            if (var9.field855 + 1 >= var10.field1535) {
                                var9.field864 = -1;
                            } else if (var9.field864 < 0 || var10.field1533.length <= var9.field864) {
                                var9.field864 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 314)
    public static void method625(boolean arg0) {
        if (!arg0) {
            field1316 = (class121) null;
        }
        field1316 = null;
        field1317 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 329)
    public static final void method626() {
        class326.field5223 = 0;
        label194: for (int var0 = 0; var0 < class135.field2026; var0++) {
            class85 var1 = class123.field1700[var0];
            if (class49.field565 != null) {
                for (int var2 = 0; var2 < class49.field565.length; var2++) {
                    if (class49.field565[var2] != -1000000 && (var1.field1122 <= class49.field565[var2] || var1.field1119 <= class49.field565[var2]) && (var1.field1112 <= class100.field1346[var2] || var1.field1107 <= class100.field1346[var2]) && (var1.field1112 >= class73.field911[var2] || var1.field1107 >= class73.field911[var2]) && (var1.field1111 <= class289.field4555[var2] || var1.field1123 <= class289.field4555[var2]) && (var1.field1111 >= class255.field4038[var2] || var1.field1123 >= class255.field4038[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1127 == 1) {
                int var3 = var1.field1108 + class2.field26 - class282.field4461;
                if (var3 >= 0 && var3 <= class2.field26 + class2.field26) {
                    int var4 = var1.field1109 + class2.field26 - class55.field652;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1121 + class2.field26 - class55.field652;
                    if (var5 > class2.field26 + class2.field26) {
                        var5 = class2.field26 + class2.field26;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class262.field4145[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class245.field3859 - var1.field1112;
                        if (var7 > 32) {
                            var1.field1113 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1113 = 2;
                            var7 = -var7;
                        }
                        var1.field1126 = (var1.field1111 - class42.field457 << 8) / var7;
                        var1.field1116 = (var1.field1123 - class42.field457 << 8) / var7;
                        var1.field1105 = (var1.field1122 - class36.field415 << 8) / var7;
                        var1.field1125 = (var1.field1119 - class36.field415 << 8) / var7;
                        class85.field1102[class326.field5223++] = var1;
                    }
                }
            } else if (var1.field1127 == 2) {
                int var8 = var1.field1109 + class2.field26 - class55.field652;
                if (var8 >= 0 && var8 <= class2.field26 + class2.field26) {
                    int var9 = var1.field1108 + class2.field26 - class282.field4461;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1118 + class2.field26 - class282.field4461;
                    if (var10 > class2.field26 + class2.field26) {
                        var10 = class2.field26 + class2.field26;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class262.field4145[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class42.field457 - var1.field1111;
                        if (var12 > 32) {
                            var1.field1113 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1113 = 4;
                            var12 = -var12;
                        }
                        var1.field1114 = (var1.field1112 - class245.field3859 << 8) / var12;
                        var1.field1104 = (var1.field1107 - class245.field3859 << 8) / var12;
                        var1.field1105 = (var1.field1122 - class36.field415 << 8) / var12;
                        var1.field1125 = (var1.field1119 - class36.field415 << 8) / var12;
                        class85.field1102[class326.field5223++] = var1;
                    }
                }
            } else if (var1.field1127 == 4) {
                int var13 = var1.field1122 - class36.field415;
                if (var13 > 128) {
                    int var14 = var1.field1109 + class2.field26 - class55.field652;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1121 + class2.field26 - class55.field652;
                    if (var15 > class2.field26 + class2.field26) {
                        var15 = class2.field26 + class2.field26;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1108 + class2.field26 - class282.field4461;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1118 + class2.field26 - class282.field4461;
                        if (var17 > class2.field26 + class2.field26) {
                            var17 = class2.field26 + class2.field26;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class262.field4145[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1113 = 5;
                            var1.field1114 = (var1.field1112 - class245.field3859 << 8) / var13;
                            var1.field1104 = (var1.field1107 - class245.field3859 << 8) / var13;
                            var1.field1126 = (var1.field1111 - class42.field457 << 8) / var13;
                            var1.field1116 = (var1.field1123 - class42.field457 << 8) / var13;
                            class85.field1102[class326.field5223++] = var1;
                        }
                    }
                }
            }
        }
    }
}
