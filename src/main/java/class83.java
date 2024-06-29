import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class83 {

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Leda;")
    private class14 field1227 = new class14(64);

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "Leda;")
    public class14 field1232 = new class14(50);

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Lus;")
    public class453 field1234 = new class453(250);

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Ldt;")
    private class666 field1235 = new class666();

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
    private boolean field1217;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "Lla;")
    private class422 field1225;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Lla;")
    public class422 field1230;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "Lqia;")
    private class303 field1238;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field1236;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1237;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field1223 = 0;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "[I")
    public static int[] field1224 = new int[250];

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Lrca;")
    public static class368 field1219;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIZIIII)V", line = 6)
    public static final void method737(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1221++;
        class160.method1197(arg0, (byte) -105);
        int var7 = 0;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        if (arg2) {
            method737(121, 20, true, -5, -70, -127, 92);
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class77.field1131[arg1];
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class608.method3484(var15, arg6 - arg0, -7, arg4, var16);
        class608.method3484(var15, var16, -7, arg5, var17);
        class608.method3484(var15, var17, -7, arg4, arg6 + arg0);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class146.field2293[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class77.field1131[arg1 + var9];
                    int[] var19 = class77.field1131[arg1 - var9];
                    int var20 = class146.field2293[var9];
                    int var21 = arg6 + var7;
                    int var22 = arg6 - var7;
                    int var23 = arg6 + var20;
                    int var24 = arg6 - var20;
                    class608.method3484(var18, var22, -7, arg4, var24);
                    class608.method3484(var18, var24, -7, arg5, var23);
                    class608.method3484(var18, var23, -7, arg4, var21);
                    class608.method3484(var19, var22, -7, arg4, var24);
                    class608.method3484(var19, var24, -7, arg5, var23);
                    class608.method3484(var19, var23, -7, arg4, var21);
                } else {
                    int[] var25 = class77.field1131[arg1 + var9];
                    int[] var26 = class77.field1131[arg1 - var9];
                    int var27 = arg6 + var7;
                    int var28 = arg6 - var7;
                    class608.method3484(var25, var28, -7, arg4, var27);
                    class608.method3484(var26, var28, -7, arg4, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class77.field1131[arg1 + var7];
            int[] var30 = class77.field1131[arg1 - var7];
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (var8 <= var7) {
                class608.method3484(var29, var32, -7, arg4, var31);
                class608.method3484(var30, var32, -7, arg4, var31);
            } else {
                int var33 = var11 >= var7 ? var11 : class146.field2293[var7];
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class608.method3484(var29, var32, -7, arg4, var35);
                class608.method3484(var29, var35, -7, arg5, var34);
                class608.method3484(var29, var34, -7, arg4, var31);
                class608.method3484(var30, var32, -7, arg4, var35);
                class608.method3484(var30, var35, -7, arg5, var34);
                class608.method3484(var30, var34, -7, arg4, var31);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 134)
    public static void method738(byte arg0) {
        field1224 = null;
        if (arg0 != -57) {
            field1219 = null;
        }
        field1219 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 146)
    public final void method739(int arg0) {
        class453 var2 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2774((byte) 89);
        }
        int var3 = 83 % ((55 - arg0) / 63);
        field1220++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V", line = 160)
    public final void method740(int arg0, int arg1) {
        this.field1239 = arg0;
        field1231++;
        class14 var3 = this.field1232;
        synchronized (this.field1232) {
            this.field1232.method76(-89);
        }
        int var4 = -56 % ((arg1 + 67) / 50);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)Loda;", line = 173)
    public final class688 method741(int arg0, int arg1) {
        field1229++;
        class14 var3 = this.field1227;
        class688 var4;
        synchronized (this.field1227) {
            var4 = (class688) this.field1227.method80((byte) -107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field1225;
        byte[] var6;
        synchronized (this.field1225) {
            var6 = this.field1225.method2624(0, class666.method3734((byte) 121, arg1), class334.method2140(arg1, 255));
        }
        class688 var7 = new class688();
        var7.field9742 = arg1;
        var7.field9763 = this;
        var7.field9730 = new String[] { null, null, class641.field9000.method3621(124, this.field1215), null, null };
        var7.field9771 = new String[] { null, null, null, null, class641.field9001.method3621(110, this.field1215) };
        int var8 = 108 / ((arg0 - 51) / 58);
        if (var6 != null) {
            var7.method3841((byte) 115, new class301(var6));
        }
        var7.method3827(-96);
        if (var7.field9750 != -1) {
            var7.method3842(this.method741(-65, var7.field9750), 99, this.method741(-37, var7.field9779));
        }
        if (var7.field9713 != -1) {
            var7.method3845(this.method741(-19, var7.field9713), this.method741(-125, var7.field9780), 0);
        }
        if (!this.field1217 && var7.field9753) {
            var7.field9714 = class641.field8998.method3621(125, this.field1215);
            var7.field9735 = false;
            var7.field9775 = 0;
            var7.field9771 = this.field1237;
            var7.field9701 = null;
            var7.field9730 = this.field1236;
            if (var7.field9767 != null) {
                boolean var9 = false;
                for (class65 var10 = var7.field9767.method3508((byte) -108); var10 != null; var10 = var7.field9767.method3520(-1)) {
                    class193 var11 = this.field1238.method1997((byte) 119, (int) var10.field1039);
                    if (var11.field3335) {
                        var10.method636((byte) 97);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var7.field9767 = null;
                }
            }
        }
        class14 var12 = this.field1227;
        synchronized (this.field1227) {
            this.field1227.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 253)
    public final void method742(byte arg0) {
        class14 var2 = this.field1227;
        synchronized (this.field1227) {
            this.field1227.method76(125);
        }
        field1213++;
        class14 var3 = this.field1232;
        synchronized (this.field1232) {
            this.field1232.method76(-117);
            if (arg0 < 19) {
                this.field1239 = -112;
            }
        }
        class453 var4 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2774((byte) 88);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZZILda;ILha;IIILha;Lnk;I)Lit;", line = 276)
    public final class34 method743(boolean arg0, boolean arg1, int arg2, class400 arg3, int arg4, class544 arg5, int arg6, int arg7, int arg8, class544 arg9, class426 arg10, int arg11) {
        field1216++;
        class34 var13 = this.method744(arg7, (byte) -39, arg8, arg6, arg10, arg11, arg5, arg4);
        if (var13 != null) {
            return var13;
        }
        class688 var14 = this.method741(-125, arg6);
        if (arg11 > 1 && var14.field9760 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field9770[var16] <= arg11 && var14.field9770[var16] != 0) {
                    var15 = var14.field9760[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method741(119, var15);
            }
        }
        int[] var17 = var14.method3828(arg11, arg7, arg9, arg0, arg2 ^ 0xFFFFCEDA, arg10, arg4, arg5, arg3, arg8);
        if (var17 == null) {
            return null;
        }
        class34 var18;
        if (arg1) {
            var18 = arg9.method3185(0, var17, false, 32, 36, 36);
        } else {
            var18 = arg5.method3185(0, var17, false, 32, 36, 36);
        }
        if (arg2 != -12581) {
            this.method743(false, false, -74, null, 31, null, -25, -118, 24, null, null, -96);
        }
        if (!arg1) {
            class666 var19 = new class666();
            var19.field9448 = arg8;
            var19.field9446 = arg7;
            var19.field9458 = arg11;
            var19.field9460 = arg5.field7769;
            var19.field9449 = arg6;
            var19.field9455 = arg10 != null;
            var19.field9454 = arg4;
            this.field1234.method2785(var19, var18, arg2 + 12669);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBIILnk;ILha;I)Lit;", line = 343)
    public final class34 method744(int arg0, byte arg1, int arg2, int arg3, class426 arg4, int arg5, class544 arg6, int arg7) {
        this.field1235.field9449 = arg3;
        this.field1235.field9455 = arg4 != null;
        field1218++;
        this.field1235.field9460 = arg6.field7769;
        this.field1235.field9454 = arg7;
        this.field1235.field9458 = arg5;
        this.field1235.field9446 = arg0;
        int var9 = 81 / ((87 - arg1) / 37);
        this.field1235.field9448 = arg2;
        return (class34) this.field1234.method2779(this.field1235, true);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V", line = 365)
    public final void method745(byte arg0) {
        class14 var2 = this.field1232;
        synchronized (this.field1232) {
            this.field1232.method76(21);
        }
        int var3 = 122 % ((-arg0 - 39) / 41);
        field1222++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V", line = 379)
    public final void method746(int arg0, boolean arg1) {
        field1233++;
        if (this.field1217 == arg1) {
            return;
        }
        this.field1217 = arg1;
        this.method742((byte) 39);
        if (arg0 != 6103) {
            this.method745((byte) 26);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IZ)V", line = 395)
    public final void method747(int arg0, boolean arg1) {
        class14 var3 = this.field1227;
        synchronized (this.field1227) {
            this.field1227.method68(-16878, arg0);
        }
        if (arg1) {
            this.method746(26, true);
        }
        field1214++;
        class14 var4 = this.field1232;
        synchronized (this.field1232) {
            this.field1232.method68(-16878, arg0);
        }
        class453 var5 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2783(arg0, true);
        }
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V", line = 414)
    public final void method748(byte arg0) {
        field1226++;
        class14 var2 = this.field1227;
        synchronized (this.field1227) {
            this.field1227.method71((byte) 44);
        }
        if (arg0 != -95) {
            return;
        }
        class14 var3 = this.field1232;
        synchronized (this.field1232) {
            this.field1232.method71((byte) 44);
        }
        class453 var4 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2773((byte) -84);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lcr;IZLqia;Lla;Lla;)V", line = 454)
    public class83(class292 arg0, int arg1, boolean arg2, class303 arg3, class422 arg4, class422 arg5) {
        this.field1215 = arg1;
        this.field1217 = arg2;
        this.field1225 = arg4;
        this.field1230 = arg5;
        this.field1238 = arg3;
        if (this.field1225 == null) {
            this.field1228 = 0;
        } else {
            int var7 = this.field1225.method2628(-119) - 1;
            this.field1228 = this.field1225.method2615(0, var7) + var7 * 256;
        }
        this.field1236 = new String[] { null, null, class641.field9000.method3621(102, this.field1215), null, null };
        this.field1237 = new String[] { null, null, null, null, class641.field9001.method3621(116, this.field1215) };
    }
}
