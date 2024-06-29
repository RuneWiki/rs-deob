import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class301 extends class45 {

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field4846;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[[I")
    public static int[][] field4844 = new int[5][5000];

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field4849 = 0;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
    public static int[] field4850 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lth;")
    public static class57 field4842;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 9)
    public static void method2154(int arg0) {
        if (arg0 > 42) {
            field4850 = null;
            field4844 = (int[][]) null;
            field4842 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)Leb;", line = 26)
    public static final class6 method2155(int arg0, int arg1, int arg2, int arg3) {
        field4843++;
        int var4 = arg1 << 8 | arg0;
        if (arg2 != 5000) {
            field4849 = 59;
        }
        class6 var5 = (class6) class260.field4363.method2147((byte) -90, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class131.field2224.method476((byte) -7, class131.field2224.method479(arg2 - 4883, var4));
        if (var6 == null) {
            int var7 = arg3 + 65536 << 8 | arg0;
            class6 var8 = (class6) class260.field4363.method2147((byte) 59, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class131.field2224.method476((byte) -7, class131.field2224.method479(123, var7));
            if (var9 == null) {
                int var10 = arg0 | 0xFFFF00;
                class6 var11 = (class6) class260.field4363.method2147((byte) 49, (long) var10 << 16);
                if (var11 != null) {
                    return var11;
                }
                byte[] var12 = class131.field2224.method476((byte) -7, class131.field2224.method479(arg2 - 4878, var10));
                if (var12 == null) {
                    return null;
                } else if (var12.length > 1) {
                    class6 var13 = class125.method980(2, var12);
                    var13.field52 = arg0;
                    class260.field4363.method2149(var13, arg2 - 37563, (long) var10 << 16);
                    return var13;
                } else {
                    return null;
                }
            } else if (var9.length <= 1) {
                return null;
            } else {
                class6 var14 = class125.method980(2, var9);
                var14.field52 = arg0;
                class260.field4363.method2149(var14, -32563, (long) var7 << 16);
                return var14;
            }
        } else if (var6.length > 1) {
            class6 var15 = class125.method980(2, var6);
            var15.field52 = arg0;
            class260.field4363.method2149(var15, -32563, (long) var4 << 16);
            return var15;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 107)
    public static final void method2156(int arg0) {
        class165.field2617.method2327(1);
        if (arg0 != 0) {
            method2154(68);
        }
        field4848++;
        class261.field4394.method2327(1);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 117)
    public class301() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V", line = 119)
    public class301(int arg0) {
        this.field4846 = arg0;
    }
}
