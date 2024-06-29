import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KZFVEUEL")
public class class29 {

    @OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "Z")
    private boolean field969 = true;

    @OriginalMember(owner = "client!KZFVEUEL", name = "b", descriptor = "I")
    private int field970 = 9;

    @OriginalMember(owner = "client!KZFVEUEL", name = "c", descriptor = "LMUOTSYDS;")
    public class37 field971 = new class37();

    @OriginalMember(owner = "client!KZFVEUEL", name = "d", descriptor = "LMUOTSYDS;")
    private class37 field972;

    @OriginalMember(owner = "client!KZFVEUEL", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field971.field1139 = this.field971;
        this.field971.field1140 = this.field971;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "(LMUOTSYDS;)V")
    public void method310(class37 arg0) {
        if (arg0.field1140 != null) {
            arg0.method344();
        }
        arg0.field1140 = this.field971.field1140;
        arg0.field1139 = this.field971;
        arg0.field1140.field1139 = arg0;
        arg0.field1139.field1140 = arg0;
    }

    @OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "()LMUOTSYDS;")
    public class37 method311() {
        class37 var1 = this.field971.field1139;
        if (this.field971 == var1) {
            return null;
        } else {
            var1.method344();
            return var1;
        }
    }

    @OriginalMember(owner = "client!KZFVEUEL", name = "b", descriptor = "()LMUOTSYDS;")
    public class37 method312() {
        class37 var1 = this.field971.field1139;
        if (this.field971 == var1) {
            this.field972 = null;
            return null;
        } else {
            this.field972 = var1.field1139;
            return var1;
        }
    }

    @OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "(Z)LMUOTSYDS;")
    public class37 method313(boolean arg0) {
        class37 var2 = this.field972;
        if (!arg0) {
            this.field969 = !this.field969;
        }
        if (this.field971 == var2) {
            this.field972 = null;
            return null;
        } else {
            this.field972 = var2.field1139;
            return var2;
        }
    }

    @OriginalMember(owner = "client!KZFVEUEL", name = "c", descriptor = "()I")
    public int method314() {
        int var1 = 0;
        for (class37 var2 = this.field971.field1139; var2 != this.field971; var2 = var2.field1139) {
            var1++;
        }
        return var1;
    }
}
