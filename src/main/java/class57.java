import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class57 {

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public int field762 = -1;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "Ltq;")
    public static class536 field758 = new class536(4);

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "[I")
    public static int[] field763 = new int[4096];

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Lrda;")
    private class467 field756;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "Ljava/lang/String;")
    private String field741;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "Ljava/lang/String;")
    private String field754;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "[I")
    private int[] field740;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "[I")
    private int[] field742;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "[I")
    private int[] field747;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "[I")
    private int[] field753;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field751;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field761;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[[I")
    private int[][] field739;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "[[I")
    private int[][] field750;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "[[I")
    private int[][] field752;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lmc;B)V", line = 17)
    public final void method344(class234 arg0, byte arg1) {
        if (arg1 > -40) {
            method346(true);
        }
        field744++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method347(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)Z", line = 52)
    public static final boolean method345(int arg0, byte arg1, int arg2) {
        field748++;
        if (arg1 == -20) {
            return (arg0 & 0x800) != 0 | class24.method104(arg2, arg0, (byte) -112) || class336.method1940(arg0, 8192, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 75)
    public static void method346(boolean arg0) {
        if (arg0) {
            field763 = null;
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lmc;II)V", line = 86)
    private final void method347(class234 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field754 = arg0.method1506(arg2 + 1188375599);
        } else if (arg1 == 2) {
            this.field741 = arg0.method1506(arg2 ^ 0x46D52C31);
        } else if (arg1 == 3) {
            int var22 = arg0.method1509(true);
            this.field739 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field739[var23][0] = arg0.method1553((byte) -122);
                this.field739[var23][1] = arg0.method1497((byte) 112);
                this.field739[var23][2] = arg0.method1497((byte) 28);
            }
        } else if (arg1 == 4) {
            int var20 = arg0.method1509(true);
            this.field752 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field752[var21][0] = arg0.method1553((byte) -112);
                this.field752[var21][1] = arg0.method1497((byte) 100);
                this.field752[var21][2] = arg0.method1497((byte) 44);
            }
        } else if (arg1 == 5) {
            arg0.method1553((byte) -127);
        } else if (arg1 == 6) {
            arg0.method1509(true);
        } else if (arg1 == 7) {
            arg0.method1509(true);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method1509(true);
            } else if (arg1 == 10) {
                int var18 = arg0.method1509(true);
                this.field742 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field742[var19] = arg0.method1497((byte) 77);
                }
            } else if (arg1 == 12) {
                arg0.method1497((byte) 119);
            } else if (arg1 == 13) {
                int var16 = arg0.method1509(true);
                this.field740 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field740[var17] = arg0.method1553((byte) -113);
                }
            } else if (arg1 == 14) {
                int var4 = arg0.method1509(true);
                this.field750 = new int[var4][2];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field750[var5][0] = arg0.method1509(true);
                    this.field750[var5][1] = arg0.method1509(true);
                }
            } else if (arg1 == 15) {
                arg0.method1553((byte) 127);
            } else if (arg1 == 17) {
                this.field762 = arg0.method1553((byte) -115);
            } else if (arg1 == 18) {
                int var14 = arg0.method1509(true);
                this.field760 = new int[var14];
                this.field751 = new String[var14];
                this.field747 = new int[var14];
                this.field746 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field746[var15] = arg0.method1497((byte) 55);
                    this.field747[var15] = arg0.method1497((byte) 126);
                    this.field760[var15] = arg0.method1497((byte) 103);
                    this.field751[var15] = arg0.method1540((byte) -92);
                }
            } else if (arg1 == 19) {
                int var6 = arg0.method1509(true);
                this.field755 = new int[var6];
                this.field753 = new int[var6];
                this.field749 = new int[var6];
                this.field761 = new String[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field749[var7] = arg0.method1497((byte) 50);
                    this.field753[var7] = arg0.method1497((byte) 34);
                    this.field755[var7] = arg0.method1497((byte) 43);
                    this.field761[var7] = arg0.method1540((byte) -105);
                }
            } else if (arg1 == 249) {
                int var8 = arg0.method1509(true);
                if (this.field756 == null) {
                    int var9 = class483.method2714(var8, (byte) -112);
                    this.field756 = new class467(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method1509(true) == 1;
                    int var12 = arg0.method1500((byte) -95);
                    class337 var13;
                    if (var11) {
                        var13 = new class55(arg0.method1540((byte) -123));
                    } else {
                        var13 = new class405(arg0.method1497((byte) 61));
                    }
                    this.field756.method2619(var13, (long) var12, -1);
                }
            }
        }
        field757++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lpi;I)V", line = 320)
    public static final void method348(class266 arg0, int arg1) {
        field743++;
        arg0.field3528 = null;
        int var2 = arg0.field3533.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field3533[var3].field9324 = false;
        }
        class151[] var4 = class719.field9450;
        synchronized (class719.field9450) {
            if (class719.field9450.length > var2 && class318.field3970[var2] < 200) {
                class719.field9450[var2].method855(0, arg0);
                int var10002 = class318.field3970[var2]++;
            }
            if (arg1 != 18) {
                field764 = 66;
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 352)
    public final void method349(int arg0) {
        if (arg0 >= 91) {
            if (this.field741 == null) {
                this.field741 = this.field754;
            }
            field759++;
        }
    }
}
