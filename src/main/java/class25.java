import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HASAJOKP")
public class class25 {

    @OriginalMember(owner = "HASAJOKP", name = "a", descriptor = "I")
    private int field985 = 23;

    @OriginalMember(owner = "HASAJOKP", name = "b", descriptor = "I")
    private int field986 = -49833;

    @OriginalMember(owner = "HASAJOKP", name = "c", descriptor = "LFRLKXEIS;")
    public class17 field987 = new class17();

    @OriginalMember(owner = "HASAJOKP", name = "d", descriptor = "LFRLKXEIS;")
    private class17 field988;

    @OriginalMember(owner = "HASAJOKP", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        this.field987.field844 = this.field987;
        if (arg0 <= 0) {
            this.field986 = -351;
        }
        this.field987.field845 = this.field987;
    }

    @OriginalMember(owner = "HASAJOKP", name = "a", descriptor = "(LFRLKXEIS;)V")
    public void method370(class17 arg0) {
        if (arg0.field845 != null) {
            arg0.method292();
        }
        arg0.field845 = this.field987.field845;
        arg0.field844 = this.field987;
        arg0.field845.field844 = arg0;
        arg0.field844.field845 = arg0;
    }

    @OriginalMember(owner = "HASAJOKP", name = "a", descriptor = "()LFRLKXEIS;")
    public class17 method371() {
        class17 var1 = this.field987.field844;
        if (this.field987 == var1) {
            return null;
        } else {
            var1.method292();
            return var1;
        }
    }

    @OriginalMember(owner = "HASAJOKP", name = "b", descriptor = "()LFRLKXEIS;")
    public class17 method372() {
        class17 var1 = this.field987.field844;
        if (this.field987 == var1) {
            this.field988 = null;
            return null;
        } else {
            this.field988 = var1.field844;
            return var1;
        }
    }

    @OriginalMember(owner = "HASAJOKP", name = "a", descriptor = "(I)LFRLKXEIS;")
    public class17 method373(int arg0) {
        class17 var2 = this.field988;
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field987 == var2) {
            this.field988 = null;
            return null;
        } else {
            this.field988 = var2.field844;
            return var2;
        }
    }

    @OriginalMember(owner = "HASAJOKP", name = "c", descriptor = "()I")
    public int method374() {
        int var1 = 0;
        for (class17 var2 = this.field987.field844; var2 != this.field987; var2 = var2.field844) {
            var1++;
        }
        return var1;
    }
}
