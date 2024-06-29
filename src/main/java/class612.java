import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class612 extends class466 {

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "Lej;")
    public static class104 field8811;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "[Llba;")
    private class470[] field8805;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
    public static void method3581(int arg0) {
        if (arg0 != 1826) {
            field8811 = null;
        }
        field8811 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([[II)V")
    private final void method3582(int[][] arg0, int arg1) {
        ++field8812;
        int var3 = class312.field4207;
        int var4 = class564.field7814;
        class509.method2942(arg1, arg0);
        class561.method3195(0, 0, class340.field4582, -1, class105.field1581);
        if (this.field8805 != null) {
            for (int var5 = 0; ~this.field8805.length < ~var5; ++var5) {
                class470 var6 = this.field8805[var5];
                int var7 = var6.field6609;
                int var8 = var6.field6611;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method310(-73, var4, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method313(var4, (byte) -119, var3);
                } else {
                    var6.method309(var4, var3, (byte) -103);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILpe;I)V")
    public static final void method3583(int arg0, class524 arg1, int arg2) {
        if (class590.field8429) {
            arg0 = 0;
            class590.field8429 = false;
        }
        ++field8807;
        if (arg2 != -1) {
            field8811 = null;
        }
        if (class275.field3809 == null || !class275.field3809.method3018(127, arg1)) {
            class275.field3809 = arg1;
            class246.field3440 = class488.method2835(30160);
            class213.field3022 = arg0;
            class269.field3755 = arg0;
            if (~class269.field3755 == -1) {
                class493.method2867(true);
                return;
            }
            class378.field5073 = class173.field2493;
            class580.field7978 = class215.field3071;
            class551.field7612 = class45.field871;
            class400.field5698 = class392.field5533;
            class509.field7109 = class118.field1935;
            class613.field8813 = class552.field7624;
            class105.field1587 = class571.field7877;
            class634.field9271 = class597.field8632;
            class330.field4406 = class151.field2296;
            class221.field3165 = class561.field7776;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)Lmc;")
    public static final class114 method3584(int arg0, int arg1) {
        ++field8806;
        int var2 = arg0 >> 16;
        if (arg1 != 0) {
            method3585(-39, -19L);
        }
        int var3 = 65535 & arg0;
        if (class618.field8850[var2] == null || class618.field8850[var2][var3] == null) {
            boolean var4 = class377.method2232(120, var2);
            if (!var4) {
                return null;
            }
        }
        return class618.field8850[var2][var3];
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field8808;
            int[] var3 = super.field6557.method565(arg0, -24728);
            if (super.field6557.field1163) {
                this.method3582(super.field6557.method567(0), 0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
    public class612() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field8810;
        if (arg1) {
            this.method33(81, false);
        }
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (super.field6569.field1934) {
            int var4 = class312.field4207;
            int var5 = class564.field7814;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field6569.method829((byte) -76);
            this.method3582(var6, 0);
            for (int var8 = 0; var8 < class564.field7814; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class312.field4207 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class589.method3454(var15 << 4, 4080);
                    var12[var14] = class589.method3454(var15 >> 4, 4080);
                    var11[var14] = class589.method3454(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            field8811 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field6565 = arg0.method110((byte) 97) == 1;
            }
        } else {
            this.field8805 = new class470[arg0.method110((byte) 47)];
            for (int var4 = 0; ~var4 > ~this.field8805.length; ++var4) {
                int var5 = arg0.method110((byte) 27);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field8805[var4] = class377.method2231(arg0, false);
                            }
                        } else {
                            this.field8805[var4] = class114.method808(arg0, 6);
                        }
                    } else {
                        this.field8805[var4] = class367.method2204(1, arg0);
                    }
                } else {
                    this.field8805[var4] = class397.method2377((byte) -100, arg0);
                }
            }
        }
        ++field8809;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3585(int arg0, long arg1) {
        ++field8804;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                if (arg0 < 15) {
                    return null;
                } else {
                    while (~var4 != -1L) {
                        var4 /= 37L;
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg1 != -1L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        var6.append(class525.field7385[(int) (-(arg1 * 37L) + var7)]);
                    }
                    return var6.reverse().toString();
                }
            }
        } else {
            return null;
        }
    }

    static {
        new class104("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class104("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field8811 = new class104("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }
}
