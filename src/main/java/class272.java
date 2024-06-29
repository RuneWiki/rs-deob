import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class272 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3454;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
    public static int[] field3455;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 4)
    public static void method1674(int arg0) {
        field3454 = null;
        field3455 = null;
        if (arg0 != 2) {
            method1676(-63);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1675(int arg0, int arg1) {
        if (arg1 <= 2) {
            field3455 = null;
        }
        field3456++;
        class436 var2 = class459.method2712(7, arg0, -1759243680);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Lil;", line = 29)
    public static final class47 method1676(int arg0) {
        field3458++;
        if (arg0 != 2) {
            return null;
        }
        try {
            return (class47) Class.forName("lo").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Lvg;", line = 46)
    public static final class55 method1677(int arg0, int arg1) {
        int var2 = -56 % ((arg1 - 9) / 52);
        field3460++;
        class55[] var3 = class377.method2201(24);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class55 var5 = var3[var4];
            if (var5.field746 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V", line = 78)
    public static final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3459++;
        int var5 = 0;
        int var6 = arg0;
        if (arg4 != 563866657) {
            method1674(-68);
        }
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class141.method970(arg0 + arg1, class281.field3589, 1150002076, class65.field827);
        int var10 = class141.method970(arg1 - arg0, class281.field3589, 1150002076, class65.field827);
        class183.method1212(arg3, class333.field4265[arg2], true, var10, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class418.field5559 <= var12 && var11 <= class456.field6365) {
                    int var13 = class141.method970(arg1 + var5, class281.field3589, 1150002076, class65.field827);
                    int var14 = class141.method970(arg1 - var5, class281.field3589, 1150002076, class65.field827);
                    if (class456.field6365 >= var12) {
                        class183.method1212(arg3, class333.field4265[var12], true, var14, var13);
                    }
                    if (var11 >= class418.field5559) {
                        class183.method1212(arg3, class333.field4265[var11], true, var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class418.field5559 && var15 <= class456.field6365) {
                int var17 = class141.method970(arg1 + var6, class281.field3589, 1150002076, class65.field827);
                int var18 = class141.method970(arg1 - var6, class281.field3589, arg4 + 586135419, class65.field827);
                if (class456.field6365 >= var16) {
                    class183.method1212(arg3, class333.field4265[var16], true, var18, var17);
                }
                if (class418.field5559 <= var15) {
                    class183.method1212(arg3, class333.field4265[var15], true, var18, var17);
                }
            }
        }
    }
}
