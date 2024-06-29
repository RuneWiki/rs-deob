import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class278 extends class310 {

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Lsd;")
    public static class138 field4576 = new class138(0, 0);

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4579 = "Allocating memory";

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lwf;")
    public static class250 field4578;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
    public static int[] field4573;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lwf;ZI)V", line = 4)
    public static final void method2057(class250 arg0, boolean arg1, int arg2) {
        field4574++;
        int var3 = arg0.field4211 == 0 ? arg0.field4081 : arg0.field4211;
        if (arg2 > -118) {
            field4579 = (String) null;
        }
        int var4 = arg0.field4201 == 0 ? arg0.field4157 : arg0.field4201;
        class182.method1425(arg1, arg0.field4167, var4, 0, var3, class163.field2587[arg0.field4167 >> 16]);
        if (arg0.field4171 != null) {
            class182.method1425(arg1, arg0.field4167, var4, 0, var3, arg0.field4171);
        }
        class259 var5 = (class259) class226.field3723.method1268(-79, (long) arg0.field4167);
        if (var5 != null) {
            class354.method2507(var5.field4358, var4, var3, (byte) -22, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[[I", line = 33)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2061(-27, 101);
        }
        int[][] var3 = this.field4942.method10((byte) -128, arg0);
        field4581++;
        if (this.field4942.field30) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class261.field4405; var7++) {
                var4[var7] = this.field4577;
                var5[var7] = this.field4570;
                var6[var7] = this.field4571;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)Z", line = 69)
    public static final boolean method2058(int arg0, byte arg1) {
        field4569++;
        if (class78.field1348[arg0]) {
            return true;
        } else if (class258.field4344.method474(-30213, arg0)) {
            int var2 = class258.field4344.method482(27535, arg0);
            if (var2 == 0) {
                class78.field1348[arg0] = true;
                return true;
            }
            if (class163.field2587[arg0] == null) {
                class163.field2587[arg0] = new class250[var2];
            }
            if (arg1 != 4) {
                method2057((class250) null, true, -10);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class163.field2587[arg0][var3] == null) {
                    byte[] var4 = class258.field4344.method472(var3, 43, arg0);
                    if (var4 != null) {
                        class250 var5 = class163.field2587[arg0][var3] = new class250();
                        var5.field4167 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1937(new class227(var4), arg1 ^ 0xFFFFFF9F);
                        } else {
                            var5.method1934(new class227(var4), (byte) 60);
                        }
                    }
                }
            }
            class78.field1348[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)I", line = 130)
    public static final int method2059(int arg0, int arg1) {
        if (arg0 != -12010) {
            method2058(-102, (byte) 31);
        }
        field4580++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 144)
    private class278(int arg0) {
        super(0, false);
        this.method2061(arg0, -65);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 152)
    public class278() {
        this(0);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V", line = 161)
    public static void method2060(boolean arg0) {
        if (!arg0) {
            field4573 = null;
            field4578 = null;
            field4579 = null;
            field4576 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(II)V", line = 177)
    private final void method2061(int arg0, int arg1) {
        this.field4577 = (arg0 & 0xFF0000) >> 12;
        int var3 = -25 % ((3 - arg1) / 46);
        field4575++;
        this.field4570 = arg0 >> 4 & 0xFF0;
        this.field4571 = arg0 & 0xFF << 4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lqm;II)V", line = 199)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 == -2470) {
            if (arg2 == 0) {
                this.method2061(arg0.method1736(arg1 + 2725), arg1 + 2549);
            }
            field4572++;
        }
    }
}
