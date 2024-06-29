import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class480 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/lang/String;")
    private String field6757 = "null";

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[I")
    public static int[] field6762 = new int[4096];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lsh;")
    public static class472 field6766;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "C")
    public char field6761;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "C")
    public char field6763;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    private int field6760;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lfa;")
    public class371 field6750;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lfa;")
    private class371 field6753;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method2814(int arg0) {
        field6762 = null;
        field6766 = null;
        if (arg0 != 15793) {
            method2822(-117, (String[]) null, (short[]) null, -39, -33);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2815(int arg0, int arg1) {
        field6756++;
        if (this.field6750 == null) {
            return this.field6757;
        }
        class81 var3 = (class81) this.field6750.method2305((long) arg0, (byte) 99);
        if (var3 == null) {
            return this.field6757;
        } else {
            if (arg1 != 5) {
                this.field6750 = null;
            }
            return var3.field1141;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lre;II)V")
    private final void method2816(class446 arg0, int arg1, int arg2) {
        if (arg1 != 4096) {
            return;
        }
        field6754++;
        if (arg2 == 1) {
            this.field6763 = class372.method2308(arg0.method2642(true), (byte) -70);
        } else if (arg2 == 2) {
            this.field6761 = class372.method2308(arg0.method2642(true), (byte) -70);
        } else if (arg2 == 3) {
            this.field6757 = arg0.method2582((byte) -106);
        } else if (arg2 == 4) {
            this.field6760 = arg0.method2604(-114);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method2631(2530);
            this.field6750 = new class371(class158.method1078((byte) -104, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2604(-112);
                class35 var7;
                if (arg2 == 5) {
                    var7 = new class81(arg0.method2582((byte) -68));
                } else {
                    var7 = new class145(arg0.method2604(22));
                }
                this.field6750.method2307((long) var6, var7, (byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)Z")
    public final boolean method2817(int arg0, int arg1) {
        field6765++;
        if (arg0 != 5) {
            return false;
        } else if (this.field6750 == null) {
            return false;
        } else {
            if (this.field6753 == null) {
                this.method2821(72);
            }
            class145 var3 = (class145) this.field6753.method2305((long) arg1, (byte) 54);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lre;B)V")
    public final void method2818(class446 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field6751++;
                if (arg1 != -91) {
                    this.method2820(9);
                    return;
                }
                return;
            }
            this.method2816(arg0, 4096, var3);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2819(byte arg0, String arg1) {
        field6755++;
        if (this.field6750 == null) {
            return false;
        }
        if (this.field6753 == null) {
            this.method2820(-1);
        }
        class88 var3 = (class88) this.field6753.method2305(class314.method1942((byte) -72, arg1), (byte) 49);
        if (arg0 != -5) {
            return false;
        }
        while (var3 != null) {
            if (var3.field1244.equals(arg1)) {
                return true;
            }
            var3 = (class88) this.field6753.method2306((byte) 21);
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    private final void method2820(int arg0) {
        field6759++;
        this.field6753 = new class371(this.field6750.method2300(-96));
        for (class81 var2 = (class81) this.field6750.method2296((byte) 39); var2 != null; var2 = (class81) this.field6750.method2297(true)) {
            class88 var3 = new class88(var2.field1141, (int) var2.field436);
            this.field6753.method2307(class314.method1942((byte) -125, var2.field1141), var3, (byte) 123);
        }
        if (arg0 != -1) {
            this.method2815(-119, -112);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    private final void method2821(int arg0) {
        field6764++;
        if (arg0 < 71) {
            return;
        }
        this.field6753 = new class371(this.field6750.method2300(-108));
        for (class145 var2 = (class145) this.field6750.method2296((byte) 39); var2 != null; var2 = (class145) this.field6750.method2297(true)) {
            class145 var3 = new class145((int) var2.field436);
            this.field6753.method2307((long) var2.field2054, var3, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V")
    public static final void method2822(int arg0, String[] arg1, short[] arg2, int arg3, int arg4) {
        int var5 = 73 % ((49 - arg4) / 36);
        field6758++;
        if (arg3 <= arg0) {
            return;
        }
        int var6 = (arg0 + arg3) / 2;
        int var7 = arg0;
        String var8 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var8;
        short var9 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var9;
        for (int var10 = arg0; var10 < arg3; var10++) {
            if (var8 == null || arg1[var10] != null && (var10 & 0x1) > arg1[var10].compareTo(var8)) {
                String var11 = arg1[var10];
                arg1[var10] = arg1[var7];
                arg1[var7] = var11;
                short var12 = arg2[var10];
                arg2[var10] = arg2[var7];
                arg2[var7++] = var12;
            }
        }
        arg1[arg3] = arg1[var7];
        arg1[var7] = var8;
        arg2[arg3] = arg2[var7];
        arg2[var7] = var9;
        method2822(arg0, arg1, arg2, var7 - 1, 99);
        method2822(var7 + 1, arg1, arg2, arg3, -106);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
    public final int method2823(boolean arg0, int arg1) {
        field6752++;
        if (this.field6750 == null) {
            return this.field6760;
        }
        class145 var3 = (class145) this.field6750.method2305((long) arg1, (byte) 15);
        if (var3 == null) {
            return this.field6760;
        } else {
            if (!arg0) {
                this.method2817(-41, 124);
            }
            return var3.field2054;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6762[var0] = class187.method1289(var0, (byte) -14);
        }
        field6766 = new class472(34, -1);
    }
}
