import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class112 extends class98 {

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    private int field1369 = -1;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "[B")
    public static byte[] field1366 = new byte[520];

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Loe;")
    public static class109 field1365 = class174.method1193(-417);

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Liq;")
    public static class362 field1379;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "[I")
    public static int[] field1371;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    private int[] field1372;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method700(int arg0, String arg1) {
        if (arg0 != 10) {
            field1366 = null;
        }
        ++field1367;
        return class20.method151(true, 92, 10, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field1377;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int var4 = this.field1376 * (~class140.field1737 == ~this.field1373 ? arg0 : this.field1373 * arg0 / class140.field1737);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class268.field3811 == ~this.field1376) {
                for (int var8 = 0; ~var8 > ~class268.field3811; ++var8) {
                    int var9 = this.field1372[var4++];
                    var7[var8] = class33.method210(4080, var9 << 4);
                    var6[var8] = class33.method210(var9, 65280) >> 4;
                    var5[var8] = class33.method210(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class268.field3811 > var10; ++var10) {
                    int var11 = this.field1376 * var10 / class268.field3811;
                    int var12 = this.field1372[var4 + var11];
                    var7[var10] = class33.method210(4080, var12 << 4);
                    var6[var10] = class33.method210(var12, 65280) >> 4;
                    var5[var10] = class33.method210(var12 >> 12, 4080);
                }
            }
        }
        int var13 = -60 / ((60 - arg1) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)I")
    public final int method541(int arg0) {
        ++field1370;
        if (arg0 > -86) {
            field1379 = null;
        }
        return this.field1369;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1379 = null;
        field1365 = null;
        field1371 = null;
        field1366 = null;
        if (arg0 != 32292) {
            method701(38);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 == 0) {
            if (~arg0 == -1) {
                this.field1369 = arg1.method1617((byte) 48);
            }
            ++field1375;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public final void method538(int arg0, int arg1, int arg2) {
        super.method538(arg0, arg1, arg2);
        ++field1368;
        if (~this.field1369 <= -1 && class394.field5565 != null) {
            int var4 = class394.field5565.method1329((byte) -83, this.field1369).field4768 ? 64 : 128;
            this.field1372 = class394.field5565.method1325(4692, var4, 1.0F, this.field1369, var4, false);
            this.field1373 = var4;
            this.field1376 = var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method540(int arg0) {
        super.method540(arg0);
        ++field1374;
        this.field1372 = null;
    }

    static {
        new class362("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field1378 = 0;
        field1379 = new class362("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }
}
