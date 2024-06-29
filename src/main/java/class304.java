import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class304 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "B")
    private byte field4768;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field4755 = 0;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
    public static int[] field4765 = new int[100];

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lek;")
    public static class184 field4763 = null;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[I")
    public static int[] field4767 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Z")
    public static boolean field4766;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[S")
    public static short[] field4761;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[[Ljn;")
    public static class123[][] field4757;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2118(byte arg0) {
        field4751++;
        if (arg0 >= -45) {
            method2118((byte) -17);
        }
        if (class126.field1994 != null) {
            class37 var1 = class126.field1994;
            synchronized (class126.field1994) {
                class126.field1994 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 26)
    public static void method2119(int arg0) {
        field4757 = (class123[][]) null;
        field4763 = null;
        field4767 = null;
        if (arg0 == -512) {
            field4765 = null;
            field4761 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 46)
    public static final void method2120(byte arg0) {
        field4759++;
        int var1 = class22.field239.length;
        if (arg0 >= -113) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class22.field239[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class273.field4128; var4++) {
                    if (class324.field5049[var2] == class171.field2544[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class171.field2544[class273.field4128] = class324.field5049[var2];
                    var3 = class273.field4128++;
                }
                class35 var6 = new class35(class22.field239[var2]);
                while (class22.field239[var2].length > var6.field455 && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method300(-1394191632);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = (var8 & 0x1FA4) >> 7;
                    int var12 = (class324.field5049[var2] >> 8) * 64 + var11 - class302.field4735;
                    int var13 = (class324.field5049[var2] & 0xFF) * 64 + var10 - class110.field1744;
                    class183 var14 = class10.method78(var6.method300(-1394191632), 2);
                    if (class161.field2394[var7] == null && (var14.field2754 & 0x1) > 0 && class167.field2507 == var9 && var12 >= 0 && var14.field2750 + var12 < 104 && var13 >= 0 && var14.field2750 + var13 < 104) {
                        class161.field2394[var7] = new class45();
                        class45 var15 = class161.field2394[var7];
                        class126.field1995[class122.field1923++] = var7;
                        var15.field4481 = class312.field4852;
                        var15.method412(var14, true);
                        var15.method2031(false, var15.field698.field2750);
                        var15.field4497 = var15.field4438 = class160.field2387[var15.field698.field2748];
                        var15.field4443 = var15.field698.field2743;
                        if (var15.field4443 == 0) {
                            var15.field4438 = 0;
                        }
                        var15.field4478 = var15.field698.field2794;
                        var15.method2028(117, true, var13, var15.method929(12), var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 148)
    public static final void method2121(int arg0) {
        class38.field577 = null;
        class126.field1999 = null;
        class263.field3937 = null;
        if (arg0 != -901723570) {
            method2119(-39);
        }
        class43.field673 = null;
        class228.field3528 = null;
        class163.field2432 = null;
        class180.field2708 = null;
        class40.field596 = null;
        class64.field956 = null;
        class159.field2371 = null;
        class121.field1888 = null;
        class136.field2119 = null;
        class200.field3172 = null;
        field4764++;
        class51.field788 = null;
        class278.field4269 = null;
        class182.field2726 = null;
        class255.field3810 = null;
        class126.field1998 = null;
        class200.field3163 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)I", line = 183)
    public final int method2122(boolean arg0) {
        if (arg0) {
            return -1;
        } else {
            field4760++;
            return (this.field4768 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)I", line = 198)
    public final int method2123(int arg0) {
        field4754++;
        int var2 = 43 % ((arg0 - 41) / 38);
        return this.field4768 & 0x7;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)I", line = 215)
    public static final int method2124(byte arg0, int arg1) {
        if (arg0 < 97) {
            method2119(-9);
        }
        field4762++;
        class126 var2 = class324.method2228(0, arg1);
        int var3 = var2.field1985;
        int var4 = var2.field1986;
        int var5 = var2.field1987;
        int var6 = class318.field4951[var5 - var3];
        return var6 & class199.field3158[var4] >> var3;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 239)
    public class304() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lhb;)V", line = 241)
    public class304(class35 arg0) {
        this.field4768 = arg0.method242((byte) -93);
        this.field4770 = arg0.method300(-1394191632);
        this.field4769 = arg0.method299(-87);
        this.field4752 = arg0.method299(-104);
        this.field4753 = arg0.method299(-111);
        this.field4756 = arg0.method299(-84);
    }
}
