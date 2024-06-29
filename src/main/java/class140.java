import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class140 implements class437 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lec;")
    public class236 field2327;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lsd;")
    public class95 field2322;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Z")
    public static boolean field2326 = false;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Loea;")
    public static class597 field2316;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method1120(int arg0) {
        field2316 = null;
        int var1 = 105 % ((-arg0 - 15) / 36);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lha;I)V")
    public static final void method1121(class59 arg0, int arg1) {
        field2318++;
        class214.field3046 = class747.method4168(arg0, (byte) -53, true, class120.field2056);
        class635.field8727 = class481.method2823(-25411, arg0, class120.field2056);
        if (arg1 != 4) {
            field2316 = null;
        }
        class355.field5007 = class747.method4168(arg0, (byte) -53, true, class691.field9325);
        class308.field4276 = class481.method2823(-25411, arg0, class691.field9325);
        class168.field2634 = class747.method4168(arg0, (byte) -53, true, class307.field4264);
        field2316 = class481.method2823(-25411, arg0, class307.field4264);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
    public static final void method1122(int arg0, int arg1) {
        field2323++;
        int var2 = 83 % ((arg1 + 87) / 37);
        class594 var3 = class692.method3869(arg0, (byte) 105, 4);
        var3.method3383(-16058);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Lad;")
    public class426 method119(byte arg0) {
        if (arg0 < 116) {
            return null;
        } else {
            field2321++;
            return null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lsd;Lec;IIIIIII)V")
    public class140(class95 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2315 = arg8;
        this.field2325 = arg4;
        this.field2319 = arg7;
        this.field2320 = arg6;
        this.field2313 = arg3;
        this.field2327 = arg1;
        this.field2324 = arg2;
        this.field2322 = arg0;
        this.field2317 = arg5;
    }
}
