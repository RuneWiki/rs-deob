import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class363 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public int field5555 = -1;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Luv;")
    public static class2 field5550 = new class2(102, 4);

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lmt;")
    private class517 field5541;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Ljava/lang/String;")
    private String field5542;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Ljava/lang/String;")
    private String field5558;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    private int[] field5540;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
    private int[] field5543;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    private int[] field5544;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
    private int[] field5547;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[I")
    private int[] field5548;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    private int[] field5552;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    private int[] field5557;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
    private int[] field5559;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field5551;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field5556;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[I")
    private int[][] field5545;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[I")
    private int[][] field5549;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[[I")
    private int[][] field5553;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lgk;Z)V", line = 24)
    public final void method2165(class468 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2765(107);
            if (var3 == 0) {
                if (!arg1) {
                    return;
                }
                field5554++;
                return;
            }
            this.method2168(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILjava/util/Random;)I", line = 45)
    public static final int method2166(int arg0, int arg1, Random arg2) {
        if (arg0 != 22591) {
            method2166(35, 30, null);
        }
        field5561++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class384.method2305(arg0 - 22590, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class70.method497(var4, arg1, -124);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 75)
    public static void method2167(int arg0) {
        if (arg0 != 0) {
            field5550 = null;
        }
        field5550 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILgk;I)V", line = 93)
    private final void method2168(int arg0, class468 arg1, int arg2) {
        field5560++;
        if (arg2 == 1) {
            this.field5542 = arg1.method2771((byte) 77);
        } else if (arg2 == 2) {
            this.field5558 = arg1.method2771((byte) 77);
        } else if (arg2 == 3) {
            int var4 = arg1.method2765(65);
            this.field5545 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5545[var5][0] = arg1.method2727((byte) 43);
                this.field5545[var5][1] = arg1.method2722(false);
                this.field5545[var5][2] = arg1.method2722(false);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method2765(arg0 ^ 0x40);
            this.field5549 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5549[var7][0] = arg1.method2727((byte) 43);
                this.field5549[var7][1] = arg1.method2722(false);
                this.field5549[var7][2] = arg1.method2722(false);
            }
        } else if (arg2 == 5) {
            arg1.method2727((byte) 43);
        } else if (arg2 == 6) {
            arg1.method2765(121);
        } else if (arg2 == 7) {
            arg1.method2765(94);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2765(73);
            } else if (arg2 == 10) {
                int var8 = arg1.method2765(99);
                this.field5557 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5557[var9] = arg1.method2722(false);
                }
            } else if (arg2 == 12) {
                arg1.method2722(false);
            } else if (arg2 == 13) {
                int var10 = arg1.method2765(72);
                this.field5548 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field5548[var11] = arg1.method2727((byte) 43);
                }
            } else if (arg2 == 14) {
                int var12 = arg1.method2765(107);
                this.field5553 = new int[var12][2];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field5553[var13][0] = arg1.method2765(92);
                    this.field5553[var13][1] = arg1.method2765(59);
                }
            } else if (arg2 == 15) {
                arg1.method2727((byte) 43);
            } else if (arg2 == 17) {
                this.field5555 = arg1.method2727((byte) 43);
            } else if (arg2 == 18) {
                int var22 = arg1.method2765(107);
                this.field5540 = new int[var22];
                this.field5551 = new String[var22];
                this.field5559 = new int[var22];
                this.field5543 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field5540[var23] = arg1.method2722(false);
                    this.field5559[var23] = arg1.method2722(false);
                    this.field5543[var23] = arg1.method2722(false);
                    this.field5551[var23] = arg1.method2770(class286.method1773(arg0, -20459));
                }
            } else if (arg2 == 19) {
                int var20 = arg1.method2765(58);
                this.field5552 = new int[var20];
                this.field5547 = new int[var20];
                this.field5544 = new int[var20];
                this.field5556 = new String[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5544[var21] = arg1.method2722(false);
                    this.field5552[var21] = arg1.method2722(false);
                    this.field5547[var21] = arg1.method2722(false);
                    this.field5556[var21] = arg1.method2770(-20459);
                }
            } else if (arg2 == 249) {
                int var14 = arg1.method2765(92);
                if (this.field5541 == null) {
                    int var15 = class143.method1039(8, var14);
                    this.field5541 = new class517(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg1.method2765(51) == 1;
                    int var18 = arg1.method2759(1919914864);
                    class115 var19;
                    if (var17) {
                        var19 = new class498(arg1.method2770(-20459));
                    } else {
                        var19 = new class221(arg1.method2722(false));
                    }
                    this.field5541.method3055(arg0, (long) var18, var19);
                }
            }
        }
        if (arg0 != 0) {
            this.field5553 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 349)
    public final void method2169(int arg0) {
        field5546++;
        int var2 = -44 % ((arg0 - 77) / 49);
        if (this.field5558 == null) {
            this.field5558 = this.field5542;
        }
    }
}
