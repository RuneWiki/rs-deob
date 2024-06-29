import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class305 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field4054;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4055;

    static {
        new class305("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZ)V", line = 33)
    public static final void method1821(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4052++;
        int var5 = 0;
        int var6 = arg2;
        if (arg4) {
            field4055 = -33;
        }
        int var7 = -arg2;
        int var8 = -1;
        class476.method2907(arg1 + arg2, 33, arg3, class5.field54[arg0], arg1 - arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class5.field54[arg0 + var6];
                int[] var10 = class5.field54[arg0 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class476.method2907(var11, 108, arg3, var9, var12);
                class476.method2907(var11, 43, arg3, var10, var12);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class5.field54[arg0 + var5];
            int[] var16 = class5.field54[arg0 - var5];
            class476.method2907(var13, 52, arg3, var15, var14);
            class476.method2907(var13, 69, arg3, var16, var14);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 102)
    public static final void method1822(int arg0) {
        field4053++;
        if (class169.field2193 != null) {
            class169.field2193.method1724(1);
            class169.field2193 = null;
            class53.field621 = null;
        }
        if (arg0 != 0) {
            field4055 = 119;
        }
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;", line = 122)
    public final String toString() {
        field4050++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 189)
    public final String method1823(int arg0, byte arg1) {
        field4051++;
        if (arg1 != -88) {
            this.method1823(-94, (byte) 19);
        }
        return this.field4054[arg0];
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 199)
    public class305(String arg0, String arg1, String arg2, String arg3) {
        this.field4054 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
