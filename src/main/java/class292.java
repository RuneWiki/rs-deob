import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class292 {

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    private int field4042 = 0;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    private int field4041 = 0;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "Lpm;")
    private class507 field4049 = null;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    private int field4045 = 0;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Lad;")
    private class362 field4047;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "Lme;")
    private class168 field4054;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "[Ldaa;")
    private class11[] field4044;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "Lpj;")
    public class128 field4046;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "Lig;")
    public static class206 field4051 = new class206(71, 4);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "Lqm;")
    public static class126 field4055;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZZBLlc;)V")
    public static final void method1885(boolean arg0, boolean arg1, byte arg2, class563 arg3) {
        field4043++;
        int var4 = arg3.field8022;
        int var5 = (int) arg3.field4676;
        arg3.method2108(true);
        if (arg1) {
            class200.method1271(var4, -123);
        }
        class22.method137((byte) 93, var4);
        class593 var6 = class259.method1728(40, var5);
        if (var6 != null) {
            class33.method187(var6, (byte) 104);
        }
        class400.method2551(true);
        if (!arg0 && class518.field7542 != -1) {
            class244.method1626(1, -24494, class518.field7542);
        }
        class438 var7 = new class438(class234.field3309);
        for (class563 var8 = (class563) var7.method2727((byte) 85); var8 != null; var8 = (class563) var7.method2728((byte) 64)) {
            if (!var8.method2109(11574)) {
                var8 = (class563) var7.method2727((byte) 86);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field8021 == 3) {
                int var9 = (int) var8.field4676;
                if (var9 >>> 16 == var4) {
                    method1885(arg0, true, (byte) -72, var8);
                }
            }
        }
        if (arg2 != -72) {
            method1889(37);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZIZII)V")
    public final void method1886(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != 11683) {
            method1889(108);
        }
        field4052++;
        boolean var7 = arg1 & this.field4047.method322();
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg0 = arg4;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg3) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field4042 != arg2) {
            if (this.field4042 != 0) {
                this.field4044[Integer.MAX_VALUE & this.field4042].method63(117);
            }
            if (arg2 != 0) {
                this.field4044[arg2 & Integer.MAX_VALUE].method67(122, arg3);
                this.field4044[Integer.MAX_VALUE & arg2].method64(true, arg3);
                this.field4044[Integer.MAX_VALUE & arg2].method62(arg4, arg0, (byte) 127);
            }
            this.field4045 = arg0;
            this.field4041 = arg4;
            this.field4042 = arg2;
            this.field4049 = null;
        } else if (this.field4042 != 0) {
            this.field4044[Integer.MAX_VALUE & this.field4042].method64(true, arg3);
            if (this.field4041 != arg4 || this.field4045 != arg0) {
                this.field4044[Integer.MAX_VALUE & this.field4042].method62(arg4, arg0, (byte) 125);
                this.field4041 = arg4;
                this.field4045 = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZILpm;)Z")
    public final boolean method1887(boolean arg0, int arg1, class507 arg2) {
        field4048++;
        if (arg0) {
            this.field4041 = 115;
        }
        if (this.field4042 == 0) {
            return false;
        }
        if (this.field4049 != arg2) {
            this.field4044[this.field4042 & Integer.MAX_VALUE].method65(arg1, -1, arg2);
            this.field4049 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)Z")
    public final boolean method1888(int arg0, int arg1) {
        field4053++;
        int var3 = -116 / ((29 - arg1) / 35);
        return this.field4044[arg0].method68((byte) 95);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method1889(int arg0) {
        if (arg0 > -120) {
            field4051 = null;
        }
        field4055 = null;
        field4051 = null;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lad;)V")
    public class292(class362 arg0) {
        this.field4047 = arg0;
        this.field4054 = new class168(arg0);
        this.field4044 = new class11[10];
        this.field4044[1] = new class524(arg0);
        this.field4044[2] = new class459(arg0, this.field4054);
        this.field4044[4] = new class447(arg0, this.field4054);
        this.field4044[5] = new class445(arg0, this.field4054);
        this.field4044[6] = new class91(arg0);
        this.field4044[7] = new class220(arg0);
        this.field4044[3] = this.field4046 = new class128(arg0);
        this.field4044[8] = new class26(arg0, this.field4054);
        this.field4044[9] = new class405(arg0, this.field4054);
        if (!this.field4044[8].method68((byte) 95)) {
            this.field4044[8] = this.field4044[4];
        }
        if (!this.field4044[9].method68((byte) 95)) {
            this.field4044[9] = this.field4044[8];
        }
    }
}
