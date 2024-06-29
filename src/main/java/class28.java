import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
    public boolean field362 = true;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field361 = 16;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Z")
    public boolean field368 = false;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field372 = -1;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public int field370 = 0;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field379 = -1;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field378 = -1;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field371 = 128;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field367 = 127;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field364 = 8;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
    public boolean field377 = true;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public int field381 = 1190717;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "F")
    public static float field366 = 0.25F;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field365 = 2;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Lks;")
    public class303 field373;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method156(byte arg0) {
        class228.field3244 = -1;
        class285.field3961 = -1;
        if (arg0 > 0) {
            method159(44);
        }
        class18.field238 = 0;
        field369++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lsi;ZI)V")
    private final void method157(class391 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field366 = 0.7190963F;
        }
        field360++;
        if (arg2 == 1) {
            this.field370 = class402.method2425(34, arg0.method2338(true));
        } else if (arg2 == 2) {
            this.field378 = arg0.method2348(-2);
        } else if (arg2 == 3) {
            this.field378 = arg0.method2353((byte) 83);
            if (this.field378 == 65535) {
                this.field378 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field362 = false;
            return;
        } else if (arg2 == 7) {
            this.field372 = class402.method2425(34, arg0.method2338(true));
            return;
        } else if (arg2 == 8) {
            this.field373.field4154 = this.field375;
            return;
        } else if (arg2 == 9) {
            this.field371 = arg0.method2353((byte) 96) << 0;
            return;
        } else {
            if (arg2 == 10) {
                this.field377 = false;
            } else if (arg2 == 11) {
                this.field364 = arg0.method2348(-2);
                return;
            } else if (arg2 == 12) {
                this.field368 = true;
                return;
            } else if (arg2 == 13) {
                this.field381 = arg0.method2338(true);
                return;
            } else if (arg2 == 14) {
                this.field361 = arg0.method2348(-2);
                return;
            } else if (arg2 == 15) {
                this.field379 = arg0.method2353((byte) 102);
                if (this.field379 == 65535) {
                    this.field379 = -1;
                    return;
                }
            } else if (arg2 == 16) {
                this.field367 = arg0.method2348(-2);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lsi;B)V")
    public final void method158(class391 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                field374++;
                int var4 = 27 / ((arg1 - 67) / 51);
                return;
            }
            this.method157(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lhq;")
    public static final class109 method159(int arg0) {
        field376++;
        if (arg0 != 16) {
            return null;
        } else if (class350.field5114 == null || class290.field4019 == null) {
            return null;
        } else {
            class290.field4019.method896(320, class350.field5114);
            class109 var1 = (class109) class290.field4019.method897(-66);
            if (var1 == null) {
                return null;
            } else {
                class146 var2 = class350.field5106.method141(var1.field1639, false);
                return var2 != null && var2.field2083 && var2.method985((byte) -122, class350.field5104) ? var1 : class480.method2823(-101);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public final void method160(int arg0) {
        int var2 = -55 % ((arg0 + 24) / 37);
        field380++;
        this.field364 = this.field364 << 8 | this.field375;
        if (this.field379 == -1) {
            this.field379 = this.field378;
        }
    }
}
