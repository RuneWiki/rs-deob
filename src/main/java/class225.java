import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 extends class359 {

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field3076 = -1;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lis;")
    public static class291 field3064;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lbm;")
    public static class60 field3070;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[I")
    public int[] field3067;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[I")
    public int[] field3074;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
    public int[] field3078;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[Lkh;")
    public static class11[] field3075;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "[Lep;")
    public class241[] field3066;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[Lep;")
    public class241[] field3069;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[[[B")
    public byte[][][] field3079;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
    public static final void method1455(int arg0, int arg1, byte arg2) {
        if (arg2 != -23) {
            return;
        }
        class283.field3972[arg0] = arg1;
        field3065++;
        class338 var3 = (class338) class443.field6474.method1204((byte) -77, (long) arg0);
        if (var3 == null) {
            class338 var4 = new class338(class203.method1299((byte) 5) + 500L);
            class443.field6474.method1202(arg2 ^ 0x16, (long) arg0, var4);
        } else {
            var3.field5003 = class203.method1299((byte) 5) + 500L;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method1456(int arg0) {
        field3075 = null;
        field3070 = null;
        if (arg0 == -17830) {
            field3064 = null;
        }
    }
}
