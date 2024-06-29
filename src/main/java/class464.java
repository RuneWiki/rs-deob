import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class464 extends class499 {

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
    public boolean field6744;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public int field6741;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Lfg;")
    public static class83 field6746 = new class83(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lfg;")
    public static class83 field6748 = new class83("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Luf;")
    public static class310 field6749 = new class310(47, 10);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lvh;")
    public static class240 field6747;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static void method2726(boolean arg0) {
        field6748 = null;
        if (arg0) {
            method2727(-16, -57, 37, 64, -33);
        }
        field6749 = null;
        field6746 = null;
        field6747 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    public static final void method2727(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -11436) {
            method2727(-80, 115, 92, 69, 73);
        }
        field6745++;
        if (class382.field5379 <= (arg4 - arg2) && arg2 + arg4 <= class175.field2497 && (arg0 - arg2) >= class343.field4727 && class54.field753 >= (arg0 + arg2)) {
            class331.method1842(arg2, arg0, arg4, arg3, -70);
        } else {
            class39.method251(-1, arg2, arg3, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;IIZ)Ljava/lang/String;")
    public static final String method2728(String[] arg0, int arg1, int arg2, boolean arg3) {
        field6740++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (!arg3) {
                return null;
            }
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIZ)V")
    public class464(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6743 = arg3;
        this.field6744 = arg5;
        this.field6742 = arg1;
        this.field6741 = arg4;
        this.field6738 = arg0;
        this.field6739 = arg2;
    }
}
