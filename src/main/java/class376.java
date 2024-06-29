import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class376 {

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public int field5494 = -1;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5498 = "Loading interfaces - ";

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "Ljf;")
    public static class119 field5507 = null;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field5514 = 0;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Lcs;")
    private class189 field5515;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Ljava/lang/String;")
    private String field5497;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Ljava/lang/String;")
    private String field5509;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
    private int[] field5489;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "[I")
    private int[] field5490;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
    private int[] field5492;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
    private int[] field5496;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
    private int[] field5499;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
    private int[] field5501;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
    private int[] field5502;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "[I")
    private int[] field5511;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "[Ljf;")
    public static class119[] field5517;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field5506;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field5513;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "[[I")
    private int[][] field5500;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "[[I")
    private int[][] field5505;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "[[I")
    private int[][] field5508;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method2359(byte arg0) {
        if (this.field5509 == null) {
            this.field5509 = this.field5497;
        }
        if (arg0 == -83) {
            field5504++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILbk;)V")
    private final void method2360(int arg0, int arg1, class211 arg2) {
        if (arg0 != 2) {
            method2363(109, 50);
        }
        field5493++;
        if (arg1 == 1) {
            this.field5497 = arg2.method1365((byte) -125);
        } else if (arg1 == 2) {
            this.field5509 = arg2.method1365((byte) -124);
        } else if (arg1 == 3) {
            int var4 = arg2.method1342((byte) -126);
            this.field5508 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5508[var5][0] = arg2.method1355(32136);
                this.field5508[var5][1] = arg2.method1336((byte) -109);
                this.field5508[var5][2] = arg2.method1336((byte) -98);
            }
        } else if (arg1 == 4) {
            int var6 = arg2.method1342((byte) -126);
            this.field5500 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5500[var7][0] = arg2.method1355(32136);
                this.field5500[var7][1] = arg2.method1336((byte) -89);
                this.field5500[var7][2] = arg2.method1336((byte) -89);
            }
        } else if (arg1 == 5) {
            arg2.method1355(32136);
        } else if (arg1 == 6) {
            arg2.method1342((byte) -126);
        } else if (arg1 == 7) {
            arg2.method1342((byte) -126);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method1342((byte) -128);
                return;
            }
            if (arg1 != 10) {
                if (arg1 == 12) {
                    arg2.method1336((byte) -56);
                    return;
                }
                if (arg1 != 13) {
                    if (arg1 != 14) {
                        if (arg1 == 15) {
                            arg2.method1355(32136);
                        } else if (arg1 == 17) {
                            this.field5494 = arg2.method1355(arg0 + 32134);
                            return;
                        } else if (arg1 == 18) {
                            int var8 = arg2.method1342((byte) -128);
                            this.field5489 = new int[var8];
                            this.field5499 = new int[var8];
                            this.field5502 = new int[var8];
                            this.field5506 = new String[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field5489[var9] = arg2.method1336((byte) -85);
                                this.field5502[var9] = arg2.method1336((byte) -91);
                                this.field5499[var9] = arg2.method1336((byte) -104);
                                this.field5506[var9] = arg2.method1350(arg0 + 124);
                            }
                            return;
                        } else if (arg1 == 19) {
                            int var10 = arg2.method1342((byte) -126);
                            this.field5513 = new String[var10];
                            this.field5492 = new int[var10];
                            this.field5511 = new int[var10];
                            this.field5490 = new int[var10];
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field5511[var11] = arg2.method1336((byte) -64);
                                this.field5490[var11] = arg2.method1336((byte) -76);
                                this.field5492[var11] = arg2.method1336((byte) -38);
                                this.field5513[var11] = arg2.method1350(97);
                            }
                            return;
                        } else if (arg1 == 249) {
                            int var12 = arg2.method1342((byte) -127);
                            if (this.field5515 == null) {
                                int var13 = class279.method1761(false, var12);
                                this.field5515 = new class189(var13);
                            }
                            for (int var14 = 0; var14 < var12; var14++) {
                                boolean var15 = arg2.method1342((byte) -127) == 1;
                                int var16 = arg2.method1353(108);
                                class359 var17;
                                if (var15) {
                                    var17 = new class206(arg2.method1350(arg0 + 51));
                                } else {
                                    var17 = new class193(arg2.method1336((byte) -37));
                                }
                                this.field5515.method1202(-1, (long) var16, var17);
                            }
                            return;
                        }
                        return;
                    }
                    int var18 = arg2.method1342((byte) -127);
                    this.field5505 = new int[var18][2];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field5505[var19][0] = arg2.method1342((byte) -127);
                        this.field5505[var19][1] = arg2.method1342((byte) -126);
                    }
                    return;
                }
                int var20 = arg2.method1342((byte) -126);
                this.field5496 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5496[var21] = arg2.method1355(32136);
                }
                return;
            }
            int var22 = arg2.method1342((byte) -127);
            this.field5501 = new int[var22];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5501[var23] = arg2.method1336((byte) -22);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILbk;)V")
    public final void method2361(int arg0, class211 arg1) {
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                field5491++;
                int var4 = -2 % ((arg0 - 71) / 52);
                return;
            }
            this.method2360(2, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
    public static final void method2362(byte arg0) {
        class169.field2360.method809(252, -28022);
        class351.field5120++;
        field5495++;
        if (arg0 == -107) {
            class169.field2360.method1396(21375, 0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public static final void method2363(int arg0, int arg1) {
        class162.field2284 = arg0;
        if (arg1 >= -103) {
            method2366(64, -6, -94, 68, -79);
        }
        class100.field1118 = 100;
        field5516++;
        class48.field561 = -1;
        class239.field3249 = 3;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5498 = null;
        field5507 = null;
        field5517 = null;
        if (arg0 != 14) {
            field5514 = 79;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V")
    public static final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5512++;
        if (arg1 != -20) {
            field5514 = 106;
        }
        int var6 = class115.method640((byte) -102, class407.field5914, arg3, class20.field209);
        int var7 = class115.method640((byte) -107, class407.field5914, arg5, class20.field209);
        int var8 = class115.method640((byte) -109, class128.field1785, arg0, class143.field2029);
        int var9 = class115.method640((byte) -124, class128.field1785, arg4, class143.field2029);
        for (int var10 = var6; var10 <= var7; var10++) {
            class105.method564(arg2, var8, 0, class318.field4522[var10], var9);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
    public static final void method2366(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class143.field2029 = arg0;
        class128.field1785 = arg3;
        class407.field5914 = arg1;
        field5510++;
        class20.field209 = arg4;
        if (arg2 != 0) {
            field5498 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Z")
    public static final boolean method2367(int arg0, int arg1) {
        class164.field2292 = arg1 + 1 & 0xFFFF;
        field5503++;
        class252.field3407 = true;
        int var2 = -116 % ((-arg0 - 10) / 43);
        return true;
    }
}
