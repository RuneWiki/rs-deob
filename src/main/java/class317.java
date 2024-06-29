import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class317 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lwh;")
    public class529 field4939 = new class529();

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field4954 = 1339;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lcg;")
    public static class10 field4938 = new class10(0, 2, 2, 1);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lwh;")
    private class529 field4950;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLnj;)V")
    public final void method2113(byte arg0, class317 arg1) {
        this.method2119(this.field4939.field7779, 117, arg1);
        field4948++;
        if (arg0 > -58) {
            this.method2113((byte) 32, null);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public final int method2114(byte arg0) {
        field4940++;
        int var2 = 0;
        if (arg0 == -95) {
            for (class529 var3 = this.field4939.field7779; var3 != this.field4939; var3 = var3.field7779) {
                var2++;
            }
            return var2;
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method2115(byte arg0) {
        if (arg0 > -64) {
            method2121(117);
        }
        field4938 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwh;B)V")
    public final void method2116(class529 arg0, byte arg1) {
        field4947++;
        if (arg0.field7776 != null) {
            arg0.method3149(112);
        }
        arg0.field7779 = this.field4939.field7779;
        arg0.field7776 = this.field4939;
        arg0.field7776.field7779 = arg0;
        int var3 = 47 / ((arg1 + 12) / 56);
        arg0.field7779.field7776 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lwh;")
    public final class529 method2117(int arg0) {
        field4941++;
        class529 var2 = this.field4950;
        if (this.field4939 == var2) {
            this.field4950 = null;
            return null;
        } else {
            this.field4950 = var2.field7776;
            int var3 = 57 % ((arg0 - 44) / 57);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)I")
    public static final int method2118(boolean arg0, int arg1) {
        field4951++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0) {
                field4938 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwh;ILnj;)V")
    private final void method2119(class529 arg0, int arg1, class317 arg2) {
        if (arg1 <= 106) {
            return;
        }
        field4946++;
        class529 var4 = this.field4939.field7776;
        this.field4939.field7776 = arg0.field7776;
        arg0.field7776.field7779 = this.field4939;
        if (this.field4939 != arg0) {
            arg0.field7776 = arg2.field4939.field7776;
            arg0.field7776.field7779 = arg0;
            var4.field7779 = arg2.field4939;
            arg2.field4939.field7776 = var4;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
    public final void method2120(byte arg0) {
        field4949++;
        while (true) {
            class529 var2 = this.field4939.field7779;
            if (this.field4939 == var2) {
                this.field4950 = null;
                if (arg0 == 27) {
                    return;
                } else {
                    this.field4939 = null;
                    return;
                }
            }
            var2.method3149(arg0 ^ 0x2A);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method2121(int arg0) {
        field4952++;
        if (class108.field1552) {
            return;
        }
        class512.method3091(class513.field7614, arg0 - 20);
        if (arg0 != -97) {
            field4937 = 60;
        }
        if (class165.field2386 != null) {
            class512.method3091(class165.field2386, -120);
        }
        class108.field1552 = true;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
    public final boolean method2122(int arg0) {
        if (arg0 != -12191) {
            this.method2125(-109);
        }
        field4944++;
        return this.field4939.field7779 == this.field4939;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class317() {
        this.field4939.field7779 = this.field4939;
        this.field4939.field7776 = this.field4939;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lwh;")
    public final class529 method2123(int arg0) {
        field4945++;
        class529 var2 = this.field4939.field7779;
        int var3 = 86 % ((arg0 - 19) / 34);
        if (this.field4939 == var2) {
            this.field4950 = null;
            return null;
        } else {
            this.field4950 = var2.field7779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lwh;B)V")
    public final void method2124(class529 arg0, byte arg1) {
        if (arg0.field7776 != null) {
            arg0.method3149(64);
        }
        field4943++;
        arg0.field7779 = this.field4939;
        int var3 = 19 % ((arg1 - 38) / 47);
        arg0.field7776 = this.field4939.field7776;
        arg0.field7776.field7779 = arg0;
        arg0.field7779.field7776 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Lwh;")
    public final class529 method2125(int arg0) {
        field4936++;
        if (arg0 != 18007) {
            this.method2113((byte) -79, null);
        }
        class529 var2 = this.field4939.field7776;
        if (this.field4939 == var2) {
            this.field4950 = null;
            return null;
        } else {
            this.field4950 = var2.field7776;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)Lwh;")
    public final class529 method2126(byte arg0) {
        field4942++;
        class529 var2 = this.field4950;
        if (this.field4939 == var2) {
            this.field4950 = null;
            return null;
        }
        this.field4950 = var2.field7779;
        if (arg0 != 61) {
            this.method2120((byte) -123);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)Lwh;")
    public final class529 method2127(int arg0) {
        field4953++;
        class529 var2 = this.field4939.field7779;
        if (this.field4939 == var2) {
            return null;
        } else if (arg0 > -104) {
            return null;
        } else {
            var2.method3149(70);
            return var2;
        }
    }
}
