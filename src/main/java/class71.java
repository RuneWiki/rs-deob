import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class class71 extends class403 {

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "Z")
    public volatile boolean field973 = true;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    public static int field970 = -1;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "[I")
    public static int[] field978 = new int[2048];

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "[I")
    public static int[] field972 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
    public boolean field974;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(Z)V", line = 5)
    public static final void method460(boolean arg0) {
        field971++;
        if (arg0) {
            field970 = -42;
        }
        class323.field4310.method1519(-16576);
        class30.field399.method1519(-16576);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(B)V", line = 21)
    public static void method461(byte arg0) {
        field978 = null;
        field972 = null;
        if (arg0 != 74) {
            field972 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I", line = 34)
    public static int method462(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIBII)Z", line = 41)
    public static final boolean method463(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field977++;
        for (int var6 = arg5; var6 <= arg4; var6++) {
            for (int var7 = arg1; var7 <= arg2; var7++) {
                if (class405.field5568[var6][var7] == arg0 && class65.field868[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg3 <= 52) {
            method460(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)[B")
    public abstract byte[] method447(byte arg0);

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
    public abstract int method448(int arg0);
}
