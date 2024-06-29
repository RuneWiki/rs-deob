import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class424 extends class227 {

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field6166 = 10;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    private int field6167 = 0;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field6163 = 2048;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Ljc;")
    public static class305 field6168 = new class305("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "[B")
    public static byte[] field6169 = new byte[2048];

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[I")
    private int[] field6158;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
    private int[] field6160;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2613(int arg0, String arg1) {
        if (arg0 != 1) {
            method2614((byte) 100);
        }
        ++field6161;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        this.method2615((byte) 0);
        ++field6159;
        if (arg0 != 1) {
            this.method877(86);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method2614(byte arg0) {
        if (arg0 != -55) {
            field6168 = null;
        }
        field6168 = null;
        field6169 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class424() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field6164;
        if (arg0 != 15811) {
            this.field6163 = 47;
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 102);
        if (super.field3068.field4480) {
            int var4 = class190.field2457[arg1];
            if (~this.field6167 != -1) {
                for (int var5 = 0; var5 < class446.field6486; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class4.field37[var5];
                    int var9 = this.field6167;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field6166 < ~var10; ++var10) {
                        if (~var6 <= ~this.field6158[var10] && ~this.field6158[var10 + 1] < ~var6) {
                            if (var6 < this.field6160[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field6166 > var12; ++var12) {
                    if (this.field6158[var12] <= var4 && var4 < this.field6158[var12 + 1]) {
                        if (var4 < this.field6160[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class438.method2688(var3, 0, class446.field6486, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    private final void method2615(byte arg0) {
        ++field6162;
        this.field6160 = new int[this.field6166 - -1];
        int var2 = 0;
        this.field6158 = new int[this.field6166 + 1];
        int var3 = 4096 / this.field6166;
        int var4 = this.field6163 * var3 >> 12;
        if (arg0 == 0) {
            for (int var5 = 0; ~var5 > ~this.field6166; ++var5) {
                this.field6158[var5] = var2;
                this.field6160[var5] = var2 + var4;
                var2 += var3;
            }
            this.field6158[this.field6166] = 4096;
            this.field6160[this.field6166] = this.field6160[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field6170;
        if (arg1 != 487215116) {
            field6169 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6167 = arg0.method2388((byte) -118);
                }
            } else {
                this.field6163 = arg0.method2386(-23648);
            }
        } else {
            this.field6166 = arg0.method2388((byte) -117);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I")
    public static final int method2616(int arg0, int arg1) {
        ++field6165;
        if (arg1 >= -15) {
            method2614((byte) -76);
        }
        return arg0 >>> 7;
    }

    static {
        new class305("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
