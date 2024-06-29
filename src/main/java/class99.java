import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lea;")
    private class30 field2206 = new class30();

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lp;")
    private class104 field2216 = new class104();

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Luf;")
    private class145 field2217;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lje;")
    public static class67 field2197 = class85.method592(255, "title_mute");

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[[[Lac;")
    public static class4[][][] field2200 = new class4[4][104][104];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lje;")
    private static class67 field2208 = class85.method592(255, "Service unavailable)3");

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lje;")
    private static class67 field2214 = class85.method592(255, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lje;")
    public static class67 field2202 = field2208;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lje;")
    public static class67 field2213 = field2214;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2203 = 255;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "[I")
    public static int[] field2201;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[Lsb;")
    public static class127[] field2209;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[Z")
    public static boolean[] field2211;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method763(boolean arg0) {
        field2211 = null;
        field2197 = null;
        if (!arg0) {
            method769(null, -28, -7);
        }
        field2202 = null;
        field2200 = null;
        field2201 = null;
        field2208 = null;
        field2209 = null;
        field2214 = null;
        field2213 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JI)Lea;")
    public final class30 method764(long arg0, int arg1) {
        field2207++;
        class30 var4 = (class30) this.field2217.method1119(28254, arg0);
        if (arg1 != 24182) {
            this.field2216 = null;
        }
        if (var4 != null) {
            this.field2216.method824(var4, arg1 ^ 0x5E77);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JLea;B)V")
    public final void method765(long arg0, class30 arg1, byte arg2) {
        field2199++;
        if (this.field2218 == 0) {
            class30 var5 = this.field2216.method823(-108);
            var5.method115(26851);
            var5.method192((byte) -66);
            if (this.field2206 == var5) {
                class30 var6 = this.field2216.method823(-48);
                var6.method115(26851);
                var6.method192((byte) -66);
            }
        } else {
            this.field2218--;
        }
        if (arg2 > -9) {
            this.method765(-22L, null, (byte) 112);
        }
        this.field2217.method1115(arg0, arg1, 1);
        this.field2216.method824(arg1, 1);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static final void method766(boolean arg0) {
        Object var1 = class85.field1879;
        synchronized (class85.field1879) {
            if (class69.field1404 == 0) {
                class154.field3519.method875(5, new class114(), 2);
            }
            class69.field1404 = 600;
        }
        if (arg0) {
            method768(-7, false, -43);
        }
        field2212++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method767(int arg0) {
        field2210++;
        while (true) {
            class30 var2 = this.field2216.method823(-85);
            if (var2 == null) {
                this.field2218 = this.field2215;
                if (arg0 == 1) {
                    return;
                } else {
                    this.method770(true, 22L);
                    return;
                }
            }
            var2.method115(26851);
            var2.method192((byte) -66);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)V")
    public static final void method768(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2203 = 5;
        }
        int[] var3 = new int[4];
        var3[0] = arg0;
        field2196++;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class130.field2861[var6] != arg0) {
                var3[var5] = class130.field2861[var6];
                var4[var5] = class142.field3244[var6];
                var5++;
            }
        }
        class142.field3244 = var4;
        class130.field2861 = var3;
        client.method144(class142.field3244, field2209.length - 1, (byte) -114, class130.field2861, 0, field2209);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lje;II)V")
    public static final void method769(class67 arg0, int arg1, int arg2) {
        field2205++;
        class67 var3 = arg0.method484((byte) 113).method460(83);
        boolean var4 = false;
        for (int var5 = arg1; var5 < class155.field3540; var5++) {
            class83 var6 = class85.field1885[class151.field3464[var5]];
            if (var6 != null && var6.field1854 != null && var6.field1854.method479(63, var3)) {
                var4 = true;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var6.field2993[0], var6.field2942[0], class37.field667.field2942[0], 0);
                if (arg2 == 1) {
                    class69.field1399.method285(178, (byte) 64);
                    class138.field3124++;
                    class69.field1399.method625(-128, class151.field3464[var5]);
                } else if (arg2 == 4) {
                    class69.field1399.method285(241, (byte) 64);
                    class69.field1399.method654(arg1 ^ 0x6B98, class151.field3464[var5]);
                    class138.field3128++;
                } else if (arg2 == 6) {
                    class69.field1399.method285(225, (byte) 64);
                    class69.field1399.method625(-128, class151.field3464[var5]);
                    class2.field9++;
                } else if (arg2 == 7) {
                    class148.field3398++;
                    class69.field1399.method285(102, (byte) 64);
                    class69.field1399.method666(class151.field3464[var5], -32768);
                }
                break;
            }
        }
        if (!var4) {
            class88.method614(class49.method314(new class67[] { class37.field666, var3 }, arg1), class52.field1030, 68, 0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZJ)V")
    public final void method770(boolean arg0, long arg1) {
        field2198++;
        if (arg0) {
            return;
        }
        class30 var4 = (class30) this.field2217.method1119(28254, arg1);
        if (var4 != null) {
            var4.method115(26851);
            var4.method192((byte) -66);
            this.field2218++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class99(int arg0) {
        this.field2215 = arg0;
        this.field2218 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2217 = new class145(var2);
    }
}
