import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class448 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lkea;")
    private class203 field6684;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lea;")
    public static class474 field6683 = new class474(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6686 = 0;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
    public static int[] field6688 = new int[2];

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lea;")
    public static class474 field6685 = new class474("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
    public static int[] field6691 = new int[4096];

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([I[IIII)V")
    public static final void method2780(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg1[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method2780(arg0, arg1, var6 - 1, -86, arg4);
            method2780(arg0, arg1, arg2, -49, var6 + 1);
        }
        field6690++;
        if (arg3 > -33) {
            method2780(null, null, -97, -127, -99);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)Z")
    public static final boolean method2781(int arg0) {
        field6687++;
        if (arg0 <= 24) {
            field6691 = null;
        }
        return class568.field8160 == 0 ? class224.field3145.method2473((byte) 67) : true;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
    public static void method2782(int arg0) {
        field6685 = null;
        if (arg0 < 14) {
            field6683 = null;
        }
        field6683 = null;
        field6691 = null;
        field6688 = null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class448(class149 arg0, int arg1, class203 arg2) {
        new class277(64);
        this.field6684 = arg2;
        this.field6682 = this.field6684.method1309(1675886592, 15);
    }
}
