import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class176 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Llc;")
    private class629 field2675;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lkb;")
    public static class176 field2671 = new class176(0, 3, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lkb;")
    public static class176 field2676 = new class176(1, 3, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lkb;")
    public static class176 field2677 = new class176(2, 4, class629.field9208);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lkb;")
    public static class176 field2678 = new class176(3, 1, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lkb;")
    public static class176 field2679 = new class176(4, 2, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lkb;")
    public static class176 field2680 = new class176(5, 3, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lkb;")
    private static class176 field2681 = new class176(6, 4, class629.field9212);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field2682 = class552.method3233(91, 16);

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2683 = new BigInteger("b5cdc2d7fc4fafa9ff483bec98fd679e8b75be8bd7fc7239f7a6f8436f19eb8bc475f1461e7ac07b5a61f9b8e9c4bf9fa5a1ba9aab6111af84c28f52a06c497f0bdf9a76532ad422929fcc498fae5ca83e15ae61bca9522691bf48dbe6d34d01fbdf01235ce126ccb273b57eee477685a23df6bd53e355f5a2d81fdd246b3574f9bac514630f36f855a8d62e20af72258b67a9ced6c6cd2de5c2c2497a66d65d4c59e0494c19a6fb3fc028434766ed6aac71532af4d628fee0cab26d17118a219e328dbf59f4098e5770357bf692e29dd501379377e20ec994a3581dcf9505fcbf695340b2bee5e80ac06d5f11be488224f36a3fda289e74a87fc69bcb83137af727daa8bc7c07ba6ab0062f30b2b6a64e651dca9477b2da4562b08d0fd041eca45065ecfea82e81bf21cbf8ccbfa5872fc1a051b5b5e91dd6d53969720e236a0062c9577043cd7d3a136f6c0a99f4509364f03ff515f3db1233e99e5fd6e0e9f48522dff91fe60d899f30092ab598bc94204e14406b98c3be20e68010ed09679ce53f4efc7771ed3e928134949b64822fac79de0fe92c6768776785c5ca9e14db6ecb1a30d0909b7ba9f1c5e29875fcd717d0fe185361e2e84a583ec6ad84f88475cebaa388e0a5c0c69fbeca1ce781632d0c4b3333d7ed07980e11a4cfb85f211f9b1c9305ac5d3669e8665fa56bbbdf65a610e0e4cccbea9cf24382e74459", 16);

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lnj;")
    public static class487 field2684 = new class487("M", "M", "M", "M");

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lnj;")
    public static class487 field2685;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lnj;")
    public static class487 field2686;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2668++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        class68.field779 = 0;
        field2672++;
        if (arg0 < 80) {
            field2677 = null;
        }
        class10.field94 = new class585[50];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIZII)V")
    public static final void method1181(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg1) {
            method1180(82);
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field2673++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class74.field861 + ((class224.field3317 - class74.field861) * var6 / 100);
        if (class518.field7698 > var7) {
            var7 = class518.field7698;
        } else if (class371.field5375 < var7) {
            var7 = class371.field5375;
        }
        int var8 = arg5 * 512 * var7 / (arg0 * 334);
        if (var8 < class234.field3441) {
            short var12 = class234.field3441;
            var7 = arg0 * var12 * 334 / (arg5 * 512);
            if (var7 > class371.field5375) {
                var7 = class371.field5375;
                int var13 = arg5 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg3) {
                    class379.field5558.method985();
                    class379.field5558.method1066((byte) 102, arg4, -16777216, arg2, arg5, var14);
                    class379.field5558.method1066((byte) 92, arg4, -16777216, arg2 - (var14 - arg0), arg5, var14);
                }
                arg2 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class162.field2162) {
            short var9 = class162.field2162;
            var7 = var9 * 334 * arg0 / (arg5 * 512);
            if (var7 < class518.field7698) {
                var7 = class518.field7698;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg3) {
                    class379.field5558.method985();
                    class379.field5558.method1066((byte) 82, arg4, -16777216, arg2, var11, arg0);
                    class379.field5558.method1066((byte) 115, arg4 + arg5 - var11, -16777216, arg2, var11, arg0);
                }
                arg4 += var11;
                arg5 -= var11 * 2;
            }
        }
        class150.field1930 = arg4;
        class619.field9034 = (short) arg0;
        class380.field5565 = arg5 * var7 / 334;
        class578.field8520 = arg2;
        class115.field1522 = (short) arg5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method1182(boolean arg0) {
        field2684 = null;
        field2676 = null;
        field2677 = null;
        field2671 = null;
        field2683 = null;
        field2680 = null;
        field2686 = null;
        field2681 = null;
        field2679 = null;
        field2678 = null;
        if (arg0) {
            field2682 = -99;
        }
        field2685 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)[Lkb;")
    public static final class176[] method1183(boolean arg0) {
        if (arg0) {
            field2686 = null;
        }
        field2669++;
        return new class176[] { field2671, field2676, field2677, field2678, field2679, field2680, field2681 };
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IILlc;)V")
    private class176(int arg0, int arg1, class629 arg2) {
        this.field2675 = arg2;
        this.field2670 = arg0;
        this.field2674 = arg1;
        this.field2667 = this.field2675.field9202 * this.field2674;
        if (this.field2670 >= 16) {
            throw new RuntimeException();
        }
    }

    static {
        new class487(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field2685 = new class487("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");
        field2686 = new class487("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
    }
}
