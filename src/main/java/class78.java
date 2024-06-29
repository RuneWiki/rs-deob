import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 extends class207 {

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[B")
    public byte[] field1533;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Ljd;")
    private static class86 field1532 = class122.method868("Hidden", true);

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Ljd;")
    public static class86 field1537 = field1532;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Ljd;")
    private static class86 field1535 = class122.method868("Allocating memory", true);

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljd;")
    public static class86 field1530 = field1535;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[I")
    public static int[] field1539;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[[[I")
    public static int[][][] field1536;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static final void method551(int arg0) {
        class4.field60.method703((byte) 122);
        field1534++;
        if (arg0 != 252645135) {
            method551(-35);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBIZZ)V")
    public static final void method552(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        int var5 = -9 / ((-arg1 - 34) / 57);
        class87.method637(arg0, -1, 0, arg2, arg4, class209.field3783.length - 1, arg3);
        field1540++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method553(int arg0, int arg1) {
        int var2 = -122 % ((25 - arg1) / 37);
        field1542++;
        int var3 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var4 = (var3 >>> 2 & 0x33333333) + (var3 & 0x33333333);
        int var5 = var4 + (var4 >>> 4) & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method554(boolean arg0) {
        field1532 = null;
        field1535 = null;
        field1539 = null;
        if (!arg0) {
            field1537 = null;
        }
        field1536 = null;
        field1537 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
    public class78(byte[] arg0) {
        this.field1533 = arg0;
    }
}
