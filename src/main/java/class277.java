import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class277 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[Lui;")
    public static class61[] field3966 = new class61[50];

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Z")
    public static boolean field3974 = true;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lfh;")
    public static class140 field3973;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient;")
    public static client field3969;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[[B")
    public static byte[][] field3972;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[[I")
    public static int[][] field3967;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 6)
    public static void method1871(int arg0) {
        field3966 = null;
        field3972 = (byte[][]) null;
        if (arg0 == 27440) {
            field3967 = (int[][]) null;
            field3969 = null;
            field3973 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V", line = 20)
    public static final void method1872(boolean arg0, int arg1) {
        if (arg0) {
            method1875(-109, 39);
        }
        field3975++;
        class323.field4744 = -1;
        class323.field4744 = -1;
        class35.field428 = arg1;
        class144.method1122((byte) 51);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1873(int arg0, int arg1) {
        field3965++;
        class42 var2 = class166.method1242(arg1, arg0, arg1 ^ 0xB58CAEEB);
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 50)
    public static final void method1874(int arg0) {
        int var1 = class240.field3490.method1311(8, 7);
        field3971++;
        if (arg0 != -16097) {
            return;
        }
        if (class112.field1441 > var1) {
            for (int var2 = var1; var2 < class112.field1441; var2++) {
                class341.field5322[class296.field4301++] = class288.field4157[var2];
            }
        }
        if (var1 > class112.field1441) {
            throw new RuntimeException("gppov1");
        }
        class112.field1441 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class288.field4157[var3];
            class239 var5 = class311.field4574[var4];
            int var6 = class240.field3490.method1311(1, arg0 ^ 0xFFFFC118);
            if (var6 == 0) {
                class288.field4157[class112.field1441++] = var4;
                var5.field4875 = class313.field4603;
            } else {
                int var7 = class240.field3490.method1311(2, 7);
                if (var7 == 0) {
                    class288.field4157[class112.field1441++] = var4;
                    var5.field4875 = class313.field4603;
                    class35.field430[class318.field4689++] = var4;
                } else if (var7 == 1) {
                    class288.field4157[class112.field1441++] = var4;
                    var5.field4875 = class313.field4603;
                    int var12 = class240.field3490.method1311(3, 7);
                    var5.method2296(var12, -24892, 1);
                    int var13 = class240.field3490.method1311(1, 7);
                    if (var13 == 1) {
                        class35.field430[class318.field4689++] = var4;
                    }
                } else if (var7 == 2) {
                    class288.field4157[class112.field1441++] = var4;
                    var5.field4875 = class313.field4603;
                    if (class240.field3490.method1311(1, 7) == 1) {
                        int var8 = class240.field3490.method1311(3, 7);
                        var5.method2296(var8, arg0 ^ 0x5FDB, 2);
                        int var9 = class240.field3490.method1311(3, 7);
                        var5.method2296(var9, -24892, 2);
                    } else {
                        int var10 = class240.field3490.method1311(3, arg0 ^ 0xFFFFC118);
                        var5.method2296(var10, -24892, 0);
                    }
                    int var11 = class240.field3490.method1311(1, 7);
                    if (var11 == 1) {
                        class35.field430[class318.field4689++] = var4;
                    }
                } else if (var7 == 3) {
                    class341.field5322[class296.field4301++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V", line = 175)
    public static final void method1875(int arg0, int arg1) {
        class223 var2 = (class223) class240.field3489.method2279((long) arg1, 85);
        field3970++;
        if (var2 == null) {
            return;
        }
        if (arg0 <= 79) {
            method1873(37, -50);
        }
        for (int var3 = 0; var3 < var2.field3216.length; var3++) {
            var2.field3216[var3] = -1;
            var2.field3217[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Z", line = 203)
    public static final boolean method1876(byte arg0, int arg1) {
        int var2 = 111 / ((-arg0 - 2) / 56);
        field3964++;
        return (arg1 & -arg1) == arg1;
    }
}
