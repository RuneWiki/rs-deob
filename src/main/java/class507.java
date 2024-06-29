import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class507 implements class339 {

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lil;")
    public static class7 field7033 = new class7("LIVE", 0);

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "[[I")
    public static int[][] field7036 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "Ldn;")
    public static class438 field7035;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLos;)Lgl;", line = 4)
    public static final class514 method2912(byte arg0, class374 arg1) {
        if (arg0 <= 44) {
            method2912((byte) -92, null);
        }
        field7032++;
        return new class514(arg1.method2089(true), arg1.method2089(true), arg1.method2089(true), arg1.method2089(true), arg1.method2128(true), arg1.method2129(-125));
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 17)
    public static void method2913(byte arg0) {
        field7033 = null;
        if (arg0 < 119) {
            method2912((byte) 68, null);
        }
        field7035 = null;
        field7036 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[IJLjs;)Ljava/lang/String;", line = 32)
    public final String method1901(int arg0, int[] arg1, long arg2, class275 arg3) {
        field7034++;
        if (class62.field618 == arg3) {
            class279 var6 = class565.field8298.method2218(0, arg1[0]);
            return var6.method1581((int) arg2, -113);
        } else if (arg0 != 0) {
            return null;
        } else if (class295.field3805 == arg3 || class519.field7301 == arg3) {
            class607 var7 = class449.field6217.method2026((byte) -128, (int) arg2);
            return var7.field8805;
        } else if (class263.field3384 == arg3 || class197.field2380 == arg3 || class209.field2505 == arg3) {
            return class565.field8298.method2218(0, arg1[0]).method1581((int) arg2, -120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 67)
    public static final void method2914(int arg0, int arg1, int arg2, Class arg3) {
        class349 var4 = class383.field5070[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class61 var5 = var4.field4499; var5 != null; var5 = var5.field595) {
            class598 var6 = var5.field589;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8653 == arg1 && var6.field8650 == arg2) {
                class511.method2938(var6);
                return;
            }
        }
    }
}
