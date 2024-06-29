import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class32 extends class176 {

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[I")
    public static int[] field518;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
    public abstract int method323(boolean arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public abstract int method324(int arg0);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
    public abstract int method325(int arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I")
    public static final int method326(int arg0, boolean arg1) {
        field516++;
        if (arg1) {
            field518 = null;
        }
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ldk;B)I")
    public static final int method327(class435 arg0, byte arg1) {
        field514++;
        if (class351.field4715 == arg0) {
            return 6407;
        } else if (class49.field958 == arg0) {
            return 6408;
        } else if (class519.field7310 == arg0) {
            return 6406;
        } else if (class571.field7865 == arg0) {
            return 6409;
        } else if (class75.field1196 == arg0) {
            return 6410;
        } else if (class25.field453 == arg0) {
            return 6145;
        } else {
            int var2 = 98 / ((41 - arg1) / 59);
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
    public abstract int method328(byte arg0);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)J")
    public abstract long method329(int arg0);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        field518 = null;
        if (!arg0) {
            method326(-65, false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[I[I)V")
    public static final void method331(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg2 != 2) {
            method330(false);
        }
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if ((var7 + (var9 & var10)) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method331(var6 - 1, arg1, arg2, arg3, arg4);
            method331(arg0, var6 + 1, 2, arg3, arg4);
        }
        field512++;
    }

    static {
        new class104(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field513 = 104;
        field515 = 999999;
        new class104("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field519 = 0;
        field518 = new int[] { 104, 120, 136, 168 };
    }
}
