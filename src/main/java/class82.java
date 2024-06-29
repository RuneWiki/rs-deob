import java.awt.Color;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class82 extends class72 {

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public int field1240 = -1;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    private int field1241 = 0;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public int field1245 = -1;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "Z")
    private boolean field1249 = false;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    public int field1254 = 0;

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1258 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "[Llj;")
    public static class6[] field1259 = new class6[1024];

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!wr", name = "bb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field1248;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsj;I)I", line = 6)
    public static final int method624(class373 arg0, int arg1) {
        ++field1243;
        if (arg1 <= 24) {
            method628(-77, 7, 47, 87, -48, -6, -50);
        }
        int var2 = arg0.method2231(2, 93);
        int var3;
        if (var2 != 0) {
            if (var2 == 1) {
                var3 = arg0.method2231(5, -94);
            } else if (var2 != 2) {
                var3 = arg0.method2231(11, 91);
            } else {
                var3 = arg0.method2231(8, -75);
            }
        } else {
            var3 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(ILr;)V", line = 33)
    public final void method625(int arg0, class98 arg1) {
        ++field1251;
        if (arg0 < 67) {
            method624((class373) null, -119);
        }
    }

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)I", line = 44)
    public final int method626(int arg0) {
        if (arg0 != -32768) {
            return 7;
        } else {
            ++field1260;
            return -10;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIII)V", line = 224)
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lr;I)Lej;", line = 59)
    public final class690 method627(class98 arg0, int arg1) {
        ++field1250;
        class198 var3 = class124.method994(super.field3158, super.field3155 >> class49.field637, super.field3154 >> class49.field637);
        if (var3 != null && var3.field3085.field2482) {
            int var4 = var3.field3085.method626(arg1 ^ 24841);
            if (this.field1254 != var4) {
                super.field3160 -= this.field1254;
                super.field3160 += var4;
                this.field1254 = var4;
            }
        }
        class152 var5 = arg0.method777();
        var5.method167();
        if (var3 == null || !var3.field3085.field2482) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class682 var9 = class687.field9745[super.field3163];
            int var10 = this.field1241 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method3861((byte) -1, super.field3155 - -var12, super.field3154 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method3861((byte) -50, super.field3155 - -var15, super.field3154 - -var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method3861((byte) -84, super.field3155 + var18, super.field3154 - -var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method3861((byte) 107, super.field3155 + var21, super.field3154 + var22);
            int var24 = ~var14 > ~var17 ? var14 : var17;
            int var25 = ~var23 < ~var20 ? var20 : var23;
            int var26 = var23 > var17 ? var17 : var23;
            if (var10 != 0) {
                int var27 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10)) & 16383;
                if (var27 != 0) {
                    var5.method152(var27);
                }
            }
            int var28 = ~var14 > ~var20 ? var14 : var20;
            int var29 = var14 + var23;
            if (var10 != 0) {
                int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var28), (double) var10));
                if (var30 != 0) {
                    var5.method171(-var30);
                }
            }
            if (var17 + var20 < var29) {
                var29 = var17 - -var20;
            }
            int var31 = (var29 >> 1) - super.field3160;
            if (~var31 != -1) {
                var5.method158(0, var31, 0);
            }
        }
        var5.method158(super.field3155, super.field3160 + -10, super.field3154);
        class690 var32 = class101.method849(-16, 3);
        if (arg1 != -7927) {
            this.field1240 = -67;
        }
        this.field1241 = 0;
        this.field1249 = false;
        if (~this.field1245 != 0) {
            class397 var33 = class430.field6132.method42(this.field1245, false).method2528((class188) null, (class606) null, -1, 0, 2048, this.field1247, arg0, 0, arg1 + 206358777);
            if (var33 != null) {
                if (class372.field5162) {
                    var33.method448(var5, var32.field9788[2], class450.field6494, 0);
                } else {
                    var33.method460(var5, var32.field9788[2], 0);
                }
                this.field1249 |= var33.method449();
                this.field1241 = var33.method434();
            }
        }
        if (this.field1240 != -1) {
            class397 var34 = class430.field6132.method42(this.field1240, false).method2528((class188) null, (class606) null, -1, 0, 2048, this.field1252, arg0, 0, 206350850);
            if (var34 != null) {
                if (!class372.field5162) {
                    var34.method460(var5, var32.field9788[1], 0);
                } else {
                    var34.method448(var5, var32.field9788[1], class450.field6494, 0);
                }
                this.field1249 |= var34.method449();
                if (var34.method434() > this.field1241) {
                    this.field1241 = var34.method434();
                }
            }
        }
        class397 var35 = class430.field6132.method42(this.field1239, false).method2528((class188) null, (class606) null, -1, 0, 2048, this.field1256, arg0, 0, 206350850);
        if (var35 != null) {
            if (class372.field5162) {
                var35.method448(var5, var32.field9788[0], class450.field6494, 0);
            } else {
                var35.method460(var5, var32.field9788[0], 0);
            }
            this.field1249 |= var35.method449();
            if (~var35.method434() < ~this.field1241) {
                this.field1241 = var35.method434();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V", line = 227)
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class512.field7620 <= arg5 && ~class94.field1398 <= ~arg4 && arg6 >= class198.field3084 && ~arg0 >= ~class627.field8931) {
            if (arg1 != 1) {
                class240.method1559(arg3, arg6, arg5, arg4, arg0, arg1, -19);
            } else {
                class626.method3532(arg6, arg4, arg3, arg5, arg0, (byte) -122);
            }
        } else if (~arg1 == -2) {
            class562.method3286(arg3, arg5, (byte) 41, arg0, arg4, arg6);
        } else {
            class410.method2451(arg1, arg3, (byte) -126, arg6, arg4, arg0, arg5);
        }
        ++field1242;
        if (arg2 != -25039) {
            method628(73, -9, -124, 114, -20, -114, -63);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 266)
    public static void method629(int arg0) {
        if (arg0 == 131072) {
            field1258 = null;
            field1248 = null;
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)Z", line = 279)
    public final boolean method630(int arg0) {
        int var2 = -112 % ((-59 - arg0) / 44);
        ++field1253;
        return this.field1249;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(ILr;)Leh;", line = 289)
    public final class203 method631(int arg0, class98 arg1) {
        ++field1261;
        if (arg0 != 1) {
            this.field1245 = -17;
        }
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILr;B)Z", line = 305)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field1255;
        class152 var5 = arg2.method777();
        var5.method166(super.field3155, super.field3160 + -10, super.field3154);
        class397 var6 = class430.field6132.method42(this.field1239, false).method2528((class188) null, (class606) null, -1, 0, 131072, this.field1256, arg2, 0, 206350850);
        if (var6 != null && (!class372.field5162 ? var6.method469(arg0, arg1, var5, true) : var6.method482(arg0, arg1, var5, true, class450.field6494))) {
            return true;
        } else {
            int var7 = -57 % ((arg3 - -75) / 40);
            if (this.field1240 != -1) {
                class397 var8 = class430.field6132.method42(this.field1240, false).method2528((class188) null, (class606) null, -1, 0, 131072, this.field1252, arg2, 0, 206350850);
                if (var8 != null && (!class372.field5162 ? var8.method469(arg0, arg1, var5, true) : var8.method482(arg0, arg1, var5, true, class450.field6494))) {
                    return true;
                }
            }
            if (this.field1245 != -1) {
                class397 var9 = class430.field6132.method42(this.field1245, false).method2528((class188) null, (class606) null, -1, 0, 131072, this.field1247, arg2, 0, 206350850);
                if (var9 != null && (class372.field5162 ? var9.method482(arg0, arg1, var5, true, class450.field6494) : var9.method469(arg0, arg1, var5, true))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(Z)Z", line = 355)
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            method628(-113, -6, -64, -22, -5, -103, -46);
        }
        ++field1246;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I", line = 376)
    public final int method634(byte arg0) {
        ++field1244;
        if (arg0 > -102) {
            this.method625(31, (class98) null);
        }
        return this.field1241;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLjava/lang/String;)I", line = 391)
    public static final int method635(byte arg0, String arg1) {
        ++field1257;
        if (!class392.field5698.field9983) {
            return -1;
        } else if (class31.field456.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class346.method2104(arg1, 126);
            if (var2 == null) {
                return -1;
            } else {
                String var3 = class176.field2813 + var2;
                if (!class353.field4948.method2099(var3, false, "")) {
                    return -1;
                } else if (!class353.field4948.method2072(var3, -6257)) {
                    return class353.field4948.method2084(false, var3);
                } else {
                    byte[] var4 = class353.field4948.method2073((byte) 92, "", var3);
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class315.method1904(124, var2);
                    } catch (RuntimeException var10) {
                        return -1;
                    }
                    if (arg0 > -108) {
                        return -78;
                    } else if (var4 != null && var6 != null) {
                        boolean var7 = true;
                        byte[] var8 = class472.method2775(var6, (byte) -15);
                        if (var8 != null && ~var4.length == ~var8.length) {
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                if (~var4[var9] != ~var8[var9]) {
                                    var7 = false;
                                    break;
                                }
                            }
                        } else {
                            var7 = false;
                        }
                        try {
                            if (!var7) {
                                class392.field5698.method3953(93, var4, var6);
                            }
                        } catch (Throwable var11) {
                            return -1;
                        }
                        class38.method320(arg1, (byte) -5, var6);
                        return 100;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
}
