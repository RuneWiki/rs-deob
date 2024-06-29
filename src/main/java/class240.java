import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class240 extends class30 {

    @OriginalMember(owner = "client!uu", name = "kb", descriptor = "Loo;")
    public class535 field3455;

    @OriginalMember(owner = "client!uu", name = "db", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!uu", name = "gb", descriptor = "[I")
    public static int[] field3451 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!uu", name = "eb", descriptor = "Lh;")
    public static class572 field3449 = new class572("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!uu", name = "fb", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!uu", name = "hb", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!uu", name = "ib", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!uu", name = "jb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!uu", name = "lb", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!uu", name = "mb", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method1529(int arg0, byte arg1) {
        class219.field3190 = 1;
        class312.field4298 = arg0;
        ++field3450;
        class511.field7276 = 0;
        class271.field3843 = false;
        class514.field7343 = null;
        class271.field3841 = -1;
        class624.field9191 = -1;
        if (arg1 != 102) {
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 25)
    public static void method1530(byte arg0) {
        if (arg0 != -7) {
            field3451 = null;
        }
        field3449 = null;
        field3451 = null;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 36)
    public final void method206(int arg0) {
        this.field3455 = new class535(super.field337);
        ++field3454;
        if (arg0 >= -102) {
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)Z", line = 52)
    public static final boolean method1531(int arg0, byte arg1, int arg2) {
        ++field3457;
        if (arg1 != 27) {
            method1533(-61, true);
        }
        return class391.method2330(arg2, arg1 + 229, arg0) | ~(262144 & arg2) != -1 || class286.method1775(arg0, arg1 + -109, arg2);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBIII)V", line = 63)
    public static final void method1532(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class14 var5 = (class14) class1.field5.method124((byte) 42); var5 != null; var5 = (class14) class1.field5.method120(106)) {
            class263.method1666(var5, arg4, arg0, arg3, arg2, (byte) 91);
        }
        if (arg1 != 11) {
            method1530((byte) -48);
        }
        ++field3452;
        for (class14 var6 = (class14) class615.field9103.method124((byte) 42); var6 != null; var6 = (class14) class615.field9103.method120(arg1 + 17)) {
            byte var11 = 1;
            class226 var12 = var6.field145.method947(false);
            if (!var6.field145.field1921) {
                if (~var6.field145.field1898 != ~var12.field3265 && var6.field145.field1898 != var12.field3282 && ~var6.field145.field1898 != ~var12.field3262 && ~var6.field145.field1898 != ~var12.field3309) {
                    if (~var6.field145.field1898 == ~var12.field3293 || var6.field145.field1898 == var12.field3273 || ~var6.field145.field1898 == ~var12.field3292 || ~var6.field145.field1898 == ~var12.field3271) {
                        var11 = 3;
                    }
                } else {
                    var11 = 2;
                }
            } else {
                var11 = 0;
            }
            if (~var6.field138 != ~var11) {
                int var13 = class565.method3388(var6.field145, (byte) -114);
                if (~var6.field137 != ~var13) {
                    if (var6.field139 != null) {
                        class155.field2316.method258(var6.field139);
                        var6.field139 = null;
                    }
                    var6.field137 = var13;
                }
                var6.field138 = var11;
            }
            var6.field123 = var6.field145.field8496;
            var6.field146 = var6.field145.field8496 + (var6.field145.method940(-1) << 6);
            var6.field130 = var6.field145.field8500;
            var6.field147 = var6.field145.field8500 - -(var6.field145.method940(-1) << 6);
            class263.method1666(var6, arg4, arg0, arg3, arg2, (byte) 63);
        }
        for (class14 var7 = (class14) class276.field3879.method2798((byte) -69); var7 != null; var7 = (class14) class276.field3879.method2806(true)) {
            byte var8 = 1;
            class226 var9 = var7.field143.method947(false);
            if (var7.field143.field1921) {
                var8 = 0;
            } else if (var7.field143.field1898 != var9.field3265 && var7.field143.field1898 != var9.field3282 && ~var7.field143.field1898 != ~var9.field3262 && ~var7.field143.field1898 != ~var9.field3309) {
                if (var7.field143.field1898 == var9.field3293 || ~var7.field143.field1898 == ~var9.field3273 || var7.field143.field1898 == var9.field3292 || var7.field143.field1898 == var9.field3271) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field138 != ~var8) {
                int var10 = class335.method2046(128, var7.field143);
                if (~var7.field137 != ~var10) {
                    if (var7.field139 != null) {
                        class155.field2316.method258(var7.field139);
                        var7.field139 = null;
                    }
                    var7.field137 = var10;
                }
                var7.field138 = var8;
            }
            var7.field123 = var7.field143.field8496;
            var7.field146 = var7.field143.field8496 + (var7.field143.method940(-1) << 6);
            var7.field130 = var7.field143.field8500;
            var7.field147 = var7.field143.field8500 + (var7.field143.method940(-1) << 6);
            class263.method1666(var7, arg4, arg0, arg3, arg2, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)Z", line = 182)
    public static final boolean method1533(int arg0, boolean arg1) {
        ++field3456;
        if (arg1) {
            return false;
        } else {
            return ~arg0 == -1 || ~arg0 == -2;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZILjava/util/Random;)I", line = 194)
    public static final int method1534(boolean arg0, int arg1, Random arg2) {
        if (arg0) {
            field3451 = null;
        }
        ++field3453;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class452.method2749(arg1, arg0)) {
            return (int) ((4294967295L & (long) arg2.nextInt()) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class45.method284(arg1, var4, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Law;)V", line = 225)
    public class240(class67 arg0) {
        super(arg0);
        this.field3455 = new class535(arg0);
        super.field341 = new class318(super.field337);
        super.field374 = new class318(super.field337);
        super.field356 = new class318(super.field337);
        super.field383 = new class318(super.field337);
        super.field344 = new class318(super.field337);
        super.field351 = new class318(super.field337);
        super.field378 = new class318(super.field337);
        super.field346 = new class318(super.field337);
        super.field359 = new class318(super.field337);
        super.field362 = new class318(super.field337);
    }
}
