import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class127 extends class242 {

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Ljf;")
    public static class229 field2271 = class212.method1457((byte) 66, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Ljf;")
    public static class229 field2273 = class212.method1457((byte) 83, "::clientjs5drop");

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Ljf;")
    public static class229 field2263 = class212.method1457((byte) 120, "0");

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Ljf;")
    public static class229 field2272 = class212.method1457((byte) 105, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Ljf;")
    public static class229 field2268 = class212.method1457((byte) 103, "niveau ");

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Ljf;")
    public static class229 field2279 = class212.method1457((byte) 58, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "F")
    public static float field2276;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
    public int[] field2266;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[I")
    public int[] field2278;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "[I")
    public int[] field2280;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[Ldn;")
    public class231[] field2270;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "[Ldn;")
    public class231[] field2275;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[[[B")
    public byte[][][] field2277;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 26)
    public static void method898(int arg0) {
        if (arg0 != 0) {
            field2273 = (class229) null;
        }
        field2271 = null;
        field2263 = null;
        field2272 = null;
        field2273 = null;
        field2279 = null;
        field2268 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lkn;ILjava/lang/Object;)V", line = 54)
    public static final void method899(class198 arg0, int arg1, Object arg2) {
        field2262++;
        if (arg0.field3465 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field3465.peekEvent() != null; var3++) {
            class235.method1675((byte) -22, 1L);
        }
        if (arg1 > 96 && arg2 != null) {
            arg0.field3465.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBILbf;)V", line = 81)
    public static final void method900(int arg0, byte arg1, int arg2, class331 arg3) {
        field2265++;
        if (arg1 > -33) {
            field2279 = (class229) null;
        }
        if (arg3.field2000 == arg0 && arg0 != -1) {
            class194 var4 = class280.method1965(arg0, -107);
            int var5 = var4.field3379;
            if (var5 == 1) {
                arg3.field1993 = 0;
                arg3.field1990 = 0;
                arg3.field2016 = arg2;
                arg3.field2033 = 0;
                class305.method2083(var4, arg3.field2028, false, arg3.field1983, arg3.field1990, -64);
            }
            if (var5 == 2) {
                arg3.field1993 = 0;
            }
        } else if (arg0 == -1 || arg3.field2000 == -1 || class280.method1965(arg0, 89).field3387 >= class280.method1965(arg3.field2000, -105).field3387) {
            arg3.field1990 = 0;
            arg3.field2016 = arg2;
            arg3.field2000 = arg0;
            arg3.field1993 = 0;
            arg3.field2033 = 0;
            arg3.field1985 = arg3.field2006;
            if (arg3.field2000 != -1) {
                class305.method2083(class280.method1965(arg3.field2000, 64), arg3.field2028, false, arg3.field1983, arg3.field1990, -64);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lek;ZIIIZ)V", line = 135)
    public static final void method901(class185 arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class318.field5373 = 1;
        class184.field3191 = arg1;
        class186.field3267 = arg2;
        class165.field2835 = 10000;
        field2264++;
        if (arg5) {
            class132.field2321 = arg4;
            class211.field3634 = arg3;
            class240.field4230 = arg0;
        }
    }
}
