import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class120 extends class170 {

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public int field1949 = 12800;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Z")
    public boolean field1946 = true;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public int field1945 = 0;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public int field1950 = 0;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public int field1964 = 12800;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    public int field1967 = -1;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Lsc;")
    public class181 field1969;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lsc;")
    public class181 field1960;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Lvb;")
    public class247 field1965;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Lsc;")
    private static class181 field1953 = class149.method967(255, "Loaded input handler");

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Lsc;")
    public static class181 field1952 = class149.method967(255, "null");

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lsc;")
    private static class181 field1958 = class149.method967(255, "K");

    @OriginalMember(owner = "client!d", name = "W", descriptor = "Lsc;")
    public static class181 field1954 = field1958;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "Z")
    public static boolean field1957 = false;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Lsc;")
    public static class181 field1959 = field1958;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Lsc;")
    public static class181 field1963 = field1953;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "Lve;")
    public static class70 field1973;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "[I")
    public static int[] field1955;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    public static final void method785(byte arg0, int arg1) {
        field1951++;
        if (arg0 >= -118) {
            field1955 = null;
        }
        class110.field1796.method1796(20, arg1);
        class210.field3596.method1796(20, arg1);
        class47.field744.method1796(20, arg1);
        class184.field3238.method1796(20, arg1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
    public final boolean method786(int arg0, int arg1, int arg2) {
        field1956++;
        if (this.field1964 > arg1 || this.field1950 < arg1 || arg0 < this.field1949 || this.field1945 < arg0) {
            return false;
        } else if (arg2 == 0) {
            for (class30 var4 = (class30) this.field1965.method1686((byte) -83); var4 != null; var4 = (class30) this.field1965.method1683(140)) {
                if (var4.method243(arg1, 1, arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public final void method787(int arg0) {
        field1972++;
        this.field1945 = arg0;
        this.field1964 = 12800;
        this.field1950 = 0;
        this.field1949 = 12800;
        for (class30 var2 = (class30) this.field1965.method1686((byte) -83); var2 != null; var2 = (class30) this.field1965.method1683(arg0 ^ 0x8C)) {
            if (var2.field499 < this.field1949) {
                this.field1949 = var2.field499;
            }
            if (this.field1964 > var2.field495) {
                this.field1964 = var2.field495;
            }
            if (var2.field497 > this.field1950) {
                this.field1950 = var2.field497;
            }
            if (this.field1945 < var2.field496) {
                this.field1945 = var2.field496;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lej;I)V")
    public static final void method788(class142 arg0, int arg1) {
        field1962++;
        class6 var2 = null;
        try {
            class118 var3 = arg0.method910("runescape", (byte) -21);
            while (var3.field1933 == 0) {
                class95.method632(true, 1L);
            }
            if (var3.field1933 == 1) {
                var2 = (class6) var3.field1935;
                class230 var4 = class30.method242(arg1 - 20374);
                var2.method52(0, var4.field3977, var4.field3933, 124);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method49(false);
            }
            if (arg1 != 20374) {
                field1953 = null;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method789(int arg0, boolean arg1, Object arg2) {
        field1966++;
        if (arg2 == null) {
            return null;
        } else if (arg0 != 0) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class159.method1066(var3, 0) : var3;
        } else if (arg2 instanceof class235) {
            class235 var4 = (class235) arg2;
            return var4.method991(arg0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILvf;)Lfb;")
    public static final class212 method790(int arg0, class230 arg1) {
        arg1.method1516((byte) 82);
        field1970++;
        int var2 = arg1.method1516((byte) 82);
        class212 var3 = class215.method1431(var2, -9787);
        var3.field3654 = arg1.method1516((byte) 82);
        int var4 = arg1.method1516((byte) 82);
        int var5 = 0;
        if (arg0 != 12800) {
            return null;
        }
        while (var5 < var4) {
            int var6 = arg1.method1516((byte) 82);
            var3.method26(arg1, var6, -3);
            var5++;
        }
        var3.method46(true);
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static void method791(int arg0) {
        field1973 = null;
        field1954 = null;
        if (arg0 != 12800) {
            return;
        }
        field1958 = null;
        field1963 = null;
        field1952 = null;
        field1955 = null;
        field1959 = null;
        field1953 = null;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static final void method792(int arg0) {
        class174.field2918.method1790(arg0 ^ arg0);
        class20.field362.method1790(0);
        field1961++;
        class96.field1540.method1790(0);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lsc;Lsc;IIIZ)V")
    public class120(class181 arg0, class181 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1946 = arg5;
        this.field1969 = arg0;
        this.field1944 = arg3;
        this.field1971 = arg2;
        this.field1960 = arg1;
        this.field1967 = arg4;
        this.field1965 = new class247();
    }
}
