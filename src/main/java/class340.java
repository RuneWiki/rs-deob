import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class340 extends class350 implements class3 {

    @OriginalMember(owner = "client!nha", name = "ab", descriptor = "Z")
    private boolean field5542 = false;

    @OriginalMember(owner = "client!nha", name = "bb", descriptor = "Lmca;")
    public class30 field5545;

    @OriginalMember(owner = "client!nha", name = "hb", descriptor = "Z")
    private boolean field5556;

    @OriginalMember(owner = "client!nha", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field5559 = new String[] { method2866(method2865("^\u001b\fnO\u0018")), method2866(method2865("^\u001b\fnK\u0018")), method2866(method2865("^\u001b\fnBq[")), method2866(method2865("^\u001b\fnR\u0018")), method2866(method2865("^\u001b\fnQ\u0018")), method2866(method2865("^\u001b\fnG\u0018")), method2866(method2865("^\u001b\fn@q[")), method2866(method2865("^\u001b\fnCq[")), method2866(method2865("^\u0006\u0001,")), method2866(method2865("K]Cn|")), method2866(method2865("^\u001b\fnF\u0018")), method2866(method2865("^\u001b\fnDq[")), method2866(method2865("^\u001b\fnN\u0018")), method2866(method2865("^\u001b\fnH\u0018")), method2866(method2865("^\u001b\fnP\u0018")), method2866(method2865("^\u001b\fnU\u0018")), method2866(method2865("^\u001b\fnW\u0018")), method2866(method2865("^\u001b\fnJ\u0018")), method2866(method2865("^\u001b\fnM\u0018")), method2866(method2865("^\u001b\fnI\u0018")), method2866(method2865("^\u001b\fnEq[")), method2866(method2865("^\u001b\fn=Y\u001d\u00044?\u0018")), method2866(method2865("^\u001b\fnL\u0018")) };

    @OriginalMember(owner = "client!nha", name = "R", descriptor = "I")
    public static int field5549 = 0;

    @OriginalMember(owner = "client!nha", name = "J", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!nha", name = "fb", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!nha", name = "ib", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!nha", name = "U", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!nha", name = "X", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!nha", name = "S", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!nha", name = "T", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!nha", name = "Z", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!nha", name = "V", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!nha", name = "P", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!nha", name = "Y", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!nha", name = "db", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!nha", name = "O", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!nha", name = "W", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!nha", name = "L", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!nha", name = "eb", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!nha", name = "Q", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!nha", name = "cb", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!nha", name = "gb", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!nha", name = "M", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!nha", name = "K", descriptor = "Lrga;")
    private class250 field5541;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        try {
            if (arg0 != 16388) {
                return -106;
            } else {
                ++field5540;
                return this.field5545.field338;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            ++field5534;
            if (arg5 <= -10) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5559[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5559[9] : field5559[8]) + ',' + arg3 + ',' + (arg4 != null ? field5559[9] : field5559[8]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field5547;
            class499 var5 = this.field5545.method326(arg0, false, arg0 + -104448, arg3, false);
            if (var5 == null) {
                return false;
            } else {
                class486 var6 = arg3.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                return !class200.field3163 ? var5.method425(arg2, arg1, var6, false, 0) : var5.method429(arg2, arg1, var6, false, 0, class547.field8042);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5559[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5559[9] : field5559[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            ++field5551;
            if (arg0 <= -41) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public final void method30(int arg0) {
        try {
            if (arg0 != 20235) {
                this.field5541 = null;
            }
            ++field5539;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field5548;
            class499 var3 = this.field5545.method326(262144, true, 26624, arg1, true);
            if (arg0 != -108) {
                this.method33((byte) 69);
            }
            if (var3 != null) {
                int var4 = super.field9985 >> 9;
                int var5 = super.field9983 >> 9;
                class486 var6 = arg1.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                this.field5545.method323((byte) 20, var4, var5, var5, var4, arg1, var6, var3, false);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5559[7] + arg0 + ',' + (arg1 != null ? field5559[9] : field5559[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        try {
            ++field5536;
            return arg0 != -12 ? false : this.field5545.method308((byte) -93);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILmj;BI)V")
    public static final void method2863(int arg0, class683 arg1, byte arg2, int arg3) {
        try {
            if (arg2 != -89) {
                field5549 = 90;
            }
            ++field5544;
            class197.field3137 = arg3;
            class161.field2545 = arg0;
            class189.field2991 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5559[22] + arg0 + ',' + (arg1 != null ? field5559[9] : field5559[8]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            if (arg1 != -118) {
                this.field5545 = null;
            }
            ++field5552;
            return this.field5541;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5559[20] + (arg0 != null ? field5559[9] : field5559[8]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            ++field5535;
            if (arg0 >= -112) {
                this.method35((byte) -113);
            }
            return this.field5545.method314(108);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILha;)V")
    public final void method31(int arg0, class63 arg1) {
        try {
            if (arg0 == -27998) {
                this.field5545.method325(false, arg1);
                ++field5558;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5559[10] + arg0 + ',' + (arg1 != null ? field5559[9] : field5559[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIII)V")
    public class340(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class129.method1234(arg8, (byte) 66, arg9));
        try {
            this.field5545 = new class30(arg0, arg1, arg8, arg9, super.field9975, arg3, this, arg7, arg10);
            this.field5556 = arg1.field5843 != 0 && !arg7;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field5559[21] + (arg0 != null ? field5559[9] : field5559[8]) + ',' + (arg1 != null ? field5559[9] : field5559[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field5555;
            class499 var3 = this.field5545.method326(2048, false, 26624, arg0, true);
            if (var3 == null) {
                return null;
            } else {
                class486 var4 = arg0.method251();
                var4.method2465(super.field9985, super.field9972, super.field9983);
                class281 var5 = class349.method2910(this.field5556, 1, (byte) -117);
                int var6 = super.field9985 >> 9;
                int var7 = super.field9983 >> 9;
                this.field5545.method323((byte) 20, var6, var7, var7, var6, arg0, var4, var3, true);
                if (class200.field3163) {
                    var3.method423(var4, var5.field4578[0], class547.field8042, 0);
                } else {
                    var3.method426(var4, var5.field4578[0], 0);
                }
                if (arg1 != 122) {
                    return null;
                } else {
                    if (this.field5545.field358 != null) {
                        class659 var8 = this.field5545.field358.method893();
                        if (!class200.field3163) {
                            arg0.method191(var8);
                        } else {
                            arg0.method172(var8, class547.field8042);
                        }
                    }
                    this.field5542 = var3.method407() || this.field5545.field358 != null;
                    if (this.field5541 != null) {
                        class133.method1255(super.field9983, var3, true, this.field5541, super.field9985, super.field9972);
                    } else {
                        this.field5541 = class198.method1814(var3, 34069, super.field9985, super.field9983, super.field9972);
                    }
                    return var5;
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field5559[11] + (arg0 != null ? field5559[9] : field5559[8]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            ++field5537;
            return arg0 != -32768 ? true : this.field5542;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        try {
            ++field5554;
            if (arg0 != -55) {
                this.method2864((class729) null, false);
            }
            return this.field5545.field354;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            ++field5538;
            return arg0 < 54;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            ++field5543;
            if (arg0 != 0) {
                this.method43(-7);
            }
            return this.field5545.method321((byte) 51);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Ldq;Z)V")
    public final void method2864(class729 arg0, boolean arg1) {
        try {
            ++field5550;
            if (arg1) {
                this.field5545.method320(2, arg0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5559[12] + (arg0 != null ? field5559[9] : field5559[8]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;I)V")
    public final void method29(class63 arg0, int arg1) {
        try {
            this.field5545.method322(-1, arg0);
            ++field5553;
            int var3 = 74 % ((22 - arg1) / 60);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5559[19] + (arg0 != null ? field5559[9] : field5559[8]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            ++field5546;
            if (arg0 != 47) {
                this.field5542 = true;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(B)I")
    public final int method32(byte arg0) {
        try {
            ++field5557;
            if (arg0 != -95) {
                this.field5542 = true;
            }
            return this.field5545.field360;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5559[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2865(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2866(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
