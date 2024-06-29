import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class171 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lkb;")
    public static class93 field3387 = class76.method390("<col=40ff00>", 0);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[Lkb;")
    public static class93[] field3391 = new class93[500];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Z")
    public static boolean field3393 = false;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field3394 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lnb;")
    public static class120 field3392 = new class120(64);

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lkb;")
    public static class93 field3396 = class76.method390("blinken1:", 0);

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lnd;")
    public static class122 field3395 = new class122();

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[I")
    public static int[] field3397 = new int[1000];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([Lqf;IILog;[BI)V")
    public static final void method1143(class151[] arg0, int arg1, int arg2, class134 arg3, byte[] arg4, int arg5) {
        field3390++;
        int var6 = -1;
        class158 var7 = new class158(arg4);
        if (arg5 != -104) {
            method1144(null, (byte) 69);
        }
        while (true) {
            int var8 = var7.method1072(-25182);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method1072(-25182);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method1054(128);
                int var15 = var14 >> 2;
                int var16 = arg1 + var11;
                int var17 = arg2 + var12;
                int var18 = var14 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class151 var19 = null;
                    int var20 = var13;
                    if ((class136.field2637[1][var16][var17] & 0x2) == 2) {
                        var20 = var13 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg0[var20];
                    }
                    class34.method188(var18, var17, var6, var19, arg3, 70, var16, var15, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljg;B)V")
    public static final void method1144(class89 arg0, byte arg1) {
        field3389++;
        if (arg1 > -10) {
            field3387 = null;
        }
        class165.field3257 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1145(byte arg0) {
        field3387 = null;
        field3397 = null;
        field3394 = null;
        int var1 = -71 / ((arg0 - 17) / 55);
        field3392 = null;
        field3395 = null;
        field3391 = null;
        field3396 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)J")
    public static final synchronized long method1146(byte arg0) {
        field3388++;
        long var1 = System.currentTimeMillis();
        if (class6.field108 > var1) {
            class167.field3332 += class6.field108 - var1;
        }
        class6.field108 = var1;
        int var3 = 92 / ((66 - arg0) / 42);
        return class167.field3332 + var1;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public static final void method1147(byte arg0) {
        class71.field1310.method676(30626);
        int var1 = 35 / ((arg0 + 50) / 37);
        field3386++;
        class112.field2086.method676(30626);
    }
}
