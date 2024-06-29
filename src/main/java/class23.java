import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JLOKOMHZ")
public class class23 {

    @OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "Z")
    private boolean field844 = false;

    @OriginalMember(owner = "client!JLOKOMHZ", name = "b", descriptor = "Z")
    private boolean field845 = false;

    @OriginalMember(owner = "client!JLOKOMHZ", name = "c", descriptor = "LUSMRNXZO;")
    public class57 field846 = new class57();

    @OriginalMember(owner = "client!JLOKOMHZ", name = "d", descriptor = "LUSMRNXZO;")
    private class57 field847;

    @OriginalMember(owner = "client!JLOKOMHZ", name = "<init>", descriptor = "(I)V")
    public class23(int arg0) {
        if (arg0 != -46779) {
            this.field844 = !this.field844;
        }
        this.field846.field1486 = this.field846;
        this.field846.field1487 = this.field846;
    }

    @OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "(LUSMRNXZO;)V")
    public void method233(class57 arg0) {
        if (arg0.field1487 != null) {
            arg0.method531();
        }
        arg0.field1487 = this.field846.field1487;
        arg0.field1486 = this.field846;
        arg0.field1487.field1486 = arg0;
        arg0.field1486.field1487 = arg0;
    }

    @OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "()LUSMRNXZO;")
    public class57 method234() {
        class57 var1 = this.field846.field1486;
        if (this.field846 == var1) {
            return null;
        } else {
            var1.method531();
            return var1;
        }
    }

    @OriginalMember(owner = "client!JLOKOMHZ", name = "b", descriptor = "()LUSMRNXZO;")
    public class57 method235() {
        class57 var1 = this.field846.field1486;
        if (this.field846 == var1) {
            this.field847 = null;
            return null;
        } else {
            this.field847 = var1.field1486;
            return var1;
        }
    }

    @OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "(B)LUSMRNXZO;")
    public class57 method236(byte arg0) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        class57 var2 = this.field847;
        if (this.field846 == var2) {
            this.field847 = null;
            return null;
        } else {
            this.field847 = var2.field1486;
            return var2;
        }
    }

    @OriginalMember(owner = "client!JLOKOMHZ", name = "c", descriptor = "()I")
    public int method237() {
        int var1 = 0;
        for (class57 var2 = this.field846.field1486; var2 != this.field846; var2 = var2.field1486) {
            var1++;
        }
        return var1;
    }
}
