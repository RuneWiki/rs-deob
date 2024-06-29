import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class112 extends RuntimeException {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Ljava/lang/String;")
    public String field2016;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2010;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lqfa;")
    public static class85 field2015 = new class85(95, -1);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "S")
    public static short field2018 = 256;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2019 = 0;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field2017;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2017 = null;
        field2015 = null;
        if (arg0 != 0) {
            method1010(-27, null, -30, -5);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
    public static final int method1007(int arg0, int arg1, int arg2) {
        field2012++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return arg2 == 31185 ? var3 : -51;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)Z")
    public static final boolean method1008(byte arg0, int arg1, int arg2) {
        if (arg0 != -52) {
            method1010(62, null, 70, -5);
        }
        field2014++;
        return class88.method866((byte) -20, arg2, arg1) & class651.method3717(arg1, -126, arg2);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BIII)V")
    public static final void method1009(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = class527.field7429.field2659 * arg1 >> 8;
        int var5 = 50 / ((-arg0 - 36) / 39);
        field2013++;
        if (var4 != 0 && arg2 != -1) {
            class444.method2671(class325.field4766, var4, false, 6408, arg2, 0);
            class552.field7822 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class112(Throwable arg0, String arg1) {
        this.field2016 = arg1;
        this.field2010 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILom;II)Lai;")
    public static final class557 method1010(int arg0, class344 arg1, int arg2, int arg3) {
        field2011++;
        class61 var4 = new class61(arg1.method2216(arg0, arg3, true));
        class557 var5 = new class557(arg3, var4.method747(14598), var4.method747(14598), var4.method730(86), var4.method730(89), var4.method732(-559537960) == 1, var4.method732(-559537960), var4.method732(-559537960));
        int var6 = var4.method732(-559537960);
        int var7 = 0;
        if (arg2 <= 98) {
            method1006(-52);
        }
        while (var7 < var6) {
            var5.field7891.method1229(new class306(var4.method732(-559537960), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25), var4.method723((byte) -25)), (byte) 120);
            var7++;
        }
        var5.method3169(22509);
        return var5;
    }
}
