import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class class148 {

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
    public static int[] field1899 = new int[32];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
    public static int[] field1898;

    static {
        new class460("", 76);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(JB)I", line = 5)
    public final int method1022(long arg0, byte arg1) {
        if (arg1 != 44) {
            return 24;
        }
        field1897++;
        long var4 = this.method1025((byte) -95);
        if (var4 > 0L) {
            class117.method820(false, var4);
        }
        return this.method1021(arg0, (byte) -14);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 22)
    public static void method1023(int arg0) {
        field1899 = null;
        if (arg0 != -3160) {
            field1899 = null;
        }
        field1898 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method1024(int arg0, int arg1, int arg2) {
        if (arg0 > -60) {
            method1023(-93);
        }
        field1896++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZLjava/lang/String;I)V", line = 47)
    public static final void method1027(boolean arg0, boolean arg1, String arg2, int arg3) {
        class452.method2720(arg1);
        field1895++;
        class555.method3229(1768712033);
        class725.method4079(-1);
        class147.method1015(arg3, -2, arg0, arg2);
        class538.method3105(-853219866);
        class89.method629(class638.field8979, (byte) -109);
        class361.method2263(-91, class638.field8979);
        class347.method2198(class638.field8979, class491.field6972, 0);
        class228.method1578(-7);
        class384.method2351(0, class541.field7591);
        class149.method1028(-19376);
        class292.method1978(arg1);
        if (class757.field10456 == 3) {
            class374.method2323(4, (byte) -51);
        } else if (class757.field10456 == 7) {
            class374.method2323(8, (byte) 23);
        } else if (class757.field10456 == 10) {
            class374.method2323(11, (byte) -20);
        } else if (class757.field10456 == 1 || class757.field10456 == 2) {
            class315.method2072(8);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public abstract void method1020(byte arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(JB)I")
    public abstract int method1021(long arg0, byte arg1);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)J")
    public abstract long method1025(byte arg0);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)J")
    public abstract long method1026(int arg0);
}
