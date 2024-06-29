import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class475 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "B")
    public byte field6868;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "S")
    public short field6877;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "B")
    public byte field6874;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lnn;")
    public class171 field6875;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public static int[] field6873 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[[Z")
    public static boolean[][] field6876 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field6878 = 205;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field6871 = 0;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lwg;")
    public static class41 field6872;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[Lov;")
    public static class279[] field6869;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
    public static final void method2788(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6870++;
        class314 var5 = class177.method1213(false, 8, arg0);
        var5.method1808(arg3 ^ 0xFFF81CF3);
        var5.field4253 = arg2;
        var5.field4246 = arg4;
        var5.field4259 = arg1;
        if (arg3 != 524287) {
            method2789(-66);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method2789(int arg0) {
        field6876 = null;
        if (arg0 < 86) {
            field6871 = -45;
        }
        field6873 = null;
        field6872 = null;
        field6869 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lnn;III)V")
    public class475(class171 arg0, int arg1, int arg2, int arg3) {
        this.field6868 = (byte) arg3;
        this.field6877 = (short) arg1;
        this.field6874 = (byte) arg2;
        this.field6875 = arg0;
    }
}
