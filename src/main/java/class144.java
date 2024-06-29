import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class144 extends class86 {

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public int field2238 = 0;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Z")
    public static boolean field2246 = true;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static volatile int field2251 = -1;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lsc;")
    public static class256 field2231 = new class256(64);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lcd;")
    public class28 field2240;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lna;")
    public class32 field2249;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Ltd;")
    public class73 field2228;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Leh;")
    public class82 field2233;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Leh;")
    public class82 field2237;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Z")
    public boolean field2247;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
    public int[] field2227;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method994(byte arg0) {
        field2234++;
        if (class265.field4221) {
            return;
        }
        class216.field3333 = true;
        if (arg0 != 35) {
            return;
        }
        if (class195.field3070) {
            class276.field4334 = (float) ((int) class276.field4334 - 65 & 0xFFFFFF80);
        } else {
            class53.field821 += (-24.0F - class53.field821) / 2.0F;
        }
        class265.field4221 = true;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)[Ldi;")
    public static final class179[] method995(int arg0) {
        field2229++;
        class179[] var1 = new class179[class163.field2489];
        int var2 = 95 / ((arg0 - 63) / 60);
        for (int var3 = 0; var3 < class163.field2489; var3++) {
            var1[var3] = new class168(class205.field3187, class174.field2581, class184.field2764[var3], class239.field3698[var3], class270.field4281[var3], class107.field1717[var3], class289.field4554[var3], class35.field560);
        }
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
    public final void method996(boolean arg0) {
        field2236++;
        int var2 = this.field2243;
        if (!arg0) {
            field2246 = false;
        }
        if (this.field2228 != null) {
            class73 var5 = this.field2228.method577(81);
            if (var5 == null) {
                this.field2252 = 0;
                this.field2227 = null;
                this.field2235 = 0;
                this.field2244 = 0;
                this.field2232 = 0;
                this.field2243 = -1;
            } else {
                this.field2252 = var5.field1194;
                this.field2235 = var5.field1229;
                this.field2243 = var5.field1218;
                this.field2232 = var5.field1165;
                this.field2227 = var5.field1220;
                this.field2244 = var5.field1184 * 128;
            }
        } else if (this.field2249 != null) {
            int var3 = class7.method85(-1, this.field2249);
            if (var2 != var3) {
                class217 var4 = this.field2249.field518;
                this.field2243 = var3;
                if (var4.field3405 != null) {
                    var4 = var4.method1446(70);
                }
                if (var4 == null) {
                    this.field2232 = this.field2244 = 0;
                } else {
                    this.field2244 = var4.field3401 * 128;
                    this.field2232 = var4.field3416;
                }
            }
        } else if (this.field2240 != null) {
            this.field2243 = class237.method1594((byte) 88, this.field2240);
            this.field2244 = this.field2240.field444 * 128;
            this.field2232 = this.field2240.field441;
        }
        if (this.field2243 != var2 && this.field2233 != null) {
            class39.field661.method718(this.field2233);
            this.field2233 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method997(int arg0) {
        if (arg0 < -6) {
            field2231 = null;
        }
    }
}
