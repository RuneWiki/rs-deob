import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 extends class578 {

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[F")
    public static float[] field593 = new float[4];

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Llaa;")
    public static class105 field596;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "Ljava/lang/String;")
    public String field600;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "[I")
    public static int[] field602;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method400(byte arg0) {
        if (arg0 > -47) {
            field596 = null;
        }
        field596 = null;
        field602 = null;
        field593 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBLui;)Z")
    public static final boolean method401(int arg0, byte arg1, class209 arg2) {
        ++field599;
        int var3 = -99 / ((arg1 - 69) / 32);
        class468.field6429.method682(arg2.field2947[arg0], arg2.field2948[arg0], arg2.field2944[arg0], class399.field5605);
        int var4 = class399.field5605[2];
        if (var4 < 50) {
            return false;
        } else {
            arg2.field2956[arg0] = (short) (class399.field5605[0] * class353.field4689 / var4 + class297.field4065);
            arg2.field2951[arg0] = (short) (class399.field5605[1] * class398.field5594 / var4 + class668.field9384);
            arg2.field2950[arg0] = (short) var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public final void method402(byte arg0) {
        ++field601;
        super.field8154 |= Long.MIN_VALUE;
        if (arg0 < 23) {
            method400((byte) 26);
        }
        if (this.method403((byte) 83) == 0L) {
            class513.field7036.method2123(this, -1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)J")
    public final long method403(byte arg0) {
        if (arg0 < 26) {
            return -12L;
        } else {
            ++field598;
            return Long.MAX_VALUE & super.field8154;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public final void method404(int arg0) {
        ++field597;
        super.field8154 = Long.MIN_VALUE & super.field8154 | class577.method3295((byte) 15) + 500L;
        class564.field7622.method2123(this, -1);
        if (arg0 <= 53) {
            this.method405(-86);
        }
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)I")
    public final int method405(int arg0) {
        ++field595;
        return arg0 != 255 ? 47 : (int) super.field5623;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)I")
    public final int method406(boolean arg0) {
        ++field594;
        return !arg0 ? -114 : (int) (255L & super.field5623 >>> 32);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        super.field5623 = (long) arg1 | (long) arg0 << 32;
    }
}
