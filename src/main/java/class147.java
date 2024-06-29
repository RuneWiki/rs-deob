import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class147 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static volatile int field2057 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lfi;")
    public static class331 field2055 = new class331(4);

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lcs;")
    public static class189 field2061 = new class189(16);

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lvn;")
    public static class169 field2063 = new class169();

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
    public static int[] field2058;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[I")
    public static int[] field2064;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "[Lkh;")
    public static class11[] field2062;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILbk;I)V", line = 5)
    public static final void method871(int arg0, class211 arg1, int arg2) {
        if (class348.field5086 != null) {
            try {
                class348.field5086.method2579(0L, 14653);
                class348.field5086.method2580(24, arg1.field2867, 0, arg0);
            } catch (Exception var3) {
            }
        }
        field2054++;
        if (arg2 != 0) {
            field2061 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lff;", line = 30)
    public static final class7 method872(int arg0, int arg1) {
        field2056++;
        class7 var2 = (class7) class136.field1908.method410((byte) -34, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class12.field125.method361(0, 45, arg0);
        } else {
            var3 = class444.field6494.method361(0, 68, arg0 & 0x7FFF);
        }
        class7 var4 = new class7();
        int var5 = 7 % ((arg1 + 26) / 36);
        if (var3 != null) {
            var4.method64((byte) -74, new class211(var3));
        }
        if (arg0 >= 32768) {
            var4.method69(32768);
        }
        class136.field1908.method414(var4, (byte) 66, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 62)
    public static void method873(int arg0) {
        if (arg0 != -21040) {
            field2055 = null;
        }
        field2063 = null;
        field2061 = null;
        field2058 = null;
        field2064 = null;
        field2062 = null;
        field2055 = null;
    }
}
