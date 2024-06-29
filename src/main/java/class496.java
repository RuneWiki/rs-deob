import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class496 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lwi;")
    private class330 field7312 = new class330(64);

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lwi;")
    public class330 field7319 = new class330(2);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Luu;")
    private class191 field7310;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Luu;")
    public class191 field7308;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lof;")
    public static class446 field7313 = new class446("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lni;")
    public static class367 field7317 = new class367(58, -1);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lla;")
    public static class319 field7320 = new class319(93, 4);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lsa;")
    public static class139 field7314;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Llo;")
    public static class539 field7321;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZII)Z", line = 4)
    public static final boolean method2961(boolean arg0, int arg1, int arg2) {
        field7315++;
        class209 var3 = class432.field6575.method1872(arg2, false);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (!arg0) {
            method2961(false, -57, -95);
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1438(-28746, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Loe;", line = 23)
    public final class136 method2962(int arg0, byte arg1) {
        field7311++;
        class330 var3 = this.field7312;
        class136 var4;
        synchronized (this.field7312) {
            var4 = (class136) this.field7312.method2133((long) arg0, (byte) 71);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 >= -36) {
            return null;
        } else {
            class191 var5 = this.field7310;
            byte[] var6;
            synchronized (this.field7310) {
                var6 = this.field7310.method1281(33, arg0, 83);
            }
            class136 var7 = new class136();
            var7.field1817 = this;
            if (var6 != null) {
                var7.method920(new class164(var6), 100);
            }
            class330 var8 = this.field7312;
            synchronized (this.field7312) {
                this.field7312.method2131(var7, (long) arg0, false);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 57)
    public final void method2963(int arg0, int arg1) {
        class330 var3 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2140(-114, arg0);
            if (arg1 != 4) {
                this.field7312 = null;
            }
        }
        field7316++;
        class330 var4 = this.field7319;
        synchronized (this.field7319) {
            this.field7319.method2140(-122, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 75)
    public final void method2964(int arg0) {
        if (arg0 != -19493) {
            field7317 = null;
        }
        field7318++;
        class330 var2 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2127((byte) -29);
        }
        class330 var3 = this.field7319;
        synchronized (this.field7319) {
            this.field7319.method2127((byte) -14);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 91)
    public static void method2965(boolean arg0) {
        field7314 = null;
        if (arg0) {
            field7320 = null;
        }
        field7320 = null;
        field7321 = null;
        field7317 = null;
        field7313 = null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 114)
    public final void method2966(int arg0) {
        class330 var2 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2135(0);
        }
        field7309++;
        class330 var3 = this.field7319;
        synchronized (this.field7319) {
            if (arg0 != -29338) {
                method2961(true, 106, -89);
            }
            this.field7319.method2135(arg0 + 29338);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Liv;ILuu;Luu;)V", line = 148)
    public class496(class65 arg0, int arg1, class191 arg2, class191 arg3) {
        this.field7310 = arg2;
        this.field7308 = arg3;
        this.field7310.method1290(false, 33);
    }
}
