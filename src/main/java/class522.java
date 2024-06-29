import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class522 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lbq;")
    private class289 field7426;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7422 = new String[100];

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lmc;")
    private class134 field7431;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        if (arg0 != 0) {
            field7422 = null;
        }
        field7422 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbq;I)V")
    public final void method3066(class289 arg0, int arg1) {
        this.field7426 = arg0;
        field7424++;
        if (arg1 != -6720) {
            method3065(-105);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method3067(byte arg0) {
        field7430++;
        if (class614.field8787 == 1 || class614.field8787 == 3 || class614.field8787 != class141.field1588 && (class614.field8787 == 0 || class141.field1588 == 0)) {
            class302.field3784 = 0;
            class529.field7533 = 0;
            class253.field3052.method1758(-119);
        }
        class141.field1588 = class614.field8787;
        if (arg0 != 88) {
            field7422 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lmc;")
    public final class134 method3068(int arg0) {
        field7428++;
        class134 var2 = this.field7426.field3563.field1521;
        if (arg0 != 25561) {
            return null;
        } else if (this.field7426.field3563 == var2) {
            this.field7431 = null;
            return null;
        } else {
            this.field7431 = var2.field1521;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class522() {
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIZI)V")
    public static final void method3069(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            return;
        }
        if (arg5 <= class578.field8182 && class224.field2571 <= arg3) {
            boolean var6;
            if (class338.field4355 > arg1) {
                var6 = false;
                arg1 = class338.field4355;
            } else if (arg1 <= class744.field10385) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class744.field10385;
            }
            boolean var7;
            if (arg0 < class338.field4355) {
                var7 = false;
                arg0 = class338.field4355;
            } else if (arg0 > class744.field10385) {
                arg0 = class744.field10385;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg5 < class224.field2571) {
                arg5 = class224.field2571;
            } else {
                class223.method1297(class408.field5585[arg5++], -7, arg1, arg2, arg0);
            }
            if (arg3 > class578.field8182) {
                arg3 = class578.field8182;
            } else {
                class223.method1297(class408.field5585[arg3--], -7, arg1, arg2, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; var8++) {
                    int[] var9 = class408.field5585[var8];
                    var9[arg1] = var9[arg0] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class408.field5585[var11][arg1] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg3; var10++) {
                    class408.field5585[var10][arg0] = arg2;
                }
            }
        }
        field7429++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lmc;")
    public final class134 method3070(boolean arg0) {
        field7425++;
        class134 var2 = this.field7431;
        if (this.field7426.field3563 == var2) {
            this.field7431 = null;
            return null;
        } else if (arg0) {
            this.field7431 = var2.field1521;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbq;)V")
    public class522(class289 arg0) {
        this.field7426 = arg0;
    }
}
