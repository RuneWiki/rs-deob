import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class297 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lmh;")
    public static class62 field5071 = class201.method1405(true, "cookieprefix");

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lsg;")
    public static class191 field5074 = null;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Lim;")
    public static class175 field5075 = null;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "B")
    public static byte field5065;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BZ)V", line = 6)
    public static final void method2007(byte arg0, boolean arg1) {
        field5070++;
        int var2 = -112 / ((-arg0 - 39) / 41);
        byte[][] var3;
        byte var4;
        if (arg1) {
            var3 = class256.field4327;
            var4 = 1;
        } else {
            var3 = class196.field3328;
            var4 = 4;
        }
        int var5 = var3.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = (class39.field608[var6] & 0xFF) * 64 - class290.field4936;
            int var8 = (class39.field608[var6] >> 8) * 64 - class120.field2006;
            byte[] var9 = var3[var6];
            if (var9 != null) {
                class209.method1460(117);
                class232.method1643(119, var7, class2.field30 * 8 - 48, class237.field4066 * 8 + -48, var9, arg1, class250.field4244, var8);
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (class39.field608[var10] >> 8) * 64 - class120.field2006;
            int var12 = (class39.field608[var10] & 0xFF) * 64 - class290.field4936;
            byte[] var13 = var3[var10];
            if (var13 == null && class237.field4066 < 800) {
                class209.method1460(107);
                for (int var14 = 0; var14 < var4; var14++) {
                    class229.method1619(64, var12, var14, var11, -105, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLmi;)Lwk;", line = 95)
    public static final class192 method2008(byte arg0, class92 arg1) {
        field5067++;
        int var2 = -79 / ((-arg0 - 53) / 37);
        return new class192(arg1.method699((byte) -64), arg1.method699((byte) -55), arg1.method699((byte) -55), arg1.method699((byte) -110), arg1.method737(-1), arg1.method737(-1), arg1.method702(-1));
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lmi;B)V", line = 108)
    public final void method2009(class92 arg0, byte arg1) {
        if (arg1 != 52) {
            field5065 = -124;
        }
        while (true) {
            int var3 = arg0.method702(-1);
            if (var3 == 0) {
                field5076++;
                return;
            }
            this.method2011(var3, -128, arg0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lpl;", line = 139)
    public static final class268 method2010(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class268 var4 = var3.field2720;
            var3.field2720 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILmi;)V", line = 154)
    private final void method2011(int arg0, int arg1, class92 arg2) {
        field5072++;
        if (arg0 == 1) {
            this.field5064 = arg2.method721(50);
            this.field5069 = arg2.method702(-1);
            this.field5066 = arg2.method702(-1);
        }
        if (arg1 > -126) {
            this.method2009((class92) null, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 179)
    public static void method2012(boolean arg0) {
        field5075 = null;
        if (arg0) {
            field5075 = (class175) null;
        }
        field5074 = null;
        field5071 = null;
    }
}
