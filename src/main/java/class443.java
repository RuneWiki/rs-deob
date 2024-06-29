import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class443 {

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lfa;")
    private class156 field6570 = new class156(16);

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lfs;")
    private class387 field6565;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field6571 = -1;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6572;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method2699(byte arg0) {
        if (arg0 != 54) {
            this.field6565 = null;
        }
        field6568++;
        class156 var2 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method1119(81);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method2700(int arg0) {
        class156 var2 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method1105(false);
        }
        field6564++;
        if (arg0 != 7569) {
            this.method2699((byte) -116);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public final void method2701(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        class156 var3 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method1116(arg1, -50);
        }
        field6566++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIILtf;)Lun;")
    public final class291 method2702(int arg0, int arg1, int arg2, int arg3, int arg4, class193 arg5) {
        field6567++;
        if (arg2 < 108) {
            return null;
        }
        class292[] var7 = null;
        class279 var8 = this.method2703(arg1, (byte) 71);
        if (var8.field4091 != null) {
            var7 = new class292[var8.field4091.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class439 var10 = arg5.method1355(-8321, var8.field4091[var9]);
                var7[var9] = new class292(var10.field6519, var10.field6523, var10.field6532, var10.field6527, var10.field6530, var10.field6533, var10.field6534, var10.field6535);
            }
        }
        return new class291(var8.field4089, var7, var8.field4088, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Loh;")
    private final class279 method2703(int arg0, byte arg1) {
        field6563++;
        class156 var3 = this.field6570;
        class279 var4;
        synchronized (this.field6570) {
            var4 = (class279) this.field6570.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6565.method2363(arg0, 29, 91);
        class279 var6 = new class279();
        if (var5 != null) {
            var6.method1790(new class65(var5), -1);
        }
        if (arg1 <= 42) {
            this.method2703(88, (byte) 2);
        }
        class156 var7 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method1107(1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
    public static void method2704(byte arg0) {
        field6572 = null;
        int var1 = 107 / ((-arg0 - 56) / 41);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class443(class446 arg0, int arg1, class387 arg2) {
        this.field6565 = arg2;
        this.field6565.method2367(29, 28724);
    }

    static {
        new class331("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field6572 = new Rectangle[100];
    }
}
