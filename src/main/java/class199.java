import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class199 extends class266 {

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "[I")
    public static int[] field2391 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
    public static int field2390 = 1401;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "Lrg;")
    public static class548 field2393 = new class548(67, 0);

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "Z")
    public static boolean field2396 = false;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "Lha;")
    public static class52 field2399;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "[B")
    private byte[] field2392;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1073(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2391 = null;
        }
        field2395++;
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
    public static void method1074(byte arg0) {
        field2391 = null;
        field2399 = null;
        if (arg0 < 7) {
            field2396 = false;
        }
        field2393 = null;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
    public class199() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "(B)V")
    public static final void method1075(byte arg0) {
        field2398++;
        class512.field7236.method1165(((float) class565.field8299.field2201 * 0.1F + 0.7F) * 1.1523438F);
        class512.field7236.method1188(class175.field2134, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class512.field7236.method1120(class171.field2082, -1, 256);
        class512.field7236.method1189(class450.field6234);
        if (arg0 > -43) {
            method1075((byte) 101);
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1076(int arg0, int arg1, int arg2, int arg3) {
        this.field2392 = new byte[arg1 * arg3 * arg2 * 2];
        if (arg0 != 0) {
            field2397 = 97;
        }
        field2389++;
        this.method1777(arg0 ^ 0xFFFFFF95, arg2, arg1, arg3);
        return this.field2392;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BBI)V")
    public final void method1077(byte arg0, byte arg1, int arg2) {
        field2394++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        if (arg1 < 118) {
            return;
        }
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field2392[var10001] = var4;
        this.field2392[var6] = var4;
    }
}
