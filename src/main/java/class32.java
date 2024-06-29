import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class32 extends class757 {

    @OriginalMember(owner = "client!kha", name = "H", descriptor = "I")
    public static int field314 = -1;

    @OriginalMember(owner = "client!kha", name = "O", descriptor = "Lrn;")
    public static class633 field321 = new class633(81, -1);

    @OriginalMember(owner = "client!kha", name = "P", descriptor = "Lbt;")
    public static class437 field322 = new class437(0, -1);

    @OriginalMember(owner = "client!kha", name = "G", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!kha", name = "I", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!kha", name = "J", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!kha", name = "K", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!kha", name = "M", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!kha", name = "N", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!kha", name = "Q", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!kha", name = "L", descriptor = "Ljb;")
    public static class203 field318;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIBI)V")
    public final void method6(int arg0, int arg1, byte arg2, int arg3) {
        super.field10332 = arg0;
        super.field10317 = arg3;
        if (arg2 <= -127) {
            super.field10314 = arg1;
            ++field320;
        }
    }

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "(Z)V")
    public static final void method165(boolean arg0) {
        class572.field7243 = new class738(8);
        ++field315;
        class353.field4307 = 0;
        for (class513 var1 = (class513) class196.field2717.method857(-117); var1 != null; var1 = (class513) class196.field2717.method864(!arg0)) {
            var1.method2841();
        }
        if (arg0) {
            field322 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(FI)V")
    public final void method10(float arg0, int arg1) {
        ++field317;
        if (arg1 == 10) {
            super.field10325 = arg0;
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(IIIIIF)V")
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)V")
    public static final void method166(int arg0) {
        ++field313;
        if (class203.field2816 == 5) {
            if (arg0 != 12) {
                method165(false);
            }
            class203.field2816 = 6;
        }
    }

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)V")
    public static void method167(int arg0) {
        field322 = null;
        if (arg0 == -1) {
            field321 = null;
            field318 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method168(String arg0, int arg1) {
        if (arg1 <= 19) {
            return 34;
        } else {
            ++field316;
            return 1 + arg0.length();
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIBII)I")
    public static final int method169(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field319;
        int var5 = arg1 & 15;
        int var6 = var5 < 8 ? arg4 : arg3;
        if (arg2 > -80) {
            field314 = -115;
        }
        int var7 = var5 < 4 ? arg3 : (var5 != 12 && ~var5 != -15 ? arg0 : arg4);
        return (~(1 & var5) != -1 ? -var6 : var6) - -(~(var5 & 2) == -1 ? var7 : -var7);
    }
}
