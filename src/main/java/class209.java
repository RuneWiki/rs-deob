import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class209 implements class2 {

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lqh;")
    private class50 field2793 = new class50(128);

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private int[] field2795 = new int[class180.field2350.field1747];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public int[] field2789 = new int[class180.field2350.field1747];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1326(boolean arg0) {
        if (arg0) {
            field2800++;
            class415.field5978.method3045(48);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public final void method1327(int arg0, int arg1, int arg2) {
        this.field2795[arg0] = arg1;
        field2790++;
        int var4 = -52 % ((12 - arg2) / 56);
        class216 var5 = (class216) this.field2793.method295((long) arg0, -102);
        if (var5 == null) {
            class216 var6 = new class216(4611686018427387905L);
            this.field2793.method291((long) arg0, var6, -72);
        } else if (var5.field2943 != 4611686018427387905L) {
            var5.field2943 = class45.method252((byte) -8) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
    public static final int method1328(byte arg0) {
        if (arg0 > -74) {
            return -111;
        } else {
            field2786++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method1329(int arg0) {
        field2796++;
        for (int var2 = 0; var2 < class180.field2350.field1747; var2++) {
            class19 var4 = class180.field2350.method802(var2, (byte) 96);
            if (var4 != null && var4.field167 == 0) {
                this.field2795[var2] = 0;
                this.field2789[var2] = 0;
            }
        }
        int var3 = 55 / ((-arg0 - 43) / 60);
        this.field2793 = new class50(128);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V")
    public static final void method1330(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1326(true);
        }
        field2798++;
        class50 var3 = new class50(16);
        for (class166 var4 = (class166) class243.field3208.method300((byte) -114); var4 != null; var4 = (class166) class243.field3208.method301(-122)) {
            var4.method2674(true);
            int var5 = (int) (var4.field6348 >> 28);
            int var6 = (int) (var4.field6348 >> 14 & 0x3FFFL) - arg0;
            int var7 = (int) (var4.field6348 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class308.field4128 > var7 && class426.field6200 > var6) {
                var3.method291((long) (var7 | var6 << 14 | var5 << 28), var4, arg2 - 121);
            }
        }
        class243.field3208 = var3;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V")
    public final void method1331(int arg0, int arg1, int arg2) {
        this.field2789[arg0] = arg2;
        field2791++;
        class216 var4 = (class216) this.field2793.method295((long) arg0, -88);
        if (var4 == null) {
            class216 var5 = new class216(class45.method252((byte) -8) + 500L);
            this.field2793.method291((long) arg0, var5, -74);
        } else {
            var4.field2943 = class45.method252((byte) -8) + 500L;
        }
        if (arg1 != -1) {
            this.field2789 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)V")
    public final void method1332(int arg0, int arg1, int arg2) {
        field2787++;
        class148 var4 = class373.field5063.method680(arg0, 22940);
        int var5 = var4.field1949;
        int var6 = var4.field1947;
        int var7 = var4.field1952;
        int var8 = class242.field3198[var7 - var6];
        if (arg1 < ~arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1327(var5, this.field2795[var5] & ~var9 | arg2 << var6 & var9, -105);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public static final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2799++;
        class184 var5 = class277.method1682(arg1, 8, arg3 - 109);
        var5.method1069(true);
        var5.field2393 = arg4;
        var5.field2388 = arg0;
        var5.field2392 = arg2;
        if (arg3 != -1) {
            method1333(82, -100, -84, 16, 120);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    public final int method4(int arg0, int arg1) {
        if (arg1 == 1701908238) {
            field2797++;
            return this.field2789[arg0];
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(III)V")
    public final void method1334(int arg0, int arg1, int arg2) {
        field2788++;
        class148 var4 = class373.field5063.method680(arg1, 22940);
        int var5 = var4.field1949;
        int var6 = var4.field1947;
        int var7 = var4.field1952;
        int var8 = class242.field3198[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        if (arg0 != 6838) {
            this.field2793 = null;
        }
        this.method1331(var5, arg0 ^ 0xFFFFE549, ~var9 & this.field2789[var5] | var9 & arg2 << var6);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
    public final int method5(int arg0, int arg1) {
        if (arg0 != 0) {
            method1326(true);
        }
        field2794++;
        class148 var3 = class373.field5063.method680(arg1, 22940);
        int var4 = var3.field1949;
        int var5 = var3.field1947;
        int var6 = var3.field1952;
        int var7 = class242.field3198[var6 - var5];
        return this.field2789[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZ)I")
    public final int method1335(byte arg0, boolean arg1) {
        field2785++;
        long var3 = class45.method252((byte) -8);
        if (arg0 != -114) {
            this.field2789 = null;
        }
        for (class216 var5 = arg1 ? (class216) this.field2793.method300((byte) -102) : (class216) this.field2793.method301(arg0 - 1); var5 != null; var5 = (class216) this.field2793.method301(-125)) {
            if ((var5.field2943 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field2943 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6348;
                    this.field2789[var6] = this.field2795[var6];
                    var5.method2674(true);
                    return var6;
                }
                var5.method2674(true);
            }
        }
        return -1;
    }
}
