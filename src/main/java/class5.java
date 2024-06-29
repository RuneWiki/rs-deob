import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field70 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "J")
    public static long field65 = 0L;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lvj;")
    public static class115 field77 = new class115(64);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Ldl;")
    public static class123 field73;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Ldl;")
    public static class123 field75;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILjava/awt/Component;)Lpg;")
    public static final class75 method24(int arg0, int arg1, int arg2, Component arg3) {
        field69++;
        try {
            if (arg0 != 0) {
                method29((class56) null, -127);
            }
            Class var4 = Class.forName("oc");
            class75 var5 = (class75) var4.getDeclaredConstructor().newInstance();
            var5.method291(arg3, 1, arg2, arg1);
            return var5;
        } catch (Throwable var7) {
            class37 var6 = new class37();
            var6.method291(arg3, 1, arg2, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static final void method25(byte arg0) {
        field68++;
        if (arg0 == 55 && class203.field3182 == 30) {
            class245.method1650(25, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Llj;II)V")
    private final void method26(class25 arg0, int arg1, int arg2) {
        field76++;
        if (arg2 < 17) {
            field74 = -51;
        }
        if (arg1 == 5) {
            this.field70 = arg0.method190(-3);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLlj;)V")
    public final void method27(byte arg0, class25 arg1) {
        if (arg0 < 28) {
            field74 = 115;
        }
        while (true) {
            int var3 = arg1.method201(255);
            if (var3 == 0) {
                field66++;
                return;
            }
            this.method26(arg1, var3, 122);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method28(int arg0) {
        field75 = null;
        field77 = null;
        int var1 = 0 / ((-arg0 - 52) / 56);
        field73 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Li;I)V")
    public static final void method29(class56 arg0, int arg1) {
        if (arg1 != 25) {
            method28(13);
        }
        field72++;
        for (class190 var2 = (class190) class54.field743.method350(8240); var2 != null; var2 = (class190) class54.field743.method353((byte) -121)) {
            if (var2.field2996 == arg0) {
                if (var2.field2986 != null) {
                    class130.field1907.method716(var2.field2986);
                    var2.field2986 = null;
                }
                var2.method784(false);
                return;
            }
        }
    }
}
