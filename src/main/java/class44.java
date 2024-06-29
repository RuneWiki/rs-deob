import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class44 {

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "B")
    public byte field677;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lvg;")
    public static class622 field661 = new class622(78, -2);

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lcv;")
    public static class22 field658;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Lkn;")
    public class306 field673;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Lpo;")
    public class332 field668;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lpo;")
    public class332 field670;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Ljp;")
    public class361 field667;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "Lfg;")
    public class391 field669;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Lfg;")
    public class391 field675;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lms;")
    public class44 field666;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lkga;")
    public class518 field672;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "S")
    public short field665;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "S")
    public short field671;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "S")
    public short field674;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "S")
    public short field676;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method252(byte arg0) {
        field658 = null;
        field661 = null;
        if (arg0 > -61) {
            method253(-17, null);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method253(int arg0, String arg1) {
        if (arg0 != 78) {
            method254((byte) 66, null);
        }
        field660++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/awt/Canvas;)Lnca;")
    public static final class552 method254(byte arg0, Canvas arg1) {
        if (arg0 != 30) {
            return null;
        }
        field664++;
        try {
            Class var2 = Class.forName("pm");
            class552 var3 = (class552) var2.getDeclaredConstructor().newInstance();
            var3.method2012(arg1, (byte) 114);
            return var3;
        } catch (Throwable var5) {
            class326 var4 = new class326();
            var4.method2012(arg1, (byte) 122);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public final void method255(int arg0) {
        if (arg0 != 1) {
            method254((byte) 79, null);
        }
        field662++;
        while (this.field667 != null) {
            class361 var2 = this.field667.field5299;
            this.field667.method2219((byte) -65);
            this.field667 = var2;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I)V")
    public class44(int arg0) {
        this.field677 = (byte) arg0;
    }
}
