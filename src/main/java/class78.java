import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class78 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ljd;")
    public static class85 field1435 = class221.method1499("(R", (byte) -72);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Ljd;")
    public static class85 field1437 = class221.method1499("hint_mapedge", (byte) -58);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lge;")
    public static class68 field1440;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljd;B)V")
    public static final void method538(class85 arg0, byte arg1) {
        if (arg1 > -70) {
            method541(38, 76, 65);
        }
        field1441++;
        if (class63.field1174 >= 2) {
            if (arg0.method582(class196.field3373, -102)) {
                class25.method165(27456);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class148.method972(class172.method1150(new class85[] { class95.field1739, class68.method451(var4, -12572), class37.field572 }, 0), (byte) -55, (class85) null, 0);
            }
            if (arg0.method582(class150.field2529, -105)) {
                class49.method332((byte) 30);
            }
            if (arg0.method582(class247.field4286, -99)) {
                class169.method1136(true, 25);
            }
            if (arg0.method582(class197.field3387, -97)) {
                class28.field432 = true;
            }
            if (arg0.method582(class142.field2446, -43)) {
                class28.field432 = false;
            }
            if (arg0.method582(class168.field2887, -125)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class34.field529[var5].field4719[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method619(class204.field3570, (byte) 74) && class133.field2312 != 0) {
                class235.method1569(14365, arg0.method611((byte) -97, 6).method639(2));
            }
            if (arg0.method582(class79.field1453, -119) && class133.field2312 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method619(class187.field3209, (byte) 74)) {
                class183.field3128 = arg0.method611((byte) -97, 12).method601(0).method639(2);
                class148.method972(class172.method1150(new class85[] { class267.field4761, class68.method451(class183.field3128, -12572) }, 0), (byte) -98, (class85) null, 0);
            }
            if (arg0.method582(class222.field3894, -90)) {
                class183.field3134 = true;
            }
        }
        class207.field3618.method483(-24260, 113);
        class207.field3618.method1714(arg0.method586(true) - 1, -714043120);
        class72.field1347++;
        class207.field3618.method1698((byte) -72, arg0.method611((byte) -97, 2));
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILlh;)Llh;")
    public abstract class272 method539(int arg0, class272 arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1435 = null;
        field1437 = null;
        if (arg0 == 0) {
            field1440 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lei;")
    public static final class167 method541(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class167 var4 = var3.field3648;
            var3.field3648 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1436++;
        class251[] var7 = class7.field87;
        int var8 = 0;
        if (arg6 != -10781) {
            field1435 = null;
        }
        while (var8 < var7.length) {
            class251 var9 = var7[var8];
            if (var9 != null && var9.field4321 == 2) {
                class92.method670(var9.field4315 * 2, arg3, arg5, 1, arg1 >> 1, arg2 >> 1, (var9.field4301 - class213.field3742 << 7) + var9.field4332, (-class244.field4172 + var9.field4306 << 7) + var9.field4328);
                if (class71.field1324 > -1 && class151.field2555 % 20 < 10) {
                    class182.field3112[var9.field4325].method56(arg0 + class71.field1324 - 12, class47.field832 + arg4 + -28);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method543(byte arg0) {
        if (arg0 >= -70) {
            field1440 = null;
        }
        class196.field3378++;
        class207.field3618.method483(-24260, 103);
        field1442++;
        class207.field3618.method1703(class23.field325, -101);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Z")
    public static final boolean method544(int arg0, int arg1) {
        field1438++;
        if (arg0 != 113) {
            field1435 = null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method545(int arg0) {
        if (arg0 == -13203) {
            for (int var1 = 0; var1 < 100; var1++) {
                class20.field286[var1] = true;
            }
            field1439++;
        }
    }
}
