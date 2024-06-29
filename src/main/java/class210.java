import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class210 {

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lhn;")
    private class509 field2811 = new class509(64);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lhn;")
    public class509 field2812 = new class509(2);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lfo;")
    private class361 field2804;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lfo;")
    public class361 field2810;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2809;

    static {
        new class305("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 4)
    public final void method1336(int arg0) {
        field2801++;
        if (arg0 != 33) {
            method1337((byte) -97, null, null);
        }
        class509 var2 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method3045(48);
        }
        class509 var3 = this.field2812;
        synchronized (this.field2812) {
            this.field2812.method3045(arg0 + 15);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLfo;Lfo;)V", line = 20)
    public static final void method1337(byte arg0, class361 arg1, class361 arg2) {
        field2809++;
        if (arg0 < 91) {
            field2808 = 71;
        }
        class398.field5794 = arg1;
        class26.field257 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I", line = 43)
    public static final int method1338(int arg0, int arg1, int arg2) {
        field2807++;
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg0 > -115) {
            method1337((byte) -17, null, null);
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 59)
    public static final void method1339(int arg0, int arg1) {
        field2805++;
        class184 var2 = class277.method1682(arg0, 10, -104);
        if (arg1 <= -112) {
            var2.method1075((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lfn;", line = 78)
    public final class93 method1340(int arg0, int arg1) {
        field2803++;
        class509 var3 = this.field2811;
        class93 var4;
        synchronized (this.field2811) {
            var4 = (class93) this.field2811.method3032(arg0 + 3556, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field2804;
        byte[] var6;
        synchronized (this.field2804) {
            var6 = this.field2804.method2130(arg0, arg1, -118);
        }
        class93 var7 = new class93();
        var7.field1114 = this;
        if (var6 != null) {
            var7.method517(arg0 ^ 0x4B, new class396(var6));
        }
        class509 var8 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 106)
    public final void method1341(int arg0) {
        if (arg0 != 6333) {
            this.method1336(111);
        }
        field2802++;
        class509 var2 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method3034((byte) 93);
        }
        class509 var3 = this.field2812;
        synchronized (this.field2812) {
            this.field2812.method3034((byte) 67);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V", line = 122)
    public final void method1342(int arg0, int arg1) {
        class509 var3 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method3036(arg0, (byte) -114);
        }
        if (arg1 > -5) {
            return;
        }
        field2806++;
        class509 var4 = this.field2812;
        synchronized (this.field2812) {
            this.field2812.method3036(arg0, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ld;ILfo;Lfo;)V", line = 146)
    public class210(class104 arg0, int arg1, class361 arg2, class361 arg3) {
        this.field2804 = arg2;
        this.field2810 = arg3;
        this.field2804.method2136(-120, 33);
    }
}
