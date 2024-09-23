import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RUNMBJUO")
public class class51 {

    @OriginalMember(owner = "RUNMBJUO", name = "a", descriptor = "I")
    private int field1350 = 3;

    @OriginalMember(owner = "RUNMBJUO", name = "d", descriptor = "LORGNKIAP;")
    private class40 field1353 = new class40();

    @OriginalMember(owner = "RUNMBJUO", name = "h", descriptor = "LJCEXAOBP;")
    private class24 field1357 = new class24(true);

    @OriginalMember(owner = "RUNMBJUO", name = "e", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "RUNMBJUO", name = "f", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "RUNMBJUO", name = "g", descriptor = "LRZUUVVSJ;")
    private class53 field1356;

    @OriginalMember(owner = "RUNMBJUO", name = "b", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "RUNMBJUO", name = "c", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "RUNMBJUO", name = "<init>", descriptor = "(IZ)V")
    public class51(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1354 = arg0;
        this.field1355 = arg0;
        this.field1356 = new class53(1024, (byte) 8);
    }

    @OriginalMember(owner = "RUNMBJUO", name = "a", descriptor = "(J)LORGNKIAP;")
    public class40 method450(long arg0) {
        class40 var3 = (class40) this.field1356.method453(arg0);
        if (var3 == null) {
            this.field1351++;
        } else {
            this.field1357.method249(var3);
            this.field1352++;
        }
        return var3;
    }

    @OriginalMember(owner = "RUNMBJUO", name = "a", descriptor = "(JLORGNKIAP;Z)V")
    public void method451(long arg0, class40 arg1, boolean arg2) {
        if (this.field1355 == 0) {
            class40 var5 = this.field1357.method250();
            var5.method397();
            var5.method400();
            if (this.field1353 == var5) {
                class40 var6 = this.field1357.method250();
                var6.method397();
                var6.method400();
            }
        } else {
            this.field1355--;
        }
        this.field1356.method454(arg1, arg0, false);
        this.field1357.method249(arg1);
        if (arg2) {
            this.field1350 = 352;
        }
    }

    @OriginalMember(owner = "RUNMBJUO", name = "a", descriptor = "()V")
    public void method452() {
        while (true) {
            class40 var1 = this.field1357.method250();
            if (var1 == null) {
                this.field1355 = this.field1354;
                return;
            }
            var1.method397();
            var1.method400();
        }
    }
}
