import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class161 extends class88 {

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    private int field2615;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lui;")
    public static class239 field2620 = new class239(128);

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "[[I")
    public static int[][] field2616;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[[[B")
    public static byte[][][] field2624;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
    public final void method629(int arg0, int arg1, byte arg2) {
        int var4 = -29 % ((-19 - arg2) / 62);
        ++field2621;
        int var5 = this.field2622 * arg0 >> 12;
        int var6 = this.field2623 * arg0 >> 12;
        int var7 = this.field2615 * arg1 >> 12;
        int var8 = this.field2612 * arg1 >> 12;
        class75.method572(var5, super.field1200, super.field1208, -19146, var7, var6, var8);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Object;Lcb;B)V")
    public static final void method1104(Object arg0, class255 arg1, byte arg2) {
        if (arg2 <= 35) {
            method1105((byte) -7, 75);
        }
        ++field2614;
        if (arg1.field4081 != null) {
            for (int var3 = 0; ~var3 > -51 && arg1.field4081.peekEvent() != null; ++var3) {
                class208.method1408(92, 1L);
            }
            if (arg0 != null) {
                arg1.field4081.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
    public static final int method1105(byte arg0, int arg1) {
        ++field2613;
        if (arg0 != -7) {
            method1104((Object) null, (class255) null, (byte) -34);
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field2624 = null;
        field2616 = null;
        if (arg0 < -20) {
            field2620 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public final void method620(int arg0, int arg1, int arg2) {
        ++field2619;
        int var4 = this.field2623 * arg1 >> 12;
        int var5 = this.field2622 * arg1 >> 12;
        int var6 = this.field2615 * arg2 >> 12;
        if (arg0 != -1) {
            field2620 = null;
        }
        int var7 = this.field2612 * arg2 >> 12;
        class270.method1825((byte) 112, var4, var5, var6, super.field1208, super.field1200, var7, super.field1207);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public final void method621(int arg0, int arg1, int arg2) {
        ++field2611;
        if (arg2 != 0) {
            field2620 = null;
        }
        int var4 = this.field2622 * arg0 >> 12;
        int var5 = this.field2623 * arg0 >> 12;
        int var6 = this.field2615 * arg1 >> 12;
        int var7 = this.field2612 * arg1 >> 12;
        class157.method1053(super.field1207, var6, var4, var7, var5, (byte) -121);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILjj;)Lwe;")
    public static final class43 method1107(int arg0, int arg1, class134 arg2) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field2617;
            return !class72.method555((byte) -85, arg0, arg2) ? null : class174.method1207(255);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lch;")
    public static final class125 method1108(int arg0) {
        if (arg0 != 0) {
            field2624 = null;
        }
        ++field2618;
        return class247.field3968;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
    public class161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2612 = arg3;
        this.field2623 = arg2;
        this.field2622 = arg0;
        this.field2615 = arg1;
    }
}
