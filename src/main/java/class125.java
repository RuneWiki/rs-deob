import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class125 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[Lfd;")
    public static class58[] field1793 = new class58[14];

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1796 = -1;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method812(int arg0) {
        if (arg0 != -5346) {
            field1796 = -25;
        }
        field1793 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lbc;I)V")
    public static final void method813(class282 arg0, int arg1) {
        field1792++;
        class215.field3001 = arg0;
        if (arg1 != -6202) {
            method813((class282) null, 32);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg3 < 57) {
            field1793 = null;
        }
        int var6 = -1;
        field1795++;
        int var7 = arg0;
        int var8 = -arg0;
        int var9 = class22.method134(class177.field2514, 14949, arg0 + arg2, class279.field4238);
        int var10 = class22.method134(class177.field2514, 14949, arg2 - arg0, class279.field4238);
        class76.method463(var10, 0, arg4, var9, class268.field3919[arg1]);
        while (var5 < var7) {
            var6 += 2;
            var8 += var6;
            if (var8 > 0) {
                var7--;
                var8 -= var7 << 1;
                int var11 = arg1 - var7;
                int var12 = arg1 + var7;
                if (var12 >= class286.field4431 && var11 <= class230.field3302) {
                    int var13 = class22.method134(class177.field2514, 14949, arg2 + var5, class279.field4238);
                    int var14 = class22.method134(class177.field2514, 14949, arg2 - var5, class279.field4238);
                    if (class230.field3302 >= var12) {
                        class76.method463(var14, 0, arg4, var13, class268.field3919[var12]);
                    }
                    if (class286.field4431 <= var11) {
                        class76.method463(var14, 0, arg4, var13, class268.field3919[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg1 + var5;
            int var16 = arg1 - var5;
            if (var15 >= class286.field4431 && var16 <= class230.field3302) {
                int var17 = class22.method134(class177.field2514, 14949, arg2 + var7, class279.field4238);
                int var18 = class22.method134(class177.field2514, 14949, arg2 - var7, class279.field4238);
                if (class230.field3302 >= var15) {
                    class76.method463(var18, 0, arg4, var17, class268.field3919[var15]);
                }
                if (class286.field4431 <= var16) {
                    class76.method463(var18, 0, arg4, var17, class268.field3919[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
    public static final void method815(boolean arg0, int arg1) {
        class71.field840.method62(-87, arg1);
        if (arg0) {
            class166.field2382.method62(-121, arg1);
            field1794++;
        }
    }
}
