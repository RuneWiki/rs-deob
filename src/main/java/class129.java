import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class129 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
    public boolean field1456 = true;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    private int field1450 = -1;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lvj;")
    private class422 field1452;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lhaa;")
    private class80 field1459;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lg;")
    private class555 field1455;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lcn;")
    private class21 field1445;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lgj;")
    private class97 field1457;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILcn;)V")
    private final void method729(int arg0, int arg1, class21 arg2) {
        field1444++;
        if (arg0 <= 27) {
            method735(-82, null, null);
        }
        if (arg1 != 0) {
            this.method730(86);
            this.field1452.method2396((byte) 36, this.field1455);
            this.field1452.method2403(arg2, 0, arg1, 4, 123);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    private final void method730(int arg0) {
        field1443++;
        if (!this.field1456) {
            return;
        }
        this.field1456 = false;
        byte[] var2 = this.field1459.field814;
        byte[] var3 = this.field1452.field5973;
        int var4 = 0;
        int var5 = this.field1459.field812;
        int var6 = this.field1458 + (this.field1459.field812 * this.field1460);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1455 != null && this.field1450 == var4) {
            this.field1456 = false;
            return;
        }
        this.field1450 = var4;
        int var8 = -72 % ((arg0 + 46) / 58);
        int var9 = 0;
        int var10 = this.field1458 + (this.field1460 * var5);
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
                    if (var2[var10 + var5] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field1459.field812 - 128;
        }
        if (this.field1455 == null) {
            this.field1455 = new class555(this.field1452, 3553, 6406, 128, 128, false, this.field1452.field5973, 6406, false);
            this.field1455.method3148(10243, false, false);
            this.field1455.method1839(true, (byte) 48);
        } else {
            this.field1455.method3149(false, 0, 0, 128, 128, this.field1452.field5973, 0, 4, 0, 6406);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BIB)V")
    public final void method731(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != -57) {
            this.method729(-27, -101, null);
        }
        field1442++;
        this.field1457.method97(arg1, arg0 * this.field1452.method2427(arg2, (byte) 82), arg2, 123);
        this.method729(39, arg0, this.field1457);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method732(int arg0) {
        this.method729(78, this.field1449, this.field1445);
        field1451++;
        if (arg0 != -1) {
            this.field1456 = false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILqq;I)V")
    public static final void method733(int arg0, int arg1, int arg2, class653 arg3, int arg4) {
        arg3.field9158.method660((byte) 51, arg0);
        if (arg4 != 12354) {
            method735(-25, null, null);
        }
        field1446++;
        arg3.field9158.method621(true, arg1);
        arg3.field9158.method621(true, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method734(int arg0, int arg1) {
        class19 var2 = class593.field8375;
        synchronized (class593.field8375) {
            class593.field8375.method83((byte) -2, arg1);
        }
        if (arg0 == 1846) {
            field1454++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lvj;Lhaa;Lmea;IIIII)V")
    public class129(class422 arg0, class80 arg1, class72 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1452 = arg0;
        this.field1460 = arg7;
        this.field1459 = arg1;
        this.field1458 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3428 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field707[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1449 = var10;
        if (var10 <= 0) {
            this.field1455 = null;
        } else {
            class115 var14 = new class115(var10 * 2);
            if (this.field1452.field5874) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3428 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field707[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method645(-672168216, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3428 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field707[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method667(13224, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field1445 = this.field1452.method2398(var14.field1218, false, var14.field1269, 5123, true);
            this.field1457 = new class97(this.field1452, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILr;Lwp;)V")
    public static final void method735(int arg0, class564 arg1, class452 arg2) {
        field1447++;
        boolean var3 = class19.field153.method271(arg2.field6449 | 0xFF000000, arg1, arg2.field6394, arg2.field6358, arg2.field6434, false, arg2.field6382 ? class362.field4859.field2897 : null, arg2.field6401) == null;
        if (var3) {
            class141.field1554.method3425(new class362(arg2.field6434, arg2.field6358, arg2.field6394, arg2.field6449 | 0xFF000000, arg2.field6401, arg2.field6382), false);
            class130.method741(arg2, 26034);
        }
        if (arg0 >= -67) {
            field1448 = -13;
        }
    }
}
