import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class14 {

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Li;")
    public static class203 field187 = new class203(128);

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lgb;")
    public static class158 field188 = new class158(100);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)Z", line = 6)
    public static final boolean method72(boolean arg0, int arg1) {
        field182++;
        if (arg0) {
            method74(72, 8, -19, 30);
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 20)
    public static void method73(byte arg0) {
        field188 = null;
        int var1 = 115 % ((-arg0 - 28) / 54);
        field187 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I", line = 37)
    public static final int method74(int arg0, int arg1, int arg2, int arg3) {
        field186++;
        if (arg2 != -1178441849) {
            method72(true, -2);
        }
        return arg3 > arg1 ? arg3 : (arg0 >= arg1 ? arg1 : arg0);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)I", line = 64)
    public static final int method75(int arg0, int arg1, int arg2, int arg3) {
        field181++;
        if (arg1 == arg3) {
            return arg3;
        }
        if (arg0 != 1794751303) {
            method75(48, -66, 67, 55);
        }
        int var4 = 128 - arg2;
        int var5 = ((-16711936 & arg1) >>> 7) * arg2 + ((arg3 & -16711936) >>> 7) * var4 & 0xFF00FF00;
        int var6 = (arg3 & 0xFF00FF) * var4 + ((arg1 & 0xFF00FF) * arg2) & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V", line = 89)
    public class14(int arg0, int arg1, int arg2) {
        this.field189 = arg2;
        this.field183 = arg1;
        this.field184 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZI)V")
    public abstract void method4(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public abstract void method8(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public abstract void method13(int arg0, int arg1, int arg2);
}
