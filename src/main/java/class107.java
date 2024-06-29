import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class107 extends class170 {

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "Lsc;")
    public static class181 field1741 = class149.method967(255, "hitbar_default");

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "Lsc;")
    public static class181 field1748 = class149.method967(255, "settings");

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lsc;")
    private static class181 field1742 = class149.method967(255, "red:");

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Lsc;")
    public static class181 field1743 = class149.method967(255, "blinken1:");

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field1754 = 99;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Lsc;")
    private static class181 field1739 = class149.method967(255, "Prepared sound engine");

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "[I")
    public static int[] field1751 = new int[2000];

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "Lsc;")
    public static class181 field1752 = field1739;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "Lsc;")
    public static class181 field1744 = field1742;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lsc;")
    public static class181 field1760 = field1742;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "Lhd;")
    public static class214 field1755;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1740;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "[I")
    public static int[] field1746;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[I")
    public static int[] field1747;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 - arg4) >= class11.field219 && (arg1 + arg4) <= class124.field2032 && class23.field408 <= arg0 - arg4 && class125.field2056 >= arg0 + arg4) {
            class174.method1156(arg4, -1, arg5, arg3, arg1, arg0, arg6);
        } else {
            class30.method241(arg1, arg3, arg4, arg5, true, arg0, arg6);
        }
        if (arg2 != -15892) {
            field1752 = null;
        }
        field1761++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZIII)V")
    public final void method716(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1738++;
        int var6 = this.field1750 << 3;
        if (arg1) {
            int var7 = (arg2 << 4) + (var6 & 0xF);
            int var8 = this.field1758 << 3;
            int var9 = (arg4 << 4) + (var8 & 0xF);
            this.method341(var6, var8, var7, var9, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method717(boolean arg0) {
        field1740 = null;
        field1748 = null;
        field1739 = null;
        field1755 = null;
        field1743 = null;
        if (arg0) {
            return;
        }
        field1760 = null;
        field1742 = null;
        field1741 = null;
        field1751 = null;
        field1747 = null;
        field1746 = null;
        field1752 = null;
        field1744 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
    public static final int method718(byte arg0, int arg1) {
        if (arg0 != -88) {
            method718((byte) -56, 69);
        }
        field1763++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public abstract void method337(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public static final void method719(int arg0) {
        field1759++;
        if (class212.field3661 == null) {
            return;
        }
        if (class109.field1787 < 10) {
            if (!class219.field3779.method87((byte) -114, class212.field3661.field1969) || !class219.field3779.method87((byte) -111, class175.method1164(new class181[] { class212.field3661.field1969, class64.field1008 }, (byte) 126))) {
                class109.field1787 = class37.field571.method113(class212.field3661.field1969, -112) / 10;
                return;
            }
            class35.method264(-5);
            class109.field1787 = 10;
        }
        if (class109.field1787 == 10) {
            class265.field4625 = class212.field3661.field1964 >> 6 << 6;
            class62.field967 = (class212.field3661.field1950 >> 6 << 6) + 64 - class265.field4625;
            class22.field388 = 8.0F;
            class108.field1775 = 8.0F;
            class164.field2786 = class212.field3661.field1949 >> 6 << 6;
            class222.field3840 = (class212.field3661.field1945 >> 6 << 6) + 64 - class164.field2786;
            int var1 = (class258.field4507.field2654 >> 7) + class253.field4420 - class265.field4625;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class222.field3840 - class222.field3844 - ((class258.field4507.field2681 >> 7) - class164.field2786) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class62.field967 && var4 >= 0 && var4 < class222.field3840) {
                class152.field2537 = var2;
                class203.field3489 = var4;
            } else {
                class203.field3489 = class164.field2786 + (class222.field3840 - 1) - (class212.field3661.field1944 * 64);
                class152.field2537 = class212.field3661.field1971 * 64 - class265.field4625;
            }
            class25.method218(126);
            class162.field2757 = new int[class256.field4472 + 1];
            int var5 = class222.field3840 >> 6;
            int var6 = class127.field2107 >> 2 << 10;
            int var7 = class62.field967 >> 6;
            class242.field4210 = new byte[var7][var5][];
            class113.field1841 = new short[var7][var5][];
            class52.field816 = new byte[var7][var5][];
            int var8 = class57.field869 >> 1;
            class83.field1327 = new byte[var7][var5][];
            class126.field2095 = new byte[var7][var5][];
            class23.field407 = new int[var7][var5][];
            class262.field4563 = new int[var7][var5][];
            class217.field3737 = new byte[var7][var5][];
            class63.method449(var8, arg0 ^ 0x3D2, var6);
            class109.field1787 = 20;
        } else if (class109.field1787 == 20) {
            class208.method1383(new class230(class219.field3779.method88(class212.field3661.field1969, (byte) 30, class236.field4108)), arg0 - 82);
            class109.field1787 = 30;
            class1.method14(true, (byte) -109);
            class86.method582(-20898);
        } else if (class109.field1787 == 30) {
            class79.method555(new class230(class219.field3779.method88(class212.field3661.field1969, (byte) 39, class235.field4094)), -1);
            class109.field1787 = 40;
            class86.method582(-20898);
        } else if (class109.field1787 == 40) {
            class172.method1138(true, new class230(class219.field3779.method88(class212.field3661.field1969, (byte) 41, class135.field2195)));
            class109.field1787 = 50;
            class86.method582(-20898);
        } else if (class109.field1787 == 50) {
            class9.method77(new class230(class219.field3779.method88(class212.field3661.field1969, (byte) 99, class3.field74)), (byte) -57);
            class109.field1787 = 60;
            class1.method14(true, (byte) -116);
            class86.method582(-20898);
        } else if (class109.field1787 == 60) {
            class242.field4214 = class166.method1111(class219.field3779, 11975, class175.method1164(new class181[] { class212.field3661.field1969, class64.field1008 }, (byte) 125));
            class109.field1787 = 70;
            class86.method582(arg0 - 20980);
        } else if (class109.field1787 == 70) {
            class224.field3866 = new class117(11, true, field1740);
            class109.field1787 = 73;
            class1.method14(true, (byte) -119);
            class86.method582(-20898);
        } else if (class109.field1787 == 73) {
            class219.field3770 = new class117(12, true, field1740);
            class109.field1787 = 76;
            class1.method14(true, (byte) -107);
            class86.method582(arg0 ^ 0xFFFFAE0C);
        } else {
            if (arg0 != 82) {
                method717(true);
            }
            if (class109.field1787 == 76) {
                class86.field1366 = new class117(14, true, field1740);
                class109.field1787 = 79;
                class1.method14(true, (byte) -111);
                class86.method582(-20898);
            } else if (class109.field1787 == 79) {
                class196.field3414 = new class117(17, true, field1740);
                class109.field1787 = 82;
                class1.method14(true, (byte) -105);
                class86.method582(-20898);
            } else if (class109.field1787 == 82) {
                class100.field1674 = new class117(19, true, field1740);
                class109.field1787 = 85;
                class1.method14(true, (byte) -111);
                class86.method582(-20898);
            } else if (class109.field1787 == 85) {
                class186.field3297 = new class117(22, true, field1740);
                class109.field1787 = 88;
                class1.method14(true, (byte) -128);
                class86.method582(-20898);
            } else if (class109.field1787 == 88) {
                class140.field2262 = new class117(26, true, field1740);
                class109.field1787 = 91;
                class1.method14(true, (byte) -122);
                class86.method582(arg0 - 20980);
            } else {
                class73.field1167 = new class117(30, true, field1740);
                class109.field1787 = 100;
                class1.method14(true, (byte) -105);
                class86.method582(-20898);
                class76.field1222 = -1;
                class98.field1584 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
    public abstract void method332(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public abstract void method322(int arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public abstract void method339(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIIIII)I")
    public static final int method720(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        field1762++;
        int var8 = arg1 & 0x3;
        if (arg0 != 48) {
            method717(true);
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg2 - arg5;
        } else if (var8 == 2) {
            return 7 - (arg3 - 1) - arg6;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(Z)V")
    public static final void method721(boolean arg0) {
        class83.field1328.method1798(-32);
        if (!arg0) {
            field1754 = -109;
        }
        field1764++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)V")
    public abstract void method335(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)V")
    public abstract void method329(int arg0, int arg1);
}
