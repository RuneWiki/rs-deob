import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class95 extends class115 {

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lha;")
    private class50 field2221;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Lvc;")
    private static class137 field2230 = class45.method325("shake:", -46);

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "[[B")
    public static byte[][] field2237 = new byte[1000][];

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "Lvc;")
    public static class137 field2243 = class45.method325("mod_icons", -46);

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "[[I")
    public static int[][] field2241 = new int[104][104];

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "Lvc;")
    public static class137 field2239 = class45.method325("Texturen geladen)3", -46);

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "Lvc;")
    private static class137 field2228 = class45.method325("purple:", -46);

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Lvc;")
    public static class137 field2240 = field2230;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Lvc;")
    private static class137 field2236 = class45.method325("Loading wordpack )2 ", -46);

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Lvc;")
    public static class137 field2231 = field2228;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Lvc;")
    public static class137 field2242 = field2236;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lvb;")
    private class136 field2222;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "Lvd;")
    public static class138 field2238;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "Lia;")
    public static class57 field2244;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Z")
    private boolean field2220;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Z")
    private boolean field2235;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "[B")
    private byte[] field2226;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public final void method157(byte arg0) {
        if (arg0 >= -107) {
            field2231 = null;
        }
        field2223++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLcf;Lfc;I)V")
    public static final void method683(boolean arg0, class21 arg1, class39 arg2, int arg3) {
        byte[] var4 = null;
        if (arg0) {
            return;
        }
        field2232++;
        class100 var5 = class106.field2471;
        synchronized (class106.field2471) {
            for (class98 var6 = (class98) class106.field2471.method726(0); var6 != null; var6 = (class98) class106.field2471.method731((byte) -117)) {
                if ((long) arg3 == var6.field2490 && var6.field2295 == arg1 && var6.field2280 == 0) {
                    var4 = var6.field2276;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg1.method180(arg3, -7745);
            arg2.method278(var7, true, arg1, -71, arg3);
        } else {
            arg2.method278(var4, true, arg1, -73, arg3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
    public static void method684(boolean arg0) {
        field2239 = null;
        field2236 = null;
        field2230 = null;
        field2237 = null;
        field2231 = null;
        field2238 = null;
        field2244 = null;
        field2241 = null;
        field2242 = null;
        field2228 = null;
        field2240 = null;
        if (!arg0) {
            field2243 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public final void method160(int arg0) {
        field2227++;
        if (this.field2222 == null || (arg0 != 31 || this.field2222.field3131 == 0)) {
            return;
        }
        if (this.field2222.field3131 == 1) {
            class54 var2 = (class54) this.field2222.field3129;
            try {
                var2.method378(this.field2226.length, this.field2226, 0, arg0 ^ 0xFFFFFFE0);
                var2.method380((byte) -50);
                try {
                    class117.method901("midibox.loop=" + (this.field2220 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method382(arg0 - 31).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2225 + ";", -23462, this.field2221.field1116);
                    this.field2235 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method380((byte) -50);
                } catch (Exception var3) {
                }
            }
        }
        this.field2222 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lha;)V")
    public class95(class50 arg0) {
        this.field2221 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (this.field2235) {
            try {
                class117.method901("midibox.src=\"c:/silence.mid\";", arg0 ^ 0xFFFFA42E, this.field2221.field1116);
            } catch (Throwable var2) {
            }
            this.field2235 = false;
        }
        if (arg0 != 116) {
            this.field2222 = null;
        }
        field2219++;
        this.field2222 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
    public final void method154(boolean arg0, int arg1) {
        if (!arg0) {
            field2234++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)I")
    public static final int method685(int arg0, byte arg1, int arg2) {
        field2233++;
        class82 var3 = (class82) class84.field1899.method867((long) arg0, false);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 <= 9) {
                method683(false, null, null, -49);
            }
            for (int var5 = 0; var5 < var3.field1847.length; var5++) {
                if (var3.field1849[var5] == arg2) {
                    var4 += var3.field1847[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final void method156(int arg0, int arg1, int arg2) {
        field2246++;
        if (arg1 == 0) {
            arg1 = 1;
        }
        int var4 = class28.method224(7470, arg1) - arg2;
        int var5 = 47 / ((-arg0 - 49) / 53);
        if (this.field2222 != null) {
            this.field2225 = var4;
        } else if (this.field2235) {
            try {
                class117.method901("midibox.volume=" + var4 + ";", -23462, this.field2221.field1116);
                return;
            } catch (Throwable var6) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI[B)V")
    public final void method159(int arg0, boolean arg1, int arg2, byte[] arg3) {
        field2224++;
        this.field2222 = this.field2221.method359(8152);
        if (this.field2222 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        if (arg0 == 17) {
            this.field2225 = class28.method224(7470, arg2);
            this.field2226 = arg3;
            this.field2220 = arg1;
        }
    }
}
