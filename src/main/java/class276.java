import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class276 {

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    private int field3632 = 0;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    private int field3635 = -1;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "Lui;")
    private class193 field3634 = new class193();

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "Z")
    public boolean field3641 = false;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    private int field3631;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    private int field3639;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "[[I")
    private int[][] field3633;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lnd;")
    private class464[] field3628;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field3640 = 1405;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "Lui;")
    public static class193 field3637 = new class193();

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)[I")
    public final int[] method1566(byte arg0, int arg1) {
        if (arg0 != 116) {
            method1567((byte) -69);
        }
        field3636++;
        if (this.field3639 == this.field3631) {
            this.field3641 = this.field3628[arg1] == null;
            this.field3628[arg1] = client.field3203;
            return this.field3633[arg1];
        } else if (this.field3631 == 1) {
            this.field3641 = this.field3635 != arg1;
            this.field3635 = arg1;
            return this.field3633[0];
        } else {
            class464 var3 = this.field3628[arg1];
            if (var3 == null) {
                this.field3641 = true;
                if (this.field3631 <= this.field3632) {
                    class464 var4 = (class464) this.field3634.method1042(2);
                    var3 = new class464(arg1, var4.field6496);
                    this.field3628[var4.field6495] = null;
                    var4.method3187(true);
                } else {
                    var3 = new class464(arg1, this.field3632);
                    this.field3632++;
                }
                this.field3628[arg1] = var3;
            } else {
                this.field3641 = false;
            }
            this.field3634.method1053(var3, -1);
            return this.field3633[var3.field6496];
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
    public static final void method1567(byte arg0) {
        field3629++;
        if (class137.field1671 == 6) {
            class542.method3152(false, -14485);
            return;
        }
        class340.field4388 = class597.field8642;
        if (arg0 != -29) {
            field3640 = 119;
        }
        class597.field8642 = null;
        class35.method200(12, 2);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)[[I")
    public final int[][] method1568(boolean arg0) {
        field3642++;
        if (this.field3639 != this.field3631) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3631; var2++) {
            this.field3628[var2] = client.field3203;
        }
        if (arg0) {
            this.field3634 = null;
        }
        return this.field3633;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static void method1569(int arg0) {
        if (arg0 == 0) {
            field3637 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(III)V")
    public class276(int arg0, int arg1, int arg2) {
        this.field3631 = arg0;
        this.field3639 = arg1;
        this.field3633 = new int[this.field3631][arg2];
        this.field3628 = new class464[this.field3639];
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
    public final void method1570(byte arg0) {
        if (arg0 > -73) {
            this.method1570((byte) -25);
        }
        for (int var2 = 0; var2 < this.field3631; var2++) {
            this.field3633[var2] = null;
        }
        field3638++;
        this.field3628 = null;
        this.field3633 = null;
        this.field3634.method1048(-7730);
        this.field3634 = null;
    }
}
