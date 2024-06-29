import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public abstract class class435 {

    @OriginalMember(owner = "client!st", name = "d", descriptor = "[F")
    public static float[] field6468 = new float[16384];

    @OriginalMember(owner = "client!st", name = "f", descriptor = "[F")
    public static float[] field6470 = new float[16384];

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field6469;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6468[var2] = (float) Math.sin((double) var2 * var0);
            field6470[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 6)
    public static void method2693(byte arg0) {
        if (arg0 < 97) {
            method2700(-5, null);
        }
        field6468 = null;
        field6470 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILvd;)V", line = 18)
    public static final void method2694(int arg0, class39 arg1) {
        field6469++;
        class228.field3345 = arg1;
        if (arg0 != 817) {
            method2693((byte) 118);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILsca;)V", line = 38)
    public static final void method2700(int arg0, class46 arg1) {
        field6465++;
        if (arg0 < 96) {
            field6466 = -85;
        }
        class46 var2 = class178.method1261(84, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class501.field7123;
            var4 = class510.field7263;
        } else {
            var4 = var2.field574;
            var3 = var2.field549;
        }
        class58.method406((byte) 31, var3, var4, arg1, false);
        class654.method3785(var4, var3, 108, arg1);
    }

    @OriginalMember(owner = "client!st", name = "g", descriptor = "(I)Z", line = 65)
    public final boolean method2701(int arg0) {
        if (arg0 != 16384) {
            this.method2691(-102);
        }
        field6467++;
        return this.method2690(27621) || this.method2692(0) || this.method2695((byte) -116);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
    public abstract boolean method2690(int arg0);

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    public abstract void method2691(int arg0);

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
    public abstract boolean method2692(int arg0);

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Z")
    public abstract boolean method2695(byte arg0);

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
    public abstract void method2696(int arg0);

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)I")
    public abstract int method2697(int arg0);

    @OriginalMember(owner = "client!st", name = "f", descriptor = "(I)I")
    public abstract int method2698(int arg0);

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Lwi;")
    public abstract class467 method2699(boolean arg0);
}
