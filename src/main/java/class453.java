import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class453 {

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Lmia;")
    public static class63 field6685 = new class63(56, 4);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lvd;")
    public static class39 field6687;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public static void method2773(byte arg0) {
        field6687 = null;
        int var1 = -96 / ((arg0 - 38) / 57);
        field6685 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)J")
    public abstract long method1(int arg0);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
    public static final void method2774(int arg0, int arg1) {
        field6683++;
        if (class245.method1632(816183856, arg0) && arg1 == 1024) {
            class193.method1344(class86.field1229[arg0], -1, false);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V")
    public abstract void method3(byte arg0);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(JB)I")
    public final int method2775(long arg0, byte arg1) {
        field6684++;
        long var4 = this.method1(0);
        if (arg1 < 72) {
            this.method5(121);
        }
        if (var4 > 0L) {
            class277.method1759(var4, 60);
        }
        return this.method4(arg0, false);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
    public static final void method2776(long[] arg0, byte arg1, Object[] arg2) {
        field6686++;
        class654.method3786(arg0, arg2, (byte) 7, 0, arg0.length - 1);
        int var3 = 118 / ((-arg1 - 7) / 55);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Z")
    public static final boolean method2777(int arg0, int arg1, int arg2) {
        int var3 = -1 / ((arg1 - 49) / 62);
        field6682++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)J")
    public abstract long method5(int arg0);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(JZ)I")
    public abstract int method4(long arg0, boolean arg1);
}
