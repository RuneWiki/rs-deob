import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class35 extends class219 {

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    private int field573 = 1024;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    private int field576 = 409;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    private int field574 = 0;

    @OriginalMember(owner = "client!mm", name = "fb", descriptor = "I")
    private int field584 = 1024;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    private int field563 = 8;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    private int field564 = 204;

    @OriginalMember(owner = "client!mm", name = "ib", descriptor = "I")
    private int field587 = 81;

    @OriginalMember(owner = "client!mm", name = "db", descriptor = "I")
    private int field582 = 4;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "Lbd;")
    private static class162 field579 = class17.method142(0, "Cancel");

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Lbd;")
    public static class162 field566 = field579;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Lbd;")
    public static class162 field572 = class317.method2179(160, (byte) 126);

    @OriginalMember(owner = "client!mm", name = "jb", descriptor = "Lbd;")
    public static class162 field588 = class17.method142(0, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!mm", name = "lb", descriptor = "Lbd;")
    public static class162 field590 = null;

    @OriginalMember(owner = "client!mm", name = "kb", descriptor = "[I")
    public static int[] field589 = new int[500];

    @OriginalMember(owner = "client!mm", name = "mb", descriptor = "[Lbd;")
    public static class162[] field591 = new class162[200];

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!mm", name = "eb", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!mm", name = "gb", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!mm", name = "hb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "Lda;")
    public static class143 field577;

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "[I")
    private int[] field580;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "[[I")
    private int[][] field569;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "[[I")
    private int[][] field571;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 6)
    private final void method274(int arg0) {
        Random var2 = new Random((long) this.field563);
        this.field571 = new int[this.field563][this.field582];
        this.field569 = new int[this.field563][this.field582 + 1];
        this.field567 = this.field587 / 2;
        this.field568 = 4096 / this.field563;
        int var3 = this.field568 / 2;
        if (arg0 > -53) {
            method278(false);
        }
        this.field580 = new int[this.field563 + 1];
        this.field581 = 4096 / this.field582;
        field575++;
        this.field580[0] = 0;
        int var4 = this.field581 / 2;
        for (int var5 = 0; var5 < this.field563; var5++) {
            if (var5 > 0) {
                int var6 = this.field568;
                int var7 = (class95.method771(var2, 4096, (byte) 113) - 2048) * this.field564 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field580[var5] = this.field580[var5 - 1] + var8;
            }
            this.field569[var5][0] = 0;
            for (int var9 = 0; var9 < this.field582; var9++) {
                if (var9 > 0) {
                    int var10 = this.field581;
                    int var11 = (class95.method771(var2, 4096, (byte) 115) - 2048) * this.field576 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field569[var5][var9] = this.field569[var5][var9 - 1] + var12;
                }
                this.field571[var5][var9] = this.field573 > 0 ? 4096 - class95.method771(var2, this.field573, (byte) 111) : 4096;
            }
            this.field569[var5][this.field582] = 4096;
        }
        this.field580[this.field563] = 4096;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)[I", line = 72)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        if (!arg0) {
            method277(false, 49);
        }
        field585++;
        if (this.field3654.field4967) {
            int var4 = 0;
            int var5;
            for (var5 = class53.field842[arg1] + this.field574; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field563 && var5 >= this.field580[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field580[var4];
            int var9 = this.field580[var4 - 1];
            if (var5 > (var9 + this.field567) && (var8 - this.field567) > var5) {
                for (int var10 = 0; var10 < class128.field2326; var10++) {
                    int var11 = var7 ? this.field584 : -this.field584;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field581 * var11 >> 12) + class280.field4762[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field582 > var12 && var13 >= this.field569[var6][var12]) {
                        var12++;
                    }
                    int var14 = this.field569[var6][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field569[var6][var15];
                    if (this.field567 + var16 < var13 && var14 - this.field567 > var13) {
                        var3[var10] = this.field571[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class161.method1230(var3, 0, class128.field2326, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 173)
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIII)V", line = 196)
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field583++;
        if (arg9 != -129580404) {
            field588 = (class162) null;
        }
        if (arg5 >= class112.field2028 && arg5 <= class82.field1426 && class112.field2028 <= arg0 && class82.field1426 >= arg0 && class112.field2028 <= arg7 && class82.field1426 >= arg7 && class112.field2028 <= arg6 && class82.field1426 >= arg6 && arg1 >= class303.field5106 && class298.field4989 >= arg1 && arg8 >= class303.field5106 && class298.field4989 >= arg8 && arg3 >= class303.field5106 && class298.field4989 >= arg3 && class303.field5106 <= arg4 && class298.field4989 >= arg4) {
            class187.method1406(arg4, arg2, arg1, arg5, arg8, arg6, arg3, arg0, arg9 ^ 0xF846C28E, arg7);
        } else {
            class296.method2033(arg7, arg3, arg1, arg0, arg6, arg5, arg4, 128, arg8, arg2);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLb;)V", line = 213)
    public static final void method276(byte arg0, class94 arg1) {
        field562++;
        if (arg0 >= -81) {
            field588 = (class162) null;
        }
        while (true) {
            while (arg1.field1653 < arg1.field1681.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method756(915905888) == 1) {
                    var2 = arg1.method756(915905888);
                    var4 = arg1.method756(915905888);
                    var3 = true;
                }
                int var5 = arg1.method756(915905888);
                int var6 = arg1.method756(915905888);
                int var7 = class87.field1536 + class9.field114 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class290.field4893;
                if (var8 >= 0 && var7 - 63 >= 0 && class304.field5132 > var8 + 63 && class9.field114 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && (var2 * 8 + 8) > var11 && var12 >= var4 * 8 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method719((byte) -42);
                                if (var13 != 0) {
                                    if (class259.field4315[var9][var10] == null) {
                                        class259.field4315[var9][var10] = new byte[4096];
                                    }
                                    class259.field4315[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method719((byte) -42);
                                    if (class209.field3531[var9][var10] == null) {
                                        class209.field3531[var9][var10] = new byte[4096];
                                    }
                                    class209.field3531[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method719((byte) -42);
                        if (var16 != 0) {
                            arg1.field1653++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(ZI)I", line = 310)
    public static final int method277(boolean arg0, int arg1) {
        if (arg0) {
            return -38;
        } else {
            field570++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V", line = 323)
    public static void method278(boolean arg0) {
        field590 = null;
        if (arg0) {
            field590 = (class162) null;
        }
        field579 = null;
        field588 = null;
        field566 = null;
        field577 = null;
        field572 = null;
        field589 = null;
        field591 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZBLda;Lda;)Lbf;", line = 341)
    public static final class54 method279(int arg0, boolean arg1, byte arg2, class143 arg3, class143 arg4) {
        field565++;
        boolean var5 = true;
        int[] var6 = arg3.method1149(arg0, (byte) 110);
        int var7 = -47 / ((arg2 - 13) / 57);
        for (int var8 = 0; var8 < var6.length; var8++) {
            byte[] var9 = arg3.method1123(var6[var8], arg0, -113);
            if (var9 == null) {
                var5 = false;
            } else {
                int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
                byte[] var11;
                if (arg1) {
                    var11 = arg4.method1123(var10, 0, -99);
                } else {
                    var11 = arg4.method1123(0, var10, -116);
                }
                if (var11 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class54(arg3, arg4, arg0, arg1);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 396)
    public final void method39(byte arg0) {
        field578++;
        if (arg0 == 22) {
            this.method274(-88);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILb;)V", line = 435)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field586++;
        if (arg1 != 0) {
            this.field573 = -64;
        }
        if (arg0 == 0) {
            this.field582 = arg2.method756(915905888);
        } else if (arg0 == 1) {
            this.field563 = arg2.method756(915905888);
        } else if (arg0 == 2) {
            this.field576 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field564 = arg2.method761((byte) 108);
        } else if (arg0 == 4) {
            this.field584 = arg2.method761((byte) 108);
        } else if (arg0 == 5) {
            this.field574 = arg2.method761((byte) 108);
        } else if (arg0 == 6) {
            this.field587 = arg2.method761((byte) 108);
        } else if (arg0 == 7) {
            this.field573 = arg2.method761((byte) 108);
        }
    }
}
