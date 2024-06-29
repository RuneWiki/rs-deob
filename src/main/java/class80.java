import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class80 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field921 = -1;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field917 = -1;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
    public static boolean field916 = false;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field922 = -1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lfs;")
    public static class356 field919;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
    public int[] field915;

    static {
        new class487("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 6)
    public static void method459(int arg0) {
        if (arg0 != -1) {
            method459(-90);
        }
        field919 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIII)V", line = 16)
    public static final void method460(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field920++;
        int var7 = class406.method2430(class483.field7334, arg6, class202.field3021, 64);
        int var8 = class406.method2430(class483.field7334, arg1, class202.field3021, 64);
        int var9 = class406.method2430(class130.field1712, arg0, class401.field5755, 64);
        int var10 = class406.method2430(class130.field1712, arg4, class401.field5755, 64);
        int var11 = class406.method2430(class483.field7334, arg5 + arg6, class202.field3021, 64);
        int var12 = class406.method2430(class483.field7334, arg1 - arg5, class202.field3021, 64);
        int var13 = 66 % ((-arg2 - 54) / 44);
        for (int var14 = var7; var14 < var11; var14++) {
            class69.method418(arg3, class47.field558[var14], var10, (byte) 117, var9);
        }
        for (int var15 = var8; var15 > var12; var15--) {
            class69.method418(arg3, class47.field558[var15], var10, (byte) 117, var9);
        }
        int var16 = class406.method2430(class130.field1712, arg0 + arg5, class401.field5755, 64);
        int var17 = class406.method2430(class130.field1712, arg4 - arg5, class401.field5755, 64);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class47.field558[var18];
            class69.method418(arg3, var19, var16, (byte) 117, var9);
            class69.method418(arg3, var19, var10, (byte) 117, var17);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V", line = 68)
    public static final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field918++;
        if (arg0 != -8305) {
            field916 = true;
        }
        if (class202.field3021 < arg5 || class483.field7334 > arg3) {
            return;
        }
        boolean var6;
        if (arg4 < class130.field1712) {
            arg4 = class130.field1712;
            var6 = false;
        } else if (arg4 <= class401.field5755) {
            var6 = true;
        } else {
            var6 = false;
            arg4 = class401.field5755;
        }
        boolean var7;
        if (class130.field1712 > arg1) {
            arg1 = class130.field1712;
            var7 = false;
        } else if (arg1 > class401.field5755) {
            arg1 = class401.field5755;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class483.field7334 <= arg5) {
            class69.method418(arg2, class47.field558[arg5++], arg1, (byte) 117, arg4);
        } else {
            arg5 = class483.field7334;
        }
        if (class202.field3021 < arg3) {
            arg3 = class202.field3021;
        } else {
            class69.method418(arg2, class47.field558[arg3--], arg1, (byte) 117, arg4);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg3; var8++) {
                int[] var9 = class47.field558[var8];
                var9[arg4] = var9[arg1] = arg2;
            }
        } else if (var6) {
            for (int var11 = arg5; var11 <= arg3; var11++) {
                class47.field558[var11][arg4] = arg2;
            }
        } else if (var7) {
            for (int var10 = arg5; var10 <= arg3; var10++) {
                class47.field558[var10][arg1] = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lps;B)V", line = 179)
    public final void method462(class428 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2561((byte) 111);
            if (var3 == 0) {
                if (arg1 > -14) {
                    this.field917 = -10;
                }
                field923++;
                return;
            }
            this.method463(arg0, var3, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lps;IB)V", line = 209)
    private final void method463(class428 arg0, int arg1, byte arg2) {
        if (arg2 != 52) {
            return;
        }
        if (arg1 == 1) {
            this.field917 = arg0.method2620(arg2 - 15);
        } else if (arg1 == 2) {
            this.field915 = new int[arg0.method2561((byte) -40)];
            for (int var4 = 0; var4 < this.field915.length; var4++) {
                this.field915[var4] = arg0.method2620(70);
            }
        } else if (arg1 == 3) {
            this.field921 = arg0.method2561((byte) 125);
        }
        field924++;
    }
}
