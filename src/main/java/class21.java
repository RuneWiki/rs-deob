import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class21 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Lwi;")
    private class330 field311 = new class330(64);

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Luu;")
    private class191 field315;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "[S")
    public static short[] field322 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Luu;")
    public static class191 field324;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZLjava/lang/Object;)[B")
    public static final byte[] method193(int arg0, int arg1, boolean arg2, Object arg3) {
        field319++;
        if (arg3 == null) {
            return null;
        } else if (!arg2) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class357.method2292((byte) -70, arg1, arg0, var4);
        } else if (arg3 instanceof class434) {
            class434 var5 = (class434) arg3;
            return var5.method1523(arg0, (byte) 41, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lga;")
    public static final class282 method194(int arg0, int arg1) {
        field314++;
        int var2 = arg1 >> 16;
        if (arg0 >= -103) {
            field320 = 38;
        }
        int var3 = arg1 & 0xFFFF;
        if (class263.field3690[var2] == null || class263.field3690[var2][var3] == null) {
            boolean var4 = class86.method587(-111, var2);
            if (!var4) {
                return null;
            }
        }
        return class263.field3690[var2][var3];
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)V")
    public final void method195(int arg0, byte arg1) {
        class330 var3 = this.field311;
        synchronized (this.field311) {
            this.field311.method2127((byte) 123);
            this.field311 = new class330(arg0);
            if (arg1 > -26) {
                this.field311 = null;
            }
        }
        field313++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        field322 = null;
        if (arg0 == -1116) {
            field324 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public final void method197(byte arg0) {
        field312++;
        class330 var2 = this.field311;
        synchronized (this.field311) {
            this.field311.method2135(0);
        }
        if (arg0 != 78) {
            this.method202(68);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
    public final void method198(int arg0, int arg1) {
        if (arg1 != 64) {
            method193(-33, -34, true, null);
        }
        class330 var3 = this.field311;
        synchronized (this.field311) {
            this.field311.method2140(-114, arg0);
        }
        field323++;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Z")
    public static final boolean method199(int arg0, int arg1) {
        field317++;
        int var2 = -3 / ((arg1 - 48) / 44);
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Lsj;")
    public final class324 method200(int arg0, boolean arg1) {
        field316++;
        class330 var3 = this.field311;
        class324 var4;
        synchronized (this.field311) {
            var4 = (class324) this.field311.method2133((long) arg0, (byte) 87);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field315;
        byte[] var6;
        synchronized (this.field315) {
            var6 = this.field315.method1281(class431.method2633((byte) 1, arg0), class18.method184(20287, arg0), 64);
        }
        if (!arg1) {
            field320 = -19;
        }
        class324 var7 = new class324();
        if (var6 != null) {
            var7.method2010((byte) -62, new class164(var6));
        }
        class330 var8 = this.field311;
        synchronized (this.field311) {
            this.field311.method2131(var7, (long) arg0, !arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)V")
    public static final void method201(byte arg0, int arg1) {
        class394.field6021 = new int[arg1];
        class102.field1476 = new int[arg1];
        class282.field4153 = new int[arg1];
        field318++;
        class78.field1127 = new int[arg1];
        class390.field5958 = new int[arg1];
        if (arg0 > -5) {
            method196(-58);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public final void method202(int arg0) {
        class330 var2 = this.field311;
        synchronized (this.field311) {
            this.field311.method2127((byte) 123);
        }
        field321++;
        if (arg0 != -4160) {
            field320 = -28;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class21(class65 arg0, int arg1, class191 arg2) {
        this.field315 = arg2;
        if (this.field315 != null) {
            int var4 = this.field315.method1294(-1) - 1;
            this.field315.method1290(false, var4);
        }
    }
}
