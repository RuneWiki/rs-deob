import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class618 extends class608 {

    @OriginalMember(owner = "client!mfa", name = "O", descriptor = "Z")
    private boolean field8674 = false;

    @OriginalMember(owner = "client!mfa", name = "ab", descriptor = "I")
    public int field8686 = 0;

    @OriginalMember(owner = "client!mfa", name = "Z", descriptor = "I")
    public int field8685 = -1;

    @OriginalMember(owner = "client!mfa", name = "jb", descriptor = "I")
    public int field8695 = -1;

    @OriginalMember(owner = "client!mfa", name = "X", descriptor = "I")
    private int field8683 = 0;

    @OriginalMember(owner = "client!mfa", name = "cb", descriptor = "[Loc;")
    public static class204[] field8688 = new class204[75];

    @OriginalMember(owner = "client!mfa", name = "P", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!mfa", name = "Q", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!mfa", name = "R", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!mfa", name = "S", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!mfa", name = "T", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!mfa", name = "U", descriptor = "I")
    public int field8680;

    @OriginalMember(owner = "client!mfa", name = "V", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!mfa", name = "W", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!mfa", name = "Y", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!mfa", name = "bb", descriptor = "I")
    public int field8687;

    @OriginalMember(owner = "client!mfa", name = "db", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!mfa", name = "eb", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!mfa", name = "fb", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!mfa", name = "gb", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!mfa", name = "hb", descriptor = "I")
    public int field8693;

    @OriginalMember(owner = "client!mfa", name = "ib", descriptor = "I")
    public int field8694;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lha;Z)V", line = 3)
    public final void method314(class60 arg0, boolean arg1) {
        if (arg1) {
            this.field8687 = 31;
        }
        ++field8689;
    }

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "(B)I", line = 14)
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            this.field8687 = 69;
        }
        ++field8691;
        return this.field8683;
    }

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "(B)I", line = 26)
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            this.method325((class60) null, -105);
        }
        ++field8684;
        return -10;
    }

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "(B)I", line = 37)
    public final int method1798(byte arg0) {
        ++field8678;
        class578 var2 = class336.field4876.method2079(this.field8687, (byte) 110);
        int var3 = var2.field8234;
        if (~this.field8695 != 0) {
            class578 var4 = class336.field4876.method2079(this.field8695, (byte) 98);
            if (~var3 > ~var4.field8234) {
                var3 = var4.field8234;
            }
        }
        int var5 = 6 % ((arg0 - 73) / 47);
        if (this.field8685 != -1) {
            class578 var6 = class336.field4876.method2079(this.field8685, (byte) 92);
            if (var3 < var6.field8234) {
                var3 = var6.field8234;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "(B)Z", line = 71)
    public final boolean method320(byte arg0) {
        ++field8682;
        if (arg0 != 84) {
            this.field8693 = -106;
        }
        return false;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBLha;I)Z", line = 84)
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field8675;
        class738 var5 = arg2.method442();
        if (arg1 > -44) {
            method3562((byte) 57);
        }
        var5.method774(super.field8423, super.field8421 + -10, super.field8428);
        class578 var6 = class336.field4876.method2079(this.field8687, (byte) 112);
        class473 var7 = var6.method3361(0, this.field8694, -1, (class386) null, 131072, 1, arg2, (class288) null, 0);
        if (var7 != null && (!class418.field6258 ? var7.method277(arg0, arg3, var5, true, var6.field8234) : var7.method283(arg0, arg3, var5, true, var6.field8234, class188.field2859))) {
            return true;
        } else {
            if (this.field8695 != -1) {
                class578 var8 = class336.field4876.method2079(this.field8695, (byte) -102);
                class473 var9 = var8.method3361(0, this.field8680, -1, (class386) null, 131072, 1, arg2, (class288) null, 0);
                if (var9 != null && (class418.field6258 ? var9.method283(arg0, arg3, var5, true, var8.field8234, class188.field2859) : var9.method277(arg0, arg3, var5, true, var8.field8234))) {
                    return true;
                }
            }
            if (this.field8685 != -1) {
                class578 var10 = class336.field4876.method2079(this.field8685, (byte) -93);
                class473 var11 = var10.method3361(0, this.field8693, -1, (class386) null, 131072, 1, arg2, (class288) null, 0);
                if (var11 != null && (class418.field6258 ? var11.method283(arg0, arg3, var5, true, var10.field8234, class188.field2859) : var11.method277(arg0, arg3, var5, true, var10.field8234))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIII)V", line = 170)
    public class618(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "(B)Z", line = 139)
    public final boolean method329(byte arg0) {
        int var2 = 42 / ((-33 - arg0) / 42);
        ++field8679;
        return this.field8674;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lha;I)Lria;", line = 149)
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            this.field8674 = true;
        }
        ++field8690;
        return null;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 173)
    public static final void method3559(String arg0, boolean arg1, int arg2) {
        class25.method125(0, "", 0, arg0, arg2, "", "");
        if (arg1) {
            field8688 = null;
        }
        ++field8692;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lns;B)V", line = 185)
    public static final void method3560(class405 arg0, byte arg1) {
        ++field8677;
        if (arg0.field6124 != null || arg0.field6058 != null) {
            boolean var2 = true;
            for (int var3 = 0; arg0.field6124.length > var3; ++var3) {
                int var5 = -1;
                if (arg0.field6124 != null) {
                    var5 = arg0.field6124[var3];
                }
                if (~var5 == 0) {
                    if (!arg0.method2578(var3, -1, (byte) 83)) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                    boolean var6 = false;
                    boolean var7 = false;
                    int var10;
                    int var11;
                    if (~(var5 & -1073741824) != 1073741823) {
                        if ((32768 & var5) == 0) {
                            class432 var8 = (class432) class497.field7067.method2287((long) var5, (byte) -117);
                            if (var8 == null) {
                                arg0.method2578(var3, -1, (byte) 117);
                                continue;
                            }
                            class282 var9 = var8.field6439;
                            var10 = arg0.field8423 - var9.field8423;
                            var11 = -var9.field8428 + arg0.field8428;
                        } else {
                            int var12 = 32767 & var5;
                            class689 var13 = class314.field4456[var12];
                            if (var13 == null) {
                                arg0.method2578(var3, -1, (byte) 110);
                                continue;
                            }
                            var11 = -var13.field8428 + arg0.field8428;
                            var10 = -var13.field8423 + arg0.field8423;
                        }
                    } else {
                        int var14 = var5 & 268435455;
                        int var15 = var14 >> 14;
                        int var16 = 16383 & var14;
                        var10 = -((-class361.field5224 + var15) * 512) - (256 - arg0.field8423);
                        var11 = arg0.field8428 + -256 + -((-class582.field8288 + var16) * 512);
                    }
                    if (~var10 != -1 || ~var11 != -1) {
                        arg0.method2578(var3, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 16383, (byte) 32);
                    }
                }
            }
            if (var2) {
                arg0.field6058 = null;
                arg0.field6124 = null;
            }
            int var4 = -72 / ((-56 - arg1) / 37);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V", line = 295)
    public static final void method3561(int arg0, int arg1) {
        class601.field8510 = -1;
        class712.field10051 = arg1;
        class627.field8776 = arg0;
        ++field8681;
        class439.field6501 = 100;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Lha;B)Lc;", line = 312)
    public final class187 method319(class60 arg0, byte arg1) {
        ++field8676;
        class754 var3 = class149.method1105(super.field8429, super.field8423 >> class459.field6769, super.field8428 >> class459.field6769);
        if (var3 != null && var3.field10542.field1629) {
            int var4 = var3.field10542.method315((byte) 106);
            if (this.field8686 != var4) {
                super.field8421 -= this.field8686;
                super.field8421 += var4;
                this.field8686 = var4;
            }
        }
        int var5 = -21 / ((arg1 - -25) / 60);
        class738 var6 = arg0.method442();
        var6.method769();
        if (var3 == null || !var3.field10542.field1629) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class280 var10 = class582.field8287[super.field8417];
            int var11 = this.field8683 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1786(super.field8428 - -var14, (byte) 113, super.field8423 + var13);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1786(super.field8428 + var17, (byte) 113, super.field8423 - -var16);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1786(super.field8428 + var20, (byte) 113, super.field8423 - -var19);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1786(super.field8428 - -var23, (byte) 113, super.field8423 + var22);
            int var25 = var15 >= var18 ? var18 : var15;
            int var26 = ~var24 >= ~var21 ? var24 : var21;
            int var27 = ~var24 >= ~var18 ? var24 : var18;
            if (var11 != 0) {
                int var28 = (int) (Math.atan2((double) (-var26 + var25), (double) var11) * 2607.5945876176133D) & 16383;
                if (~var28 != -1) {
                    var6.method763(var28);
                }
            }
            int var29 = var15 < var21 ? var15 : var21;
            int var30 = var15 + var24;
            if (~var11 != -1) {
                int var31 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var29), (double) var11));
                if (var31 != 0) {
                    var6.method760(-var31);
                }
            }
            if (var30 > var18 + var21) {
                var30 = var18 - -var21;
            }
            int var32 = (var30 >> 1) + -super.field8421;
            if (var32 != 0) {
                var6.method758(0, var32, 0);
            }
        }
        var6.method758(super.field8423, super.field8421 + -10, super.field8428);
        class187 var33 = class650.method3774(94, true, 3);
        this.field8683 = 0;
        this.field8674 = false;
        if (~this.field8685 != 0) {
            class473 var34 = class336.field4876.method2079(this.field8685, (byte) 94).method3361(0, this.field8693, -1, (class386) null, 2048, 1, arg0, (class288) null, 0);
            if (var34 != null) {
                if (!class418.field6258) {
                    var34.method265(var6, var33.field2851[2], 0);
                } else {
                    var34.method235(var6, var33.field2851[2], class188.field2859, 0);
                }
                this.field8674 |= var34.method275();
                this.field8683 = var34.method269();
            }
        }
        if (this.field8695 != -1) {
            class473 var35 = class336.field4876.method2079(this.field8695, (byte) -104).method3361(0, this.field8680, -1, (class386) null, 2048, 1, arg0, (class288) null, 0);
            if (var35 != null) {
                if (!class418.field6258) {
                    var35.method265(var6, var33.field2851[1], 0);
                } else {
                    var35.method235(var6, var33.field2851[1], class188.field2859, 0);
                }
                this.field8674 |= var35.method275();
                if (var35.method269() > this.field8683) {
                    this.field8683 = var35.method269();
                }
            }
        }
        class473 var36 = class336.field4876.method2079(this.field8687, (byte) 89).method3361(0, this.field8694, -1, (class386) null, 2048, 1, arg0, (class288) null, 0);
        if (var36 != null) {
            if (class418.field6258) {
                var36.method235(var6, var33.field2851[0], class188.field2859, 0);
            } else {
                var36.method265(var6, var33.field2851[0], 0);
            }
            this.field8674 |= var36.method275();
            if (~var36.method269() < ~this.field8683) {
                this.field8683 = var36.method269();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V", line = 479)
    public static void method3562(byte arg0) {
        int var1 = 81 % ((-46 - arg0) / 60);
        field8688 = null;
    }
}
