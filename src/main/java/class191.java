import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class191 extends class81 {

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "[B")
    public byte[] field3478;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "[I")
    public static int[] field3472 = new int[128];

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Lsg;")
    public static class30 field3474 = class167.method1221((byte) 33, "::");

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lai;")
    public static class103 field3473;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "Lmc;")
    public static class151 field3471;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "Lcc;")
    public static class206 field3476;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "[I")
    public static int[] field3475;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JIZII)Lsg;")
    public static final class30 method1383(long arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3479++;
        class30 var6 = class136.method1023(6534, 0);
        if (arg0 < 0L) {
            var6.method293(-90, class113.field2248);
            arg0 = -arg0;
        }
        class30 var7 = class49.field1120;
        class30 var8 = class235.field4189;
        if (arg1 == 1) {
            var7 = class235.field4189;
            var8 = class49.field1120;
        }
        if (~arg1 == arg3) {
            var8 = class169.field3180;
            var7 = class235.field4189;
        }
        class30 var9 = class136.method1023(arg3 + 6537, 0);
        class30 var10 = class136.method1023(6534, 0);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method293(-114, class73.method675(arg3, (int) (arg0 % 10L)));
            arg0 /= 10L;
        }
        if (arg0 == 0L) {
            var9 = class116.field2289;
        }
        int var12 = 0;
        while (arg0 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method293(-120, var8);
            }
            var9.method293(arg3 ^ 0x5B, class73.method675(119, (int) (arg0 % 10L)));
            arg0 /= 10L;
            var12++;
        }
        if (var10.method249(arg3 - 74) > 0) {
            var10.method293(-102, var7);
        }
        return class160.method1188(new class30[] { var6, var9.method290(-1), var10.method290(-1) }, 0);
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static void method1384(int arg0) {
        if (arg0 != 128) {
            field3476 = null;
        }
        field3476 = null;
        field3474 = null;
        field3472 = null;
        field3471 = null;
        field3475 = null;
        field3473 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
    public class191(byte[] arg0) {
        this.field3478 = arg0;
    }
}
