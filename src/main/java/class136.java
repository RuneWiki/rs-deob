import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class136 implements class21 {

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    private int field2486 = 50;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "Z")
    private boolean field2502 = false;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lal;")
    private class230 field2483;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "Lal;")
    private class230 field2498;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lvj;")
    private class115 field2480;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "Lvj;")
    private class115 field2505;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[B")
    private byte[] field2473;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[B")
    private byte[] field2472;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "[Z")
    private boolean[] field2500;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[Z")
    private boolean[] field2478;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[Z")
    private boolean[] field2470;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[B")
    private byte[] field2482;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[Z")
    private boolean[] field2485;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[Z")
    private boolean[] field2477;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[B")
    private byte[] field2476;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "[S")
    private short[] field2489;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lid;")
    private static class149 field2474 = class60.method382("Loaded input handler", (byte) 117);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[[[I")
    public static int[][][] field2481 = new int[2][][];

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lid;")
    public static class149 field2490 = class60.method382("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 29);

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "[I")
    public static int[] field2493 = new int[256];

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lid;")
    public static class149 field2475 = field2474;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field2496 = 0;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Z")
    public static boolean field2503;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[[B")
    public static byte[][] field2484;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)I")
    public final int method123(byte arg0, int arg1) {
        field2492++;
        return arg0 > -116 ? -112 : this.field2489[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)V")
    public final void method949(int arg0, boolean arg1) {
        int var3 = 43 % ((arg0 + 12) / 61);
        this.field2502 = arg1;
        this.method951(0);
        field2499++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Z")
    public final boolean method121(int arg0, byte arg1) {
        field2488++;
        if (arg1 == -95) {
            class129 var3 = this.method950((byte) 120, arg0);
            return var3 == null ? false : var3.method898(this.field2498, (byte) -105, this);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(BI)Lqi;")
    private final class129 method950(byte arg0, int arg1) {
        field2497++;
        class129 var3 = (class129) this.field2480.method800(261775, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2483.method1562(-809612665, 0, arg1);
        if (var4 == null) {
            return null;
        }
        class74 var5 = new class74(var4);
        if (arg0 <= 59) {
            field2481 = null;
        }
        class129 var6 = new class129(var5);
        this.field2480.method802((long) arg1, 0, var6);
        return var6;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method951(int arg0) {
        if (arg0 != 0) {
            this.field2476 = null;
        }
        field2491++;
        this.field2480.method804(arg0 + 20);
        if (this.field2505 != null) {
            this.field2505.method804(arg0 + 20);
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(II)Z")
    public final boolean method124(int arg0, int arg1) {
        field2471++;
        return arg0 == 0 ? this.field2470[arg1] : true;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)[I")
    public final int[] method120(int arg0, int arg1) {
        field2494++;
        class129 var3 = this.method950((byte) 122, arg1);
        int var4 = 96 % ((15 - arg0) / 36);
        return var3 == null ? null : var3.method904(this.field2502 || this.field2500[arg1], (byte) 120, this, this.field2498);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
    public final boolean method118(int arg0, int arg1) {
        field2479++;
        if (this.field2502 || this.field2500[arg0]) {
            return true;
        } else {
            return arg1 != 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IFI)[I")
    public final int[] method122(int arg0, float arg1, int arg2) {
        if (arg2 != 15964) {
            this.field2482 = null;
        }
        class129 var4 = this.method950((byte) 123, arg0);
        field2495++;
        if (var4 == null) {
            return null;
        } else {
            var4.field2282 = true;
            return var4.method905(this.field2498, this, arg2 - 46777, arg1, this.field2502 || this.field2500[arg0]);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IB)V")
    public final void method952(int arg0, byte arg1) {
        if (arg1 != -33) {
            return;
        }
        for (class129 var3 = (class129) this.field2480.method801(3); var3 != null; var3 = (class129) this.field2480.method799((byte) 88)) {
            if (var3.field2282) {
                var3.method902(true, arg0);
                var3.field2282 = false;
            }
        }
        field2487++;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(II)I")
    public static int method953(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Z")
    public final boolean method119(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method118(-93, 58);
        }
        field2501++;
        return this.field2485[arg1];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method954(boolean arg0) {
        if (arg0) {
            field2481 = null;
        }
        field2474 = null;
        field2484 = null;
        field2475 = null;
        field2493 = null;
        field2490 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
    public static final void method955(boolean arg0) {
        field2504++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class182.field3281; var1++) {
            int var2 = class110.field1906[var1];
            class20 var3 = class38.field572[var2];
            if (var3 != null) {
                class157.method1130(-1, var3.field296.field1049, var3);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lal;Lal;Lal;IZ)V")
    public class136(class230 arg0, class230 arg1, class230 arg2, int arg3, boolean arg4) {
        this.field2502 = arg4;
        this.field2483 = arg0;
        this.field2486 = arg3;
        this.field2498 = arg2;
        this.field2480 = new class115(this.field2486);
        this.field2505 = null;
        class74 var6 = new class74(arg1.method1562(-809612665, 0, 0));
        int var7 = var6.method485(-2386);
        this.field2473 = new byte[var7];
        this.field2472 = new byte[var7];
        this.field2500 = new boolean[var7];
        this.field2478 = new boolean[var7];
        this.field2470 = new boolean[var7];
        this.field2482 = new byte[var7];
        this.field2485 = new boolean[var7];
        this.field2477 = new boolean[var7];
        this.field2476 = new byte[var7];
        this.field2489 = new short[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2477[var8] = var6.method489((byte) -126) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2477[var9]) {
                this.field2485[var9] = var6.method489((byte) 106) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2477[var10]) {
                this.field2470[var10] = var6.method489((byte) 86) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2477[var11]) {
                this.field2500[var11] = var6.method489((byte) -88) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2477[var12]) {
                this.field2478[var12] = var6.method489((byte) -112) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2477[var13]) {
                this.field2473[var13] = var6.method514((byte) 1);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2477[var14]) {
                this.field2482[var14] = var6.method514((byte) 1);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2477[var15]) {
                this.field2476[var15] = var6.method514((byte) 1);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2477[var16]) {
                this.field2472[var16] = var6.method514((byte) 1);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2477[var17]) {
                this.field2489[var17] = (short) var6.method485(-2386);
            }
        }
    }
}
