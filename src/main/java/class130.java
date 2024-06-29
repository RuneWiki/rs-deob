import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class130 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field2206 = new int[2048];

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lvn;")
    public static class96 field2207 = null;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lbm;")
    public static class307 field2205;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 4)
    public static void method857(byte arg0) {
        field2206 = null;
        field2207 = null;
        field2205 = null;
        if (arg0 != 75) {
            method857((byte) 87);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V", line = 20)
    public static final void method858(int arg0, int arg1) {
        field2203++;
        if (class165.method1056(arg1, (byte) 24)) {
            class114.method740(class138.field2300[arg1], arg0, -111);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLkl;)Lkl;", line = 35)
    public static final class68 method859(boolean arg0, class68 arg1) {
        field2204++;
        if (arg1.field1308 != -1) {
            return class319.method2196(-1351736944, arg1.field1308);
        }
        int var2 = arg1.field1284 >>> 16;
        class295 var3 = new class295(class185.field3013);
        for (class222 var4 = (class222) var3.method1974(0); var4 != null; var4 = (class222) var3.method1977(-1)) {
            if (var4.field3514 == var2) {
                return class319.method2196(-1351736944, (int) var4.field702);
            }
        }
        if (arg0) {
            field2202 = 20;
        }
        return null;
    }
}
