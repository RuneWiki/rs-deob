import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class277 extends class59 {

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Lok;")
    public class41 field4541;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lok;")
    public static class41 field4535 = class137.method956(")4p=", 45);

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[I")
    public static int[] field4540 = new int[64];

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "Lok;")
    public static class41 field4537 = class137.method956("(U (X", 45);

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lok;")
    public static class41 field4544 = class137.method956("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[Ltb;")
    public static class199[] field4538;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[[[B")
    public static byte[][][] field4539;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[[[B")
    public static byte[][][] field4542;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V", line = 6)
    public static void method1959(int arg0) {
        field4542 = (byte[][][]) null;
        field4538 = null;
        field4540 = null;
        field4535 = null;
        field4544 = null;
        field4539 = (byte[][][]) null;
        int var1 = -81 % ((4 - arg0) / 56);
        field4537 = null;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 25)
    public static final void method1960(int arg0) {
        field4545++;
        if (class48.method346(0) != 2) {
            return;
        }
        byte var1 = (byte) (class112.field1646 - arg0 & 0xFF);
        int var2 = class112.field1646 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class252.field4015[var3][var2][var4] = var1;
            }
        }
        if (class55.field807 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class162.field2578[var5] = -1000000;
            class223.field3580[var5] = 1000000;
            class104.field1485[var5] = 0;
            class234.field3744[var5] = 1000000;
            class300.field4871[var5] = 0;
        }
        if (class28.field416 != 1) {
            int var16 = class140.method983((byte) 109, class55.field807, class235.field3779, class251.field3990);
            if (var16 - class13.field159 < 800 && (class126.field1879[class55.field807][class235.field3779 >> 7][class251.field3990 >> 7] & 0x4) != 0) {
                class226.method1620(false, class235.field3779 >> 7, 1, class205.field3312, 16752871, class251.field3990 >> 7);
            }
            return;
        }
        if ((class126.field1879[class55.field807][class62.field913.field4280 >> 7][class62.field913.field4311 >> 7] & 0x4) != 0) {
            class226.method1620(false, class62.field913.field4280 >> 7, 0, class205.field3312, 16752871, class62.field913.field4311 >> 7);
        }
        if (class57.field823 >= 310) {
            return;
        }
        int var6 = class235.field3779 >> 7;
        int var7 = class251.field3990 >> 7;
        int var8 = class62.field913.field4280 >> 7;
        int var9;
        if (var8 > var6) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10 = class62.field913.field4311 >> 7;
        int var11;
        if (var10 <= var7) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var11 >= var9) {
            int var14 = 32768;
            int var15 = var9 * 65536 / var11;
            while (var7 != var10) {
                if (var10 > var7) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                if ((class126.field1879[class55.field807][var6][var7] & 0x4) != 0) {
                    class226.method1620(false, var6, 1, class205.field3312, 16752871, var7);
                    break;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class126.field1879[class55.field807][var6][var7] & 0x4) != 0) {
                        class226.method1620(false, var6, 1, class205.field3312, 16752871, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var9;
        int var13 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class126.field1879[class55.field807][var6][var7] & 0x4) != 0) {
                class226.method1620(false, var6, 1, class205.field3312, 16752871, var7);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var10 > var7) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                var13 -= 65536;
                if ((class126.field1879[class55.field807][var6][var7] & 0x4) != 0) {
                    class226.method1620(false, var6, 1, class205.field3312, arg0 + 16752867, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lmb;", line = 217)
    public static final class137 method1961(int arg0, int arg1) {
        class137 var2 = (class137) class281.field4570.method554((long) arg0, -95);
        field4536++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field1670.method454(arg0, 0, 0);
        if (var3 == null) {
            return null;
        }
        class137 var4 = new class137();
        class112 var5 = new class112(var3);
        var5.field1640 = var5.field1607.length - 2;
        int var6 = var5.method759((byte) -75);
        if (arg1 != 104952679) {
            method1960(-86);
        }
        int var7 = var5.field1607.length - var6 - 2 - 12;
        var5.field1640 = var7;
        int var8 = var5.method779(-27100);
        var4.field2052 = var5.method759((byte) -86);
        var4.field2042 = var5.method759((byte) -118);
        var4.field2054 = var5.method759((byte) -36);
        var4.field2044 = var5.method759((byte) -51);
        int var9 = var5.method792(arg1 ^ 0x6417365);
        if (var9 > 0) {
            var4.field2055 = new class86[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method759((byte) -121);
                class86 var12 = new class86(class110.method746(var11, -705295902));
                var4.field2055[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method779(arg1 - 104979779);
                    int var14 = var5.method779(-27100);
                    var12.method610(arg1 - 104952570, new class55(var14), (long) var13);
                }
            }
        }
        var5.field1640 = 0;
        var4.field2056 = var5.method817((byte) -37);
        var4.field2047 = new int[var8];
        var4.field2049 = new class41[var8];
        var4.field2043 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field1640) {
            int var16 = var5.method759((byte) -51);
            if (var16 == 3) {
                var4.field2049[var15] = var5.method763(true);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2047[var15] = var5.method792(2);
            } else {
                var4.field2047[var15] = var5.method779(-27100);
            }
            var4.field2043[var15++] = var16;
        }
        class281.field4570.method555((long) arg0, (byte) -127, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 307)
    public class277() {
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lok;I)V", line = 325)
    public class277(class41 arg0, int arg1) {
        this.field4541 = arg0;
    }
}
