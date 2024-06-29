import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class158 extends class282 {

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "[Lul;")
    public class43[] field2707;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "Ljf;")
    private static class229 field2697 = class212.method1457((byte) 81, "red:");

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "Ljf;")
    public static class229 field2700 = field2697;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "Ljf;")
    public static class229 field2702 = class212.method1457((byte) 94, " <col=ffff00>");

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "Ljf;")
    public static class229 field2706 = class212.method1457((byte) 84, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "Ljf;")
    public static class229 field2703 = field2697;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Z", line = 17)
    public final boolean method1058(int arg0, byte arg1) {
        if (arg1 != 107) {
            method1060(33, 9, (byte) 9);
        }
        field2701++;
        return this.field2707[arg0].field787;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 29)
    public static void method1059(int arg0) {
        field2703 = null;
        field2706 = null;
        if (arg0 == 255) {
            field2700 = null;
            field2702 = null;
            field2697 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)V", line = 44)
    public static final void method1060(int arg0, int arg1, byte arg2) {
        field2698++;
        class122 var3 = class323.method2175(12, arg0, -25873);
        if (arg2 != -109) {
            method1059(-116);
        }
        var3.method862(arg2 ^ 0x711F);
        var3.field2144 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(B)Lkb;", line = 76)
    public static final class35 method1061(byte arg0) {
        field2705++;
        int var1 = class6.field71[0] * class232.field4025[0];
        byte[] var2 = class21.field357[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class64.field1115[class305.method2086(var2[var4], 255)];
        }
        class35 var5;
        if (class108.field1900) {
            var5 = new class326(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], var3);
        } else {
            var5 = new class159(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], var3);
        }
        if (arg0 >= -45) {
            field2702 = (class229) null;
        }
        class62.method466((byte) 118);
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V", line = 120)
    public static final void method1062(boolean arg0, int arg1) {
        for (class242 var2 = class224.field3834.method1884((byte) 120); var2 != null; var2 = class224.field3834.method1886(-128)) {
            if ((var2.field4265 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1747((byte) -62);
            }
        }
        field2704++;
        if (arg0) {
            method1061((byte) -14);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lek;Lek;IZ)V", line = 141)
    public class158(class185 arg0, class185 arg1, int arg2, boolean arg3) {
        class303 var5 = new class303();
        int var6 = arg0.method1268(arg2, (byte) 109);
        this.field2707 = new class43[var6];
        int[] var7 = arg0.method1280(arg2, (byte) 80);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class113 var9 = null;
            byte[] var10 = arg0.method1275(var7[var8], arg2, -5211);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class113 var12 = (class113) var5.method2078(-115); var12 != null; var12 = (class113) var5.method2080(5)) {
                if (var12.field2046 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1272(var11, 125, 0);
                } else {
                    var13 = arg1.method1272(0, 56, var11);
                }
                var9 = new class113(var11, var13);
                var5.method2079(var9, 60);
            }
            this.field2707[var7[var8]] = new class43(var10, var9);
        }
    }
}
