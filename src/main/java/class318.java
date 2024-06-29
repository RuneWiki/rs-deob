import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class318 {

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "Z")
    public static boolean field4689 = false;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "[[I")
    public static int[][] field4688 = new int[6][];

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Lsc;")
    public static class320 field4687;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
    public static final boolean method2048(int arg0, int arg1, int arg2) {
        field4683++;
        if (arg2 != 0) {
            field4688 = null;
        }
        return (arg0 & 0x70000) != 0 | class32.method512((byte) -68, arg1, arg0) || class102.method954(arg1, arg2 ^ 0x1C9D, arg0);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lqh;I)Lwn;")
    public static final class673 method2049(class61 arg0, int arg1) {
        field4684++;
        int var2 = arg0.method723((byte) -25);
        class320 var3 = class653.method3723(false)[arg0.method732(arg1 ^ 0xDEA66E53)];
        class547 var4 = class641.method3657((byte) -128)[arg0.method732(arg1 ^ 0xDEA66E53)];
        if (arg1 != 20107) {
            field4687 = null;
        }
        int var5 = arg0.method721(-461515024);
        int var6 = arg0.method721(-461515024);
        return new class673(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(III)V")
    public static final void method2050(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class104.method965(var3.field5501);
        class104.method965(var3.field5503);
        if (var3.field5501 != null) {
            var3.field5501 = null;
        }
        if (var3.field5503 != null) {
            var3.field5503 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
    public static void method2051(byte arg0) {
        if (arg0 == -45) {
            field4687 = null;
            field4688 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2052(int arg0, boolean arg1) {
        if (arg1) {
            field4690++;
            return arg0 == 3 || arg0 == 7 || arg0 == 10;
        } else {
            return false;
        }
    }
}
