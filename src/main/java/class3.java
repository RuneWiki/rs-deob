import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BGEXEDZG")
public class class3 {

    @OriginalMember(owner = "BGEXEDZG", name = "a", descriptor = "Z")
    private boolean field7 = true;

    @OriginalMember(owner = "BGEXEDZG", name = "b", descriptor = "I")
    private int field8 = -514;

    @OriginalMember(owner = "BGEXEDZG", name = "c", descriptor = "B")
    private byte field9 = 0;

    @OriginalMember(owner = "BGEXEDZG", name = "d", descriptor = "LUXRJCYSS;")
    public class60 field10 = new class60();

    @OriginalMember(owner = "BGEXEDZG", name = "e", descriptor = "LUXRJCYSS;")
    private class60 field11;

    @OriginalMember(owner = "BGEXEDZG", name = "<init>", descriptor = "(B)V")
    public class3(byte arg0) {
        this.field10.field1522 = this.field10;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field10.field1523 = this.field10;
    }

    @OriginalMember(owner = "BGEXEDZG", name = "a", descriptor = "(LUXRJCYSS;)V")
    public void method4(class60 arg0) {
        if (arg0.field1523 != null) {
            arg0.method564();
        }
        arg0.field1523 = this.field10.field1523;
        arg0.field1522 = this.field10;
        arg0.field1523.field1522 = arg0;
        arg0.field1522.field1523 = arg0;
    }

    @OriginalMember(owner = "BGEXEDZG", name = "a", descriptor = "()LUXRJCYSS;")
    public class60 method5() {
        class60 var1 = this.field10.field1522;
        if (this.field10 == var1) {
            return null;
        } else {
            var1.method564();
            return var1;
        }
    }

    @OriginalMember(owner = "BGEXEDZG", name = "b", descriptor = "()LUXRJCYSS;")
    public class60 method6() {
        class60 var1 = this.field10.field1522;
        if (this.field10 == var1) {
            this.field11 = null;
            return null;
        } else {
            this.field11 = var1.field1522;
            return var1;
        }
    }

    @OriginalMember(owner = "BGEXEDZG", name = "a", descriptor = "(I)LUXRJCYSS;")
    public class60 method7(int arg0) {
        class60 var2 = this.field11;
        if (arg0 <= 0) {
            this.field8 = -127;
        }
        if (this.field10 == var2) {
            this.field11 = null;
            return null;
        } else {
            this.field11 = var2.field1522;
            return var2;
        }
    }

    @OriginalMember(owner = "BGEXEDZG", name = "c", descriptor = "()I")
    public int method8() {
        int var1 = 0;
        for (class60 var2 = this.field10.field1522; var2 != this.field10; var2 = var2.field1522) {
            var1++;
        }
        return var1;
    }
}
