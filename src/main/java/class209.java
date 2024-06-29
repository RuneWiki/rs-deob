import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class209 extends class134 {

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "J")
    public long field3237;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Lbm;")
    public class209 field3228;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Lbm;")
    public class209 field3229;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILha;Z)V")
    public static final void method1461(int arg0, class31 arg1, boolean arg2) {
        field3239++;
        if (!arg2) {
            method1461(47, (class31) null, true);
        }
        if (class75.field1169 == null) {
            return;
        }
        try {
            class75.field1169.method201(0L, (byte) -107);
            class75.field1169.method202(arg1.field560, 24, false, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
    public static final int method1462(int arg0, int arg1, int arg2) {
        field3238++;
        class198 var3 = (class198) class94.field1480.method2043((long) arg1, -1);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= arg0 && arg2 < var3.field3086.length) {
            return var3.field3086[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
    public final void method1463(byte arg0) {
        field3236++;
        if (this.field3229 == null) {
            return;
        }
        this.field3229.field3228 = this.field3228;
        this.field3228.field3229 = this.field3229;
        if (arg0 >= -104) {
            field3230 = -21;
        }
        this.field3228 = null;
        this.field3229 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lub;I)V")
    public static final void method1464(class92 arg0, int arg1) {
        if (arg1 != 17187) {
            method1464((class92) null, -17);
        }
        field3232++;
        class91.field1419 = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)Z")
    public final boolean method1465(int arg0) {
        field3234++;
        int var2 = 50 / ((arg0 - 49) / 54);
        return this.field3229 != null;
    }
}
