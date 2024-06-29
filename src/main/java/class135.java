import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class135 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[J")
    public static long[] field2061 = new long[1000];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[J")
    public static long[] field2060 = new long[256];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Llm;")
    public static class210 field2062;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lbf;")
    public static class227 field2056;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lgl;")
    public static class262 field2054;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[[[I")
    public static int[][][] field2058;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lij;", line = 12)
    public static final class178 method987(boolean arg0) {
        if (arg0) {
            return (class178) null;
        } else {
            field2059++;
            return class250.field3729.length > class136.field2081 ? class250.field3729[class136.field2081++] : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[B)Ljl;", line = 48)
    public static final class112 method988(int arg0, byte[] arg1) {
        field2057++;
        if (arg1 == null) {
            return null;
        }
        class112 var2 = new class112(arg1, class203.field3039, class184.field2754, class203.field3051, class160.field2403, class205.field3083);
        class10.method49((byte) 113);
        if (arg0 != -1269342426) {
            method987(false);
        }
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2060[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILlm;Llm;I)Ldh;", line = 103)
    public static final class134 method989(boolean arg0, int arg1, class210 arg2, class210 arg3, int arg4) {
        field2055++;
        boolean var5 = true;
        int[] var6 = arg3.method1442(arg4, (byte) 104);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1449((byte) -62, var6[var7], arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method1449((byte) -61, var9, 0);
                } else {
                    var10 = arg2.method1449((byte) -128, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg1 >= -65) {
            field2058 = (int[][][]) ((int[][][]) null);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class134(arg3, arg2, arg4, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 154)
    public static void method990(byte arg0) {
        field2062 = null;
        field2056 = null;
        field2054 = null;
        field2058 = (int[][][]) null;
        field2060 = null;
        if (arg0 != 67) {
            field2060 = (long[]) null;
        }
        field2061 = null;
    }
}
