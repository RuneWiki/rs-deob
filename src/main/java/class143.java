import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class143 {

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "[Lwfa;")
    private class388[] field1944;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "[[I")
    public static int[][] field1942 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[I")
    public static int[] field1948 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field1943 = 1;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Lae;")
    public static class351 field1949 = new class351();

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "J")
    private long field1941;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lwfa;")
    private class388 field1950;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BJLwfa;)V", line = 9)
    public final void method1002(byte arg0, long arg1, class388 arg2) {
        field1945++;
        if (arg2.field5597 != null) {
            arg2.method2381(15735);
        }
        class388 var5 = this.field1944[(int) (arg1 & (long) (this.field1946 - 1))];
        arg2.field5597 = var5.field5597;
        if (arg0 >= -16) {
            this.field1944 = null;
        }
        arg2.field5596 = var5;
        arg2.field5597.field5596 = arg2;
        arg2.field5602 = arg1;
        arg2.field5596.field5597 = arg2;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Lwfa;", line = 31)
    public final class388 method1003(byte arg0) {
        field1951++;
        if (this.field1950 == null) {
            return null;
        } else if (arg0 >= -9) {
            return null;
        } else {
            class388 var2 = this.field1944[(int) (this.field1941 & (long) (this.field1946 - 1))];
            while (this.field1950 != var2) {
                if (this.field1950.field5602 == this.field1941) {
                    class388 var3 = this.field1950;
                    this.field1950 = this.field1950.field5596;
                    return var3;
                }
                this.field1950 = this.field1950.field5596;
            }
            this.field1950 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V", line = 64)
    public static final void method1004(byte arg0) {
        if (arg0 > -111) {
            field1949 = null;
        }
        field1947++;
        class100.field1440.method2219(-5300);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)Lwfa;", line = 75)
    public final class388 method1005(long arg0, int arg1) {
        if (arg1 != -23630) {
            this.method1002((byte) 52, 118L, null);
        }
        field1952++;
        this.field1941 = arg0;
        class388 var4 = this.field1944[(int) (arg0 & (long) (this.field1946 - 1))];
        for (this.field1950 = var4.field5596; this.field1950 != var4; this.field1950 = this.field1950.field5596) {
            if (this.field1950.field5602 == arg0) {
                class388 var5 = this.field1950;
                this.field1950 = this.field1950.field5596;
                return var5;
            }
        }
        this.field1950 = null;
        return null;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V", line = 110)
    public static void method1006(byte arg0) {
        field1949 = null;
        field1948 = null;
        field1942 = null;
        if (arg0 >= -59) {
            field1943 = -74;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V", line = 144)
    public class143(int arg0) {
        this.field1946 = arg0;
        this.field1944 = new class388[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class388 var3 = this.field1944[var2] = new class388();
            var3.field5596 = var3;
            var3.field5597 = var3;
        }
    }
}
