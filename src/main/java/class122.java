import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class122 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field1955 = 0;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
    private boolean field1951 = false;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field1958 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "J")
    public long field1959;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lrg;")
    public static class342 field1950;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lug;Z)V", line = 12)
    public final void method1056(class25 arg0, boolean arg1) {
        field1960++;
        while (true) {
            int var3 = arg0.method281(31);
            if (var3 == 0) {
                if (arg1) {
                    this.field1954 = 1;
                }
                return;
            }
            this.method1057(var3, arg0, 9);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILug;I)V", line = 36)
    private final void method1057(int arg0, class25 arg1, int arg2) {
        if (arg2 != 9) {
            return;
        }
        field1946++;
        if (arg0 == 1) {
            this.field1948 = arg1.method314((byte) 101);
        } else if (arg0 == 2) {
            arg1.method281(-124);
        } else if (arg0 == 3) {
            this.field1953 = arg1.method262((byte) 26);
            this.field1954 = arg1.method262((byte) 122);
            this.field1952 = arg1.method262((byte) 61);
        } else if (arg0 == 4) {
            this.field1963 = arg1.method281(arg2 ^ 0xFFFFFF8D);
            this.field1964 = arg1.method262((byte) 126);
        } else if (arg0 == 6) {
            this.field1962 = arg1.method281(-126);
        } else if (arg0 == 8) {
            this.field1955 = 1;
        } else if (arg0 == 9) {
            this.field1958 = 1;
        } else if (arg0 == 10) {
            this.field1951 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILrn;)Z", line = 99)
    public static final boolean method1058(int arg0, int arg1, class18 arg2) {
        field1949++;
        byte[] var3 = arg2.method203(arg1, (byte) 47);
        if (var3 == null) {
            return false;
        }
        class146.method1218(var3, -1835684146);
        if (arg0 != -15575) {
            field1945 = -41;
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 116)
    public static final int method1059(int arg0, int arg1) {
        if (arg1 == 127) {
            field1956++;
            return arg0 & 0x7F;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 127)
    public static void method1060(int arg0) {
        if (arg0 < -100) {
            field1950 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 154)
    public final void method1061(int arg0) {
        if (arg0 != -1) {
            return;
        }
        this.field1947 = class107.field1605[this.field1948];
        field1957++;
        this.field1944 = (int) Math.sqrt((double) (this.field1952 * this.field1952 + this.field1954 * this.field1954 + this.field1953 * this.field1953));
        if (this.field1964 == 0) {
            this.field1964 = 1;
        }
        if (this.field1963 == 0) {
            this.field1959 = 2147483647L;
        } else if (this.field1963 == 1) {
            this.field1959 = (long) (this.field1944 * 8 / this.field1964);
            this.field1959 *= this.field1959;
        } else if (this.field1963 == 2) {
            this.field1959 = (long) (this.field1944 * 8 / this.field1964);
        }
        if (this.field1951) {
            this.field1944 *= -1;
        }
    }
}
