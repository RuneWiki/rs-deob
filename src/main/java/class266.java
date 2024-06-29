import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class266 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lgj;")
    public class580 field3785;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lfaa;")
    public static class140 field3784 = null;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[F")
    public static float[] field3781 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public static int method1624(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V")
    public abstract void method148(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public void method152(int arg0) {
        field3782++;
        if (arg0 != 0) {
            this.field3785 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IZ)V")
    public abstract void method144(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public void method145(byte arg0) {
        if (arg0 >= 65) {
            field3779++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public void method147(int arg0) {
        field3780++;
        if (arg0 != 0) {
            this.method148(-26, true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method1625(int arg0) {
        int var1 = -85 % ((-arg0 - 67) / 49);
        field3781 = null;
        field3784 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Z")
    public abstract boolean method154(int arg0);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lek;IB)V")
    public abstract void method150(class467 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public void method153(int arg0) {
        if (arg0 >= -93) {
            field3784 = null;
        }
        field3786++;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public void method151(int arg0) {
        if (arg0 > -1) {
            this.method145((byte) 22);
        }
        field3788++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public void method146(byte arg0) {
        field3783++;
        if (arg0 > -102) {
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Lfaa;")
    public static final class140 method1626(int arg0, int arg1) {
        field3787++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class676.field9545[var2] == null || class676.field9545[var2][var3] == null) {
            boolean var4 = class474.method2690(var2, -256197904);
            if (!var4) {
                return null;
            }
        }
        if (arg1 < 101) {
            field3784 = null;
        }
        return class676.field9545[var2][var3];
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lgj;)V")
    public class266(class580 arg0) {
        this.field3785 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public abstract void method155(boolean arg0);
}
