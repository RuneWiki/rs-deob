import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class329 extends class393 {

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    private int field4735;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4728 = "Loaded world list data";

    @OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
    public static boolean field4727 = false;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "Lis;")
    public static class39 field4731;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
    public static boolean field4714;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[B")
    public static byte[] field4717;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZIII)Z")
    public final boolean method2016(boolean arg0, int arg1, int arg2, int arg3) {
        field4720++;
        if (arg0) {
            this.method2022((byte) 32, -67, 91, (int[]) null);
        }
        return this.field4719 == arg2 && arg1 >= this.field4735 && this.field4721 >= arg1 && this.field4716 <= arg3 && this.field4722 >= arg3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
    public static final void method2017(int arg0, int arg1, int arg2) {
        field4713++;
        class256 var3 = class363.method2385(arg1, arg2, (byte) 1);
        var3.method1614(0);
        var3.field3756 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)Z")
    public final boolean method2018(int arg0, int arg1, int arg2) {
        field4723++;
        if (arg2 >= -64) {
            method2023(79, -58);
        }
        return this.field4724 <= arg0 && arg0 <= this.field4733 && this.field4730 <= arg1 && arg1 <= this.field4729;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)Z")
    public final boolean method2019(byte arg0, int arg1, int arg2) {
        field4734++;
        int var4 = 119 % (arg0 / 34);
        return arg1 >= this.field4735 && this.field4721 >= arg1 && this.field4716 <= arg2 && arg2 <= this.field4722;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([IIBI)V")
    public final void method2020(int[] arg0, int arg1, byte arg2, int arg3) {
        field4725++;
        arg0[2] = this.field4716 - (this.field4730 - arg1);
        if (arg2 != -110) {
            this.method2020((int[]) null, -89, (byte) -111, 1);
        }
        arg0[1] = this.field4735 + arg3 - this.field4724;
        arg0[0] = this.field4719;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method2021(int arg0) {
        field4717 = null;
        if (arg0 <= 119) {
            field4714 = false;
        }
        field4728 = null;
        field4731 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII[I)V")
    public final void method2022(byte arg0, int arg1, int arg2, int[] arg3) {
        field4715++;
        arg3[1] = this.field4724 + arg1 - this.field4735;
        arg3[0] = 0;
        if (arg0 > -52) {
            this.method2022((byte) 19, -14, -74, (int[]) null);
        }
        arg3[2] = this.field4730 + arg2 - this.field4716;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
    public static final void method2023(int arg0, int arg1) {
        class24 var2 = class436.field6400;
        synchronized (class436.field6400) {
            class436.field6400.method215(0, arg1);
            if (arg0 <= 52) {
                method2023(-89, 45);
            }
        }
        field4718++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLqj;)V")
    public static final void method2024(byte arg0, class238 arg1) {
        field4726++;
        class122.field1623 = arg1;
        if (arg0 != 8) {
            method2024((byte) -66, (class238) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4730 = arg6;
        this.field4733 = arg7;
        this.field4729 = arg8;
        this.field4719 = arg0;
        this.field4724 = arg5;
        this.field4722 = arg4;
        this.field4721 = arg3;
        this.field4716 = arg2;
        this.field4735 = arg1;
    }
}
