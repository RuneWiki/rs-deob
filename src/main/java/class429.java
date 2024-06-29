import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class429 extends class117 {

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field5909 = 0;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "B")
    public static byte field5917;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "Lsq;")
    private class454 field5912;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)I")
    public final int method2516(int arg0, int arg1, byte arg2) {
        field5911++;
        if (this.field5912 == null) {
            return arg1;
        }
        if (arg2 <= 72) {
            field5917 = -48;
        }
        class128 var4 = (class128) this.field5912.method2614((long) arg0, 57);
        return var4 == null ? arg1 : var4.field1815;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Llk;B)V")
    public final void method2517(class425 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                field5915++;
                if (arg1 < 68) {
                    field5917 = -68;
                    return;
                }
                return;
            }
            this.method2518(var3, 25941, arg0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILlk;)V")
    private final void method2518(int arg0, int arg1, class425 arg2) {
        field5914++;
        if (arg1 != 25941 || arg0 != 249) {
            return;
        }
        int var4 = arg2.method2503(true);
        if (this.field5912 == null) {
            int var5 = class406.method2388(var4, arg1 - 26062);
            this.field5912 = new class454(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method2503(true) == 1;
            int var8 = arg2.method2498(3);
            class180 var9;
            if (var7) {
                var9 = new class329(arg2.method2464(false));
            } else {
                var9 = new class128(arg2.method2502((byte) -86));
            }
            this.field5912.method2620((long) var8, var9, false);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
    public static final void method2519(byte arg0, int arg1) {
        field5913++;
        class235.field3326.method666(arg1, false);
        if (arg0 > -68) {
            method2519((byte) -70, -91);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method2520(int arg0, byte arg1, String arg2) {
        field5910++;
        if (this.field5912 == null) {
            return arg2;
        }
        class329 var4 = (class329) this.field5912.method2614((long) arg0, -88);
        if (arg1 == -12) {
            return var4 == null ? arg2 : var4.field4535;
        } else {
            return null;
        }
    }
}
