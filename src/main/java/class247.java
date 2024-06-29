import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class247 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    private int field3694 = 0;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lcm;")
    private class382 field3696;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3700 = new Rectangle[100];

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lpf;")
    public static class425 field3701;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lnn;")
    public static class151 field3704;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lnr;")
    private class97 field3699;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[[Ltg;")
    public static class451[][] field3702;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lnr;")
    public final class97 method1506(int arg0) {
        field3695++;
        this.field3694 = arg0;
        return this.method1509((byte) -121);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Liq;Liq;Liq;I)V")
    public static final void method1507(class134 arg0, class134 arg1, class134 arg2, int arg3) {
        class398.field5950 = arg0;
        field3698++;
        class463.method2855(arg1, arg2, arg3 ^ 0xFFFFFF8C);
        if (arg3 != 0) {
            field3701 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public static void method1508(int arg0) {
        field3704 = null;
        field3702 = null;
        field3701 = null;
        if (arg0 != 0) {
            field3701 = null;
        }
        field3700 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Lnr;")
    public final class97 method1509(byte arg0) {
        field3697++;
        if (this.field3694 > 0 && this.field3696.field5565[this.field3694 - 1] != this.field3699) {
            class97 var2 = this.field3699;
            this.field3699 = var2.field1331;
            return var2;
        }
        if (arg0 >= -23) {
            method1510(-83, 89, 53, -117, (byte) -40);
        }
        while (this.field3696.field5560 > this.field3694) {
            class97 var3 = this.field3696.field5565[this.field3694++].field1331;
            if (this.field3696.field5565[this.field3694 - 1] != var3) {
                this.field3699 = var3.field1331;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lcm;)V")
    public class247(class382 arg0) {
        this.field3696 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIB)V")
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg1 >= class192.field2917 && arg1 <= class39.field497) {
            int var5 = class198.method1192(class189.field2831, class204.field3060, arg2, arg4 ^ 0xFFFFFF8A);
            int var6 = class198.method1192(class189.field2831, class204.field3060, arg3, -3);
            class110.method676(var5, arg1, arg4 ^ 0x8077, var6, arg0);
        }
        if (arg4 == 119) {
            field3693++;
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field3700[var0] = new Rectangle();
        }
        field3701 = new class425(58, 5);
        field3703 = 0;
        field3704 = new class151("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
    }
}
