import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class149 {

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Liha;")
    private class29 field2082 = new class29(256);

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Lgda;")
    private class58 field2084;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2091 = new String[] { method1364(method1363("O]LDR\u0001")), method1364(method1363("O]LD]\u0001")), method1364(method1363("O]LDQ\u0001")), method1364(method1363("O]LDV\u0001")), method1364(method1363("O]LDS\u0001")), method1364(method1363("R\u0016\u0003Dh")), method1364(method1363("O]LD)@VD\u001e+\u0001")), method1364(method1363("GMA\u0006")), method1364(method1363("O]LDW\u0001")), method1364(method1363("O]LDP\u0001")), method1364(method1363("O]LDT\u0001")) };

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "Lhl;")
    public static class556 field2087 = new class556(124, -2);

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "[[I")
    public static int[][] field2089 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Z")
    public static boolean field2090 = true;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIZ)V", line = 4)
    public static final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            field2079++;
            int var6 = arg0 - arg1;
            int var7 = arg2 - arg3;
            if (var7 == 0) {
                if (var6 != 0) {
                    class221.method1954(arg3, arg4, arg1, 31983, arg0);
                }
            } else if (var6 == 0) {
                class212.method1914(arg2, arg3, !arg5, arg1, arg4);
            } else {
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg3;
                    int var10 = arg2;
                    arg3 = arg1;
                    arg1 = var9;
                    arg2 = arg0;
                    arg0 = var10;
                }
                if (arg3 > arg2) {
                    int var11 = arg3;
                    arg3 = arg2;
                    int var12 = arg1;
                    arg1 = arg0;
                    arg2 = var11;
                    arg0 = var12;
                }
                int var13 = arg1;
                int var14 = arg2 - arg3;
                int var15 = arg0 - arg1;
                if (arg5) {
                    field2087 = null;
                }
                int var16 = -(var14 >> 1);
                int var17 = arg1 < arg0 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg3; var19 <= arg2; var19++) {
                        class193.field3047[var19][var13] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg3; var18 <= arg2; var18++) {
                        var16 += var15;
                        class193.field3047[var13][var18] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field2091[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 122)
    public final void method1356(int arg0) {
        try {
            class29 var2 = this.field2082;
            synchronized (this.field2082) {
                this.field2082.method298(5);
            }
            field2083++;
            if (arg0 != 26) {
                this.method1356(5);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2091[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V", line = 136)
    public final void method1357(int arg0, int arg1) {
        try {
            field2078++;
            class29 var3 = this.field2082;
            synchronized (this.field2082) {
                if (arg1 >= 21) {
                    this.field2082.method294(arg0, -630);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2091[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V", line = 150)
    public static final void method1358(int arg0) {
        try {
            class363.field5940.method304(1);
            field2085++;
            if (arg0 != -1) {
                method1362(9, -105, (byte) -61);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2091[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 165)
    public final void method1359(byte arg0) {
        try {
            class29 var2 = this.field2082;
            synchronized (this.field2082) {
                if (arg0 < 66) {
                    method1355(-34, -43, -70, -91, 25, true);
                }
                this.field2082.method304(1);
            }
            field2081++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2091[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 180)
    public static void method1360(boolean arg0) {
        try {
            field2087 = null;
            field2089 = null;
            if (arg0) {
                method1360(true);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2091[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)Luba;", line = 194)
    public final class456 method1361(int arg0, byte arg1) {
        try {
            field2086++;
            class29 var3 = this.field2082;
            class456 var4;
            synchronized (this.field2082) {
                var4 = (class456) this.field2082.method302(-85, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field2084;
            byte[] var6;
            synchronized (this.field2084) {
                var6 = this.field2084.method604((byte) -8, arg0, 26);
            }
            class456 var7 = new class456();
            if (var6 != null) {
                var7.method3539(-63, new class176(var6));
            }
            class29 var8 = this.field2082;
            synchronized (this.field2082) {
                int var9 = -7 / ((arg1 - 78) / 43);
                this.field2082.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2091[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIB)V", line = 225)
    public static final void method1362(int arg0, int arg1, byte arg2) {
        try {
            class182.method1716(-114, arg0, arg1);
            field2080++;
            if (arg2 <= 92) {
                field2088 = 51;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2091[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 238)
    public class149(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field2084 = arg2;
            this.field2084.method580(114, 26);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2091[6] + (arg0 == null ? field2091[7] : field2091[5]) + ',' + arg1 + ',' + (arg2 == null ? field2091[7] : field2091[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1363(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1364(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
