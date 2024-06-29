import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class401 extends class299 {

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "B")
    public byte field5625 = 5;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field5626 = 0;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[Llf;")
    public static class130[] field5631 = new class130[2048];

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field5627;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public int field5634;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public int field5638;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lml;")
    public static class219 field5628;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[[[Lls;")
    public static class74[][][] field5633;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method2512(int arg0) {
        field5628 = null;
        field5633 = null;
        field5631 = null;
        if (arg0 != 0) {
            method2515((byte) 18, 12);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static final void method2513(int arg0) {
        field5635++;
        if (arg0 == -23972) {
            class180.field2543.method1382((byte) 47);
            class408.field5788.method1382((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lvq;)V")
    public static final void method2514(class269 arg0) {
        for (int var1 = class180.field2546; var1 < class243.field3603; var1++) {
            for (int var2 = 0; var2 < class394.field5548; var2++) {
                for (int var3 = 0; var3 < class407.field5751; var3++) {
                    class74 var4 = class385.field5449[var1][var2][var3];
                    if (var4 != null) {
                        class120 var5 = var4.field975;
                        class120 var6 = var4.field977;
                        if (var5 != null && var5.method610(-439)) {
                            class183.method1313(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method610(-439)) {
                                class183.method1313(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method611(arg0, false, var5, 0, 0, (byte) -128, 0);
                                var6.method613((byte) -84);
                            }
                            var5.method613((byte) -59);
                        }
                        for (class353 var7 = var4.field970; var7 != null; var7 = var7.field5127) {
                            class306 var9 = var7.field5125;
                            if (var9 != null && var9.method610(-439)) {
                                class183.method1313(arg0, var9, var1, var2, var3, var9.field4460 + 1 - var9.field4465, var9.field4471 - var9.field4462 + 1);
                                var9.method613((byte) -59);
                            }
                        }
                        class16 var8 = var4.field969;
                        if (var8 != null && var8.method610(-439)) {
                            class120.method736(arg0, var8, var1, var2, var3);
                            var8.method613((byte) -70);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
    public static final void method2515(byte arg0, int arg1) {
        field5637++;
        class15 var2 = class241.field3562;
        synchronized (class241.field3562) {
            class241.field3562.method91(arg0 ^ 0x1, arg1);
        }
        if (arg0 != 5) {
            method2514((class269) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZII)V")
    public static final void method2516(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class10.field129; var5++) {
            Rectangle var6 = class85.field1086[var5];
            if (arg0 < (var6.x + var6.width) && var6.x < (arg0 + arg1) && arg3 < var6.y + var6.height && var6.y < arg3 + arg4) {
                class336.field4875[var5] = true;
            }
        }
        if (arg2) {
            method2513(-80);
        }
        field5629++;
    }
}
