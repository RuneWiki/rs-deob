import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class131 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[S")
    public short[] field2143;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[S")
    public short[] field2141;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "J")
    public long field2148;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public int[] field2139;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ldia;")
    public static class235 field2140 = new class235("", 16);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lwu;")
    public static class376 field2142;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[[Lnt;")
    public static class224[][] field2147;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
    public static final int method1023(int arg0, byte arg1) {
        if (arg1 >= -64) {
            return 23;
        }
        field2146++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2147 = null;
        field2140 = null;
        if (arg0 != 0) {
            field2140 = null;
        }
        field2142 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[Lvfa;I)V")
    public static final void method1025(int arg0, class672[] arg1, int arg2) {
        field2145++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class672 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field9239 == 0) {
                    if (var4.field9240 != null) {
                        method1025(arg0, var4.field9240, arg2);
                    }
                    class8 var5 = (class8) class350.field4925.method2135((long) var4.field9200, (byte) 31);
                    if (var5 != null) {
                        class2.method18(arg2, var5.field161, (byte) -89);
                    }
                }
                if (arg2 == 0 && var4.field9184 != null) {
                    class309 var6 = new class309();
                    var6.field4435 = var4;
                    var6.field4439 = var4.field9184;
                    class182.method1249(var6);
                }
                if (arg2 == 1 && var4.field9220 != null) {
                    if (var4.field9277 >= 0) {
                        class672 var7 = class21.method225(65535, var4.field9200);
                        if (var7 == null || var7.field9240 == null || var7.field9240.length <= var4.field9277 || var7.field9240[var4.field9277] != var4) {
                            continue;
                        }
                    }
                    class309 var8 = new class309();
                    var8.field4435 = var4;
                    var8.field4439 = var4.field9220;
                    class182.method1249(var8);
                }
            }
        }
        if (arg0 != 6409) {
            field2147 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(J[I[S[S)V")
    public class131(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field2143 = arg3;
        this.field2141 = arg2;
        this.field2148 = arg0;
        this.field2139 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    protected class131() {
    }
}
