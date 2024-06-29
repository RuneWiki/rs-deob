import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 {

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field1467 = -1;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    private int field1466 = 0;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Ljia;")
    private class645 field1469 = new class645();

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
    public boolean field1471 = false;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[[I")
    private int[][] field1463;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[Lsba;")
    private class230[] field1460;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lvl;")
    public static class15 field1458 = new class15(7, 3);

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Lha;")
    public static class66 field1472;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field1473;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public final void method803(int arg0) {
        field1459++;
        if (arg0 < 56) {
            return;
        }
        for (int var2 = 0; var2 < this.field1457; var2++) {
            this.field1463[var2] = null;
        }
        this.field1460 = null;
        this.field1463 = null;
        this.field1469.method3590((byte) -123);
        this.field1469 = null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public static void method804(int arg0) {
        if (arg0 == 3) {
            field1472 = null;
            field1458 = null;
            field1473 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIBI)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1465++;
        if (arg0 == arg1) {
            class582.method3342(-3, arg3, arg1, arg5, arg2);
            return;
        }
        if (arg4 < 116) {
            method807((byte) 3, 66);
        }
        if (class268.field3766 <= arg5 - arg1 && class236.field3392 >= arg5 + arg1 && class223.field3260 <= (arg2 - arg0) && arg0 + arg2 <= class706.field9700) {
            class471.method2711(arg3, arg0, 51, arg5, arg1, arg2);
        } else {
            class613.method3470(arg0, arg3, arg2, (byte) 122, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lha;BI)Lkc;")
    public static final class145 method806(class66 arg0, byte arg1, int arg2) {
        field1470++;
        class401 var3 = class386.method2350(true, arg0, 110, arg2);
        int var4 = 18 % ((-arg1 - 72) / 44);
        return var3 == null ? null : var3.field5522;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
    public static final void method807(byte arg0, int arg1) {
        field1464++;
        int var2 = -124 / ((arg0 + 9) / 58);
        if (class328.field4463 == 1) {
            class315.field4312 = arg1;
        } else if (class328.field4463 == 2) {
            class533.field7216 = arg1;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
    public final int[] method808(int arg0, int arg1) {
        field1461++;
        if (arg0 >= -122) {
            this.field1460 = null;
        }
        if (this.field1462 == this.field1457) {
            this.field1471 = this.field1460[arg1] == null;
            this.field1460[arg1] = class494.field6772;
            return this.field1463[arg1];
        } else if (this.field1457 == 1) {
            this.field1471 = this.field1467 != arg1;
            this.field1467 = arg1;
            return this.field1463[0];
        } else {
            class230 var3 = this.field1460[arg1];
            if (var3 == null) {
                this.field1471 = true;
                if (this.field1466 < this.field1457) {
                    var3 = new class230(arg1, this.field1466);
                    this.field1466++;
                } else {
                    class230 var4 = (class230) this.field1469.method3588((byte) -49);
                    var3 = new class230(arg1, var4.field3352);
                    this.field1460[var4.field3355] = null;
                    var4.method1207(105);
                }
                this.field1460[arg1] = var3;
            } else {
                this.field1471 = false;
            }
            this.field1469.method3587(0, var3);
            return this.field1463[var3.field3352];
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)[[I")
    public final int[][] method809(int arg0) {
        field1468++;
        if (this.field1462 != this.field1457) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -16352) {
            method805(87, -26, 81, -48, (byte) 23, 10);
        }
        for (int var2 = 0; var2 < this.field1457; var2++) {
            this.field1460[var2] = class494.field6772;
        }
        return this.field1463;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V")
    public class95(int arg0, int arg1, int arg2) {
        this.field1462 = arg1;
        this.field1457 = arg0;
        this.field1463 = new int[this.field1457][arg2];
        this.field1460 = new class230[this.field1462];
    }
}
