import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class296 {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field5010 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field5012 = 1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lwa;")
    public static class284[] field5007;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[S")
    public static short[] field5006;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2028(int arg0) {
        field5008++;
        if (arg0 == -17337) {
            class53.field656.method1429((byte) 120);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I", line = 32)
    public static final int method2029(int arg0, int arg1, int arg2) {
        field5011++;
        class143 var3 = (class143) class259.field4390.method493((long) arg2, 70);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= ~arg0 && arg0 < var3.field2207.length) {
            return var3.field2207[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 87)
    public static void method2030(byte arg0) {
        field5007 = null;
        int var1 = -48 % ((28 - arg0) / 32);
        field5006 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z", line = 97)
    public static final boolean method2031(byte arg0) {
        field5005++;
        if (class67.field888 != 0) {
            try {
                return !(Boolean) class91.field1409.method1180(0, class51.field622.field1000);
            } catch (Throwable var3) {
            }
        }
        int var2 = 14 / ((arg0 + 45) / 62);
        return true;
    }
}
