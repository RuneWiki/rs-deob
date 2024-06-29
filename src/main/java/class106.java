import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 {

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lna;")
    public class25 field1963 = new class25();

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lja;")
    public static class60 field1952 = null;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    public static int[] field1950 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1955 = 0;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1960 = 127;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lcd;")
    private static class64 field1964 = class44.method335((byte) 71, "Attack");

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lcd;")
    public static class64 field1959 = field1964;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "F")
    public static float field1965;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lrb;")
    public static class211 field1961;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Llh;")
    public static class22 field1956;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lna;")
    private class25 field1966;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[[[I")
    public static int[][][] field1957;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 4)
    public static void method774(int arg0) {
        field1950 = null;
        field1952 = null;
        field1964 = null;
        field1961 = null;
        field1957 = (int[][][]) null;
        field1956 = null;
        if (arg0 == 1) {
            field1959 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lna;", line = 29)
    public final class25 method775(int arg0) {
        field1947++;
        if (arg0 != 26517) {
            return (class25) null;
        }
        class25 var2 = this.field1966;
        if (this.field1963 == var2) {
            this.field1966 = null;
            return null;
        } else {
            this.field1966 = var2.field415;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 56)
    public final void method776(byte arg0) {
        while (true) {
            class25 var2 = this.field1963.field415;
            if (this.field1963 == var2) {
                if (arg0 < 52) {
                    return;
                }
                field1951++;
                this.field1966 = null;
                return;
            }
            var2.method232(128);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lna;", line = 87)
    public final class25 method777(byte arg0) {
        field1946++;
        class25 var2 = this.field1966;
        if (this.field1963 == var2) {
            this.field1966 = null;
            return null;
        } else if (arg0 == 5) {
            this.field1966 = var2.field408;
            return var2;
        } else {
            return (class25) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Lna;", line = 113)
    public final class25 method778(int arg0) {
        field1949++;
        if (arg0 != 0) {
            field1952 = (class60) null;
        }
        class25 var2 = this.field1963.field415;
        if (this.field1963 == var2) {
            this.field1966 = null;
            return null;
        } else {
            this.field1966 = var2.field415;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Lna;", line = 133)
    public final class25 method779(int arg0) {
        field1962++;
        class25 var2 = this.field1963.field408;
        if (this.field1963 == var2) {
            this.field1966 = null;
            return null;
        }
        if (arg0 != 28619) {
            field1960 = -53;
        }
        this.field1966 = var2.field408;
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)Lna;", line = 163)
    public final class25 method780(byte arg0) {
        int var2 = 101 / ((arg0 + 4) / 48);
        class25 var3 = this.field1963.field415;
        field1953++;
        if (this.field1963 == var3) {
            return null;
        } else {
            var3.method232(128);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lna;I)V", line = 181)
    public final void method781(class25 arg0, int arg1) {
        field1954++;
        if (arg0.field408 != null) {
            arg0.method232(128);
        }
        arg0.field415 = this.field1963;
        arg0.field408 = this.field1963.field408;
        arg0.field408.field415 = arg0;
        if (arg1 != 10751) {
            this.method776((byte) 17);
        }
        arg0.field415.field408 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lna;I)V", line = 217)
    public final void method782(class25 arg0, int arg1) {
        if (arg0.field408 != null) {
            arg0.method232(128);
        }
        if (arg1 != 22774) {
            return;
        }
        arg0.field408 = this.field1963;
        field1958++;
        arg0.field415 = this.field1963.field415;
        arg0.field408.field415 = arg0;
        arg0.field415.field408 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 264)
    public class106() {
        this.field1963.field415 = this.field1963;
        this.field1963.field408 = this.field1963;
    }
}
