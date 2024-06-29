import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class15 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    private int field163 = 0;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field169 = -1;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
    public boolean field167 = false;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    private int field168 = 128;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field183 = 128;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    private int field175 = 0;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Z")
    public boolean field181 = false;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field165 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
    private short[] field171;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
    public static short[] field173;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[S")
    private short[] field184;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
    private short[] field185;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[S")
    private short[] field186;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "[[Z")
    public static boolean[][] field170;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 4)
    public static final boolean method107(int arg0, String arg1) {
        field172++;
        if (arg1 == null) {
            return false;
        }
        int var2 = -110 % ((21 - arg0) / 36);
        for (int var3 = 0; var3 < class45.field559; var3++) {
            if (arg1.equalsIgnoreCase(class65.field814[var3])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class359.field5616.field3475)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 33)
    public static final void method108(byte arg0) {
        if (arg0 <= 96) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class214.field3024[var1] = false;
        }
        class160.field2270 = -1;
        class270.field3881 = 0;
        class264.field3840 = 0;
        class297.field4315 = -1;
        client.field1631 = 1;
        field177++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILfd;)V", line = 59)
    private final void method109(int arg0, int arg1, class299 arg2) {
        if (arg1 < 102) {
            method112(-113);
        }
        if (arg0 == 1) {
            this.field174 = arg2.method2083((byte) -120);
        } else if (arg0 == 2) {
            this.field169 = arg2.method2083((byte) -118);
        } else if (arg0 == 4) {
            this.field168 = arg2.method2083((byte) -51);
        } else if (arg0 == 5) {
            this.field183 = arg2.method2083((byte) -23);
        } else if (arg0 == 6) {
            this.field175 = arg2.method2083((byte) -106);
        } else if (arg0 == 7) {
            this.field163 = arg2.method2096((byte) -122);
        } else if (arg0 == 8) {
            this.field166 = arg2.method2096((byte) -122);
        } else if (arg0 == 9) {
            this.field167 = true;
        } else if (arg0 == 10) {
            this.field181 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method2096((byte) -122);
            this.field171 = new short[var4];
            this.field186 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field186[var5] = (short) arg2.method2083((byte) -114);
                this.field171[var5] = (short) arg2.method2083((byte) -16);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method2096((byte) -122);
            this.field184 = new short[var6];
            this.field185 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field184[var7] = (short) arg2.method2083((byte) -19);
                this.field185[var7] = (short) arg2.method2083((byte) -113);
            }
        }
        field178++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 159)
    public static void method110(int arg0) {
        field165 = null;
        field173 = null;
        if (arg0 == 0) {
            field170 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([II)[I", line = 189)
    public static final int[] method111(int[] arg0, int arg1) {
        field179++;
        if (arg0 == null) {
            return null;
        } else if (arg1 > -102) {
            return (int[]) null;
        } else {
            int[] var2 = new int[arg0.length];
            class87.method629(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 210)
    public static final void method112(int arg0) {
        field180++;
        if (!class47.field623) {
            return;
        }
        if (arg0 < 114) {
            field170 = (boolean[][]) ((boolean[][]) null);
        }
        if (class171.field2372) {
            return;
        }
        class119[][][] var1 = class345.field5367;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class119[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class119 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1577 != null && var6.field1577.field269 instanceof class128) {
                            class128 var7 = (class128) var6.field1577.field269;
                            if ((Long.MIN_VALUE & var6.field1577.field267) == 0L) {
                                var7.method973(false, true, true, true, false, true, true);
                            } else {
                                var7.method973(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field1566 != null) {
                            if (var6.field1566.field848 instanceof class128) {
                                class128 var8 = (class128) var6.field1566.field848;
                                if ((var6.field1566.field851 & Long.MIN_VALUE) == 0L) {
                                    var8.method973(false, true, true, true, false, true, true);
                                } else {
                                    var8.method973(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1566.field845 instanceof class128) {
                                class128 var9 = (class128) var6.field1566.field845;
                                if ((Long.MIN_VALUE & var6.field1566.field851) == 0L) {
                                    var9.method973(false, true, true, true, false, true, true);
                                } else {
                                    var9.method973(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field1552 != null) {
                            if (var6.field1552.field3309 instanceof class128) {
                                class128 var10 = (class128) var6.field1552.field3309;
                                if ((Long.MIN_VALUE & var6.field1552.field3302) == 0L) {
                                    var10.method973(false, true, true, true, false, true, true);
                                } else {
                                    var10.method973(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1552.field3305 instanceof class128) {
                                class128 var11 = (class128) var6.field1552.field3305;
                                if ((var6.field1552.field3302 & Long.MIN_VALUE) == 0L) {
                                    var11.method973(false, true, true, true, false, true, true);
                                } else {
                                    var11.method973(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field1563; var12++) {
                            if (var6.field1549[var12].field4275 instanceof class128) {
                                class128 var13 = (class128) var6.field1549[var12].field4275;
                                if ((Long.MIN_VALUE & var6.field1549[var12].field4289) == 0L) {
                                    var13.method973(false, true, true, true, false, true, true);
                                } else {
                                    var13.method973(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class171.field2372 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lfd;Z)V", line = 355)
    public final void method113(class299 arg0, boolean arg1) {
        field187++;
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                if (arg1) {
                    this.field166 = 122;
                }
                return;
            }
            this.method109(var3, 114, arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIB)Lvg;", line = 377)
    public final class81 method114(int arg0, int arg1, int arg2, byte arg3) {
        class81 var5 = (class81) class231.field3307.method2265((long) this.field176, (byte) -97);
        field182++;
        if (var5 == null) {
            class197 var6 = class197.method1430(class82.field1054, this.field174, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field186 != null) {
                for (int var7 = 0; var7 < this.field186.length; var7++) {
                    var6.method1446(this.field186[var7], this.field171[var7]);
                }
            }
            if (this.field184 != null) {
                for (int var8 = 0; var8 < this.field184.length; var8++) {
                    var6.method1431(this.field184[var8], this.field185[var8]);
                }
            }
            var5 = var6.method1439(this.field163 + 64, this.field166 + 850, -30, -50, -30);
            class231.field3307.method2257(-127, var5, (long) this.field176);
        }
        class81 var9;
        if (this.field169 == -1 || arg2 == -1) {
            var9 = var5.method595(true, true, true);
        } else {
            var9 = class207.method1516(this.field169, arg3 ^ 0x72).method2174(98, arg2, arg1, var5, arg0);
        }
        if (this.field168 != 128 || this.field183 != 128) {
            var9.method581(this.field168, this.field183, this.field168);
        }
        if (this.field175 != 0) {
            if (this.field175 == 90) {
                var9.method577();
            }
            if (this.field175 == 180) {
                var9.method587();
            }
            if (this.field175 == 270) {
                var9.method586();
            }
        }
        if (arg3 != 14) {
            method111((int[]) null, -17);
        }
        return var9;
    }
}
