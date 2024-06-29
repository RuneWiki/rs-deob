import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class130 extends class424 {

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!ss", name = "U", descriptor = "I")
    private int field1962 = 4096;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ss", name = "R", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ss", name = "S", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ss", name = "T", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ss", name = "V", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "Lve;")
    public static class309 field1957;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBII)I")
    public static final int method973(int arg0, byte arg1, int arg2, int arg3) {
        ++field1960;
        if ((8 & class302.field4122[arg0][arg2][arg3]) != 0) {
            return 0;
        } else {
            if (arg1 > -73) {
                method974(false, (class316) null);
            }
            return ~arg0 < -1 && (2 & class302.field4122[1][arg2][arg3]) != 0 ? arg0 + -1 : arg0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 == -48) {
            ++field1959;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field5893 = arg0.method2306((byte) 107) == 1;
                    }
                } else {
                    this.field1962 = arg0.method2297(arg1 ^ -13320);
                }
            } else {
                this.field1956 = arg0.method2297(13352);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field1954;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class303.field4135; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field1956 > var12) {
                    var8[var11] = this.field1956;
                } else if (~this.field1962 > ~var12) {
                    var8[var11] = this.field1962;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 > ~this.field1956) {
                    var9[var11] = this.field1956;
                } else if (~this.field1962 > ~var13) {
                    var9[var11] = this.field1962;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 > ~this.field1956) {
                    var10[var11] = this.field1956;
                } else if (~this.field1962 > ~var14) {
                    var10[var11] = this.field1962;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLij;)V")
    public static final void method974(boolean arg0, class316 arg1) {
        if (!arg0) {
            field1957 = null;
        }
        ++field1955;
        class80.field1118 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)V")
    public static void method975(int arg0) {
        if (arg0 != 0) {
            field1957 = null;
        }
        field1957 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            this.method21(98, true);
        }
        ++field1961;
        int[] var3 = super.field5892.method783(arg0, (byte) -86);
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -116, arg0);
            for (int var5 = 0; ~class303.field4135 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field1956 > var6) {
                    var3[var5] = this.field1956;
                } else if (~this.field1962 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1962;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(III)V")
    public static final void method976(int arg0, int arg1, int arg2) {
        class72.field1047 = new class408(arg1);
        ++field1963;
        class442.field6208 = new class408(arg0);
        int var3 = -7 % ((arg2 - 1) / 53);
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lne;I)[Lip;")
    public static final class49[] method977(class76 arg0, int arg1) {
        ++field1953;
        if (!arg0.method606(-34)) {
            return new class49[0];
        } else {
            class285 var2 = arg0.method596(5);
            while (~var2.field3875 == -1) {
                class328.method1999(0, 10L);
            }
            if (~var2.field3875 == -3) {
                return new class49[0];
            } else if (arg1 != -328264830) {
                return null;
            } else {
                int[] var3 = (int[]) var2.field3871;
                class49[] var4 = new class49[var3.length >> 2];
                for (int var5 = 0; var4.length > var5; ++var5) {
                    class49 var6 = new class49();
                    var4[var5] = var6;
                    var6.field620 = var3[var5 << 2];
                    var6.field626 = var3[(var5 << 2) + 1];
                    var6.field623 = var3[(var5 << 2) + 2];
                    var6.field625 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        class311.field4224 = null;
        ++field1958;
        class61.method498(0, class373.field5174, class350.field4712, 0, -1, arg0 ^ 10328, 0, class396.field5493, 0);
        if (class311.field4224 != null) {
            class133.method993(class373.field5174, class22.field286.field1556, 0, class204.field2894, -1412584499, class379.field5236, 0, arg0 + 105, class311.field4224, class396.field5493);
            class311.field4224 = null;
        }
        if (arg0 != -105) {
            field1957 = null;
        }
    }
}
