import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class344 extends class577 {

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
    private boolean field4792 = true;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/lang/String;")
    public String field4802 = null;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public int field4797 = 0;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "[S")
    public static short[] field4807 = new short[256];

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "B")
    public byte field4798;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "B")
    public byte field4806;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "J")
    public long field4803;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Z")
    private boolean field4793;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "[I")
    private int[] field4794;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "[Ltf;")
    public class310[] field4799;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2177(boolean arg0) {
        for (class753 var1 = (class753) class371.field5135.method636(256); var1 != null; var1 = (class753) class371.field5135.method637(false)) {
            if (var1.field10409 > 1) {
                var1.field10409 = 0;
                class550.field7901.method3739(((class746) var1.field10411.field923.field1600).field10344, (byte) 46, var1);
                var1.field10411.method629(false);
            }
        }
        ++field4804;
        class618.field8644 = 0;
        class310.field4426 = 0;
        class239.field3583.method1729((byte) -119);
        class561.field7973.method2240(81);
        class371.field5135.method629(arg0);
        class429.method2580(-118, class284.field4193);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V", line = 37)
    public final void method2178(boolean arg0, int arg1) {
        --this.field4797;
        ++field4805;
        if (this.field4797 == 0) {
            this.field4799 = null;
        } else {
            class595.method3472(this.field4799, arg1 + 1, this.field4799, arg1, -arg1 + this.field4797);
        }
        this.field4794 = null;
        if (!arg0) {
            this.field4793 = false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILso;)V", line = 55)
    private final void method2179(int arg0, class494 arg1) {
        ++field4801;
        int var3 = arg1.method2964((byte) 87);
        if (~(arg0 & var3) != -1) {
            this.field4792 = true;
        }
        if (~(1 & var3) != -1) {
            this.field4793 = true;
        }
        super.field8133 = arg1.method3005(arg0 ^ -104);
        this.field4803 = arg1.method3005(arg0 ^ -53);
        this.field4802 = arg1.method2996(arg0 ^ 121);
        arg1.method2964((byte) 86);
        this.field4798 = arg1.method2943((byte) 16);
        this.field4806 = arg1.method2943((byte) 16);
        this.field4797 = arg1.method2998(true);
        if (~this.field4797 < -1) {
            this.field4799 = new class310[this.field4797];
            for (int var4 = 0; var4 < this.field4797; ++var4) {
                class310 var5 = new class310();
                if (this.field4793) {
                    arg1.method3005(-48);
                }
                if (this.field4792) {
                    var5.field4428 = arg1.method2996(116);
                }
                var5.field4427 = arg1.method2943((byte) 16);
                var5.field4424 = arg1.method2998(true);
                this.field4799[var4] = var5;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ltf;I)V", line = 109)
    public final void method2180(class310 arg0, int arg1) {
        ++field4796;
        if (this.field4799 == null || this.field4797 >= this.field4799.length) {
            this.method2182(this.field4797 + 5, arg1 ^ 5);
        }
        this.field4799[this.field4797++] = arg0;
        this.field4794 = null;
        if (arg1 != 5) {
            this.field4806 = -8;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 127)
    public final int method2181(String arg0, byte arg1) {
        ++field4791;
        for (int var3 = 0; ~this.field4797 < ~var3; ++var3) {
            if (this.field4799[var3].field4428.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        if (arg1 <= 49) {
            this.method2179(-64, (class494) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V", line = 157)
    private final void method2182(int arg0, int arg1) {
        ++field4795;
        if (arg1 != 0) {
            this.method2178(false, -31);
        }
        if (this.field4799 == null) {
            this.field4799 = new class310[arg0];
        } else {
            class595.method3472(this.field4799, 0, this.field4799 = new class310[arg0], 0, this.field4797);
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V", line = 172)
    public static void method2183(byte arg0) {
        field4807 = null;
        int var1 = -29 % ((64 - arg0) / 40);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lso;)V", line = 234)
    public class344(class494 arg0) {
        this.method2179(2, arg0);
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)[I", line = 198)
    public final int[] method2184(byte arg0) {
        ++field4800;
        if (this.field4794 == null) {
            String[] var2 = new String[this.field4797];
            this.field4794 = new int[this.field4797];
            int var3 = 0;
            while (~this.field4797 < ~var3) {
                var2[var3] = this.field4799[var3].field4428;
                this.field4794[var3] = var3++;
            }
            class179.method1288(var2, this.field4794, (byte) -111);
        }
        return arg0 >= -89 ? null : this.field4794;
    }
}
