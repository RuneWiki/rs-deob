import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class111 extends class28 {

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    private final int field2002;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    private final int field2007;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    private final int field1996;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    private final int field2001;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Loe;")
    public static class79 field1995 = new class79(16);

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "S")
    public static short field2006 = 1;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lhi;")
    public static class82 field2010 = class95.method664((byte) -82, "::");

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Lum;")
    public static class222 field2009;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method768(byte arg0, boolean arg1) {
        class283.method1968(68);
        field1999++;
        if (class61.field959 != 30 && class61.field959 != 25) {
            return;
        }
        class325.field5574++;
        if (class325.field5574 < 50 && !arg1 || arg0 != 121) {
            return;
        }
        class325.field5574 = 0;
        if (!class36.field602 && class66.field1036 != null) {
            class14.field107++;
            class61.field957.method1504(120, -1);
            try {
                class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                class61.field957.field2611 = 0;
            } catch (IOException var3) {
                class36.field602 = true;
            }
        }
        class283.method1968(52);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIII)V", line = 38)
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2002 = arg2;
        this.field2007 = arg0;
        this.field1996 = arg1;
        this.field2001 = arg3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILhi;I)V", line = 53)
    public static final void method769(int arg0, int arg1, int arg2, class82 arg3, int arg4) {
        class75 var5 = class257.method1840(false, arg0, arg4);
        field2005++;
        if (var5 == null) {
            return;
        }
        if (var5.field1163 != null) {
            class331 var6 = new class331();
            var6.field5649 = var5;
            var6.field5632 = arg2;
            var6.field5630 = arg3;
            var6.field5635 = var5.field1163;
            class15.method92(var6, 73);
        }
        boolean var7 = true;
        if (var5.field1210 > 0) {
            var7 = class122.method832(var5, (byte) -46);
        }
        if (!var7 || !class23.method153(client.method871(var5), -1, arg2 - 1)) {
            return;
        }
        if (arg1 != 63) {
            field2006 = 5;
        }
        if (arg2 == 1) {
            class63.field985++;
            class61.field957.method1504(219, -1);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -59, arg4);
        }
        if (arg2 == 2) {
            class61.field957.method1504(182, -1);
            class257.field4421++;
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -122, arg4);
        }
        if (arg2 == 3) {
            class61.field957.method1504(217, -1);
            class68.field1050++;
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -74, arg4);
        }
        if (arg2 == 4) {
            field1998++;
            class61.field957.method1504(191, arg1 - 64);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -59, arg4);
        }
        if (arg2 == 5) {
            class141.field2419++;
            class61.field957.method1504(63, arg1 - 64);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -12, arg4);
        }
        if (arg2 == 6) {
            class61.field957.method1504(86, -1);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -50, arg4);
            class92.field1648++;
        }
        if (arg2 == 7) {
            class3.field26++;
            class61.field957.method1504(64, -1);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -66, arg4);
        }
        if (arg2 == 8) {
            class61.field957.method1504(135, -1);
            class194.field3295++;
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -43, arg4);
        }
        if (arg2 == 9) {
            class61.field957.method1504(108, -1);
            class28.field376++;
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -45, arg4);
        }
        if (arg2 == 10) {
            class161.field2814++;
            class61.field957.method1504(179, -1);
            class61.field957.method1065(178808912, arg0);
            class61.field957.method1102((byte) -78, arg4);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 184)
    public static final void method770(int arg0) {
        class295.method2036((long) class212.field3708);
        field2000++;
        if (arg0 != 20925) {
            field1995 = (class79) null;
        }
        if (class255.field4382 != -1) {
            class150.method1034(16294, class255.field4382);
        }
        for (int var1 = 0; var1 < class254.field4381; var1++) {
            if (class276.field4639[var1]) {
                class302.field5151[var1] = true;
            }
            class198.field3389[var1] = class276.field4639[var1];
            class276.field4639[var1] = false;
        }
        class279.field4685 = null;
        class5.field45 = -1;
        class281.field4729 = -1;
        if (class147.field2485) {
            class74.field1131 = true;
        }
        class287.field4829 = class212.field3708;
        if (class255.field4382 != -1) {
            class254.field4381 = 0;
            class163.method1172(0, class255.field4382, 0, -1, class180.field3078, class260.field4462, 0, 0, (byte) -110);
        }
        if (class147.field2485) {
            class116.method790();
        } else {
            class320.method2208();
        }
        class243.field4229 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V", line = 234)
    public final void method22(int arg0, int arg1, int arg2) {
        field1994++;
        int var4 = this.field2007 * arg1 >> 12;
        int var5 = this.field2002 * arg1 >> 12;
        if (arg2 > 24) {
            int var6 = this.field1996 * arg0 >> 12;
            int var7 = this.field2001 * arg0 >> 12;
            class207.method1482(var7, this.field368, var4, this.field370, (byte) -114, var6, this.field373, var5);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V", line = 257)
    public final void method24(int arg0, int arg1, int arg2) {
        field1997++;
        if (arg2 != 0) {
            field2006 = 69;
        }
        int var4 = this.field2007 * arg1 >> 12;
        int var5 = this.field2002 * arg1 >> 12;
        int var6 = this.field1996 * arg0 >> 12;
        int var7 = this.field2001 * arg0 >> 12;
        class87.method611(var6, false, var7, var4, var5, this.field373);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lbc;I)Lil;", line = 279)
    public static final class3 method771(class153 arg0, int arg1) {
        field2003++;
        if (arg1 != 23388) {
            field1995 = (class79) null;
        }
        return new class3(arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1107((byte) 82), arg0.method1082(-126));
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(III)V", line = 291)
    public final void method26(int arg0, int arg1, int arg2) {
        int var4 = this.field2007 * arg1 >> 12;
        int var5 = this.field2002 * arg1 >> 12;
        field2004++;
        int var6 = this.field2001 * arg0 >> 12;
        int var7 = this.field1996 * arg0 >> 12;
        if (arg2 != 0) {
            method770(37);
        }
        class104.method717(var4, this.field368, -2, this.field370, var5, var7, var6);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 325)
    public static void method772(int arg0) {
        field2009 = null;
        field2010 = null;
        field1995 = null;
        if (arg0 != -10) {
            field2010 = (class82) null;
        }
    }
}
