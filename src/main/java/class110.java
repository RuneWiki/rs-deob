import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class110 extends class191 {

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "S")
    public short field2440 = -32768;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "[I")
    public static int[] field2430 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Ldd;")
    public static class35 field2424 = class180.method1196((byte) 126, "sl_back");

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field2433 = 0;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Ldd;")
    public static class35 field2435 = class180.method1196((byte) -70, "l");

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "J")
    public static long field2429 = 0L;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Ldd;")
    private static class35 field2436 = class180.method1196((byte) 126, "This world is full)3");

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field2425 = -1;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "Ldd;")
    public static class35 field2439 = field2436;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field2428 = 1;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "[I")
    public static int[] field2434;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "[I")
    public static int[] field2437;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2438++;
        class81 var11 = this.method205((byte) -115);
        if (var11 != null) {
            var11.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2440 = var11.field2440;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Ldd;")
    public static final class35 method805(int arg0, int arg1) {
        field2431++;
        return class183.field3756[arg1].method347((byte) -106) <= arg0 ? class64.field1541[arg1] : class63.method529(new class35[] { class64.field1541[arg1], class78.field1817, class183.field3756[arg1] }, (byte) 110);
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Lia;")
    public class81 method205(byte arg0) {
        if (arg0 == -115) {
            field2432++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIILfd;)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class55 arg6) {
        field2441++;
        int var7 = Math.min(arg6.field1249 / 2, arg6.field1329 / 2);
        int var8 = arg2 * arg2 + arg3 * arg3;
        if (var7 * var7 < var8 && var8 < 90000) {
            var7 -= 10;
            int var9 = class90.field2003 + class2.field40 & 0x7FF;
            int var10 = class11.field201[var9];
            int var11 = class11.field211[var9];
            int var12 = var11 * 256 / (class67.field1561 + 256);
            int var13 = var10 * 256 / (class67.field1561 + 256);
            int var14 = arg2 * var13 - arg3 * var12 >> 16;
            int var15 = arg2 * var12 + arg3 * var13 >> 16;
            double var16 = Math.atan2((double) var15, (double) var14);
            int var18 = (int) ((double) var7 * Math.sin(var16));
            int var19 = (int) ((double) var7 * Math.cos(var16));
            class100.field2211[arg5].method109(arg4 + arg6.field1249 / 2 + var18 - 10, arg6.field1329 / 2 + arg1 + -var19 - 10, 20, 20, 15, 15, var16, 256);
        } else {
            class138.method941(arg0 - 4150, arg6, arg4, class45.field982[arg5], arg2, arg1, arg3);
        }
        if (arg0 != 4152) {
            field2427 = 58;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2424 = null;
        field2436 = null;
        field2434 = null;
        field2435 = null;
        field2430 = null;
        if (arg0 != 5666) {
            method807(-56);
        }
        field2437 = null;
        field2439 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lce;I)Ldd;")
    public static final class35 method808(class26 arg0, int arg1) {
        field2442++;
        return arg1 == 7485 ? class187.method1235(23889, 32767, arg0) : null;
    }
}
