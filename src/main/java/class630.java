import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class630 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field8694 = class555.method3209(-53);

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Ljava/lang/String;")
    public String field8691;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "Ljava/lang/String;")
    public String field8699;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public int field8705;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Ljava/lang/String;")
    public String field8703;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field8692;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public int field8700;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Ljava/lang/String;")
    public String field8693;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "Ljava/lang/String;")
    public String field8704;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "[I")
    public static int[] field8702 = new int[1000];

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Lfia;")
    public static class577 field8701 = new class577(14, 0, 4, 1);

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field8706 = 1;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V", line = 12)
    public static final void method3539(int arg0, int arg1) {
        if (class80.field1108 == null || class80.field1108.length < arg1) {
            class80.field1108 = new int[arg1];
        }
        int var2 = -41 % ((57 - arg0) / 55);
        field8696++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 30)
    public static void method3540(int arg0) {
        field8701 = null;
        if (arg0 != -2684) {
            method3540(-16);
        }
        field8702 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 42)
    public final void method3541(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, String arg7, String arg8) {
        this.field8694 = class555.method3209(59);
        field8697++;
        this.field8698 = arg3;
        this.field8699 = arg5;
        this.field8692 = arg2;
        this.field8700 = class463.field6224;
        this.field8705 = arg6;
        if (arg1 >= -113) {
            method3540(-24);
        }
        this.field8693 = arg8;
        this.field8691 = arg4;
        this.field8703 = arg7;
        this.field8704 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 64)
    public static final void method3542(byte arg0) {
        class207.method1332((byte) -97, class617.field8508);
        field8695++;
        class564.field7933++;
        if (arg0 != -86) {
            method3542((byte) 19);
        }
        if (class270.field3398 && class100.field1390) {
            int var1 = 0;
            int var2 = 0;
            if (class676.field9448) {
                var1 = class209.method1347(arg0 ^ 0xFFFFFFAA);
                var2 = class453.method2540(arg0 - 19);
            }
            int var3 = class680.field9495.method1118((byte) 124) + var1;
            int var4 = class680.field9495.method1115(4) + var2;
            int var5 = var4 - class147.field2050;
            int var6 = var3 - class698.field9721;
            if (var6 < class259.field3280) {
                var6 = class259.field3280;
            }
            if (var5 < class142.field2010) {
                var5 = class142.field2010;
            }
            if ((class259.field3280 + class302.field3957.field3617) < (class617.field8508.field3617 + var6)) {
                var6 = class259.field3280 + class302.field3957.field3617 - class617.field8508.field3617;
            }
            if ((class142.field2010 + class302.field3957.field3714) < (class617.field8508.field3714 + var5)) {
                var5 = class142.field2010 + class302.field3957.field3714 - class617.field8508.field3714;
            }
            int var7 = var6 + class302.field3957.field3628 - class259.field3280;
            int var8 = var5 + class302.field3957.field3737 - class142.field2010;
            if (class680.field9495.method4049((byte) -107)) {
                if (class617.field8508.field3662 < class564.field7933) {
                    int var10 = var6 - class584.field8166;
                    int var11 = var5 - class127.field1808;
                    if (var10 > class617.field8508.field3613 || -class617.field8508.field3613 > var10 || var11 > class617.field8508.field3613 || var11 < (-class617.field8508.field3613)) {
                        class363.field4685 = true;
                    }
                }
                if (class617.field8508.field3614 != null && class363.field4685) {
                    class694 var12 = new class694();
                    var12.field9647 = var7;
                    var12.field9643 = var8;
                    var12.field9635 = class617.field8508;
                    var12.field9645 = class617.field8508.field3614;
                    class188.method1262(var12);
                }
            } else {
                if (class363.field4685) {
                    class522.method3033(96);
                    if (class617.field8508.field3705 != null) {
                        class694 var9 = new class694();
                        var9.field9643 = var8;
                        var9.field9635 = class617.field8508;
                        var9.field9640 = class232.field3042;
                        var9.field9647 = var7;
                        var9.field9645 = class617.field8508.field3705;
                        class188.method1262(var9);
                    }
                    if (class232.field3042 != null && client.method1830(class617.field8508) != null) {
                        class210.method1351(16, class232.field3042, class617.field8508);
                    }
                } else if ((class517.field7244 == 1 || class307.method1848(true)) && class159.field2181 > 2) {
                    class400.method2240(class698.field9721 + class584.field8166, class147.field2050 + class127.field1808, -121);
                } else if (class164.method1146(-127)) {
                    class400.method2240(class698.field9721 + class584.field8166, class147.field2050 - -class127.field1808, -118);
                }
                class617.field8508 = null;
            }
        } else if (class564.field7933 > 1) {
            class617.field8508 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 192)
    public class630(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8698 = arg0;
        this.field8691 = arg7;
        this.field8699 = arg4;
        this.field8705 = arg1;
        this.field8703 = arg5;
        this.field8692 = arg6;
        this.field8700 = class463.field6224;
        this.field8693 = arg2;
        this.field8704 = arg3;
    }
}
