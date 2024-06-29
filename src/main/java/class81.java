import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    private int field1380 = 0;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lt;")
    private class239 field1378;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[I")
    public static int[] field1376 = new int[2000];

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lbe;")
    public static class283 field1375 = class153.method941(126, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Luk;")
    private class86 field1379;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 8)
    public static final void method526(int arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
        field1374++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Luk;", line = 19)
    public final class86 method527(int arg0) {
        field1373++;
        if (arg0 > ~this.field1380 && this.field1378.field4042[this.field1380 - 1] != this.field1379) {
            class86 var2 = this.field1379;
            this.field1379 = var2.field1453;
            return var2;
        }
        class86 var3;
        do {
            if (this.field1380 >= this.field1378.field4044) {
                return null;
            }
            var3 = this.field1378.field4042[this.field1380++].field1453;
        } while (this.field1378.field4042[this.field1380 - 1] == var3);
        this.field1379 = var3.field1453;
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIZI)V", line = 50)
    public static final void method528(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1381++;
        class311.method2114(arg4, arg2, arg0 + arg4, arg1 + arg2);
        class311.method2116(arg4, arg2, arg0, arg1, 0);
        if (class23.field349 < 100) {
            return;
        }
        if (class12.field107 == null || class12.field107.field1828 != arg0 || class12.field107.field1821 != arg1) {
            class204 var5 = new class204(arg0, arg1);
            class78.method512(var5.field3484, arg0, arg1);
            class190.method1238(0, 0, 0, class77.field1345, class134.field2254, arg1, (byte) -111, 0, arg0);
            class12.field107 = new class266(var5);
            class78.field1357 = null;
        }
        class12.field107.method708(arg4, arg2);
        int var6 = arg2 + (class90.field1525 * arg1 / class134.field2254);
        int var7 = class138.field2301 * arg0 / class77.field1345;
        int var8 = class117.field1977 * arg0 / class77.field1345 + arg4;
        int var9 = class46.field622 * arg1 / class134.field2254;
        if (!arg3) {
            field1376 = (int[]) null;
        }
        class311.method2112(var8, var6, var7, var9, 16711680, 128);
        class311.method2113(var8, var6, var7, var9, 16711680);
        if (class222.field3731 <= 0 || (class222.field3731 % 10) >= 5) {
            return;
        }
        for (class292 var10 = (class292) class48.field659.method1812((byte) 4); var10 != null; var10 = (class292) class48.field659.method1813((byte) 71)) {
            if (class290.field4915 == var10.field4948) {
                int var11 = var10.field4950 * arg0 / class77.field1345 + arg4;
                int var12 = var10.field4951 * arg1 / class134.field2254 + arg2;
                class311.method2116(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)[F", line = 126)
    public static final float[] method529(int arg0) {
        float var1 = class59.method383() + class59.method391();
        field1382++;
        int var2 = class59.method385();
        class89.field1510[3] = 1.0F;
        if (arg0 != -21663) {
            return (float[]) null;
        }
        float var3 = (float) ((var2 & 0xFF8F2C) >> 16) / 255.0F;
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        float var5 = (float) ((var2 & 0xFFBE) >> 8) / 255.0F;
        float var6 = 0.58823526F;
        class89.field1510[0] = class54.field727[0] * var3 * var6 * var1;
        class89.field1510[1] = class54.field727[1] * var5 * var6 * var1;
        class89.field1510[2] = class54.field727[2] * var4 * var6 * var1;
        return class89.field1510;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Luk;", line = 162)
    public final class86 method530(int arg0) {
        if (arg0 != -10664) {
            field1375 = (class283) null;
        }
        field1377++;
        this.field1380 = 0;
        return this.method527(-1);
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 178)
    public static void method531(int arg0) {
        field1376 = null;
        field1375 = null;
        if (arg0 >= -101) {
            field1375 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILgf;IJZ)Z", line = 190)
    public static final boolean method532(int arg0, int arg1, int arg2, int arg3, int arg4, class7 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class208.method1381(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lt;)V", line = 227)
    public class81(class239 arg0) {
        this.field1378 = arg0;
    }
}
