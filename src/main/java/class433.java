import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class class433 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lqu;")
    public static class219 field6534 = new class219(12, 6);

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field6538 = 0;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "[[Lgi;")
    public static class437[][] field6540;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2044(boolean arg0);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)V")
    public static final void method2724(int arg0, int arg1) {
        if (arg1 <= 103) {
            method2724(11, 35);
        }
        field6535++;
        if (arg0 != -1 && class239.field3897[arg0]) {
            class152.field2017.method999(arg0, (byte) -84);
            field6540[arg0] = null;
            class462.field7111[arg0] = null;
            class239.field3897[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public abstract void method2048(int arg0);

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)Z")
    public abstract boolean method2046(int arg0);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)Z")
    public static final boolean method2725(byte arg0, int arg1) {
        field6539++;
        if (arg0 != -70) {
            field6540 = null;
        }
        if (arg1 == 20 || arg1 == 19 || arg1 == 17 || arg1 == 11 || arg1 == 6) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 1004;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static void method2726(byte arg0) {
        field6540 = null;
        if (arg0 <= 7) {
            field6538 = 115;
        }
        field6534 = null;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public abstract void method2050(int arg0);

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Z")
    public final boolean method2727(int arg0) {
        field6537++;
        if (arg0 == 6) {
            return this.method2046(-92) || this.method2044(true) || this.method2036(20);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)Z")
    public abstract boolean method2036(int arg0);

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)I")
    public abstract int method2043(byte arg0);

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)Lic;")
    public abstract class32 method2047(byte arg0);

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)I")
    public abstract int method2038(int arg0);
}
