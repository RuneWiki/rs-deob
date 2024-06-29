import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class387 extends class29 {

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "Z")
    public volatile boolean field5650 = true;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "Ljn;")
    public static class409 field5655 = new class409("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "Lvq;")
    public static class24 field5658 = new class24(37, 6);

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "Ljn;")
    public static class409 field5660 = new class409("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "Z")
    public boolean field5649;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "Z")
    public boolean field5654;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "[I")
    public static int[] field5659;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "[[I")
    public static int[][] field5661;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V", line = 3)
    public static void method2442(int arg0) {
        if (arg0 != 1) {
            field5661 = null;
        }
        field5659 = null;
        field5658 = null;
        field5655 = null;
        field5660 = null;
        field5661 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method2443(int arg0, boolean arg1) {
        if (arg0 != -1066) {
            return;
        }
        field5656++;
        for (class138 var2 = (class138) class208.field2940.method2478(1603); var2 != null; var2 = (class138) class208.field2940.method2486((byte) -82)) {
            if (var2.field1898 != null) {
                class452.field6671.method278(var2.field1898);
                var2.field1898 = null;
            }
            if (var2.field1886 != null) {
                class452.field6671.method278(var2.field1886);
                var2.field1886 = null;
            }
            var2.method1820(-25246);
        }
        if (!arg1) {
            return;
        }
        for (class138 var3 = (class138) class422.field6101.method2478(1603); var3 != null; var3 = (class138) class422.field6101.method2486((byte) -82)) {
            if (var3.field1898 != null) {
                class452.field6671.method278(var3.field1898);
                var3.field1898 = null;
            }
            var3.method1820(-25246);
        }
        for (class138 var4 = (class138) class381.field5600.method608((byte) 120); var4 != null; var4 = (class138) class381.field5600.method604(-89)) {
            if (var4.field1898 != null) {
                class452.field6671.method278(var4.field1898);
                var4.field1898 = null;
            }
            var4.method1820(-25246);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)V", line = 87)
    public static final void method2444(int arg0, int arg1) {
        if (arg1 >= -108) {
            method2442(16);
        }
        class236.field3525 = arg0;
        field5653++;
        class363 var2 = class148.field2017;
        synchronized (class148.field2017) {
            class148.field2017.method2313(116);
        }
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)V", line = 104)
    public static final void method2445(int arg0) {
        field5651++;
        if (arg0 != -22716) {
            field5658 = null;
        }
        class101 var1 = null;
        try {
            class350 var2 = class267.field3963.method2200(2);
            while (var2.field5134 == 0) {
                class418.method2587(false, 1L);
            }
            if (var2.field5134 == 1) {
                var1 = (class101) var2.field5129;
                class256 var3 = new class256((class317.field4635 * 6) + 3);
                var3.method1727(-128, 1);
                var3.method1750((byte) 0, class317.field4635);
                for (int var4 = 0; var4 < class447.field6540.length; var4++) {
                    if (class36.field512[var4]) {
                        var3.method1750((byte) 0, var4);
                        var3.method1721(25153, class447.field6540[var4]);
                    }
                }
                var1.method684(0, var3.field3762, 12, var3.field3764);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method681((byte) 65);
            }
        } catch (Exception var5) {
        }
        class265.field3923 = class43.method364(-16756);
        class270.field4008 = false;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V", line = 166)
    public static final void method2446(int arg0, int arg1) {
        field5652++;
        if (arg0 != 18234) {
            field5660 = null;
        }
        class57.field701 = arg1;
        class443.field6436.method2313(123);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIII)V", line = 180)
    public static final void method2447(byte arg0, int arg1, int arg2, int arg3) {
        field5657++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        int var5 = -50 % ((84 - arg0) / 35);
        System.out.println(var4);
        class451.method2804(-109, true, var4);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)[B")
    public abstract byte[] method430(byte arg0);

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)I")
    public abstract int method434(int arg0);
}
