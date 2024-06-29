import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class258 extends class224 {

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    private int field4169 = 4096;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "[I")
    public static int[] field4166 = new int[2500];

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4164 = "Loaded sprites";

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field4166 = null;
        if (arg0 != 26141) {
            method1773((class56) null, 1);
        }
        field4164 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)V")
    public static final void method1770(long arg0, int arg1) {
        if (arg1 != 31471) {
            method1770(-90L, 1);
        }
        class13.field165.field349 = 0;
        class13.field165.method184(21, arg1 + -31362);
        ++field4165;
        class13.field165.method206(arg1 + -36532, arg0);
        class173.field2723 = -3;
        class216.field3537 = 0;
        class181.field2806 = 1;
        class44.field568 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
    public static final void method1771(int arg0, int arg1) {
        class286.field4530.method1425(arg1, -113);
        class270.field4298.method1425(arg1, -128);
        if (arg0 >= -122) {
            method1773((class56) null, -40);
        }
        ++field4171;
        class209.field3255.method1425(arg1, -119);
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)I")
    public static final int method1772(int arg0) {
        if (arg0 != 1400618188) {
            return -36;
        } else {
            ++field4172;
            return client.field2315.method1422(arg0 ^ 1400616825);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field4170;
        if (~arg1 == -1) {
            this.field4169 = arg0.method190(-3);
        }
        if (arg2 >= -46) {
            field4164 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            field4163 = -9;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(class261.field4217 & arg0 + -1, 0, (byte) 84);
            int[] var5 = this.method1527(arg0, 0, (byte) 84);
            int[] var6 = this.method1527(arg0 + 1 & class261.field4217, 0, (byte) 84);
            for (int var7 = 0; var7 < class78.field1108; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4169;
                int var9 = (var5[class206.field3220 & var7 + 1] + -var5[var7 + -1 & class206.field3220]) * this.field4169;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        ++field4162;
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Li;I)I")
    public static final int method1773(class56 arg0, int arg1) {
        ++field4168;
        class136 var2 = arg0.field793;
        if (var2.field1987 != null) {
            var2 = var2.method928(12);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1976;
        if (arg1 != -17921) {
            return -66;
        } else {
            class85 var4 = arg0.method564(-81);
            if (arg0.field1196 == var4.field1319) {
                var3 = var2.field1970;
            } else if (arg0.field1196 != var4.field1354 && ~arg0.field1196 != ~var4.field1353 && ~arg0.field1196 != ~var4.field1356 && ~arg0.field1196 != ~var4.field1340) {
                if (arg0.field1196 == var4.field1336 || ~arg0.field1196 == ~var4.field1334 || arg0.field1196 == var4.field1323 || arg0.field1196 == var4.field1338) {
                    var3 = var2.field1998;
                }
            } else {
                var3 = var2.field2004;
            }
            return var3;
        }
    }
}
