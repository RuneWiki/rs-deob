import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class687 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field9690;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljm;")
    public static class687 field9694 = new class687(1);

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Ljm;")
    public static class687 field9695 = new class687(2);

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Ljm;")
    public static class687 field9696 = new class687(4);

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljm;")
    public static class687 field9697 = new class687(1);

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Ljm;")
    public static class687 field9698 = new class687(2);

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Ljm;")
    public static class687 field9699 = new class687(4);

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Ljm;")
    public static class687 field9700 = new class687(2);

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Ljm;")
    public static class687 field9701 = new class687(4);

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field9702 = -1;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field9704 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
    public static final void method3884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > arg3) {
            class223.method1297(class408.field5585[arg4], arg1 ^ 0x654BD5C9, arg3, arg2, arg0);
        } else {
            class223.method1297(class408.field5585[arg4], -7, arg0, arg2, arg3);
        }
        field9693++;
        if (arg1 != -1699468752) {
            method3886(-121, -81);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Loh;Lnc;Loh;Loh;BLdia;)Z")
    public static final boolean method3885(class404 arg0, class24 arg1, class404 arg2, class404 arg3, byte arg4, class233 arg5) {
        class376.field4854 = new int[16];
        class326.field4233 = arg1;
        class730.field10217 = arg0;
        field9692++;
        class686.field9686 = arg2;
        class471.field6734 = arg3;
        class41.field465 = arg5;
        if (arg4 == 66) {
            for (int var6 = 0; var6 < 16; var6++) {
                class376.field4854[var6] = 255;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
    public static final int method3886(int arg0, int arg1) {
        field9688++;
        if (arg0 < 75) {
            field9698 = null;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!jm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9689++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static void method3887(byte arg0) {
        if (arg0 > -23) {
            field9702 = -49;
        }
        field9698 = null;
        field9695 = null;
        field9699 = null;
        field9696 = null;
        field9700 = null;
        field9697 = null;
        field9694 = null;
        field9701 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method3888(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field9691++;
        int var8 = arg7 - arg2;
        int var9 = arg1 + arg2;
        for (int var10 = arg1; var10 < var9; var10++) {
            class223.method1297(class408.field5585[var10], -7, arg0, arg6, arg3);
        }
        int var11 = arg0 + arg2;
        int var12 = arg3 - arg2;
        for (int var13 = arg7; var13 > var8; var13--) {
            class223.method1297(class408.field5585[var13], -7, arg0, arg6, arg3);
        }
        if (arg5 >= -43) {
            return;
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class408.field5585[var14];
            class223.method1297(var15, -7, arg0, arg6, var11);
            class223.method1297(var15, -7, var11, arg4, var12);
            class223.method1297(var15, -7, var12, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
    private class687(int arg0) {
        this.field9690 = arg0;
    }
}
