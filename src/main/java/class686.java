import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class686 {

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field9558 = 0;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
    public static long field9560 = 0L;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "F")
    public static float field9557;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public int field9563;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public int field9565;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "[I")
    public static int[] field9562;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "[Ljd;")
    public class233[] field9559;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I", line = 3)
    public static final int method3854(int arg0, int arg1) {
        if (arg1 != 0) {
            field9557 = -1.1703359F;
        }
        field9564++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V", line = 39)
    public static void method3855(byte arg0) {
        if (arg0 >= 31) {
            field9562 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lsl;Lhm;I)Ljd;", line = 59)
    private final class233 method3856(class461 arg0, class223 arg1, int arg2) {
        field9561++;
        if (class160.field2194 == arg1) {
            return class25.method172(arg0, -982);
        } else if (class386.field4927 == arg1) {
            return class662.method3730(-1437, arg0);
        } else if (class33.field549 == arg1) {
            return class707.method3959((byte) -127, arg0);
        } else if (class479.field6521 == arg1) {
            return class28.method190(true, arg0);
        } else if (class99.field1381 == arg1) {
            return class424.method2363(arg0, (byte) 61);
        } else if (arg2 <= 10) {
            return null;
        } else if (class89.field1240 == arg1) {
            return class137.method1006(arg0, true);
        } else if (class218.field2939 == arg1) {
            return class103.method820(arg0, 512);
        } else if (class521.field7308 == arg1) {
            return class449.method2530(109, arg0);
        } else if (class721.field10033 == arg1) {
            return class585.method3326(arg0, false);
        } else if (class231.field3032 == arg1) {
            return class508.method2962(16865, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILsl;)V", line = 114)
    public final void method3857(int arg0, class461 arg1) {
        this.field9565 = arg1.method2576((byte) 46);
        field9556++;
        this.field9563 = arg1.method2566(-2);
        this.field9559 = new class233[arg1.method2600((byte) -124)];
        class223[] var3 = class587.method3334((byte) -113);
        for (int var4 = 0; var4 < this.field9559.length; var4++) {
            this.field9559[var4] = this.method3856(arg1, var3[arg1.method2600((byte) -124)], 82);
        }
        if (arg0 != 1) {
            this.method3857(-7, null);
        }
    }
}
