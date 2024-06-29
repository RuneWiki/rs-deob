import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class103 extends class292 {

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[I")
    private int[] field1635;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "[I")
    private int[] field1642;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lvg;")
    private class74 field1646;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "Lvg;")
    private class74 field1639;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lvg;")
    private class74 field1648;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "[Lvg;")
    private class74[] field1649;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZZ)I")
    public static final int method783(boolean arg0, boolean arg1) {
        if (!arg1) {
            return -54;
        }
        field1647++;
        long var2 = class269.method1823(-20);
        for (class6 var4 = arg0 ? (class6) class289.field4545.method1410(-102) : (class6) class289.field4545.method1413(-1); var4 != null; var4 = (class6) class289.field4545.method1413(-1)) {
            if ((var4.field106 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field106 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1408;
                    class30.field482[var5] = class289.field4560[var5];
                    var4.method693(-87);
                    return var5;
                }
                var4.method693(-24);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Z")
    public static final boolean method784(int arg0, int arg1) {
        field1641++;
        if (class142.field2184[arg1]) {
            return true;
        } else if (class143.field2217.method1151(arg1, 106)) {
            int var2 = class143.field2217.method1165(3, arg1);
            if (~var2 == arg0) {
                class142.field2184[arg1] = true;
                return true;
            }
            if (class261.field4006[arg1] == null) {
                class261.field4006[arg1] = new class188[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class261.field4006[arg1][var3] == null) {
                    byte[] var4 = class143.field2217.method1163(arg1, var3, 48);
                    if (var4 != null) {
                        class188 var5 = class261.field4006[arg1][var3] = new class188();
                        var5.field2977 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1276(new class37(var4), (byte) -78);
                        } else {
                            var5.method1268(new class37(var4), arg0 + 1);
                        }
                    }
                }
            }
            class142.field2184[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILmj;ILuf;ZDI)Lqk;")
    public final class213 method785(int arg0, class114 arg1, int arg2, class176 arg3, boolean arg4, double arg5, int arg6) {
        class172.method1137(true, arg5);
        field1634++;
        class242.field3741 = arg1;
        class245.field3798 = arg3;
        class78.method621(-72, arg0, arg6);
        class213 var9 = new class213(arg6, arg0);
        for (int var10 = 0; var10 < this.field1649.length; var10++) {
            this.field1649[var10].method587((byte) -102, arg6, arg0);
        }
        int var11 = 0;
        for (int var12 = arg2; var12 < arg0; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1639.field1245) {
                int[] var14 = this.field1639.method448(arg2 ^ 0x4, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1639.method82(var12, (byte) -116);
                var15 = var18[0];
                var16 = var18[1];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field1648.field1245) {
                var19 = this.field1648.method448(4, var12);
            } else {
                var19 = this.field1648.method82(var12, (byte) -115)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class48.field785[var22];
                int var24 = class48.field785[var21];
                int var25 = var17[var20] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class48.field785[var25];
                int var27;
                if (var24 == 0 && var23 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field795[var11++] = (var27 << 24) + (var23 << 8) + (var24 << 16) + var26;
                if (arg4) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1649.length; var13++) {
            this.field1649[var13].method91(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([ILcd;[II[I)V")
    public static final void method786(int[] arg0, class28 arg1, int[] arg2, int arg3, int[] arg4) {
        for (int var5 = arg3; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field4215.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4215[var9] = null;
                    } else {
                        class223 var10 = class28.method224(var6, arg3 + 119);
                        int var11 = var10.field3509;
                        class85 var12 = arg1.field4215[var9];
                        if (var12 != null) {
                            if (var12.field1398 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4215[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1395 = 0;
                                    var12.field1400 = 1;
                                    var12.field1402 = 0;
                                    var12.field1401 = var8;
                                    var12.field1392 = 0;
                                    class56.method452((byte) -39, 0, arg1.field4176, var10, class261.field4058 == arg1, arg1.field4123);
                                } else if (var11 == 2) {
                                    var12.field1395 = 0;
                                }
                            } else if (var10.field3481 >= class28.method224(var12.field1398, 127).field3481) {
                                var12 = arg1.field4215[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class85 var13 = arg1.field4215[var9] = new class85();
                            var13.field1392 = 0;
                            var13.field1401 = var8;
                            var13.field1402 = 0;
                            var13.field1400 = 1;
                            var13.field1395 = 0;
                            var13.field1398 = var6;
                            class56.method452((byte) 111, 0, arg1.field4176, var10, class261.field4058 == arg1, arg1.field4123);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field1636++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static final void method787(boolean arg0) {
        field1638++;
        if (class258.field3955 != null) {
            class132 var1 = class258.field3955;
            synchronized (class258.field3955) {
                class258.field3955 = null;
            }
        }
        if (arg0) {
            method786((int[]) null, (class28) null, (int[]) null, 24, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIBLuf;ZILmj;D)[I")
    public final int[] method788(boolean arg0, int arg1, byte arg2, class176 arg3, boolean arg4, int arg5, class114 arg6, double arg7) {
        class172.method1137(true, arg7);
        class242.field3741 = arg6;
        field1644++;
        class245.field3798 = arg3;
        class78.method621(99, arg1, arg5);
        for (int var10 = 0; var10 < this.field1649.length; var10++) {
            this.field1649[var10].method587((byte) -102, arg5, arg1);
        }
        if (arg2 < 27) {
            return null;
        }
        int[] var11 = new int[arg1 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg5;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1639.field1245) {
                int[] var18 = this.field1639.method448(4, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1639.method82(var16, (byte) -127);
                var19 = var22[2];
                var21 = var22[0];
                var20 = var22[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                int var27 = class48.field785[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                int var28 = class48.field785[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class48.field785[var26];
                var11[var15++] = (var28 << 16) + (var27 << 8) + var29;
                if (arg0) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1649.length; var17++) {
            this.field1649[var17].method91(0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static final void method789(byte arg0) {
        if (arg0 != -1) {
            field1637 = -52;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class98.field1567[var1] = false;
        }
        class189.field3014 = 0;
        field1645++;
        class126.field1981 = -1;
        class1.field14 = -1;
        class6.field111 = 1;
        class123.field1895 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Luf;DLmj;IZII)La;")
    public final class49 method790(class176 arg0, double arg1, class114 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class172.method1137(true, arg1);
        class245.field3798 = arg0;
        class242.field3741 = arg2;
        field1643++;
        class78.method621(arg6 + 3, arg3, arg5);
        class49 var9 = new class49(arg5, arg3);
        for (int var10 = 0; var10 < this.field1649.length; var10++) {
            this.field1649[var10].method587((byte) -102, arg5, arg3);
        }
        int var11 = arg6;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg4) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1639.field1245) {
                int[] var18 = this.field1639.method448(4, var12);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field1639.method82(var12, (byte) -114);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            for (int var19 = 0; var19 != arg5; var19++) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var19] >> 4;
                int var23 = class48.field785[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var24 = class48.field785[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class48.field785[var22];
                var9.field795[var11++] = (var23 << 8) + (var24 << 16) + var25;
                if (arg4) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1649.length; var13++) {
            this.field1649[var13].method91(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILuf;Lmj;)Z")
    public final boolean method791(int arg0, class176 arg1, class114 arg2) {
        field1640++;
        if (class6.field112 <= 0) {
            for (int var4 = 0; var4 < this.field1642.length; var4++) {
                if (!arg1.method1147(this.field1642[var4], -82)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1642.length; var5++) {
                if (!arg1.method1175(this.field1642[var5], class6.field112, (byte) -35)) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field1635.length; var6++) {
            if (!arg2.method497(0, this.field1635[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class103() {
        this.field1635 = new int[0];
        this.field1642 = new int[0];
        this.field1646 = new class55(0);
        this.field1646.field1237 = 1;
        this.field1639 = new class55();
        this.field1639.field1237 = 1;
        this.field1648 = new class55();
        this.field1648.field1237 = 1;
        this.field1649 = new class74[] { this.field1639, this.field1648, this.field1646 };
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lf;)V")
    public class103(class37 arg0) {
        int var2 = arg0.method333((byte) -59);
        int var3 = 0;
        this.field1649 = new class74[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class74 var16 = class140.method970(arg0, (byte) -120);
            if (var16.method87(128) >= 0) {
                var4++;
            }
            if (var16.method588((byte) 115) >= 0) {
                var3++;
            }
            int var17 = var16.field1239.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method333((byte) -59);
            }
            this.field1649[var6] = var16;
        }
        this.field1642 = new int[var4];
        int var7 = 0;
        this.field1635 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class74 var11 = this.field1649[var9];
            int var12 = var11.field1239.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1239[var13] = this.field1649[var5[var9][var13]];
            }
            int var14 = var11.method87(128);
            int var15 = var11.method588((byte) 115);
            if (var14 > 0) {
                this.field1642[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1635[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1639 = this.field1649[arg0.method333((byte) -59)];
        Object var10 = null;
        this.field1648 = this.field1649[arg0.method333((byte) -59)];
        this.field1646 = this.field1649[arg0.method333((byte) -59)];
    }
}
