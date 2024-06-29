import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class243 extends class73 {

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "[Z")
    public boolean[] field4344;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
    public int[] field4340;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[[I")
    public int[][] field4347;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lli;")
    public static class185 field4338 = class245.method1649("mapflag", 122);

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lli;")
    private static class185 field4342 = class245.method1649("Loaded input handler", 123);

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Ltd;")
    public static class203[] field4339 = new class203[50];

    @OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
    public static int[] field4350 = new int[5];

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lli;")
    private static class185 field4348 = class245.method1649("Loaded config", -56);

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lli;")
    public static class185 field4351 = field4342;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lli;")
    public static class185 field4341 = field4348;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1641(int arg0, int arg1) {
        if (arg1 != -6451) {
            method1642(-121);
        }
        class248.field4408 = -1;
        class133.field2381 = false;
        class32.field527 = 1;
        class78.field1360 = arg0;
        class23.field381 = 0;
        class248.field4400 = -1;
        field4337++;
        class241.field4303 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1642(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4342 = null;
        field4350 = null;
        field4348 = null;
        field4338 = null;
        field4351 = null;
        field4339 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lph;")
    public static final class64 method1643(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class64 var4 = var3.field3639;
            var3.field3639 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I[B)V")
    public class243(int arg0, byte[] arg1) {
        this.field4345 = arg0;
        class118 var3 = new class118(arg1);
        this.field4346 = var3.method867(false);
        this.field4344 = new boolean[this.field4346];
        this.field4340 = new int[this.field4346];
        this.field4347 = new int[this.field4346][];
        for (int var4 = 0; var4 < this.field4346; var4++) {
            this.field4340[var4] = var3.method867(false);
        }
        for (int var5 = 0; var5 < this.field4346; var5++) {
            this.field4344[var5] = var3.method867(false) == 1;
        }
        for (int var6 = 0; var6 < this.field4346; var6++) {
            this.field4347[var6] = new int[var3.method867(false)];
        }
        for (int var7 = 0; var7 < this.field4346; var7++) {
            for (int var8 = 0; var8 < this.field4347[var7].length; var8++) {
                this.field4347[var7][var8] = var3.method867(false);
            }
        }
    }
}
