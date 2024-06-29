import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class263 extends class355 {

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "J")
    public static long field3957 = 0L;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field3956 = 0;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "[I")
    public static int[] field3962 = new int[32];

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3961 = "Loading wordpack - ";

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "[Lbq;")
    public static class51[] field3966;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "Luf;")
    public class281 field3955;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "[B")
    public byte[] field3958;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    public static void method1882(byte arg0) {
        field3962 = null;
        field3961 = null;
        if (arg0 != -109) {
            method1882((byte) 32);
        }
        field3966 = null;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)[B")
    public final byte[] method1883(int arg0) {
        ++field3964;
        if (super.field5053) {
            throw new RuntimeException();
        } else {
            int var2 = 88 / ((arg0 - -53) / 43);
            return this.field3958;
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)I")
    public final int method1884(int arg0) {
        ++field3965;
        if (super.field5053) {
            return 0;
        } else {
            return arg0 > -93 ? -82 : 100;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field3962[var1] = var0 + -1;
            var0 += var0;
        }
        field3966 = new class51[14];
    }
}
