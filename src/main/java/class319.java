import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class319 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    private int field4430 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field4439 = 0;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Ldw;")
    private class664 field4437;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lcd;")
    private class23 field4436;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[Lbp;")
    private class159[] field4434;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lsl;")
    public class482 field4433;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4440 = 100;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lkr;")
    public static class602 field4429 = new class602(32, -1);

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lgw;")
    public static class690 field4442 = new class690(8);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[[[Lve;")
    public static class262[][][] field4435;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIZI)V")
    public final void method2060(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        boolean var7 = arg2 & this.field4437.method1419();
        field4428++;
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg0 = arg3;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (arg5 != -10) {
            method2062(null, -94, -120);
        }
        if (this.field4427 != arg1) {
            if (this.field4427 != 0) {
                this.field4434[Integer.MAX_VALUE & this.field4427].method369((byte) -117);
            }
            if (arg1 != 0) {
                this.field4434[arg1 & Integer.MAX_VALUE].method373(arg4, (byte) -117);
                this.field4434[Integer.MAX_VALUE & arg1].method370((byte) 96, arg4);
                this.field4434[arg1 & Integer.MAX_VALUE].method367(true, arg3, arg0);
            }
            this.field4439 = arg0;
            this.field4427 = arg1;
            this.field4430 = arg3;
        } else if (this.field4427 != 0) {
            this.field4434[Integer.MAX_VALUE & this.field4427].method370((byte) 117, arg4);
            if (this.field4430 != arg3 || this.field4439 != arg0) {
                this.field4434[Integer.MAX_VALUE & this.field4427].method367(true, arg3, arg0);
                this.field4430 = arg3;
                this.field4439 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
    public final boolean method2061(int arg0, int arg1) {
        if (arg1 != 4883) {
            this.field4427 = -33;
        }
        field4432++;
        return this.field4434[arg0].method372(true);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2062(String arg0, int arg1, int arg2) {
        field4431++;
        if (arg1 != 26188) {
            method2062(null, 45, -49);
        }
        class346 var3 = class299.method1976(0, 2, arg2);
        var3.method2209(255);
        var3.field4923 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method2063(int arg0) {
        field4442 = null;
        field4435 = null;
        field4429 = null;
        if (arg0 != 10) {
            field4440 = 71;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ldw;)V")
    public class319(class664 arg0) {
        this.field4437 = arg0;
        this.field4436 = new class23(arg0);
        this.field4434 = new class159[10];
        this.field4434[1] = new class743(arg0);
        this.field4434[2] = new class326(arg0, this.field4436);
        this.field4434[4] = new class70(arg0, this.field4436);
        this.field4434[5] = new class137(arg0, this.field4436);
        this.field4434[6] = new class542(arg0);
        this.field4434[7] = new class191(arg0);
        this.field4434[3] = this.field4433 = new class482(arg0);
        this.field4434[8] = new class51(arg0, this.field4436);
        this.field4434[9] = new class392(arg0, this.field4436);
        if (!this.field4434[8].method372(true)) {
            this.field4434[8] = this.field4434[4];
        }
        if (!this.field4434[9].method372(true)) {
            this.field4434[9] = this.field4434[8];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILwu;)Z")
    public final boolean method2064(int arg0, int arg1, class559 arg2) {
        field4438++;
        if (this.field4427 == 0) {
            return false;
        }
        this.field4434[Integer.MAX_VALUE & this.field4427].method368(arg2, 26264, arg0);
        if (arg1 != 100) {
            this.method2060(84, 3, false, 12, true, -104);
        }
        return true;
    }
}
