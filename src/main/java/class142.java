import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class142 {

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    private int field1968 = -1;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
    private int field1975 = 0;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "Lfha;")
    private class522 field1972 = new class522();

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "Z")
    public boolean field1979 = false;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "[Lva;")
    private class500[] field1974;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "[[[I")
    private int[][][] field1976;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "[Z")
    public static boolean[] field1966 = new boolean[100];

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    public static int field1978 = -2;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "Lqk;")
    public static class148 field1964 = new class148(112, -1);

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 8)
    public final void method929(int arg0) {
        if (arg0 >= -12) {
            field1978 = 106;
        }
        for (int var2 = 0; var2 < this.field1965; var2++) {
            this.field1976[var2][0] = null;
            this.field1976[var2][1] = null;
            this.field1976[var2][2] = null;
            this.field1976[var2] = null;
        }
        field1970++;
        this.field1974 = null;
        this.field1976 = null;
        this.field1972.method3122(0);
        this.field1972 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I", line = 35)
    public final int[][] method930(int arg0, int arg1) {
        field1977++;
        if (arg0 != 29784) {
            return null;
        } else if (this.field1965 == this.field1963) {
            this.field1979 = this.field1974[arg1] == null;
            this.field1974[arg1] = class332.field4256;
            return this.field1976[arg1];
        } else if (this.field1965 == 1) {
            this.field1979 = this.field1968 != arg1;
            this.field1968 = arg1;
            return this.field1976[0];
        } else {
            class500 var3 = this.field1974[arg1];
            if (var3 == null) {
                this.field1979 = true;
                if (this.field1965 <= this.field1975) {
                    class500 var4 = (class500) this.field1972.method3114(-78);
                    var3 = new class500(arg1, var4.field6995);
                    this.field1974[var4.field6996] = null;
                    var4.method3065(-17363);
                } else {
                    var3 = new class500(arg1, this.field1975);
                    this.field1975++;
                }
                this.field1974[arg1] = var3;
            } else {
                this.field1979 = false;
            }
            this.field1972.method3124(var3, (byte) 112);
            return this.field1976[var3.field6995];
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V", line = 105)
    public static void method931(int arg0) {
        field1964 = null;
        field1966 = null;
        if (arg0 < 115) {
            field1964 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)Z", line = 117)
    public static final boolean method932(int arg0, int arg1, int arg2) {
        field1967++;
        if (arg1 != 0) {
            method931(72);
        }
        return (arg0 & 0x60000) != 0 | class551.method3292(true, arg0, arg2) || class712.method3998((byte) 100, arg2, arg0);
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)[[[I", line = 129)
    public final int[][][] method933(int arg0) {
        if (arg0 <= 9) {
            this.method930(106, 118);
        }
        field1969++;
        if (this.field1965 != this.field1963) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1965; var2++) {
            this.field1974[var2] = class332.field4256;
        }
        return this.field1976;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)I", line = 154)
    public static final int method934(byte arg0) {
        if (arg0 == -88) {
            field1973++;
            return class589.field8461 == 1 ? class720.field10169 : 0;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(III)V", line = 195)
    public class142(int arg0, int arg1, int arg2) {
        this.field1963 = arg1;
        this.field1965 = arg0;
        this.field1974 = new class500[this.field1963];
        this.field1976 = new int[this.field1965][3][arg2];
    }
}
