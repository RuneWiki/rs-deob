import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class196 extends class255 {

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "Lub;")
    public class88 field3516;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Leb;")
    public static class230 field3512 = class68.method589(0, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field3510 = 3;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "Lvk;")
    public static class35 field3514;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)I")
    public static final int method1393(int arg0, int arg1) {
        int var2 = arg0 >> 6 & 0x3;
        int var3 = arg0 & 0x3F;
        field3515++;
        if (arg1 != -24015) {
            field3513 = -96;
        }
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        field3518++;
        int var1 = class236.field4086.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class236.field4086[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class114.field2039; var4++) {
                    if (class13.field262[var2] == class108.field1944[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class108.field1944[class114.field2039] = class13.field262[var2];
                    var3 = class114.field2039++;
                }
                class14 var5 = new class14(class236.field4086[var2]);
                int var6 = 0;
                while (var5.field318 < class236.field4086[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method161(4);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FA2) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class13.field262[var2] & 0xFF) * 64 + var11 - class155.field2759;
                    int var13 = (class13.field262[var2] >> 8) * 64 + var10 - class272.field4795;
                    class97 var14 = class232.method1640(-72, var5.method161(4));
                    if (class168.field2963[var7] == null && (var14.field1758 & 0x1) > 0 && class171.field3036 == var9 && var13 >= 0 && (var14.field1769 + var13) < 104 && var12 >= 0 && var14.field1769 + var12 < 104) {
                        class168.field2963[var7] = new class109();
                        class109 var15 = class168.field2963[var7];
                        class167.field2956[class18.field393++] = var7;
                        var15.field1956 = var14;
                        var15.field2256 = class259.field4584;
                        var15.method1009(-1000, var15.field1956.field1769);
                        var15.field2283 = var15.field1956.field1791;
                        var15.field2270 = var15.field1956.field1755;
                        var15.field2291 = var15.field1956.field1784;
                        var15.field2301 = var15.field1956.field1777;
                        if (var15.field2270 == 0) {
                            var15.field2289 = 0;
                        }
                        var15.field2252 = var15.field1956.field1794;
                        var15.field2305 = var15.field1956.field1768;
                        var15.field2298 = var15.field1956.field1796;
                        var15.field2293 = var15.field1956.field1770;
                        var15.method1010(var15.method1005(0), (byte) 5, var12, var13, true);
                    }
                }
            }
        }
        if (arg0 != -1718) {
            field3512 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method1395(int arg0, byte arg1) {
        int var2 = -4 % ((73 - arg1) / 44);
        field3517++;
        class183.field3208.method1121(0, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
    public static void method1396(byte arg0) {
        field3512 = null;
        int var1 = 34 / ((arg0 + 86) / 36);
        field3514 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([[II)V")
    public static final void method1397(int[][] arg0, int arg1) {
        if (arg1 != 19) {
            field3510 = -17;
        }
        class66.field1254 = arg0;
        field3511++;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lub;)V")
    public class196(class88 arg0) {
        this.field3516 = arg0;
    }
}
