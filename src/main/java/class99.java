import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class99 extends class301 {

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Ljava/lang/String;")
    private String field1826 = "null";

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1822 = 50;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "C")
    public char field1818;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "C")
    public char field1820;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lek;")
    public static class206 field1828;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Ll;")
    private class328 field1823;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Ll;")
    public class328 field1831;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "[[[B")
    public static byte[][][] field1811;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "[[[Len;")
    public static class49[][][] field1810;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)Z", line = 4)
    public static final boolean method750(int arg0, int arg1, int arg2, int arg3) {
        if (class296.method2130(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class153.method1093(var4 + 1, class144.field2427[arg0][arg1][arg2] + arg3, var5 + 1) && class153.method1093(var4 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class153.method1093(var4 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class153.method1093(var4 + 1, class144.field2427[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 20)
    public static final void method751(byte arg0) {
        if (class200.field3356 == 2) {
            if (class57.field1135 == class201.field3373 && class34.field754 == class250.field4111) {
                class200.field3356 = 0;
                if (class274.field4473 && class261.field4307[81] && class137.field2343 > 2) {
                    class222.method1556((byte) 6, class137.field2343 - 2);
                } else {
                    class222.method1556((byte) 6, class137.field2343 - 1);
                }
            }
        } else if (class57.field1135 == class37.field807 && class303.field4931 == class250.field4111) {
            class200.field3356 = 0;
            if (class274.field4473 && class261.field4307[81] && class137.field2343 > 2) {
                class222.method1556((byte) 6, class137.field2343 - 2);
            } else {
                class222.method1556((byte) 6, class137.field2343 - 1);
            }
        } else {
            class34.field754 = class303.field4931;
            class200.field3356 = 2;
            class201.field3373 = class37.field807;
        }
        if (arg0 != 116) {
            method757(-29);
        }
        field1829++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 76)
    public final boolean method752(String arg0, boolean arg1) {
        field1812++;
        if (arg1) {
            this.field1820 = (char) 65417;
        }
        if (this.field1831 == null) {
            return false;
        }
        if (this.field1823 == null) {
            this.method753(0);
        }
        for (class141 var3 = (class141) this.field1823.method2344(-1, class41.method321(4, arg0)); var3 != null; var3 = (class141) this.field1823.method2335((byte) 7)) {
            if (var3.field2382.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 104)
    private final void method753(int arg0) {
        this.field1823 = new class328(this.field1831.method2341((byte) -123));
        if (arg0 != 0) {
            return;
        }
        for (class202 var2 = (class202) this.field1831.method2345((byte) -104); var2 != null; var2 = (class202) this.field1831.method2336(-70)) {
            class141 var3 = new class141(var2.field3389, (int) var2.field1291);
            this.field1823.method2337(var3, 709, class41.method321(4, var2.field3389));
        }
        field1827++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Loe;I)V", line = 133)
    public final void method754(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                field1821++;
                if (arg1 != -1) {
                    this.method752((String) null, true);
                }
                return;
            }
            this.method755((byte) -93, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILoe;)V", line = 160)
    private final void method755(byte arg0, int arg1, class146 arg2) {
        field1825++;
        if (arg0 >= -74) {
            return;
        }
        if (arg1 == 1) {
            this.field1818 = class251.method1768((byte) 94, arg2.method1029(-2));
        } else if (arg1 == 2) {
            this.field1820 = class251.method1768((byte) 100, arg2.method1029(-2));
        } else if (arg1 == 3) {
            this.field1826 = arg2.method1017((byte) -123);
        } else if (arg1 == 4) {
            this.field1814 = arg2.method1004(3);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method989(119);
            this.field1831 = new class328(class311.method2264(var4, (byte) -65));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1004(3);
                class70 var7;
                if (arg1 == 5) {
                    var7 = new class202(arg2.method1017((byte) -120));
                } else {
                    var7 = new class111(arg2.method1004(3));
                }
                this.field1831.method2337(var7, 709, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Z", line = 220)
    public final boolean method756(int arg0, int arg1) {
        field1824++;
        if (this.field1831 == null) {
            return false;
        }
        if (arg0 != 23842) {
            this.field1820 = (char) 65528;
        }
        if (this.field1823 == null) {
            this.method760(arg0 ^ 0xFFFFA554);
        }
        class111 var3 = (class111) this.field1823.method2344(-1, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V", line = 244)
    public static void method757(int arg0) {
        field1811 = (byte[][][]) null;
        if (arg0 >= -85) {
            method750(-57, -125, 39, 17);
        }
        field1828 = null;
        field1810 = (class49[][][]) null;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)I", line = 256)
    public final int method758(int arg0, int arg1) {
        field1816++;
        if (this.field1831 == null) {
            return this.field1814;
        }
        class111 var3 = (class111) this.field1831.method2344(-1, (long) arg0);
        if (var3 == null) {
            return this.field1814;
        } else {
            if (arg1 != 81) {
                this.method758(-114, 88);
            }
            return var3.field2030;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 276)
    public final String method759(int arg0, byte arg1) {
        field1830++;
        if (arg1 <= 30) {
            this.field1814 = -96;
        }
        if (this.field1831 == null) {
            return this.field1826;
        } else {
            class202 var3 = (class202) this.field1831.method2344(-1, (long) arg0);
            return var3 == null ? this.field1826 : var3.field3389;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V", line = 302)
    private final void method760(int arg0) {
        field1819++;
        this.field1823 = new class328(this.field1831.method2341((byte) -96));
        if (arg0 != -1930) {
            this.field1826 = (String) null;
        }
        for (class111 var2 = (class111) this.field1831.method2345((byte) -107); var2 != null; var2 = (class111) this.field1831.method2336(arg0 + 1833)) {
            class111 var3 = new class111((int) var2.field1291);
            this.field1823.method2337(var3, 709, (long) var2.field2030);
        }
    }
}
