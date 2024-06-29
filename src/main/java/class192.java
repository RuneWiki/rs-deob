import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class192 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[B")
    public static byte[] field3380 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lqk;")
    private static class207 field3383 = class24.method212(255, "flash1:");

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lqk;")
    public static class207 field3381 = field3383;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lqk;")
    public static class207 field3386 = field3383;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lqk;")
    private static class207 field3388 = class24.method212(255, "Loaded fonts");

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[I")
    public static int[] field3392 = new int[256];

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lqk;")
    public static class207 field3391 = class24.method212(255, "scrollbar");

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Z")
    public static boolean field3389 = false;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[I")
    public static int[] field3390 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lqk;")
    public static class207 field3385 = field3388;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lqk;")
    public static class207 field3393 = class24.method212(255, " weitere Optionen");

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[[[I")
    public static int[][][] field3384;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)V")
    public static final void method1336(int arg0, byte arg1, int arg2) {
        field3382++;
        class244 var3 = class202.method1401(arg2, 31252);
        int var4 = var3.field4432;
        int var5 = var3.field4433;
        int var6 = var3.field4423;
        int var7 = class172.field3046[var5 - var6];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        if (arg1 > -89) {
            field3384 = null;
        }
        class68.method495(var4, class83.field1535[var4] & ~var8 | arg0 << var6 & var8, (byte) -120);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1337(byte arg0) {
        field3385 = null;
        field3380 = null;
        field3384 = null;
        field3388 = null;
        field3390 = null;
        field3381 = null;
        field3392 = null;
        field3391 = null;
        field3383 = null;
        if (arg0 != 100) {
            field3380 = null;
        }
        field3393 = null;
        field3386 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method1338(int arg0, int arg1) {
        field3387++;
        if (!class62.field1127) {
            arg0 = -1;
        }
        if (class275.field4815 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class270 var2 = class193.method1343(arg0, 12892);
            class139 var3 = var2.method1844((byte) 111);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class20.field326.method1638(true, var3.method959(), new Point(var2.field4770, var2.field4781), var3.field1806, class112.field1949, var3.field1810);
                class275.field4815 = arg0;
            }
        }
        if (arg1 < 122) {
            method1338(-30, 87);
        }
        if (arg0 == -1 && class275.field4815 != -1) {
            class20.field326.method1638(true, (int[]) null, new Point(), -1, class112.field1949, -1);
            class275.field4815 = -1;
        }
    }
}
