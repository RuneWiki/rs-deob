import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class193 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[Li;")
    public static class83[] field2794;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[S")
    public static short[] field2796;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lcj;")
    public static class183 field2795;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        field2795 = null;
        if (arg0 >= 13) {
            field2796 = null;
            field2794 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public abstract int method553(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2793++;
        if (arg4 <= 96) {
            field2798 = -87;
        }
        if (arg7 < 128 || arg5 < 128 || arg7 > ((class11.field107 - 2) * 128) || arg5 > ((class264.field3620 - 2) * 128)) {
            class282.field3840[0] = class282.field3840[1] = -1;
            return;
        }
        int var9 = class50.method408(class343.field4623, arg7, arg5, 16) - arg6;
        class406.field5619.method1869(arg8, 0, 0);
        class354.field4765.method168(class406.field5619);
        class354.field4765.method243(arg7, var9, arg5, class282.field3840);
        class406.field5619.method1869(-arg8, 0, 0);
        class354.field4765.method168(class406.field5619);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)J")
    public abstract long method550(byte arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg7 && arg5 == arg6 && arg1 == arg2 && arg0 == arg9) {
            class92.method727(arg8, arg7, arg0, (byte) 117, arg2, arg6);
        } else {
            int var10 = arg7;
            int var11 = arg6;
            int var12 = arg7 * 3;
            int var13 = arg6 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg1 * 3;
            int var17 = arg9 * 3;
            int var18 = arg2 + var14 - arg7 - var16;
            int var19 = arg0 + var15 - var17 - arg6;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg7;
                int var34 = (var28 + var30 + var32 >> 12) + arg6;
                class92.method727(arg8, var10, var34, (byte) 7, var33, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg3 == -10533) {
            field2797++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
    public abstract void method551(byte arg0);

    static {
        new class368("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field2798 = 0;
        field2794 = new class83[14];
        field2796 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field2795 = class294.method1792((byte) -25);
    }
}
