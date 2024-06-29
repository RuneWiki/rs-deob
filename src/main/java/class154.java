import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class154 extends class5 {

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Z")
    public boolean field3116 = false;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lbg;")
    private class18 field3134;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "Z")
    public boolean field3139;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
    public boolean field3128;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    private int field3133;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Led;")
    public static class43 field3121 = class191.method1219(":assistreq:", false);

    @OriginalMember(owner = "client!r", name = "S", descriptor = "Led;")
    public static class43 field3124 = class191.method1219("event_opbase", false);

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Led;")
    public static class43 field3131 = class191.method1219("Verbindung konnte nicht hergestellt werden)3", false);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Led;")
    public static class43 field3126 = class191.method1219(")4slr)3ws?order=LPWM", false);

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Led;")
    public static class43 field3123 = class191.method1219(")1j", false);

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field3140 = 2301979;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "F")
    private float field3114;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "Lqb;")
    public static class147 field3132;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "[I")
    private int[] field3117;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[Ltg;")
    public static class179[] field3136;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static final void method978(int arg0) {
        if (arg0 < 84) {
            field3126 = null;
        }
        for (int var1 = -1; var1 < class170.field3399; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class125.field2472[var1];
            }
            class1 var3 = class12.field183[var2];
            if (var3 != null) {
                class170.method1083(105, 1, var3);
            }
        }
        field3137++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lga;Lai;Z)Z")
    public final boolean method979(class58 arg0, class10 arg1, boolean arg2) {
        if (!arg2) {
            field3131 = null;
        }
        field3113++;
        return this.field3134.method85(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILai;Lga;I)[I")
    public final int[] method980(int arg0, class10 arg1, class58 arg2, int arg3) {
        if (arg3 < 95) {
            field3140 = 82;
        }
        field3119++;
        if (this.field3134.method85(false, arg1, arg2)) {
            int var5 = this.field3115 <= arg0 ? this.field3115 : arg0;
            return this.field3134.method90(var5, arg2, var5, arg1, false, 1.0D, (byte) 52);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3130++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method981(byte arg0) {
        field3118++;
        if (arg0 != -19) {
            method981((byte) 23);
        }
        for (class127 var1 = (class127) class100.field1915.method753(-26703); var1 != null; var1 = (class127) class100.field1915.method755((byte) 116)) {
            if (class93.field1839 != var1.field2536 || var1.field2518 < client.field559) {
                var1.method417(123);
            } else if (var1.field2550 <= client.field559) {
                if (var1.field2522 > 0) {
                    class77 var2 = class172.field3433[var1.field2522 - 1];
                    if (var2 != null && var2.field2347 >= 0 && var2.field2347 < 13312 && var2.field2328 >= 0 && var2.field2328 < 13312) {
                        var1.method816(client.field559, class108.method668(var2.field2328, var2.field2347, -128, var1.field2536) - var1.field2532, 1, var2.field2328, var2.field2347);
                    }
                }
                if (var1.field2522 < 0) {
                    int var3 = -var1.field2522 - 1;
                    class1 var4;
                    if (class80.field1593 == var3) {
                        var4 = class67.field1348;
                    } else {
                        var4 = class12.field183[var3];
                    }
                    if (var4 != null && var4.field2347 >= 0 && var4.field2347 < 13312 && var4.field2328 >= 0 && var4.field2328 < 13312) {
                        var1.method816(client.field559, class108.method668(var4.field2328, var4.field2347, arg0 ^ 0x6D, var1.field2536) - var1.field2532, 1, var4.field2328, var4.field2347);
                    }
                }
                var1.method815(class65.field1325, (byte) -38);
                class137.field2842.method1154(class93.field1839, (int) var1.field2530, (int) var1.field2537, (int) var1.field2514, 60, var1, var1.field2517, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public final void method982(int arg0, int arg1) {
        field3120++;
        if (this.field3117 == null) {
            return;
        }
        if (this.field3125 != 0) {
            if (class48.field967 == null || this.field3117.length > class48.field967.length) {
                class48.field967 = new int[this.field3117.length];
            }
            int var3 = this.field3117.length;
            short var4;
            if (this.field3117.length == 4096) {
                var4 = 64;
            } else {
                var4 = 128;
            }
            int var5 = var3 - 1;
            int var6 = arg1 * var4 * this.field3129;
            if (this.field3125 == 2) {
                var6 = -var6;
            }
            for (int var7 = 0; var7 < var3; var7++) {
                int var9 = var5 & var6 + var7;
                class48.field967[var7] = this.field3117[var9];
            }
            int[] var8 = this.field3117;
            this.field3117 = class48.field967;
            class48.field967 = var8;
        }
        if (this.field3127 != 0) {
            if (class48.field967 == null || class48.field967.length < this.field3117.length) {
                class48.field967 = new int[this.field3117.length];
            }
            short var10;
            if (this.field3117.length == 4096) {
                var10 = 64;
            } else {
                var10 = 128;
            }
            int var11 = this.field3117.length;
            int var12 = this.field3129 * arg1;
            if (this.field3127 == 1) {
                var12 = -var12;
            }
            int var13 = var10 - 1;
            for (int var14 = 0; var14 < var11; var14 += var10) {
                for (int var16 = 0; var16 < var10; var16++) {
                    int var17 = (var13 & var12 + var16) + var14;
                    int var18 = var14 + var16;
                    class48.field967[var18] = this.field3117[var17];
                }
            }
            int[] var15 = this.field3117;
            this.field3117 = class48.field967;
            class48.field967 = var15;
        }
        if (arg0 < 5) {
            method984(false);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lga;Lai;IFI)[I")
    public final int[] method983(class58 arg0, class10 arg1, int arg2, float arg3, int arg4) {
        field3138++;
        if (this.field3117 == null || this.field3114 != arg3) {
            if (!this.field3134.method85(false, arg1, arg0)) {
                return null;
            }
            int var6 = this.field3115 > arg4 ? arg4 : this.field3115;
            this.field3117 = this.field3134.method90(var6, arg0, var6, arg1, true, (double) arg3, (byte) -120);
            this.field3114 = arg3;
        }
        return arg2 == -1 ? this.field3117 : null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public static void method984(boolean arg0) {
        if (!arg0) {
            field3136 = null;
        }
        field3132 = null;
        field3121 = null;
        field3126 = null;
        field3136 = null;
        field3124 = null;
        field3131 = null;
        field3123 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljg;)V")
    public class154(class89 arg0) {
        this.field3134 = new class18(arg0);
        int var2 = arg0.method538((byte) -77);
        this.field3139 = (var2 & 0x1) != 0;
        this.field3128 = (var2 & 0x2) != 0;
        this.field3115 = arg0.method538((byte) 125);
        this.field3122 = arg0.method555(-1113627096);
        this.field3133 = arg0.method538((byte) -51);
        if (this.field3133 == 255) {
            this.field3133 = 256;
        }
        int var3 = arg0.method538((byte) 100);
        int var4 = arg0.method538((byte) -34);
        this.field3129 = (var4 & 0x3F) - 6;
        this.field3127 = var3 >> 6 & 0x3;
        this.field3125 = var4 >> 6 & 0x3;
        arg0.method538((byte) 84);
        arg0.method538((byte) -113);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class154() {
        this.field3134 = new class18();
        this.field3139 = true;
        this.field3115 = 1;
    }
}
