import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class83 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lol;")
    private class189 field1725 = new class189();

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Ls;")
    public static class186 field1728 = new class186(29, 1);

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "Lol;")
    private class189 field1735;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Z")
    public static boolean field1734;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILol;)V")
    public final void method776(int arg0, class189 arg1) {
        field1730++;
        if (arg1.field3035 != null) {
            arg1.method1289((byte) -87);
        }
        if (arg0 != 0) {
            this.field1735 = null;
        }
        arg1.field3032 = this.field1725;
        arg1.field3035 = this.field1725.field3035;
        arg1.field3035.field3032 = arg1;
        arg1.field3032.field3035 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Lol;")
    public final class189 method777(byte arg0) {
        field1732++;
        class189 var2 = this.field1725.field3032;
        if (this.field1725 == var2) {
            return null;
        }
        if (arg0 != -18) {
            field1734 = false;
        }
        var2.method1289((byte) -69);
        return var2;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)Z")
    public static final boolean method778(int arg0, int arg1, int arg2, int arg3) {
        if (class478.method2855(arg0, arg1, arg2)) {
            int var4 = arg1 << class353.field5216;
            int var5 = arg2 << class353.field5216;
            return class356.method2195(var4 + 1, class520.field7560[arg0].method177(arg1, arg2) + arg3, var5 + 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1 + 1, arg2) + arg3, var5 + 1) && class356.method2195(class19.field312 + var4 - 1, class520.field7560[arg0].method177(arg1 + 1, arg2 + 1) + arg3, class19.field312 + var5 - 1) && class356.method2195(var4 + 1, class520.field7560[arg0].method177(arg1, arg2 + 1) + arg3, class19.field312 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lol;")
    public final class189 method779(int arg0) {
        field1727++;
        class189 var2 = this.field1725.field3032;
        if (this.field1725 == var2) {
            this.field1735 = null;
            return null;
        }
        this.field1735 = var2.field3032;
        if (arg0 != 1) {
            method782(false, null, -104);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Lol;")
    public final class189 method780(byte arg0) {
        field1726++;
        if (arg0 <= 98) {
            field1734 = false;
        }
        class189 var2 = this.field1735;
        if (this.field1725 == var2) {
            this.field1735 = null;
            return null;
        } else {
            this.field1735 = var2.field3032;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
    public final int method781(boolean arg0) {
        field1724++;
        if (arg0) {
            this.method780((byte) 16);
        }
        int var2 = 0;
        for (class189 var3 = this.field1725.field3032; var3 != this.field1725; var3 = var3.field3032) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLjava/lang/String;I)I")
    public static final int method782(boolean arg0, String arg1, int arg2) {
        if (!arg0) {
            method782(true, null, -39);
        }
        field1731++;
        return class250.method1623(arg1, true, (byte) -42, arg2);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)V")
    public final void method783(byte arg0) {
        if (arg0 != -104) {
            this.method783((byte) 107);
        }
        while (true) {
            class189 var2 = this.field1725.field3032;
            if (this.field1725 == var2) {
                field1729++;
                this.field1735 = null;
                return;
            }
            var2.method1289((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(B)V")
    public static void method784(byte arg0) {
        field1728 = null;
        int var1 = -24 / ((-arg0 - 50) / 50);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class83() {
        this.field1725.field3032 = this.field1725;
        this.field1725.field3035 = this.field1725;
    }
}
