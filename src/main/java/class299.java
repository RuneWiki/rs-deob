import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class299 extends class337 {

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    private int field4536 = 0;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    private int field4537 = 4096;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field4541 = -1;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "Lak;")
    public static class234 field4539 = new class234("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field4544;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[][] var4 = this.method2123(arg0, 0, -91);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class402.field5977; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field4536 >= ~var12) {
                    if (~var12 < ~this.field4537) {
                        var8[var11] = this.field4537;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4536;
                }
                if (~var13 <= ~this.field4536) {
                    if (this.field4537 < var13) {
                        var9[var11] = this.field4537;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field4536;
                }
                if (this.field4536 <= var14) {
                    if (var14 <= this.field4537) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field4537;
                    }
                } else {
                    var10[var11] = this.field4536;
                }
            }
        }
        int var15 = -91 / ((arg1 - -41) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5019 = arg2.method1515((byte) 125) == 1;
                }
            } else {
                this.field4537 = arg2.method1511(-69);
            }
        } else {
            this.field4536 = arg2.method1511(-49);
        }
        ++field4538;
        int var5 = -74 % ((82 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field4540;
        int[] var3 = super.field5007.method512(arg0, arg1 ^ -11);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0, 0, -72);
            for (int var5 = 0; ~var5 > ~class402.field5977; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field4536) {
                    if (var6 > this.field4537) {
                        var3[var5] = this.field4537;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field4536;
                }
            }
        }
        if (arg1 != -11) {
            this.method179(83, (byte) 119);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
    public class299() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)Lhs;")
    public static final class216 method1935(byte arg0) {
        if (arg0 != 34) {
            method1935((byte) 24);
        }
        ++field4542;
        try {
            return new class489();
        } catch (Throwable var2) {
            try {
                return (class216) Class.forName("fk").newInstance();
            } catch (Throwable var1) {
                return new class410();
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)V")
    public static void method1936(byte arg0) {
        int var1 = -121 % ((arg0 - 25) / 55);
        field4539 = null;
    }
}
