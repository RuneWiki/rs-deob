import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class105 extends class53 {

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Z")
    public static boolean field1739 = false;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field1741 = -1;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lp;")
    public static class280 field1744 = class18.method140((byte) -127, ")2");

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Lp;")
    public static class280 field1755 = class18.method140((byte) -128, ")4p=");

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Lsb;")
    public static class221 field1750 = new class221(64);

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Lp;")
    public static class280 field1756 = class18.method140((byte) -120, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!c", name = "W", descriptor = "Lp;")
    public static class280 field1757 = class18.method140((byte) -123, "Jeter");

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lp;")
    public class280 field1745;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
    public int[] field1738;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
    public int[] field1740;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
    public int[] field1743;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[I")
    public int[] field1746;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "[I")
    public static int[] field1753;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Llj;II)V")
    private final void method734(class25 arg0, int arg1, int arg2) {
        field1749++;
        int var4 = 81 / ((33 - arg2) / 54);
        if (arg1 == 1) {
            this.field1745 = arg0.method198(false);
        } else if (arg1 == 2) {
            int var8 = arg0.method189((byte) -103);
            this.field1743 = new int[var8];
            this.field1746 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1743[var9] = arg0.method193((byte) 77);
                int var10 = arg0.method189((byte) -103);
                if (var10 == 0) {
                    this.field1746[var9] = -1;
                } else {
                    this.field1746[var9] = var10;
                }
            }
        } else if (arg1 == 3) {
            int var5 = arg0.method189((byte) -103);
            this.field1738 = new int[var5];
            this.field1740 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1740[var6] = arg0.method193((byte) 77);
                int var7 = arg0.method189((byte) -103);
                if (var7 == 0) {
                    this.field1738[var6] = -1;
                } else {
                    this.field1738[var6] = var7;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public final int method735(int arg0, int arg1) {
        field1747++;
        if (this.field1740 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field1740.length; var3++) {
            if (this.field1738[var3] == arg0) {
                return this.field1740[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1752++;
        int var8 = class76.method564(class36.field654, -108, arg5, class249.field4360);
        int var9 = class76.method564(class36.field654, -127, arg2, class249.field4360);
        int var10 = class76.method564(class89.field1440, -113, arg4, class12.field249);
        int var11 = class76.method564(class89.field1440, -124, arg1, class12.field249);
        int var12 = class76.method564(class36.field654, -109, arg3 + arg5, class249.field4360);
        int var13 = class76.method564(class36.field654, -125, arg2 - arg3, class249.field4360);
        for (int var14 = var8; var14 < var12; var14++) {
            class162.method1151(var11, arg7, 99, var10, class91.field1484[var14]);
        }
        if (arg6 > -91) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class162.method1151(var11, arg7, 111, var10, class91.field1484[var15]);
        }
        int var16 = class76.method564(class89.field1440, -111, arg3 + arg4, class12.field249);
        int var17 = class76.method564(class89.field1440, -120, arg1 - arg3, class12.field249);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class91.field1484[var18];
            class162.method1151(var16, arg7, -94, var10, var19);
            class162.method1151(var17, arg0, 16, var16, var19);
            class162.method1151(var11, arg7, 108, var17, var19);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
    public final int method737(int arg0, int arg1) {
        field1742++;
        if (this.field1743 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1743.length; var3++) {
            if (this.field1746[var3] == arg0) {
                return this.field1743[var3];
            }
        }
        return arg1 == -20736 ? -1 : -121;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLlj;)V")
    public final void method738(byte arg0, class25 arg1) {
        if (arg0 >= -29) {
            field1757 = null;
        }
        field1748++;
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                return;
            }
            this.method734(arg1, var3, -38);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public final void method739(int arg0) {
        if (arg0 != 18608) {
            this.method737(118, -24);
        }
        if (this.field1740 != null) {
            for (int var2 = 0; var2 < this.field1740.length; var2++) {
                this.field1740[var2] = class160.method1143(this.field1740[var2], 32768);
            }
        }
        field1737++;
        if (this.field1743 != null) {
            for (int var3 = 0; var3 < this.field1743.length; var3++) {
                this.field1743[var3] = class160.method1143(this.field1743[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static void method740(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1757 = null;
        field1755 = null;
        field1750 = null;
        field1744 = null;
        field1756 = null;
        field1753 = null;
    }
}
