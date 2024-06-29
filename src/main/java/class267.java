import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class267 extends class675 {

    @OriginalMember(owner = "client!rn", name = "Ib", descriptor = "[I")
    public static int[] field3815 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rn", name = "Hb", descriptor = "Las;")
    public static class151 field3814 = new class151(13, 0, 1, 0);

    @OriginalMember(owner = "client!rn", name = "Kb", descriptor = "[I")
    public static int[] field3817 = new int[2];

    @OriginalMember(owner = "client!rn", name = "Db", descriptor = "F")
    public static float field3810;

    @OriginalMember(owner = "client!rn", name = "Eb", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!rn", name = "Fb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!rn", name = "Gb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!rn", name = "Jb", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IF)V")
    public final void method1741(int arg0, float arg1) {
        ++field3812;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9154[super.field9146++] = (byte) var3;
        if (arg0 != -1526311408) {
            method1744(124);
        }
        super.field9154[super.field9146++] = (byte) (var3 >> 8);
        super.field9154[super.field9146++] = (byte) (var3 >> 16);
        super.field9154[super.field9146++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FI)V")
    public final void method1742(float arg0, int arg1) {
        if (arg1 != -32197) {
            this.method1742(0.7704895F, 69);
        }
        ++field3816;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field9154[super.field9146++] = (byte) (var3 >> 24);
        super.field9154[super.field9146++] = (byte) (var3 >> 16);
        super.field9154[super.field9146++] = (byte) (var3 >> 8);
        super.field9154[super.field9146++] = (byte) var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFB)I")
    public static final int method1743(float arg0, float arg1, float arg2, byte arg3) {
        if (arg3 < 51) {
            field3817 = null;
        }
        ++field3811;
        float var4 = !(arg1 < 0.0F) ? arg1 : -arg1;
        float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else {
            return !(arg1 > 0.0F) ? 5 : 4;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V")
    public class267(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field3815 = null;
        field3817 = null;
        field3814 = null;
        if (arg0 != 1) {
            field3814 = null;
        }
    }
}
