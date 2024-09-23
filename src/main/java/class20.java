import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FLJWGVEY")
public class class20 {

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "B")
    private byte field806 = 1;

    @OriginalMember(owner = "FLJWGVEY", name = "b", descriptor = "LJJVWTXNE;")
    public class30 field807 = new class30();

    @OriginalMember(owner = "FLJWGVEY", name = "c", descriptor = "LJJVWTXNE;")
    private class30 field808;

    @OriginalMember(owner = "FLJWGVEY", name = "<init>", descriptor = "(I)V")
    public class20(int arg0) {
        this.field807.field985 = this.field807;
        this.field807.field986 = this.field807;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "(LJJVWTXNE;)V")
    public void method272(class30 arg0) {
        if (arg0.field986 != null) {
            arg0.method334();
        }
        arg0.field986 = this.field807.field986;
        arg0.field985 = this.field807;
        arg0.field986.field985 = arg0;
        arg0.field985.field986 = arg0;
        if (class30.field987) {
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "(ILJJVWTXNE;)V")
    public void method273(int arg0, class30 arg1) {
        if (arg1.field986 != null) {
            arg1.method334();
        }
        arg1.field986 = this.field807;
        arg1.field985 = this.field807.field985;
        if (arg0 == -24824) {
            arg1.field986.field985 = arg1;
            arg1.field985.field986 = arg1;
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "()LJJVWTXNE;")
    public class30 method274() {
        class30 var1 = this.field807.field985;
        if (this.field807 == var1) {
            return null;
        } else {
            var1.method334();
            return var1;
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "b", descriptor = "()LJJVWTXNE;")
    public class30 method275() {
        class30 var1 = this.field807.field985;
        if (this.field807 == var1) {
            this.field808 = null;
            return null;
        } else {
            this.field808 = var1.field985;
            return var1;
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "(I)LJJVWTXNE;")
    public class30 method276(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            throw new NullPointerException();
        }
        class30 var2 = this.field807.field986;
        if (this.field807 == var2) {
            this.field808 = null;
            return null;
        } else {
            this.field808 = var2.field986;
            return var2;
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "b", descriptor = "(I)LJJVWTXNE;")
    public class30 method277(int arg0) {
        class30 var2 = this.field808;
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        } else if (this.field807 == var2) {
            this.field808 = null;
            return null;
        } else {
            this.field808 = var2.field985;
            return var2;
        }
    }

    @OriginalMember(owner = "FLJWGVEY", name = "a", descriptor = "(B)LJJVWTXNE;")
    public class30 method278(byte arg0) {
        class30 var2 = this.field808;
        if (this.field807 == var2) {
            this.field808 = null;
            return null;
        }
        this.field808 = var2.field986;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "FLJWGVEY", name = "c", descriptor = "()V")
    public void method279() {
        if (this.field807.field985 == this.field807) {
            return;
        }
        while (true) {
            class30 var1 = this.field807.field985;
            if (this.field807 == var1) {
                return;
            }
            var1.method334();
        }
    }
}
