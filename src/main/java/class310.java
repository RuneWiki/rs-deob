import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class310 {

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lcd;")
    public static class64 field5268 = class44.method335((byte) 71, "::fpsoff");

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Lcd;")
    public static class64 field5269 = class44.method335((byte) 71, "::tele ");

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static int[] field5265 = new int[1000];

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lcd;")
    public static class64 field5271 = class44.method335((byte) 71, ")1");

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
    public static int[] field5263;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method2147(boolean arg0) {
        if (arg0) {
            field5264++;
            class17.field353.method1214(-74, 42);
            class2.field13++;
            class17.field353.method145(112, class265.field4562);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[S)[S", line = 35)
    public static final short[] method2148(int arg0, short[] arg1) {
        field5272++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class95.method714(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lcd;", line = 50)
    public static final class64 method2149(int arg0, byte arg1) {
        field5266++;
        int var2 = 110 / ((46 - arg1) / 39);
        return class268.method1880(false, 10, 3, arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 60)
    public static void method2150(byte arg0) {
        field5269 = null;
        field5265 = null;
        field5263 = null;
        if (arg0 == 28) {
            field5268 = null;
            field5271 = null;
        }
    }
}
