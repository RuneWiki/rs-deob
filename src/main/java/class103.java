import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class103 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lkh;")
    private class13 field1484 = new class13(64);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lul;")
    public class406 field1478;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lul;")
    private class406 field1476;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lhn;")
    public static class509 field1482 = new class509(53, 8);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "F")
    public static float field1486;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lul;")
    public static class406 field1485;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Lne;")
    public final class210 method815(byte arg0, int arg1) {
        field1483++;
        class13 var3 = this.field1484;
        class210 var4;
        synchronized (this.field1484) {
            var4 = (class210) this.field1484.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field1476;
        byte[] var6;
        synchronized (this.field1476) {
            var6 = this.field1476.method2536(3, arg0 - 31, arg1);
        }
        class210 var7 = new class210();
        var7.field3434 = this;
        if (var6 != null) {
            var7.method1452(false, new class217(var6));
        }
        class13 var8 = this.field1484;
        synchronized (this.field1484) {
            this.field1484.method84((long) arg1, var7, (byte) 27);
            if (arg0 != 31) {
                field1482 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIB)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class193.field3258.field7251 != 0 && arg1 != 0 && class384.field5774 < 50 && arg2 != -1) {
            class522.field7636[class384.field5774++] = new class85((byte) 1, arg2, arg1, arg0, arg3, 0);
        }
        field1481++;
        if (arg4 != -46) {
            method819(-92);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
    public final void method817(boolean arg0, int arg1) {
        field1477++;
        if (arg0) {
            this.field1478 = null;
        }
        class13 var3 = this.field1484;
        synchronized (this.field1484) {
            this.field1484.method91(93, arg1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method818(int arg0) {
        field1479++;
        class13 var2 = this.field1484;
        synchronized (this.field1484) {
            this.field1484.method88(84);
        }
        if (arg0 != 53) {
            this.field1484 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method819(int arg0) {
        if (arg0 <= 1) {
            method816(123, -106, -38, 26, (byte) 92);
        }
        field1482 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lee;ILul;Lul;)V")
    public class103(class480 arg0, int arg1, class406 arg2, class406 arg3) {
        this.field1478 = arg3;
        this.field1476 = arg2;
        this.field1476.method2551(3, -26070);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public final void method820(boolean arg0) {
        field1480++;
        class13 var2 = this.field1484;
        synchronized (this.field1484) {
            if (!arg0) {
                this.field1484.method93((byte) 81);
            }
        }
    }
}
