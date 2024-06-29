import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class264 implements class508 {

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private int field3878 = 0;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    private int field3889 = -1;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lpa;")
    private class249[] field3902 = new class249[9];

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Lfd;")
    private class365 field3896;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3869 = 10;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field3897 = -1;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Z")
    public static boolean field3893 = false;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lsl;")
    private static class318 field3898 = new class318(26, 7);

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "Lsl;")
    public static class318 field3901 = new class318(68, 3);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "Lc;")
    public static class122 field3903;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[[B")
    public static byte[][] field3877;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
    public static void method1688(byte arg0) {
        field3901 = null;
        field3898 = null;
        field3903 = null;
        field3877 = null;
        int var1 = -128 / ((10 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static final void method1689(int arg0) {
        field3882++;
        class153.field2171.method1105(false);
        if (arg0 != 51) {
            field3898 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public final void method1690(int arg0, int arg1) {
        field3886++;
        if (this.field3889 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 82) {
            this.method1702(24, (byte) 78);
        }
        OpenGL.glDrawBuffer(class132.field1916[arg1]);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
    public final void method1691(int arg0, int arg1) {
        field3891++;
        if (this.field3902[arg0] != null) {
            this.field3902[arg0].method1628(122);
        }
        int var3 = 20 / ((10 - arg1) / 52);
        this.field3892 &= ~(0x1 << arg0);
        this.field3902[arg0] = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILaf;I)V")
    private final void method1692(int arg0, int arg1, class299 arg2, int arg3) {
        field3887++;
        if (this.field3889 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field3892 & ~var5) == 0) {
            this.field3890 = arg2.field4288;
            this.field3870 = arg2.field4296;
        } else if (this.field3870 != arg2.field4296 || this.field3890 != arg2.field4288) {
            throw new RuntimeException();
        }
        if (arg3 <= 14) {
            method1688((byte) -25);
        }
        arg2.method1881(arg1, class132.field1916[arg0], this.field3889, -102);
        this.field3902[arg0] = arg2;
        this.field3892 |= var5;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILim;I)V")
    private final void method1693(int arg0, int arg1, int arg2, class401 arg3, int arg4) {
        field3888++;
        if (this.field3889 == -1) {
            throw new RuntimeException();
        }
        int var6 = arg2 << arg1;
        if ((this.field3892 & ~var6) == 0) {
            this.field3870 = arg3.field5948;
            this.field3890 = arg3.field5948;
        } else if (this.field3870 != arg3.field5948 || this.field3890 != arg3.field5948) {
            throw new RuntimeException();
        }
        arg3.method2466(this.field3889, arg0, arg4, (byte) 126, class132.field1916[arg1]);
        this.field3902[arg1] = arg3;
        this.field3892 |= var6;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1694(int arg0) {
        if (arg0 < -120) {
            field3880++;
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field3878 &= 0xFFFFFFFB;
            this.field3889 = this.method1705(-90);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lio;IB)V")
    public final void method1695(class301 arg0, int arg1, byte arg2) {
        field3894++;
        if (arg2 >= -86) {
            this.method1705(39);
        }
        if (this.field3889 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((this.field3892 & ~var4) == 0) {
            this.field3870 = arg0.field4312;
            this.field3890 = arg0.field4311;
        } else if (this.field3870 != arg0.field4312 || this.field3890 != arg0.field4311) {
            throw new RuntimeException();
        }
        arg0.method1890(true, class132.field1916[arg1], this.field3889);
        this.field3902[arg1] = arg0;
        this.field3892 |= var4;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)I")
    public final int method1696(byte arg0) {
        if (arg0 != -20) {
            this.field3878 = 36;
        }
        field3871++;
        return this.field3890;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method1697(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field3883);
        field3900++;
        this.field3878 |= 0x4;
        int var2 = -13 / ((-arg0 - 28) / 45);
        this.field3889 = this.method1705(123);
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3895++;
        this.field3896.method2224(true, this.field3883);
        super.finalize();
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z")
    public final boolean method1698(int arg0) {
        field3874++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3889);
        return ~var2 == arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILqm;IZ)V")
    public static final void method1699(int arg0, class97 arg1, int arg2, boolean arg3) {
        field3876++;
        if (arg1 == null || class498.field7394.field1918 == arg1) {
            return;
        }
        int var4 = arg1.field1302;
        int var5 = arg1.field1305;
        int var6 = arg1.field1307;
        int var7 = (int) arg1.field1308;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field1308;
        if (var6 == 1004 || var6 == 1012 || var6 == 1008 || var6 == 1001 || var6 == 1006) {
            class154.method1096(var6, true, var4, var7);
        }
        if (var6 == 45) {
            class445.field6587 = arg2;
            class13.field155 = arg0;
            class496.field7278 = 2;
            class108.field1541 = 0;
            class480.field7055++;
            class32.method258(-62, class523.field7691);
            class472.field6970.method592((byte) -123, class340.field4713 + var4);
            class472.field6970.method592((byte) -120, class476.field7013 + var5);
            class472.field6970.method583((byte) -113, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class472.field6970.method638(255, class229.field3360.method796(-109, 82) ? 1 : 0);
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 10) {
            class364 var10 = class384.field5647[var7];
            if (var10 != null) {
                class66.field853++;
                class496.field7278 = 2;
                class13.field155 = arg0;
                class445.field6587 = arg2;
                class108.field1541 = 0;
                class32.method258(-123, class108.field1527);
                class472.field6970.method583((byte) -88, var7);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-90, 82) ? 1 : 0);
                class139.method1044(0, var10.field1778[0], var10.field1777[0], var10.method963((byte) 127), true, var10.method963((byte) 127), 0, -2, 124);
            }
        }
        if (var6 == 15) {
            class461 var11 = class250.field3690[var7];
            if (var11 != null) {
                class108.field1541 = 0;
                class446.field6592++;
                class496.field7278 = 2;
                class13.field155 = arg0;
                class445.field6587 = arg2;
                class32.method258(-112, class166.field2352);
                class472.field6970.method608(0, class229.field3360.method796(-83, 82) ? 1 : 0);
                class472.field6970.method611((byte) 67, var7);
                class139.method1044(0, var11.field1778[0], var11.field1777[0], var11.method963((byte) 127), true, var11.method963((byte) 127), 0, -2, 111);
            }
        }
        if (var6 == 46) {
            class364 var12 = class384.field5647[var7];
            if (var12 != null) {
                class496.field7278 = 2;
                class13.field155 = arg0;
                class445.field6587 = arg2;
                class400.field5936++;
                class108.field1541 = 0;
                class32.method258(-90, class425.field6284);
                class472.field6970.method600(-1276441384, class404.field5977);
                class472.field6970.method583((byte) -75, var7);
                class472.field6970.method611((byte) 67, class412.field6116);
                class472.field6970.method611((byte) 67, class219.field3149);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-93, 82) ? 1 : 0);
                class139.method1044(0, var12.field1778[0], var12.field1777[0], var12.method963((byte) 127), true, var12.method963((byte) 127), 0, -2, 99);
            }
        }
        if (var6 == 6) {
            class13.field155 = arg0;
            class77.field1047++;
            class496.field7278 = 2;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class32.method258(-59, class97.field1309);
            class472.field6970.method638(255, class229.field3360.method796(-85, 82) ? 1 : 0);
            class472.field6970.method600(-1276441384, class404.field5977);
            class472.field6970.method583((byte) -53, class476.field7013 + var5);
            class472.field6970.method592((byte) -107, var7);
            class472.field6970.method611((byte) 67, class412.field6116);
            class472.field6970.method581(var4 + class340.field4713, (byte) 84);
            class472.field6970.method581(class219.field3149, (byte) 78);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 59) {
            if (class365.field5273 > 0 && class229.field3360.method796(-125, 82) && class229.field3360.method796(-87, 81)) {
                class87.method771(class435.field6375.field6328, 63, class476.field7013 + var5, class340.field4713 + var4);
            } else {
                class13.field155 = arg0;
                class496.field7278 = 1;
                class458.field6714++;
                class445.field6587 = arg2;
                class108.field1541 = 0;
                class32.method258(-116, class22.field242);
                class472.field6970.method592((byte) -117, class340.field4713 + var4);
                class472.field6970.method583((byte) -101, class476.field7013 + var5);
            }
        }
        if (var6 == 58) {
            class364 var13 = class384.field5647[var7];
            if (var13 != null) {
                class13.field155 = arg0;
                class445.field6587 = arg2;
                class496.field7278 = 2;
                class128.field1856++;
                class108.field1541 = 0;
                class32.method258(-80, class462.field6801);
                class472.field6970.method592((byte) -108, var7);
                class472.field6970.method638(255, class229.field3360.method796(-103, 82) ? 1 : 0);
                class139.method1044(0, var13.field1778[0], var13.field1777[0], var13.method963((byte) 127), true, var13.method963((byte) 127), 0, -2, 123);
            }
        }
        if (var6 == 8) {
            class108.field1541 = 0;
            class496.field7278 = 2;
            class400.field5936++;
            class445.field6587 = arg2;
            class13.field155 = arg0;
            class32.method258(-71, class425.field6284);
            class472.field6970.method600(-1276441384, class404.field5977);
            class472.field6970.method583((byte) -114, class435.field6375.field1716);
            class472.field6970.method611((byte) 67, class412.field6116);
            class472.field6970.method611((byte) 67, class219.field3149);
            class472.field6970.method582((byte) 23, class229.field3360.method796(-128, 82) ? 1 : 0);
        }
        if (var6 == 21) {
            class461 var14 = class250.field3690[var7];
            if (var14 != null) {
                class13.field155 = arg0;
                class496.field7278 = 2;
                class445.field6587 = arg2;
                class432.field6343++;
                class108.field1541 = 0;
                class32.method258(-86, class501.field7428);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-103, 82) ? 1 : 0);
                class472.field6970.method581(var7, (byte) 123);
                class139.method1044(0, var14.field1778[0], var14.field1777[0], var14.method963((byte) 127), true, var14.method963((byte) 127), 0, -2, 119);
            }
        }
        if (var6 == 23) {
            class496.field7278 = 2;
            class13.field155 = arg0;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class369.field5482++;
            class32.method258(-97, class38.field438);
            class472.field6970.method581(class340.field4713 + var4, (byte) 113);
            class472.field6970.method638(255, class229.field3360.method796(-110, 82) ? 1 : 0);
            class472.field6970.method611((byte) 67, class476.field7013 + var5);
            class472.field6970.method583((byte) -103, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 25) {
            class108.field1541 = 0;
            class199.field2899++;
            class13.field155 = arg0;
            class445.field6587 = arg2;
            class496.field7278 = 2;
            class32.method258(-117, class466.field6843);
            class472.field6970.method583((byte) -60, class476.field7013 + var5);
            class472.field6970.method592((byte) -115, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class472.field6970.method583((byte) -79, class340.field4713 + var4);
            class472.field6970.method620(class229.field3360.method796(-92, 82) ? 1 : 0, -2);
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 49) {
            class13.field155 = arg0;
            class108.field1541 = 0;
            class496.field7278 = 2;
            class63.field742++;
            class445.field6587 = arg2;
            class32.method258(-94, class38.field436);
            class472.field6970.method608(0, class229.field3360.method796(-77, 82) ? 1 : 0);
            class472.field6970.method611((byte) 67, class476.field7013 + var5);
            class472.field6970.method581(var7, (byte) 85);
            class472.field6970.method611((byte) 67, class340.field4713 + var4);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 1007) {
            class13.field155 = arg0;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class496.field7278 = 2;
            class283.field4111++;
            class32.method258(-85, class397.field5824);
            class472.field6970.method638(255, class229.field3360.method796(-76, 82) ? 1 : 0);
            class472.field6970.method581(class476.field7013 + var5, (byte) 105);
            class472.field6970.method592((byte) -107, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class472.field6970.method611((byte) 67, var4 + class340.field4713);
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 16) {
            class13.field155 = arg0;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class360.field5000++;
            class496.field7278 = 2;
            class32.method258(-65, class194.field2829);
            class472.field6970.method592((byte) -107, var7);
            class472.field6970.method620(class229.field3360.method796(-116, 82) ? 1 : 0, -2);
            class472.field6970.method611((byte) 67, class340.field4713 + var4);
            class472.field6970.method583((byte) -49, var5 + class476.field7013);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 60 && class454.field6681 == null) {
            class150.method1087(var5, 0, var4);
            class454.field6681 = class274.method1766(var5, var4, (byte) 22);
            class120.method951(class454.field6681, (byte) -109);
        }
        if (var6 == 9) {
            class188 var15 = class274.method1766(var5, var4, (byte) 126);
            if (var15 != null) {
                class235.method1568((byte) -115);
                class278 var16 = client.method1380(var15);
                class258.method1663(var16.field4077, var16.method1789(16693), var15, (byte) -38);
                class8.field93 = class515.method3060(var15, (byte) 120);
                if (class8.field93 == null) {
                    class8.field93 = "Null";
                }
                class91.field1252 = var15.field2663 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 12) {
            class364 var17 = class384.field5647[var7];
            if (var17 != null) {
                class13.field155 = arg0;
                class496.field7278 = 2;
                class445.field6587 = arg2;
                class280.field4101++;
                class108.field1541 = 0;
                class32.method258(-52, class80.field1075);
                class472.field6970.method608(0, class229.field3360.method796(-106, 82) ? 1 : 0);
                class472.field6970.method583((byte) -120, var7);
                class139.method1044(0, var17.field1778[0], var17.field1777[0], var17.method963((byte) 127), true, var17.method963((byte) 127), 0, -2, 105);
            }
        }
        if (var6 == 57) {
            class364 var18 = class384.field5647[var7];
            if (var18 != null) {
                class13.field155 = arg0;
                class496.field7278 = 2;
                class445.field6587 = arg2;
                class56.field604++;
                class108.field1541 = 0;
                class32.method258(-73, class225.field3297);
                class472.field6970.method608(0, class229.field3360.method796(-100, 82) ? 1 : 0);
                class472.field6970.method592((byte) -112, var7);
                class139.method1044(0, var18.field1778[0], var18.field1777[0], var18.method963((byte) 127), true, var18.method963((byte) 127), 0, -2, 99);
            }
        }
        if (var6 == 30) {
            class496.field7278 = 2;
            class13.field155 = arg0;
            class445.field6587 = arg2;
            class198.field2894++;
            class108.field1541 = 0;
            class32.method258(-87, class183.field2585);
            class472.field6970.method592((byte) -127, class340.field4713 + var4);
            class472.field6970.method600(-1276441384, class404.field5977);
            class472.field6970.method592((byte) -117, class219.field3149);
            class472.field6970.method592((byte) -115, class412.field6116);
            class472.field6970.method620(class229.field3360.method796(-76, 82) ? 1 : 0, -2);
            class472.field6970.method611((byte) 67, class476.field7013 + var5);
            class472.field6970.method583((byte) -107, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 19) {
            class445.field6587 = arg2;
            class72.field940++;
            class13.field155 = arg0;
            class496.field7278 = 1;
            class108.field1541 = 0;
            class32.method258(-88, class257.field3773);
            class472.field6970.method592((byte) -122, class340.field4713 + var4);
            class472.field6970.method600(-1276441384, class404.field5977);
            class472.field6970.method592((byte) -106, class412.field6116);
            class472.field6970.method592((byte) -105, class219.field3149);
            class472.field6970.method611((byte) 67, class476.field7013 + var5);
            class139.method1044(0, var5, var4, 1, true, 1, 0, -4, 105);
        }
        if (var6 == 47) {
            class188 var19 = class274.method1766(var5, var4, (byte) -102);
            if (var19 != null) {
                class396.method2422(var19, 27254);
            }
        }
        if (var6 == 50) {
            class461 var20 = class250.field3690[var7];
            if (var20 != null) {
                class445.field6587 = arg2;
                class13.field155 = arg0;
                class108.field1541 = 0;
                class37.field404++;
                class496.field7278 = 2;
                class32.method258(-108, class162.field2290);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-93, 82) ? 1 : 0);
                class472.field6970.method583((byte) -90, var7);
                class139.method1044(0, var20.field1778[0], var20.field1777[0], var20.method963((byte) 127), true, var20.method963((byte) 127), 0, -2, 103);
            }
        }
        if (var6 == 5) {
            class364 var21 = class384.field5647[var7];
            if (var21 != null) {
                class496.field7278 = 2;
                class13.field155 = arg0;
                class108.field1541 = 0;
                class445.field6587 = arg2;
                class90.field1235++;
                class32.method258(-93, class369.field5484);
                class472.field6970.method583((byte) -75, var7);
                class472.field6970.method608(0, class229.field3360.method796(-98, 82) ? 1 : 0);
                class139.method1044(0, var21.field1778[0], var21.field1777[0], var21.method963((byte) 127), true, var21.method963((byte) 127), 0, -2, 119);
            }
        }
        if (var6 == 22) {
            class461 var22 = class250.field3690[var7];
            if (var22 != null) {
                class108.field1541 = 0;
                class12.field141++;
                class445.field6587 = arg2;
                class496.field7278 = 2;
                class13.field155 = arg0;
                class32.method258(-63, class253.field3738);
                class472.field6970.method592((byte) -105, var7);
                class472.field6970.method583((byte) -109, class412.field6116);
                class472.field6970.method618(class404.field5977, (byte) 121);
                class472.field6970.method583((byte) -73, class219.field3149);
                class472.field6970.method638(255, class229.field3360.method796(-101, 82) ? 1 : 0);
                class139.method1044(0, var22.field1778[0], var22.field1777[0], var22.method963((byte) 127), true, var22.method963((byte) 127), 0, -2, 123);
            }
        }
        if (var6 == 48 || var6 == 1002) {
            class188.method1317(arg3, var7, arg1.field1303, var5, var4);
        }
        if (var6 == 2) {
            class445.field6587 = arg2;
            class496.field7278 = 2;
            class13.field155 = arg0;
            class108.field1541 = 0;
            class406.field6049++;
            class32.method258(-123, field3898);
            class472.field6970.method592((byte) -112, var7);
            class472.field6970.method611((byte) 67, var4 + class340.field4713);
            class472.field6970.method592((byte) -121, var5 + class476.field7013);
            class472.field6970.method582((byte) 23, class229.field3360.method796(-104, 82) ? 1 : 0);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 18) {
            class13.field155 = arg0;
            class496.field7278 = 2;
            class445.field6587 = arg2;
            class321.field4524++;
            class108.field1541 = 0;
            class32.method258(-90, class487.field7150);
            class472.field6970.method583((byte) -84, class340.field4713 + var4);
            class472.field6970.method638(255, class229.field3360.method796(-100, 82) ? 1 : 0);
            class472.field6970.method611((byte) 67, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class472.field6970.method611((byte) 67, var5 + class476.field7013);
            class325.method2006(22, var8, var4, var5);
        }
        if (var6 == 3) {
            class461 var23 = class250.field3690[var7];
            if (var23 != null) {
                class445.field6587 = arg2;
                class13.field155 = arg0;
                class142.field2004++;
                class496.field7278 = 2;
                class108.field1541 = 0;
                class32.method258(-119, class39.field448);
                class472.field6970.method583((byte) -121, var7);
                class472.field6970.method608(0, class229.field3360.method796(-92, 82) ? 1 : 0);
                class139.method1044(0, var23.field1778[0], var23.field1777[0], var23.method963((byte) 127), true, var23.method963((byte) 127), 0, -2, 115);
            }
        }
        if (!arg3) {
            field3897 = 103;
        }
        if (var6 == 17) {
            class364 var24 = class384.field5647[var7];
            if (var24 != null) {
                class445.field6587 = arg2;
                class496.field7278 = 2;
                class13.field155 = arg0;
                class108.field1541 = 0;
                class384.field5644++;
                class32.method258(-113, field3901);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-84, 82) ? 1 : 0);
                class472.field6970.method611((byte) 67, var7);
                class139.method1044(0, var24.field1778[0], var24.field1777[0], var24.method963((byte) 127), true, var24.method963((byte) 127), 0, -2, 103);
            }
        }
        if (var6 == 1003) {
            class445.field6587 = arg2;
            class496.field7278 = 2;
            class13.field155 = arg0;
            class108.field1541 = 0;
            class461 var25 = class250.field3690[var7];
            if (var25 != null) {
                class100 var26 = var25.field6790;
                if (var26.field1364 != null) {
                    var26 = var26.method848(false, class253.field3739);
                }
                if (var26 != null) {
                    class8.field100++;
                    class32.method258(-96, class478.field7038);
                    class472.field6970.method611((byte) 67, var26.field1357);
                }
            }
        }
        if (var6 == 13) {
            class364 var27 = class384.field5647[var7];
            if (var27 != null) {
                class445.field6587 = arg2;
                class493.field7207++;
                class108.field1541 = 0;
                class496.field7278 = 2;
                class13.field155 = arg0;
                class32.method258(-113, class517.field7623);
                class472.field6970.method592((byte) -127, var7);
                class472.field6970.method638(255, class229.field3360.method796(-114, 82) ? 1 : 0);
                class139.method1044(0, var27.field1778[0], var27.field1777[0], var27.method963((byte) 127), true, var27.method963((byte) 127), 0, -2, 125);
            }
        }
        if (var6 == 44) {
            if (class365.field5273 > 0 && class229.field3360.method796(-104, 82) && class229.field3360.method796(-119, 81)) {
                class87.method771(class435.field6375.field6328, 63, class476.field7013 + var5, class340.field4713 + var4);
            } else {
                class346.method2096(var4, -120, var7, var5);
                if (var7 == 1) {
                    class472.field6970.method638(255, -1);
                    class472.field6970.method638(255, -1);
                    class472.field6970.method611((byte) 67, (int) class328.field4588);
                    class472.field6970.method638(255, 57);
                    class472.field6970.method638(255, class455.field6702);
                    class472.field6970.method638(255, class465.field6839);
                    class472.field6970.method638(255, 89);
                    class472.field6970.method611((byte) 67, class435.field6375.field6335);
                    class472.field6970.method611((byte) 67, class435.field6375.field6334);
                    class472.field6970.method638(255, 63);
                } else {
                    class496.field7278 = 1;
                    class108.field1541 = 0;
                    class13.field155 = arg0;
                    class445.field6587 = arg2;
                }
                class139.method1044(0, var5, var4, 1, true, 1, 0, -4, 112);
            }
        }
        if (var6 == 51) {
            class496.field7278 = 2;
            class445.field6587 = arg2;
            class13.field155 = arg0;
            class108.field1541 = 0;
            class252.field3706++;
            class32.method258(-70, class212.field3051);
            class472.field6970.method611((byte) 67, var7);
            class472.field6970.method608(0, class229.field3360.method796(-97, 82) ? 1 : 0);
            class472.field6970.method583((byte) -88, class340.field4713 + var4);
            class472.field6970.method583((byte) -56, class476.field7013 + var5);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 1010) {
            class496.field7278 = 2;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class482.field7090++;
            class13.field155 = arg0;
            class32.method258(-66, class465.field6837);
            class472.field6970.method611((byte) 67, var7);
        }
        if (var6 == 1009) {
            class108.field1541 = 0;
            class13.field155 = arg0;
            class200.field2926++;
            class496.field7278 = 2;
            class445.field6587 = arg2;
            class32.method258(-118, class430.field6325);
            class472.field6970.method611((byte) 67, var7);
        }
        if (var6 == 4) {
            class379.field5604++;
            class496.field7278 = 2;
            class108.field1541 = 0;
            class445.field6587 = arg2;
            class13.field155 = arg0;
            class32.method258(-126, class222.field3202);
            class472.field6970.method581(class340.field4713 + var4, (byte) 121);
            class472.field6970.method581(class476.field7013 + var5, (byte) 97);
            class472.field6970.method583((byte) -106, var7);
            class472.field6970.method638(255, class229.field3360.method796(-90, 82) ? 1 : 0);
            class289.method1828(var4, 29310, var5);
        }
        if (var6 == 20) {
            class364 var28 = class384.field5647[var7];
            if (var28 != null) {
                class496.field7278 = 2;
                class316.field4499++;
                class445.field6587 = arg2;
                class108.field1541 = 0;
                class13.field155 = arg0;
                class32.method258(-87, class495.field7239);
                class472.field6970.method582((byte) 23, class229.field3360.method796(-114, 82) ? 1 : 0);
                class472.field6970.method581(var7, (byte) 113);
                class139.method1044(0, var28.field1778[0], var28.field1777[0], var28.method963((byte) 127), true, var28.method963((byte) 127), 0, -2, 100);
            }
        }
        if (var6 == 11) {
            class461 var29 = class250.field3690[var7];
            if (var29 != null) {
                class13.field155 = arg0;
                class108.field1541 = 0;
                class445.field6587 = arg2;
                class21.field237++;
                class496.field7278 = 2;
                class32.method258(-108, class72.field920);
                class472.field6970.method608(0, class229.field3360.method796(-72, 82) ? 1 : 0);
                class472.field6970.method611((byte) 67, var7);
                class139.method1044(0, var29.field1778[0], var29.field1777[0], var29.method963((byte) 127), true, var29.method963((byte) 127), 0, -2, 126);
            }
        }
        if (class453.field6671) {
            class235.method1568((byte) 127);
        }
        if (class274.field4041 != null && class382.field5631 == 0) {
            class120.method951(class274.field4041, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public final void method1700(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field3883);
        field3873++;
        this.field3878 |= 0x1;
        if (arg0 == 45) {
            this.field3889 = this.method1705(127);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public final void method1701(int arg0) {
        field3899++;
        if (arg0 < -51) {
            OpenGL.glBindFramebufferEXT(36008, 0);
            this.field3878 &= 0xFFFFFFFE;
            this.field3889 = this.method1705(53);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
    public final void method1702(int arg0, byte arg1) {
        field3884++;
        if (this.field3889 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != 5) {
            this.method1696((byte) 115);
        }
        OpenGL.glReadBuffer(class132.field1916[arg0]);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public final void method1703(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field3883);
        field3885++;
        this.field3878 |= 0x2;
        this.field3889 = this.method1705(14);
        if (arg0 != -20741) {
            this.method1698(82);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILim;I)V")
    public final void method1704(int arg0, int arg1, class401 arg2, int arg3) {
        field3875++;
        this.method1693(0, arg0, 1, arg2, arg3);
        if (arg1 != -1) {
            this.field3883 = 119;
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)I")
    private final int method1705(int arg0) {
        field3881++;
        if ((this.field3878 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3878 & 0x2) == 0) {
            int var2 = 23 / ((arg0 - 88) / 32);
            return (this.field3878 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public final void method1706(int arg0) {
        field3872++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field3878 &= 0xFFFFFFFD;
        this.field3889 = this.method1705(126);
        int var2 = 96 % ((61 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLaf;I)V")
    public final void method1707(byte arg0, class299 arg1, int arg2) {
        if (arg0 == 76) {
            this.method1692(arg2, 0, arg1, 55);
            field3879++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lfd;)V")
    public class264(class365 arg0) {
        if (!arg0.field5328) {
            throw new IllegalStateException("");
        }
        this.field3896 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class29.field361, 0);
        this.field3883 = class29.field361[0];
    }
}
