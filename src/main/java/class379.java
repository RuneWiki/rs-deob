import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class class379 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lnk;")
    public static class326 field5877 = new class326(26, 6);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Llo;")
    public static class306 field5879 = new class306(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5881 = -1;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Z")
    public static boolean field5880 = false;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5882 = -50;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static void method2400(int arg0) {
        if (arg0 <= 32) {
            method2400(-56);
        }
        field5879 = null;
        field5877 = null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public abstract void method1362(int arg0);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lhu;")
    public abstract class472 method1371(byte arg0);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Z")
    public abstract boolean method1369(int arg0, int arg1);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2401(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -58 % ((arg4 - 71) / 42);
        int var10 = arg5 + 1;
        class357.method2291(arg2, arg0, class209.field3294[arg5], arg1, -1);
        field5878++;
        int var9 = arg3 - 1;
        class357.method2291(arg2, arg0, class209.field3294[arg3], arg1, -1);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class209.field3294[var7];
            var8[arg2] = var8[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public abstract void method1370(boolean arg0);
}
