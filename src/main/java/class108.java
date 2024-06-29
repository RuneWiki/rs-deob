import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class108 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[Lwj;")
    public static class130[] field1463;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method676(int arg0) {
        if (arg0 != -3) {
            field1459 = 0;
        }
        field1463 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1462++;
        int var7 = class22.method134(class286.field4431, 14949, arg0, class230.field3302);
        int var8 = class22.method134(class286.field4431, 14949, arg1, class230.field3302);
        int var9 = class22.method134(class177.field2514, 14949, arg6, class279.field4238);
        int var10 = class22.method134(class177.field2514, 14949, arg3, class279.field4238);
        int var11 = class22.method134(class286.field4431, 14949, arg0 + arg5, class230.field3302);
        int var12 = class22.method134(class286.field4431, 14949, arg1 - arg5, class230.field3302);
        if (arg4 > -66) {
            method676(-72);
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class76.method463(var9, 0, arg2, var10, class268.field3919[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class76.method463(var9, 0, arg2, var10, class268.field3919[var14]);
        }
        int var15 = class22.method134(class177.field2514, 14949, arg6 + arg5, class279.field4238);
        int var16 = class22.method134(class177.field2514, 14949, arg3 - arg5, class279.field4238);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class268.field3919[var17];
            class76.method463(var9, 0, arg2, var15, var18);
            class76.method463(var16, 0, arg2, var10, var18);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lnc;")
    public static final class243 method678(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1934; var4++) {
            class243 var5 = var3.field1930[var4];
            if ((var5.field3539 >> 29 & 0x3L) == 2L && var5.field3540 == arg1 && var5.field3527 == arg2) {
                class133.method869(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
    public static final void method679(int arg0, int arg1, int arg2) {
        if (class4.field61 == 2) {
            class280.field4246 = arg0;
            class138.field2010 = arg1;
        }
        class274.field4085 = (float) arg1;
        class159.field2310 = (float) arg0;
        class12.method79((byte) 44);
        class200.field2855 = true;
        field1461++;
        int var3 = -124 / ((11 - arg2) / 56);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method680(int arg0, int arg1) {
        if (arg1 != -3) {
            field1459 = 74;
        }
        field1460++;
        if (arg0 == 100 && class286.field4433 > 0) {
            byte[] var2 = class101.field1373[--class286.field4433];
            class101.field1373[class286.field4433] = null;
            return var2;
        } else if (arg0 == 5000 && class247.field3586 > 0) {
            byte[] var3 = class172.field2459[--class247.field3586];
            class172.field2459[class247.field3586] = null;
            return var3;
        } else if (arg0 == 30000 && class226.field3191 > 0) {
            byte[] var4 = class138.field2014[--class226.field3191];
            class138.field2014[class226.field3191] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
