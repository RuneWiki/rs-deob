import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PILILDKN")
public class class38 {

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "I")
    private int field1045 = 3;

    @OriginalMember(owner = "PILILDKN", name = "b", descriptor = "I")
    private int field1046 = 78;

    @OriginalMember(owner = "PILILDKN", name = "c", descriptor = "LWYQNTERC;")
    public class64 field1047 = new class64();

    @OriginalMember(owner = "PILILDKN", name = "d", descriptor = "LWYQNTERC;")
    private class64 field1048;

    @OriginalMember(owner = "PILILDKN", name = "<init>", descriptor = "(Z)V")
    public class38(boolean arg0) {
        this.field1047.field1588 = this.field1047;
        this.field1047.field1589 = this.field1047;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "(LWYQNTERC;)V")
    public void method379(class64 arg0) {
        if (arg0.field1589 != null) {
            arg0.method540();
        }
        arg0.field1589 = this.field1047.field1589;
        arg0.field1588 = this.field1047;
        arg0.field1589.field1588 = arg0;
        arg0.field1588.field1589 = arg0;
    }

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "(LWYQNTERC;Z)V")
    public void method380(class64 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (arg0.field1589 != null) {
            arg0.method540();
        }
        arg0.field1589 = this.field1047;
        arg0.field1588 = this.field1047.field1588;
        arg0.field1589.field1588 = arg0;
        arg0.field1588.field1589 = arg0;
    }

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "()LWYQNTERC;")
    public class64 method381() {
        class64 var1 = this.field1047.field1588;
        if (this.field1047 == var1) {
            return null;
        } else {
            var1.method540();
            return var1;
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "b", descriptor = "()LWYQNTERC;")
    public class64 method382() {
        class64 var1 = this.field1047.field1588;
        if (this.field1047 == var1) {
            this.field1048 = null;
            return null;
        } else {
            this.field1048 = var1.field1588;
            return var1;
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "(I)LWYQNTERC;")
    public class64 method383(int arg0) {
        class64 var2 = this.field1047.field1589;
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1047 == var2) {
            this.field1048 = null;
            return null;
        } else {
            this.field1048 = var2.field1589;
            return var2;
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "a", descriptor = "(B)LWYQNTERC;")
    public class64 method384(byte arg0) {
        if (arg0 != -96) {
            this.field1046 = -161;
        }
        class64 var2 = this.field1048;
        if (this.field1047 == var2) {
            this.field1048 = null;
            return null;
        } else {
            this.field1048 = var2.field1588;
            return var2;
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "b", descriptor = "(I)LWYQNTERC;")
    public class64 method385(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class64 var2 = this.field1048;
        if (this.field1047 == var2) {
            this.field1048 = null;
            return null;
        } else {
            this.field1048 = var2.field1589;
            return var2;
        }
    }

    @OriginalMember(owner = "PILILDKN", name = "c", descriptor = "()V")
    public void method386() {
        if (this.field1047.field1588 == this.field1047) {
            return;
        }
        while (true) {
            class64 var1 = this.field1047.field1588;
            if (this.field1047 == var1) {
                return;
            }
            var1.method540();
        }
    }
}
