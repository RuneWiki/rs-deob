import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class168 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2174 = -1;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lbu;")
    public static class17 field2175 = new class17("WTQA", 2);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lao;")
    public static class191 field2178 = new class191(26, 1);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[[I")
    public static int[][] field2179 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLjava/lang/String;Lug;)I", line = 8)
    public static final int method987(byte arg0, String arg1, class396 arg2) {
        field2173++;
        if (arg0 != 46) {
            field2177 = 39;
        }
        int var3 = arg2.field5729;
        byte[] var4 = class285.method1714(-54, arg1);
        arg2.method2411(var4.length, (byte) 60);
        arg2.field5729 += class319.field4258.method2213(arg2.field5729, var4.length, 0, arg2.field5761, (byte) 122, var4);
        return arg2.field5729 - var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfo;BI)Lvi;", line = 31)
    public static final class379 method988(class361 arg0, byte arg1, int arg2) {
        field2172++;
        byte[] var3 = arg0.method2128(-2, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 20) {
                field2178 = null;
            }
            return new class379(var3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 49)
    public static void method989(byte arg0) {
        if (arg0 == 34) {
            field2179 = null;
            field2175 = null;
            field2178 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)J")
    public abstract long method985(int arg0);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public abstract void method986(int arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public abstract int method990(int arg0, int arg1);
}
