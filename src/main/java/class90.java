import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class90 extends class67 {

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Li;")
    public static class88 field1710 = class208.method1425(105, "Standort");

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
    public static int[] field1711 = new int[99];

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1715 = -1;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lnb;")
    public static class144 field1705;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lq;")
    public static class174 field1707;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lud;")
    public class222 field1714;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lbj;")
    public class22 field1703;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
    public static boolean field1708;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
    public byte[] field1706;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public static final void method657(int arg0, int arg1, int arg2) {
        field1713++;
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg0;
        var3[0] = arg1;
        int var6 = 0;
        if (arg2 != -8902) {
            field1708 = false;
        }
        while (var6 < 4) {
            if (class27.field461[var6] != arg0) {
                var5[var4] = class27.field461[var6];
                var3[var4] = class89.field1687[var6];
                var4++;
            }
            var6++;
        }
        class89.field1687 = var3;
        class27.field461 = var5;
        class167.method1145(0, class202.field3847, 1, class202.field3847.length - 1);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static void method658(boolean arg0) {
        field1711 = null;
        field1707 = null;
        field1705 = null;
        if (!arg0) {
            method657(-65, 41, -96);
        }
        field1710 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BB)V")
    public static final void method659(byte[] arg0, byte arg1) {
        class46 var2 = new class46(arg0);
        int var3 = var2.method301(61);
        int var4 = 0;
        if (arg1 > -22) {
            method657(21, 72, -49);
        }
        while (var3 > var4) {
            class244 var5 = new class244();
            class88 var6 = var2.method298(-125);
            var5.field4485 = var2.method301(56);
            var5.field4487 = var2.method301(36);
            var5.field4494 = var2.method347(26119);
            var5.field4488 = var6.method626(47, true, 32);
            var5.field4492 = var6.method600((byte) 107, 47);
            class159.field3051.method1624(var5, 57);
            var4++;
        }
        field1701++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public static final void method660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 75) {
            field1711 = null;
        }
        if (class49.field919 <= arg1 && arg1 <= class18.field279) {
            int var5 = class156.method1060(class67.field1207, class12.field183, -102, arg3);
            int var6 = class156.method1060(class67.field1207, class12.field183, -105, arg0);
            class46.method310(arg1, var6, var5, (byte) 84, arg2);
        }
        field1704++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1711[var1] = var0 / 4;
        }
    }
}
