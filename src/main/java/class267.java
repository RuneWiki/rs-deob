import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class267 extends class565 {

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[[B")
    public static byte[][] field3377 = new byte[250][];

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Lgaa;")
    public static class460 field3382 = null;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field3378 = 2;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILgq;Lkfa;III)V", line = 5)
    public class267(int arg0, class761 arg1, class407 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3383 = arg5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([Ljava/lang/String;IZI)Ljava/lang/String;", line = 19)
    public static final String method1605(String[] arg0, int arg1, boolean arg2, int arg3) {
        field3379++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (!arg2) {
                field3378 = -42;
            }
            for (int var9 = arg3; var9 < var5; var9++) {
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

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 82)
    public static void method1606(int arg0) {
        field3377 = null;
        field3382 = null;
        if (arg0 != 4) {
            field3377 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Lqi;", line = 93)
    public final class669 method271(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3380++;
            return class335.field4308;
        }
    }
}
