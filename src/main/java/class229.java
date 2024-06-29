import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class229 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lka;")
    public static class245 field3940 = null;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Leb;")
    public static class230 field3947 = class68.method589(0, "(R");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lka;")
    public static class245 field3941;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[[[B")
    public static byte[][][] field3949;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lka;II)V")
    public static final void method1576(class245[] arg0, int arg1, int arg2) {
        field3946++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class245 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4306 == 0) {
                    if (var4.field4318 != null) {
                        method1576(var4.field4318, arg1, 255);
                    }
                    class150 var5 = (class150) client.field2708.method394((long) var4.field4362, -21083);
                    if (var5 != null) {
                        class37.method339(var5.field2681, arg1, 3);
                    }
                }
                if (arg1 == 0 && var4.field4312 != null) {
                    class75 var6 = new class75();
                    var6.field1364 = var4.field4312;
                    var6.field1354 = var4;
                    class58.method495(var6, 150);
                }
                if (arg1 == 1 && var4.field4243 != null) {
                    if (var4.field4313 >= 0) {
                        class245 var7 = class155.method1183(var4.field4362, 17);
                        if (var7 == null || var7.field4318 == null || var4.field4313 >= var7.field4318.length || var7.field4318[var4.field4313] != var4) {
                            continue;
                        }
                    }
                    class75 var8 = new class75();
                    var8.field1354 = var4;
                    var8.field1364 = var4.field4243;
                    class58.method495(var8, 150);
                }
            }
        }
        if (arg2 != 255) {
            method1577(4);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method1577(int arg0) {
        field3939++;
        class205.field3613.method1124(0);
        if (arg0 > -58) {
            field3941 = null;
        }
        client.field2720.method1124(0);
        class142.field2560.method1124(0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        field3947 = null;
        field3941 = null;
        field3940 = null;
        if (arg0 <= 78) {
            method1580(-38);
        }
        field3949 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILkk;I)Lmf;")
    public static final class10 method1579(int arg0, int arg1, class223 arg2, int arg3) {
        int var4 = -95 / ((arg1 + 28) / 41);
        field3943++;
        return class205.method1440(arg3, arg0, 2, arg2) ? class247.method1722((byte) 109) : null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method1580(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class71.field1300[var1] = true;
        }
        field3942++;
        if (arg0 >= -96) {
            field3947 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLkk;)V")
    public static final void method1581(byte arg0, class223 arg1) {
        field3945++;
        class40.field736 = class56.method470(arg1, 26140, class35.field655);
        class178.field3137 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var5 = (float) ((class182.field3177[var2] & 0xFF0000) >> 16);
            float var6 = (float) (class182.field3177[var2] >> 8 & 0xFF);
            int var7 = class182.field3177[var2 + 1] >> 16 & 0xFF;
            float var8 = ((float) var7 - var5) / 64.0F;
            int var9 = (class182.field3177[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var9 - var6) / 64.0F;
            float var11 = (float) (class182.field3177[var2] & 0xFF);
            int var12 = class182.field3177[var2 + 1] & 0xFF;
            float var13 = ((float) var12 - var11) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class178.field3137[var2 * 64 + var14] = class177.method1290((int) var11, class177.method1290((int) var6 << 8, (int) var5 << 16));
                var6 += var10;
                var5 += var8;
                var11 += var13;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class178.field3137[var3] = class182.field3177[3];
        }
        class246.field4380 = new int[32768];
        class92.field1664 = new int[32768];
        class105.method878(-808, (class69) null);
        class209.field3655 = new int[32768];
        int var4 = -72 % ((arg0 + 52) / 46);
        class118.field2106 = new int[32768];
        class182.field3165 = new class10(128, 254);
    }
}
