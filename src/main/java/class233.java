import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class233 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Loc;")
    public static class151 field4287 = class137.method873(2, "");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field4288 = 2301979;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    public static boolean field4295 = false;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[J")
    public static long[] field4290 = new long[200];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public int field4298;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[B")
    public byte[] field4285;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[B")
    public byte[] field4293;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[[[I")
    public static int[][][] field4286;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)Loc;")
    public static final class151 method1524(int arg0, String arg1) {
        int var2 = -106 / ((28 - arg0) / 34);
        byte[] var3;
        try {
            var3 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var3 = arg1.getBytes();
        }
        field4282++;
        class151 var4 = new class151();
        var4.field2690 = 0;
        var4.field2736 = var3;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != 0) {
                var3[var4.field2690++] = var3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        if (arg0 != 123) {
            field4287 = null;
        }
        field4290 = null;
        field4287 = null;
        field4286 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BIIII)V")
    public static final void method1526(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class79.field1526 <= arg2 - arg3 && class25.field524 >= arg2 + arg3 && field4281 <= arg4 - arg3 && arg3 + arg4 <= class154.field2793) {
            class204.method1288(arg2, (byte) 35, arg3, arg4, arg1);
        } else {
            class28.method214(arg4, -7205, arg1, arg3, arg2);
        }
        field4289++;
        if (arg0 <= 33) {
            field4287 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
    public static final boolean method1527(int arg0, int arg1, int arg2) {
        int var3 = class218.field3792[arg0][arg1][arg2];
        if (-class11.field201 == var3) {
            return false;
        } else if (class11.field201 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class9.method53(var4 + 1, field4286[arg0][arg1][arg2], var5 + 1) && class9.method53(var4 + 128 - 1, field4286[arg0][arg1 + 1][arg2], var5 + 1) && class9.method53(var4 + 128 - 1, field4286[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class9.method53(var4 + 1, field4286[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class218.field3792[arg0][arg1][arg2] = class11.field201;
                return true;
            } else {
                class218.field3792[arg0][arg1][arg2] = -class11.field201;
                return false;
            }
        }
    }
}
