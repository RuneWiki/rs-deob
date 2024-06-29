import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class148 {

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lve;")
    public static class255 field2501 = class87.method607(64, "lila:");

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lwl;")
    public static class81 field2502 = new class81(64);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
    public static boolean field2505 = false;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lve;")
    public static class255 field2506 = class87.method607(98, "<br>");

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lve;")
    private static class255 field2504 = class87.method607(67, "");

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lve;")
    public static class255 field2508 = field2504;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I", line = 26)
    public static final int method1095(int arg0, int arg1, int arg2) {
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        if (arg2 != 255) {
            field2506 = (class255) null;
        }
        field2509++;
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1096(byte arg0) {
        int var1 = class234.field3863 >> 7;
        if (class271.field4652 < 128) {
            class271.field4652 = 128;
        }
        if (arg0 >= -84) {
            method1100(76, (class88) null);
        }
        field2500++;
        class76.field1253 &= 0x7FF;
        if (class271.field4652 > 383) {
            class271.field4652 = 383;
        }
        int var2 = class16.field243 >> 7;
        int var3 = 0;
        int var4 = class113.method861((byte) -64, class234.field3863, class16.field243, client.field4039);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = client.field4039;
                    if (var7 < 3 && (class166.field2800[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class106.field1783[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class300.field5111 < var9) {
            class300.field5111 += (var9 - class300.field5111) / 24;
        } else if (class300.field5111 > var9) {
            class300.field5111 += (var9 - class300.field5111) / 80;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 125)
    public static final void method1097(byte arg0) {
        field2503++;
        class118.field1985 = 0;
        class103.field1731 = 0;
        class53.method333(-3354);
        class147.method1092(-101);
        class260.method1809((byte) -27);
        class246.method1698(32);
        for (int var1 = 0; var1 < class103.field1731; var1++) {
            int var2 = class87.field1413[var1];
            if (class277.field4768 != class151.field2555[var2].field5122) {
                if (class151.field2555[var2].field4053 > 0) {
                    class284.method2019((byte) -41, class151.field2555[var2]);
                }
                class151.field2555[var2] = null;
            }
        }
        int var3 = -53 / ((-arg0 - 66) / 53);
        if (class125.field2084 != class160.field2692.field1068) {
            throw new RuntimeException("gpp1 pos:" + class160.field2692.field1068 + " psize:" + class125.field2084);
        }
        for (int var4 = 0; var4 < class309.field5269; var4++) {
            if (class151.field2555[class259.field4398[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + class309.field5269);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILrg;)V", line = 177)
    public static final void method1098(int arg0, class88 arg1) {
        if (arg0 != 14872) {
            field2506 = (class255) null;
        }
        field2498++;
        class255.field4299 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 191)
    public static void method1099(int arg0) {
        field2502 = null;
        if (arg0 == -99165208) {
            field2506 = null;
            field2501 = null;
            field2504 = null;
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(ILrg;)V", line = 219)
    public static final void method1100(int arg0, class88 arg1) {
        class151.field2556 = class163.method1176(class150.field2552, 113, arg1);
        class160.field2709 = new int[256];
        field2499++;
        if (arg0 != 1) {
            method1095(87, -11, 73);
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class100.field1695[var2] & 0xFF0000) >> 16);
            int var4 = (class100.field1695[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            int var6 = (class100.field1695[var2 + 1] & 0xFF00) >> 8;
            float var7 = (float) ((class100.field1695[var2] & 0xFF00) >> 8);
            float var8 = (float) (class100.field1695[var2] & 0xFF);
            float var9 = ((float) var6 - var7) / 64.0F;
            int var10 = class100.field1695[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class160.field2709[var2 * 64 + var12] = class264.method1836((int) var8, class264.method1836((int) var3 << 16, (int) var7 << 8));
                var8 += var11;
                var3 += var5;
                var7 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class160.field2709[var13] = class100.field1695[3];
        }
        class163.field2744 = new int[32768];
        class87.field1399 = new int[32768];
        class155.method1148((class273) null, (byte) -96);
        class67.field993 = new int[32768];
        class50.field752 = new int[32768];
        if (class281.field4827) {
            class264.field4468 = new class48(128, 254);
        } else {
            class264.field4468 = new class83(128, 254);
        }
    }
}
