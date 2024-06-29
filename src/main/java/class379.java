import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class379 extends class225 {

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Z")
    public boolean field5504 = true;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5507 = "Attack";

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "Ljava/lang/String;")
    public static String field5505 = "slide:";

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field5520 = 0;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
    public static int[] field5500 = new int[50];

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field5514 = 0;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field5521 = 0;

    @OriginalMember(owner = "client!cm", name = "Z", descriptor = "F")
    public static float field5527;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!cm", name = "Y", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!cm", name = "ab", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Llm;")
    public static class347 field5498;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Llm;")
    public static class347 field5512;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "[I")
    public int[] field5516;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "[I")
    private int[] field5519;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field5522;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[[B")
    public static byte[][] field5503;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "[[I")
    private int[][] field5511;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)I")
    public static final int method2450(int arg0, int arg1, int arg2) {
        field5528++;
        int var3 = arg1 >>> 24;
        if (arg2 != -1037365176) {
            field5503 = null;
        }
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method2451(int arg0) {
        if (this.field5516 != null) {
            for (int var2 = 0; var2 < this.field5516.length; var2++) {
                this.field5516[var2] = class351.method2313(this.field5516[var2], 32768);
            }
        }
        if (arg0 == 32768) {
            field5510++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lnj;B)V")
    public final void method2452(class228 arg0, byte arg1) {
        field5501++;
        if (arg1 != 108) {
            return;
        }
        while (true) {
            int var3 = arg0.method1348(arg1 - 226);
            if (var3 == 0) {
                return;
            }
            this.method2455(arg0, arg1 - 107, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lk;Llm;Llm;Z)V")
    public static final void method2453(class292 arg0, class347 arg1, class347 arg2, boolean arg3) {
        field5524++;
        class396.field5851 = arg0;
        if (arg3) {
            return;
        }
        class225.field2956 = arg1;
        class397.field5911 = arg2;
        if (class397.field5911 != null) {
            field5520 = class397.field5911.method2272(96, 1);
        }
        if (class225.field2956 != null) {
            class164.field2212 = class225.field2956.method2272(117, 1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
    public final int method2454(int arg0, int arg1) {
        if (arg0 == -7200) {
            field5506++;
            return this.field5519 == null || arg1 < 0 || arg1 > this.field5519.length ? -1 : this.field5519[arg1];
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lnj;II)V")
    private final void method2455(class228 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5522 = class243.method1459(arg0.method1329(991328496), '<', 0);
        } else if (arg2 == 2) {
            int var8 = arg0.method1348(-110);
            this.field5516 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5516[var9] = arg0.method1343(255);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1348(arg1 ^ 0xFFFFFF95);
            this.field5511 = new int[var4][];
            this.field5519 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1343(arg1 + 254);
                this.field5519[var5] = var6;
                this.field5511[var5] = new int[class321.field4729[var6]];
                for (int var7 = 0; var7 < class321.field4729[var6]; var7++) {
                    this.field5511[var5][var7] = arg0.method1343(class399.method2571(arg1, 254));
                }
            }
        } else if (arg2 == 4) {
            this.field5504 = false;
        }
        field5515++;
        if (arg1 != 1) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)I")
    public final int method2456(int arg0) {
        field5513++;
        if (this.field5519 == null) {
            return 0;
        } else {
            int var2 = -96 % ((arg0 - 66) / 36);
            return this.field5519.length;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lnj;B)Ljava/lang/String;")
    public final String method2457(class228 arg0, byte arg1) {
        if (arg1 > -17) {
            return null;
        }
        field5517++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5519 != null) {
            for (int var4 = 0; var4 < this.field5519.length; var4++) {
                var3.append(this.field5522[var4]);
                var3.append(class410.method2632(this.field5511[var4], -14998, this.field5519[var4], arg0.method1364((byte) 42, class17.field233[this.field5519[var4]])));
            }
        }
        var3.append(this.field5522[this.field5522.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIIIIIIIIZLnj;)V")
    public static final void method2458(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, class228 arg11) {
        field5499++;
        if (arg0 == 1) {
            arg4 = 1;
        } else if (arg0 == 2) {
            arg4 = 1;
            arg7 = 1;
        } else if (arg0 == 3) {
            arg7 = 1;
        }
        if (arg2 >= 0 && class192.field2574 > arg2 && arg3 >= 0 && arg3 < class364.field5262) {
            if (!arg10 && !arg1) {
                class103.field1430[arg9][arg2][arg3] = 0;
            }
            while (true) {
                int var12 = arg11.method1348(-97);
                if (var12 == 0) {
                    if (arg10) {
                        class331.field4817[0][arg2 + arg7][arg3 + arg4] = class265.field3846[0].method742(arg2 + arg7, arg3 + arg4);
                    } else if (arg9 == 0) {
                        class331.field4817[0][arg2 + arg7][arg3 + arg4] = -class104.method701((byte) 50, arg6 + 932731, arg8 + 556238) * 8;
                    } else {
                        class331.field4817[arg9][arg2 + arg7][arg3 + arg4] = class331.field4817[arg9 - 1][arg2 + arg7][arg3 + arg4] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg11.method1348(-90);
                    if (arg10) {
                        class331.field4817[0][arg2 + arg7][arg3 + arg4] = class265.field3846[0].method742(arg2 + arg7, arg3 + arg4) + (var13 * 8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg9 == 0) {
                            class331.field4817[0][arg2 + arg7][arg3 + arg4] = -var13 * 8;
                        } else {
                            class331.field4817[arg9][arg2 + arg7][arg3 + arg4] = class331.field4817[arg9 - 1][arg2 + arg7][arg3 + arg4] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg11.method1348(-98);
                    } else {
                        class424.field6267[arg9][arg2][arg3] = arg11.method1349(3);
                        class390.field5619[arg9][arg2][arg3] = (byte) ((var12 - 2) / 4);
                        class253.field3494[arg9][arg2][arg3] = (byte) class183.method1117(3, arg0 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg10 && !arg1) {
                        class103.field1430[arg9][arg2][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    class302.field4447[arg9][arg2][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg11.method1348(-102);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg11.method1348(-118);
                    break;
                }
                if (var14 <= 49) {
                    arg11.method1348(-124);
                }
            }
        }
        if (arg5 < 63) {
            field5500 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
    public static void method2459(int arg0) {
        field5512 = null;
        field5498 = null;
        field5507 = null;
        field5503 = null;
        field5505 = null;
        field5500 = null;
        if (arg0 != 0) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZI)I")
    public final int method2460(int arg0, boolean arg1, int arg2) {
        field5526++;
        if (this.field5519 == null || arg0 < 0 || arg0 > this.field5519.length) {
            return -1;
        } else if (this.field5511[arg0] == null || arg2 < 0 || arg2 > this.field5511[arg0].length) {
            return -1;
        } else {
            if (!arg1) {
                this.method2451(102);
            }
            return this.field5511[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([IBLnj;)V")
    public final void method2461(int[] arg0, byte arg1, class228 arg2) {
        field5518++;
        if (this.field5519 == null) {
            return;
        }
        if (arg1 <= 72) {
            this.field5511 = null;
        }
        for (int var4 = 0; var4 < this.field5519.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class26.field380[this.method2454(-7200, var4)];
            if (var5 > 0) {
                arg2.method1368(117, (long) arg0[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Z")
    public static final boolean method2462(int arg0, byte arg1) {
        field5502++;
        if (arg0 == 14 || arg0 == 49 || arg0 == 28 || arg0 == 33 || arg0 == 1006) {
            return true;
        } else if (arg0 == 13 || arg0 == 40 || arg0 == 1008) {
            return true;
        } else if (arg1 == 44) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)Ljava/lang/String;")
    public final String method2463(int arg0) {
        field5509++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5522 == null) {
            return "";
        }
        var2.append(this.field5522[0]);
        for (int var3 = 1; var3 < this.field5522.length; var3++) {
            var2.append("...");
            var2.append(this.field5522[var3]);
        }
        if (arg0 > -16) {
            field5514 = 41;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZILjava/lang/String;)V")
    public static final void method2464(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6) {
        field5525++;
        class286 var7 = new class286();
        var7.field4146 = arg5;
        var7.field4152 = arg6;
        var7.field4150 = class28.field418 + arg3;
        if (!arg4) {
            field5505 = null;
        }
        var7.field4141 = arg0;
        var7.field4147 = arg1;
        var7.field4149 = arg2;
        class419.field6205.method1003(2166, var7);
    }
}
