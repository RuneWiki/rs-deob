import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class126 {

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lwi;")
    private class330 field1711 = new class330(256);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Luu;")
    private class191 field1708;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lpa;")
    public static class254 field1712 = new class254(9, 4);

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lni;")
    public static class367 field1716;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Lfg;")
    public static class84 field1717;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Luu;")
    public static class191 field1714;

    static {
        new class446("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field1716 = new class367(69, 16);
        field1717 = new class84(13, 0, 1, 0);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method862(boolean arg0, int arg1) {
        field1706++;
        class330 var3 = this.field1711;
        synchronized (this.field1711) {
            this.field1711.method2140(-117, arg1);
            if (!arg0) {
                this.method864(false);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 23)
    public static void method863(byte arg0) {
        field1716 = null;
        if (arg0 < 46) {
            method863((byte) 91);
        }
        field1717 = null;
        field1712 = null;
        field1714 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V", line = 42)
    public final void method864(boolean arg0) {
        class330 var2 = this.field1711;
        synchronized (this.field1711) {
            if (arg0) {
                field1714 = null;
            }
            this.field1711.method2127((byte) -65);
        }
        field1713++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Ldr;", line = 58)
    public final class515 method865(byte arg0, int arg1) {
        field1710++;
        class330 var3 = this.field1711;
        class515 var4;
        synchronized (this.field1711) {
            var4 = (class515) this.field1711.method2133((long) arg1, (byte) 124);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field1708;
        byte[] var6;
        synchronized (this.field1708) {
            var6 = this.field1708.method1281(26, arg1, arg0 ^ 0x42);
        }
        class515 var7 = new class515();
        if (var6 != null) {
            var7.method3073(3, new class164(var6));
        }
        class330 var8 = this.field1711;
        synchronized (this.field1711) {
            this.field1711.method2131(var7, (long) arg1, false);
        }
        return arg0 == 51 ? var7 : null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lnj;Z)Lph;", line = 92)
    public static final class463 method866(class164 arg0, boolean arg1) {
        field1707++;
        if (arg1) {
            method863((byte) -90);
        }
        return new class463(arg0.method1056(1024), arg0.method1056(1024), arg0.method1056(1024), arg0.method1056(1024), arg0.method1090(-1), arg0.method1090(-1), arg0.method1087(arg1));
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V", line = 103)
    public final void method867(boolean arg0) {
        field1709++;
        class330 var2 = this.field1711;
        synchronized (this.field1711) {
            if (arg0) {
                this.method864(false);
            }
            this.field1711.method2135(0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Liv;ILuu;)V", line = 124)
    public class126(class65 arg0, int arg1, class191 arg2) {
        this.field1708 = arg2;
        this.field1708.method1290(false, 26);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lwj;IIIIIZ)V", line = 139)
    public static final void method868(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1715++;
        if (arg6) {
            class362.method2311(0, arg4, arg2, arg1, arg0.field1867, arg6, arg5, arg3, arg0.field1862, arg0.field1866);
        }
    }
}
