import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class470 extends class431 {

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public int field6785;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    private int field6784;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "F")
    public float field6794;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public int field6791;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "Z")
    public static boolean field6792 = true;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "[I")
    public static int[] field6797 = new int[1024];

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "Lak;")
    public static class234 field6796 = new class234("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "Z")
    public static boolean field6798 = false;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lul;")
    public static class406 field6786;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "[I")
    public static int[] field6799;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)I")
    public final int method2832(boolean arg0) {
        if (arg0) {
            this.method787(71, true, 20, 30);
        }
        field6787++;
        return this.field6783;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IF)V")
    public abstract void method791(int arg0, float arg1);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
    public final int method2833(byte arg0) {
        if (arg0 <= 68) {
            this.method2833((byte) 91);
        }
        field6790++;
        return this.field6791;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)F")
    public final float method2834(int arg0) {
        field6782++;
        int var2 = 16 % ((arg0 + 12) / 45);
        return this.field6794;
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)I")
    public final int method2835(int arg0) {
        field6793++;
        if (arg0 != -30143) {
            field6792 = true;
        }
        return this.field6785;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)I")
    public final int method2836(byte arg0) {
        int var2 = -128 % ((arg0 - 13) / 36);
        field6795++;
        return this.field6784;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZII)V")
    public abstract void method787(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "(I)V")
    public static void method2837(int arg0) {
        field6796 = null;
        field6786 = null;
        field6797 = null;
        if (arg0 <= -107) {
            field6799 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
    public final int method2838(byte arg0) {
        field6789++;
        if (arg0 >= -82) {
            this.method2835(-8);
        }
        return this.field6781;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIF)V")
    public class470(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6785 = arg0;
        this.field6784 = arg4;
        this.field6794 = arg5;
        this.field6791 = arg2;
        this.field6781 = arg3;
        this.field6783 = arg1;
    }
}
