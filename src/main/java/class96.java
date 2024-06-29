import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class96 extends class176 {

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public int field2288 = 0;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[Lkh;")
    public class98[] field2284 = new class98[5];

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "[I")
    public int[] field2290 = new int[5];

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Lgg;")
    private static class63 field2280 = class116.method911(43, "Loading sprites )2 ");

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lgg;")
    public static class63 field2273 = field2280;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field2287 = 20;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Lgg;")
    private static class63 field2297 = class116.method911(43, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lgg;")
    public static class63 field2296 = field2297;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lma;")
    public class109 field2271;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Lmh;")
    public class116 field2277;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lqc;")
    public class147 field2276;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lqh;")
    public class152 field2283;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lrg;")
    public class160 field2289;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Leb;")
    public class41 field2294;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lkf;")
    public class96 field2293;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Z")
    public boolean field2281;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Z")
    public boolean field2285;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Z")
    public boolean field2291;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V")
    public class96(int arg0, int arg1, int arg2) {
        this.field2278 = arg2;
        this.field2275 = arg1;
        this.field2282 = this.field2268 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method829(byte arg0) {
        field2296 = null;
        field2280 = null;
        field2273 = null;
        field2297 = null;
        if (arg0 < 55) {
            field2280 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLff;)Lgg;")
    public static final class63 method830(int arg0, byte arg1, class54 arg2) {
        if (arg1 > -107) {
            field2273 = null;
        }
        field2295++;
        if (!class65.method615(arg0, (byte) 99, class10.method136((byte) -127, arg2)) && arg2.field1311 == null) {
            return null;
        } else if (arg2.field1373 == null || arg0 >= arg2.field1373.length || arg2.field1373[arg0] == null || arg2.field1373[arg0].method578(false).method582(-48) == 0) {
            return class29.field673 ? class89.method772((byte) 95, new class63[] { class75.field1856, class175.method1162((byte) -126, arg0) }) : null;
        } else {
            return arg2.field1373[arg0];
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lff;I)Z")
    public static final boolean method831(class54 arg0, int arg1) {
        field2274++;
        if (arg1 != 5) {
            field2287 = -9;
        }
        if (arg0.field1349 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1349.length; var2++) {
            int var3 = class5.method85(var2, (byte) 74, arg0);
            int var4 = arg0.field1355[var2];
            if (arg0.field1349[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1349[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1349[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }
}
