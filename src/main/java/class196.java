import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class196 {

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Lwc;")
    private class46 field2656 = new class46();

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lad;")
    private class268 field2650;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lh;")
    public static class434 field2666 = new class434(59, -2);

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Lgd;")
    public static class206 field2667 = new class206("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Lgd;")
    public static class206 field2668 = new class206("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field2669 = -50;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Lgd;")
    public static class206 field2672 = new class206("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field2674 = -1;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "Lhu;")
    public static class76 field2675 = new class76(4);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Lr;")
    public static class110 field2671;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Lr;")
    public static class110 field2673;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILiq;Ljava/lang/Object;)V")
    public final void method1118(int arg0, class396 arg1, Object arg2) {
        this.method1123(arg1, arg2, 1, -116);
        if (arg0 == -23059) {
            field2653++;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public final void method1119(int arg0) {
        field2664++;
        if (arg0 > -32) {
            this.method1125((byte) 12);
        }
        this.field2656.method337((byte) 95);
        this.field2650.method1519(-16576);
        this.field2651 = this.field2661;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
    public static final void method1120(int arg0, int arg1) {
        if (arg1 < 85) {
            field2670 = -124;
        }
        field2660++;
        class106 var2 = class250.method1400(11, -118, arg0);
        var2.method659(-55);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lbq;B)V")
    private final void method1121(class174 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method2614((byte) -89);
            arg0.method2441((byte) -73);
            this.field2651 += arg0.field2381;
        }
        field2658++;
        if (arg1 != -110) {
            field2674 = -78;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
    public final int method1122(int arg0) {
        field2659++;
        if (arg0 > -62) {
            field2672 = null;
        }
        return this.field2651;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Liq;Ljava/lang/Object;II)V")
    private final void method1123(class396 arg0, Object arg1, int arg2, int arg3) {
        field2649++;
        if (arg2 > this.field2661) {
            throw new IllegalStateException("s>cs");
        }
        this.method1128(48, arg0);
        this.field2651 -= arg2;
        while (this.field2651 < 0) {
            class174 var7 = (class174) this.field2656.method334(27830);
            this.method1121(var7, (byte) -110);
        }
        int var5 = 30 % ((-arg3 - 69) / 47);
        class485 var6 = new class485(arg0, arg1, arg2);
        this.field2650.method1525((byte) 19, var6, arg0.method866(19470));
        this.field2656.method336(-111, var6);
        var6.field5532 = 0L;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
    public final void method1124(int arg0, int arg1) {
        field2655++;
        if (arg1 != 11) {
            method1120(84, -54);
        }
        if (class443.field5958 == null) {
            return;
        }
        for (class174 var3 = (class174) this.field2656.method332(17948); var3 != null; var3 = (class174) this.field2656.method331((byte) 116)) {
            if (var3.method1005(27969)) {
                if (var3.method1006((byte) 106) == null) {
                    var3.method2614((byte) -96);
                    var3.method2441((byte) -89);
                    this.field2651 += var3.field2381;
                }
            } else if (((long) arg0) < (++var3.field5532)) {
                class174 var4 = class443.field5958.method1383(arg1 + 107, var3);
                this.field2650.method1525((byte) 19, var4, var3.field6047);
                class147.method874(var3, var4, false);
                var3.method2614((byte) -105);
                var3.method2441((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public final void method1125(byte arg0) {
        for (class174 var2 = (class174) this.field2656.method332(17948); var2 != null; var2 = (class174) this.field2656.method331((byte) 107)) {
            if (var2.method1005(27969)) {
                var2.method2614((byte) -100);
                var2.method2441((byte) -116);
                this.field2651 += var2.field2381;
            }
        }
        if (arg0 <= 17) {
            this.method1123((class396) null, (Object) null, -55, 114);
        }
        field2657++;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field2668 = null;
        field2667 = null;
        field2666 = null;
        if (arg0 == -1) {
            field2672 = null;
            field2673 = null;
            field2671 = null;
            field2675 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)I")
    public final int method1127(int arg0) {
        if (arg0 != -19585) {
            field2673 = null;
        }
        field2662++;
        return this.field2661;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILiq;)V")
    private final void method1128(int arg0, class396 arg1) {
        field2654++;
        long var3 = arg1.method866(arg0 + 19422);
        if (arg0 != 48) {
            method1130((byte) 109, 94, -4);
        }
        for (class174 var5 = (class174) this.field2650.method1528(var3, 79); var5 != null; var5 = (class174) this.field2650.method1520((byte) 61)) {
            if (var5.field2380.method865((byte) 99, arg1)) {
                this.method1121(var5, (byte) -110);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method1129(boolean arg0, int arg1, int arg2, int arg3) {
        field2663++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = arg3 + var4; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - (arg1 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V")
    public class196(int arg0) {
        this.field2661 = arg0;
        this.field2651 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2650 = new class268(var2);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BII)V")
    public static final void method1130(byte arg0, int arg1, int arg2) {
        if (arg0 != -43) {
            method1120(-45, 3);
        }
        field2652++;
        class106 var3 = class250.method1400(16, -111, arg1);
        var3.method658(0);
        var3.field1589 = arg2;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Liq;I)Ljava/lang/Object;")
    public final Object method1131(class396 arg0, int arg1) {
        field2665++;
        long var3 = arg0.method866(arg1 ^ 0x4C0E);
        for (class174 var5 = (class174) this.field2650.method1528(var3, 90); var5 != null; var5 = (class174) this.field2650.method1520((byte) 84)) {
            if (var5.field2380.method865((byte) 93, arg0)) {
                Object var6 = var5.method1006((byte) 106);
                if (var6 != null) {
                    if (var5.method1005(27969)) {
                        class485 var7 = new class485(arg0, var6, var5.field2381);
                        this.field2650.method1525((byte) 19, var7, var5.field6047);
                        this.field2656.method336(-4, var7);
                        var7.field5532 = 0L;
                        var5.method2614((byte) -125);
                        var5.method2441((byte) -92);
                    } else {
                        this.field2656.method336(arg1 - 123, var5);
                        var5.field5532 = 0L;
                    }
                    return var6;
                }
                var5.method2614((byte) -124);
                var5.method2441((byte) -90);
                this.field2651 += var5.field2381;
            }
        }
        if (arg1 != 0) {
            this.method1125((byte) 92);
        }
        return null;
    }
}
