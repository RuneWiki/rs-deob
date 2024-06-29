import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class35 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Llv;")
    public static class313 field515;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Ljava/lang/String;")
    public String field520;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
    public static int[] field514;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[[[Lsn;")
    public static class452[][][] field516;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method308(byte arg0) {
        field514 = null;
        field515 = null;
        int var1 = 76 / ((arg0 + 49) / 43);
        field516 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static final void method309(int arg0) {
        if (arg0 == -14574) {
            field517++;
            class283.field4160.method2135(0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILnq;III)Lld;")
    public static final class116 method310(int arg0, int arg1, class325 arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 34037) {
            field515 = null;
        }
        field513++;
        if (!arg2.field4999 && (!class152.method994(arg0, false) || !class152.method994(arg5, false))) {
            return arg2.field5027 ? new class116(arg2, 34037, arg4, arg1, arg0, arg5, true) : new class116(arg2, arg4, arg1, arg0, arg5, class475.method2835(arg0, -1), class475.method2835(arg5, arg3 ^ 0xFFFF7B0A), true);
        } else {
            return new class116(arg2, 3553, arg4, arg1, arg0, arg5, true);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILuu;Luu;Luu;Luu;)V")
    public static final void method311(int arg0, class191 arg1, class191 arg2, class191 arg3, class191 arg4) {
        class278.field3956 = arg2;
        class164.field2217 = arg3;
        class25.field359 = arg4;
        field521++;
        if (arg0 >= 78) {
            class159.field2063 = arg1;
            class263.field3690 = new class282[class25.field359.method1294(-1)][];
            class24.field351 = new boolean[class25.field359.method1294(-1)];
        }
    }
}
