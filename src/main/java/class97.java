import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class97 extends class349 {

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    private int field1765;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[I")
    public static int[] field1768 = new int[14];

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lsf;")
    public static class124 field1764 = new class124(5);

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lek;")
    public static class206 field1769;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILg;)I", line = 7)
    public static final int method738(int arg0, int arg1, class181 arg2) {
        field1767++;
        if (arg1 != 14001) {
            field1772 = 19;
        }
        if (!client.method1990(arg2).method2397(arg0, -92) && arg2.field3016 == null) {
            return -1;
        } else if (arg2.field3042 == null || arg2.field3042.length <= arg0) {
            return -1;
        } else {
            return arg2.field3042[arg0];
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIII)V", line = 24)
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1762 = arg1;
        this.field1770 = arg2;
        this.field1758 = arg3;
        this.field1765 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 37)
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg0 != 12459) {
            this.method215(-59, 89, 76);
        }
        field1771++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BD)V", line = 49)
    public static final void method739(byte arg0, double arg1) {
        field1763++;
        if (arg0 < 86 || class73.field1330 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class124.field2176[var3] = var4 <= 255 ? var4 : 255;
        }
        class73.field1330 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V", line = 78)
    public static void method740(byte arg0) {
        if (arg0 <= 89) {
            field1761 = 103;
        }
        field1769 = null;
        field1764 = null;
        field1768 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V", line = 92)
    public final void method215(int arg0, int arg1, int arg2) {
        int var4 = this.field1765 * arg2 >> 12;
        if (arg0 != -1664663732) {
            method741((byte) -75, 74L);
        }
        int var5 = this.field1762 * arg1 >> 12;
        int var6 = this.field1770 * arg2 >> 12;
        field1766++;
        int var7 = this.field1758 * arg1 >> 12;
        class140.method967(true, var7, var6, var4, this.field5583, var5);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V", line = 110)
    public final void method213(int arg0, int arg1, int arg2) {
        if (arg2 != 13258) {
            method739((byte) -42, 0.22987239709054122D);
        }
        field1759++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BJ)V", line = 122)
    public static final void method741(byte arg0, long arg1) {
        if (arg0 >= -38) {
            field1764 = (class124) null;
        }
        field1757++;
        if (!class151.field2559) {
            class87.field1523 += (float) arg1 * class335.field5335 / 40.0F;
            class354.field5652 += (float) arg1 * class336.field5344 / 40.0F;
        }
        int var3 = class250.field4114;
        if (class33.field724 != var3) {
            int var4 = var3 - class33.field724;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class33.field724 += var5;
        }
        int var6 = class212.field3511;
        if (class244.field4052 != var6) {
            int var7 = var6 - class244.field4052;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class244.field4052 += var8;
        }
        class212.method1460(true);
    }
}
