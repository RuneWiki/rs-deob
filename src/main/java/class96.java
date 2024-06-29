import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 {

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "Z")
    public boolean field1230 = true;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    private int field1239 = -1;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "Lkv;")
    private class280 field1246;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "Lat;")
    private class395 field1234;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "Lho;")
    private class158 field1235;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "Lmda;")
    private class274 field1233;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "Lvv;")
    private class341 field1247;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "[I")
    public static int[] field1236;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 7)
    public final void method673(int arg0) {
        field1231++;
        this.method675(-115, this.field1233, this.field1238);
        if (arg0 != 21920) {
            method674((byte) -77);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 21)
    public static final void method674(byte arg0) {
        field1237++;
        int var1 = 74 / ((arg0 - 35) / 40);
        class757.field10447.method2364(1);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILmda;I)V", line = 33)
    private final void method675(int arg0, class274 arg1, int arg2) {
        field1244++;
        if (arg2 == 0) {
            return;
        }
        if (arg0 > -89) {
            field1236 = null;
        }
        this.method678(-78);
        this.field1246.method1840(this.field1235, 2205);
        this.field1246.method1899(arg1, 126, 4, arg2, 0);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I[BIZ)V", line = 49)
    public final void method676(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field1243++;
        this.field1247.method1776((byte) 108, arg2 * this.field1246.method1897(-93, arg0), arg0, arg1);
        this.method675(-122, this.field1247, arg2);
        if (arg3) {
            this.field1238 = 57;
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lkv;Lat;Lwr;IIIII)V", line = 238)
    public class96(class280 arg0, class395 arg1, class480 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1246 = arg0;
        this.field1245 = arg7;
        this.field1234 = arg1;
        this.field1242 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4420 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6825[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1238 = var10;
        if (var10 <= 0) {
            this.field1235 = null;
        } else {
            class120 var14 = new class120(var10 * 2);
            if (this.field1246.field4230) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4420 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6825[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method860(var18[var19] & 0xFFFF, (byte) 118);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4420 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6825[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method868(var23[var24] & 0xFFFF, 849257384);
                            }
                        }
                    }
                }
            }
            this.field1233 = this.field1246.method1838(5123, false, var14.field1556, false, var14.field1521);
            this.field1247 = new class341(this.field1246, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lcb;IB)Lkf;", line = 65)
    public static final class263 method677(class544 arg0, int arg1, byte arg2) {
        if (arg2 != -125) {
            method679(null, 39, -43, true);
        }
        field1241++;
        byte[] var3 = arg0.method3149(arg1, -110);
        return var3 == null ? null : new class263(var3);
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V", line = 89)
    private final void method678(int arg0) {
        field1240++;
        if (!this.field1230) {
            return;
        }
        this.field1230 = false;
        byte[] var2 = this.field1234.field5603;
        byte[] var3 = this.field1246.field4312;
        int var4 = 0;
        int var5 = this.field1234.field5611;
        int var6 = this.field1234.field5611 * this.field1245 + this.field1242;
        int var7 = 4 % ((50 - arg0) / 43);
        for (int var8 = -128; var8 < 0; var8++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1235 != null && this.field1239 == var4) {
            this.field1230 = false;
            return;
        }
        this.field1239 = var4;
        int var9 = this.field1245 * var5 + this.field1242;
        int var10 = 0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field1234.field5611 - 128;
        }
        if (this.field1235 == null) {
            this.field1235 = new class158(this.field1246, 3553, 6406, 128, 128, false, this.field1246.field4312, 6406, false);
            this.field1235.method1252(false, 3314, false);
            this.field1235.method3468(0, true);
        } else {
            this.field1235.method1257((byte) 102, 0, 6406, 0, 0, 128, 0, this.field1246.field4312, 128, false);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lts;IIZ)V", line = 195)
    public static final void method679(class559 arg0, int arg1, int arg2, boolean arg3) {
        field1232++;
        int[] var4 = new int[4];
        if (!arg3) {
            field1236 = null;
        }
        class42.method293(var4, 0, var4.length, arg2);
        class25.method193(var4, arg1, 4891, arg0);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V", line = 212)
    public static final void method680(boolean arg0) {
        if (arg0) {
            class378.field5427 = class262.field3697;
            class622.field8777 = class311.field4628;
        } else {
            class378.field5427 = class358.field5208;
            class622.field8777 = class750.field10395;
        }
        class456.field6545 = class378.field5427.length;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)V", line = 226)
    public static void method681(byte arg0) {
        if (arg0 != 71) {
            method680(true);
        }
        field1236 = null;
    }
}
