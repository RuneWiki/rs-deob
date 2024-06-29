import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class531 extends class535 {

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
    private int field7835 = 4096;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Z")
    private boolean field7840 = true;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field7841;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
    public static void method3147(int arg0) {
        field7841 = null;
        if (arg0 != -28100) {
            method3147(-51);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field7836;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (arg0 >= -116) {
            return null;
        } else {
            if (super.field7879.field1528) {
                int[] var4 = this.method3158(118, 0, arg1 + -1 & class293.field4364);
                int[] var5 = this.method3158(122, 0, arg1);
                int[] var6 = this.method3158(-81, 0, arg1 + 1 & class293.field4364);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~var10 > ~class174.field2597; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field7835;
                    int var12 = (var5[var10 - -1 & class529.field7783] + -var5[var10 + -1 & class529.field7783]) * this.field7835;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var20 = var12 / var17;
                        var19 = var11 / var17;
                        var18 = 16777216 / var17;
                    }
                    if (this.field7840) {
                        var18 = (var18 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                    }
                    var7[var10] = var20;
                    var8[var10] = var19;
                    var9[var10] = var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
    public static final void method3148(int arg0) {
        ++field7839;
        int var1 = 0;
        if (arg0 <= -20) {
            while (~var1 > -101) {
                class25.field361[var1] = true;
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class531() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3149(byte arg0, String arg1) throws ClassNotFoundException {
        ++field7834;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = -66 % (arg0 / 54);
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.method61(32, -66);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field7840 = ~arg1.method3072((byte) -126) == -2;
            }
        } else {
            this.field7835 = arg1.method3018(566990904);
        }
        ++field7838;
    }

    static {
        new class44("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
