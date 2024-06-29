import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class400 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lmi;")
    public class420 field5256 = new class420();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field5259 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static final void method2291(int arg0) {
        if (arg0 != 27115) {
            return;
        }
        field5255++;
        try {
            if (class578.field8436 == 1) {
                int var1 = class390.field5159.method1534(64);
                if (var1 > 0 && class390.field5159.method1550(32624)) {
                    int var2 = var1 - class442.field6104;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class390.field5159.method1532((byte) -125, var2);
                } else {
                    class390.field5159.method1540((byte) -29);
                    class390.field5159.method1544((byte) 89);
                    class14.field111 = null;
                    if (class527.field7382 == null) {
                        class578.field8436 = 0;
                    } else {
                        class578.field8436 = 2;
                    }
                    class161.field1963 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class390.field5159.method1540((byte) -29);
            class161.field1963 = null;
            class578.field8436 = 0;
            class527.field7382 = null;
            class14.field111 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
    public static final boolean method2292(int arg0, int arg1, int arg2) {
        field5257++;
        boolean var3 = (arg2 & 0x37) == 0 ? class337.method1896(arg2, (byte) -84, arg1) : class402.method2299(arg2, arg0 ^ 0x40D7, arg1);
        return arg0 == 24791 ? var3 | (arg1 & 0x10000) != 0 | class342.method1908(arg1, false, arg2) : false;
    }
}
