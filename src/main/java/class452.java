import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class452 extends class354 {

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    private int field6597 = 1;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    private int field6601 = 0;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    private int field6603 = 0;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "J")
    public static long field6599;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
    public static int[] field6596;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field6602;

    static {
        new class180("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field6599 = 0L;
        field6596 = new int[1];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILti;I)V", line = 3)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field6597 = arg1.method1918((byte) -58);
                }
            } else {
                this.field6601 = arg1.method1918((byte) 122);
            }
        } else {
            this.field6603 = arg1.method1918((byte) -96);
        }
        ++field6592;
        if (arg0 != 15180) {
            this.method206(-27, (class303) null, 11);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIFIIIIZI)[[I", line = 48)
    public static final int[][] method2715(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field6600;
        if (arg6 < 26) {
            return null;
        } else {
            int[][] var9 = new int[arg5][arg0];
            class371 var10 = new class371();
            var10.field5551 = (int) (arg2 * 4096.0F);
            var10.field5559 = arg4;
            var10.field5556 = arg7;
            var10.field5548 = arg8;
            var10.field5554 = arg1;
            var10.method771(false);
            class367.method2363(arg0, false, arg5);
            for (int var11 = 0; var11 < arg5; ++var11) {
                var10.method2376(-120, var9[var11], var11);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)[I", line = 80)
    public final int[] method253(int arg0, byte arg1) {
        ++field6595;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = class278.field4009[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class404.field5952; ++var6) {
                int var7 = class154.field2358[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field6603 == 0) {
                    var9 = (-var4 + var7) * this.field6597;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field6597 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field6601 == -1) {
                    var12 = class492.field7184[(var12 & 4095) >> 4] + 4096 >> 1;
                } else if (~this.field6601 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 != -95 ? null : var3;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V", line = 149)
    public static void method2716(int arg0) {
        if (arg0 != 0) {
            method2717((class162) null, (byte) -82, 67L);
        }
        field6596 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;BJ)V", line = 168)
    public static final void method2717(class162 arg0, byte arg1, long arg2) {
        ++field6594;
        class356.field5382 = 0;
        class414.field6098 = class49.field730;
        class49.field730 = 0;
        long var4 = class464.method2773((byte) 103);
        for (class234 var6 = (class234) class359.field5434.method1639(-1); var6 != null; var6 = (class234) class359.field5434.method1642((byte) 5)) {
            if (var6.method1523(arg0, arg2)) {
                ++class356.field5382;
            }
        }
        if (arg1 < 80) {
            method2718(-62, 115, (byte) 11);
        }
        if (class436.field6326 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class359.field5434.method1643(-86) + ", running: " + class356.field5382 + ". Particles: " + class49.field730 + ". Time taken: " + (class464.method2773((byte) 103) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 200)
    public class452() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)I", line = 207)
    public static final int method2718(int arg0, int arg1, byte arg2) {
        int var3 = (arg0 & 127) * arg1 >> 7;
        ++field6602;
        if (arg2 > -30) {
            return -27;
        } else {
            if (var3 >= 2) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 234)
    public final void method771(boolean arg0) {
        class291.method1807(arg0);
        ++field6598;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILsq;Lsq;)V", line = 246)
    public static final void method2719(int arg0, class117 arg1, class117 arg2) {
        if (arg1.field1843 != null) {
            arg1.method855(arg0 ^ -50);
        }
        ++field6593;
        arg1.field1843 = arg2;
        arg1.field1845 = arg2.field1845;
        arg1.field1843.field1845 = arg1;
        if (arg0 != -3) {
            field6596 = null;
        }
        arg1.field1845.field1843 = arg1;
    }
}
