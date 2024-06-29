import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class697 implements class34 {

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "Lgda;")
    private class58 field10045;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Ljava/lang/String;")
    private String field10043;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10047 = new String[] { method5069(method5068("\u000e+\u0012h`G")), method5069(method5068("\u0014b]hY")), method5069(method5068("\u000e+\u0012haG")), method5069(method5068("\u00019\u001f*")), method5069(method5068("\u000e+\u0012hfG")), method5069(method5068("\u000e+\u0012heG")), method5069(method5068("\u000e+\u0012hbG")), method5069(method5068("\u000e+\u0012hgG")), method5069(method5068("\u000e+\u0012h\u0018\u0006\"\u001a2\u001aG")) };

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field10037 = 100;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method5064(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 > -93) {
                return true;
            } else {
                field10040++;
                return (arg0 & 0xC580) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10047[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Lil;", line = 19)
    public final class7 method345(int arg0) {
        try {
            field10038++;
            int var2 = 100 / ((-arg0 - 55) / 60);
            return class7.field79;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10047[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lmk;I)V", line = 39)
    public static final void method5065(class59 arg0, int arg1) {
        try {
            field10046++;
            int var2 = 98 % ((-arg1 - 27) / 63);
            if (!class16.field177) {
                arg0.method4173(-1);
                class320.field5213--;
                if (arg0.field768) {
                    for (class603 var6 = (class603) class580.field8365.method5147((byte) -80); var6 != null; var6 = (class603) class580.field8365.method5144(256)) {
                        if (var6.field8710.equals(arg0.field760)) {
                            boolean var7 = false;
                            for (class59 var8 = (class59) var6.field8713.method5147((byte) 120); var8 != null; var8 = (class59) var6.field8713.method5144(256)) {
                                if (arg0 == var8) {
                                    var7 = true;
                                    if (var6.method4414(0, arg0)) {
                                        class83.method851(-10241, var6);
                                    }
                                    break;
                                }
                            }
                            if (var7) {
                                return;
                            }
                        }
                    }
                } else {
                    long var3 = arg0.field767;
                    class603 var5;
                    for (var5 = (class603) class324.field5256.method737((byte) -39, var3); var5 != null && !var5.field8710.equals(arg0.field760); var5 = (class603) class324.field5256.method739(true)) {
                    }
                    if (var5 != null && var5.method4414(0, arg0)) {
                        class83.method851(-10241, var5);
                        return;
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10047[2] + (arg0 == null ? field10047[3] : field10047[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIII)V", line = 115)
    public static final void method5066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg4 != 100) {
                field10044 = 11;
            }
            field10036++;
            if (arg0 <= class478.field7264 && class310.field5088 <= arg5) {
                boolean var6;
                if (class546.field8030 > arg1) {
                    var6 = false;
                    arg1 = class546.field8030;
                } else if (arg1 <= class779.field11374) {
                    var6 = true;
                } else {
                    var6 = false;
                    arg1 = class779.field11374;
                }
                boolean var7;
                if (arg3 < class546.field8030) {
                    var7 = false;
                    arg3 = class546.field8030;
                } else if (class779.field11374 < arg3) {
                    var7 = false;
                    arg3 = class779.field11374;
                } else {
                    var7 = true;
                }
                if (arg0 < class310.field5088) {
                    arg0 = class310.field5088;
                } else {
                    class545.method4051(arg1, arg2, arg3, class193.field3047[arg0++], -115);
                }
                if (class478.field7264 >= arg5) {
                    class545.method4051(arg1, arg2, arg3, class193.field3047[arg5--], -124);
                } else {
                    arg5 = class478.field7264;
                }
                if (var6 && var7) {
                    for (int var10 = arg0; var10 <= arg5; var10++) {
                        int[] var11 = class193.field3047[var10];
                        var11[arg1] = var11[arg3] = arg2;
                    }
                } else if (var6) {
                    for (int var9 = arg0; var9 <= arg5; var9++) {
                        class193.field3047[var9][arg1] = arg2;
                    }
                } else if (var7) {
                    for (int var8 = arg0; var8 <= arg5; var8++) {
                        class193.field3047[var8][arg3] = arg2;
                    }
                    return;
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field10047[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lgda;Ljava/lang/String;)V", line = 218)
    public class697(class58 arg0, String arg1) {
        try {
            this.field10045 = arg0;
            this.field10043 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10047[8] + (arg0 == null ? field10047[3] : field10047[1]) + ',' + (arg1 == null ? field10047[3] : field10047[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 227)
    public static final void method5067(int arg0) {
        try {
            class223.field3502 = -2;
            if (arg0 == 19653) {
                class632.field9086 = -2;
                field10039++;
                class9.field104 = 0;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10047[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I", line = 240)
    public final int method346(byte arg0) {
        try {
            field10042++;
            if (this.field10045.method592(-60, this.field10043)) {
                return 100;
            } else if (arg0 < 31) {
                return 105;
            } else {
                return this.field10045.method605(this.field10043, true);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10047[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5068(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5069(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
