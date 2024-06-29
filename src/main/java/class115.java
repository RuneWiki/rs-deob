import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class115 extends class71 {

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Lfk;")
    public static class315 field1532;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIILpn;I)Z", line = 4)
    public static final boolean method732(boolean arg0, int arg1, int arg2, class91 arg3, int arg4) {
        field1533++;
        if (!class762.field10630 || !class280.field4072) {
            return false;
        } else if (class527.field7314 < 100) {
            return false;
        } else if (class409.method2565(arg4, arg2, arg1, 0)) {
            int var5 = arg1 << class371.field5241;
            int var6 = arg4 << class371.field5241;
            int var7 = class433.field6043[arg2].method2171(arg4, arg1, 31) - 1;
            int var8 = var7 + arg3.method790(-11692);
            if (arg3.field1275 == 1) {
                if (!class220.method1302(var8, var5, class368.field5213 + var6, var5, 57, var7, var6, var5, var8, var6)) {
                    return false;
                } else if (class220.method1302(var7, var5, class368.field5213 + var6, var5, -127, var7, var6, var5, var8, class368.field5213 + var6)) {
                    class75.field1102++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1275 == 2) {
                if (!class220.method1302(var8, class368.field5213 + var5, var6 - -class368.field5213, var5, -105, var7, class368.field5213 + var6, var5, var8, class368.field5213 + var6)) {
                    return false;
                } else if (class220.method1302(var8, class368.field5213 + var5, var6 - -class368.field5213, var5, -126, var7, var6 + class368.field5213, var5 - -class368.field5213, var7, class368.field5213 + var6)) {
                    class75.field1102++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1275 != 4) {
                if (!arg0) {
                    method735(-116, -84, -16);
                }
                if (arg3.field1275 == 8) {
                    if (!class220.method1302(var8, var5 + class368.field5213, var6, var5, -112, var7, var6, var5, var8, var6)) {
                        return false;
                    } else if (class220.method1302(var8, class368.field5213 + var5, var6, var5, -116, var7, var6, class368.field5213 + var5, var7, var6)) {
                        class75.field1102++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field1275 == 16) {
                    if (class450.method2756(1820, class292.field4190, var8, class292.field4190 + var6, class292.field4190, var7, var5)) {
                        class75.field1102++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field1275 == 32) {
                    if (class450.method2756(1820, class292.field4190, var8, var6 + class292.field4190, class292.field4190, var7, var5 + class292.field4190)) {
                        class75.field1102++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field1275 == 64) {
                    if (class450.method2756(1820, class292.field4190, var8, var6, class292.field4190, var7, class292.field4190 + var5)) {
                        class75.field1102++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field1275 != 128) {
                    return true;
                } else if (class450.method2756(1820, class292.field4190, var8, var6, class292.field4190, var7, var5)) {
                    class75.field1102++;
                    return true;
                } else {
                    return false;
                }
            } else if (!class220.method1302(var8, var5 + class368.field5213, class368.field5213 + var6, var5 + class368.field5213, 89, var7, var6, class368.field5213 + var5, var8, var6)) {
                return false;
            } else if (class220.method1302(var7, class368.field5213 + var5, var6 - -class368.field5213, class368.field5213 + var5, -125, var7, var6, class368.field5213 + var5, var8, class368.field5213 + var6)) {
                class75.field1102++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;B)V", line = 129)
    public static final void method733(String arg0, boolean arg1, String arg2, byte arg3) {
        field1531++;
        class25.field321 = arg1;
        class707.field9849 = arg0;
        class605.field8178 = arg2;
        if (!class25.field321 && (class707.field9849.equals("") || class605.field8178.equals(""))) {
            class97.method663(3, arg3 ^ 0xFFFFFF8F);
        } else if (arg3 == 113) {
            if (class73.field1096 != 1) {
                class175.field2408 = 0;
                class700.field9770 = -1;
            }
            class320.field4450 = false;
            class97.method663(-3, -2);
            class32.field433 = 0;
            class384.field5511 = 0;
            class538.field7453 = 1;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBLha;)V", line = 161)
    public static final void method734(int arg0, byte arg1, class548 arg2) {
        field1537++;
        if (!class762.field10630 || !class280.field4072) {
            class723.field10045 = 0;
            return;
        }
        if (class493.field6912) {
            class157.field2212 = class720.field10021.method2129(true);
        }
        class671.field9270 = 0;
        class78.field1129 = 0;
        class75.field1102 = 0;
        int[] var3 = arg2.method1407();
        class68.field1051 = (int) ((float) var3[2] / 3.0F);
        class698.field9746 = (int) ((float) var3[3] / 3.0F);
        arg2.method1483(class684.field9513);
        if ((int) ((float) class684.field9513[0] / 3.0F) != class702.field9783 || ((int) ((float) class684.field9513[1] / 3.0F)) != class466.field6481) {
            class466.field6481 = (int) ((float) class684.field9513[1] / 3.0F);
            class702.field9783 = (int) ((float) class684.field9513[0] / 3.0F);
            class87.field1241 = new int[class702.field9783 * class466.field6481];
            class626.field8423 = class466.field6481 >> 1;
            class338.field4751 = class702.field9783 >> 1;
        }
        class474.field6574 = arg2.method1385();
        class723.field10045 = 0;
        for (int var4 = 0; var4 < class414.field5864; var4++) {
            class306.method2008(arg0, arg2, class363.field5183[var4], -28546);
        }
        if (arg1 < 72) {
            return;
        }
        for (int var5 = 0; var5 < class726.field10070; var5++) {
            class306.method2008(arg0, arg2, class625.field8414[var5], -28546);
        }
        for (int var6 = 0; var6 < class312.field4339; var6++) {
            class306.method2008(arg0, arg2, class166.field2285[var6], -28546);
        }
        class527.field7314 = 0;
        if (class723.field10045 > 0) {
            int var7 = class87.field1241.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
                class87.field1241[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class87.field1241[var9++] = Integer.MAX_VALUE;
            }
            class139.field1982 = 1;
            for (int var10 = 0; var10 < class723.field10045; var10++) {
                class616 var11 = class77.field1127[var10];
                class232.method1524(var11.field8292[0], var11.field8279[0], var11.field8279[3], var11.field8284[1], (byte) 34, var11.field8279[1], var11.field8284[0], var11.field8292[3], var11.field8284[3], var11.field8292[1]);
                class232.method1524(var11.field8292[1], var11.field8279[1], var11.field8279[3], var11.field8284[2], (byte) 34, var11.field8279[2], var11.field8284[1], var11.field8292[3], var11.field8284[3], var11.field8292[2]);
            }
            class139.field1982 = 2;
        }
        if (class493.field6912) {
            class118.field1568 = class720.field10021.method2129(true) - class157.field2212;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z", line = 267)
    public static final boolean method735(int arg0, int arg1, int arg2) {
        if (arg1 > -80) {
            return false;
        } else {
            field1535++;
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 280)
    public static void method736(int arg0) {
        if (arg0 != 0) {
            field1532 = null;
        }
        field1532 = null;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(II)V", line = 290)
    public class115(int arg0, int arg1) {
        this.field1534 = arg0;
        this.field1536 = arg1;
    }
}
