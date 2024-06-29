import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class72 extends class5 {

    @OriginalMember(owner = "client!th", name = "qc", descriptor = "J")
    public static long field1113 = 0L;

    @OriginalMember(owner = "client!th", name = "tc", descriptor = "Ljava/lang/String;")
    public static String field1116 = "Loading sprites - ";

    @OriginalMember(owner = "client!th", name = "kc", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!th", name = "mc", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!th", name = "nc", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!th", name = "oc", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!th", name = "pc", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!th", name = "rc", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!th", name = "sc", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!th", name = "uc", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!th", name = "xc", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!th", name = "yc", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!th", name = "zc", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!th", name = "Ac", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!th", name = "wc", descriptor = "Lbd;")
    public class271 field1119;

    @OriginalMember(owner = "client!th", name = "vc", descriptor = "[Lij;")
    public static class69[] field1118;

    @OriginalMember(owner = "client!th", name = "lc", descriptor = "[Ljava/lang/String;")
    public static String[] field1108;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
        ++field1107;
        if (this.field1119 != null) {
            class196 var13 = ~super.field98 != 0 && super.field88 == 0 ? class70.method478(super.field98, false) : null;
            class196 var14 = ~super.field112 == 0 || ~super.field112 == ~this.method73((byte) -44).field531 && var13 != null ? null : class70.method478(super.field112, false);
            class2 var15 = this.field1119.method1824((byte) -119, super.field77, super.field38, super.field123, super.field101, var14, super.field132, super.field63, super.field133, var13);
            if (var15 != null) {
                super.field57 = var15.method36();
                class271 var16 = this.field1119;
                if (var16.field4291 != null) {
                    var16 = var16.method1812(0);
                }
                if (class1.field11 && var16.field4246) {
                    class2 var17 = class200.method1297(arg0, this.field1119.field4267, super.field94, super.field45, this.field1119.field4260, this.field1119.field4292, var14 == null ? super.field38 : super.field77, var14 == null ? var13 : var14, super.field83, var15, this.field1119.field4283, (byte) 47, super.field113, this.field1119.field4258);
                    var17.method10(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field39);
                }
                class2 var18 = null;
                this.method62(var15, (byte) 68);
                this.method63(var15, arg0, (byte) 78);
                if (~super.field81 != 0 && super.field120 != -1) {
                    class7 var19 = class274.method1848(true, super.field81);
                    var18 = var19.method77(super.field120, super.field46, (byte) 75, super.field90);
                    if (var18 != null) {
                        var18.method22(0, -super.field111, 0);
                        if (var19.field157) {
                            if (~class179.field2550 != -1) {
                                var18.method35(class179.field2550);
                            }
                            if (~class184.field2623 != -1) {
                                var18.method14(class184.field2623);
                            }
                            if (class235.field3540 != 0) {
                                var18.method22(0, class235.field3540, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class215) var15).method1379(var18);
                }
                if (this.field1119.field4283 == 1) {
                    var15.field24 = true;
                }
                var15.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field39);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLbd;)V")
    public final void method487(byte arg0, class271 arg1) {
        ++field1110;
        this.field1119 = arg1;
        if (arg0 != -3) {
            method491(111, 72L);
        }
        if (super.field39 != null) {
            super.field39.method728();
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
    public final int method36() {
        ++field1122;
        return super.field57;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method488(int arg0, String arg1) {
        int var2 = arg1.length();
        ++field1112;
        byte[] var3 = new byte[var2];
        if (arg0 != -8212) {
            field1109 = -51;
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > 0 && var5 < 128 || var5 >= 160 && ~var5 >= -256) {
                var3[var4] = (byte) var5;
            } else if (~var5 == -8365) {
                var3[var4] = -128;
            } else if (var5 == 8218) {
                var3[var4] = -126;
            } else if (~var5 == -403) {
                var3[var4] = -125;
            } else if (~var5 != -8223) {
                if (var5 == 8230) {
                    var3[var4] = -123;
                } else if (~var5 != -8225) {
                    if (var5 != 8225) {
                        if (~var5 == -711) {
                            var3[var4] = -120;
                        } else if (var5 != 8240) {
                            if (var5 != 352) {
                                if (~var5 == -8250) {
                                    var3[var4] = -117;
                                } else if (~var5 == -339) {
                                    var3[var4] = -116;
                                } else if (~var5 == -382) {
                                    var3[var4] = -114;
                                } else if (var5 == 8216) {
                                    var3[var4] = -111;
                                } else if (~var5 == -8218) {
                                    var3[var4] = -110;
                                } else if (~var5 != -8221) {
                                    if (~var5 != -8222) {
                                        if (~var5 == -8227) {
                                            var3[var4] = -107;
                                        } else if (~var5 == -8212) {
                                            var3[var4] = -106;
                                        } else if (var5 != 8212) {
                                            if (~var5 != -733) {
                                                if (var5 == 8482) {
                                                    var3[var4] = -103;
                                                } else if (~var5 != -354) {
                                                    if (var5 == 8250) {
                                                        var3[var4] = -101;
                                                    } else if (~var5 != -340) {
                                                        if (var5 != 382) {
                                                            if (var5 == 376) {
                                                                var3[var4] = -97;
                                                            } else {
                                                                var3[var4] = 63;
                                                            }
                                                        } else {
                                                            var3[var4] = -98;
                                                        }
                                                    } else {
                                                        var3[var4] = -100;
                                                    }
                                                } else {
                                                    var3[var4] = -102;
                                                }
                                            } else {
                                                var3[var4] = -104;
                                            }
                                        } else {
                                            var3[var4] = -105;
                                        }
                                    } else {
                                        var3[var4] = -108;
                                    }
                                } else {
                                    var3[var4] = -109;
                                }
                            } else {
                                var3[var4] = -118;
                            }
                        } else {
                            var3[var4] = -119;
                        }
                    } else {
                        var3[var4] = -121;
                    }
                } else {
                    var3[var4] = -122;
                }
            } else {
                var3[var4] = -124;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)Z")
    public final boolean method71(boolean arg0) {
        ++field1114;
        if (this.field1119 == null) {
            return false;
        } else {
            if (arg0) {
                method489(-56, false, (Object) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method489(int arg0, boolean arg1, Object arg2) {
        ++field1123;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class251.method1657(var3, 57) : var3;
        } else {
            int var4 = 64 / ((58 - arg0) / 37);
            if (arg2 instanceof class76) {
                class76 var5 = (class76) arg2;
                return var5.method507(0);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field1111;
        if (arg0 != 23467) {
            field1118 = null;
        }
        if (~class69.field1076 != -1 && this.field1119.field4291 != null) {
            class271 var2 = this.field1119.method1812(0);
            if (var2 != null && var2.field4254 != -1) {
                return var2.field4254;
            }
        }
        return super.field107;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field1116 = null;
        field1108 = null;
        if (arg0 > -10) {
            field1118 = null;
        }
        field1118 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1115;
        if (this.field1119 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V")
    public static final void method491(int arg0, long arg1) {
        ++field1120;
        if (arg1 != 0L) {
            if ((~class55.field836 > -101 || class279.field4462) && class55.field836 < 200) {
                String var3 = class204.method1321((byte) -23, arg1);
                for (int var4 = arg0; var4 < class55.field836; ++var4) {
                    if (~class95.field1452[var4] == ~arg1) {
                        class255.method1712((byte) 72, var3 + class267.field4067, 0, "");
                        return;
                    }
                }
                for (int var5 = 0; ~var5 > ~class247.field3707; ++var5) {
                    if (~class81.field1253[var5] == ~arg1) {
                        class255.method1712((byte) 72, class84.field1306 + var3 + class10.field169, 0, "");
                        return;
                    }
                }
                if (var3.equals(class55.field847.field766)) {
                    class255.method1712((byte) 72, class101.field1509, 0, "");
                } else {
                    ++class195.field2804;
                    class70.field1089[class55.field836] = var3;
                    class95.field1452[class55.field836] = arg1;
                    class95.field1439[class55.field836] = 0;
                    class79.field1222[class55.field836] = "";
                    class35.field498[class55.field836] = 0;
                    class152.field2194[class55.field836] = false;
                    class113.field1611 = class213.field3063;
                    ++class55.field836;
                    class95.field1451.method522(103, 28727);
                    class95.field1451.method765(arg0 ^ 532401312, arg1);
                }
            } else {
                class255.method1712((byte) 72, class33.field478, 0, "");
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1121;
    }
}
