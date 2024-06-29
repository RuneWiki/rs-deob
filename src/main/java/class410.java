import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class410 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lhc;")
    private class221 field6205 = new class221();

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lhc;")
    private class221 field6215;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lhc;")
    public final class221 method2616(int arg0) {
        field6212++;
        class221 var2 = this.field6205.field3739;
        if (this.field6205 == var2) {
            this.field6215 = null;
            return null;
        }
        this.field6215 = var2.field3739;
        if (arg0 != 255) {
            this.field6215 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
    public final int method2617(boolean arg0) {
        field6208++;
        int var2 = 0;
        if (arg0) {
            this.field6205 = null;
        }
        for (class221 var3 = this.field6205.field3739; var3 != this.field6205; var3 = var3.field3739) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public final void method2618(int arg0) {
        field6211++;
        while (true) {
            class221 var2 = this.field6205.field3739;
            if (this.field6205 == var2) {
                this.field6215 = null;
                if (arg0 == -9974) {
                    return;
                } else {
                    this.field6215 = null;
                    return;
                }
            }
            var2.method1613(1049391719);
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Lhc;")
    public final class221 method2619(int arg0) {
        if (arg0 != 255) {
            return null;
        }
        field6216++;
        class221 var2 = this.field6215;
        if (this.field6205 == var2) {
            this.field6215 = null;
            return null;
        } else {
            this.field6215 = var2.field3739;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lhc;")
    public final class221 method2620(byte arg0) {
        field6206++;
        if (arg0 > -5) {
            this.method2624(51);
        }
        class221 var2 = this.field6205.field3739;
        if (this.field6205 == var2) {
            return null;
        } else {
            var2.method1613(1049391719);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I")
    public static int method2621(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)Z")
    public final boolean method2622(int arg0) {
        if (arg0 <= 7) {
            this.method2624(10);
        }
        field6214++;
        return this.field6205.field3739 == this.field6205;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)I")
    public static final int method2623(int arg0, int arg1) {
        if (arg1 >= -6) {
            return -77;
        } else {
            field6210++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lhc;")
    public final class221 method2624(int arg0) {
        field6207++;
        class221 var2 = this.field6205.field3741;
        if (this.field6205 == var2) {
            this.field6215 = null;
            return null;
        }
        this.field6215 = var2.field3741;
        if (arg0 >= -39) {
            this.field6205 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lhc;I)V")
    public final void method2625(class221 arg0, int arg1) {
        field6213++;
        if (arg0.field3741 != null) {
            arg0.method1613(arg1 ^ 0x3E8C7267);
        }
        arg0.field3741 = this.field6205.field3741;
        arg0.field3739 = this.field6205;
        arg0.field3741.field3739 = arg0;
        arg0.field3739.field3741 = arg0;
        if (arg1 != 0) {
            this.field6215 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class410() {
        this.field6205.field3741 = this.field6205;
        this.field6205.field3739 = this.field6205;
    }
}
