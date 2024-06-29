import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class382 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Loea;")
    private class612 field5471;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lgd;")
    public static class382 field5466 = new class382(0, 3, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lgd;")
    public static class382 field5473 = new class382(1, 3, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lgd;")
    public static class382 field5475 = new class382(2, 4, class612.field8616);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lgd;")
    public static class382 field5476 = new class382(3, 1, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lgd;")
    public static class382 field5477 = new class382(4, 2, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lgd;")
    public static class382 field5478 = new class382(5, 3, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lgd;")
    public static class382 field5479 = new class382(6, 4, class612.field8620);

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5480 = class550.method3249(16, 6520);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Ljn;")
    public static class134 field5482 = new class134(123, 10);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lho;")
    public static class318 field5481;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[Lho;")
    public static class318[] field5483;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lgd;", line = 3)
    public static final class382 method2380(int arg0, byte arg1) {
        field5468++;
        if (arg1 >= -56) {
            field5476 = null;
        }
        if (arg0 == 0) {
            return field5466;
        } else if (arg0 == 1) {
            return field5473;
        } else if (arg0 == 2) {
            return field5475;
        } else if (arg0 == 3) {
            return field5476;
        } else if (arg0 == 4) {
            return field5477;
        } else if (arg0 == 5) {
            return field5478;
        } else if (arg0 == 6) {
            return field5479;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgga;ZLjava/lang/String;)I", line = 76)
    public static final int method2381(class511 arg0, boolean arg1, String arg2) {
        field5467++;
        int var3 = arg0.field6962;
        byte[] var4 = class233.method1595(arg2, false);
        arg0.method3039(1042261168, var4.length);
        arg0.field6962 += class259.field3799.method512(var4, arg0.field6962, 0, arg0.field6979, 38, var4.length);
        if (!arg1) {
            field5475 = null;
        }
        return arg0.field6962 - var3;
    }

    @OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;", line = 97)
    public final String toString() {
        field5470++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 117)
    public static void method2382(int arg0) {
        field5475 = null;
        field5478 = null;
        if (arg0 != 28673) {
            method2380(103, (byte) 74);
        }
        field5481 = null;
        field5476 = null;
        field5477 = null;
        field5479 = null;
        field5482 = null;
        field5473 = null;
        field5483 = null;
        field5466 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IILoea;)V", line = 136)
    private class382(int arg0, int arg1, class612 arg2) {
        this.field5471 = arg2;
        this.field5472 = arg1;
        this.field5474 = arg0;
        this.field5469 = this.field5471.field8609 * this.field5472;
        if (this.field5474 >= 16) {
            throw new RuntimeException();
        }
    }
}
