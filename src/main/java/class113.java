import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class113 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "J")
    public static long field1837 = 0L;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1845 = 128;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[[[B")
    public static byte[][][] field1836;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[[[S")
    public static short[][][] field1841;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method748(byte arg0) {
        class171.field2865.method1798(-100);
        field1842++;
        if (arg0 >= -102) {
            method751(66L, -71);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1841 = null;
        int var1 = -126 % ((arg0 - 3) / 46);
        field1836 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILo;)V")
    public static final void method750(int arg0, int arg1, int arg2, class175 arg3) {
        if (arg3.field2954 == 0) {
            arg3.field3036 = arg3.field3002;
        } else if (arg3.field2954 == 1) {
            arg3.field3036 = (arg1 - arg3.field3041) / 2 + arg3.field3002;
        } else if (arg3.field2954 == 2) {
            arg3.field3036 = arg1 - arg3.field3041 - arg3.field3002;
        } else if (arg3.field2954 == 3) {
            arg3.field3036 = arg3.field3002 * arg1 >> 14;
        } else if (arg3.field2954 == 4) {
            arg3.field3036 = (arg1 - arg3.field3041) / 2 + (arg3.field3002 * arg1 >> 14);
        } else {
            arg3.field3036 = arg1 - arg3.field3041 - (arg3.field3002 * arg1 >> 14);
        }
        if (arg3.field3040 == 0) {
            arg3.field2929 = arg3.field2993;
        } else if (arg3.field3040 == 1) {
            arg3.field2929 = (arg0 - arg3.field3057) / 2 + arg3.field2993;
        } else if (arg3.field3040 == 2) {
            arg3.field2929 = arg0 - arg3.field3057 - arg3.field2993;
        } else if (arg3.field3040 == 3) {
            arg3.field2929 = arg3.field2993 * arg0 >> 14;
        } else if (arg3.field3040 == 4) {
            arg3.field2929 = (arg0 - arg3.field3057) / 2 + (arg3.field2993 * arg0 >> 14);
        } else {
            arg3.field2929 = arg0 - (arg3.field2993 * arg0 >> 14) - arg3.field3057;
        }
        field1843++;
        if (arg2 != 1 || !class166.field2826 || client.method1058(arg3) == 0 && arg3.field3069 != 0) {
            return;
        }
        if (arg3.field2929 < 0) {
            arg3.field2929 = 0;
        } else if (arg0 < arg3.field3057 + arg3.field2929) {
            arg3.field2929 = arg0 - arg3.field3057;
        }
        if (arg3.field3036 < 0) {
            arg3.field3036 = 0;
        } else if (arg1 < arg3.field3036 + arg3.field3041) {
            arg3.field3036 = arg1 - arg3.field3041;
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
    public static final void method751(long arg0, int arg1) {
        field1844++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 <= 78) {
            method751(107L, -77);
        }
        for (int var3 = 0; var3 < class149.field2483; var3++) {
            if (class182.field3213[var3] == arg0) {
                class149.field2483--;
                for (int var4 = var3; var4 < class149.field2483; var4++) {
                    class5.field100[var4] = class5.field100[var4 + 1];
                    class140.field2272[var4] = class140.field2272[var4 + 1];
                    class175.field2947[var4] = class175.field2947[var4 + 1];
                    class182.field3213[var4] = class182.field3213[var4 + 1];
                    class190.field3352[var4] = class190.field3352[var4 + 1];
                    class248.field4331[var4] = class248.field4331[var4 + 1];
                }
                class83.field1330++;
                class7.field122 = class247.field4318;
                class141.field2275.method541(46, -83);
                class141.field2275.method1511(false, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)V")
    public static final void method752(boolean arg0, int arg1, int arg2, int arg3) {
        field1838++;
        if (arg3 != -1) {
            method752(false, -85, 75, 59);
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class145.field2372 = arg0;
        class207.field3554 = arg2;
        class198.field3443 = arg1;
    }
}
