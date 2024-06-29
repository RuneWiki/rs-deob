import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class184 extends class8 {

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "Ljava/lang/String;")
    private String field3049 = "null";

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "S")
    public static short field3059 = 32767;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lhh;")
    public static class169 field3042 = new class169();

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
    public static int[] field3062 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static volatile int field3061 = 0;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "C")
    public char field3043;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "C")
    public char field3058;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "Lcd;")
    public class69 field3048;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Lcd;")
    private class69 field3050;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[I")
    public static int[] field3046;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1375(int arg0, int arg1) {
        class24.field327.method708(arg1, true);
        class172.field2858.method708(arg1, true);
        field3047++;
        if (arg0 != 2) {
            field3061 = 32;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 26)
    public final boolean method1376(String arg0, int arg1) {
        field3053++;
        if (this.field3048 == null) {
            return false;
        }
        if (this.field3050 == null) {
            this.method1377((byte) 29);
        }
        class5 var3 = (class5) this.field3050.method451(class285.method2046(arg0, (byte) -16), (byte) 100);
        if (arg1 != 4) {
            this.field3054 = 58;
        }
        while (var3 != null) {
            if (var3.field77.equals(arg0)) {
                return true;
            }
            var3 = (class5) this.field3050.method459((byte) 96);
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 54)
    private final void method1377(byte arg0) {
        field3045++;
        this.field3050 = new class69(this.field3048.method452((byte) -25));
        if (arg0 != 29) {
            this.field3050 = (class69) null;
        }
        for (class131 var2 = (class131) this.field3048.method458((byte) -16); var2 != null; var2 = (class131) this.field3048.method455((byte) 55)) {
            class5 var3 = new class5(var2.field2069, (int) var2.field2744);
            this.field3050.method461(arg0 ^ 0xFFFFFFE2, class285.method2046(var2.field2069, (byte) -16), var3);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Ljava/lang/String;", line = 81)
    public final String method1378(int arg0, int arg1) {
        field3041++;
        if (arg1 != -24986) {
            this.field3049 = (String) null;
        }
        if (this.field3048 == null) {
            return this.field3049;
        } else {
            class131 var3 = (class131) this.field3048.method451((long) arg0, (byte) 100);
            return var3 == null ? this.field3049 : var3.field2069;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljj;I)V", line = 101)
    public final void method1379(class44 arg0, int arg1) {
        field3060++;
        if (arg1 <= 68) {
            return;
        }
        while (true) {
            int var3 = arg0.method286((byte) -89);
            if (var3 == 0) {
                return;
            }
            this.method1380(var3, arg0, 31968);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjj;I)V", line = 121)
    private final void method1380(int arg0, class44 arg1, int arg2) {
        if (arg2 != 31968) {
            method1375(-100, -97);
        }
        field3057++;
        if (arg0 == 1) {
            this.field3058 = class213.method1534(arg1.method246((byte) -20), -76);
        } else if (arg0 == 2) {
            this.field3043 = class213.method1534(arg1.method246((byte) -77), -84);
        } else if (arg0 == 3) {
            this.field3049 = arg1.method265(0);
        } else if (arg0 == 4) {
            this.field3054 = arg1.method238((byte) 82);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method271(21081);
            this.field3048 = new class69(class120.method843(-2, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method238((byte) 82);
                class165 var7;
                if (arg0 == 5) {
                    var7 = new class131(arg1.method265(0));
                } else {
                    var7 = new class174(arg1.method238((byte) 82));
                }
                this.field3048.method461(arg2 ^ 0x7CE7, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Ld;", line = 177)
    public static final class36 method1381(boolean arg0) {
        if (arg0) {
            return (class36) null;
        }
        field3052++;
        try {
            return (class36) Class.forName("vc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class28();
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)Z", line = 192)
    public final boolean method1382(int arg0, int arg1) {
        field3056++;
        if (arg1 >= -64) {
            method1375(27, 28);
        }
        if (this.field3048 == null) {
            return false;
        }
        if (this.field3050 == null) {
            this.method1384((byte) -58);
        }
        class174 var3 = (class174) this.field3050.method451((long) arg0, (byte) 100);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 217)
    public static final void method1383(int arg0) {
        class115.method793(false, (byte) -34);
        if (arg0 != 2) {
            method1381(true);
        }
        System.gc();
        class278.method2012(25, 80);
        field3051++;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V", line = 233)
    private final void method1384(byte arg0) {
        this.field3050 = new class69(this.field3048.method452((byte) -128));
        if (arg0 != -58) {
            this.field3050 = (class69) null;
        }
        for (class174 var2 = (class174) this.field3048.method458((byte) -16); var2 != null; var2 = (class174) this.field3048.method455((byte) 93)) {
            class174 var3 = new class174((int) var2.field2744);
            this.field3050.method461(arg0 + 93, (long) var2.field2881, var3);
        }
        field3055++;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I", line = 257)
    public final int method1385(int arg0, int arg1) {
        field3044++;
        if (this.field3048 == null) {
            return this.field3054;
        } else {
            class174 var3 = (class174) this.field3048.method451((long) arg1, (byte) 100);
            int var4 = 7 / ((43 - arg0) / 32);
            return var3 == null ? this.field3054 : var3.field2881;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V", line = 290)
    public static void method1386(byte arg0) {
        field3046 = null;
        field3042 = null;
        if (arg0 < 116) {
            field3062 = (int[]) null;
        }
        field3062 = null;
    }
}
