import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class47 extends class117 {

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "[I")
    public static int[] field612 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "Z")
    public static boolean field613 = false;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "[Lab;")
    public static class306[] field611 = new class306[6];

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "Z")
    public static boolean field616 = false;

    @OriginalMember(owner = "client!jj", name = "jb", descriptor = "[I")
    public static int[] field619 = new int[128];

    @OriginalMember(owner = "client!jj", name = "mb", descriptor = "Z")
    public static boolean field622 = true;

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "[I")
    public static int[] field618 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!jj", name = "ob", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!jj", name = "nb", descriptor = "[I")
    public static int[] field623;

    @OriginalMember(owner = "client!jj", name = "lb", descriptor = "[Lci;")
    public static class201[] field621;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 12)
    public static void method360(int arg0) {
        field621 = null;
        field623 = null;
        field618 = null;
        field611 = null;
        field612 = null;
        int var1 = 56 / ((arg0 + 14) / 49);
        field619 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[[I", line = 34)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = 116 % ((60 - arg1) / 51);
        field624++;
        int[][] var4 = this.field5104.method2365((byte) 119, arg0);
        if (this.field5104.field5325 && this.method834(-4275)) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int var8 = arg0 % this.field1627 * this.field1627;
            for (int var9 = 0; var9 < class166.field2731; var9++) {
                int var10 = this.field1621[var9 % this.field1630 + var8];
                var7[var9] = class333.method2319(var10 << 4, 4080);
                var5[var9] = class333.method2319(4080, var10 >> 4);
                var6[var9] = class333.method2319(var10, 16711680) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBC)I", line = 85)
    public static final int method361(int arg0, byte arg1, char arg2) {
        field617++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return arg1 <= 124 ? -102 : var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V", line = 107)
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 128) {
            method361(-62, (byte) -66, '\u001c');
        }
        field614++;
        if (arg2 > arg1) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class284.field4402[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class284.field4402[var6][arg4] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILcd;B)V", line = 142)
    public static final void method363(int arg0, int arg1, class136 arg2, byte arg3) {
        field620++;
        if (class78.field1046 < 2 && class244.field3811 == 0 && !class56.field783 || arg3 != 12) {
            return;
        }
        String var4 = class113.method796(-3);
        if (arg2 == null) {
            int var6 = class270.field4197.method2268(var4, arg0 + 4, arg1 + 15, 16777215, 0, class33.field490, class291.field4506);
            class319.method2240(var6 + class270.field4197.method2254(var4), arg0 + 4, true, 15, arg1);
            return;
        }
        class321 var5 = arg2.method991(false, class333.field5190);
        if (var5 == null) {
            var5 = class270.field4197;
        }
        var5.method2267(var4, arg0, arg1, arg2.field2137, arg2.field2078, arg2.field2094, arg2.field2127, arg2.field2021, arg2.field2000, class33.field490, class291.field4506, class80.field1092);
        class319.method2240(class80.field1092[2], class80.field1092[0], true, class80.field1092[3], class80.field1092[1]);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)[Lbh;", line = 197)
    public static final class18[] method364(byte arg0) {
        field615++;
        class18[] var1 = new class18[class230.field3599];
        for (int var2 = 0; var2 < class230.field3599; var2++) {
            if (class109.field1458) {
                var1[var2] = new class143(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], class207.field3298[var2], class81.field1101);
            } else {
                var1[var2] = new class201(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], class207.field3298[var2], class81.field1101);
            }
        }
        int var3 = 31 / ((arg0 - 17) / 55);
        class207.method1526(0);
        return var1;
    }
}
