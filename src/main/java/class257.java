import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class257 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field3128 = 1;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Lwp;")
    public static class453 field3132 = new class453(31, 6);

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "J")
    public static volatile long field3133 = 0L;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lbaa;")
    public static class593 field3134 = new class593(4, 1, 1, 1);

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method1251(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1250(byte arg0);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I")
    public static final int method1497(byte arg0, int arg1) {
        field3131++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg0 == 114) {
            int var7 = var6 | var6 >>> 16;
            return arg1 & ~var7;
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1498(byte[] arg0, int arg1) {
        field3129++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class293.method1645(arg0, 0, var3, 0, var2);
        if (arg1 != -25553) {
            method1498(null, 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        field3134 = null;
        field3132 = null;
        if (arg0 <= 76) {
            method1497((byte) 22, -103);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([BZ)V")
    public abstract void method1249(byte[] arg0, boolean arg1);
}
