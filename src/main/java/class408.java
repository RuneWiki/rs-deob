import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class408 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[C")
    public static char[] field5785 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
    public static boolean field5786 = false;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5790;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ldj;")
    public static class191 field5788;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field5787;

    static {
        new class349("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field5790 = null;
        field5789 = 0;
        field5788 = new class191(8);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lak;", line = 3)
    public static final class194 method2572(int arg0) {
        field5782++;
        if (class176.field2472 == null || class86.field1120 == null) {
            return null;
        }
        class86.field1120.method1353(22303, class176.field2472);
        if (arg0 < 36) {
            return null;
        }
        class194 var1 = (class194) class86.field1120.method1354(-14082);
        if (var1 == null) {
            return null;
        } else {
            class297 var2 = class379.method2417(3144, var1.field2794);
            return var2 != null && var2.field4299 && var2.method2008(true) ? var1 : class214.method1493(64);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V", line = 47)
    public static void method2573(int arg0) {
        field5790 = null;
        field5788 = null;
        if (arg0 != 732) {
            field5788 = null;
        }
        field5785 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)V", line = 61)
    public static final void method2574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5784++;
        int var8 = arg3 - arg5;
        if (arg4 >= -40) {
            field5790 = null;
        }
        int var9 = arg5 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class5.method17(class440.field6288[var10], arg0, arg1, (byte) 102, arg6);
        }
        for (int var11 = arg3; var11 > var8; var11--) {
            class5.method17(class440.field6288[var11], arg0, arg1, (byte) 94, arg6);
        }
        int var12 = arg0 - arg5;
        int var13 = arg5 + arg6;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class440.field6288[var14];
            class5.method17(var15, var13, arg1, (byte) 96, arg6);
            class5.method17(var15, var12, arg2, (byte) 117, var13);
            class5.method17(var15, arg0, arg1, (byte) 65, var12);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)V", line = 108)
    public static final void method2575(int arg0, int arg1) {
        class15 var2 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method91(4, arg0);
        }
        field5787++;
        if (arg1 != 8226) {
            field5789 = -46;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public abstract void method1269(int arg0, int arg1);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Lr;")
    public abstract class99 method1281(int arg0);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1276(int arg0, int arg1);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I")
    public abstract int method1268(int arg0, int arg1);
}
