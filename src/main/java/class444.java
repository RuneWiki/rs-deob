import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class444 extends class29 {

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public int field6475 = 1;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
    public static int[] field6469 = new int[32];

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "C")
    public char field6477;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "Lct;")
    public static class104 field6473;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "Lm;")
    public static class187 field6476;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "Lvq;")
    public static class24 field6471;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "[[Lkg;")
    public static class223[][] field6470;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "[[[B")
    public static byte[][][] field6472;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[[[B")
    public static byte[][][] field6480;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lat;I)V")
    public final void method2730(class256 arg0, int arg1) {
        field6478++;
        while (true) {
            int var3 = arg0.method1738((byte) -74);
            if (var3 == 0) {
                int var4 = -119 / ((arg1 + 48) / 38);
                return;
            }
            this.method2733(arg0, -23749, var3);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public static final void method2731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class464.field6841 = arg4;
        field6479++;
        class177.field2452 = arg2;
        class200.field2832 = arg1;
        class26.field360 = arg0;
        int var5 = 84 % ((53 - arg3) / 61);
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public static void method2732(int arg0) {
        field6473 = null;
        field6476 = null;
        field6469 = null;
        field6472 = null;
        field6470 = null;
        field6480 = null;
        field6471 = null;
        if (arg0 < 0) {
            field6472 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lat;II)V")
    private final void method2733(class256 arg0, int arg1, int arg2) {
        if (arg1 != -23749) {
            field6476 = null;
        }
        field6474++;
        if (arg2 == 1) {
            this.field6477 = class141.method934((byte) 66, arg0.method1728((byte) 112));
        } else if (arg2 == 2) {
            this.field6475 = 0;
            return;
        }
    }
}
