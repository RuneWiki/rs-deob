import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class26 extends class578 {

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Z")
    private boolean field318 = true;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public int field324 = 0;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Ljava/lang/String;")
    public String field317 = null;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field327 = new String[] { method305(method304("\u0007qS\u0004\u0003")), method305(method304("\u0002n\u0011 ")), method305(method304("\u0007qSpB\u0002r\tr\u0003")), method305(method304("\u00175SbV")), method305(method304("\u0007qS\b\u0003")), method305(method304("\u0007qS\t\u0003")), method305(method304("\u0007qS\u000e\u0003")), method305(method304("\u0007qS\n\u0003")), method305(method304("\u0007qS\u000b\u0003")), method305(method304("\u0007qS\u0005\u0003")), method305(method304("\u0007qS\r\u0003")), method305(method304("\u0007qS\u000f\u0003")), method305(method304("\u0007qS\u0006\u0003")) };

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Lsb;")
    public static class261 field316 = new class261(86, 1);

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "B")
    public byte field309;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "B")
    public byte field315;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "F")
    public static float field325;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
    public long field314;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Z")
    private boolean field311;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "[I")
    private int[] field306;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[Ljw;")
    public class756[] field319;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjc;)V", line = 8)
    private final void method294(byte arg0, class711 arg1) {
        try {
            ++field307;
            int var3 = arg1.method5128(0);
            if ((var3 & 2) != 0) {
                this.field318 = true;
            }
            if ((var3 & 1) != 0) {
                this.field311 = true;
            }
            super.field8378 = arg1.method5147((byte) 78);
            this.field314 = arg1.method5147((byte) 86);
            this.field317 = arg1.method5144(-16414);
            arg1.method5128(0);
            this.field309 = arg1.method5125((byte) 110);
            if (arg0 != 105) {
                this.method302(-22);
            }
            this.field315 = arg1.method5125((byte) 125);
            this.field324 = arg1.method5116((byte) -107);
            if (~this.field324 < -1) {
                this.field319 = new class756[this.field324];
                for (int var4 = 0; ~this.field324 < ~var4; ++var4) {
                    class756 var5 = new class756();
                    if (this.field311) {
                        arg1.method5147((byte) 114);
                    }
                    if (this.field318) {
                        var5.field10808 = arg1.method5144(-16414);
                    }
                    var5.field10814 = arg1.method5125((byte) -118);
                    var5.field10815 = arg1.method5116((byte) -112);
                    this.field319[var4] = var5;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field327[7] + arg0 + ',' + (arg1 != null ? field327[3] : field327[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V", line = 71)
    private final void method295(int arg0, boolean arg1) {
        try {
            ++field321;
            if (this.field319 != null) {
                class569.method4246(this.field319, 0, this.field319 = new class756[arg0], 0, this.field324);
            } else {
                this.field319 = new class756[arg0];
            }
            if (!arg1) {
                field325 = 0.72943664F;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field327[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 87)
    public static final void method296(byte arg0) {
        try {
            class358.field5209 = null;
            class503.field7338 = null;
            class560.field8150 = null;
            ++field320;
            class529.field7681 = false;
            if (arg0 != -3) {
                field316 = null;
            }
            class796.field11578 = null;
            class747.field10651 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field327[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)I", line = 105)
    public final int method297(byte arg0, String arg1) {
        try {
            ++field305;
            int var3 = 29 % ((arg0 - -11) / 56);
            for (int var4 = 0; ~var4 > ~this.field324; ++var4) {
                if (this.field319[var4].field10808.equalsIgnoreCase(arg1)) {
                    return var4;
                }
            }
            return -1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field327[4] + arg0 + ',' + (arg1 != null ? field327[3] : field327[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljw;B)V", line = 128)
    public final void method298(class756 arg0, byte arg1) {
        try {
            if (this.field319 == null || ~this.field319.length >= ~this.field324) {
                this.method295(this.field324 + 5, true);
            }
            ++field308;
            this.field319[this.field324++] = arg0;
            this.field306 = null;
            if (arg1 < 68) {
                this.field319 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field327[11] + (arg0 != null ? field327[3] : field327[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V", line = 156)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field313;
            if (arg0 == -14609) {
                for (int var5 = 0; var5 < class153.field1962; ++var5) {
                    Rectangle var6 = class353.field5107[var5];
                    if (arg4 < var6.x + var6.width && ~var6.x > ~(arg1 + arg4) && var6.y + var6.height > arg2 && ~var6.y > ~(arg2 + arg3)) {
                        class7.field92[var5] = true;
                    }
                }
                class232.method1925(arg2, arg4, arg2 + arg3, arg1 + arg4, (byte) 118);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field327[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 184)
    public final void method300(int arg0, int arg1) {
        try {
            ++field323;
            if (arg0 != 1) {
                this.method302(40);
            }
            --this.field324;
            if (~this.field324 != -1) {
                class569.method4246(this.field319, arg1 - -1, this.field319, arg1, -arg1 + this.field324);
            } else {
                this.field319 = null;
            }
            this.field306 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field327[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 203)
    public static void method301(int arg0) {
        try {
            if (arg0 != -1) {
                field325 = 0.2392301F;
            }
            field316 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field327[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljc;)V", line = 328)
    public class26(class711 arg0) {
        try {
            this.method294((byte) 105, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field327[2] + (arg0 != null ? field327[3] : field327[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[I", line = 217)
    public final int[] method302(int arg0) {
        try {
            if (arg0 != 0) {
                this.method294((byte) 20, (class711) null);
            }
            ++field322;
            if (this.field306 == null) {
                String[] var2 = new String[this.field324];
                this.field306 = new int[this.field324];
                int var3 = 0;
                while (this.field324 > var3) {
                    var2[var3] = this.field319[var3].field10808;
                    this.field306[var3] = var3++;
                }
                class492.method3788(this.field306, var2, 0);
            }
            return this.field306;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field327[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)Lo;", line = 247)
    public static final class484 method303(int arg0, int arg1) {
        try {
            ++field310;
            if (~arg0 != arg1) {
                if (arg0 == 1) {
                    if ((double) class534.field7736 == 3.0D) {
                        return class211.field3081;
                    }
                    if ((double) class534.field7736 == 4.0D) {
                        return class403.field5871;
                    }
                    if ((double) class534.field7736 == 6.0D) {
                        return class610.field8737;
                    }
                    if ((double) class534.field7736 >= 8.0D) {
                        return class365.field5292;
                    }
                } else if (~arg0 == -3) {
                    if ((double) class534.field7736 == 3.0D) {
                        return class610.field8737;
                    }
                    if ((double) class534.field7736 == 4.0D) {
                        return class365.field5292;
                    }
                    if ((double) class534.field7736 == 6.0D) {
                        return class553.field8060;
                    }
                    if ((double) class534.field7736 >= 8.0D) {
                        return class755.field10798;
                    }
                }
            } else {
                if ((double) class534.field7736 == 3.0D) {
                    return class750.field10678;
                }
                if ((double) class534.field7736 == 4.0D) {
                    return class129.field1607;
                }
                if ((double) class534.field7736 == 6.0D) {
                    return class211.field3081;
                }
                if ((double) class534.field7736 >= 8.0D) {
                    return class403.field5871;
                }
            }
            return null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field327[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method304(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method305(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
