import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class717 {

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public int field9878 = -1;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Lkaa;")
    public static class47 field9874 = new class47(41, 8);

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Ltia;")
    public class270 field9872;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "[I")
    public int[] field9877;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field9873;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(III[II)V")
    public static final void method4012(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field9875++;
        arg2--;
        if (arg1 > -47) {
            return;
        }
        int var11 = arg4 - 1;
        int var5 = var11 - 7;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var12 = var10 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg2 = var13 + 1;
            arg3[arg2] = arg0;
        }
        while (var11 > arg2) {
            arg2++;
            arg3[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)I")
    public static final int method4013(int arg0, int arg1, byte arg2) {
        field9876++;
        int var3 = 1;
        int var4 = 113 / ((23 - arg2) / 52);
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
    public static final void method4014(int arg0) {
        field9879++;
        if (class258.field3537 == null) {
            return;
        }
        class549.field7251 = new class185();
        if (arg0 != 1) {
            method4014(64);
        }
        class549.field7251.method1280(class258.field3537.field357.method2877(class713.field9854, (byte) -108), class258.field3537.field365, class258.field3537, class287.field4059, -1484216776);
        class401.field5596 = new Thread(class549.field7251, "");
        class401.field5596.start();
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
    public static void method4015(int arg0) {
        field9874 = null;
        if (arg0 != 1) {
            method4014(52);
        }
    }
}
