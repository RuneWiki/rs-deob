import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class53 {

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Lpi;")
    public static class342 field924 = new class342("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIZ[Ljava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method470(int arg0, int arg1, boolean arg2, String[] arg3) {
        if (arg2) {
            field924 = null;
        }
        field920++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZIIII)V", line = 66)
    public static final void method471(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field919++;
        if (arg1) {
            method472(-16, 82, -116);
        }
        int var8 = arg0 + 1;
        class179.method1269(class21.field430[arg0], arg2, arg5, arg3, 26985);
        int var9 = arg4 - 1;
        class179.method1269(class21.field430[arg4], arg2, arg5, arg3, 26985);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class21.field430[var6];
            var7[arg5] = var7[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z", line = 93)
    public static final boolean method472(int arg0, int arg1, int arg2) {
        field918++;
        if (arg0 != -1) {
            field924 = null;
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 104)
    public static void method473(int arg0) {
        field924 = null;
        if (arg0 != 1) {
            method472(-12, -17, 73);
        }
    }
}
