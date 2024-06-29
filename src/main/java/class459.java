import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class459 {

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Lkh;")
    private class13 field6675 = new class13(64);

    @OriginalMember(owner = "client!it", name = "u", descriptor = "Lkh;")
    public class13 field6689 = new class13(50);

    @OriginalMember(owner = "client!it", name = "v", descriptor = "Lkh;")
    public class13 field6690 = new class13(5);

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lul;")
    public class406 field6671;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Lee;")
    public class480 field6674;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lul;")
    private class406 field6681;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Z")
    public boolean field6679;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
    public static boolean field6673 = false;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Loe;")
    public static class137 field6677 = new class137();

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lkl;")
    public static class56 field6684 = new class56("WTQA", 2);

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Lgu;")
    public static class412 field6685 = new class412(512);

    @OriginalMember(owner = "client!it", name = "r", descriptor = "Lhn;")
    public static class509 field6686 = new class509(30, 28);

    @OriginalMember(owner = "client!it", name = "t", descriptor = "Lpm;")
    public static class415 field6688 = new class415();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Ll;")
    public static class16 field6687;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
    public final void method2778(byte arg0, int arg1) {
        field6682++;
        this.field6691 = arg1;
        class13 var3 = this.field6689;
        synchronized (this.field6689) {
            if (arg0 != -71) {
                field6684 = null;
            }
            this.field6689.method93((byte) 110);
        }
        class13 var4 = this.field6690;
        synchronized (this.field6690) {
            this.field6690.method93((byte) 94);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
    public final void method2779(int arg0, int arg1) {
        class13 var3 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method91(114, arg0);
        }
        int var4 = -80 / ((arg1 - 54) / 57);
        field6678++;
        class13 var5 = this.field6689;
        synchronized (this.field6689) {
            this.field6689.method91(35, arg0);
        }
        class13 var6 = this.field6690;
        synchronized (this.field6690) {
            this.field6690.method91(88, arg0);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2780(int arg0) {
        field6677 = null;
        field6684 = null;
        field6686 = null;
        field6685 = null;
        if (arg0 >= 92) {
            field6687 = null;
            field6688 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
    public final void method2781(boolean arg0, byte arg1) {
        field6672++;
        if (this.field6679 != arg0) {
            int var3 = -33 / ((arg1 - 33) / 42);
            this.field6679 = arg0;
            this.method2783(30);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)Ldm;")
    public final class37 method2782(int arg0, byte arg1) {
        field6676++;
        class13 var3 = this.field6675;
        class37 var4;
        synchronized (this.field6675) {
            var4 = (class37) this.field6675.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field6681;
        byte[] var6;
        synchronized (this.field6681) {
            var6 = this.field6681.method2536(class199.method1396(arg0, 1013964455), 0, class58.method522(-35, arg0));
            if (arg1 != -87) {
                method2785(73, 88, -66, -87, (byte) 107, 81);
            }
        }
        class37 var7 = new class37();
        var7.field474 = this;
        var7.field500 = arg0;
        if (var6 != null) {
            var7.method254(false, new class217(var6));
        }
        var7.method258((byte) -82);
        class13 var8 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final void method2783(int arg0) {
        class13 var2 = this.field6675;
        synchronized (this.field6675) {
            if (arg0 != 30) {
                this.method2781(true, (byte) -95);
            }
            this.field6675.method93((byte) 90);
        }
        field6669++;
        class13 var3 = this.field6689;
        synchronized (this.field6689) {
            this.field6689.method93((byte) 110);
        }
        class13 var4 = this.field6690;
        synchronized (this.field6690) {
            this.field6690.method93((byte) 119);
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final void method2784(int arg0) {
        field6670++;
        class13 var2 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method88(115);
            int var3 = 63 % ((arg0 + 64) / 54);
        }
        class13 var4 = this.field6689;
        synchronized (this.field6689) {
            this.field6689.method88(125);
        }
        class13 var5 = this.field6690;
        synchronized (this.field6690) {
            this.field6690.method88(102);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIBI)Z")
    public static final boolean method2785(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -105 / ((arg4 - 47) / 49);
        field6680++;
        for (int var7 = arg1; var7 <= arg2; var7++) {
            for (int var8 = arg3; var8 <= arg0; var8++) {
                if (class359.field5327[var7][var8] == arg5 && class406.field6030[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public final void method2786(byte arg0) {
        field6683++;
        class13 var2 = this.field6689;
        synchronized (this.field6689) {
            this.field6689.method93((byte) 114);
        }
        class13 var3 = this.field6690;
        synchronized (this.field6690) {
            this.field6690.method93((byte) 89);
            if (arg0 <= 89) {
                this.method2779(80, -93);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lee;IZLul;Lul;)V")
    public class459(class480 arg0, int arg1, boolean arg2, class406 arg3, class406 arg4) {
        this.field6671 = arg4;
        this.field6674 = arg0;
        this.field6681 = arg3;
        this.field6679 = arg2;
        if (this.field6681 != null) {
            int var6 = this.field6681.method2561(-126) - 1;
            this.field6681.method2551(var6, -26070);
        }
    }
}
