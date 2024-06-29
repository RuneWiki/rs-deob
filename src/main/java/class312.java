import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class312 extends class221 {

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "Lcg;")
    public static class10 field4905 = new class10(12, 0, 1, 0);

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public int field4906;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Ljava/lang/String;")
    public String field4902;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lza;I)V")
    public static final void method2094(class497 arg0, int arg1) {
        field4904++;
        if (class130.field1764.method2114((byte) -95) == 0) {
            return;
        }
        if (~class452.field7013 == arg1) {
            for (class500 var2 = (class500) class130.field1764.method2123(-107); var2 != null; var2 = (class500) class130.field1764.method2126((byte) 61)) {
                class337.field5262.method2081(var2.field7500 ? class358.field5565.field5430 : null, (byte) -108, var2.field7504, class315.field4923, var2.field7503, arg0, false, arg0, var2.field7499, false, var2.field7507, var2.field7508);
                var2.method3149(57);
            }
            class236.method1667(2318);
            return;
        }
        if (class164.field2374 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class164.field2374 = class497.method3044(class161.field2206, var3, 0, arg1 ^ 0x6B, 0, class339.field5294);
            class376.field5791 = class164.field2374.method1246(class310.method2082((byte) 121, 0, class130.field1767, class136.field1872), class175.method1110(class120.field1646, class136.field1872, 0), true);
        }
        for (class500 var4 = (class500) class130.field1764.method2123(-120); var4 != null; var4 = (class500) class130.field1764.method2126((byte) 61)) {
            class337.field5262.method2081(var4.field7500 ? class358.field5565.field5430 : null, (byte) -125, var4.field7504, class376.field5791, var4.field7503, class164.field2374, false, arg0, var4.field7499, false, var4.field7507, var4.field7508);
            var4.method3149(50);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IJ)V")
    public static final void method2095(int arg0, long arg1) {
        field4903++;
        int var3 = class171.field2505 + class358.field5565.field6417;
        int var4 = class58.field932 + class358.field5565.field6410;
        if ((class290.field4578 - var3) < -500 || (class290.field4578 - var3) > 500 || (class254.field4115 - var4) < -500 || (class254.field4115 - var4) > 500) {
            class290.field4578 = var3;
            class254.field4115 = var4;
        }
        if (class290.field4578 != var3) {
            int var5 = var3 - class290.field4578;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class290.field4578 += var6;
        }
        if (!class141.field1911.field6082) {
            class388.field5918 += (float) arg1 * class376.field5767 / 6.0F;
            class135.field1824 += (float) arg1 * class131.field1781 / 6.0F;
        }
        if (arg0 != 320) {
            return;
        }
        if (class254.field4115 != var4) {
            int var7 = var4 - class254.field4115;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class254.field4115 += var8;
        }
        class62.method457(3047);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method2096(byte arg0) {
        int var1 = -15 % ((-arg0 - 2) / 32);
        field4905 = null;
    }
}
