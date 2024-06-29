import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class509 extends class380 {

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public int field7071 = -1;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    private int field7075 = 0;

    @OriginalMember(owner = "client!mq", name = "W", descriptor = "Z")
    private boolean field7082 = false;

    @OriginalMember(owner = "client!mq", name = "U", descriptor = "I")
    public int field7080 = -1;

    @OriginalMember(owner = "client!mq", name = "bb", descriptor = "I")
    public int field7087 = 0;

    @OriginalMember(owner = "client!mq", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field7086 = new String[8];

    @OriginalMember(owner = "client!mq", name = "Z", descriptor = "Loaa;")
    public static class290 field7085 = new class290(13, 0, 1, 0);

    @OriginalMember(owner = "client!mq", name = "eb", descriptor = "F")
    public static float field7090;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
    public int field7076;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
    public int field7077;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!mq", name = "T", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!mq", name = "V", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!mq", name = "X", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!mq", name = "Y", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!mq", name = "cb", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!mq", name = "db", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "(I)I")
    public final int method54(int arg0) {
        ++field7088;
        if (arg0 > -109) {
            field7086 = null;
        }
        class352 var2 = class721.field9801.method162(-115, this.field7072);
        int var3 = var2.field4927;
        if (~this.field7080 != 0) {
            class352 var4 = class721.field9801.method162(74, this.field7080);
            if (var4.field4927 > var3) {
                var3 = var4.field4927;
            }
        }
        if (~this.field7071 != 0) {
            class352 var5 = class721.field9801.method162(-88, this.field7071);
            if (var3 < var5.field4927) {
                var3 = var5.field4927;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            this.method41(-74, (class59) null);
        }
        ++field7073;
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIII)V")
    public class509(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        if (!arg0) {
            this.field7087 = 68;
        }
        ++field7074;
        return -10;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        ++field7089;
        if (arg1 > -125) {
            this.field7087 = 71;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field7079;
        class661 var5 = arg0.method322();
        var5.method744(super.field5922, super.field5927 + -10, super.field5933);
        class352 var6 = class721.field9801.method162(arg3 ^ 107, this.field7072);
        class472 var7 = var6.method2206((class627) null, (class691) null, arg0, 131072, 0, this.field7076, 0, (byte) 88, -1);
        if (var7 != null && (class458.field6459 ? var7.method492(arg2, arg1, var5, true, var6.field4927, class58.field1146) : var7.method503(arg2, arg1, var5, true, var6.field4927))) {
            return true;
        } else {
            if (~this.field7080 != arg3) {
                class352 var8 = class721.field9801.method162(-88, this.field7080);
                class472 var9 = var8.method2206((class627) null, (class691) null, arg0, 131072, 0, this.field7081, 0, (byte) 88, -1);
                if (var9 != null && (class458.field6459 ? var9.method492(arg2, arg1, var5, true, var8.field4927, class58.field1146) : var9.method503(arg2, arg1, var5, true, var8.field4927))) {
                    return true;
                }
            }
            if (this.field7071 != -1) {
                class352 var10 = class721.field9801.method162(-99, this.field7071);
                class472 var11 = var10.method2206((class627) null, (class691) null, arg0, 131072, 0, this.field7077, 0, (byte) 88, -1);
                if (var11 != null && (!class458.field6459 ? var11.method503(arg2, arg1, var5, true, var10.field4927) : var11.method492(arg2, arg1, var5, true, var10.field4927, class58.field1146))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(Z)V")
    public static void method2986(boolean arg0) {
        field7086 = null;
        field7085 = null;
        if (arg0) {
            method2986(true);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        if (arg0 != 1) {
            this.method41(60, (class59) null);
        }
        ++field7070;
        class474 var3 = class637.method3623(super.field5926, super.field5922 >> class130.field2185, super.field5933 >> class130.field2185);
        if (var3 != null && var3.field6623.field6829) {
            int var4 = var3.field6623.method38(true);
            if (this.field7087 != var4) {
                super.field5927 -= this.field7087;
                this.field7087 = var4;
                super.field5927 += var4;
            }
        }
        class661 var5 = arg1.method322();
        var5.method745();
        if (var3 == null || !var3.field6623.field6829) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class281 var9 = class683.field9250[super.field5921];
            int var10 = this.field7075 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1853(super.field5922 + var12, super.field5933 + var13, (byte) -102);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1853(super.field5922 + var15, super.field5933 - -var16, (byte) 94);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1853(super.field5922 + var18, super.field5933 + var19, (byte) -102);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1853(super.field5922 + var21, super.field5933 + var22, (byte) 5);
            int var24 = var14 >= var17 ? var17 : var14;
            int var25 = ~var23 < ~var20 ? var20 : var23;
            int var26 = ~var17 > ~var23 ? var17 : var23;
            if (var10 != 0) {
                int var27 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10)) & 16383;
                if (var27 != 0) {
                    var5.method756(var27);
                }
            }
            int var28 = ~var14 <= ~var20 ? var20 : var14;
            int var29 = var14 - -var23;
            if (var10 != 0) {
                int var30 = (int) (2607.5945876176133D * Math.atan2((double) (var28 - var26), (double) var10)) & 16383;
                if (~var30 != -1) {
                    var5.method768(-var30);
                }
            }
            if (~var29 < ~(var17 + var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field5927;
            if (var31 != 0) {
                var5.method752(0, var31, 0);
            }
        }
        var5.method752(super.field5922, super.field5927 + -10, super.field5933);
        class228 var32 = class345.method2171(3, true, false);
        this.field7082 = false;
        this.field7075 = 0;
        if (~this.field7071 != 0) {
            class472 var33 = class721.field9801.method162(arg0 ^ 108, this.field7071).method2206((class627) null, (class691) null, arg1, 2048, 0, this.field7077, 0, (byte) 88, -1);
            if (var33 != null) {
                if (class458.field6459) {
                    var33.method497(var5, var32.field3313[2], class58.field1146, 0);
                } else {
                    var33.method521(var5, var32.field3313[2], 0);
                }
                this.field7082 |= var33.method488();
                this.field7075 = var33.method513();
            }
        }
        if (~this.field7080 != 0) {
            class472 var34 = class721.field9801.method162(arg0 ^ -60, this.field7080).method2206((class627) null, (class691) null, arg1, 2048, 0, this.field7081, 0, (byte) 88, -1);
            if (var34 != null) {
                if (!class458.field6459) {
                    var34.method521(var5, var32.field3313[1], 0);
                } else {
                    var34.method497(var5, var32.field3313[1], class58.field1146, 0);
                }
                this.field7082 |= var34.method488();
                if (~var34.method513() < ~this.field7075) {
                    this.field7075 = var34.method513();
                }
            }
        }
        class472 var35 = class721.field9801.method162(-48, this.field7072).method2206((class627) null, (class691) null, arg1, 2048, 0, this.field7076, 0, (byte) 88, -1);
        if (var35 != null) {
            if (!class458.field6459) {
                var35.method521(var5, var32.field3313[0], 0);
            } else {
                var35.method497(var5, var32.field3313[0], class58.field1146, 0);
            }
            this.field7082 |= var35.method488();
            if (~var35.method513() < ~this.field7075) {
                this.field7075 = var35.method513();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field7084;
        if (arg0 != -25675) {
            field7085 = null;
        }
        return this.field7075;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        ++field7083;
        if (arg0 != 122) {
            this.method38(true);
        }
        return this.field7082;
    }

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 >= -12) {
            this.field7071 = -23;
        }
        ++field7078;
        return false;
    }
}
