import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class200 extends class117 {

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public int field2859 = 0;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "Z")
    public boolean field2865 = true;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public int field2863 = 12800;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public int field2868 = 0;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public int field2858 = 12800;

    @OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
    public int field2870 = -1;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public int field2867 = -1;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!wt", name = "X", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!wt", name = "V", descriptor = "Ljava/lang/String;")
    public String field2876;

    @OriginalMember(owner = "client!wt", name = "Z", descriptor = "Ljava/lang/String;")
    public String field2880;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "Lsm;")
    public class249 field2861;

    @OriginalMember(owner = "client!wt", name = "U", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!wt", name = "T", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!wt", name = "Y", descriptor = "Lms;")
    public static class363 field2879;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "F")
    public static float field2866;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!wt", name = "Q", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!wt", name = "S", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!wt", name = "W", descriptor = "I")
    public static int field2877;

    static {
        new class112("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field2875 = 104;
        field2874 = 0;
        field2879 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Z", line = 10)
    public final boolean method1267(int arg0, int arg1, int arg2) {
        field2871++;
        if (arg0 != 7027) {
            return true;
        }
        for (class251 var4 = (class251) this.field2861.method1544(-119); var4 != null; var4 = (class251) this.field2861.method1546((byte) -42)) {
            if (var4.method1563(arg1, arg2, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 328)
    public class200(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2870 = arg6;
        this.field2857 = arg3;
        this.field2878 = arg0;
        this.field2876 = arg1;
        this.field2865 = arg5;
        this.field2880 = arg2;
        this.field2867 = arg4;
        if (this.field2870 == 255) {
            this.field2870 = 0;
        }
        this.field2861 = new class249();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class8.field174 >= arg3 && arg4 >= class53.field874) {
            boolean var6;
            if (arg1 < class299.field4121) {
                var6 = false;
                arg1 = class299.field4121;
            } else if (class248.field3487 >= arg1) {
                var6 = true;
            } else {
                arg1 = class248.field3487;
                var6 = false;
            }
            boolean var7;
            if (arg5 < class299.field4121) {
                arg5 = class299.field4121;
                var7 = false;
            } else if (class248.field3487 >= arg5) {
                var7 = true;
            } else {
                arg5 = class248.field3487;
                var7 = false;
            }
            if (arg3 >= class53.field874) {
                class80.method554(class2.field16[arg3++], 108, arg2, arg5, arg1);
            } else {
                arg3 = class53.field874;
            }
            if (arg4 <= class8.field174) {
                class80.method554(class2.field16[arg4--], 97, arg2, arg5, arg1);
            } else {
                arg4 = class8.field174;
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    int[] var9 = class2.field16[var8];
                    var9[arg1] = var9[arg5] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg4; var10++) {
                    class2.field16[var10][arg1] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg4; var11++) {
                    class2.field16[var11][arg5] = arg2;
                }
            }
        }
        if (arg0 <= 86) {
            method1273(43);
        }
        field2864++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III[I)Z", line = 145)
    public final boolean method1269(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 < 97) {
            return true;
        }
        field2877++;
        for (class251 var5 = (class251) this.field2861.method1544(-121); var5 != null; var5 = (class251) this.field2861.method1546((byte) -42)) {
            if (var5.method1564(-10824, arg1, arg2)) {
                var5.method1566((byte) -34, arg3, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[IIII)Z", line = 178)
    public final boolean method1270(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 104) {
            return false;
        }
        field2860++;
        for (class251 var6 = (class251) this.field2861.method1544(arg2 - 215); var6 != null; var6 = (class251) this.field2861.method1546((byte) -42)) {
            if (var6.method1565(arg0, arg3, arg4, 0)) {
                var6.method1559(arg1, arg0, arg4, (byte) 124);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V", line = 205)
    public final void method1271(int arg0) {
        this.field2859 = arg0;
        this.field2863 = 12800;
        this.field2858 = 12800;
        field2862++;
        this.field2868 = 0;
        for (class251 var2 = (class251) this.field2861.method1544(arg0 - 94); var2 != null; var2 = (class251) this.field2861.method1546((byte) -42)) {
            if (var2.field3531 < this.field2863) {
                this.field2863 = var2.field3531;
            }
            if (this.field2868 < var2.field3520) {
                this.field2868 = var2.field3520;
            }
            if (var2.field3528 < this.field2858) {
                this.field2858 = var2.field3528;
            }
            if (var2.field3533 > this.field2859) {
                this.field2859 = var2.field3533;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(III[I)Z", line = 248)
    public final boolean method1272(int arg0, int arg1, int arg2, int[] arg3) {
        field2869++;
        for (class251 var5 = (class251) this.field2861.method1544(-106); var5 != null; var5 = (class251) this.field2861.method1546((byte) -42)) {
            if (var5.method1563(arg2, arg0, false)) {
                var5.method1559(arg3, arg2, arg0, (byte) 93);
                return true;
            }
        }
        return arg1 >= -34;
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V", line = 282)
    public static void method1273(int arg0) {
        if (arg0 != 0) {
            field2866 = 0.45487267F;
        }
        field2879 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 298)
    public static final void method1274(String arg0, boolean arg1) {
        System.out.println("Error: " + class163.method995(arg0, (byte) -118, "%0a", "\n"));
        if (!arg1) {
            field2875 = -74;
        }
        field2872++;
    }
}
