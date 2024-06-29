import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class256 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lgu;")
    private class412 field3914 = new class412(256);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lgu;")
    private class412 field3923 = new class412(256);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lul;")
    private class406 field3921;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lul;")
    private class406 field3918;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[Z")
    public static boolean[] field3922;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public static final void method1706(int arg0, byte arg1) {
        class285.method1843(false);
        field3917++;
        int var2 = class314.field4740.method2369((byte) 112, arg0).field1322;
        if (var2 == 0) {
            return;
        }
        int var3 = class195.field3271.field5029[arg0];
        if (var2 == 6) {
            class374.field5590 = var3;
        }
        if (arg1 != 65) {
            field3922 = null;
        }
        if (var2 == 5) {
            class154.field2289 = var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IB)Lfv;")
    public final class79 method1707(int arg0, int[] arg1, byte arg2) {
        field3920++;
        if (this.field3921.method2561(-78) == 1) {
            return this.method1709(arg1, arg0, 0, true);
        } else if (this.field3921.method2551(arg0, -26070) == 1) {
            return this.method1709(arg1, 0, arg0, true);
        } else {
            if (arg2 > -126) {
                this.method1707(-42, null, (byte) -7);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1708(int arg0) {
        if (arg0 != -7) {
            method1708(-122);
        }
        field3922 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([IIIZ)Lfv;")
    private final class79 method1709(int[] arg0, int arg1, int arg2, boolean arg3) {
        field3919++;
        int var5 = ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class79 var9 = (class79) this.field3923.method2585((byte) 114, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class535 var10 = class535.method3172(this.field3921, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class79 var11 = var10.method3170();
            this.field3923.method2591(var7, var11, (byte) 24);
            if (arg0 != null) {
                arg0[0] -= var11.field1141.length;
            }
            return arg3 ? var11 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IZ)Lfv;")
    public final class79 method1710(int arg0, int[] arg1, boolean arg2) {
        field3916++;
        if (this.field3918.method2561(-95) == 1) {
            return this.method1711(-11238, 0, arg0, arg1);
        } else if (this.field3918.method2551(arg0, -26070) == 1) {
            return this.method1711(-11238, arg0, 0, arg1);
        } else if (arg2) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III[I)Lfv;")
    private final class79 method1711(int arg0, int arg1, int arg2, int[] arg3) {
        field3915++;
        int var5 = (arg1 << 4 & 0xFFFA | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class79 var9 = (class79) this.field3923.method2585((byte) 114, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class170 var10 = (class170) this.field3914.method2585((byte) 114, var7);
            if (var10 == null) {
                var10 = class170.method1143(this.field3918, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3914.method2591(var7, var10, (byte) 107);
            }
            if (arg0 != -11238) {
                this.field3914 = null;
            }
            class79 var11 = var10.method1136(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2677(-22491);
                this.field3923.method2591(var7, var11, (byte) -123);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lul;Lul;)V")
    public class256(class406 arg0, class406 arg1) {
        this.field3921 = arg0;
        this.field3918 = arg1;
    }

    static {
        new class234("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
