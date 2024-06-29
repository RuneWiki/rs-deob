import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class452 {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lrf;")
    public static class84 field6645 = new class84();

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Laa;")
    public static class76 field6646 = new class76(13, -1);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Ljo;")
    public static class382 field6647 = new class382(4);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field6640;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public int field6641;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field6643;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lbr;")
    public class146 field6642;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lul;")
    public final synchronized class319 method2629(byte arg0) {
        field6638++;
        class319 var2 = (class319) this.field6642.field2202.method2288((long) this.field6640, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 97) {
            method2634((byte) -118);
        }
        class319 var3 = class319.method1994(this.field6642.field2197, this.field6640, 0);
        if (var3 != null) {
            this.field6642.field2202.method2290((long) this.field6640, var3, 100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static final void method2630(byte arg0) {
        if (arg0 > -96) {
            field6647 = null;
        }
        class521.field7662.method2293(false);
        field6644++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Loa;")
    public static final class169 method2631(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4586;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lgk;I)V")
    public final void method2632(class468 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2765(83);
            if (var3 == 0) {
                field6648++;
                if (arg1 != 0) {
                    method2635(null, null, 37);
                    return;
                }
                return;
            }
            this.method2633(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lgk;IZ)V")
    private final void method2633(class468 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field6642 = null;
        }
        field6650++;
        if (arg1 == 1) {
            this.field6640 = arg0.method2727((byte) 43);
        } else if (arg1 == 2) {
            this.field6641 = arg0.method2765(60);
            this.field6643 = arg0.method2765(61);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
    public static void method2634(byte arg0) {
        int var1 = 45 / ((arg0 + 48) / 44);
        field6647 = null;
        field6645 = null;
        field6646 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lgk;Ljava/lang/String;I)I")
    public static final int method2635(class468 arg0, String arg1, int arg2) {
        field6639++;
        int var3 = arg0.field6830;
        byte[] var4 = class468.method2746(arg1, (byte) 89);
        arg0.method2757((byte) -99, var4.length);
        arg0.field6830 += class262.field3908.method2671(0, var4.length, (byte) 113, arg0.field6868, var4, arg0.field6830);
        if (arg2 != 13) {
            method2631(68, -66, 63);
        }
        return arg0.field6830 - var3;
    }
}
