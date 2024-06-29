import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YAKFHRTY")
public class class62 {

    @OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "I")
    private int field1557 = -582;

    @OriginalMember(owner = "client!YAKFHRTY", name = "b", descriptor = "LKIFEZIQJ;")
    public class29 field1558 = new class29();

    @OriginalMember(owner = "client!YAKFHRTY", name = "c", descriptor = "LKIFEZIQJ;")
    private class29 field1559;

    @OriginalMember(owner = "client!YAKFHRTY", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field1558.field1003 = this.field1558;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1558.field1004 = this.field1558;
    }

    @OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "(LKIFEZIQJ;)V")
    public void method562(class29 arg0) {
        if (arg0.field1004 != null) {
            arg0.method352();
        }
        arg0.field1004 = this.field1558.field1004;
        arg0.field1003 = this.field1558;
        arg0.field1004.field1003 = arg0;
        arg0.field1003.field1004 = arg0;
    }

    @OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "()LKIFEZIQJ;")
    public class29 method563() {
        class29 var1 = this.field1558.field1003;
        if (this.field1558 == var1) {
            return null;
        } else {
            var1.method352();
            return var1;
        }
    }

    @OriginalMember(owner = "client!YAKFHRTY", name = "b", descriptor = "()LKIFEZIQJ;")
    public class29 method564() {
        class29 var1 = this.field1558.field1003;
        if (this.field1558 == var1) {
            this.field1559 = null;
            return null;
        } else {
            this.field1559 = var1.field1003;
            return var1;
        }
    }

    @OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "(I)LKIFEZIQJ;")
    public class29 method565(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class29 var2 = this.field1559;
        if (this.field1558 == var2) {
            this.field1559 = null;
            return null;
        } else {
            this.field1559 = var2.field1003;
            return var2;
        }
    }

    @OriginalMember(owner = "client!YAKFHRTY", name = "c", descriptor = "()I")
    public int method566() {
        int var1 = 0;
        for (class29 var2 = this.field1558.field1003; var2 != this.field1558; var2 = var2.field1003) {
            var1++;
        }
        return var1;
    }
}
