import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class453 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field6421 = 0;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Z")
    private boolean field6431 = false;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field6433 = 0;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lsc;")
    public static class250 field6428 = new class250();

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field6443 = 0;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lo;")
    public static class332 field6440 = new class332("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field6425;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field6429;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public int field6435;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public int field6442;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "J")
    public long field6424;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 11)
    public static final void method2696(int arg0, String arg1) {
        field6441++;
        int var2 = -59 / ((82 - arg0) / 43);
        class462.method2719("", 0, 0, (byte) -78, "", arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 21)
    public static final void method2697(byte arg0) {
        if (class2.field39 != null) {
            class2.field39.method507((byte) -60);
            class302.field4499 = null;
            class2.field39 = null;
        }
        field6422++;
        int var1 = -124 % ((arg0 - 77) / 48);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILre;)V", line = 43)
    public final void method2698(int arg0, class446 arg1) {
        while (true) {
            int var3 = arg1.method2628(arg0 + 49146);
            if (var3 == 0) {
                field6439++;
                if (arg0 != 6) {
                    method2696(-116, (String) null);
                    return;
                }
                return;
            }
            this.method2700(var3, (byte) 109, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lui;Ldi;Lui;Lui;I)Z", line = 69)
    public static final boolean method2699(class451 arg0, class166 arg1, class451 arg2, class451 arg3, int arg4) {
        class50.field727 = arg2;
        class14.field208 = arg0;
        class245.field3510 = arg1;
        if (arg4 != 0) {
            field6443 = 40;
        }
        field6436++;
        class204.field3102 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLre;)V", line = 92)
    private final void method2700(int arg0, byte arg1, class446 arg2) {
        if (arg0 == 1) {
            this.field6434 = arg2.method2631(2530);
        } else if (arg0 == 2) {
            arg2.method2628(49152);
        } else if (arg0 == 3) {
            this.field6430 = arg2.method2604(-120);
            this.field6429 = arg2.method2604(50);
            this.field6438 = arg2.method2604(-111);
        } else if (arg0 == 4) {
            this.field6435 = arg2.method2628(49152);
            this.field6437 = arg2.method2604(-118);
        } else if (arg0 == 6) {
            this.field6425 = arg2.method2628(49152);
        } else if (arg0 == 8) {
            this.field6421 = 1;
        } else if (arg0 == 9) {
            this.field6433 = 1;
        } else if (arg0 == 10) {
            this.field6431 = true;
        }
        if (arg1 <= 61) {
            this.field6438 = -89;
        }
        field6432++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 150)
    public final void method2701(int arg0) {
        int var2 = -94 % ((-arg0 - 48) / 40);
        field6426++;
        this.field6442 = class172.field2456[this.field6434 << 3];
        this.field6423 = (int) Math.sqrt((double) (this.field6430 * this.field6430 - (-(this.field6429 * this.field6429) - this.field6438 * this.field6438)));
        if (this.field6437 == 0) {
            this.field6437 = 1;
        }
        if (this.field6435 == 0) {
            this.field6424 = 2147483647L;
        } else if (this.field6435 == 1) {
            this.field6424 = (long) (this.field6423 * 8 / this.field6437);
            this.field6424 *= this.field6424;
        } else if (this.field6435 == 2) {
            this.field6424 = (long) (this.field6423 * 8 / this.field6437);
        }
        if (this.field6431) {
            this.field6423 *= -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 192)
    public static void method2702(byte arg0) {
        field6440 = null;
        field6428 = null;
        if (arg0 >= -40) {
            field6428 = null;
        }
    }
}
