import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class83 extends class66 {

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Lvq;")
    public static class24 field1016 = new class24(12, 10);

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "Lbt;")
    public static class363 field1019 = new class363(500);

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lvq;")
    public static class24 field1021 = new class24(100, -1);

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
    public static int[] field1023 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lae;")
    public static class285 field1022;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Lfp;)V")
    public static final void method552(class9 arg0) {
        for (int var1 = class440.field6411; var1 < class204.field2870; var1++) {
            for (int var2 = 0; var2 < class329.field4899; var2++) {
                for (int var3 = 0; var3 < class380.field5590; var3++) {
                    class369 var4 = class178.field2530[var1][var2][var3];
                    if (var4 != null) {
                        class422 var5 = var4.field5335;
                        class422 var6 = var4.field5332;
                        if (var5 != null && var5.method34((byte) -114)) {
                            class400.method2499(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method34((byte) 59)) {
                                class400.method2499(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method32(arg0, var5, false, 0, 0, -110, 0);
                                var6.method33(114);
                            }
                            var5.method33(117);
                        }
                        for (class206 var7 = var4.field5345; var7 != null; var7 = var7.field2882) {
                            class336 var9 = var7.field2880;
                            if (var9 != null && var9.method34((byte) 82)) {
                                class400.method2499(arg0, var9, var1, var2, var3, var9.field4957 + 1 - var9.field4961, var9.field4950 - var9.field4959 + 1);
                                var9.method33(110);
                            }
                        }
                        class323 var8 = var4.field5346;
                        if (var8 != null && var8.method34((byte) -80)) {
                            class248.method1647(arg0, var8, var1, var2, var3);
                            var8.method33(114);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1019 = null;
        field1023 = null;
        field1021 = null;
        field1022 = null;
        field1016 = null;
        if (arg0 != -11335) {
            field1016 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static final void method554(int arg0) {
        if (arg0 >= -82) {
            method555(44, -91, -19);
        }
        class212.field2993 = -1;
        class241.field3571 = null;
        field1020++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public static final void method555(int arg0, int arg1, int arg2) {
        field1017++;
        if (arg1 != -27690) {
            method557((byte) 78);
        }
        class296 var3 = class99.method653(arg0, -118);
        int var4 = var3.field4311;
        int var5 = var3.field4314;
        int var6 = var3.field4312;
        int var7 = class32.field442[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class15.method210(arg2 << var5 & var8 | ~var8 & class14.field227[var4], var4, 26434);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)Ltp;")
    public static final class196 method556(int arg0, int arg1) {
        field1018++;
        class363 var2 = class148.field2000;
        class196 var3;
        synchronized (class148.field2000) {
            var3 = (class196) class148.field2000.method2310((byte) -126, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class79.field994.method715(class257.method1771(arg0, (byte) -121), (byte) 97, class431.method2649(arg0, -213850777));
        class196 var5 = new class196();
        var5.field2783 = arg0;
        if (arg1 < 63) {
            field1016 = null;
        }
        if (var4 != null) {
            var5.method1363((byte) 115, new class256(var4));
        }
        var5.method1362(2);
        class363 var6 = class148.field2000;
        synchronized (class148.field2000) {
            class148.field2000.method2299(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method557(byte arg0) {
        field1015++;
        class34.field492.method2307(124);
        class318.field4665.method2307(-108);
        if (arg0 != -106) {
            method553(-55);
        }
    }
}
