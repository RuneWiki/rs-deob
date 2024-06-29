import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class116 extends class28 {

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lqe;")
    private static class179 field2180 = class206.method1380("flash3:", (byte) -128);

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Lqe;")
    public static class179 field2186 = field2180;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Lqe;")
    public static class179 field2187 = field2180;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field2184 = -1;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[I")
    public static int[] field2185 = new int[100];

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lqe;")
    private static class179 field2182 = class206.method1380("Members object", (byte) -23);

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "[I")
    public static int[] field2192 = new int[32];

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Lqe;")
    public static class179 field2193 = field2182;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Lqe;")
    public static class179 field2188 = class206.method1380("oberen Rand der Webseite ausw-=hlen)3", (byte) 30);

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "B")
    public byte field2190;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Lee;")
    public class49 field2189;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public static final void method745(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field3662; var4++) {
            class167 var5 = var3.field3672[var4];
            if ((var5.field3014 >> 29 & 0x3L) == 2L && var5.field3006 == arg1 && var5.field3018 == arg2) {
                class234.method1522(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)Z")
    public static final boolean method746(boolean arg0, int arg1, int arg2) {
        field2181++;
        if (arg0) {
            field2182 = null;
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)Z")
    public static final boolean method747(int arg0, int arg1, int arg2) {
        int var3 = class177.field3224[arg0][arg1][arg2];
        if (-class18.field483 == var3) {
            return false;
        } else if (class18.field483 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class190.method1279(var4 + 1, class30.field665[arg0][arg1][arg2], var5 + 1) && class190.method1279(var4 + 128 - 1, class30.field665[arg0][arg1 + 1][arg2], var5 + 1) && class190.method1279(var4 + 128 - 1, class30.field665[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class190.method1279(var4 + 1, class30.field665[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class177.field3224[arg0][arg1][arg2] = class18.field483;
                return true;
            } else {
                class177.field3224[arg0][arg1][arg2] = -class18.field483;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
    public static void method748(boolean arg0) {
        field2192 = null;
        field2186 = null;
        field2185 = null;
        field2180 = null;
        field2188 = null;
        field2187 = null;
        if (!arg0) {
            field2193 = null;
            field2182 = null;
        }
    }
}
