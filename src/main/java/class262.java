import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class262 extends class127 implements class60 {

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Z")
    public static boolean field3329 = false;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lvv;")
    public static class442 field3332 = new class442();

    @OriginalMember(owner = "client!te", name = "E", descriptor = "B")
    private byte field3328;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V", line = 3)
    public static final void method1583(byte arg0) {
        if (arg0 >= 99) {
            ++field3333;
            if (class458.field6407 != null) {
                if (class107.field1323) {
                    class314.method1833(100);
                }
                class469.field6740.method3381(2);
                class569.method3202();
                class289.method1730((byte) -108);
                class154.method959(-125);
                class49.method398(2);
                class515.method2955(29055);
                if (class219.field2786 != null) {
                    class219.field2786.method2481(true);
                }
                class592.method3283(true);
                class326.method1932(0);
                class184.method1173(30);
                class706.method3910(117);
                class676.method3638(-1, false);
                for (int var1 = 0; ~var1 > -2049; ++var1) {
                    class546 var5 = class447.field6287[var1];
                    if (var5 != null) {
                        for (int var6 = 0; ~var6 > ~var5.field429.length; ++var6) {
                            var5.field429[var6] = null;
                        }
                    }
                }
                for (int var2 = 0; var2 < class676.field9195; ++var2) {
                    class124 var3 = class38.field559[var2].field3158;
                    if (var3 != null) {
                        for (int var4 = 0; var3.field429.length > var4; ++var4) {
                            var3.field429[var4] = null;
                        }
                    }
                }
                class261.field3318 = null;
                class290.field3732 = null;
                class458.field6407.method2658(-120);
                class458.field6407 = null;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I", line = 89)
    public final int method1584(int arg0) {
        ++field3326;
        if (arg0 != -2407) {
            method1585(-70);
        }
        return this.field3328;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Z", line = 109)
    public final boolean method475(byte arg0) {
        ++field3334;
        int var2 = 107 % ((3 - arg0) / 53);
        return super.method820(6667, super.field1525.field2899);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 120)
    public final int method819(byte arg0) {
        if (arg0 > -108) {
            this.method819((byte) -121);
        }
        ++field3330;
        return super.method819((byte) -122);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V", line = 133)
    public static void method1585(int arg0) {
        field3332 = null;
        if (arg0 >= -95) {
            field3329 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 143)
    public final void method474(int arg0) {
        ++field3331;
        if (arg0 <= -74) {
            super.method474(-88);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z", line = 154)
    public final boolean method472(int arg0, int arg1, int arg2) {
        ++field3322;
        if (arg2 != -2898) {
            this.method819((byte) 51);
        }
        this.field3328 = (byte) arg0;
        super.method818(arg1, (byte) -13);
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 169)
    public final boolean method473(int arg0, int arg1, int arg2, Source arg3) {
        if (arg0 != 8660) {
            this.method471((byte) -114, false);
        }
        ++field3327;
        this.field3328 = (byte) arg2;
        super.method816(35040, arg1, arg3);
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 187)
    public final Buffer method471(byte arg0, boolean arg1) {
        ++field3325;
        return arg0 != 28 ? null : super.method822(arg1, super.field1525.field2899, (byte) -27);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lck;Z)V", line = 204)
    public class262(class221 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([SI)[S", line = 207)
    public static final short[] method1586(short[] arg0, int arg1) {
        ++field3324;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class617.method3385(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }
}
