import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class231 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[[Z")
    public static boolean[][] field3744;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ltr;")
    public static class195 field3745;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIFIILhj;[BFFIFFZ)V")
    public static final void method1625(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, class403 arg6, byte[] arg7, float arg8, float arg9, int arg10, float arg11, float arg12, boolean arg13) {
        field3741++;
        int var14 = arg0 * arg10;
        float[] var15 = new float[var14];
        if (!arg13) {
            method1627((byte) -15);
        }
        for (int var16 = 0; var16 < arg4; var16++) {
            int var19 = arg1;
            arg6.method2522(arg8 / (float) arg0, arg9 / (float) arg5, arg0, arg3 * 127.0F, arg5, arg10, 6347, 0, var15, arg12 / (float) arg10, arg2);
            arg12 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg7[var19] = (byte) ((int) ((float) arg7[var19] + var15[var20]));
                var19++;
            }
            arg9 *= 2.0F;
            arg3 *= arg11;
            arg8 *= 2.0F;
        }
        int var17 = arg1;
        for (int var18 = 0; var18 < var14; var18++) {
            arg7[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method1626(int arg0) {
        field3742++;
        int var1 = class111.field1558;
        int[] var2 = class318.field4804;
        for (int var3 = arg0; var3 < var1; var3++) {
            class177 var4 = class26.field319[var2[var3]];
            if (var4 != null) {
                class157.method1082(var4.method953(-42), var4, -1);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        field3745 = null;
        if (arg0 != 10) {
            field3744 = null;
        }
        field3744 = null;
    }

    static {
        new class234("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field3744 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
        field3745 = new class195(4, 18);
        new class234("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
