import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class548 {

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8058 = new String[] { method4076(method4075("2>N\u0015\u001b")), method4076(method4075("2>N\u001e\u001b")), method4076(method4075("2>N\u0012\u001b")), method4076(method4075("?)\f;")), method4076(method4075("2>N\u0014\u001b")), method4076(method4075("*rNyN")), method4076(method4075("2>N\u0011\u001b")), method4076(method4075("2>N\u0010\u001b")), method4076(method4075("2>N\u001f\u001b")), method4076(method4075("2>N\u0013\u001b")), method4076(method4075("2>N\u0016\u001b")) };

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
    public static boolean field8053 = false;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "F")
    public static float field8046;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field8044;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field8047;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[[B")
    public static byte[][] field8055;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
    public static final boolean method4066(int arg0, int arg1, int arg2) {
        try {
            int var3 = 40 % ((arg1 - 20) / 47);
            field8048++;
            return (arg2 & 0x400) != 0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8058[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Loi;I)V")
    public static final void method4067(class77 arg0, int arg1) {
        try {
            if (arg1 != -256) {
                method4074(-84);
            }
            field8052++;
            if (arg0.field1144 != null || arg0.field1140 != null) {
                boolean var2 = true;
                for (int var3 = 0; var3 < arg0.field1144.length; var3++) {
                    int var4 = -1;
                    if (arg0.field1144 != null) {
                        var4 = arg0.field1144[var3];
                    }
                    if (var4 != -1) {
                        var2 = false;
                        boolean var5 = false;
                        boolean var6 = false;
                        int var10;
                        int var11;
                        if ((var4 & 0xC0000000) == -1073741824) {
                            int var7 = var4 & 0xFFFFFFF;
                            int var8 = var7 >> 14;
                            int var9 = var7 & 0x3FFF;
                            var10 = -((var8 - class397.field6289) * 512 - arg0.field9985) - 256;
                            var11 = arg0.field9983 - ((var9 - class141.field2011) * 512) - 256;
                        } else if ((var4 & 0x8000) == 0) {
                            class19 var14 = (class19) class176.field2797.method737((byte) -39, (long) var4);
                            if (var14 == null) {
                                arg0.method798((byte) 78, var3, -1);
                                continue;
                            }
                            class426 var15 = var14.field194;
                            var11 = arg0.field9983 - var15.field9983;
                            var10 = arg0.field9985 - var15.field9985;
                        } else {
                            int var12 = var4 & 0x7FFF;
                            class738 var13 = class33.field395[var12];
                            if (var13 == null) {
                                arg0.method798((byte) 79, var3, -1);
                                continue;
                            }
                            var11 = arg0.field9983 - var13.field9983;
                            var10 = arg0.field9985 - var13.field9985;
                        }
                        if (var10 != 0 || var11 != 0) {
                            arg0.method798((byte) 116, var3, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                        }
                    } else if (!arg0.method798((byte) 65, var3, -1)) {
                        var2 = false;
                    }
                }
                if (var2) {
                    arg0.field1144 = null;
                    arg0.field1140 = null;
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field8058[6] + (arg0 == null ? field8058[3] : field8058[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
    public static final boolean method4068(boolean arg0) {
        try {
            if (arg0) {
                return true;
            } else {
                field8050++;
                return class320.field5213 > 0;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8058[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
    public final int method4069(boolean arg0) {
        try {
            field8051++;
            if (!arg0) {
                field8053 = true;
            }
            return this.field8044 & 0x3FFF;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8058[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    public final void method4070(int arg0, byte arg1) {
        try {
            this.field8044 = arg0;
            field8056++;
            if (arg1 != -92) {
                this.field8044 = 77;
            }
            this.field8047 = 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8058[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method4071(int arg0) {
        try {
            if (arg0 == 512) {
                field8049++;
                this.field8044 &= 0x3FFF;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8058[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)Z")
    public final boolean method4072(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field8045++;
            int var5 = this.field8047;
            if (this.field8044 == arg3 && this.field8047 == 0) {
                return false;
            }
            boolean var8;
            if (this.field8047 == 0) {
                if (arg3 > this.field8044 && arg3 <= (this.field8044 + arg2) || this.field8044 > arg3 && arg3 >= (this.field8044 - arg2)) {
                    this.field8044 = arg3;
                    return false;
                }
                var8 = true;
            } else if (this.field8047 > 0 && this.field8044 < arg3) {
                int var6 = this.field8047 * this.field8047 / (arg2 * 2);
                int var7 = this.field8044 + var6;
                if (var7 < arg3 && var7 >= this.field8044) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else if (this.field8047 < 0 && this.field8044 > arg3) {
                int var9 = this.field8047 * this.field8047 / (arg2 * 2);
                int var10 = this.field8044 - var9;
                if (var10 > arg3 && var10 <= this.field8044) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else {
                var8 = false;
            }
            if (var8) {
                if (this.field8044 >= arg3) {
                    this.field8047 -= arg2;
                    if (arg1 != 0 && -arg1 > this.field8047) {
                        this.field8047 = -arg1;
                    }
                } else {
                    this.field8047 += arg2;
                    if (arg1 != 0 && arg1 < this.field8047) {
                        this.field8047 = arg1;
                    }
                }
                if (this.field8047 != var5) {
                    int var11 = this.field8047 * this.field8047 / (arg2 * 2);
                    if (arg3 > this.field8044) {
                        if (arg3 < this.field8044 + var11) {
                            this.field8047 = var5;
                        }
                    } else if (this.field8044 > arg3 && arg3 > (this.field8044 - var11)) {
                        this.field8047 = var5;
                    }
                }
            } else if (this.field8047 <= 0) {
                this.field8047 += arg2;
                if (this.field8047 > 0) {
                    this.field8047 = 0;
                }
            } else {
                this.field8047 -= arg2;
                if (this.field8047 < 0) {
                    this.field8047 = 0;
                }
            }
            if (arg0 > -117) {
                field8053 = true;
            }
            this.field8044 += this.field8047 + var5 >> 1;
            return var8;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field8058[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLega;)I")
    public static final int method4073(byte arg0, class742 arg1) {
        try {
            field8057++;
            if (class339.field5532 == arg1) {
                return 5890;
            } else if (class186.field2964 == arg1) {
                return 34167;
            } else if (class612.field8798 == arg1) {
                return 34168;
            } else if (class119.field1723 == arg1) {
                return 34166;
            } else if (arg0 >= -94) {
                return 124;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8058[4] + arg0 + ',' + (arg1 == null ? field8058[3] : field8058[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method4074(int arg0) {
        try {
            field8055 = null;
            if (arg0 != -2813) {
                field8053 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8058[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4075(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4076(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
