import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class276 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lir;")
    public static class185 field4050;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lir;")
    public static class185 field4052;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lvn;")
    public static class431 field4054;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "[Ll;")
    public static class315[] field4053;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1816(int arg0) {
        field4051++;
        class408 var1 = null;
        try {
            if (arg0 < 62) {
                return;
            }
            class225 var2 = class63.field948.method2396(true);
            while (var2.field3104 == 0) {
                class31.method245(1L, -65);
            }
            if (var2.field3104 == 1) {
                var1 = (class408) var2.field3105;
                byte[] var3 = new byte[(int) var1.method2580(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2582(var4, var3.length - var4, (byte) -127, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class203.method1345((byte) -79, new class341(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2584((byte) -71);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)V", line = 58)
    public static final void method1817(byte arg0, int arg1, int arg2) {
        field4055++;
        if (class338.method2195(arg1, 6173)) {
            int var3 = -118 % ((arg0 + 30) / 43);
            class173.method1158(class4.field71[arg1], false, arg2);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 75)
    public static void method1818(byte arg0) {
        if (arg0 != -45) {
            field4054 = null;
        }
        field4053 = null;
        field4052 = null;
        field4054 = null;
        field4050 = null;
    }
}
