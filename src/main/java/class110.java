import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class110 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public int field1843 = -1;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field1839 = -1;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    public boolean field1840 = true;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field1846 = 0;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)I")
    public static final int method770(boolean arg0, int arg1) {
        field1842++;
        if (arg0) {
            method773(75, 79, 10, 33, 14, -23, -78, 70);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILva;Z)V")
    private final void method771(int arg0, int arg1, class187 arg2, boolean arg3) {
        if (arg1 == 1) {
            this.field1846 = class123.method886(arg2.method1248((byte) 22), -1);
        } else if (arg1 == 2) {
            this.field1843 = arg2.method1268(255);
        } else if (arg1 == 3) {
            this.field1843 = arg2.method1244(false);
            if (this.field1843 == 65535) {
                this.field1843 = -1;
            }
        } else if (arg1 == 5) {
            this.field1840 = false;
        } else if (arg1 == 7) {
            this.field1839 = class123.method886(arg2.method1248((byte) -88), -1);
        } else if (arg1 == 8) {
            class290.field5107 = arg0;
        } else if (arg1 == 9) {
            arg2.method1244(arg3);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg2.method1268(255);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg2.method1248((byte) -92);
                } else if (arg1 == 14) {
                    arg2.method1268(255);
                }
            }
        }
        if (arg3) {
            method773(59, 67, -37, 4, 89, 2, -104, -113);
        }
        field1845++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static final void method772(byte arg0) {
        if (!class152.field2556) {
            if (class265.field4655 != 0) {
                class274.field4805 = class233.field4030;
                class24.field353 = class1.field12;
            } else if (class32.field465 == 0) {
                class274.field4805 = class268.field4689;
                class24.field353 = class26.field363;
            } else {
                class274.field4805 = field1837;
                class24.field353 = class163.field2685;
            }
            class40.field645[0] = class274.field4801;
            class264.field4642[0] = 1001;
            class159.field2661 = 1;
            class160.field2663[0] = class179.field2989;
        }
        field1836++;
        class193.method1330((long) class72.field1146);
        if (class234.field4044 != -1) {
            class18.method121(-1, class234.field4044);
        }
        for (int var1 = 0; var1 < class216.field3723; var1++) {
            if (class154.field2597[var1]) {
                class255.field4528[var1] = true;
            }
            class52.field813[var1] = class154.field2597[var1];
            class154.field2597[var1] = false;
        }
        class174.field2923 = -1;
        class181.field3030 = null;
        class28.field404 = class72.field1146;
        class217.field3733 = -1;
        class73.field1160 = null;
        if (class234.field4044 != -1) {
            class216.field3723 = 0;
            class252.method1723(class199.field3390, class249.field4479, 0, 0, -1, class234.field4044, -109, 0, 0);
        }
        class122.method859();
        class208.method1437(-124);
        if (arg0 > -69) {
            field1847 = -13;
        }
        if (class152.field2556) {
            class175.method1174(false);
        } else if (class73.field1160 != null) {
            class18.method120(-69, class170.field2831, class73.field1160, class45.field698);
        } else if (class217.field3733 != -1) {
            class18.method120(-12, class217.field3733, (class237) null, class174.field2923);
        }
        if (class147.field2495 == 3) {
            for (int var2 = 0; var2 < class216.field3723; var2++) {
                if (class52.field813[var2]) {
                    class122.method860(class36.field524[var2], class13.field213[var2], class243.field4372[var2], class277.field4908[var2], 16711935, 128);
                } else if (class255.field4528[var2]) {
                    class122.method860(class36.field524[var2], class13.field213[var2], class243.field4372[var2], class277.field4908[var2], 16711680, 128);
                }
            }
        }
        class254.method1735(class82.field1285.field1799, class237.field4140, 118, class259.field4588, class82.field1285.field1793);
        class259.field4588 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILva;)V")
    public final void method774(int arg0, int arg1, class187 arg2) {
        while (true) {
            int var4 = arg2.method1268(255);
            if (var4 == 0) {
                field1844++;
                if (arg0 != 0) {
                    field1837 = 123;
                    return;
                }
                return;
            }
            this.method771(arg1, var4, arg2, false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    public static final int method775(int arg0, int arg1, int arg2) {
        field1835++;
        class100 var3 = (class100) class166.field2750.method992((byte) 125, (long) arg1);
        if (arg0 != -1) {
            method770(false, -92);
        }
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field1552.length > arg2) {
            return var3.field1552[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public static final int method776(int arg0, int arg1) {
        if (class187.field3190 != null) {
            class187.field3190.method419((byte) -66);
            class187.field3190 = null;
        }
        class83.field1300++;
        field1838++;
        if (class83.field1300 > 4) {
            class83.field1300 = 0;
            class178.field2979 = 0;
            return arg1;
        }
        if (class79.field1237 == class138.field2359) {
            class138.field2359 = class71.field1120;
        } else {
            class138.field2359 = class79.field1237;
        }
        int var2 = -70 / ((53 - arg0) / 38);
        class178.field2979 = 0;
        return -1;
    }
}
