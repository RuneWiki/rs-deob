import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class51 extends class708 {

    @OriginalMember(owner = "client!oia", name = "l", descriptor = "Lkw;")
    private class346 field821;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!oia", name = "u", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!oia", name = "r", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "[I")
    public static int[] field820 = new int[2];

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!oia", name = "s", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!oia", name = "t", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "Ldm;")
    private class96 field823;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "Ljava/lang/String;")
    public static String field818;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Ldm;", line = 13)
    public final class96 method469(byte arg0) {
        int var2 = 78 / ((83 - arg0) / 33);
        field829++;
        if (this.field823 == null) {
            class617.field8786[3] = this.field824;
            class617.field8786[4] = this.field825;
            class617.field8786[0] = this.field819;
            class617.field8786[5] = this.field827;
            class617.field8786[2] = this.field830;
            class617.field8786[1] = this.field816;
            class267 var3 = this.field821.field7881;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method963((byte) 41, class617.field8786[var6])) {
                    return null;
                }
                class679 var8 = var3.method962(class617.field8786[var6], 2904);
                int var9 = var8.field9636 ? 64 : 128;
                if (var5 < var9) {
                    var5 = var9;
                }
                if (var8.field9634 > 0) {
                    var4 = true;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class743.field10366[var7] = var3.method964(-125, false, var5, class617.field8786[var7], var5, 1.0F);
            }
            this.field823 = new class96(this.field821, 6407, var5, var4, class743.field10366);
        }
        return this.field823;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V", line = 76)
    public static void method470(int arg0) {
        field820 = null;
        if (arg0 != 6407) {
            method471(false, (byte) -1);
        }
        field818 = null;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZB)V", line = 87)
    public static final void method471(boolean arg0, byte arg1) {
        field826++;
        if (arg0) {
            if (class346.field4771 != -1) {
                class706.method3956(0, class346.field4771);
            }
            for (class182 var2 = (class182) class591.field8410.method4023((byte) -91); var2 != null; var2 = (class182) class591.field8410.method4021((byte) 80)) {
                if (!var2.method2657(false)) {
                    var2 = (class182) class591.field8410.method4023((byte) -36);
                    if (var2 == null) {
                        break;
                    }
                }
                class417.method2517(0, true, false, var2);
            }
            class346.field4771 = -1;
            class591.field8410 = new class715(8);
            class727.method4061(-1);
            class346.field4771 = class476.field6769;
            class196.method1380(arg1 ^ 0xFFFFFF87, false);
            class328.method2021(-8586);
            class529.method3202(class346.field4771);
        }
        class496.field7143 = true;
        if (arg1 != 9) {
            method473(-97, 7, null);
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V", line = 136)
    public static final void method472(byte arg0) {
        field817++;
        if (class675.field9608) {
            return;
        }
        class275.field3877 = true;
        class675.field9608 = true;
        class201.field2980 += (-class201.field2980 - 12.0F) / 2.0F;
        if (arg0 != -33) {
            field818 = null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lkw;IIIIII)V", line = 155)
    public class51(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field821 = arg0;
        this.field816 = arg2;
        this.field830 = arg3;
        this.field819 = arg1;
        this.field827 = arg6;
        this.field825 = arg5;
        this.field824 = arg4;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IILjava/lang/String;)Z", line = 169)
    public static final boolean method473(int arg0, int arg1, String arg2) {
        field822++;
        if (class345.field4749.field4087) {
            class214.field3215 = new class518();
            class214.field3215.field7472 = arg1;
            class214.field3215.field7468 = arg2;
            if (class536.field7793 != class25.field223) {
                class214.field3215.field7471 = class214.field3215.field7472 + 50000;
                class214.field3215.field7464 = class214.field3215.field7472 + 40000;
            }
            if (arg1 < class537.field7803.length && class537.field7803[arg1] != null) {
                class616.field8781 = class537.field7803[arg1].field4069;
            }
            return true;
        }
        String var3 = "";
        if (class536.field7793 != class25.field223) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class565.field8191 != null) {
            var4 = "/p=" + class565.field8191;
        }
        if (arg0 != 50000) {
            return true;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class45.field748 + "/a=" + class50.field813 + var4 + "/j" + (class525.field7640 ? "1" : "0") + ",o" + (class326.field4428 ? "1" : "0") + ",a2";
        try {
            class660.field9437.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }
}
