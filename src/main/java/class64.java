import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XBBVJJRK")
public class class64 {

    @OriginalMember(owner = "XBBVJJRK", name = "a", descriptor = "I")
    private int field1627 = -459;

    @OriginalMember(owner = "XBBVJJRK", name = "b", descriptor = "LHSUOZGYX;")
    public class20 field1628 = new class20();

    @OriginalMember(owner = "XBBVJJRK", name = "c", descriptor = "LHSUOZGYX;")
    private class20 field1629;

    @OriginalMember(owner = "XBBVJJRK", name = "<init>", descriptor = "(B)V")
    public class64(byte arg0) {
        if (arg0 != -100) {
            throw new NullPointerException();
        }
        this.field1628.field850 = this.field1628;
        this.field1628.field851 = this.field1628;
    }

    @OriginalMember(owner = "XBBVJJRK", name = "a", descriptor = "(LHSUOZGYX;)V")
    public void method533(class20 arg0) {
        if (arg0.field851 != null) {
            arg0.method298();
        }
        arg0.field851 = this.field1628.field851;
        arg0.field850 = this.field1628;
        arg0.field851.field850 = arg0;
        arg0.field850.field851 = arg0;
    }

    @OriginalMember(owner = "XBBVJJRK", name = "a", descriptor = "()LHSUOZGYX;")
    public class20 method534() {
        class20 var1 = this.field1628.field850;
        if (this.field1628 == var1) {
            return null;
        } else {
            var1.method298();
            return var1;
        }
    }

    @OriginalMember(owner = "XBBVJJRK", name = "b", descriptor = "()LHSUOZGYX;")
    public class20 method535() {
        class20 var1 = this.field1628.field850;
        if (this.field1628 == var1) {
            this.field1629 = null;
            return null;
        } else {
            this.field1629 = var1.field850;
            return var1;
        }
    }

    @OriginalMember(owner = "XBBVJJRK", name = "a", descriptor = "(B)LHSUOZGYX;")
    public class20 method536(byte arg0) {
        class20 var2 = this.field1629;
        if (this.field1628 == var2) {
            this.field1629 = null;
            return null;
        }
        this.field1629 = var2.field850;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "XBBVJJRK", name = "c", descriptor = "()I")
    public int method537() {
        int var1 = 0;
        for (class20 var2 = this.field1628.field850; var2 != this.field1628; var2 = var2.field850) {
            var1++;
        }
        return var1;
    }
}
