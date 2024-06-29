import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class101 {

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Liha;")
    private class29 field1487 = new class29(64);

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "Lgda;")
    private class58 field1473;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Lgda;")
    public class58 field1480;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1488 = new String[] { method963(method962("-GE!-")), method963(method962("-GE*-")), method963(method962("-GE,-")), method963(method962("&\u001aEFx")), method963(method962("3A\u0007\u0004")), method963(method962("-GE)-")), method963(method962("-GE -")), method963(method962("-GE--")), method963(method962("-GE.-")), method963(method962("-GE/-")), method963(method962("-GETl3]\u001fV-")), method963(method962("-GE\"-")), method963(method962("*C\u001cEr)F\b")), method963(method962("rDV")), method963(method962("5@\u001f\u0018?r\u001b")), method963(method962("rUV")), method963(method962("sW\u0004\u0005*1\t")), method963(method962("*C\u001c")), method963(method962("*C\u001cEr)C\u0002\u0018")), method963(method962("-GE+-")), method963(method962("*C\u001cEr)E\n")) };

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "[I")
    public static int[] field1481 = new int[3];

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "F")
    public static float field1479;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "[[[S")
    public static short[][][] field1485;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V", line = 8)
    public static final void method952(int arg0) {
        try {
            field1478++;
            class683.field9892.method1544((byte) 43);
            class683.field9892.field2666 = null;
            class683.field9892.field2665 = 0;
            class683.field9892.field2670 = null;
            class683.field9892.field2660.field2799 = 0;
            class683.field9892.field2661 = null;
            class683.field9892.field2667 = null;
            class683.field9892.field2663 = 0;
            class272.field4380 = 0;
            class38.method369(122);
            class121.method1181(95);
            for (int var1 = 0; var1 < 2048; var1++) {
                class33.field395[var1] = null;
            }
            class438.field6846 = null;
            for (int var2 = 0; var2 < class421.field6647; var2++) {
                class426 var3 = class78.field1214[var2].field194;
                if (var3 != null) {
                    var3.field1155 = -1;
                }
            }
            class352.method2929((byte) 47);
            class210.field3323 = arg0;
            class344.field5593 = arg0;
            class401.field6334 = 1;
            class302.method2598(11, arg0 - 2);
            for (int var4 = 0; var4 < 100; var4++) {
                class178.field2871[var4] = true;
            }
            class369.method3038(true);
            class72.field1004 = 0L;
            class617.field8917 = null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1488[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([SIII[Ljava/lang/String;)V", line = 62)
    public static final void method953(short[] arg0, int arg1, int arg2, int arg3, String[] arg4) {
        try {
            field1477++;
            if (arg3 < arg2) {
                int var5 = (arg2 + arg3) / 2;
                int var6 = arg3;
                String var7 = arg4[var5];
                arg4[var5] = arg4[arg2];
                arg4[arg2] = var7;
                short var8 = arg0[var5];
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var8;
                for (int var9 = arg3; var9 < arg2; var9++) {
                    if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                        String var10 = arg4[var9];
                        arg4[var9] = arg4[var6];
                        arg4[var6] = var10;
                        short var11 = arg0[var9];
                        arg0[var9] = arg0[var6];
                        arg0[var6++] = var11;
                    }
                }
                arg4[arg2] = arg4[var6];
                arg4[var6] = var7;
                arg0[arg2] = arg0[var6];
                arg0[var6] = var8;
                method953(arg0, arg1, var6 - 1, arg3, arg4);
                method953(arg0, 28707, arg2, var6 + 1, arg4);
            }
            if (arg1 != 28707) {
                field1485 = null;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1488[9] + (arg0 == null ? field1488[4] : field1488[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1488[4] : field1488[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;JJBIZZZ)V", line = 120)
    public static final void method954(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, long arg6, long arg7, byte arg8, int arg9, boolean arg10, boolean arg11, boolean arg12) {
        try {
            field1474++;
            if (arg8 <= -51 && !class16.field177 && class320.field5213 < 500) {
                int var18 = arg3 == -1 ? class561.field8156 : arg3;
                class59 var15 = new class59(arg5, arg4, var18, arg1, arg2, arg6, arg0, arg9, arg12, arg11, arg7, arg10);
                class185.method1735(1, var15);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field1488[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1488[4] : field1488[3]) + ',' + (arg5 == null ? field1488[4] : field1488[3]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Ljava/lang/String;", line = 140)
    public static final String method955(byte arg0) {
        try {
            field1486++;
            String var1 = field1488[17];
            if (class763.field11195 == class417.field6596) {
                var1 = field1488[12];
            } else if (class545.field8024 == class417.field6596) {
                var1 = field1488[20];
            } else if (class417.field6596 == class206.field3218) {
                var1 = field1488[18];
            }
            if (arg0 < 71) {
                return null;
            }
            String var2 = "";
            if (class431.field6777 != null) {
                var2 = field1488[13] + class431.field6777;
            }
            return field1488[14] + var1 + "." + class305.field4924.field8483 + field1488[16] + class795.field11624 + field1488[15] + class734.field10757 + var2 + "/";
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1488[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V", line = 170)
    public final void method956(byte arg0) {
        try {
            int var2 = 8 / ((3 - arg0) / 40);
            class29 var3 = this.field1487;
            synchronized (this.field1487) {
                this.field1487.method304(1);
            }
            field1482++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1488[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V", line = 182)
    public static void method957(int arg0) {
        try {
            if (arg0 == 0) {
                field1481 = null;
                field1485 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1488[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 197)
    public final void method958(int arg0) {
        try {
            class29 var2 = this.field1487;
            synchronized (this.field1487) {
                this.field1487.method298(5);
                if (arg0 != 1) {
                    field1481 = null;
                }
            }
            field1484++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1488[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIIIZI)Z", line = 210)
    public static final boolean method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        try {
            field1475++;
            int var9 = class438.field6846.field1201[0];
            int var10 = class438.field6846.field1200[0];
            if (arg4 != 626) {
                return false;
            } else if (var9 < 0 || var9 >= class126.field1823 || var10 < 0 || class169.field2725 <= var10) {
                return false;
            } else if (arg2 >= 0 && arg2 < class126.field1823 && arg1 >= 0 && class169.field2725 > arg1) {
                int var11 = class590.method4332(arg6, arg0, class196.field3121, arg8, arg3, arg7, arg1, class297.field4841[class438.field6846.field9975], var9, class326.field5358, var10, 53, arg5, arg2, class438.field6846.method804(true));
                if (var11 < 1) {
                    return false;
                }
                class83.field1262 = class196.field3121[var11 - 1];
                class232.field3598 = class326.field5358[var11 - 1];
                class499.field7490 = false;
                class67.method704(-60);
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1488[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V", line = 244)
    public final void method960(int arg0, byte arg1) {
        try {
            class29 var3 = this.field1487;
            synchronized (this.field1487) {
                if (arg1 >= -66) {
                    this.method961((byte) 11, -110);
                }
                this.field1487.method294(arg0, -630);
            }
            field1476++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1488[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Ljba;", line = 263)
    public final class421 method961(byte arg0, int arg1) {
        try {
            field1483++;
            class29 var3 = this.field1487;
            class421 var4;
            synchronized (this.field1487) {
                var4 = (class421) this.field1487.method302(-78, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field1473;
            byte[] var6;
            synchronized (this.field1473) {
                var6 = this.field1473.method604((byte) -123, arg1, 3);
            }
            class421 var7 = new class421();
            if (arg0 > -103) {
                this.method961((byte) -86, -29);
            }
            var7.field6642 = this;
            if (var6 != null) {
                var7.method3350(25624, new class176(var6));
            }
            class29 var8 = this.field1487;
            synchronized (this.field1487) {
                this.field1487.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1488[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V", line = 298)
    public class101(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field1473 = arg2;
            this.field1480 = arg3;
            this.field1473.method580(107, 3);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1488[10] + (arg0 == null ? field1488[4] : field1488[3]) + ',' + arg1 + ',' + (arg2 == null ? field1488[4] : field1488[3]) + ',' + (arg3 == null ? field1488[4] : field1488[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method962(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method963(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
