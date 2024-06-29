import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class101 extends class109 {

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lfd;")
    public static class55 field2218 = null;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Ldd;")
    public static class35 field2225 = class180.method1196((byte) 127, "(U");

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Ldd;")
    public static class35 field2231 = class180.method1196((byte) -81, "::autoshadow off");

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field2230 = 1;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field2228 = 0;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[S")
    public static short[] field2215 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Lai;")
    public class10 field2227;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "Lrd;")
    public class165 field2249;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lre;")
    public class166 field2221;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lje;")
    public class94 field2217;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "[Lbg;")
    public static class18[] field2240;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[[Z")
    public static boolean[][] field2219;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbe;III)V")
    public static final void method755(class16 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class113.field2536) {
            class54 var4 = class191.field3853[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1230 != null && var4.field1230.field2751 instanceof class16) {
                class16 var5 = (class16) var4.field1230.field2751;
                class16.method126(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class113.field2536) {
            class54 var6 = class191.field3853[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field1230 != null && var6.field1230.field2751 instanceof class16) {
                class16 var7 = (class16) var6.field1230.field2751;
                class16.method126(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class113.field2536 && arg3 < class102.field2272) {
            class54 var8 = class191.field3853[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field1230 != null && var8.field1230.field2751 instanceof class16) {
                class16 var9 = (class16) var8.field1230.field2751;
                class16.method126(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 >= class113.field2536 || arg3 <= 0) {
            return;
        }
        class54 var10 = class191.field3853[arg1][arg2 + 1][arg3 - 1];
        if (var10 != null && var10.field1230 != null && var10.field1230.field2751 instanceof class16) {
            class16 var11 = (class16) var10.field1230.field2751;
            class16.method126(arg0, var11, 128, 0, -128, true);
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static void method756(int arg0) {
        field2215 = null;
        field2218 = null;
        field2231 = null;
        field2225 = null;
        if (arg0 <= -70) {
            field2240 = null;
            field2219 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method757(int arg0) {
        this.field2221 = null;
        this.field2249 = null;
        this.field2227 = null;
        field2236++;
        if (arg0 != 0) {
            method755(null, 12, -27, -28);
        }
        this.field2217 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static final void method758(byte arg0) {
        field2238++;
        class35.field781 = false;
        if (arg0 <= 54) {
            method756(-52);
        }
        class154.field3173 = false;
    }
}
