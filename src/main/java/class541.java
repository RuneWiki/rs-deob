import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class541 extends class626 {

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Z")
    public boolean field7598 = false;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field7608 = -1;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lqe;")
    public static class465 field7603 = new class465(116, 2);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
    public static int[] field7609 = new int[4096];

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
    public static int[] field7610 = new int[3];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public int field7597;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field7602;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field7605;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field7606;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILrca;)V")
    public static final void method3182(byte arg0, int arg1, class452 arg2) {
        field7600++;
        boolean var3 = arg2.method2686(-9380, 1) == 1;
        int var4 = -48 / ((arg0 - 68) / 56);
        if (var3) {
            class498.field7097[class401.field5603++] = arg1;
        }
        int var5 = arg2.method2686(-9380, 2);
        class349 var6 = class165.field2442[arg1];
        if (var5 == 0) {
            if (var3) {
                var6.field4893 = false;
            } else if (class675.field9486 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class702 var7 = class722.field10086[arg1] = new class702();
                var7.field9855 = (var6.field991[0] + class115.field1845 >> 6 << 14) + (var6.field649 << 28) + (class64.field1160 - -var6.field995[0] >> 6);
                if (var6.field4936 == -1) {
                    var7.field9858 = var6.field888.method2999(16383);
                } else {
                    var7.field9858 = var6.field4936;
                }
                var7.field9852 = var6.field967;
                var7.field9851 = var6.field4926;
                if (var6.field4915 > 0) {
                    class14.method79(var6, 59);
                }
                class165.field2442[arg1] = null;
                if (arg2.method2686(-9380, 1) != 0) {
                    class359.method2238(arg1, -6154, arg2);
                }
            }
        } else if (var5 == 1) {
            int var8 = arg2.method2686(-9380, 3);
            int var9 = var6.field991[0];
            int var10 = var6.field995[0];
            if (var8 == 0) {
                var10--;
                var9--;
            } else if (var8 == 1) {
                var10--;
            } else if (var8 == 2) {
                var10--;
                var9++;
            } else if (var8 == 3) {
                var9--;
            } else if (var8 == 4) {
                var9++;
            } else if (var8 == 5) {
                var10++;
                var9--;
            } else if (var8 == 6) {
                var10++;
            } else if (var8 == 7) {
                var10++;
                var9++;
            }
            if (var3) {
                var6.field4937 = var10;
                var6.field4905 = var9;
                var6.field4893 = true;
            } else {
                var6.method2201(-1, class50.field735[arg1], var9, var10);
            }
        } else if (var5 == 2) {
            int var11 = arg2.method2686(-9380, 4);
            int var12 = var6.field991[0];
            int var13 = var6.field995[0];
            if (var11 == 0) {
                var12 -= 2;
                var13 -= 2;
            } else if (var11 == 1) {
                var12--;
                var13 -= 2;
            } else if (var11 == 2) {
                var13 -= 2;
            } else if (var11 == 3) {
                var12++;
                var13 -= 2;
            } else if (var11 == 4) {
                var12 += 2;
                var13 -= 2;
            } else if (var11 == 5) {
                var13--;
                var12 -= 2;
            } else if (var11 == 6) {
                var12 += 2;
                var13--;
            } else if (var11 == 7) {
                var12 -= 2;
            } else if (var11 == 8) {
                var12 += 2;
            } else if (var11 == 9) {
                var13++;
                var12 -= 2;
            } else if (var11 == 10) {
                var12 += 2;
                var13++;
            } else if (var11 == 11) {
                var13 += 2;
                var12 -= 2;
            } else if (var11 == 12) {
                var13 += 2;
                var12--;
            } else if (var11 == 13) {
                var13 += 2;
            } else if (var11 == 14) {
                var13 += 2;
                var12++;
            } else if (var11 == 15) {
                var13 += 2;
                var12 += 2;
            }
            if (var3) {
                var6.field4905 = var12;
                var6.field4893 = true;
                var6.field4937 = var13;
            } else {
                var6.method2201(-1, class50.field735[arg1], var12, var13);
            }
        } else {
            int var14 = arg2.method2686(-9380, 1);
            if (var14 == 0) {
                int var15 = arg2.method2686(-9380, 12);
                int var16 = var15 >> 10;
                int var17 = var15 >> 5 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var15 & 0x1F;
                if (var18 > 15) {
                    var18 -= 32;
                }
                int var19 = var6.field991[0] + var17;
                int var20 = var6.field995[0] + var18;
                if (var3) {
                    var6.field4893 = true;
                    var6.field4937 = var20;
                    var6.field4905 = var19;
                } else {
                    var6.method2201(-1, class50.field735[arg1], var19, var20);
                }
                var6.field649 = var6.field659 = (byte) (var6.field649 + var16 & 0x3);
                if (class634.method3647(-77, var20, var19)) {
                    var6.field659++;
                }
                if (class675.field9486 == arg1) {
                    if (class312.field4409 != var6.field649) {
                        class70.field1267 = true;
                    }
                    class312.field4409 = var6.field649;
                }
            } else {
                int var21 = arg2.method2686(-9380, 30);
                int var22 = var21 >> 28;
                int var23 = (var21 & 0xFFFC2FA) >> 14;
                int var24 = var21 & 0x3FFF;
                int var25 = (var6.field991[0] + class115.field1845 + var23 & 0x3FFF) - class115.field1845;
                int var26 = (var6.field995[0] + var24 + class64.field1160 & 0x3FFF) - class64.field1160;
                if (var3) {
                    var6.field4905 = var25;
                    var6.field4893 = true;
                    var6.field4937 = var26;
                } else {
                    var6.method2201(-1, class50.field735[arg1], var25, var26);
                }
                var6.field649 = var6.field659 = (byte) (var6.field649 + var22 & 0x3);
                if (class634.method3647(-111, var26, var25)) {
                    var6.field659++;
                }
                if (class675.field9486 == arg1) {
                    class312.field4409 = var6.field649;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lrca;IZ)V")
    public static final void method3183(class452 arg0, int arg1, boolean arg2) {
        class142.field2188 = arg2;
        field7599++;
        class401.field5603 = 0;
        class203.method1419(-1, arg0);
        class246.method1640(0, arg0);
        if (class142.field2188) {
            System.out.println("---endgpp---");
        }
        if (arg0.field469 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field469 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method3184(boolean arg0) {
        if (arg0) {
            method3184(false);
        }
        field7610 = null;
        field7603 = null;
        field7609 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
    public static final void method3185(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, String arg6) {
        field7607++;
        if (arg5 == 6642) {
            class79.method783(null, -1, arg0, arg6, arg4, -81, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lwc;I)V")
    public static final void method3186(class66 arg0, int arg1) {
        field7604++;
        if (class34.field450) {
            return;
        }
        arg0.method3617(arg1 ^ 0x1);
        if (arg1 != 0) {
            method3186(null, -114);
        }
        class409.field5682--;
        if (!arg0.field1202) {
            long var5 = arg0.field1193;
            class241 var7;
            for (var7 = (class241) class580.field8189.method4203(true, var5); var7 != null && !var7.field3386.equals(arg0.field1192); var7 = (class241) class580.field8189.method4210(arg1 - 126)) {
            }
            if (var7 != null && var7.method1620(arg1 ^ 0xFFFFB597, arg0)) {
                class218.method1515(var7, false);
            }
            return;
        }
        for (class241 var2 = (class241) class211.field3046.method1196(-127); var2 != null; var2 = (class241) class211.field3046.method1204(false)) {
            if (var2.field3386.equals(arg0.field1192)) {
                boolean var3 = false;
                for (class66 var4 = (class66) var2.field3388.method1196(arg1 - 120); var4 != null; var4 = (class66) var2.field3388.method1204(false)) {
                    if (arg0 == var4) {
                        var3 = true;
                        if (var2.method1620(-19049, arg0)) {
                            class218.method1515(var2, false);
                        }
                        break;
                    }
                }
                if (var3) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
    public class541(int arg0) {
        this.field7608 = arg0;
    }
}
