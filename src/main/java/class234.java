import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class234 extends class254 {

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
    public static int[] field4166 = new int[2048];

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Lbf;")
    public static class200 field4171 = new class200(0, -1);

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Lcf;")
    private static class93 field4173 = class147.method1066("Take", -48);

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Lcf;")
    private static class93 field4177 = class147.method1066("Feb", -48);

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Lcf;")
    private static class93 field4172 = class147.method1066("Aug", -48);

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Lcf;")
    private static class93 field4184 = class147.method1066("Jan", -48);

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lcf;")
    private static class93 field4174 = class147.method1066("Jun", -48);

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "Lcf;")
    public static class93 field4180 = field4173;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "Lcf;")
    private static class93 field4187 = class147.method1066("Apr", -48);

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "Z")
    public static boolean field4186 = false;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "Lcf;")
    private static class93 field4182 = class147.method1066("Dec", -48);

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "Lcf;")
    private static class93 field4178 = class147.method1066("Nov", -48);

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "Lcf;")
    private static class93 field4181 = class147.method1066("Sep", -48);

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "Lcf;")
    private static class93 field4188 = class147.method1066("Mar", -48);

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "Lcf;")
    private static class93 field4189 = class147.method1066("Jul", -48);

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "Lcf;")
    private static class93 field4185 = class147.method1066("May", -48);

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "Lcf;")
    private static class93 field4190 = class147.method1066("Oct", -48);

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "[Lcf;")
    public static class93[] field4176 = new class93[] { field4184, field4177, field4188, field4187, field4185, field4174, field4189, field4172, field4181, field4190, field4178, field4182 };

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Lvj;")
    public static class115 field4175;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "Ldh;")
    public static class120 field4179;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "Lqi;")
    public static class129 field4165;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Lcf;")
    public class93 field4164;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[I")
    public int[] field4157;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "[I")
    public int[] field4163;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "[I")
    public int[] field4167;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "[I")
    public int[] field4170;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "[[B")
    public static byte[][] field4183;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I")
    public final int method1594(int arg0, int arg1) {
        if (arg1 < 116) {
            return -26;
        }
        field4161++;
        if (this.field4163 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4163.length; var3++) {
            if (this.field4157[var3] == arg0) {
                return this.field4163[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method1595(int arg0) {
        field4185 = null;
        field4188 = null;
        field4173 = null;
        field4187 = null;
        field4190 = null;
        field4166 = null;
        field4174 = null;
        field4171 = null;
        field4180 = null;
        field4181 = null;
        if (arg0 != 2) {
            field4172 = null;
        }
        field4175 = null;
        field4172 = null;
        field4165 = null;
        field4179 = null;
        field4182 = null;
        field4178 = null;
        field4177 = null;
        field4189 = null;
        field4184 = null;
        field4176 = null;
        field4183 = null;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
    public final void method1596(int arg0) {
        if (arg0 != 32768) {
            field4173 = null;
        }
        if (this.field4167 != null) {
            for (int var2 = 0; var2 < this.field4167.length; var2++) {
                this.field4167[var2] = class270.method1797(this.field4167[var2], 32768);
            }
        }
        if (this.field4163 != null) {
            for (int var3 = 0; var3 < this.field4163.length; var3++) {
                this.field4163[var3] = class270.method1797(this.field4163[var3], 32768);
            }
        }
        field4168++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lee;BI)V")
    private final void method1597(class280 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4164 = arg0.method1889((byte) -67);
        } else if (arg2 == 2) {
            int var4 = arg0.method1907(16832);
            this.field4163 = new int[var4];
            this.field4157 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4163[var5] = arg0.method1891(-117);
                this.field4157[var5] = class145.method1046((byte) 25, arg0.method1925(true));
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method1907(16832);
            this.field4167 = new int[var6];
            this.field4170 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4167[var7] = arg0.method1891(-118);
                this.field4170[var7] = class145.method1046((byte) 25, arg0.method1925(true));
            }
        }
        if (arg1 <= 56) {
            method1595(73);
        }
        field4159++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILee;)V")
    public final void method1598(int arg0, class280 arg1) {
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                field4169++;
                int var4 = -67 % ((arg0 - 57) / 58);
                return;
            }
            this.method1597(arg1, (byte) 103, var3);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
    public final int method1599(byte arg0, int arg1) {
        field4158++;
        if (arg0 > -115) {
            field4179 = null;
        }
        if (this.field4167 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4167.length; var3++) {
            if (this.field4170[var3] == arg1) {
                return this.field4167[var3];
            }
        }
        return -1;
    }
}
