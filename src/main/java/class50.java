import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RGZIHLRP")
public class class50 {

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "I")
    private int field1439 = -293;

    @OriginalMember(owner = "RGZIHLRP", name = "b", descriptor = "I")
    private int field1440 = 3;

    @OriginalMember(owner = "RGZIHLRP", name = "c", descriptor = "I")
    private int field1441 = -459;

    @OriginalMember(owner = "RGZIHLRP", name = "d", descriptor = "Z")
    private boolean field1442 = false;

    @OriginalMember(owner = "RGZIHLRP", name = "e", descriptor = "LMXUYAYVV;")
    public class38 field1443 = new class38();

    @OriginalMember(owner = "RGZIHLRP", name = "f", descriptor = "LMXUYAYVV;")
    private class38 field1444;

    @OriginalMember(owner = "RGZIHLRP", name = "<init>", descriptor = "(I)V")
    public class50(int arg0) {
        this.field1443.field1226 = this.field1443;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        this.field1443.field1227 = this.field1443;
    }

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "(LMXUYAYVV;)V")
    public void method468(class38 arg0) {
        if (arg0.field1227 != null) {
            arg0.method430();
        }
        arg0.field1227 = this.field1443.field1227;
        arg0.field1226 = this.field1443;
        arg0.field1227.field1226 = arg0;
        arg0.field1226.field1227 = arg0;
    }

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "(ILMXUYAYVV;)V")
    public void method469(int arg0, class38 arg1) {
        if (arg1.field1227 != null) {
            arg1.method430();
        }
        arg1.field1227 = this.field1443;
        if (arg0 >= 0) {
            this.field1440 = 236;
        }
        arg1.field1226 = this.field1443.field1226;
        arg1.field1227.field1226 = arg1;
        arg1.field1226.field1227 = arg1;
    }

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "()LMXUYAYVV;")
    public class38 method470() {
        class38 var1 = this.field1443.field1226;
        if (this.field1443 == var1) {
            return null;
        } else {
            var1.method430();
            return var1;
        }
    }

    @OriginalMember(owner = "RGZIHLRP", name = "b", descriptor = "()LMXUYAYVV;")
    public class38 method471() {
        class38 var1 = this.field1443.field1226;
        if (this.field1443 == var1) {
            this.field1444 = null;
            return null;
        } else {
            this.field1444 = var1.field1226;
            return var1;
        }
    }

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "(I)LMXUYAYVV;")
    public class38 method472(int arg0) {
        class38 var2 = this.field1443.field1227;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1443 == var2) {
            this.field1444 = null;
            return null;
        } else {
            this.field1444 = var2.field1227;
            return var2;
        }
    }

    @OriginalMember(owner = "RGZIHLRP", name = "a", descriptor = "(B)LMXUYAYVV;")
    public class38 method473(byte arg0) {
        class38 var2 = this.field1444;
        if (this.field1443 == var2) {
            this.field1444 = null;
            return null;
        }
        this.field1444 = var2.field1226;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "RGZIHLRP", name = "b", descriptor = "(B)LMXUYAYVV;")
    public class38 method474(byte arg0) {
        class38 var2 = this.field1444;
        if (arg0 != 7) {
            this.field1439 = -193;
        }
        if (this.field1443 == var2) {
            this.field1444 = null;
            return null;
        } else {
            this.field1444 = var2.field1227;
            return var2;
        }
    }

    @OriginalMember(owner = "RGZIHLRP", name = "c", descriptor = "()V")
    public void method475() {
        if (this.field1443.field1226 == this.field1443) {
            return;
        }
        while (true) {
            class38 var1 = this.field1443.field1226;
            if (this.field1443 == var1) {
                return;
            }
            var1.method430();
        }
    }
}
