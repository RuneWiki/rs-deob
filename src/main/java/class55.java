import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VGFLNLXH")
public class class55 {

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "Z")
    private boolean field1558 = false;

    @OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "I")
    private int field1559 = -420;

    @OriginalMember(owner = "client!VGFLNLXH", name = "c", descriptor = "I")
    private int field1560 = -942;

    @OriginalMember(owner = "client!VGFLNLXH", name = "d", descriptor = "Z")
    private boolean field1561 = false;

    @OriginalMember(owner = "client!VGFLNLXH", name = "e", descriptor = "LCZLFLPZK;")
    public class8 field1562 = new class8();

    @OriginalMember(owner = "client!VGFLNLXH", name = "f", descriptor = "LCZLFLPZK;")
    private class8 field1563;

    @OriginalMember(owner = "client!VGFLNLXH", name = "<init>", descriptor = "(I)V")
    public class55(int arg0) {
        this.field1562.field620 = this.field1562;
        this.field1562.field621 = this.field1562;
        if (arg0 <= 0) {
            this.field1561 = !this.field1561;
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(LCZLFLPZK;)V")
    public void method529(class8 arg0) {
        if (arg0.field621 != null) {
            arg0.method163();
        }
        arg0.field621 = this.field1562.field621;
        arg0.field620 = this.field1562;
        arg0.field621.field620 = arg0;
        arg0.field620.field621 = arg0;
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(LCZLFLPZK;Z)V")
    public void method530(class8 arg0, boolean arg1) {
        if (arg0.field621 != null) {
            arg0.method163();
        }
        arg0.field621 = this.field1562;
        arg0.field620 = this.field1562.field620;
        arg0.field621.field620 = arg0;
        arg0.field620.field621 = arg0;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        } else if (class8.field622) {
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "()LCZLFLPZK;")
    public class8 method531() {
        class8 var1 = this.field1562.field620;
        if (this.field1562 == var1) {
            return null;
        } else {
            var1.method163();
            return var1;
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "()LCZLFLPZK;")
    public class8 method532() {
        class8 var1 = this.field1562.field620;
        if (this.field1562 == var1) {
            this.field1563 = null;
            return null;
        } else {
            this.field1563 = var1.field620;
            return var1;
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(B)LCZLFLPZK;")
    public class8 method533(byte arg0) {
        class8 var2 = this.field1562.field621;
        if (arg0 != 108) {
            this.field1558 = !this.field1558;
        }
        if (this.field1562 == var2) {
            this.field1563 = null;
            return null;
        } else {
            this.field1563 = var2.field621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(I)LCZLFLPZK;")
    public class8 method534(int arg0) {
        class8 var2 = this.field1563;
        if (this.field1562 == var2) {
            this.field1563 = null;
            return null;
        }
        this.field1563 = var2.field620;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "(B)LCZLFLPZK;")
    public class8 method535(byte arg0) {
        class8 var2 = this.field1563;
        if (arg0 != 100) {
            this.field1561 = !this.field1561;
        }
        if (this.field1562 == var2) {
            this.field1563 = null;
            return null;
        } else {
            this.field1563 = var2.field621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!VGFLNLXH", name = "c", descriptor = "()V")
    public void method536() {
        if (this.field1562.field620 == this.field1562) {
            return;
        }
        while (true) {
            class8 var1 = this.field1562.field620;
            if (this.field1562 == var1) {
                return;
            }
            var1.method163();
        }
    }
}
