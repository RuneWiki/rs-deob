import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class99 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field1688 = 255;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    public static int[] field1692 = new int[14];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method772(byte arg0) {
        class106.field1815 = 0;
        class284.field4574 = 0;
        class79.method587(20114);
        field1694++;
        class188.method1347(30728);
        class213.method1495(15);
        class280.method1938(-105);
        if (arg0 > -92) {
            return;
        }
        for (int var1 = 0; var1 < class106.field1815; var1++) {
            int var3 = class287.field4605[var1];
            if (class199.field2930 != class92.field1475[var3].field3749) {
                if (class92.field1475[var3].field3046 > 0) {
                    class228.method1576(class92.field1475[var3], 1);
                }
                class92.field1475[var3] = null;
            }
        }
        if (class162.field2510 != class92.field1488.field735) {
            throw new RuntimeException("gpp1 pos:" + class92.field1488.field735 + " psize:" + class162.field2510);
        }
        for (int var2 = 0; var2 < class103.field1791; var2++) {
            if (class92.field1475[class162.field2518[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class103.field1791);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
    public final boolean method773(int arg0) {
        if (arg0 != 4) {
            method777(-28, 27, 73, -60, 90);
        }
        field1681++;
        return (this.field1687 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
    public final boolean method774(byte arg0) {
        field1685++;
        if (arg0 != 86) {
            field1686 = -55;
        }
        return (this.field1687 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIIIII)V")
    public static final void method775(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1678++;
        if (arg1 != 14) {
            field1680 = -27;
        }
        int var7 = class289.method1972(class73.field1156, (byte) 122, arg5, class59.field859);
        int var8 = class289.method1972(class73.field1156, (byte) 122, arg2, class59.field859);
        int var9 = class289.method1972(class264.field4230, (byte) 122, arg4, class273.field4418);
        int var10 = class289.method1972(class264.field4230, (byte) 122, arg6, class273.field4418);
        int var11 = class289.method1972(class73.field1156, (byte) 122, arg0 + arg5, class59.field859);
        int var12 = class289.method1972(class73.field1156, (byte) 122, arg2 - arg0, class59.field859);
        for (int var13 = var7; var13 < var11; var13++) {
            class89.method669(class104.field1795[var13], arg3, var10, var9, (byte) -123);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class89.method669(class104.field1795[var14], arg3, var10, var9, (byte) -123);
        }
        int var15 = class289.method1972(class264.field4230, (byte) 122, arg0 + arg4, class273.field4418);
        int var16 = class289.method1972(class264.field4230, (byte) 122, arg6 - arg0, class273.field4418);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class104.field1795[var17];
            class89.method669(var18, arg3, var15, var9, (byte) -125);
            class89.method669(var18, arg3, var10, var16, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)Z")
    public final boolean method776(byte arg0) {
        field1682++;
        if (arg0 >= -111) {
            return true;
        } else {
            return (this.field1687 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public static final void method777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            method772((byte) 3);
        }
        if (arg2 >= arg0) {
            class89.method669(class104.field1795[arg3], arg4, arg2, arg0, (byte) -123);
        } else {
            class89.method669(class104.field1795[arg3], arg4, arg0, arg2, (byte) -125);
        }
        field1690++;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)Z")
    public final boolean method778(byte arg0) {
        field1691++;
        int var2 = -41 % ((23 - arg0) / 40);
        return (this.field1687 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public static final int method779(int arg0, int arg1) {
        if (arg1 == 14) {
            field1689++;
            return arg0 & 0xFF;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
    public static void method780(byte arg0) {
        int var1 = -25 / ((arg0 - 22) / 55);
        field1692 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIII)V")
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class89.method669(class104.field1795[arg4], arg2, arg0 + arg3, -arg0 + arg3, (byte) -127);
        if (arg1 != -25158) {
            method777(-55, 49, 22, 23, -91);
        }
        int var5 = 0;
        field1684++;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class104.field1795[arg4 + var6];
                int var10 = arg3 + var5;
                int var11 = arg3 - var5;
                int[] var12 = class104.field1795[arg4 - var6];
                class89.method669(var9, arg2, var10, var11, (byte) -123);
                class89.method669(var12, arg2, var10, var11, (byte) -126);
            }
            int var13 = arg3 + var6;
            int[] var14 = class104.field1795[arg4 + var5];
            int[] var15 = class104.field1795[arg4 - var5];
            int var16 = arg3 - var6;
            class89.method669(var14, arg2, var13, var16, (byte) -124);
            class89.method669(var15, arg2, var13, var16, (byte) -127);
        }
    }
}
