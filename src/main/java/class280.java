import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class280 extends class135 {

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "[B")
    public byte[] field4434;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field4435 = 0;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4436 = "";

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "J")
    public static long field4439 = 0L;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[S")
    public static short[] field4444 = new short[256];

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
    public class280(byte[] arg0) {
        this.field4434 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method1872(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 871127916) {
            field4435 = 64;
        }
        class214 var5 = class136.method918(arg4, -21154, arg0);
        field4441++;
        if (var5 == null) {
            return;
        }
        if (var5.field3446 != null) {
            class142 var6 = new class142();
            var6.field2087 = arg1;
            var6.field2086 = var5.field3446;
            var6.field2080 = arg3;
            var6.field2079 = var5;
            class202.method1390(var6, (byte) -108);
        }
        boolean var7 = true;
        if (var5.field3390 > 0) {
            var7 = class278.method1863((byte) -113, var5);
        }
        if (!var7 || !client.method1038(var5).method484(arg2 - 871127917, arg3 + -1)) {
            return;
        }
        if (arg3 == 1) {
            class209.field3260++;
            class13.field165.method892(205, (byte) -59);
            class13.field165.method166(arg0, arg2 ^ 0xCC13A491);
            class13.field165.method223(-1720191288, arg4);
        }
        if (arg3 == 2) {
            class115.field1699++;
            class13.field165.method892(174, (byte) -69);
            class13.field165.method166(arg0, -3);
            class13.field165.method223(-1720191288, arg4);
        }
        if (arg3 == 3) {
            class201.field3156++;
            class13.field165.method892(62, (byte) -62);
            class13.field165.method166(arg0, -3);
            class13.field165.method223(arg2 + 1703648092, arg4);
        }
        if (arg3 == 4) {
            class13.field165.method892(165, (byte) -63);
            class13.field165.method166(arg0, -3);
            class13.field165.method223(-1720191288, arg4);
            class158.field2429++;
        }
        if (arg3 == 5) {
            class13.field165.method892(89, (byte) -42);
            class189.field2978++;
            class13.field165.method166(arg0, arg2 - 871127919);
            class13.field165.method223(-1720191288, arg4);
        }
        if (arg3 == 6) {
            class13.field165.method892(50, (byte) -39);
            class13.field165.method166(arg0, -3);
            class13.field165.method223(-1720191288, arg4);
            class117.field1724++;
        }
        if (arg3 == 7) {
            class13.field165.method892(212, (byte) -41);
            class13.field165.method166(arg0, arg2 - 871127919);
            class195.field3068++;
            class13.field165.method223(-1720191288, arg4);
        }
        if (arg3 == 8) {
            class13.field165.method892(189, (byte) -65);
            class153.field2284++;
            class13.field165.method166(arg0, -3);
            class13.field165.method223(-1720191288, arg4);
        }
        if (arg3 == 9) {
            class174.field2727++;
            class13.field165.method892(91, (byte) -72);
            class13.field165.method166(arg0, -3);
            class13.field165.method223(arg2 + 1703648092, arg4);
        }
        if (arg3 == 10) {
            class13.field165.method892(199, (byte) -55);
            class13.field165.method166(arg0, -3);
            class174.field2731++;
            class13.field165.method223(-1720191288, arg4);
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
    public static final void method1873(int arg0) {
        field4440++;
        client.field2315.method1420(-1);
        class206.field3217.method1420(-1);
        if (arg0 <= 97) {
            field4439 = -6L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public static void method1874(int arg0) {
        field4444 = null;
        if (arg0 != 2) {
            method1874(109);
        }
        field4436 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static final void method1875(byte arg0) {
        class67.field931.method1420(-1);
        field4443++;
        if (arg0 != -119) {
            method1873(-19);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -10) {
            return;
        }
        if (arg2 == arg8 && arg0 == arg1 && arg3 == arg7 && arg6 == arg9) {
            class34.method270(arg1, (byte) 48, arg3, arg8, arg4, arg6);
        } else {
            int var10 = arg1;
            int var11 = arg8;
            int var12 = arg1 * 3;
            int var13 = arg8 * 3;
            int var14 = arg2 * 3;
            int var15 = arg0 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = arg3 + var14 - arg8 - var17;
            int var19 = arg6 + var15 - var16 - arg1;
            int var20 = var17 + var13 - var14 - var14;
            int var21 = var12 + var16 - var15 - var15;
            int var22 = var14 - var13;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = (var27 + var31 + var29 >> 12) + arg8;
                int var33 = var23 * var24;
                int var34 = (var28 + var30 + var33 >> 12) + arg1;
                class34.method270(var10, (byte) 102, var32, var11, arg4, var34);
                var10 = var34;
                var11 = var32;
            }
        }
        field4442++;
    }
}
