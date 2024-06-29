import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class279 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Lgda;")
    public static class53 field3939 = new class53(49, -1);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "Lmf;")
    public static class418 field3943;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1826(int arg0, int arg1, int arg2) {
        int var3 = 23 % ((arg2 - 65) / 50);
        field3940++;
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V", line = 16)
    public static void method1827(byte arg0) {
        field3943 = null;
        int var1 = 117 % ((arg0 + 3) / 45);
        field3939 = null;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)Lrq;", line = 32)
    public static final class350 method1828(int arg0, int arg1) {
        field3938++;
        class350[] var2 = class74.method603(12686);
        int var3 = 0;
        if (arg0 != 26496) {
            field3939 = null;
        }
        while (var3 < var2.length) {
            class350 var4 = var2[var3];
            if (var4.field4950 == arg1) {
                return var4;
            }
            var3++;
        }
        return null;
    }
}
