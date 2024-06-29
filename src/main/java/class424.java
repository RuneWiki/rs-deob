import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class424 extends class525 {

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lbd;")
    public static class44 field5990 = new class44("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Z")
    public static boolean field5995;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Lqv;")
    public static class316 field5992;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "F")
    public static float field5994;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field5993;

    static {
        new class44("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field5995 = false;
        field5992 = new class316(19, 3);
        field5996 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V", line = 4)
    public static void method2510(byte arg0) {
        field5992 = null;
        field5990 = null;
        if (arg0 != 49) {
            field5994 = -2.0455246F;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5991++;
        if (arg2 != 2) {
            method2510((byte) 53);
        }
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        class479.method2839(arg3 + arg0, -arg0 + arg3, class271.field4078[arg4], arg2 + 103, arg1);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class271.field4078[arg4 + var6];
                int[] var10 = class271.field4078[arg4 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class479.method2839(var11, var12, var9, 64, arg1);
                class479.method2839(var11, var12, var10, 73, arg1);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class271.field4078[arg4 + var5];
            int[] var16 = class271.field4078[arg4 - var5];
            class479.method2839(var13, var14, var15, arg2 ^ 0x50, arg1);
            class479.method2839(var13, var14, var16, 90, arg1);
        }
    }
}
