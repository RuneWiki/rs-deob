import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class214 extends class313 {

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "[[I")
    public static int[][] field3592 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3595 = " is already on your friend list.";

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "F")
    public static float field3598;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "Lcg;")
    public static class49 field3593;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "[[[Lc;")
    public static class331[][][] field3591;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 3)
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method111(int arg0, int arg1) {
        field3597++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            method1582((String) null, 111, 36);
        }
        if (this.field4961.field3451) {
            class345.method2422(var3, 0, class133.field2269, class1.field6[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 35)
    public static final void method1582(String arg0, int arg1, int arg2) {
        class341.field5443.method26(74, 7);
        class341.field5443.method2327(class142.method1151(arg0, arg2 + 23732), -50);
        field3600++;
        if (arg2 != -23847) {
            field3593 = (class49) null;
        }
        class32.field461++;
        class341.field5443.method2343(arg1, true);
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)V", line = 62)
    public static void method1583(int arg0) {
        field3591 = (class331[][][]) null;
        field3592 = (int[][]) null;
        field3595 = null;
        field3593 = null;
        if (arg0 >= -14) {
            field3593 = (class49) null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZ)I", line = 75)
    public static final int method1584(byte arg0, boolean arg1) {
        field3596++;
        long var2 = class306.method2102(-289);
        int var4 = -124 / ((arg0 - 55) / 35);
        for (class132 var5 = arg1 ? (class132) class104.field1741.method736(2) : (class132) class104.field1741.method727((byte) -110); var5 != null; var5 = (class132) class104.field1741.method727((byte) -110)) {
            if ((var5.field2266 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var5.field2266 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5062;
                    class116.field2006[var6] = class334.field5302[var6];
                    var5.method2195(-1);
                    return var6;
                }
                var5.method2195(-1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V", line = 112)
    public static final void method1585(int arg0, int arg1) {
        if (arg0 != 0) {
            field3598 = 1.4048427F;
        }
        class41.field612.method469(-11815, arg1);
        field3594++;
    }
}
