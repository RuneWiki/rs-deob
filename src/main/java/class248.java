import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class248 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "[I")
    private int[] field3607;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3615 = "wave:";

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[Lrj;")
    public static class274[] field3616 = new class274[14];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lse;")
    public static class89 field3614;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[Lwj;")
    public static class130[] field3606;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[[[B")
    public static byte[][][] field3612;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1597(int arg0) {
        String var1;
        if (class196.field2790 == 1 && class112.field1496 < 2) {
            var1 = class26.field314 + class41.field502 + class107.field1444 + " ->";
        } else if (class267.field3857 && class112.field1496 < 2) {
            var1 = class133.field1945 + class41.field502 + class48.field560 + " ->";
        } else if (class32.field380 && class260.field3784[81] && class112.field1496 > 2) {
            var1 = class59.method368(class112.field1496 - 2, (byte) -128);
        } else {
            var1 = class59.method368(class112.field1496 - 1, (byte) -128);
        }
        if (arg0 > ~class112.field1496) {
            var1 = var1 + "<col=ffffff> / " + (class112.field1496 - 2) + class241.field3510;
        }
        field3609++;
        return var1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbc;ZLbc;)V")
    public static final void method1598(class282 arg0, boolean arg1, class282 arg2) {
        if (arg1) {
            method1602(102);
        }
        class11.field141 = class237.method1545((byte) -61, class2.field32, arg2, arg0, 0);
        class123.field1762 = (class111) class11.field141;
        class204.field2904 = class237.method1545((byte) -124, class26.field316, arg2, arg0, 0);
        field3614 = class237.method1545((byte) -105, class166.field2385, arg2, arg0, 0);
        field3610++;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V")
    public class248(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3607 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3607[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3607[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3607[var5 + var5] = arg0[var4];
            this.field3607[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 > -108) {
            field3614 = null;
        }
        field3615 = null;
        field3616 = null;
        field3606 = null;
        field3614 = null;
        field3612 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    public final int method1600(int arg0, byte arg1) {
        int var3 = (this.field3607.length >> 1) - 1;
        field3613++;
        if (arg1 >= -10) {
            field3606 = null;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field3607[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3607[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1601(boolean arg0, int arg1, String arg2) {
        class94.field1259.method592(135, arg0);
        class94.field1259.method1403(-115, arg1);
        class279.field4241++;
        class94.field1259.method1360(class60.method370((byte) -8, arg2), 96);
        if (!arg0) {
            field3608++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method1602(int arg0) {
        if (arg0 > -51) {
            method1602(59);
        }
        field3605++;
        class286.field4428.method71(-98);
        class198.field2817.method71(-118);
        class124.field1785.method71(-67);
    }
}
