import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class231 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field2950 = -1;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field2949 = -1;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lap;")
    public static class335 field2947 = new class335("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ldq;")
    public static class493 field2951 = new class493(32, 0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lqn;")
    public static class47 field2945;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public int[] field2948;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[Ll;")
    public static class16[] field2953;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILfh;)V", line = 3)
    private final void method1402(int arg0, int arg1, class463 arg2) {
        if (arg0 != 0) {
            field2947 = null;
        }
        field2946++;
        if (arg1 == 1) {
            this.field2950 = arg2.method2758((byte) 87);
        } else if (arg1 == 2) {
            this.field2948 = new int[arg2.method2737(false)];
            for (int var4 = 0; var4 < this.field2948.length; var4++) {
                this.field2948[var4] = arg2.method2758((byte) 109);
            }
        } else if (arg1 == 3) {
            this.field2949 = arg2.method2737(false);
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfh;)V", line = 36)
    public final void method1403(int arg0, class463 arg1) {
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field2943++;
                if (arg0 != -1) {
                    this.method1402(122, 85, null);
                    return;
                }
                return;
            }
            this.method1402(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 62)
    public static final int method1404(int arg0, int arg1) {
        field2944++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1 == 1) {
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return arg0 & ~var7;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 80)
    public static void method1405(int arg0) {
        field2951 = null;
        field2945 = null;
        field2953 = null;
        field2947 = null;
        if (arg0 > -11) {
            field2945 = null;
        }
    }
}
