import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class502 extends class270 {

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "Lap;")
    public class435 field7229;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public static int field7228 = 0;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "Z")
    public boolean field7230;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/String;I)Lcf;")
    public static final class551 method2886(int arg0, String arg1, int arg2) {
        if (arg2 != 15351) {
            return null;
        }
        field7225++;
        class551 var3;
        try {
            var3 = (class551) Class.forName("nu").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class174();
        }
        var3.field7864 = arg1;
        var3.field7863 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V")
    public abstract void method1602(int arg0, int arg1);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Z")
    public final boolean method2887(int arg0) {
        field7227++;
        int var2 = -42 / ((arg0 - 47) / 40);
        return this.field7230;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)I")
    public final int method2888(boolean arg0) {
        if (!arg0) {
            this.field7229 = null;
        }
        field7231++;
        return 1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lkp;ILkp;I)V")
    public abstract void method1601(class446 arg0, int arg1, class446 arg2, int arg3);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public abstract void method1607(byte arg0);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
    public int method1609(int arg0) {
        field7224++;
        if (arg0 != 1) {
            this.method1609(121);
        }
        return 0;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)Z")
    public abstract boolean method1599(int arg0);

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lap;)V")
    public class502(class435 arg0) {
        this.field7229 = arg0;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(III)V")
    public abstract void method1604(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)I")
    public static final int method2889(int arg0, int arg1) {
        field7226++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xD4) >> 6;
        if (arg1 != 0) {
            field7228 = -95;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Z")
    public abstract boolean method1610(int arg0);

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "(I)Z")
    public final boolean method2890(int arg0) {
        if (arg0 != -1124) {
            this.field7229 = null;
        }
        field7223++;
        return false;
    }
}
