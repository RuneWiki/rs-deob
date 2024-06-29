import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class277 extends class115 {

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    private int field4435 = 4096;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "Z")
    private boolean field4445 = true;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field4440 = 0;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field4444 = 0;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "Lij;")
    public static class69 field4443;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Lca;")
    public static class83 field4434;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field4438;
        int[][] var3 = super.field1716.method6(arg1, (byte) -7);
        if (super.field1716.field23) {
            int[] var4 = this.method797(0, arg1 + -1 & class5.field136, -65);
            int[] var5 = this.method797(0, arg1, 109);
            int[] var6 = this.method797(0, class5.field136 & arg1 + 1, -82);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class77.field1178 > var10; ++var10) {
                int var11 = (var5[class207.field2992 & var10 + 1] + -var5[class207.field2992 & var10 - 1]) * this.field4435;
                int var12 = (var6[var10] + -var4[var10]) * this.field4435;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var18 = var11 / var17;
                    var20 = var12 / var17;
                }
                if (this.field4445) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return arg0 > -33 ? null : var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BC)B")
    public static final byte method1862(byte arg0, char arg1) {
        if (arg0 != -106) {
            method1863(true, (byte) 105);
        }
        ++field4437;
        byte var2;
        if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || arg1 > 255)) {
            if (~arg1 == -8365) {
                var2 = -128;
            } else if (~arg1 != -8219) {
                if (arg1 != 402) {
                    if (~arg1 == -8223) {
                        var2 = -124;
                    } else if (arg1 != 8230) {
                        if (~arg1 != -8225) {
                            if (arg1 != 8225) {
                                if (arg1 != 710) {
                                    if (arg1 != 8240) {
                                        if (arg1 != 352) {
                                            if (arg1 == 8249) {
                                                var2 = -117;
                                            } else if (~arg1 == -339) {
                                                var2 = -116;
                                            } else if (~arg1 != -382) {
                                                if (arg1 == 8216) {
                                                    var2 = -111;
                                                } else if (~arg1 != -8218) {
                                                    if (arg1 != 8220) {
                                                        if (~arg1 != -8222) {
                                                            if (arg1 == 8226) {
                                                                var2 = -107;
                                                            } else if (arg1 != 8211) {
                                                                if (~arg1 == -8213) {
                                                                    var2 = -105;
                                                                } else if (arg1 != 732) {
                                                                    if (arg1 != 8482) {
                                                                        if (~arg1 != -354) {
                                                                            if (arg1 != 8250) {
                                                                                if (arg1 != 339) {
                                                                                    if (~arg1 == -383) {
                                                                                        var2 = -98;
                                                                                    } else if (arg1 != 376) {
                                                                                        var2 = 63;
                                                                                    } else {
                                                                                        var2 = -97;
                                                                                    }
                                                                                } else {
                                                                                    var2 = -100;
                                                                                }
                                                                            } else {
                                                                                var2 = -101;
                                                                            }
                                                                        } else {
                                                                            var2 = -102;
                                                                        }
                                                                    } else {
                                                                        var2 = -103;
                                                                    }
                                                                } else {
                                                                    var2 = -104;
                                                                }
                                                            } else {
                                                                var2 = -106;
                                                            }
                                                        } else {
                                                            var2 = -108;
                                                        }
                                                    } else {
                                                        var2 = -109;
                                                    }
                                                } else {
                                                    var2 = -110;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -118;
                                        }
                                    } else {
                                        var2 = -119;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = -126;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field4445 = arg1.method760(false) == 1;
                }
            } else {
                this.field4435 = arg1.method756(-29901);
            }
            ++field4436;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZB)V")
    public static final void method1863(boolean arg0, byte arg1) {
        if (arg1 >= 18) {
            ++field4439;
            for (class30 var2 = (class30) class74.field1146.method656(115); var2 != null; var2 = (class30) class74.field1146.method650(124)) {
                if (var2.field438 != null) {
                    class152.field2201.method279(var2.field438);
                    var2.field438 = null;
                }
                if (var2.field437 != null) {
                    class152.field2201.method279(var2.field437);
                    var2.field437 = null;
                }
                var2.method1706(-83);
            }
            if (arg0) {
                for (class30 var3 = (class30) class210.field3019.method656(119); var3 != null; var3 = (class30) class210.field3019.method650(125)) {
                    if (var3.field438 != null) {
                        class152.field2201.method279(var3.field438);
                        var3.field438 = null;
                    }
                    var3.method1706(-121);
                }
                for (class30 var4 = (class30) class124.field1801.method1219(1); var4 != null; var4 = (class30) class124.field1801.method1223(83)) {
                    if (var4.field438 != null) {
                        class152.field2201.method279(var4.field438);
                        var4.field438 = null;
                    }
                    var4.method1706(-114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lve;I)Z")
    public static final boolean method1864(class233 arg0, int arg1) {
        ++field4442;
        if (arg1 <= 92) {
            field4444 = -120;
        }
        return arg0.method1509(false, class160.field2322);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)Llk;")
    public static final class244 method1865(boolean arg0) {
        ++field4441;
        int var1 = class282.field4500[0] * class246.field3682[0];
        byte[] var2 = class263.field3965[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var1 > var4; ++var4) {
            var3[var4] = class128.field1883[class184.method1188(var2[var4], 255)];
        }
        class244 var5 = new class244(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], var3);
        class290.method1935(0);
        if (!arg0) {
            field4444 = -43;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
    public static void method1866(byte arg0) {
        if (arg0 >= -14) {
            method1862((byte) -128, (char) 65430);
        }
        field4443 = null;
        field4434 = null;
    }
}
