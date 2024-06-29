import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Ldf;")
    private static class51 field109 = class46.method233("World", 100);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Ldf;")
    public static class51 field110 = field109;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[Z")
    public static boolean[] field107;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[[Lwc;")
    public static class213[][] field106;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method49(boolean arg0) {
        field106 = null;
        if (arg0) {
            method52(-56, -52, -124, (class213) null, (byte) -125);
        }
        field110 = null;
        field107 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field105++;
        int var6 = arg2 - arg5;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class189.method1356(arg5, arg3, false, arg1, arg4);
            }
        } else if (var7 == 0) {
            class9.method48(arg1, arg3, arg2, 76, arg5);
        } else if (arg0 == -4208) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class28.field408 > arg2) {
                var11 = class28.field408;
                var10 = (class28.field408 * var8 >> 12) + var9;
            } else if (arg2 > class115.field1954) {
                var10 = (class115.field1954 * var8 >> 12) + var9;
                var11 = class115.field1954;
            } else {
                var11 = arg2;
                var10 = arg4;
            }
            if (class36.field542 > var10) {
                var11 = (class36.field542 - var9 << 12) / var8;
                var10 = class36.field542;
            } else if (class175.field2867 < var10) {
                var11 = (class175.field2867 - var9 << 12) / var8;
                var10 = class175.field2867;
            }
            int var12;
            int var13;
            if (class28.field408 > arg5) {
                var12 = (class28.field408 * var8 >> 12) + var9;
                var13 = class28.field408;
            } else if (arg5 > class115.field1954) {
                var13 = class115.field1954;
                var12 = (class115.field1954 * var8 >> 12) + var9;
            } else {
                var12 = arg1;
                var13 = arg5;
            }
            if (class36.field542 > var12) {
                var13 = (class36.field542 - var9 << 12) / var8;
                var12 = class36.field542;
            } else if (var12 > class175.field2867) {
                var12 = class175.field2867;
                var13 = (class175.field2867 - var9 << 12) / var8;
            }
            class175.method1232(var12, arg0 + 4090, var13, arg3, var11, var10);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public static final void method51(int arg0, int arg1) {
        class97.field1600.method1348(0, arg1);
        field108++;
        class204.field3403.method1348(0, arg1);
        int var2 = 87 % ((arg0 - 13) / 56);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILwc;B)V")
    public static final void method52(int arg0, int arg1, int arg2, class213 arg3, byte arg4) {
        int var5 = 104 / ((arg4 - 15) / 45);
        if (class170.field2780 >= 3) {
            class59.method379(arg0, arg1, 0, arg3.field3661, arg3.field3637);
        } else {
            ((class254) class119.field1984).method1099(arg0, arg1, arg3.field3603, arg3.field3608, class119.field1984.field2806 / 2, class119.field1984.field2800 / 2, class120.field1993, 256, arg3.field3661, arg3.field3637);
        }
        field112++;
        class42.field681[arg2] = true;
    }
}
