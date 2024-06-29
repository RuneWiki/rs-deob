import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class182 {

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    private int field2138 = 0;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lhd;")
    private class694 field2136;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[[B")
    public static byte[][] field2135 = new byte[1000][];

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field2141 = 0;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Lkd;")
    private class263 field2137;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1081(int arg0, int arg1) {
        class397.field5042 = arg0;
        field2145++;
        if (arg1 != 0) {
            method1086(2L, 1);
        }
        class208 var2 = class392.field5012;
        synchronized (class392.field5012) {
            class392.field5012.method1218(121);
        }
        class208 var3 = class442.field5559;
        synchronized (class442.field5559) {
            class442.field5559.method1218(101);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lkd;", line = 22)
    public final class263 method1082(byte arg0) {
        if (arg0 <= 22) {
            method1081(-2, -76);
        }
        field2139++;
        if (this.field2138 > 0 && this.field2136.field9619[this.field2138 - 1] != this.field2137) {
            class263 var2 = this.field2137;
            this.field2137 = var2.field3320;
            return var2;
        }
        while (this.field2138 < this.field2136.field9613) {
            class263 var3 = this.field2136.field9619[this.field2138++].field3320;
            if (this.field2136.field9619[this.field2138 - 1] != var3) {
                this.field2137 = var3.field3320;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 59)
    public static void method1083(int arg0) {
        if (arg0 != -2167) {
            method1084((byte) -59, -91);
        }
        field2135 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)Z", line = 72)
    public static final boolean method1084(byte arg0, int arg1) {
        field2142++;
        int var2 = -41 / ((38 - arg0) / 36);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 101)
    public class182() {
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lhd;)V", line = 112)
    public class182(class694 arg0) {
        this.field2136 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lkd;", line = 90)
    public final class263 method1085(int arg0) {
        field2144++;
        if (arg0 <= 18) {
            this.field2136 = null;
        }
        this.field2138 = 0;
        return this.method1082((byte) 29);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 120)
    public static final String method1086(long arg0, int arg1) {
        field2143++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 != -30150) {
            field2141 = -14;
        }
        if ((arg0 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg0 != 0L) {
            long var7 = arg0;
            arg0 /= 37L;
            var6.append(class680.field9257[(int) (var7 - (arg0 * 37L))]);
        }
        return var6.reverse().toString();
    }
}
