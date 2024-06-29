import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lsg;")
    public static class30 field169 = class167.method1221((byte) 33, "mapscene");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Llk;")
    public static class232 field168 = new class232(50);

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[I")
    public static int[] field170 = new int[100];

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lsg;")
    public static class30 field171 = class167.method1221((byte) 33, "Wordpack geladen)3");

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lsg;")
    public static class30 field174 = class167.method1221((byte) 33, "Ablegen");

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lsg;")
    public static class30 field173 = class167.method1221((byte) 33, "blinken3:");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lmc;")
    public static class151 field167;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lbj;")
    public static class44[] field172;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method102(int arg0, int arg1) {
        field164++;
        return arg1 == 1645251272 ? arg0 >>> 8 : 55;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public static final void method103(int arg0, int arg1) {
        field163++;
        class68 var2 = class103.method830(arg1, 4, arg0);
        var2.method610(2141640544);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field171 = null;
        if (arg0 != -80) {
            return;
        }
        field170 = null;
        field168 = null;
        field173 = null;
        field172 = null;
        field167 = null;
        field169 = null;
        field174 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lmc;II)Lpj;")
    public static final class152 method105(class151 arg0, int arg1, int arg2) {
        if (arg1 > -106) {
            return null;
        } else {
            field165++;
            return class41.method433(arg2, 0, arg0) ? class122.method929(0) : null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBI)V")
    public static final void method106(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 6) {
            return;
        }
        class194.method1405(true, class121.field2390[arg0], arg1 + arg4, arg1 - arg4, arg2);
        field166++;
        int var5 = arg4;
        int var6 = -1;
        int var7 = 0;
        int var8 = -arg4;
        while (var5 > var7) {
            var6 += 2;
            var8 += var6;
            var7++;
            if (var8 >= 0) {
                var5--;
                var8 -= var5 << 1;
                int[] var9 = class121.field2390[arg0 - var5];
                int var10 = arg1 + var7;
                int var11 = arg1 - var7;
                int[] var12 = class121.field2390[arg0 + var5];
                class194.method1405(true, var12, var10, var11, arg2);
                class194.method1405(true, var9, var10, var11, arg2);
            }
            int var13 = arg1 + var5;
            int var14 = arg1 - var5;
            int[] var15 = class121.field2390[arg0 + var7];
            int[] var16 = class121.field2390[arg0 - var7];
            class194.method1405(true, var15, var13, var14, arg2);
            class194.method1405(true, var16, var13, var14, arg2);
        }
    }
}
