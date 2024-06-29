import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class470 extends class303 {

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "[[S")
    public static short[][] field6764;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field6763;
        int[][] var3 = super.field4725.method1886((byte) 92, arg0);
        int var4 = 57 / ((arg1 - 46) / 54);
        if (super.field4725.field4371 && this.method1894(false)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = arg0 % super.field4384 * super.field4384;
            for (int var9 = 0; class449.field6539 > var9; ++var9) {
                int var10 = super.field4375[var8 - -(var9 % super.field4382)];
                var7[var9] = class424.method2540(255, var10) << 4;
                var6[var9] = class424.method2540(var10, 65280) >> 4;
                var5[var9] = class424.method2540(16711680, var10) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(I)V")
    public static void method2731(int arg0) {
        if (arg0 <= 59) {
            field6764 = null;
        }
        field6764 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BC)C")
    public static final char method2732(byte arg0, char arg1) {
        int var2 = -107 % ((9 - arg0) / 47);
        ++field6765;
        if (~arg1 != -33 && arg1 != 160 && arg1 != '_' && arg1 != '-') {
            if (arg1 != '[' && arg1 != ']' && ~arg1 != -36) {
                if (~arg1 != -225 && arg1 != 225 && ~arg1 != -227 && arg1 != 228 && arg1 != 227 && arg1 != 192 && ~arg1 != -194 && arg1 != 194 && arg1 != 196 && arg1 != 195) {
                    if (~arg1 != -233 && arg1 != 233 && arg1 != 234 && ~arg1 != -236 && ~arg1 != -201 && ~arg1 != -202 && arg1 != 202 && ~arg1 != -204) {
                        if (~arg1 != -238 && ~arg1 != -239 && arg1 != 239 && arg1 != 205 && ~arg1 != -207 && ~arg1 != -208) {
                            if (arg1 != 242 && ~arg1 != -244 && arg1 != 244 && ~arg1 != -247 && arg1 != 245 && ~arg1 != -211 && ~arg1 != -212 && ~arg1 != -213 && arg1 != 214 && arg1 != 213) {
                                if (~arg1 != -250 && ~arg1 != -251 && ~arg1 != -252 && ~arg1 != -253 && arg1 != 217 && ~arg1 != -219 && ~arg1 != -220 && ~arg1 != -221) {
                                    if (arg1 != 231 && arg1 != 199) {
                                        if (~arg1 != -256 && ~arg1 != -377) {
                                            if (arg1 != 241 && arg1 != 209) {
                                                return arg1 == 223 ? 'b' : Character.toLowerCase(arg1);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg1;
            }
        } else {
            return '_';
        }
    }

    static {
        new class567("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
