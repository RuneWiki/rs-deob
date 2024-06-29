import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class649 {

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Z")
    public boolean field198;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "F")
    public float field201;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "F")
    public float field202;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field206 = new String[] { method136(method135("TS\n5j")), method136(method135("Z\u001f\nP?")), method136(method135("ODH\u0012")), method136(method135("TS\nB+OXP@j")), method136(method135("TS\n7j")), method136(method135("\u001dRK\u0012\u007fGW\u0013Nr\u0011\u000f")), method136(method135("\u001dRK\u0012\u007fGWB\u0018r\u0011\u000f")), method136(method135("\u001dRK\u0012\u007fB\u0001B\u0018r\u0011\u000f")), method136(method135("\u001dRK\u0012\u007f\u0011\u0001B\u0018r\u0011\u000f")), method136(method135("\u001dRK\u0012\u007f\u0015\u0001B\u0018r\u0011\u000f")), method136(method135("\u001dRK\u0012\u007fGW\u0017Nr\u0011\u000f")), method136(method135("\u001dRK\u0012\u007f\u0019\u0001B\u0018r\u0011\u000f")), method136(method135("TS\n4j")), method136(method135("\u001dRK\u0012\u007fGW\u0014Nr\u0011\u000f")), method136(method135("\u001dRK\u0012\u007fGWFNr\u0011\u000f")) };

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Lat;")
    public static class398 field203 = new class398();

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "[C")
    private static char[] field204 = new char[64];

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field200;

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field204[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field204[var1] = (char) (var1 + -26 + 97);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field204[var2] = (char) (var2 + 48 + -52);
        }
        field204[63] = '-';
        field204[62] = '*';
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIZ[III)V", line = 4)
    public class20(class159 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            if (super.field3507 == 34037) {
                this.field198 = false;
                this.field201 = (float) arg2;
                this.field202 = (float) arg3;
            } else {
                this.field198 = true;
                this.field201 = this.field202 = 1.0F;
            }
            this.field205 = arg2;
            this.field197 = arg3;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field206[1] : field206[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIII)V", line = 25)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            if (super.field3507 == 34037) {
                this.field202 = (float) arg4;
                this.field201 = (float) arg3;
                this.field198 = false;
            } else {
                this.field201 = this.field202 = 1.0F;
                this.field198 = true;
            }
            this.field205 = arg3;
            this.field197 = arg4;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 46)
    public static void method132(int arg0) {
        try {
            field203 = null;
            if (arg0 == 0) {
                field204 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field206[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 57)
    public static final String method133(int arg0, int arg1, byte arg2) {
        try {
            ++field199;
            int var3 = arg0 - arg1;
            if (var3 < -9) {
                return field206[13];
            } else if (~var3 > 5) {
                return field206[10];
            } else if (~var3 > 2) {
                return field206[5];
            } else if (~var3 > -1) {
                return field206[14];
            } else if (var3 > 9) {
                return field206[8];
            } else {
                if (arg2 > -88) {
                    field204 = null;
                }
                if (var3 > 6) {
                    return field206[9];
                } else if (~var3 < -4) {
                    return field206[11];
                } else {
                    return ~var3 < -1 ? field206[7] : field206[6];
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field206[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIIIIZ)V", line = 102)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        try {
            this.field198 = false;
            this.field201 = (float) arg3 / (float) arg5;
            this.field205 = arg3;
            this.field202 = (float) arg4 / (float) arg6;
            this.field197 = arg4;
            this.method4732(false, 118, false);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIII[I)V", line = 115)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        try {
            this.field205 = arg1;
            this.field197 = arg2;
            this.method4733(0, arg5, 0, true, arg2, (byte) -128, arg1, 0, 0);
            this.field201 = (float) arg1 / (float) arg3;
            this.field198 = false;
            this.field202 = (float) arg2 / (float) arg4;
            this.method4732(false, 119, false);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field206[1] : field206[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIIIZ)V", line = 130)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        try {
            this.field197 = arg5;
            if (~super.field3507 != -34038) {
                this.field198 = true;
                this.field201 = this.field202 = 1.0F;
            } else {
                this.field202 = (float) arg5;
                this.field201 = (float) arg4;
                this.field198 = false;
            }
            this.field205 = arg4;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIIZ[BI)V", line = 153)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            if (~super.field3507 == -34038) {
                this.field201 = (float) arg3;
                this.field202 = (float) arg4;
                this.field198 = false;
            } else {
                this.field201 = this.field202 = 1.0F;
                this.field198 = true;
            }
            this.field205 = arg3;
            this.field197 = arg4;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field206[1] : field206[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIII)V", line = 174)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field201 = (float) arg2 / (float) arg4;
            this.field205 = arg2;
            this.field202 = (float) arg3 / (float) arg5;
            this.field198 = false;
            this.field197 = arg3;
            this.method4732(false, 118, false);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V", line = 188)
    public static final void method134(int arg0, int arg1, int arg2) {
        try {
            int var3 = 117 % ((arg1 - -53) / 43);
            ++field200;
            class263.field4279 = arg2;
            class705.field10114 = arg0;
            if (class184.field2931 == 0) {
                class82.field1244 = class231.field3575 * 2 + class263.field4279;
                class413.field6569 = class49.field574 * 2 + class705.field10114;
            } else if (class184.field2931 == 1) {
                class258.field3904 = class705.field10114 / class742.field10924 + 2 + class433.field6791;
                class152.field2133 = class263.field4279 / class667.field9483 + 2 + class431.field6774;
                class82.field1244 = class667.field9483 * class152.field2133;
                class413.field6569 = class742.field10924 * class258.field3904;
                class231.field3575 = class82.field1244 - class263.field4279 >> 1;
                class49.field574 = class413.field6569 - class705.field10114 >> 1;
            } else if (~class184.field2931 == -3) {
                class82.field1244 = class263.field4279;
                class413.field6569 = class705.field10114;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field206[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lvf;IIIII[BI)V", line = 225)
    public class20(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field205 = arg2;
            this.field197 = arg3;
            this.method4731(arg2, arg7, arg6, true, 0, 0, 0, -26658, 0, arg3);
            this.field201 = (float) arg2 / (float) arg4;
            this.field198 = false;
            this.field202 = (float) arg3 / (float) arg5;
            this.method4732(false, 124, false);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field206[3] + (arg0 != null ? field206[1] : field206[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field206[1] : field206[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method135(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method136(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
