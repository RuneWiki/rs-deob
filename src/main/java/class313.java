import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class313 extends class390 implements Runnable {

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    private boolean field4176 = true;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field4178 = -1;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lmb;")
    private class174 field4174;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 5)
    public final void method1860(byte arg0) {
        this.field4176 = false;
        int var2 = 94 / ((48 - arg0) / 62);
        field4177++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lir;BZ)V", line = 15)
    public static final void method1861(class22 arg0, byte arg1, boolean arg2) {
        field4175++;
        if (arg1 != 110) {
            method1863((byte) 78, null);
        }
        if (class391.field5656 >= 400) {
            return;
        }
        class212 var3 = arg0.field220;
        if (var3.field2903 != null) {
            var3 = var3.method1350(class52.field606, arg1 ^ 0xFFFFFF91);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field2847) {
            return;
        }
        String var4 = var3.field2856;
        if (var3.field2886 != 0) {
            String var5 = class381.field5520 == class373.field5065 ? class328.field4357.method1823(class374.field5072, (byte) -88) : class80.field979.method1823(class374.field5072, (byte) -88);
            var4 = var4 + class460.method2830(var3.field2886, -10, class96.field1170.field7793) + " (" + var5 + var3.field2886 + ")";
        }
        if (!class323.field4302) {
            if (!arg2) {
                String[] var6 = var3.field2857;
                if (class280.field3709) {
                    var6 = class10.method67(var6, (byte) 52);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field2839 == 0 || !var6[var7].equalsIgnoreCase(class167.field2158.method1823(class374.field5072, (byte) -88)))) {
                            byte var8 = 0;
                            int var9 = class105.field1416;
                            if (var7 == 0) {
                                var8 = 21;
                            }
                            if (var7 == 1) {
                                var8 = 60;
                            }
                            if (var7 == 2) {
                                var8 = 51;
                            }
                            if (var7 == 3) {
                                var8 = 2;
                            }
                            if (var7 == 4) {
                                var8 = 22;
                            }
                            if (var3.field2877 == var7) {
                                var9 = var3.field2837;
                            }
                            if (var3.field2880 == var7) {
                                var9 = var3.field2851;
                            }
                            class144.method878(-1, 0, var8, var6[var7], "<col=ffff00>" + var4, 0, var9, (long) arg0.field1211, true, false, (byte) -113);
                            class297.field3912++;
                        }
                    }
                }
                if (var3.field2839 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class167.field2158.method1823(class374.field5072, (byte) -88))) {
                            short var11 = 0;
                            if (var3.field2886 > class96.field1170.field7793) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 21;
                            }
                            if (var10 == 1) {
                                var12 = 60;
                            }
                            if (var10 == 2) {
                                var12 = 51;
                            }
                            if (var10 == 3) {
                                var12 = 2;
                            }
                            if (var10 == 4) {
                                var12 = 22;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class144.method878(-1, 0, var12, var6[var10], "<col=ffff00>" + var4, 0, var3.field2899, (long) arg0.field1211, true, false, (byte) -71);
                            class146.field1932++;
                        }
                    }
                }
            }
            class144.method878(-1, 0, 1006, class451.field6722.method1823(class374.field5072, (byte) -88), "<col=ffff00>" + var4, 0, class300.field3942, (long) arg0.field1211, true, arg2, (byte) -84);
            class366.field4991++;
        } else if (!arg2) {
            class87 var13 = class324.field4307 == -1 ? null : class104.field1405.method449((byte) -125, class324.field4307);
            if ((class41.field448 & 0x2) != 0) {
                if (var13 == null || var3.method1354((byte) 49, var13.field1031, class324.field4307) != var13.field1031) {
                    class178.field2305++;
                    class144.method878(-1, 0, 11, class48.field531, class191.field2465 + " -> <col=ffff00>" + var4, 0, class207.field2724, (long) arg0.field1211, true, false, (byte) -86);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 180)
    public final void method1862(int arg0) {
        field4173++;
        int var2 = 109 % ((-arg0 - 59) / 51);
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 193)
    public static final boolean method1863(byte arg0, String arg1) {
        field4172++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class327.field4351; var2++) {
            if (arg1.equalsIgnoreCase(class428.field6226[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class130.field1677[var2])) {
                return true;
            }
        }
        if (arg0 != -9) {
            method1863((byte) 90, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "run", descriptor = "()V", line = 224)
    public final void run() {
        field4179++;
        while (this.field4176) {
            this.field4174.method1019(5002, this);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lmb;)V", line = 243)
    public class313(class174 arg0) {
        this.field4174 = arg0;
    }
}
