import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class120 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
    public boolean field1689 = false;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lwm;")
    public static class152 field1692 = class157.method1048("_", 122);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lwm;")
    public static class152 field1686 = class157.method1048("3D)2Softwarebibliothek gestartet)3", 108);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lwm;")
    public static class152 field1693 = class157.method1048("<img=1>", 105);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lne;")
    public static class235 field1695 = new class235(50);

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[Lhi;")
    public static class291[] field1701 = new class291[2048];

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lwm;")
    public static class152 field1699 = class157.method1048("Card:", 126);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lne;")
    public static class235 field1700 = new class235(30);

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lwm;")
    public static class152 field1703 = class157.method1048("Lade Konfiguration )2 ", 109);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "F")
    public static float field1704;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "J")
    public long field1685;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Loe;")
    public static class127 field1694;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lbg;")
    public static class203 field1702;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lv;")
    public class73 field1684;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lrf;", line = 12)
    public static final class275 method778(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class275 var4 = var3.field554;
            var3.field554 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V", line = 27)
    public static final void method779(boolean arg0, byte arg1) {
        byte var2;
        byte[][] var3;
        if (class217.field3516 && arg0) {
            var2 = 1;
            var3 = class133.field2041;
        } else {
            var2 = 4;
            var3 = class107.field1534;
        }
        field1687++;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class284.field4835[var5] >> 8) * 64 - class272.field4670;
            int var7 = (class284.field4835[var5] & 0xFF) * 64 - class199.field3226;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class234.method1609(-128);
                class307.method2138((class121.field1713 - 6) * 8, var7, (class110.field1555 - 6) * 8, arg0, class135.field2076, var6, 116, var8);
            }
        }
        if (arg1 != 88) {
            method779(false, (byte) 69);
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class284.field4835[var9] >> 8) * 64 - class272.field4670;
            int var11 = (class284.field4835[var9] & 0xFF) * 64 - class199.field3226;
            byte[] var12 = var3[var9];
            if (var12 == null && class110.field1555 < 800) {
                class234.method1609(-128);
                for (int var13 = 0; var13 < var2; var13++) {
                    class113.method756(var13, true, 64, var11, 64, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V", line = 113)
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        class275.method1885(arg3, class179.field2843[arg4], arg1 - arg2, arg1 + arg2, -2611);
        int var6 = arg2;
        field1698++;
        int var7 = -arg2;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class179.field2843[arg4 + var6];
                int var10 = arg1 + var5;
                int var11 = arg1 - var5;
                int[] var12 = class179.field2843[arg4 - var6];
                class275.method1885(arg3, var9, var11, var10, -2611);
                class275.method1885(arg3, var12, var11, var10, -2611);
            }
            int var13 = arg1 - var6;
            int var14 = arg1 + var6;
            int[] var15 = class179.field2843[arg4 + var5];
            int[] var16 = class179.field2843[arg4 - var5];
            class275.method1885(arg3, var15, var13, var14, -2611);
            class275.method1885(arg3, var16, var13, var14, -2611);
        }
        if (arg0 > -35) {
            field1702 = (class203) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 165)
    public static void method781(int arg0) {
        field1699 = null;
        field1686 = null;
        field1702 = null;
        field1694 = null;
        field1700 = null;
        if (arg0 != -26081) {
            return;
        }
        field1695 = null;
        field1703 = null;
        field1701 = null;
        field1692 = null;
        field1693 = null;
    }
}
