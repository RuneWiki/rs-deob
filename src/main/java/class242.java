import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class242 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4155 = 0;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Ljd;")
    public static class85 field4156 = class221.method1499("", (byte) -96);

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lge;")
    public static class68 field4153;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[[[B")
    public static byte[][][] field4154;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Ljg;")
    public static final class163 method1640(int arg0, int arg1) {
        class163 var2 = (class163) class12.field188.method1472((long) arg0, -27162);
        field4162++;
        int var3 = 9 / ((70 - arg1) / 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = class92.field1696.method464(-1, 1, arg0);
        } else {
            var4 = class162.field2790.method464(-1, 1, arg0 & 0x7FFF);
        }
        class163 var5 = new class163();
        if (var4 != null) {
            var5.method1077(-1, new class247(var4));
        }
        if (arg0 >= 32768) {
            var5.method1072(false);
        }
        class12.field188.method1468(0, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1641(int arg0) {
        field4156 = null;
        field4153 = null;
        field4154 = null;
        if (arg0 <= 0) {
            field4158 = -93;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILge;Lge;Lge;Lm;)Z")
    public static final boolean method1642(int arg0, class68 arg1, class68 arg2, class68 arg3, class113 arg4) {
        class260.field4597 = arg2;
        field4157++;
        if (arg0 <= 91) {
            return true;
        } else {
            class154.field2667 = arg3;
            class235.field4066 = arg1;
            class201.field3511 = arg4;
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)I")
    public static final int method1643(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1 != -767686425) {
            field4156 = null;
        }
        field4159++;
        return (arg3 >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
    }
}
