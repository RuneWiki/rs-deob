import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class482 {

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "Z")
    public boolean field7181 = false;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "Ljv;")
    private class55 field7182 = new class55(64);

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "Ljv;")
    public class55 field7183 = new class55(500);

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Ljv;")
    public class55 field7184 = new class55(30);

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "Ljv;")
    public class55 field7185 = new class55(50);

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "Lbu;")
    private class17 field7180;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
    public boolean field7170;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "Lbu;")
    public class17 field7171;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "F")
    public static float field7168 = 0.25F;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field7169 = -1;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public int field7186;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
    public static int[] field7166;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static final void method2866(int arg0) {
        field7174++;
        class54 var1 = class442.method2651(0, 15, -13208);
        if (arg0 >= 65) {
            var1.method476((byte) -44);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public final void method2867(byte arg0) {
        field7167++;
        class55 var2 = this.field7182;
        synchronized (this.field7182) {
            if (arg0 >= -91) {
                this.field7185 = null;
            }
            this.field7182.method484(71);
        }
        class55 var3 = this.field7183;
        synchronized (this.field7183) {
            this.field7183.method484(38);
        }
        class55 var4 = this.field7184;
        synchronized (this.field7184) {
            this.field7184.method484(100);
        }
        class55 var5 = this.field7185;
        synchronized (this.field7185) {
            this.field7185.method484(108);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
    public final void method2868(byte arg0, int arg1) {
        field7173++;
        this.field7186 = arg1;
        class55 var3 = this.field7183;
        synchronized (this.field7183) {
            if (arg0 != 123) {
                return;
            }
            this.field7183.method488(-3);
        }
        class55 var4 = this.field7184;
        synchronized (this.field7184) {
            this.field7184.method488(-3);
        }
        class55 var5 = this.field7185;
        synchronized (this.field7185) {
            this.field7185.method488(-3);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
    public final void method2869(int arg0, byte arg1) {
        int var3 = 100 % ((arg1 - 7) / 54);
        this.field7182 = new class55(arg0);
        field7179++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static void method2870(boolean arg0) {
        if (!arg0) {
            method2866(-8);
        }
        field7166 = null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IB)V")
    public final void method2871(int arg0, byte arg1) {
        field7177++;
        class55 var3 = this.field7182;
        synchronized (this.field7182) {
            this.field7182.method493(false, arg0);
        }
        class55 var4 = this.field7183;
        synchronized (this.field7183) {
            this.field7183.method493(false, arg0);
        }
        class55 var5 = this.field7184;
        synchronized (this.field7184) {
            this.field7184.method493(false, arg0);
        }
        class55 var6 = this.field7185;
        synchronized (this.field7185) {
            this.field7185.method493(false, arg0);
        }
        int var7 = 31 % ((arg1 - 17) / 52);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BZ)V")
    public final void method2872(byte arg0, boolean arg1) {
        field7175++;
        if (arg1 != this.field7181 && arg0 == -59) {
            this.field7181 = arg1;
            this.method2875((byte) -122);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(BZ)V")
    public final void method2873(byte arg0, boolean arg1) {
        field7172++;
        if (arg1 == this.field7170) {
            return;
        }
        this.field7170 = arg1;
        if (arg0 != -60) {
            field7169 = 65;
        }
        this.method2875((byte) -113);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lgm;")
    public final class79 method2874(int arg0, int arg1) {
        field7178++;
        class55 var3 = this.field7182;
        class79 var4;
        synchronized (this.field7182) {
            var4 = (class79) this.field7182.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7180.method114(class118.method878(1887, arg0), class147.method1138((byte) 0, arg0), 125);
        class79 var6 = new class79();
        var6.field1318 = arg0;
        var6.field1320 = this;
        if (var5 != null) {
            var6.method635(new class145(var5), arg1 + 17159);
        }
        var6.method624((byte) 88);
        if (!this.field7170 && var6.field1346) {
            var6.field1380 = null;
            var6.field1374 = null;
        }
        if (var6.field1362) {
            var6.field1372 = false;
            var6.field1381 = 0;
        }
        class55 var7 = this.field7182;
        synchronized (this.field7182) {
            if (arg1 != -17045) {
                this.method2871(-118, (byte) 112);
            }
            this.field7182.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    public final void method2875(byte arg0) {
        field7176++;
        class55 var2 = this.field7182;
        synchronized (this.field7182) {
            int var3 = -68 % ((-arg0 - 77) / 33);
            this.field7182.method488(-3);
        }
        class55 var4 = this.field7183;
        synchronized (this.field7183) {
            this.field7183.method488(-3);
        }
        class55 var5 = this.field7184;
        synchronized (this.field7184) {
            this.field7184.method488(-3);
        }
        class55 var6 = this.field7185;
        synchronized (this.field7185) {
            this.field7185.method488(-3);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Loq;IZLbu;Lbu;)V")
    public class482(class239 arg0, int arg1, boolean arg2, class17 arg3, class17 arg4) {
        this.field7180 = arg3;
        this.field7170 = arg2;
        this.field7171 = arg4;
        if (this.field7180 != null) {
            int var6 = this.field7180.method138(false) - 1;
            this.field7180.method119(29630, var6);
        }
    }
}
