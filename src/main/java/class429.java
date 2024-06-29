import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class429 {

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    private int field5551 = 0;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    private int field5550 = -1;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lki;")
    private class364 field5552 = new class364();

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "Z")
    public boolean field5565 = false;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    private int field5564;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    private int field5560;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "[[[I")
    private int[][][] field5557;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "[Lwba;")
    private class540[] field5558;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field5554 = 0;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "Lmv;")
    public static class297 field5556 = new class297(14, 0, 4, 1);

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field5553;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2464(int arg0) {
        field5559++;
        if (this.field5564 != this.field5560) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -57) {
            method2468((byte) 73);
        }
        for (int var2 = 0; var2 < this.field5564; var2++) {
            this.field5558[var2] = class603.field8113;
        }
        return this.field5557;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZIII)V")
    public static final void method2465(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field5554 = 43;
        }
        if (class265.field3552 <= (arg4 - arg3) && arg3 + arg4 <= class641.field8924 && class165.field2061 <= (arg2 - arg3) && class99.field1309 >= (arg2 + arg3)) {
            class122.method902(-8979, arg2, arg0, arg3, arg4);
        } else {
            class645.method3542(59, arg0, arg2, arg3, arg4);
        }
        field5561++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[[I")
    public final int[][] method2466(int arg0, int arg1) {
        field5563++;
        if (arg1 != 0) {
            return null;
        } else if (this.field5564 == this.field5560) {
            this.field5565 = this.field5558[arg0] == null;
            this.field5558[arg0] = class603.field8113;
            return this.field5557[arg0];
        } else if (this.field5564 == 1) {
            this.field5565 = this.field5550 != arg0;
            this.field5550 = arg0;
            return this.field5557[0];
        } else {
            class540 var3 = this.field5558[arg0];
            if (var3 == null) {
                this.field5565 = true;
                if (this.field5564 <= this.field5551) {
                    class540 var4 = (class540) this.field5552.method2081(-125);
                    var3 = new class540(arg0, var4.field7020);
                    this.field5558[var4.field7018] = null;
                    var4.method2438((byte) 118);
                } else {
                    var3 = new class540(arg0, this.field5551);
                    this.field5551++;
                }
                this.field5558[arg0] = var3;
            } else {
                this.field5565 = false;
            }
            this.field5552.method2082((byte) -106, var3);
            return this.field5557[var3.field7020];
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
    public final void method2467(boolean arg0) {
        if (arg0) {
            field5555 = -4;
        }
        for (int var2 = 0; var2 < this.field5564; var2++) {
            this.field5557[var2][0] = null;
            this.field5557[var2][1] = null;
            this.field5557[var2][2] = null;
            this.field5557[var2] = null;
        }
        field5562++;
        this.field5557 = null;
        this.field5558 = null;
        this.field5552.method2085((byte) 9);
        this.field5552 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        if (arg0 < 4) {
            method2468((byte) 124);
        }
        field5553 = null;
        field5556 = null;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(III)V")
    public class429(int arg0, int arg1, int arg2) {
        this.field5564 = arg0;
        this.field5560 = arg1;
        this.field5557 = new int[this.field5564][3][arg2];
        this.field5558 = new class540[this.field5560];
    }
}
