import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class343 extends class332 {

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5323 = "Examine";

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "J")
    public static volatile long field5325 = 0L;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lan;")
    public static class337 field5330 = new class337();

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[[I")
    public static int[][] field5326;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILlc;I)[Lhi;", line = 10)
    public static final class307[] method2370(int arg0, int arg1, class175 arg2, int arg3) {
        field5328++;
        if (class304.method2132((byte) -94, arg0, arg1, arg2)) {
            return arg3 > -21 ? (class307[]) null : class106.method619(4783);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(BI)I", line = 27)
    public static final int method2371(byte arg0, int arg1) {
        if (arg0 > -41) {
            field5325 = 83L;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        field5331++;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 55)
    public static void method2372(byte arg0) {
        field5323 = null;
        field5330 = null;
        int var1 = 65 / ((-arg0 - 14) / 57);
        field5326 = (int[][]) null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lwn;", line = 68)
    public static final class30 method2373(int arg0, int arg1) {
        if (arg0 > -45) {
            field5330 = (class337) null;
        }
        class30 var2 = (class30) class159.field2190.method1562(0, (long) arg1);
        field5327++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field914.method1199(28815, arg1, 11);
        class30 var4 = new class30();
        if (var3 != null) {
            var4.method184(new class107(var3), -1);
        }
        class159.field2190.method1565((long) arg1, var4, (byte) -120);
        return var4;
    }
}
