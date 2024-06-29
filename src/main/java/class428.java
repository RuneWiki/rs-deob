import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class428 extends class278 {

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    private int field6253 = 4096;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    private int field6252 = 4096;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    private int field6258 = 4096;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Z")
    public static boolean field6250 = false;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lqi;")
    public static class398 field6257;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field6259;

    static {
        new class83("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field6257 = new class398();
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V", line = 3)
    public static final void method2563(int arg0) {
        class354.field4827 = arg0;
        for (int var1 = 0; var1 < class469.field6860; ++var1) {
            for (int var2 = 0; var2 < class472.field6900; ++var2) {
                if (class385.field5410[arg0][var1][var2] == null) {
                    class385.field5410[arg0][var1][var2] = new class61(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Llh;II)V", line = 25)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.method324(12, 22);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6252 = arg0.method2062((byte) 14);
                }
            } else {
                this.field6258 = arg0.method2062((byte) 14);
            }
        } else {
            this.field6253 = arg0.method2062((byte) 14);
        }
        ++field6259;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V", line = 73)
    public static void method2564(boolean arg0) {
        if (arg0) {
            field6250 = true;
        }
        field6257 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([SI)[S", line = 86)
    public static final short[] method2565(short[] arg0, int arg1) {
        ++field6256;
        if (arg1 != 13139) {
            field6250 = false;
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class416.method2489(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I", line = 109)
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 < 75) {
            return null;
        } else {
            ++field6251;
            int[][] var3 = super.field3757.method1450(arg1, -1);
            if (super.field3757.field3420) {
                int[][] var4 = this.method1568(5426, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class507.field7456 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field6253 * var12 >> 12;
                        var9[var11] = this.field6258 * var13 >> 12;
                        var10[var11] = this.field6252 * var14 >> 12;
                    } else {
                        var8[var11] = this.field6253;
                        var9[var11] = this.field6258;
                        var10[var11] = this.field6252;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)I", line = 172)
    public static final int method2566(int arg0, int arg1, int arg2) {
        ++field6254;
        if (~arg0 == 1) {
            return 12345678;
        } else if (~arg0 == 0) {
            if (~arg2 > -3) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & arg1) * arg2 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg0 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 206)
    public class428() {
        super(1, false);
    }
}
