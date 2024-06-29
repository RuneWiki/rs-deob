import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class296 extends class134 {

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[B")
    public byte[] field4846;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4850 = "M";

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static void method2038(int arg0) {
        field4850 = null;
        int var1 = -87 / ((arg0 - 64) / 45);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Z")
    public static final boolean method2039(byte arg0, int arg1) {
        if (arg0 <= 67) {
            field4851 = 82;
        }
        field4849++;
        class208 var2 = class4.method32((byte) 31, arg1);
        if (var2 == null) {
            return false;
        } else if (class83.field1378 == 1 || class83.field1378 == 2 || class27.field470 == 2) {
            class186.field2971 = var2.field3525;
            class251.field4250 = var2.field3523;
            if (class27.field470 != 0) {
                class223.field3741 = class251.field4250 + 50000;
                class146.field2411 = class251.field4250 + 40000;
                class264.field4408 = class146.field2411;
            }
            return true;
        } else {
            String var3 = "";
            if (class27.field470 != 0) {
                var3 = ":" + (var2.field3523 + 7000);
            }
            String var4 = "";
            if (class103.field1649 != null) {
                var4 = "/p=" + class103.field1649;
            }
            String var5 = "http://" + var2.field3525 + var3 + "/l=" + class49.field834 + "/a=" + class105.field1736 + var4 + "/j" + (class147.field2425 ? "1" : "0") + ",o" + (class77.field1310 ? "1" : "0") + ",a2,m" + (class159.field2606 ? "1" : "0");
            try {
                class45.field702.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V")
    public class296(byte[] arg0) {
        this.field4846 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Luf;I)V")
    public static final void method2040(class46 arg0, int arg1) {
        field4852++;
        class190 var2 = arg0.method282(-1399);
        arg0.field782 = var2.field3072;
        if (arg0.field730 == 0) {
            arg0.field725 = 0;
        } else {
            if (arg0.field761 != -1 && arg0.field791 == 0) {
                class163 var3 = class34.method211(arg0.field761, 3);
                if (arg0.field755 > 0 && var3.field2663 == 0) {
                    arg0.field725++;
                    return;
                }
                if (arg0.field755 <= 0 && var3.field2654 == 0) {
                    arg0.field725++;
                    return;
                }
            }
            if (arg0.field757 != -1 && arg0.field751 <= class275.field4598) {
                class84 var4 = class258.method1847(arg1 ^ 0xFFFFFA9A, arg0.field757);
                if (var4.field1409 && var4.field1404 != -1) {
                    class163 var5 = class34.method211(var4.field1404, arg1 ^ 0x51B);
                    if (arg0.field755 > 0 && var5.field2663 == 0) {
                        arg0.field725++;
                        return;
                    }
                    if (arg0.field755 <= 0 && var5.field2654 == 0) {
                        arg0.field725++;
                        return;
                    }
                }
            }
            int var6 = arg0.field771;
            int var7 = arg0.field715;
            int var8 = arg0.field711[arg0.field730 - 1] * 128 + arg0.method294((byte) -109) * 64;
            int var9 = arg0.field717[arg0.field730 - 1] * 128 + (arg0.method294((byte) -110) * 64);
            if ((var8 - var7) > 256 || (var8 - var7) < -256 || var9 - var6 > 256 || var9 - var6 < -256) {
                arg0.field771 = var9;
                arg0.field715 = var8;
                return;
            }
            if (var8 > var7) {
                if (var9 > var6) {
                    arg0.field776 = 1280;
                } else if (var6 <= var9) {
                    arg0.field776 = 1536;
                } else {
                    arg0.field776 = 1792;
                }
            } else if (var8 < var7) {
                if (var6 < var9) {
                    arg0.field776 = 768;
                } else if (var9 >= var6) {
                    arg0.field776 = 512;
                } else {
                    arg0.field776 = 256;
                }
            } else if (var6 < var9) {
                arg0.field776 = 1024;
            } else if (var6 > var9) {
                arg0.field776 = 0;
            }
            int var10 = var2.field3067;
            int var11 = 4;
            boolean var12 = true;
            byte var13 = 1;
            int var14 = arg0.field776 - arg0.field753 & 0x7FF;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 >= -256 && var14 <= 256) {
                var10 = var2.field3071;
            } else if (var14 >= 256 && var14 < 768) {
                var10 = var2.field3068;
            } else if (var14 >= -768 && var14 <= -256) {
                var10 = var2.field3046;
            }
            if (var10 == -1) {
                var10 = var2.field3071;
            }
            arg0.field782 = var10;
            if (arg0 instanceof class307) {
                var12 = ((class307) arg0).field4960.field949;
            }
            if (var12) {
                if (arg0.field776 != arg0.field753 && arg0.field764 == -1 && arg0.field792 != 0) {
                    var11 = 2;
                }
                if (arg0.field730 > 2) {
                    var11 = 6;
                }
                if (arg0.field730 > 3) {
                    var11 = 8;
                }
                if (arg0.field725 > 0 && arg0.field730 > 1) {
                    arg0.field725--;
                    var11 = 8;
                }
            } else {
                if (arg0.field730 > 1) {
                    var11 = 6;
                }
                if (arg0.field730 > 2) {
                    var11 = 8;
                }
                if (arg0.field725 > 0 && arg0.field730 > 1) {
                    var11 = 8;
                    arg0.field725--;
                }
            }
            if (arg0.field759[arg0.field730 - 1] == 2) {
                var11 <<= 0x1;
                var13 = 2;
            } else if (arg0.field759[arg0.field730 - 1] == 0) {
                var11 >>= 0x1;
                var13 = 0;
            }
            if (var11 < 8 || var2.field3082 == -1) {
                if (var2.field3061 != -1 && var13 == 0) {
                    if (arg0.field782 == var2.field3067 && var2.field3059 != -1) {
                        arg0.field782 = var2.field3059;
                    } else if (arg0.field782 == var2.field3046 && var2.field3041 != -1) {
                        arg0.field782 = var2.field3041;
                    } else if (arg0.field782 == var2.field3068 && var2.field3060 != -1) {
                        arg0.field782 = var2.field3060;
                    } else {
                        arg0.field782 = var2.field3061;
                    }
                }
            } else if (arg0.field782 == var2.field3067 && var2.field3056 != -1) {
                arg0.field782 = var2.field3056;
            } else if (arg0.field782 == var2.field3046 && var2.field3051 != -1) {
                arg0.field782 = var2.field3051;
            } else if (arg0.field782 == var2.field3068 && var2.field3084 != -1) {
                arg0.field782 = var2.field3084;
            } else {
                arg0.field782 = var2.field3082;
            }
            if (var2.field3064 != -1) {
                int var15 = var11 << 7;
                if (arg0.field730 == 1) {
                    int var16 = arg0.field729 * arg0.field729;
                    int var17 = (var8 < arg0.field715 ? arg0.field715 - var8 : -arg0.field715 + var8) << 7;
                    int var18 = (arg0.field771 > var9 ? arg0.field771 - var9 : -arg0.field771 + var9) << 7;
                    int var19 = var17 > var18 ? var17 : var18;
                    int var20 = var2.field3064 * 2 * var19;
                    if (var16 > var20) {
                        arg0.field729 /= 2;
                    } else if (var19 < var16 / 2) {
                        arg0.field729 -= var2.field3064;
                        if (arg0.field729 < 0) {
                            arg0.field729 = 0;
                        }
                    } else if (var15 > arg0.field729) {
                        arg0.field729 += var2.field3064;
                        if (var15 < arg0.field729) {
                            arg0.field729 = var15;
                        }
                    }
                } else if (arg0.field729 < var15) {
                    arg0.field729 += var2.field3064;
                    if (var15 < arg0.field729) {
                        arg0.field729 = var15;
                    }
                } else if (arg0.field729 > 0) {
                    arg0.field729 -= var2.field3064;
                    if (arg0.field729 < 0) {
                        arg0.field729 = 0;
                    }
                }
                var11 = arg0.field729 >> 7;
                if (var11 < 1) {
                    var11 = 1;
                }
            }
            if (var7 < var8) {
                arg0.field715 += var11;
                if (var8 < arg0.field715) {
                    arg0.field715 = var8;
                }
            } else if (var7 > var8) {
                arg0.field715 -= var11;
                if (arg0.field715 < var8) {
                    arg0.field715 = var8;
                }
            }
            if (var6 < var9) {
                arg0.field771 += var11;
                if (arg0.field771 > var9) {
                    arg0.field771 = var9;
                }
            } else if (var6 > var9) {
                arg0.field771 -= var11;
                if (arg0.field771 < var9) {
                    arg0.field771 = var9;
                }
            }
            if (arg0.field715 == var8 && arg0.field771 == var9) {
                arg0.field730--;
                if (arg0.field755 > 0) {
                    arg0.field755--;
                }
            }
        }
        if (arg1 != 1304) {
            method2038(-62);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BI)I")
    public static final int method2041(byte arg0, int arg1) {
        if (arg0 <= 66) {
            method2041((byte) 97, 37);
        }
        field4847++;
        return arg1 & 0x7F;
    }
}
