import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class232 extends class23 {

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    private int field4354 = 2048;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    private int field4358 = 10;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    private int field4353 = 0;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Li;")
    public static class88 field4352 = class208.method1425(105, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static volatile int field4355 = -1;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field4359 = 2;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Li;")
    private static class88 field4360 = class208.method1425(105, "Please contact customer support)3");

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Li;")
    public static class88 field4350 = field4360;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lwi;")
    public static class248 field4361 = new class248();

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "Li;")
    private static class88 field4363 = class208.method1425(105, "purple:");

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "Li;")
    private static class88 field4362 = class208.method1425(105, "Players");

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "Li;")
    public static class88 field4365 = field4363;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "Li;")
    public static class88 field4366 = field4363;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Li;")
    public static class88 field4364 = field4362;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "[I")
    private int[] field4347;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
    private int[] field4356;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        this.method1551((byte) -96);
        ++field4349;
        if (arg0 != -69) {
            this.field4347 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1550(int arg0) {
        field4361 = null;
        field4352 = null;
        field4362 = null;
        field4365 = null;
        field4366 = null;
        field4350 = null;
        field4364 = null;
        if (arg0 > 73) {
            field4360 = null;
            field4363 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    private final void method1551(byte arg0) {
        this.field4356 = new int[this.field4358 - -1];
        this.field4347 = new int[this.field4358 + 1];
        ++field4348;
        int var2 = 0;
        int var3 = 4096 / this.field4358;
        int var4 = this.field4354 * var3 >> 12;
        if (arg0 > -71) {
            this.method1551((byte) -66);
        }
        for (int var5 = 0; ~this.field4358 < ~var5; ++var5) {
            this.field4347[var5] = var2;
            this.field4356[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4347[this.field4358] = 4096;
        this.field4356[this.field4358] = this.field4356[0] + 4096;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            field4362 = null;
        }
        if (super.field379.field3100) {
            int var4 = class111.field2023[arg0];
            if (~this.field4353 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field4358; ++var6) {
                    if (var4 >= this.field4347[var6] && var4 < this.field4347[var6 + 1]) {
                        if (~this.field4356[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class124.method839(var3, 0, class70.field1276, var5);
            } else {
                for (int var7 = 0; var7 < class70.field1276; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class22.field351[var7];
                    int var11 = this.field4353;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 - 4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field4358; ++var12) {
                        if (var8 >= this.field4347[var12] && ~this.field4347[var12 - -1] < ~var8) {
                            if (~this.field4356[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        ++field4357;
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            this.method54(3, (byte) 15);
        }
        ++field4351;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4353 = arg0.method347(arg1 ^ -26118);
                }
            } else {
                this.field4354 = arg0.method301(41);
            }
        } else {
            this.field4358 = arg0.method347(arg1 + 26122);
        }
    }
}
