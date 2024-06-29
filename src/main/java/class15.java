import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class15 extends class66 {

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field304 = 3;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[Ldl;")
    public static class123[] field300 = new class123[2048];

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Lpf;")
    public static class17 field305 = new class17(64);

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "[I")
    public static int[] field311 = new int[4096];

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "[I")
    public static int[] field312 = new int[50];

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "Laj;")
    public static class151 field306;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lbi;")
    public class27 field307;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "[B")
    public byte[] field310;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "(I)I")
    public final int method82(int arg0) {
        ++field301;
        if (super.field1114) {
            return 0;
        } else {
            if (arg0 != 12027) {
                method86(-0.08275998854215488D, true);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "(I)[B")
    public final byte[] method83(int arg0) {
        ++field309;
        if (super.field1114) {
            throw new RuntimeException();
        } else {
            if (arg0 != 255) {
                field300 = null;
            }
            return this.field310;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)I")
    public static int method84(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static void method85(byte arg0) {
        field305 = null;
        if (arg0 != -30) {
            field305 = null;
        }
        field312 = null;
        field306 = null;
        field311 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(DZ)V")
    public static final void method86(double arg0, boolean arg1) {
        if (!arg1) {
            method85((byte) 14);
        }
        if (class100.field1594 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class121.field2030[var3] = ~var4 < -256 ? 255 : var4;
            }
            class100.field1594 = arg0;
        }
        ++field302;
    }
}
