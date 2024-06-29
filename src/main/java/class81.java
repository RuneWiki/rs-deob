import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class81 extends class236 {

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lsg;")
    public static class30 field1734 = class167.method1221((byte) 33, "(U0a )2 via: ");

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lsg;")
    public static class30 field1739 = class167.method1221((byte) 33, "leuchten3:");

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Lgd;")
    public static class260 field1737 = new class260();

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "[I")
    public static int[] field1745 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "[I")
    public static int[] field1746 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "J")
    public long field1743;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lpe;")
    public class81 field1736;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lpe;")
    public class81 field1740;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "[[[B")
    public static byte[][][] field1747;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfd;B)V")
    public static final void method700(class202 arg0, byte arg1) {
        long var2 = 0L;
        int var4 = -1;
        field1735++;
        if (arg1 >= -84) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field3609 == 0) {
            var2 = class176.method1291(arg0.field3605, arg0.field3616, arg0.field3596);
        }
        if (arg0.field3609 == 1) {
            var2 = class246.method1729(arg0.field3605, arg0.field3616, arg0.field3596);
        }
        if (arg0.field3609 == 2) {
            var2 = class30.method259(arg0.field3605, arg0.field3616, arg0.field3596);
        }
        if (arg0.field3609 == 3) {
            var2 = class275.method1868(arg0.field3605, arg0.field3616, arg0.field3596);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7F925) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg0.field3610 = var5;
        arg0.field3595 = var6;
        arg0.field3608 = var4;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    public final void method701(boolean arg0) {
        field1744++;
        if (this.field1736 == null) {
            return;
        }
        this.field1736.field1740 = this.field1740;
        this.field1740.field1736 = this.field1736;
        this.field1740 = null;
        if (!arg0) {
            this.field1743 = -6L;
        }
        this.field1736 = null;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static void method702(int arg0) {
        field1746 = null;
        field1745 = null;
        field1747 = null;
        field1734 = null;
        field1739 = null;
        if (arg0 != 49) {
            method705(-121);
        }
        field1737 = null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)Z")
    public static final boolean method703(int arg0) {
        if (arg0 != -15861) {
            method702(-96);
        }
        field1742++;
        return class13.field238;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
    public static final int method704(int arg0, int arg1) {
        field1738++;
        if (arg0 < 0) {
            return 0;
        }
        class109 var2 = (class109) class208.field3730.method1168(-3, (long) arg0);
        if (var2 == null) {
            return class178.method1298(24177, arg0).field1119;
        }
        if (arg1 < 38) {
            method705(-43);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2195.length; var4++) {
            if (var2.field2195[var4] == -1) {
                var3++;
            }
        }
        return var3 + class178.method1298(24177, arg0).field1119 - var2.field2195.length;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public static final void method705(int arg0) {
        field1741++;
        class59.field1289.method1269((byte) -70);
        int var1 = class59.field1289.method1270(-51, 8);
        if (var1 < class221.field3985) {
            for (int var2 = var1; var2 < class221.field3985; var2++) {
                class268.field4731[class109.field2197++] = class4.field55[var2];
            }
        }
        if (var1 > class221.field3985) {
            throw new RuntimeException("gnpov1");
        }
        class221.field3985 = 0;
        if (arg0 >= -34) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class4.field55[var3];
            class275 var5 = class125.field2443[var4];
            int var6 = class59.field1289.method1270(-116, 1);
            if (var6 == 0) {
                class4.field55[class221.field3985++] = var4;
                var5.field1391 = class133.field2617;
            } else {
                int var7 = class59.field1289.method1270(-52, 2);
                if (var7 == 0) {
                    class4.field55[class221.field3985++] = var4;
                    var5.field1391 = class133.field2617;
                    class116.field2293[class168.field3158++] = var4;
                } else if (var7 == 1) {
                    class4.field55[class221.field3985++] = var4;
                    var5.field1391 = class133.field2617;
                    int var8 = class59.field1289.method1270(-115, 3);
                    var5.method573(var8, false, 41);
                    int var9 = class59.field1289.method1270(-88, 1);
                    if (var9 == 1) {
                        class116.field2293[class168.field3158++] = var4;
                    }
                } else if (var7 == 2) {
                    class4.field55[class221.field3985++] = var4;
                    var5.field1391 = class133.field2617;
                    int var10 = class59.field1289.method1270(-114, 3);
                    var5.method573(var10, true, 57);
                    int var11 = class59.field1289.method1270(-71, 3);
                    var5.method573(var11, true, 105);
                    int var12 = class59.field1289.method1270(-53, 1);
                    if (var12 == 1) {
                        class116.field2293[class168.field3158++] = var4;
                    }
                } else if (var7 == 3) {
                    class268.field4731[class109.field2197++] = var4;
                }
            }
        }
    }
}
