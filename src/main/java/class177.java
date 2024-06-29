import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class177 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Ljd;")
    public static class86 field3209 = class122.method868("Suche nach Updates )2 ", true);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lbj;")
    public static class151 field3204;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Z")
    public static boolean field3208;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[[[I")
    public static int[][][] field3211;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lvj;")
    public static final class113 method1244(int arg0, int arg1) {
        if (arg1 != 1) {
            method1248(-25, 51, -55, 57);
        }
        field3205++;
        class113 var2 = (class113) class137.field2622.method395((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class133.field2532.method1084((byte) -117, 1, arg0);
        } else {
            var3 = class209.field3778.method1084((byte) -123, 1, arg0 & 0x7FFF);
        }
        class113 var4 = new class113();
        if (var3 != null) {
            var4.method794((byte) -94, new class200(var3));
        }
        if (arg0 >= 32768) {
            var4.method803(122);
        }
        class137.field2622.method398((long) arg0, (byte) 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        field3204 = null;
        field3211 = null;
        if (arg0 < 58) {
            method1246(false, true, true, -58, -18);
        }
        field3209 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZZII)Lbj;")
    public static final class151 method1246(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        int var5 = 110 / ((50 - arg4) / 52);
        class144 var6 = null;
        if (class25.field604 != null) {
            var6 = new class144(arg3, class25.field604, class104.field1993[arg3], 1000000);
        }
        class53.field1084[arg3] = class86.field1668.method1597(class118.field2313, arg3, -71, var6);
        field3213++;
        if (arg2) {
            class53.field1084[arg3].method140(0);
        }
        return new class151(class53.field1084[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3206++;
        class131.method936(arg1, arg4, arg1 + arg2, arg3 + arg4);
        class131.method927(arg1, arg4, arg2, arg3, 0);
        if (class265.field4684 < 100) {
            return;
        }
        if (class136.field2605 == null || class136.field2605.field1846 != arg2 || class136.field2605.field1835 != arg3) {
            class167 var5 = new class167(arg2, arg3);
            class131.method928(var5.field3098, arg2, arg3);
            class240.method1649(0, 0, arg2, 0, class263.field4668, -103, class38.field894, 0, arg3);
            class136.field2605 = var5;
            class107.field2055.method157(true);
        }
        class136.field2605.method670(arg1, arg4);
        if (arg0 != -32769) {
            return;
        }
        int var6 = class75.field1503 * arg2 / class263.field4668 + arg1;
        int var7 = class209.field3787 * arg3 / class38.field894 + arg4;
        int var8 = class31.field660 * arg2 / class263.field4668;
        int var9 = class75.field1495 * arg3 / class38.field894;
        class131.method930(var6, var7, var8, var9, 16711680, 128);
        class131.method932(var6, var7, var8, var9, 16711680);
        if (class25.field603 <= 0 || (class25.field603 % 10) >= 5) {
            return;
        }
        for (class220 var10 = (class220) class218.field3919.method1737((byte) 74); var10 != null; var10 = (class220) class218.field3919.method1740(-8843)) {
            if (class270.field4747 == var10.field3953) {
                int var11 = var10.field3957 * arg3 / class38.field894 + arg4;
                int var12 = var10.field3952 * arg2 / class263.field4668 + arg1;
                class131.method927(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
    public static final int method1248(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3210++;
        if (var4 == 0) {
            return arg0;
        } else if (~var4 == arg3) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
    public static int method1249(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lwj;Z)V")
    public static final void method1250(class6 arg0, boolean arg1) {
        field3212++;
        class6 var2 = class164.method1189(arg0, 271801008);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class4.field53;
            var4 = class248.field4414;
        } else {
            var4 = var2.field131;
            var3 = var2.field163;
        }
        class224.method1572(arg0, -33, var4, arg1, var3);
        class144.method1024(var3, arg0, (byte) 126, var4);
    }
}
