import java.awt.Rectangle;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class238 extends class118 {

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    private int field3547 = 2;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    private int field3554 = 0;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    private int field3555 = 2048;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "[B")
    private byte[] field3560 = new byte[512];

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    private int field3562 = 5;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[S")
    private short[] field3559 = new short[512];

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    private int field3563 = 5;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    private int field3566 = 1;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "Lnn;")
    public static class151 field3565 = new class151("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "Llh;")
    public static class91 field3567 = new class91(0, 0);

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "Lwl;")
    public static class452 field3568 = new class452(56, 2);

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!om", name = "db", descriptor = "Z")
    public static boolean field3570 = false;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Z")
    public static final boolean method1429(int arg0, int arg1) {
        ++field3564;
        if (arg0 != 45 && arg0 != 48 && arg0 != 4 && ~arg0 != -4 && ~arg0 != -1011) {
            if (arg0 != 2 && ~arg0 != -1003) {
                return arg1 > -20;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        this.field3560 = class26.method160(this.field3554, -26541);
        ++field3557;
        this.method1435(-100);
        if (arg0 < 103) {
            this.field3560 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public static final void method1430(int arg0) {
        ++field3552;
        class149.field2067 = arg0;
        class372.field5433.method2512((byte) 4);
        class306.field4628 = false;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
    public static void method1431(int arg0) {
        field3568 = null;
        field3567 = null;
        field3565 = null;
        if (arg0 != 50000) {
            method1436(100, -4, 19, 2, 27);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(III)V")
    public static final void method1432(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1432(-98, 119, 53);
        }
        ++field3553;
        class251.field3762 = new class241(arg2);
        class446.field6580 = new class241(arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3550;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            method1434(16, -86);
        }
        if (super.field1537.field5756) {
            int var4 = class160.field2210[arg1] * this.field3562 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class440.field6474 < ~var7; ++var7) {
                class229.field3509 = Integer.MAX_VALUE;
                class189.field2835 = Integer.MAX_VALUE;
                class149.field2066 = Integer.MAX_VALUE;
                class161.field2241 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class6.field73[var7] * this.field3563);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field3560[255 & (var11 >= this.field3562 ? -this.field3562 + var11 : var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field3560[255 & var13 + (var14 < this.field3563 ? var14 : -this.field3563 + var14)]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field3559[var15] - var8);
                        int var17 = -(var11 << 12) - (this.field3559[var27] - var4);
                        int var18 = this.field3566;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 <= ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~var19 > ~class161.field2241) {
                            class229.field3509 = class189.field2835;
                            class189.field2835 = class149.field2066;
                            class149.field2066 = class161.field2241;
                            class161.field2241 = var19;
                        } else if (var19 < class149.field2066) {
                            class229.field3509 = class189.field2835;
                            class189.field2835 = class149.field2066;
                            class149.field2066 = var19;
                        } else if (~var19 > ~class189.field2835) {
                            class229.field3509 = class189.field2835;
                            class189.field2835 = var19;
                        } else if (~class229.field3509 < ~var19) {
                            class229.field3509 = var19;
                        }
                    }
                }
                int var12 = this.field3547;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class161.field2241 + class149.field2066;
                                }
                            } else {
                                var3[var7] = class229.field3509;
                            }
                        } else {
                            var3[var7] = class189.field2835;
                        }
                    } else {
                        var3[var7] = class149.field2066;
                    }
                } else {
                    var3[var7] = class161.field2241;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I")
    public static final int method1433(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3556;
        class148 var4 = class432.method2655((byte) 127, arg0, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg2; ~var6 > ~var4.field2049.length; ++var6) {
                if (var4.field2045[var6] == arg3) {
                    var5 += var4.field2049[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Z")
    public static final boolean method1434(int arg0, int arg1) {
        ++field3558;
        if (arg1 != 23730) {
            field3567 = null;
        }
        class432 var2 = class137.method857(32368, arg0);
        if (var2 == null) {
            return false;
        } else if (~class239.field3584 != -4) {
            class228.field3490 = var2.field6333;
            class414.field6149 = var2.field6335;
            if (class454.field6750 != 0) {
                class109.field1443 = class414.field6149 + 50000;
                class432.field6334 = class414.field6149 + 40000;
                class284.field4336 = class432.field6334;
            }
            return true;
        } else {
            String var3 = "";
            if (class454.field6750 != 0) {
                var3 = ":" + (var2.field6335 + 7000);
            }
            String var4 = "";
            if (class54.field730 != null) {
                var4 = "/p=" + class54.field730;
            }
            String var5 = "http://" + var2.field6333 + var3 + "/l=" + class27.field356 + "/a=" + class240.field3600 + var4 + "/j" + (!class120.field1585 ? "0" : "1") + ",o" + (!class355.field5242 ? "0" : "1") + ",a2";
            try {
                class68.field876.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
    private final void method1435(int arg0) {
        if (arg0 > -22) {
            method1432(122, -41, 84);
        }
        ++field3549;
        Random var2 = new Random((long) this.field3554);
        this.field3559 = new short[512];
        if (this.field3555 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3559[var3] = (short) class330.method2028(93, this.field3555, var2);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3562 = arg2.method2343(255);
                                }
                            } else {
                                this.field3563 = arg2.method2343(arg1 + 254);
                            }
                        } else {
                            this.field3566 = arg2.method2343(255);
                        }
                    } else {
                        this.field3547 = arg2.method2343(255);
                    }
                } else {
                    this.field3555 = arg2.method2323(-24);
                }
            } else {
                this.field3554 = arg2.method2343(255);
            }
        } else {
            this.field3563 = this.field3562 = arg2.method2343(255);
        }
        if (arg1 != 1) {
            field3568 = null;
        }
        ++field3561;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public static final void method1436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3548;
        int var5 = 0;
        if (arg4 <= 9) {
            method1429(-114, 86);
        }
        while (class174.field2662 > var5) {
            Rectangle var6 = class247.field3700[var5];
            if (var6.x - -var6.width > arg0 && ~(arg0 + arg2) < ~var6.x && ~arg3 > ~(var6.y + var6.height) && var6.y < arg1 + arg3) {
                class6.field71[var5] = true;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }
}
