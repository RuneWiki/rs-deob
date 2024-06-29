import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CEEJCAVA")
public class class5 {

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "Z")
    private boolean field75 = false;

    @OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "I")
    private int field76 = 45492;

    @OriginalMember(owner = "client!CEEJCAVA", name = "c", descriptor = "Z")
    private boolean field77 = false;

    @OriginalMember(owner = "client!CEEJCAVA", name = "d", descriptor = "B")
    private byte field78 = 8;

    @OriginalMember(owner = "client!CEEJCAVA", name = "e", descriptor = "I")
    private int field79 = 17532;

    @OriginalMember(owner = "client!CEEJCAVA", name = "f", descriptor = "LSSWDZUWQ;")
    public class57 field80 = new class57();

    @OriginalMember(owner = "client!CEEJCAVA", name = "g", descriptor = "LSSWDZUWQ;")
    private class57 field81;

    @OriginalMember(owner = "client!CEEJCAVA", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        if (arg0 != -7255) {
            throw new NullPointerException();
        }
        this.field80.field1575 = this.field80;
        this.field80.field1576 = this.field80;
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(LSSWDZUWQ;)V")
    public void method30(class57 arg0) {
        if (arg0.field1576 != null) {
            arg0.method505();
        }
        arg0.field1576 = this.field80.field1576;
        arg0.field1575 = this.field80;
        arg0.field1576.field1575 = arg0;
        arg0.field1575.field1576 = arg0;
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(LSSWDZUWQ;B)V")
    public void method31(class57 arg0, byte arg1) {
        if (arg0.field1576 != null) {
            arg0.method505();
        }
        arg0.field1576 = this.field80;
        arg0.field1575 = this.field80.field1575;
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            this.field76 = -90;
        }
        arg0.field1576.field1575 = arg0;
        arg0.field1575.field1576 = arg0;
        if (class57.field1577) {
        }
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "()LSSWDZUWQ;")
    public class57 method32() {
        class57 var1 = this.field80.field1575;
        if (this.field80 == var1) {
            return null;
        } else {
            var1.method505();
            return var1;
        }
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "()LSSWDZUWQ;")
    public class57 method33() {
        class57 var1 = this.field80.field1575;
        if (this.field80 == var1) {
            this.field81 = null;
            return null;
        } else {
            this.field81 = var1.field1575;
            return var1;
        }
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(I)LSSWDZUWQ;")
    public class57 method34(int arg0) {
        if (arg0 != 36418) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class57 var3 = this.field80.field1576;
        if (this.field80 == var3) {
            this.field81 = null;
            return null;
        } else {
            this.field81 = var3.field1576;
            return var3;
        }
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(B)LSSWDZUWQ;")
    public class57 method35(byte arg0) {
        class57 var2 = this.field81;
        if (this.field80 == var2) {
            this.field81 = null;
            return null;
        }
        this.field81 = var2.field1575;
        if (this.field78 != arg0) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "(I)LSSWDZUWQ;")
    public class57 method36(int arg0) {
        if (arg0 != 0) {
            this.field79 = 293;
        }
        class57 var2 = this.field81;
        if (this.field80 == var2) {
            this.field81 = null;
            return null;
        } else {
            this.field81 = var2.field1576;
            return var2;
        }
    }

    @OriginalMember(owner = "client!CEEJCAVA", name = "c", descriptor = "()V")
    public void method37() {
        if (this.field80.field1575 == this.field80) {
            return;
        }
        while (true) {
            class57 var1 = this.field80.field1575;
            if (this.field80 == var1) {
                return;
            }
            var1.method505();
        }
    }
}
