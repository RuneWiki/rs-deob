import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class105 extends class210 {

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
    public boolean field2149 = false;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "[I")
    public static int[] field2153 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lnh;")
    public static class133 field2145;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILnh;)V")
    public static final void method717(int arg0, class133 arg1) {
        field2150++;
        class195.field3814 = arg1;
        int var2 = 47 % ((arg0 - 38) / 61);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
    public static final void method718(byte arg0, boolean arg1) {
        class6.method42((byte) -29);
        field2146++;
        if (arg0 <= 24) {
            method717(114, null);
        }
        class73.field1541++;
        if (class73.field1541 < 50 && !arg1) {
            return;
        }
        class73.field1541 = 0;
        if (class12.field372 || class66.field1334 == null) {
            return;
        }
        class99.field2000.method405(41, 7);
        class26.field583++;
        try {
            class66.field1334.method324(0, class99.field2000.field1493, class99.field2000.field1472, 2084);
            class99.field2000.field1472 = 0;
        } catch (IOException var2) {
            class12.field372 = true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
    public static final void method719(byte arg0) {
        if (arg0 <= 22) {
            field2145 = null;
        }
        class115.field2339 = false;
        field2152++;
        class212.field4108 = false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILei;Lei;)V")
    public static final void method720(int arg0, class50 arg1, class50 arg2) {
        if (class170.field3319 == null) {
            class170.field3319 = class79.method541(0, class89.field1761, (byte) 119, class58.field1220);
        }
        field2151++;
        if (class53.field1112 == null) {
            class53.field1112 = class45.method281(class40.field906, -109, 0, class58.field1220);
        }
        if (class73.field1544 == null) {
            class73.field1544 = class45.method281(class4.field265, -76, 0, class58.field1220);
        }
        if (class111.field2269 == null) {
            class111.field2269 = class45.method281(class133.field2651, -76, 0, class58.field1220);
        }
        class163.method1049(0, 23, 765, 480, 0);
        class163.method1054(0, 0, 125, 23, 12425273, 9135624);
        class163.method1054(125, 0, 640, 23, 5197647, 2697513);
        arg1.method1003(class40.field898, 62, 15, 0, -1);
        if (class111.field2269 != null) {
            class111.field2269[1].method1145(140, 1);
            arg2.method987(class162.field3183, 152, 10, 16777215, -1);
            class111.field2269[0].method1145(140, 12);
            arg2.method987(class126.field2553, 152, 21, 16777215, -1);
        }
        if (class73.field1544 != null) {
            short var3 = 280;
            short var4 = 390;
            if (class200.field3901[0] == 0 && class166.field3267[0] == 0) {
                class73.field1544[2].method1145(var3, 4);
            } else {
                class73.field1544[0].method1145(var3, 4);
            }
            if (class200.field3901[0] == 0 && class166.field3267[0] == 1) {
                class73.field1544[3].method1145(var3 + 15, 4);
            } else {
                class73.field1544[1].method1145(var3 + 15, 4);
            }
            short var5 = 500;
            arg1.method987(class66.field1342, var3 + 32, 17, 16777215, -1);
            short var6 = 610;
            if (class200.field3901[0] == 1 && class166.field3267[0] == 0) {
                class73.field1544[2].method1145(var4, 4);
            } else {
                class73.field1544[0].method1145(var4, 4);
            }
            if (class200.field3901[0] == 1 && class166.field3267[0] == 1) {
                class73.field1544[3].method1145(var4 + 15, 4);
            } else {
                class73.field1544[1].method1145(var4 + 15, 4);
            }
            arg1.method987(class117.field2366, var4 + 32, 17, 16777215, -1);
            if (class200.field3901[0] == 2 && class166.field3267[0] == 0) {
                class73.field1544[2].method1145(var5, 4);
            } else {
                class73.field1544[0].method1145(var5, 4);
            }
            if (class200.field3901[0] == 2 && class166.field3267[0] == 1) {
                class73.field1544[3].method1145(var5 + 15, 4);
            } else {
                class73.field1544[1].method1145(var5 + 15, 4);
            }
            arg1.method987(class197.field3839, var5 + 32, 17, 16777215, -1);
            if (class200.field3901[0] == 3 && class166.field3267[0] == 0) {
                class73.field1544[2].method1145(var6, 4);
            } else {
                class73.field1544[0].method1145(var6, 4);
            }
            if (class200.field3901[0] == 3 && class166.field3267[0] == 1) {
                class73.field1544[3].method1145(var6 + 15, 4);
            } else {
                class73.field1544[1].method1145(var6 + 15, 4);
            }
            arg1.method987(class119.field2411, var6 + 32, 17, 16777215, -1);
        }
        class163.method1049(708, arg0, 50, 16, 0);
        arg2.method1003(class102.field2098, 733, 16, 16777215, -1);
        class81.field1632 = -1;
        if (class170.field3319 == null) {
            return;
        }
        byte var7 = 88;
        int var8 = 765 / (var7 + 1);
        byte var9 = 19;
        int var10 = 480 / (var9 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var8;
            if ((var8 - 1) * var10 >= class156.field3106) {
                var8--;
            }
            if ((var10 - 1) * var8 >= class156.field3106) {
                var10--;
            }
            if ((var10 - 1) * var8 >= class156.field3106) {
                var10--;
            }
        } while (var10 != var11 || var8 != var12);
        int var13 = (480 - var9 * var10) / (var10 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (480 - (var10 - 1) * var13 - var9 * var10) / 2;
        int var15 = var14 + 23;
        int var16 = (765 - var7 * var8) / (var8 + 1);
        if (var16 > 5) {
            var16 = 5;
        }
        int var17 = (765 - (var8 - 1) * var16 - var7 * var8) / 2;
        int var18 = var17;
        int var19 = 0;
        for (int var20 = 0; var20 < class156.field3106; var20++) {
            class32 var21 = class148.field2942[var20];
            class92 var22 = class142.method938(var21.field726, false);
            boolean var23 = true;
            if (var21.field726 == -1) {
                var22 = class90.field1771;
                var23 = false;
            } else if (var21.field726 > 1980) {
                var22 = class211.field4087;
                var23 = false;
            }
            if (class29.field641 >= var18 && var15 <= class192.field3756 && var7 + var18 > class29.field641 && class192.field3756 < var9 + var15 && var23) {
                class81.field1632 = var20;
                class170.field3319[var21.field720 ? 1 : 0].method1096(var18, var15, 128, 16777215);
            } else {
                class170.field3319[var21.field720 ? 1 : 0].method1092(var18, var15);
            }
            if (class53.field1112 != null) {
                class53.field1112[(var21.field720 ? 8 : 0) + var21.field727].method1145(var18 + 29, var15);
            }
            arg1.method1003(class142.method938(var21.field730, false), var18 + 15, var9 / 2 + 5 + var15, 0, -1);
            arg2.method1003(var22, var18 + 60, var9 / 2 + var15 + 5, 268435455, -1);
            var15 += var9 + var13;
            var19++;
            if (var19 >= var10) {
                var15 = var14 + 23;
                var18 += var7 + var16;
                var19 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public static void method721(int arg0) {
        int var1 = 64 / ((arg0 + 83) / 33);
        field2145 = null;
        field2153 = null;
    }
}
