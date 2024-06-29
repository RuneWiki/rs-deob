import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class427 {

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field5968 = -1;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Llk;")
    private class638 field5955;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Ljava/lang/String;")
    private String field5956;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Ljava/lang/String;")
    private String field5963;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "[I")
    private int[] field5953;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
    private int[] field5954;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "[I")
    private int[] field5959;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "[I")
    private int[] field5962;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "[I")
    private int[] field5965;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "[I")
    private int[] field5966;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
    private int[] field5969;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[I")
    private int[] field5973;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field5957;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field5964;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[[I")
    private int[][] field5958;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "[[I")
    private int[][] field5960;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "[[I")
    private int[][] field5967;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 9)
    public static final int method2573(Random arg0, int arg1, int arg2) {
        field5961++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (arg2 >= -38) {
            return 91;
        } else if (class65.method506(arg1, 30440)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class35.method291(var4, arg1, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lgga;I)V", line = 49)
    public final void method2574(class511 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3013(-93);
            if (var3 == 0) {
                if (arg1 != -8911) {
                    return;
                }
                field5971++;
                return;
            }
            this.method2576(1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 78)
    public final void method2575(byte arg0) {
        if (arg0 >= -64) {
            this.field5957 = null;
        }
        if (this.field5956 == null) {
            this.field5956 = this.field5963;
        }
        field5970++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILgga;I)V", line = 92)
    private final void method2576(int arg0, class511 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5963 = arg1.method3018(-1);
        } else if (arg2 == 2) {
            this.field5956 = arg1.method3018(arg0 - 2);
        } else if (arg2 == 3) {
            int var4 = arg1.method3013(arg0 + 114);
            this.field5960 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5960[var5][0] = arg1.method3002(-1);
                this.field5960[var5][1] = arg1.method3008(64);
                this.field5960[var5][2] = arg1.method3008(64);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method3013(arg0 + 55);
            this.field5958 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5958[var7][0] = arg1.method3002(class475.method2835(arg0, -2));
                this.field5958[var7][1] = arg1.method3008(64);
                this.field5958[var7][2] = arg1.method3008(64);
            }
        } else if (arg2 == 5) {
            arg1.method3002(-1);
        } else if (arg2 == 6) {
            arg1.method3013(-110);
        } else if (arg2 == 7) {
            arg1.method3013(-94);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3013(-99);
            } else if (arg2 == 10) {
                int var22 = arg1.method3013(arg0 + 33);
                this.field5954 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field5954[var23] = arg1.method3008(64);
                }
            } else if (arg2 == 12) {
                arg1.method3008(64);
            } else if (arg2 == 13) {
                int var20 = arg1.method3013(12);
                this.field5966 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5966[var21] = arg1.method3002(-1);
                }
            } else if (arg2 == 14) {
                int var18 = arg1.method3013(82);
                this.field5967 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5967[var19][0] = arg1.method3013(-98);
                    this.field5967[var19][1] = arg1.method3013(arg0 - 115);
                }
            } else if (arg2 == 15) {
                arg1.method3002(arg0 - 2);
            } else if (arg2 == 17) {
                this.field5968 = arg1.method3002(arg0 ^ 0xFFFFFFFE);
            } else if (arg2 == 18) {
                int var16 = arg1.method3013(-117);
                this.field5964 = new String[var16];
                this.field5969 = new int[var16];
                this.field5962 = new int[var16];
                this.field5959 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field5959[var17] = arg1.method3008(class475.method2835(arg0, 65));
                    this.field5962[var17] = arg1.method3008(64);
                    this.field5969[var17] = arg1.method3008(64);
                    this.field5964[var17] = arg1.method2993((byte) -103);
                }
            } else if (arg2 == 19) {
                int var14 = arg1.method3013(74);
                this.field5953 = new int[var14];
                this.field5965 = new int[var14];
                this.field5973 = new int[var14];
                this.field5957 = new String[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field5965[var15] = arg1.method3008(64);
                    this.field5953[var15] = arg1.method3008(arg0 + 63);
                    this.field5973[var15] = arg1.method3008(64);
                    this.field5957[var15] = arg1.method2993((byte) -84);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method3013(arg0 - 120);
                if (this.field5955 == null) {
                    int var9 = class179.method1142(var8, arg0 + 109);
                    this.field5955 = new class638(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method3013(-127) == 1;
                    int var12 = arg1.method2983(true);
                    class69 var13;
                    if (var11) {
                        var13 = new class282(arg1.method2993((byte) -45));
                    } else {
                        var13 = new class324(arg1.method3008(64));
                    }
                    this.field5955.method3666((byte) 65, (long) var12, var13);
                }
            }
        }
        field5972++;
        if (arg0 != 1) {
            method2573(null, -67, -75);
        }
    }
}
