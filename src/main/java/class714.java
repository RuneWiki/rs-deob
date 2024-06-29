import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class714 extends class687 {

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Z")
    public boolean field10159 = true;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field10161 = new String[] { method5183(method5182("s\u0004|jW")), method5183(method5182("f_>(")), method5183(method5182("}N|\u000f\u0002")), method5183(method5182("}N|\u0003\u0002")), method5183(method5182("}N|\f\u0002")), method5183(method5182("&\u0004|")), method5183(method5182("}N|\u0000\u0002")), method5183(method5182("}N|\u0001\u0002")), method5183(method5182("}N|\t\u0002")), method5183(method5182("}N|\u000e\u0002")), method5183(method5182("}N|\u0005\u0002")), method5183(method5182("}N|\b\u0002")), method5183(method5182("}N|\u0006\u0002")), method5183(method5182("}N|\r\u0002")), method5183(method5182("}N|\u0007\u0002")), method5183(method5182("}N|\u0002\u0002")) };

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "[I")
    public static int[] field10145 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lsb;")
    public static class261 field10141 = new class261(41, 0);

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lgia;")
    public static class173 field10153 = new class173(method5183(method5182("Dc\u0004\u0001")), 0);

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Lpc;")
    public class632 field10152;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Z")
    public static boolean field10154;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
    private int[] field10142;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "[I")
    public int[] field10156;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field10139;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "[[I")
    private int[][] field10155;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
    public final void method5169(int arg0) {
        try {
            if (arg0 < 66) {
                this.method5176(127, 115, 68);
            }
            field10146++;
            if (this.field10156 != null) {
                for (int var2 = 0; var2 < this.field10156.length; var2++) {
                    this.field10156[var2] = class10.method71(this.field10156[var2], 32768);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10161[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjc;)V")
    private final void method5170(int arg0, int arg1, class711 arg2) {
        try {
            field10148++;
            if (arg0 < 98) {
                field10154 = false;
            }
            if (arg1 == 1) {
                this.field10139 = class793.method5716('<', arg2.method5144(-16414), -23);
            } else if (arg1 == 2) {
                int var9 = arg2.method5128(0);
                this.field10156 = new int[var9];
                for (int var10 = 0; var10 < var9; var10++) {
                    this.field10156[var10] = arg2.method5116((byte) -120);
                }
            } else if (arg1 == 3) {
                int var4 = arg2.method5128(0);
                this.field10142 = new int[var4];
                this.field10155 = new int[var4][];
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = arg2.method5116((byte) -111);
                    class671 var7 = class47.method514(var6, -1);
                    if (var7 != null) {
                        this.field10142[var5] = var6;
                        this.field10155[var5] = new int[var7.field9453];
                        for (int var8 = 0; var8 < var7.field9453; var8++) {
                            this.field10155[var5][var8] = arg2.method5116((byte) -105);
                        }
                    }
                }
            } else if (arg1 == 4) {
                this.field10159 = false;
                return;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10161[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10161[1] : field10161[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljc;B)Ljava/lang/String;")
    public final String method5171(class711 arg0, byte arg1) {
        try {
            if (arg1 != 2) {
                return null;
            }
            field10149++;
            StringBuffer var3 = new StringBuffer(80);
            if (this.field10142 != null) {
                for (int var4 = 0; var4 < this.field10142.length; var4++) {
                    var3.append(this.field10139[var4]);
                    var3.append(this.field10152.method4622(true, arg0.method5095(arg1 ^ 0x7B, class47.method514(this.field10142[var4], arg1 - 3).field9447), this.field10155[var4], this.method5181(var4, -19612)));
                }
            }
            var3.append(this.field10139[this.field10139.length - 1]);
            return var3.toString();
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10161[15] + (arg0 == null ? field10161[1] : field10161[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method5172(int arg0, int arg1) {
        try {
            field10144++;
            if (class451.field6612.field9098.method1126(3) == 0) {
                arg0 = -1;
            }
            if (class304.field4232 != arg0) {
                if (arg0 != arg1) {
                    class198 var2 = class443.field6547.method4515(arg1 + 65, arg0);
                    class66 var3 = var2.method1713(-94);
                    if (var3 == null) {
                        arg0 = -1;
                    } else {
                        class651.field9249.method1568(var3.method703(), var3.method699(), var3.method693(), 17, class560.field8153, new Point(var2.field2935, var2.field2931));
                        class304.field4232 = arg0;
                    }
                }
                if (arg0 == -1 && class304.field4232 != -1) {
                    class651.field9249.method1568(null, -1, -1, arg1 ^ 0xFFFFFFEE, class560.field8153, new Point());
                    class304.field4232 = -1;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10161[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
    public static final void method5173(int arg0, short[] arg1, String[] arg2) {
        try {
            field10158++;
            if (arg0 == -1457) {
                class256.method2142((byte) 82, arg2.length - 1, arg1, arg2, 0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10161[3] + arg0 + ',' + (arg1 == null ? field10161[1] : field10161[0]) + ',' + (arg2 == null ? field10161[1] : field10161[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method5174(int arg0) {
        try {
            field10147++;
            StringBuffer var2 = new StringBuffer(80);
            if (this.field10139 == null) {
                return "";
            }
            var2.append(this.field10139[0]);
            if (arg0 != 32768) {
                return null;
            }
            for (int var3 = 1; var3 < this.field10139.length; var3++) {
                var2.append(field10161[5]);
                var2.append(this.field10139[var3]);
            }
            return var2.toString();
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10161[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method5175(int arg0) {
        try {
            field10141 = null;
            field10145 = null;
            if (arg0 == 512) {
                field10153 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10161[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
    public final int method5176(int arg0, int arg1, int arg2) {
        try {
            field10151++;
            if (this.field10142 == null || arg2 < 0 || arg2 > this.field10142.length) {
                return -1;
            } else if (arg0 < 101) {
                return -120;
            } else if (this.field10155[arg2] == null || arg1 < 0 || arg1 > this.field10155[arg2].length) {
                return -1;
            } else {
                return this.field10155[arg2][arg1];
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10161[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[ILjc;)V")
    public final void method5177(byte arg0, int[] arg1, class711 arg2) {
        try {
            field10160++;
            if (this.field10142 != null && arg0 == 82) {
                for (int var4 = 0; var4 < this.field10142.length; var4++) {
                    if (arg1.length <= var4) {
                        return;
                    }
                    int var5 = this.method5181(var4, -19612).field9450;
                    if (var5 > 0) {
                        arg2.method5093(false, (long) arg1[var4], var5);
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10161[2] + arg0 + ',' + (arg1 == null ? field10161[1] : field10161[0]) + ',' + (arg2 == null ? field10161[1] : field10161[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjc;)V")
    public final void method5178(int arg0, class711 arg1) {
        try {
            if (arg0 == -1) {
                while (true) {
                    int var3 = arg1.method5128(0);
                    if (var3 == 0) {
                        field10143++;
                        return;
                    }
                    this.method5170(112, var3, arg1);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10161[12] + arg0 + ',' + (arg1 == null ? field10161[1] : field10161[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
    public static final void method5179(int arg0) {
        try {
            if (arg0 == 512) {
                field10157++;
                for (class489 var1 = (class489) class574.field8309.method3977((byte) -95); var1 != null; var1 = (class489) class574.field8309.method3987(arg0 - 512)) {
                    class747 var2 = var1.field7165;
                    if (class694.field9700 > var2.field10611) {
                        var1.method4294(0);
                        var2.method5411(-112);
                    } else if (class694.field9700 >= var2.field10632) {
                        var2.method5404(114);
                        if (var2.field10621 > 0) {
                            class527 var3 = (class527) class479.field7063.method3693(false, (long) (var2.field10621 - 1));
                            if (var3 != null) {
                                class717 var4 = var3.field7672;
                                if (var4.field2969 >= 0 && var4.field2969 < class625.field8929 * 512 && var4.field2984 >= 0 && class14.field187 * 512 > var4.field2984) {
                                    var2.method5403(16383, class100.method977(-1, var4.field2984, var2.field2981, var4.field2969) - var2.field10613, var4.field2984, class694.field9700, var4.field2969);
                                }
                            }
                        }
                        if (var2.field10621 < 0) {
                            int var5 = -var2.field10621 - 1;
                            class339 var6;
                            if (class241.field3470 == var5) {
                                var6 = class203.field2988;
                            } else {
                                var6 = class748.field10666[var5];
                            }
                            if (var6 != null && var6.field2969 >= 0 && class625.field8929 * 512 > var6.field2969 && var6.field2984 >= 0 && (class14.field187 * 512) > var6.field2984) {
                                var2.method5403(arg0 + 15871, class100.method977(-1, var6.field2984, var2.field2981, var6.field2969) - var2.field10613, var6.field2984, class694.field9700, var6.field2969);
                            }
                        }
                        var2.method5412(class393.field5721, 100);
                        class90.method889(var2, true);
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10161[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)I")
    public final int method5180(int arg0) {
        try {
            if (arg0 >= -122) {
                this.method5177((byte) 3, null, null);
            }
            field10150++;
            return this.field10142 == null ? 0 : this.field10142.length;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10161[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lhj;")
    public final class671 method5181(int arg0, int arg1) {
        try {
            field10140++;
            if (arg1 != -19612) {
                this.method5174(83);
            }
            return this.field10142 == null || arg0 < 0 || arg0 > this.field10142.length ? null : class47.method514(this.field10142[arg0], -1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10161[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5182(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5183(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
