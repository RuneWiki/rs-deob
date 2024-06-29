import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class254 {

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Z")
    public boolean field4364 = true;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    public static int[] field4358 = new int[32];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field4359 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4368 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIZZI)Lfa;")
    public static final class239 method1717(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field4367++;
        class128 var5 = null;
        if (class226.field3870 != null) {
            var5 = new class128(arg4, class226.field3870, class181.field3179[arg4], 1000000);
        }
        class206.field3514[arg4] = class195.field3392.method71((byte) -101, arg4, class264.field4506, var5);
        if (arg1 != 2) {
            field4359 = null;
        }
        if (arg2) {
            class206.field3514[arg4].method144((byte) 80);
        }
        return new class239(class206.field3514[arg4], arg3, arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lcb;")
    public static final class232 method1718(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class232 var4 = var3.field753;
            var3.field753 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1719(byte arg0) {
        field4359 = null;
        field4358 = null;
        if (arg0 != 84) {
            field4358 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILfa;)[Lcj;")
    public static final class115[] method1720(int arg0, int arg1, int arg2, class239 arg3) {
        field4362++;
        int var4 = -111 % ((arg1 - 3) / 34);
        return class123.method883(arg2, arg0, -1, arg3) ? class160.method1126(3) : null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4366 = arg1;
        this.field4365 = arg4;
        this.field4369 = arg5;
        this.field4370 = arg0;
        this.field4360 = arg2;
        this.field4364 = arg6;
        this.field4361 = arg3;
    }
}
