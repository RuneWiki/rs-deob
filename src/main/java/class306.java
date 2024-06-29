import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class306 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4937 = new String[5];

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Z")
    public static boolean field4942 = false;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static volatile int field4938 = 0;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4947 = "wishes to trade with you.";

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lmh;")
    public static class263 field4945 = null;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Llc;")
    public static class270 field4940;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[I[III)V")
    public static final void method2074(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4936++;
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var7) < arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method2074(arg0, arg1, arg2, 1, var6 - 1);
            method2074(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg3 != 1) {
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
    public static final int method2075(int arg0, int arg1) {
        field4944++;
        if (arg0 <= 32) {
            method2077((byte) 12);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    public static void method2076(boolean arg0) {
        field4937 = null;
        field4940 = null;
        if (arg0) {
            field4947 = null;
            field4945 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static final void method2077(byte arg0) {
        for (int var1 = 0; var1 < class284.field4574; var1++) {
            int var3 = class48.field670[var1];
            class12 var4 = class255.field3856[var3];
            int var5 = class92.field1488.method366(-16505);
            if ((var5 & 0x1) != 0) {
                var5 += class92.field1488.method366(-16505) << 8;
            }
            if ((var5 & 0x40) != 0) {
                int var6 = class92.field1488.method377((byte) 39);
                int var7 = class92.field1488.method344((byte) -121);
                var4.method1712(var6, class199.field2930, (byte) 123, var7);
                var4.field3684 = class199.field2930 + 300;
                var4.field3700 = class92.field1488.method377((byte) 32);
            }
            if ((var5 & 0x100) != 0) {
                int var8 = class92.field1488.method359(255);
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                for (int var12 = 0; var12 < var8; var12++) {
                    int var13 = class92.field1488.method374((byte) 80);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    var9[var12] = var13;
                    var10[var12] = class92.field1488.method377((byte) 30);
                    var11[var12] = class92.field1488.method327(65280);
                }
                class203.method1437(var11, var4, var9, var10, -100);
            }
            if ((var5 & 0x10) != 0) {
                int var14 = class92.field1488.method359(255);
                int var15 = class92.field1488.method344((byte) -110);
                var4.method1712(var14, class199.field2930, (byte) 123, var15);
            }
            if ((var5 & 0x2) != 0) {
                if (var4.field137.method804((byte) -98)) {
                    class287.method1966(var4, -77);
                }
                var4.method90(-1, class303.method2062(class92.field1488.method354(-106), -118));
                var4.method1709(-19753, var4.field137.field1738);
                var4.field3723 = var4.field137.field1724;
                var4.field3724 = var4.field137.field1785;
                if (var4.field137.method804((byte) -98)) {
                    class203.method1439((class93) null, 0, var4.field3686[0], (byte) 119, (class207) null, var4, class37.field474, var4.field3761[0]);
                }
            }
            if ((var5 & 0x200) != 0) {
                var4.field3659 = class92.field1488.method327(65280);
                var4.field3715 = class92.field1488.method331(-87);
            }
            if ((var5 & 0x20) != 0) {
                int var16 = class92.field1488.method331(-74);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class92.field1488.method344((byte) -108);
                class197.method1391(var4, var16, false, var17);
            }
            if ((var5 & 0x4) != 0) {
                int var18 = class92.field1488.method354(-127);
                int var19 = class92.field1488.method340(-117);
                if (var18 == 65535) {
                    var18 = -1;
                }
                boolean var20 = true;
                if (var18 != -1 && var4.field3718 != -1 && class232.method1609((byte) -32, class152.method1126(var18, (byte) -1).field1944).field1214 < class232.method1609((byte) -32, class152.method1126(var4.field3718, (byte) -1).field1944).field1214) {
                    var20 = false;
                }
                if (var20) {
                    var4.field3718 = var18;
                    var4.field3672 = 0;
                    var4.field3689 = 0;
                    var4.field3706 = (var19 & 0xFFFF) + class199.field2930;
                    var4.field3688 = 1;
                    if (var4.field3706 > class199.field2930) {
                        var4.field3672 = -1;
                    }
                    var4.field3663 = var19 >> 16;
                    if (var4.field3718 != -1 && class199.field2930 == var4.field3706) {
                        int var21 = class152.method1126(var4.field3718, (byte) -1).field1944;
                        if (var21 != -1) {
                            class76 var22 = class232.method1609((byte) -32, var21);
                            if (var22 != null && var22.field1191 != null) {
                                class32.method208(var4.field3660, 0, true, false, var4.field3753, var22);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field3679 = class92.field1488.method374((byte) 80);
                if (var4.field3679 == 65535) {
                    var4.field3679 = -1;
                }
            }
            if ((var5 & 0x80) != 0) {
                var4.field3731 = class92.field1488.method326(60);
                var4.field3755 = 100;
            }
        }
        field4941++;
        int var2 = -48 / ((21 - arg0) / 47);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2078(int arg0, String arg1, boolean arg2) {
        field4946++;
        byte var3 = 4;
        if (arg0 > -34) {
            return;
        }
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class124.field2073.method77(arg1, 250);
        int var7 = class124.field2073.method57(arg1, 250) * 13;
        class130.method996(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class130.method1006(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class124.field2073.method58(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class210.method1482(var5 - var3, true, var4 - var3, var3 + var7 - -var3, var3 + var6 + var3);
        if (!arg2) {
            class191.method1359((byte) -59, var4, var5, var6, var7);
            return;
        }
        try {
            Graphics var8 = class12.field136.getGraphics();
            class112.field1865.method178(0, var8, -128, 0);
        } catch (Exception var9) {
            class12.field136.repaint();
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZ)I")
    public static final int method2079(int arg0, int arg1, boolean arg2) {
        field4939++;
        class101 var3 = (class101) class142.field2308.method1073(-1, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field1717.length > arg1) {
            return arg2 ? 75 : var3.field1717[arg1];
        } else {
            return -1;
        }
    }
}
