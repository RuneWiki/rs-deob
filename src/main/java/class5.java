import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class5 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lch;")
    private class167 field46 = new class167();

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Le;")
    private static class191 field39 = class54.method368("Take", 2047);

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Le;")
    public static class191 field41 = field39;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field52 = -1;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Lch;")
    private class167 field53;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIII)V")
    public static final void method16(boolean arg0, int arg1, int arg2, int arg3) {
        field44++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class233.field4161 = arg1;
        if (arg3 != 15899) {
            field41 = null;
        }
        class85.field1399 = arg0;
        class75.field1284 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lch;")
    public final class167 method17(int arg0) {
        field47++;
        class167 var2 = this.field46.field2822;
        if (arg0 != 0) {
            return null;
        } else if (this.field46 == var2) {
            return null;
        } else {
            var2.method1124(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lch;")
    public final class167 method18(int arg0) {
        field40++;
        class167 var2 = this.field53;
        if (this.field46 == var2) {
            this.field53 = null;
            return null;
        }
        if (arg0 != -8001) {
            field48 = 64;
        }
        this.field53 = var2.field2822;
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Lch;")
    public final class167 method19(int arg0) {
        field45++;
        class167 var2 = this.field46.field2822;
        if (this.field46 == var2) {
            this.field53 = null;
            return null;
        } else if (arg0 == -1) {
            this.field53 = var2.field2822;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method20(byte arg0) {
        field41 = null;
        field39 = null;
        int var1 = -33 / ((arg0 - 15) / 41);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lng;I)I")
    public static final int method21(class121 arg0, int arg1) {
        field50++;
        int var2 = 0;
        if (arg0.method818(0, class86.field1417)) {
            var2++;
        }
        if (arg0.method818(0, class191.field3407)) {
            var2++;
        }
        if (arg0.method818(arg1, class62.field1113)) {
            var2++;
        }
        if (arg0.method818(arg1 + arg1, class53.field962)) {
            var2++;
        }
        if (arg0.method818(arg1, class196.field3500)) {
            var2++;
        }
        if (arg0.method818(0, class14.field178)) {
            var2++;
        }
        if (arg0.method818(0, class83.field1396)) {
            var2++;
        }
        if (arg0.method818(0, class189.field3323)) {
            var2++;
        }
        if (arg0.method818(0, class67.field1164)) {
            var2++;
        }
        if (arg0.method818(0, class126.field2082)) {
            var2++;
        }
        if (arg0.method818(0, class248.field4410)) {
            var2++;
        }
        if (arg0.method818(arg1, class175.field2939)) {
            var2++;
        }
        if (arg0.method818(0, class137.field2297)) {
            var2++;
        }
        var2++;
        if (arg0.method818(arg1, class133.field2227)) {
            var2++;
        }
        if (arg0.method818(0, class21.field306)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILch;)V")
    public final void method22(int arg0, class167 arg1) {
        if (arg1.field2816 != null) {
            arg1.method1124(0);
        }
        field54++;
        arg1.field2816 = this.field46.field2816;
        arg1.field2822 = this.field46;
        arg1.field2816.field2822 = arg1;
        if (arg0 > 39) {
            arg1.field2822.field2816 = arg1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (true) {
            class167 var2 = this.field46.field2822;
            if (this.field46 == var2) {
                field49++;
                this.field53 = null;
                return;
            }
            var2.method1124(0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class5() {
        this.field46.field2816 = this.field46;
        this.field46.field2822 = this.field46;
    }
}
