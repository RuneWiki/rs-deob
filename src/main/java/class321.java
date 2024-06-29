import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class321 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5606 = Calendar.getInstance();

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lud;")
    public static class279 field5611 = class130.method1024(" loggt sich ein)3", 255);

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lud;")
    private static class279 field5615 = class130.method1024("Loaded fonts", 255);

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5612 = -1;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5610 = 0;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lud;")
    public static class279 field5613 = field5615;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lud;")
    public static class279 field5616 = null;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static int[] field5605;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lud;B)I", line = 4)
    public static final int method2257(class279 arg0, byte arg1) {
        field5609++;
        if (arg1 >= -104) {
            return -123;
        } else if (class62.field1274 == null || arg0.method1984(8) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class62.field1274.field2429; var2++) {
                if (class62.field1274.field2438[var2].method2007((byte) -117, class311.field5506, class96.field1787).method1990((byte) 72, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lud;ZB)V", line = 47)
    public static final void method2258(class279 arg0, boolean arg1, byte arg2) {
        field5604++;
        byte var3 = 4;
        int var4 = var3 + 6;
        if (arg2 >= -37) {
            return;
        }
        int var5 = var3 + 6;
        int var6 = class133.field2428.method405(arg0, 250);
        int var7 = class133.field2428.method413(arg0, 250) * 13;
        if (class97.field1824) {
            class256.method1827(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
            class256.method1839(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class146.method1110(var4 - var3, var5 - var3, var3 + var6 + var3, var7 - (-var3 + -var3), 0);
            class146.method1124(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - (-var3 - var3), 16777215);
        }
        class133.field2428.method410(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class35.method311(var3 + var7 + var3, var6 - -var3 + var3, var4 - var3, var5 - var3, 32);
        if (!arg1) {
            class33.method298(var4, var5, (byte) 99, var6, var7);
        } else if (class97.field1824) {
            class97.method823();
        } else {
            try {
                Graphics var8 = class132.field2419.getGraphics();
                class250.field4455.method541(var8, -91, 0, 0);
            } catch (Exception var10) {
                class132.field2419.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIILcn;)Z", line = 103)
    public static final boolean method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class264 arg6) {
        field5608++;
        class142 var7 = class85.method735((byte) 84, arg6.field4708);
        if (var7.field2576 == -1) {
            return true;
        }
        int var9;
        if (arg6.field4695) {
            int var8 = arg6.field4743 + arg5;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class158 var10 = var7.method1089(110, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg6.field4766;
        int var12 = var10.field1036;
        int var13 = var10.field1033;
        int var14 = arg6.field4733;
        if ((var9 & 0x1) == 1) {
            var11 = arg6.field4733;
            var14 = arg6.field4766;
        }
        if (var7.field2574) {
            var13 = var14 * 4;
            var12 = var11 * 4;
        }
        if (arg1 < 83) {
            field5613 = (class279) null;
        }
        if (var7.field2581 == 0) {
            var10.method1247((arg4 * 4) + 48, 48 - -((-arg0 + -var14 + 104) * 4), var12, var13);
        } else {
            var10.method1241(arg4 * 4 + 48, (-var14 + 104 + -arg0) * 4 + 48, var12, var13, var7.field2581);
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lql;", line = 161)
    public static final class17 method2260(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class17 var4 = var3.field3439;
            var3.field3439 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 182)
    public static void method2261(int arg0) {
        field5613 = null;
        field5605 = null;
        field5606 = null;
        if (arg0 < -59) {
            field5611 = null;
            field5616 = null;
            field5615 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 200)
    public static final void method2262(int arg0) {
        if (arg0 != -17958) {
            field5612 = 88;
        }
        field5603++;
        class222.field3928.method1338((byte) -121);
        class173.field3125.method1338((byte) -114);
        class301.field5356.method1338((byte) -113);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Lgf;I)V", line = 214)
    public static final void method2263(int arg0, class8[] arg1, int arg2) {
        if (arg2 != -2) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class8 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field201 == 0) {
                    if (var4.field159 != null) {
                        method2263(arg0, var4.field159, -2);
                    }
                    class176 var5 = (class176) class226.field3977.method610((long) var4.field299, -1);
                    if (var5 != null) {
                        class111.method909(var5.field3165, (byte) 127, arg0);
                    }
                }
                if (arg0 == 0 && var4.field219 != null) {
                    class23 var6 = new class23();
                    var6.field596 = var4;
                    var6.field608 = var4.field219;
                    class279.method2017(0, var6);
                }
                if (arg0 == 1 && var4.field210 != null) {
                    if (var4.field261 >= 0) {
                        class8 var7 = class273.method1940(var4.field299, 122);
                        if (var7 == null || var7.field159 == null || var4.field261 >= var7.field159.length || var7.field159[var4.field261] != var4) {
                            continue;
                        }
                    }
                    class23 var8 = new class23();
                    var8.field596 = var4;
                    var8.field608 = var4.field210;
                    class279.method2017(0, var8);
                }
            }
        }
        field5607++;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V", line = 308)
    public static final void method2264(int arg0, int arg1, int arg2) {
        class322.field5625 = true;
        class150.field2748 = arg0;
        class26.field635 = arg1;
        class192.field3472 = arg2;
        class289.field5146 = -1;
        class276.field4889 = -1;
    }
}
