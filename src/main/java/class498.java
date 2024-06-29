import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class498 {

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lwfa;")
    public class388 field7165 = new class388();

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Llc;")
    public static class435 field7161 = new class435(1, 6);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lwfa;")
    private class388 field7167;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
    public final int method3024(byte arg0) {
        if (arg0 <= 99) {
            return 56;
        }
        field7160++;
        int var2 = 0;
        for (class388 var3 = this.field7165.field5596; var3 != this.field7165; var3 = var3.field5596) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lwfa;")
    public final class388 method3025(boolean arg0) {
        if (arg0) {
            return null;
        }
        field7159++;
        class388 var2 = this.field7165.field5596;
        if (this.field7165 == var2) {
            this.field7167 = null;
            return null;
        } else {
            this.field7167 = var2.field5596;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)Lwfa;")
    public final class388 method3026(boolean arg0) {
        field7162++;
        class388 var2 = this.field7167;
        if (this.field7165 == var2) {
            this.field7167 = null;
            return null;
        }
        this.field7167 = var2.field5596;
        if (!arg0) {
            this.method3026(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqk;B)V")
    public static final void method3027(class146 arg0, byte arg1) {
        if (arg1 > -79) {
            method3027(null, (byte) 43);
        }
        field7166++;
        if (class499.field7170 != arg0.field1990) {
            return;
        }
        if (class108.field1536.field9056 == null) {
            arg0.field2125 = 0;
            arg0.field2000 = 0;
            return;
        }
        arg0.field2132 = 150;
        arg0.field2083 = (int) (Math.sin((double) class703.field9918 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2125 = class652.field9348;
        arg0.field2015 = 5;
        arg0.field2000 = class126.method884(-100, class108.field1536.field9056);
        arg0.field2062 = class108.field1536.field4575;
        arg0.field2007 = 0;
        arg0.field1986 = class108.field1536.field4563;
        arg0.field2070 = class108.field1536.field4534;
        class131 var2 = arg0.field2062 == -1 ? null : class610.field8698.method2999(arg0.field2062, false);
        if (var2 != null) {
            class348.method2217(256, var2, arg0.field1986);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method3028(int arg0) {
        field7161 = null;
        if (arg0 != 0) {
            field7161 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILwfa;)V")
    public final void method3029(int arg0, class388 arg1) {
        if (arg0 != 0) {
            this.field7167 = null;
        }
        if (arg1.field5597 != null) {
            arg1.method2381(15735);
        }
        field7168++;
        arg1.field5596 = this.field7165;
        arg1.field5597 = this.field7165.field5597;
        arg1.field5597.field5596 = arg1;
        arg1.field5596.field5597 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lwfa;")
    public final class388 method3030(int arg0) {
        field7164++;
        class388 var2 = this.field7165.field5596;
        if (this.field7165 == var2) {
            return null;
        } else {
            var2.method2381(15735);
            int var3 = 104 % ((21 - arg0) / 53);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class498() {
        this.field7165.field5596 = this.field7165;
        this.field7165.field5597 = this.field7165;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final void method3031(int arg0) {
        field7163++;
        while (true) {
            class388 var2 = this.field7165.field5596;
            if (this.field7165 == var2) {
                this.field7167 = null;
                if (arg0 == 17294) {
                    return;
                } else {
                    this.method3030(36);
                    return;
                }
            }
            var2.method2381(15735);
        }
    }
}
