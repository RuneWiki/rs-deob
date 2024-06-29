import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class179 extends class5 {

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public int field2397 = 0;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Lga;")
    public static class282 field2389 = null;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "Lla;")
    public static class319 field2396 = new class319(4, 6);

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Lub;")
    public class17 field2388;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "Lcd;")
    public class209 field2402;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "Lt;")
    public class481 field2391;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "Lt;")
    public class481 field2400;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "Lwk;")
    public class96 field2386;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2410;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "Z")
    public boolean field2399;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "[I")
    public int[] field2387;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "[I")
    public static int[] field2408;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 6)
    public static void method1199(int arg0) {
        field2410 = null;
        field2396 = null;
        if (arg0 == -19495) {
            field2408 = null;
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method1200(int arg0, int arg1, int arg2) {
        field2390++;
        int var3 = 71 % ((44 - arg0) / 35);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V", line = 47)
    public final void method1201(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2395++;
        int var2 = this.field2401;
        if (this.field2402 != null) {
            class209 var3 = this.field2402.method1435(arg0, class288.field4208);
            if (var3 == null) {
                this.field2384 = 0;
                this.field2405 = 0;
                this.field2387 = null;
                this.field2393 = 0;
                this.field2407 = 0;
                this.field2401 = -1;
            } else {
                this.field2384 = var3.field2886 << 7;
                this.field2405 = var3.field2898;
                this.field2407 = var3.field2949;
                this.field2401 = var3.field2904;
                this.field2387 = var3.field2944;
                this.field2393 = var3.field2970;
            }
        } else if (this.field2388 != null) {
            int var4 = class221.method1487(arg0, this.field2388);
            if (var2 != var4) {
                this.field2401 = var4;
                class258 var5 = this.field2388.field274;
                if (var5.field3627 != null) {
                    var5 = var5.method1660(class288.field4208, (byte) 74);
                }
                if (var5 == null) {
                    this.field2405 = this.field2384 = 0;
                } else {
                    this.field2384 = var5.field3571 << 7;
                    this.field2405 = var5.field3576;
                }
            }
        } else if (this.field2386 != null) {
            this.field2401 = class170.method1160(arg0 + 56, this.field2386);
            this.field2405 = this.field2386.field1385;
            this.field2384 = this.field2386.field1406 << 7;
        }
        if (this.field2401 != var2 && this.field2400 != null) {
            class31.field463.method883(this.field2400);
            this.field2400 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)Lgw;", line = 143)
    public static final class117 method1202(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field2398++;
        if (arg1 == 0) {
            if ((double) class12.field223 == 3.0D) {
                return class331.field5169;
            }
            if ((double) class12.field223 == 4.0D) {
                return class175.field2345;
            }
            if ((double) class12.field223 == 6.0D) {
                return class429.field6539;
            }
            if ((double) class12.field223 >= 8.0D) {
                return class24.field354;
            }
        } else if (arg1 == 1) {
            if ((double) class12.field223 == 3.0D) {
                return class429.field6539;
            }
            if ((double) class12.field223 == 4.0D) {
                return class24.field354;
            }
            if ((double) class12.field223 == 6.0D) {
                return class370.field5640;
            }
            if ((double) class12.field223 >= 8.0D) {
                return class323.field4676;
            }
        } else if (arg1 == 2) {
            if ((double) class12.field223 == 3.0D) {
                return class370.field5640;
            }
            if ((double) class12.field223 == 4.0D) {
                return class323.field4676;
            }
            if ((double) class12.field223 == 6.0D) {
                return class112.field1564;
            }
            if ((double) class12.field223 >= 8.0D) {
                return class437.field6614;
            }
        }
        return null;
    }
}
