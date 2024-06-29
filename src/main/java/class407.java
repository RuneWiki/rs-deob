import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class407 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field6135 = 0;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lri;")
    public static class73 field6137 = new class73(65, 3);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method2444(byte arg0) {
        field6137 = null;
        if (arg0 >= -106) {
            field6142 = -99;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ldh;Z)V")
    public final void method2445(class209 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                if (!arg1) {
                    return;
                }
                field6141++;
                return;
            }
            this.method2448(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public static final void method2446(int arg0, int arg1) {
        field6140++;
        class455.field6739 = arg1;
        class226 var2 = class263.field3855;
        synchronized (class263.field3855) {
            class263.field3855.method1540(0);
            if (arg0 != -26325) {
                method2447(-25, false, 48, 29, (byte) -43);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIIB)V")
    public static final void method2447(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field6139++;
        if (arg4 != -49) {
            return;
        }
        class259.field3819 = 0L;
        int var5 = class14.method89(false);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class348.field5015.method1097()) {
            arg1 = true;
        }
        class499.method2989(arg3, arg1, arg2, arg0, var5, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILdh;)V")
    private final void method2448(boolean arg0, int arg1, class209 arg2) {
        if (arg1 == 5) {
            this.field6135 = arg2.method1450((byte) 67);
        }
        if (!arg0) {
            this.method2445(null, true);
        }
        field6138++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method2449(int arg0) {
        field6136++;
        if (arg0 > -110) {
            field6142 = 121;
        }
        class337.field4745 = true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvg;Lqa;I)V")
    public static final void method2450(class38 arg0, class162 arg1, int arg2) {
        if (arg2 != 5705) {
            method2444((byte) 55);
        }
        field6143++;
        boolean var3 = class294.field4196.method459(arg0.field535, arg0.field471, arg0.field518 ? class500.field7365.field3532 : null, arg0.field454 | 0xFF000000, (byte) -80, arg1, arg0.field563, arg0.field515) == null;
        if (var3) {
            class105.field1520.method809(new class62(arg0.field535, arg0.field563, arg0.field471, arg0.field454 | 0xFF000000, arg0.field515, arg0.field518), false);
            class350.method2203((byte) -122, arg0);
        }
    }
}
