import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class557 extends class551 {

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7846 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Lvea;")
    public static class276 field7851 = new class276(14, 0, 4, 1);

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lkq;B)I")
    public static final int method3153(class594 arg0, byte arg1) {
        ++field7853;
        if (arg1 != 105) {
            return -27;
        } else if (class594.field8271 != arg0) {
            if (class594.field8275 != arg0) {
                if (class594.field8276 != arg0) {
                    if (class594.field8277 == arg0) {
                        return 5121;
                    } else if (class594.field8278 == arg0) {
                        return 5123;
                    } else if (class594.field8279 != arg0) {
                        if (class594.field8280 == arg0) {
                            return 5131;
                        } else if (class594.field8281 == arg0) {
                            return 5126;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 5125;
                    }
                } else {
                    return 5124;
                }
            } else {
                return 5122;
            }
        } else {
            return 5120;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Z")
    public static final boolean method3154(byte arg0, int arg1) {
        int var2 = -1 % ((30 - arg0) / 41);
        ++field7847;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3155(int arg0, boolean arg1) {
        ++field7850;
        boolean var2 = class21.field142.method377();
        if (arg0 != 29089) {
            field7846 = null;
        }
        if (arg1 != !var2) {
            return true;
        } else {
            if (arg1) {
                if (!class21.field142.method423()) {
                    arg1 = false;
                }
            } else {
                class21.field142.method362();
            }
            if (arg1 == !var2) {
                class11.field68.method2276((byte) -13, !arg1 ? 0 : 1, class11.field68.field5536);
                class355.method2054(-5964);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBII)V")
    public final void method2926(int arg0, byte arg1, int arg2, int arg3) {
        ++field7849;
        super.field7800 = arg2;
        super.field7801 = arg0;
        if (arg1 > -120) {
            field7851 = null;
        }
        super.field7793 = arg3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIF)V")
    public class557(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static void method3156(byte arg0) {
        if (arg0 >= 16) {
            field7851 = null;
            field7846 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(FI)V")
    public final void method2921(float arg0, int arg1) {
        ++field7848;
        super.field7798 = arg0;
        if (arg1 <= 12) {
            this.method2926(55, (byte) 80, -52, 106);
        }
    }
}
