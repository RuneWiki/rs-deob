import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class99 extends class69 {

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "[Lwb;")
    public class138[] field1496 = new class138[5];

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field1492 = 0;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "[I")
    public int[] field1507 = new int[5];

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lsj;")
    public static class48 field1485 = new class48();

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1512 = "flash2:";

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field1516 = -1;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lrj;")
    public class16 field1491;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Lwj;")
    public class195 field1494;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Lid;")
    public class233 field1502;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Lcg;")
    public static class36 field1514;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "Lqd;")
    public class38 field1510;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Lbj;")
    public class47 field1498;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Lhe;")
    public class82 field1500;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lpk;")
    public class99 field1506;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
    public boolean field1490;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
    public boolean field1504;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "Z")
    public boolean field1509;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[Ljg;")
    public static class271[] field1511;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[Z")
    public static boolean[] field1499;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1485 = null;
        field1499 = null;
        field1512 = null;
        field1511 = null;
        field1514 = null;
        if (arg0 != -26297) {
            field1512 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public static final void method706(int arg0, int arg1) {
        class128.field2136.method1832(arg1, (byte) -68);
        if (arg0 == 4473) {
            field1484++;
            class254.field4053.method1832(arg1, (byte) 110);
            class100.field1521.method1832(arg1, (byte) 120);
            class73.field996.method1832(arg1, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(III)V")
    public class99(int arg0, int arg1, int arg2) {
        this.field1487 = this.field1505 = arg0;
        this.field1495 = arg2;
        this.field1488 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1486++;
        if (arg1 == arg5 && arg7 == arg8 && arg3 == arg9 && arg0 == arg4) {
            class181.method1249(arg6, arg0, arg8, arg1, -115, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg1 * 3;
            int var12 = arg5 * 3;
            int var13 = arg8;
            int var14 = arg3 * 3;
            int var15 = arg7 * 3;
            int var16 = arg4 * 3;
            int var17 = arg8 * 3;
            int var18 = var11 + var14 - var12 - var12;
            int var19 = arg0 + var15 - arg8 - var16;
            int var20 = var16 + var17 - var15 - var15;
            int var21 = arg9 - var14 - (-var12 - -arg1);
            int var22 = var12 - var11;
            int var23 = var15 - var17;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var20 * var26;
                int var29 = var18 * var26;
                int var30 = var21 * var27;
                int var31 = var22 * var24;
                int var32 = var19 * var27;
                int var33 = arg1 + (var29 + var30 + var31 >> 12);
                int var34 = var23 * var24;
                int var35 = (var28 + var32 + var34 >> 12) + arg8;
                class181.method1249(arg6, var35, var13, var10, -68, var33);
                var13 = var35;
                var10 = var33;
            }
        }
        int var25 = 35 / ((-arg2 - 57) / 34);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        field1497++;
        int var9 = class131.field2188 + ((class127.field2134 - class131.field2188) * var8 / 100);
        int var10 = 2048 - arg6 & 0x7FF;
        int var11 = 0;
        int var12 = 2048 - arg3 & 0x7FF;
        int var13 = arg1 * var9 >> 8;
        int var14 = 0;
        int var15 = var13;
        if (var10 != 0) {
            int var16 = class145.field2338[var10];
            int var17 = class145.field2348[var10];
            var14 = -var13 * var16 >> 16;
            var15 = var13 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class145.field2338[var12];
            int var19 = class145.field2348[var12];
            var11 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class193.field3108 = arg0 - var14;
        int var20 = -8 % ((arg7 + 60) / 63);
        class44.field522 = arg4 - var11;
        class119.field2014 = arg5 - var15;
        class244.field3910 = arg3;
        class8.field119 = arg6;
    }
}
