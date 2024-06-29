import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class348 {

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Z")
    public boolean field5008 = true;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    private int field5013 = -1;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Lod;")
    private class349 field5005;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    private int field5006;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Lgf;")
    private class180 field5010;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    private int field5001;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Lah;")
    private class260 field5004;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Lap;")
    private class332 field5012;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Ltj;")
    private class131 field5017;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Lqa;")
    public static class162 field5015;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method2113(byte arg0) {
        if (arg0 != -49) {
            this.field5001 = 53;
        }
        field5002++;
        this.method2114((byte) 127, this.field5012, this.field5001);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLap;I)V")
    private final void method2114(byte arg0, class332 arg1, int arg2) {
        field5011++;
        if (arg2 != 0) {
            this.method2116((byte) -107);
            int var4 = 100 % ((54 - arg0) / 61);
            this.field5005.method2200(this.field5004, (byte) 127);
            this.field5005.method2136(arg2, 4, 0, arg1, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
    public static final void method2115(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7559 != null) {
            var3.field7559 = null;
        }
        if (var3.field7570 != null) {
            var3.field7570 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
    private final void method2116(byte arg0) {
        field5009++;
        if (!this.field5008) {
            return;
        }
        this.field5008 = false;
        byte[] var2 = this.field5010.field2649;
        byte[] var3 = class419.field6298;
        int var4 = 0;
        int var5 = this.field5010.field2651;
        int var6 = this.field5006 + (this.field5010.field2651 * this.field5003);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5004 != null && this.field5013 == var4) {
            this.field5008 = false;
            return;
        }
        this.field5013 = var4;
        int var8 = 0;
        int var9 = this.field5003 * var5 + this.field5006;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field5010.field2651 - 128;
        }
        if (this.field5004 == null) {
            this.field5004 = new class260(this.field5005, 3553, 6406, 128, 128, false, class419.field6298, 6406, false);
            this.field5004.method1730(false, 10497, false);
            this.field5004.method2683(true, 0);
        } else {
            this.field5004.method1723(0, class419.field6298, 128, 128, 6406, (byte) -123, 0, 0, 0, false);
        }
        if (arg0 != -107) {
            this.field5006 = 58;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ[BI)V")
    public final void method2117(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field5016++;
        this.field5017.method883((byte) -80, this.field5005.method2141(arg0, 2) * arg3, arg2, arg0);
        if (!arg1) {
            this.field5003 = 94;
        }
        this.method2114((byte) -16, this.field5017, arg3);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method2118(int arg0) {
        field5015 = null;
        if (arg0 != -11038) {
            field5014 = 2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lod;Lgf;Lon;IIIII)V")
    public class348(class349 arg0, class180 arg1, class220 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5005 = arg0;
        this.field5003 = arg7;
        this.field5006 = arg6;
        this.field5010 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field370 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3251[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field5001 = var10;
        if (var10 <= 0) {
            this.field5004 = null;
        } else {
            class209 var14 = new class209(var10 * 2);
            if (this.field5005.field5313) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field370 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3251[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1413(-116, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field370 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3251[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1453((byte) -102, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field5012 = this.field5005.method2127(var14.field3037, 5123, false, var14.field3036, 87360);
            this.field5017 = new class131(this.field5005, 5123, null, 1);
        }
    }
}
