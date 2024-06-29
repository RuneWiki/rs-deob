import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class519 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Z")
    public boolean field7305;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lmq;")
    public static class78 field7304 = new class78(29, 3);

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[[Z")
    public static boolean[][] field7310 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lu;")
    public class60 field7300;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lu;")
    public class60 field7302;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Z")
    public boolean field7306;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 5)
    public static void method2978(byte arg0) {
        field7310 = null;
        int var1 = -37 % ((-arg0 - 31) / 32);
        field7304 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 17)
    public static final void method2979(byte arg0) {
        if (arg0 < -68) {
            field7308++;
            class540.method3074(true, -1, 255);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 28)
    public final void method2980(int arg0) {
        field7307++;
        if (this.field7302 != null) {
            this.field7302.method474(arg0 ^ 0x755A);
        }
        this.field7306 = false;
        if (arg0 != -29992) {
            this.field7300 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method2981(int arg0) {
        if (arg0 != -4340) {
            field7310 = null;
        }
        field7309++;
        return this.field7306 && !this.field7305;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Z)V", line = 60)
    public class519(boolean arg0) {
        this.field7305 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ldv;I)I", line = 71)
    public static final int method2982(class124 arg0, int arg1) {
        field7303++;
        class155 var2 = arg0.field1486;
        if (var2.field1929 != null) {
            var2 = var2.method968((byte) -76, class461.field6637);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1926;
        class459 var4 = arg0.method249(-114);
        if (arg0.field332 == arg1 || arg0.field313) {
            var3 = var2.field1952;
        } else if (arg0.field332 == var4.field6425 || arg0.field332 == var4.field6459 || arg0.field332 == var4.field6418 || arg0.field332 == var4.field6430) {
            var3 = var2.field1911;
        } else if (arg0.field332 == var4.field6447 || arg0.field332 == var4.field6463 || arg0.field332 == var4.field6450 || arg0.field332 == var4.field6415) {
            var3 = var2.field1969;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 106)
    public static final void method2983(boolean arg0) {
        if (!arg0) {
            method2978((byte) 78);
        }
        field7301++;
        class581.field8076 = (int) ((double) class613.field8591 * 34.46D);
        class459.field6427 = 200;
        class581.field8076 <<= 0x2;
        if (class458.field6407.method91()) {
            class581.field8076 += 512;
        }
        class702.method3896(-111, false);
    }
}
