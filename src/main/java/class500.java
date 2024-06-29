import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class500 {

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field7491 = -1;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Lnj;")
    public static class487 field7489 = new class487("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "[I")
    public static int[] field7493 = new int[8];

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V", line = 4)
    public static final void method3008(long[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg2; var11++) {
                if (arg0[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method3008(arg0, arg1, var6 - 1, arg3, 95);
            method3008(arg0, var6 + 1, arg2, arg3, -40);
        }
        int var15 = -30 / ((18 - arg4) / 56);
        field7492++;
    }

    @OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;", line = 68)
    public final String toString() {
        field7494++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V", line = 76)
    public static void method3009(boolean arg0) {
        field7493 = null;
        if (!arg0) {
            field7491 = -104;
        }
        field7489 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V", line = 90)
    public static final void method3010(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7490++;
        int var5 = 1 % ((arg0 + 56) / 62);
        if (class483.field7334 <= arg3 && arg3 <= class202.field3021) {
            int var6 = class406.method2430(class130.field1712, arg1, class401.field5755, 64);
            int var7 = class406.method2430(class130.field1712, arg2, class401.field5755, 64);
            class562.method3286((byte) -114, arg4, var7, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 110)
    public class500(String arg0, int arg1) {
        this.field7495 = arg1;
    }
}
