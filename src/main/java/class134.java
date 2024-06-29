import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class134 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lca;")
    private class263 field2440;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Lej;")
    private class50 field2447;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lfd;")
    private class122 field2444;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lid;")
    public static class149 field2445 = class60.method382("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", (byte) 66);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lgd;")
    private class74 field2446;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lmc;")
    private class196[] field2442;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZILcg;Lcg;)Lmc;")
    public final class196 method936(boolean arg0, int arg1, class166 arg2, class166 arg3) {
        field2437++;
        if (arg0) {
            this.method941(-107);
        }
        return this.method943(arg2, arg3, 8, arg1, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2435++;
        class208.field3720.field1340 = 0;
        class208.field3720.method494((byte) 4, 147);
        class208.field3720.method494((byte) 4, arg3);
        class208.field3720.method494((byte) 4, arg0);
        class208.field3720.method518(16711680, arg2);
        class208.field3720.method518(arg4 ^ 0xFF0009, arg1);
        class210.field3742 = 0;
        class207.field3716 = -3;
        class197.field3570 = 1;
        class70.field1228 = 0;
        if (arg4 != 9) {
            field2445 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method938(int arg0, int arg1) {
        field2434++;
        class141.method988(1);
        if (arg1 >= -27) {
            field2441 = -24;
        }
        class193.method1311(17819);
        int var2 = class217.method1462(arg0, 16).field1605;
        if (var2 == 0) {
            return;
        }
        int var3 = class115.field1953[arg0];
        if (var2 == 6) {
            class165.field3075 = var3;
        }
        if (var2 == 5) {
            class236.field4146 = var3;
        }
        if (var2 == 9) {
            class18.field257 = var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public final void method939(boolean arg0) {
        field2438++;
        if (this.field2442 == null) {
            return;
        }
        if (!arg0) {
            this.method943((class166) null, (class166) null, 47, 80, false);
        }
        for (int var2 = 0; var2 < this.field2442.length; var2++) {
            if (this.field2442[var2] != null) {
                this.field2442[var2].method1343((byte) 71);
            }
        }
        for (int var3 = 0; var3 < this.field2442.length; var3++) {
            if (this.field2442[var3] != null) {
                this.field2442[var3].method1338(29373);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method940(int arg0) {
        class174.field3201 = null;
        field2439++;
        class242.field4257 = null;
        if (arg0 != 255) {
            method944(-11);
        }
        class6.field72 = null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Z")
    public final boolean method941(int arg0) {
        field2433++;
        if (this.field2446 != null) {
            return true;
        }
        if (this.field2444 == null) {
            if (this.field2447.method326((byte) 51)) {
                return false;
            }
            this.field2444 = this.field2447.method330((byte) 0, 255, 255, (byte) -84, true);
        }
        if (this.field2444.field987) {
            return false;
        } else {
            this.field2446 = new class74(this.field2444.method352(arg0 ^ arg0));
            this.field2442 = new class196[(this.field2446.field1321.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method942(int arg0) {
        if (arg0 != 5430) {
            field2441 = 12;
        }
        field2445 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lcg;Lcg;IIZ)Lmc;")
    private final class196 method943(class166 arg0, class166 arg1, int arg2, int arg3, boolean arg4) {
        field2436++;
        if (this.field2446 == null) {
            throw new RuntimeException();
        }
        this.field2446.field1340 = arg2 * arg3 + 5;
        if (this.field2446.field1321.length <= this.field2446.field1340) {
            throw new RuntimeException();
        } else if (this.field2442[arg3] == null) {
            int var6 = this.field2446.method498((byte) 127);
            int var7 = this.field2446.method498((byte) 126);
            class196 var8 = new class196(arg3, arg1, arg0, this.field2447, this.field2440, var6, var7, arg4);
            this.field2442[arg3] = var8;
            return var8;
        } else {
            return this.field2442[arg3];
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static final void method944(int arg0) {
        field2443++;
        if (class91.field1614 == 5) {
            class91.field1614 = 6;
            int var1 = 103 % ((arg0 + 44) / 56);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lej;Lca;)V")
    public class134(class50 arg0, class263 arg1) {
        this.field2440 = arg1;
        this.field2447 = arg0;
        if (!this.field2447.method326((byte) 102)) {
            this.field2444 = this.field2447.method330((byte) 0, 255, 255, (byte) -27, true);
        }
    }
}
