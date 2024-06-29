import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class202 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field3159 = -1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field3151 = 0;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Z")
    public boolean field3160 = true;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field3152 = -1;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3154 = "Loaded defaults";

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[J")
    public static long[] field3155 = new long[32];

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static final void method1354() {
        class7.field119 = 0;
        label191: for (int var0 = 0; var0 < class173.field2576; var0++) {
            class100 var1 = class61.field990[var0];
            if (class215.field3318 != null) {
                for (int var2 = 0; var2 < class215.field3318.length; var2++) {
                    if (class215.field3318[var2] != -1000000 && (var1.field1597 <= class215.field3318[var2] || var1.field1594 <= class215.field3318[var2]) && (var1.field1600 <= class119.field1834[var2] || var1.field1601 <= class119.field1834[var2]) && (var1.field1600 >= class205.field3185[var2] || var1.field1601 >= class205.field3185[var2]) && (var1.field1598 <= class280.field4381[var2] || var1.field1595 <= class280.field4381[var2]) && (var1.field1598 >= class266.field4251[var2] || var1.field1595 >= class266.field4251[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1613 == 1) {
                int var3 = var1.field1596 + class227.field3557 - class117.field1818;
                if (var3 >= 0 && var3 <= class227.field3557 + class227.field3557) {
                    int var4 = var1.field1591 + class227.field3557 - class195.field3076;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1590 + class227.field3557 - class195.field3076;
                    if (var5 > class227.field3557 + class227.field3557) {
                        var5 = class227.field3557 + class227.field3557;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class256.field3918[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class102.field1630 - var1.field1600;
                        if (var7 > 32) {
                            var1.field1587 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1587 = 2;
                            var7 = -var7;
                        }
                        var1.field1592 = (var1.field1598 - class239.field3713 << 8) / var7;
                        var1.field1603 = (var1.field1595 - class239.field3713 << 8) / var7;
                        var1.field1588 = (var1.field1597 - class58.field894 << 8) / var7;
                        var1.field1602 = (var1.field1594 - class58.field894 << 8) / var7;
                        class169.field2540[class7.field119++] = var1;
                    }
                }
            } else if (var1.field1613 == 2) {
                int var8 = var1.field1591 + class227.field3557 - class195.field3076;
                if (var8 >= 0 && var8 <= class227.field3557 + class227.field3557) {
                    int var9 = var1.field1596 + class227.field3557 - class117.field1818;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1604 + class227.field3557 - class117.field1818;
                    if (var10 > class227.field3557 + class227.field3557) {
                        var10 = class227.field3557 + class227.field3557;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class256.field3918[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class239.field3713 - var1.field1598;
                        if (var12 > 32) {
                            var1.field1587 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1587 = 4;
                            var12 = -var12;
                        }
                        var1.field1609 = (var1.field1600 - class102.field1630 << 8) / var12;
                        var1.field1606 = (var1.field1601 - class102.field1630 << 8) / var12;
                        var1.field1588 = (var1.field1597 - class58.field894 << 8) / var12;
                        var1.field1602 = (var1.field1594 - class58.field894 << 8) / var12;
                        class169.field2540[class7.field119++] = var1;
                    }
                }
            } else if (var1.field1613 == 4) {
                int var13 = var1.field1597 - class58.field894;
                if (var13 > 128) {
                    int var14 = var1.field1591 + class227.field3557 - class195.field3076;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1590 + class227.field3557 - class195.field3076;
                    if (var15 > class227.field3557 + class227.field3557) {
                        var15 = class227.field3557 + class227.field3557;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1596 + class227.field3557 - class117.field1818;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1604 + class227.field3557 - class117.field1818;
                        if (var17 > class227.field3557 + class227.field3557) {
                            var17 = class227.field3557 + class227.field3557;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class256.field3918[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1587 = 5;
                            var1.field1609 = (var1.field1600 - class102.field1630 << 8) / var13;
                            var1.field1606 = (var1.field1601 - class102.field1630 << 8) / var13;
                            var1.field1592 = (var1.field1598 - class239.field3713 << 8) / var13;
                            var1.field1603 = (var1.field1595 - class239.field3713 << 8) / var13;
                            class169.field2540[class7.field119++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLf;)V")
    public final void method1355(int arg0, boolean arg1, class37 arg2) {
        while (true) {
            int var4 = arg2.method333((byte) -59);
            if (var4 == 0) {
                if (!arg1) {
                    this.method1355(56, false, (class37) null);
                }
                field3158++;
                return;
            }
            this.method1356(var4, arg0, arg2, 22165);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILf;I)V")
    private final void method1356(int arg0, int arg1, class37 arg2, int arg3) {
        if (arg0 == 1) {
            this.field3151 = class237.method1599((byte) 124, arg2.method336(23362));
        } else if (arg0 == 2) {
            this.field3159 = arg2.method333((byte) -59);
        } else if (arg0 == 3) {
            this.field3159 = arg2.method293(-12);
            if (this.field3159 == 65535) {
                this.field3159 = -1;
            }
        } else if (arg0 == 5) {
            this.field3160 = false;
        } else if (arg0 == 7) {
            this.field3152 = class237.method1599((byte) 127, arg2.method336(23362));
        } else if (arg0 == 8) {
            class116.field1798 = arg1;
        } else if (arg0 == 9) {
            arg2.method293(126);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg2.method333((byte) -59);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg2.method336(23362);
                } else if (arg0 == 14) {
                    arg2.method333((byte) -59);
                }
            }
        }
        field3157++;
        if (arg3 != 22165) {
            this.field3160 = true;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
    public static final void method1357(byte arg0, boolean arg1) {
        class144 var2 = (class144) class286.field4493.method1010(110);
        if (arg0 != 28) {
            field3155 = null;
        }
        while (var2 != null) {
            if (var2.field2233 != null) {
                class39.field661.method718(var2.field2233);
                var2.field2233 = null;
            }
            if (var2.field2237 != null) {
                class39.field661.method718(var2.field2237);
                var2.field2237 = null;
            }
            var2.method693(-110);
            var2 = (class144) class286.field4493.method1008((byte) 88);
        }
        field3156++;
        if (!arg1) {
            return;
        }
        for (class144 var3 = (class144) class203.field3164.method1010(113); var3 != null; var3 = (class144) class203.field3164.method1008((byte) 88)) {
            if (var3.field2233 != null) {
                class39.field661.method718(var3.field2233);
                var3.field2233 = null;
            }
            var3.method693(109);
        }
        for (class144 var4 = (class144) class61.field981.method1410(-105); var4 != null; var4 = (class144) class61.field981.method1413(arg0 ^ 0xFFFFFFE3)) {
            if (var4.field2233 != null) {
                class39.field661.method718(var4.field2233);
                var4.field2233 = null;
            }
            var4.method693(-65);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        int var1 = 64 % ((-arg0 - 23) / 50);
        field3155 = null;
        field3154 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1359(int arg0, int arg1, int arg2, int arg3) {
        if (class228.method1513(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class80.method630(var4 + 1, class68.field1079[arg0][arg1][arg2] + arg3, var5 + 1) && class80.method630(var4 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class80.method630(var4 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class80.method630(var4 + 1, class68.field1079[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
