import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class27 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
    public static int[] field441 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lrb;")
    public static class254 field438 = new class254(500);

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[Lqa;")
    public static class225[] field446 = new class225[2048];

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Lub;")
    public static class227 field447 = class257.method1749("(Y", 17263);

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lub;")
    private static class227 field444 = class257.method1749(" more options", 17263);

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lub;")
    public static class227 field445 = field444;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lub;")
    public static class227 field448 = class257.method1749(")4a=", 17263);

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lub;")
    public static class227 field450 = class257.method1749("<col=ffb000>", 17263);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[[[Lck;")
    public static class108[][][] field449;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method134(int arg0) {
        field442++;
        class32.field512.method666((byte) 54);
        int var1 = class32.field512.method660(8, true);
        if (var1 < class71.field1254) {
            for (int var2 = var1; var2 < class71.field1254; var2++) {
                class8.field164[class236.field4094++] = class146.field2517[var2];
            }
        }
        if (var1 > class71.field1254) {
            throw new RuntimeException("gnpov1");
        }
        class71.field1254 = 0;
        if (arg0 <= 11) {
            method137(-51, 45);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class146.field2517[var3];
            class195 var5 = class220.field3715[var4];
            int var6 = class32.field512.method660(1, true);
            if (var6 == 0) {
                class146.field2517[class71.field1254++] = var4;
                var5.field73 = class253.field4393;
            } else {
                int var7 = class32.field512.method660(2, true);
                if (var7 == 0) {
                    class146.field2517[class71.field1254++] = var4;
                    var5.field73 = class253.field4393;
                    class131.field2293[class147.field2572++] = var4;
                } else if (var7 == 1) {
                    class146.field2517[class71.field1254++] = var4;
                    var5.field73 = class253.field4393;
                    int var8 = class32.field512.method660(3, true);
                    var5.method19(var8, true, false);
                    int var9 = class32.field512.method660(1, true);
                    if (var9 == 1) {
                        class131.field2293[class147.field2572++] = var4;
                    }
                } else if (var7 == 2) {
                    class146.field2517[class71.field1254++] = var4;
                    var5.field73 = class253.field4393;
                    int var10 = class32.field512.method660(3, true);
                    var5.method19(var10, true, true);
                    int var11 = class32.field512.method660(3, true);
                    var5.method19(var11, true, true);
                    int var12 = class32.field512.method660(1, true);
                    if (var12 == 1) {
                        class131.field2293[class147.field2572++] = var4;
                    }
                } else if (var7 == 3) {
                    class8.field164[class236.field4094++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method135(int arg0) {
        if (!class81.field1409) {
            class37.field611[0] = class37.field614;
            class19.field327[0] = 1006;
            class94.field1631 = 1;
            class213.field3607[0] = class91.field1558;
        }
        if (class116.field2131 != -1) {
            class106.method656(class116.field2131, -122);
        }
        for (int var1 = 0; var1 < class140.field2421; var1++) {
            if (class10.field182[var1]) {
                class79.field1379[var1] = true;
            }
            class108.field2034[var1] = class10.field182[var1];
            class10.field182[var1] = false;
        }
        class226.field3905 = class253.field4393;
        class243.field4212 = null;
        field437++;
        class218.field3668 = -1;
        class108.field2038 = -1;
        if (class116.field2131 != -1) {
            class140.field2421 = 0;
            class231.method1558(0, 0, 27733, class208.field3538, -1, 0, class49.field867, 0, class116.field2131);
        }
        if (arg0 > -55) {
            return;
        }
        class111.method710();
        class222.method1401(-66);
        if (class81.field1409) {
            class166.method1026(12777);
        } else if (class108.field2038 != -1) {
            class40.method211(class108.field2038, (byte) -80, class218.field3668);
        }
        if (class22.field389 == 3) {
            for (int var2 = 0; var2 < class140.field2421; var2++) {
                if (class108.field2034[var2]) {
                    class111.method692(class36.field599[var2], class18.field317[var2], class116.field2137[var2], class54.field940[var2], 16711935, 128);
                } else if (class79.field1379[var2]) {
                    class111.method692(class36.field599[var2], class18.field317[var2], class116.field2137[var2], class54.field940[var2], 16711680, 128);
                }
            }
        }
        class131.method809(class64.field1171, class85.field1481, class216.field3639.field50, 0, class216.field3639.field99);
        class85.field1481 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lei;")
    public static final class228 method136(int arg0, int arg1) {
        field439++;
        class228 var2 = (class228) class2.field29.method1037(87, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field784.method884(arg1, -111, 26);
        class228 var4 = new class228();
        if (var3 != null) {
            var4.method1538(new class226(var3), (byte) -108);
        }
        class2.field29.method1032(-810, var4, (long) arg1);
        return arg0 == 12 ? var4 : null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Lta;")
    public static final class105 method137(int arg0, int arg1) {
        field443++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class102.field1792[var2] == null || class102.field1792[var2][var3] == null) {
            boolean var4 = class195.method1234(var2, (byte) -23);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != -954490064) {
            field441 = null;
        }
        return class102.field1792[var2][var3];
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static void method138(int arg0) {
        field441 = null;
        field450 = null;
        field449 = null;
        field445 = null;
        field448 = null;
        field438 = null;
        field446 = null;
        if (arg0 == 235) {
            field444 = null;
            field447 = null;
        }
    }
}
