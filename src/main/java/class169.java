import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class169 {

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Z")
    public boolean field2479;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Z")
    public boolean field2472;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[S")
    public short[] field2463;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lqu;")
    public static class219 field2469 = new class219(45, 3);

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field2478 = -1;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Lbi;")
    public static class104 field2480;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "[I")
    public static int[] field2481;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    private int field2474;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Las;")
    public class415 field2461;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
    public final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2477 = arg2;
        this.field2460 = arg1;
        if (arg3 != -4309) {
            method1071(null, (byte) 29);
        }
        this.field2468 = arg0;
        field2476++;
        this.field2474 = arg4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    private final void method1067(int arg0) {
        int var2 = this.field2467;
        if (var2 == 2) {
            this.field2468 = 2048;
            this.field2460 = 0;
            this.field2474 = 1;
            this.field2477 = 2048;
        } else if (var2 == 3) {
            this.field2477 = 2048;
            this.field2460 = 0;
            this.field2474 = 1;
            this.field2468 = 4096;
        } else if (var2 == 4) {
            this.field2460 = 0;
            this.field2474 = 4;
            this.field2468 = 2048;
            this.field2477 = 2048;
        } else if (var2 == 5) {
            this.field2477 = 2048;
            this.field2460 = 0;
            this.field2468 = 8192;
            this.field2474 = 4;
        } else if (var2 == 12) {
            this.field2468 = 2048;
            this.field2460 = 0;
            this.field2474 = 2;
            this.field2477 = 2048;
        } else if (var2 == 13) {
            this.field2460 = 0;
            this.field2477 = 2048;
            this.field2474 = 2;
            this.field2468 = 8192;
        } else if (var2 == 10) {
            this.field2468 = 2048;
            this.field2460 = 1536;
            this.field2477 = 512;
            this.field2474 = 3;
        } else if (var2 == 11) {
            this.field2468 = 4096;
            this.field2460 = 1536;
            this.field2477 = 512;
            this.field2474 = 3;
        } else if (var2 == 6) {
            this.field2468 = 2048;
            this.field2474 = 3;
            this.field2460 = 1280;
            this.field2477 = 768;
        } else if (var2 == 7) {
            this.field2477 = 768;
            this.field2474 = 3;
            this.field2460 = 1280;
            this.field2468 = 4096;
        } else if (var2 == 8) {
            this.field2477 = 1024;
            this.field2474 = 3;
            this.field2468 = 2048;
            this.field2460 = 1024;
        } else if (var2 == 9) {
            this.field2468 = 4096;
            this.field2477 = 1024;
            this.field2474 = 3;
            this.field2460 = 1024;
        } else if (var2 == 14) {
            this.field2474 = 1;
            this.field2460 = 1280;
            this.field2468 = 2048;
            this.field2477 = 768;
        } else if (var2 == 15) {
            this.field2460 = 1536;
            this.field2477 = 512;
            this.field2468 = 4096;
            this.field2474 = 1;
        } else if (var2 == 16) {
            this.field2468 = 8192;
            this.field2474 = 1;
            this.field2477 = 256;
            this.field2460 = 1792;
        } else {
            this.field2460 = 0;
            this.field2474 = 0;
            this.field2477 = 2048;
            this.field2468 = 2048;
        }
        field2475++;
        if (arg0 != -27546) {
            this.field2466 = -37;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method1068(int arg0) {
        if (arg0 != 1024) {
            field2480 = null;
        }
        field2480 = null;
        field2469 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILza;BIIII)V")
    private final void method1069(int arg0, class497 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2461 = arg1.method1333(arg3, arg0, arg6, arg5, arg4, 1.0F);
        if (arg2 != 4) {
            this.field2461 = null;
        }
        field2462++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)V")
    public final void method1070(int arg0, int arg1, boolean arg2) {
        field2459++;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field2468 * arg0 / 50 + this.field2466 & 0x7FF;
            int var6 = this.field2474;
            if (var6 == 1) {
                var4 = (class147.field1988[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class421.field6391[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field2461.method207(false, (float) ((this.field2477 * var4 >> 11) + this.field2460) / 2048.0F);
        int var7 = 84 % ((42 - arg1) / 35);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lqc;B)Ljava/lang/String;")
    public static final String method1071(class140 arg0, byte arg1) {
        if (arg1 != -5) {
            field2480 = null;
        }
        field2465++;
        return arg0.field1902 == null || arg0.field1902.length() <= 0 ? arg0.field1899 : arg0.field1899 + class179.field2614.method1583(98, class12.field131) + arg0.field1902;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    public static final void method1072(int arg0, int arg1) {
        if (arg1 < -108) {
            field2470++;
            class456 var2 = class233.method1654(arg0, 7, 125);
            var2.method2862(0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([[BBLhd;)V")
    public static final void method1073(byte[][] arg0, byte arg1, class242 arg2) {
        field2471++;
        if (arg1 > -56) {
            field2478 = 81;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field6995; var4++) {
            class500.method3052(0);
            for (int var5 = 0; var5 < class135.field1839 >> 3; var5++) {
                for (int var6 = 0; var6 < (class197.field3038 >> 3); var6++) {
                    int var7 = class298.field4685[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3D5B137) >> 24;
                        if (!arg2.field6992 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class529.field7782.length; var13++) {
                                if (class529.field7782[var13] == var12 && arg0[var13] != null) {
                                    class208 var14 = new class208(arg0[var13]);
                                    arg2.method2844(var6 * 8, var11, var9, var8, class352.field5488, var4, var14, -120, var5 * 8, var10);
                                    arg2.method1690(var6 * 8, var8, var5 * 8, var10, var3[0] == -1 ? var3 : null, var14, var11, var4, true, class19.field198, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class302.field4737 = class93.field1361.method836(115, class187.field2727, var3[2], var3[0], var3[3], var3[1]);
            class386.field5898 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1074(int arg0, Throwable arg1) throws IOException {
        field2464++;
        String var2;
        if ((arg1 instanceof class490)) {
            class490 var3 = (class490) arg1;
            arg1 = var3.field7415;
            var2 = var3.field7413 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 >= -42) {
            method1073(null, (byte) -27, null);
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    protected class169() {
        if (class421.field6391 == null) {
            class297.method1995(78);
        }
        this.method1067(-27546);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lza;Lhw;I)V")
    public class169(class497 arg0, class208 arg1, int arg2) {
        if (class421.field6391 == null) {
            class297.method1995(113);
        }
        this.field2473 = arg1.method1445(70);
        this.field2479 = (this.field2473 & 0x8) != 0;
        this.field2472 = (this.field2473 & 0x10) != 0;
        this.field2473 &= 0x7;
        int var4 = arg1.method1455(-3387) << arg2;
        int var5 = arg1.method1455(-3387) << arg2;
        int var6 = arg1.method1455(-3387) << arg2;
        int var7 = arg1.method1445(-119);
        int var8 = var7 * 2 + 1;
        this.field2463 = new short[var8];
        for (int var9 = 0; var9 < this.field2463.length; var9++) {
            short var13 = (short) arg1.method1455(-3387);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field2463[var9] = (short) class410.method2621(var14 << 8, var15);
        }
        int var10 = (var7 << class56.field908) + class376.field5781;
        int var11 = class301.field4730 == null ? class329.field5177[class493.method3014(arg1.method1455(-3387), -1947159711) & 0xFFFF] : class301.field4730[arg1.method1455(-3387)];
        int var12 = arg1.method1445(83);
        this.field2467 = var12 & 0x1F;
        this.field2466 = (var12 & 0xE0) << 3;
        if (this.field2467 != 31) {
            this.method1067(-27546);
        }
        this.method1069(var6, arg0, (byte) 4, var4, var11, var10, var5);
    }

    static {
        new class213("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field2480 = new class104(7, -2);
        field2481 = new int[1000];
    }
}
