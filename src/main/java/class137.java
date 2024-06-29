import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class137 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[B")
    public byte[] field2349;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[Lwa;")
    public class75[] field2350;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[S")
    public short[] field2352;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public int[] field2340;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[S")
    public short[] field2341;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lwa;")
    public static class75 field2343 = class66.method560("blinken2:", false);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lwa;")
    public static class75 field2345 = class66.method560(")4g", false);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[I")
    public static int[] field2347;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)I", line = 7)
    public final int method1049(int arg0, byte arg1) {
        if (arg1 == 103) {
            field2348++;
            return this.field2349[arg0] & 0x3;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 35)
    public static void method1050(byte arg0) {
        field2345 = null;
        field2347 = null;
        field2343 = null;
        if (arg0 != 74) {
            method1050((byte) 30);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z", line = 52)
    public final boolean method1051(boolean arg0, int arg1) {
        if (!arg0) {
            field2347 = (int[]) null;
        }
        field2346++;
        return (this.field2349[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 67)
    public class137(int arg0) {
        this.field2344 = arg0;
        this.field2349 = new byte[this.field2344];
        this.field2350 = new class75[this.field2344];
        this.field2352 = new short[this.field2344];
        this.field2340 = new int[this.field2344];
        this.field2341 = new short[this.field2344];
    }
}
