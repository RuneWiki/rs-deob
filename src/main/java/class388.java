import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class388 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    public static int[] field5273 = new int[14];

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljp;")
    public static class236 field5270 = new class236(260);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lvj;")
    public static class304 field5275 = new class304("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lfi;")
    public class388 field5271;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lfi;")
    public class388 field5274;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZLcr;)V")
    public static final void method2290(int arg0, boolean arg1, class403 arg2) {
        int var3 = 8 / ((arg0 - 67) / 51);
        field5272++;
        int var4 = arg2.field5473 == 0 ? arg2.field5450 : arg2.field5473;
        int var5 = arg2.field5472 == 0 ? arg2.field5404 : arg2.field5472;
        class483.method2787(class238.field3185[arg2.field5431 >> 16], var5, false, arg2.field5431, arg1, var4);
        if (arg2.field5420 != null) {
            class483.method2787(arg2.field5420, var5, false, arg2.field5431, arg1, var4);
        }
        class301 var6 = (class301) class27.field457.method182((long) arg2.field5431, (byte) 107);
        if (var6 != null) {
            class336.method1922(var5, var4, var6.field3982, arg1, -15904);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method2291(int arg0) {
        field5269++;
        if (this.field5271 == null) {
            return;
        }
        if (arg0 > -78) {
            method2292(46, -11, 80, -57, -49);
        }
        this.field5271.field5274 = this.field5274;
        this.field5274.field5271 = this.field5271;
        this.field5271 = null;
        this.field5274 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
    public static final void method2292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5268++;
        class253 var5 = class332.method1911(arg0, (byte) -125, 10);
        var5.method1522(0);
        var5.field3358 = arg3;
        var5.field3355 = arg4;
        if (arg2 < 0) {
            var5.field3356 = arg1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method2293(boolean arg0) {
        field5273 = null;
        field5275 = null;
        field5270 = null;
        if (arg0) {
            field5275 = null;
        }
    }
}
