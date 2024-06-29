import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class109 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "J")
    public long field2449 = 0L;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lgg;")
    public static class63 field2457 = class116.method911(43, "titlebox");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lgg;")
    public static class63 field2453 = class116.method911(43, " x ");

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lgg;")
    public static class63 field2459 = class116.method911(43, "<col=40ff00>");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lqd;")
    public static class148 field2450 = new class148();

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lgg;")
    public static class63 field2466 = class116.method911(43, "<col=00ff00>");

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Ld;")
    public class30 field2463;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Ld;")
    public class30 field2467;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lje;")
    public static class87 field2454;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method878(int arg0) {
        field2454 = null;
        field2453 = null;
        field2450 = null;
        field2459 = null;
        if (arg0 != -2) {
            field2466 = null;
        }
        field2466 = null;
        field2457 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method879(boolean arg0) {
        field2461++;
        class167.field3437.method857((byte) 77);
        int var1 = class167.field3437.method856((byte) 2, 8);
        if (!arg0) {
            return;
        }
        if (var1 < class29.field695) {
            for (int var2 = var1; var2 < class29.field695; var2++) {
                class126.field2784[class90.field2108++] = class142.field3045[var2];
            }
        }
        if (class29.field695 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class29.field695 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class142.field3045[var3];
            class6 var5 = class55.field1458[var4];
            int var6 = class167.field3437.method856((byte) 2, 1);
            if (var6 == 0) {
                class142.field3045[class29.field695++] = var4;
                var5.field1163 = class173.field3571;
            } else {
                int var7 = class167.field3437.method856((byte) 2, 2);
                if (var7 == 0) {
                    class142.field3045[class29.field695++] = var4;
                    var5.field1163 = class173.field3571;
                    class3.field84[class89.field2092++] = var4;
                } else if (var7 == 1) {
                    class142.field3045[class29.field695++] = var4;
                    var5.field1163 = class173.field3571;
                    int var8 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(96, false, var8);
                    int var9 = class167.field3437.method856((byte) 2, 1);
                    if (var9 == 1) {
                        class3.field84[class89.field2092++] = var4;
                    }
                } else if (var7 == 2) {
                    class142.field3045[class29.field695++] = var4;
                    var5.field1163 = class173.field3571;
                    int var10 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(10, true, var10);
                    int var11 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(-23, true, var11);
                    int var12 = class167.field3437.method856((byte) 2, 1);
                    if (var12 == 1) {
                        class3.field84[class89.field2092++] = var4;
                    }
                } else if (var7 == 3) {
                    class126.field2784[class90.field2108++] = var4;
                }
            }
        }
    }
}
