import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class594 {

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lu;")
    public class66 field8428 = new class66();

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Lu;")
    private class66 field8432;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLu;)V", line = 3)
    public final void method3463(byte arg0, class66 arg1) {
        field8419++;
        if (arg1.field853 != null) {
            arg1.method707((byte) -58);
        }
        arg1.field853 = this.field8428.field853;
        if (arg0 != -87) {
            this.field8428 = null;
        }
        arg1.field848 = this.field8428;
        arg1.field853.field848 = arg1;
        arg1.field848.field853 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method3464(int arg0) {
        field8429++;
        if (arg0 == 0) {
            return this.field8428.field848 == this.field8428;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Lu;", line = 35)
    public final class66 method3465(byte arg0) {
        field8425++;
        class66 var2 = this.field8428.field848;
        if (this.field8428 == var2) {
            this.field8432 = null;
            return null;
        } else {
            this.field8432 = var2.field848;
            int var3 = 115 / ((42 - arg0) / 58);
            return var2;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lu;B)V", line = 56)
    public final void method3466(class66 arg0, byte arg1) {
        field8430++;
        if (arg0.field853 != null) {
            arg0.method707((byte) -13);
        }
        if (arg1 != -23) {
            this.field8428 = null;
        }
        arg0.field848 = this.field8428.field848;
        arg0.field853 = this.field8428;
        arg0.field853.field848 = arg0;
        arg0.field848.field853 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Lu;", line = 76)
    public final class66 method3467(int arg0) {
        field8422++;
        if (arg0 != 0) {
            this.method3468(-4);
        }
        class66 var2 = this.field8432;
        if (this.field8428 == var2) {
            this.field8432 = null;
            return null;
        } else {
            this.field8432 = var2.field853;
            return var2;
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I", line = 101)
    public final int method3468(int arg0) {
        field8427++;
        int var2 = arg0;
        for (class66 var3 = this.field8428.field848; var3 != this.field8428; var3 = var3.field848) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Lu;", line = 119)
    public final class66 method3469(int arg0) {
        if (arg0 != 0) {
            this.field8428 = null;
        }
        field8423++;
        class66 var2 = this.field8432;
        if (this.field8428 == var2) {
            this.field8432 = null;
            return null;
        } else {
            this.field8432 = var2.field848;
            return var2;
        }
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Lu;", line = 142)
    public final class66 method3470(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field8420++;
        class66 var2 = this.field8428.field853;
        if (this.field8428 == var2) {
            this.field8432 = null;
            return null;
        } else {
            this.field8432 = var2.field853;
            return var2;
        }
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Lu;", line = 164)
    public final class66 method3471(int arg0) {
        field8421++;
        class66 var2 = this.field8428.field848;
        if (this.field8428 == var2) {
            return null;
        } else {
            var2.method707((byte) -87);
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILor;)V", line = 187)
    public final void method3472(int arg0, class594 arg1) {
        field8426++;
        if (arg0 != -32188) {
            this.method3470(50);
        }
        this.method3473(-62, arg1, this.field8428.field848);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILor;Lu;)V", line = 201)
    private final void method3473(int arg0, class594 arg1, class66 arg2) {
        field8431++;
        class66 var4 = this.field8428.field853;
        this.field8428.field853 = arg2.field853;
        arg2.field853.field848 = this.field8428;
        if (arg0 > -20) {
            this.field8432 = null;
        }
        if (this.field8428 != arg2) {
            arg2.field853 = arg1.field8428.field853;
            arg2.field853.field848 = arg2;
            var4.field848 = arg1.field8428;
            arg1.field8428.field853 = var4;
        }
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V", line = 228)
    public final void method3474(int arg0) {
        field8424++;
        if (arg0 != 22090) {
            this.method3472(-14, null);
        }
        while (true) {
            class66 var2 = this.field8428.field848;
            if (this.field8428 == var2) {
                this.field8432 = null;
                return;
            }
            var2.method707((byte) -77);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V", line = 256)
    public class594() {
        this.field8428.field848 = this.field8428;
        this.field8428.field853 = this.field8428;
    }
}
