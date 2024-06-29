import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class93 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
    public boolean field1395 = true;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    private int field1397 = -1;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lsc;")
    private class193 field1404;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lhj;")
    private class338 field1399;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Loc;")
    private class112 field1402;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lio;")
    private class251 field1403;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Lrq;")
    private class195 field1398;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "[B")
    private static byte[] field1400 = new byte[16384];

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method635(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != -128) {
            this.method638(83, (class112) null, -114);
        }
        this.field1403.method743(arg0, arg3, this.field1399.method2130(arg0) * arg1);
        this.method638(0, this.field1403, arg1);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 17)
    public final void method636(int arg0) {
        if (arg0 != -3013) {
            this.method637(121);
        }
        this.method638(0, this.field1402, this.field1394);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V", line = 27)
    private final void method637(int arg0) {
        if (!this.field1395) {
            return;
        }
        this.field1395 = false;
        byte[] var2 = this.field1404.field2683;
        byte[] var3 = field1400;
        int var4 = arg0;
        int var5 = this.field1404.field2680;
        int var6 = this.field1404.field2680 * this.field1396 + this.field1401;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1398 != null && this.field1397 == var4) {
            this.field1395 = false;
            return;
        }
        this.field1397 = var4;
        int var9 = 0;
        int var10 = this.field1396 * var5 + this.field1401;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field1404.field2680 - 128;
        }
        if (this.field1398 == null) {
            this.field1398 = new class195(this.field1399, 3553, 6406, 128, 128, false, field1400, 6406, false);
            this.field1398.method1295(false, false);
            this.field1398.method915(true);
        } else {
            this.field1398.method1297(0, 0, 128, 128, field1400, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lhj;Lsc;Ldl;IIIII)V", line = 161)
    public class93(class338 arg0, class193 arg1, class39 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1396 = arg7;
        this.field1404 = arg1;
        this.field1399 = arg0;
        this.field1401 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field2207 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field589[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field1394 = var10;
        if (var10 > 0) {
            class371 var17 = new class371(var10 * 2);
            if (this.field1399.field4640) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field2207 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field589[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2416(22064, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field2207 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field589[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2426(-1882601528, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field1402 = this.field1399.method2107(5123, var17.field5258, var17.field5273, false);
            this.field1403 = new class251(this.field1399, 5123, (byte[]) null, 1);
        } else {
            this.field1398 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILoc;I)V", line = 140)
    private final void method638(int arg0, class112 arg1, int arg2) {
        if (arg0 != arg2) {
            this.method637(arg0);
            this.field1399.method2165(this.field1398);
            this.field1399.method2160(arg1, 4, 0, arg2);
        }
    }
}
