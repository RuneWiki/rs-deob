import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class313 {

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    private int field4419 = 32;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Z")
    private boolean field4425 = false;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "J")
    private long field4430 = class524.method3075(18);

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    private int field4437 = 0;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    private int field4446 = 0;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "[Lca;")
    private class306[] field4443 = new class306[8];

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
    private boolean field4439 = true;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    private int field4445 = 0;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "J")
    private long field4450 = 0L;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "[Lca;")
    private class306[] field4441 = new class306[8];

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "J")
    private long field4449 = 0L;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    private int field4440 = 0;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field4434 = -2;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "[C")
    public static char[] field4435 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lca;")
    private class306 field4424;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "[I")
    public int[] field4432;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "[Z")
    public static boolean[] field4428;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V", line = 6)
    public void method1393() {
        field4423++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLca;)V", line = 13)
    public final synchronized void method1975(byte arg0, class306 arg1) {
        if (arg0 != 37) {
            this.method1393();
        }
        field4417++;
        this.field4424 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 24)
    public final synchronized void method1976(int arg0) {
        field4447++;
        this.field4439 = true;
        try {
            this.method1394();
        } catch (Exception var2) {
            this.method1393();
            this.field4450 = class524.method3075(18) + 2000L;
        }
        if (arg0 != -2988) {
            this.method1981(-3);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 45)
    public void method1392(int arg0) throws Exception {
        field4429++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 53)
    public static void method1977(byte arg0) {
        field4428 = null;
        field4435 = null;
        int var1 = -80 % ((81 - arg0) / 41);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 63)
    public static final int method1978(String arg0, boolean arg1, int arg2, int arg3) {
        field4433++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        if (arg3 != -1) {
            field4434 = -127;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()V", line = 141)
    public void method1394() throws Exception {
        field4415++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I", line = 150)
    public static final int method1979(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field4416++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != -22372) {
            method1979(-99, 58, 90);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 173)
    public void method1397(Component arg0) throws Exception {
        field4442++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V", line = 182)
    private final void method1980(int arg0, int arg1) {
        field4420++;
        this.field4440 -= arg1;
        if (this.field4440 < 0) {
            this.field4440 = 0;
        }
        if (arg0 >= 30 && this.field4424 != null) {
            this.field4424.method1482(arg1);
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 200)
    public final synchronized void method1981(int arg0) {
        field4422++;
        if (this.field4425) {
            return;
        }
        long var2 = class524.method3075(18);
        try {
            if (var2 > this.field4430 + 6000L) {
                this.field4430 = var2 - 6000L;
            }
            while ((this.field4430 + 5000L) < var2) {
                this.method1980(118, 256);
                this.field4430 += (256000 / client.field4279);
                var2 = class524.method3075(18);
            }
        } catch (Exception var7) {
            this.field4430 = var2;
        }
        if (this.field4432 == null) {
            return;
        }
        try {
            if (this.field4450 != 0L) {
                if (var2 < this.field4450) {
                    return;
                }
                this.method1392(this.field4451);
                this.field4439 = true;
                this.field4450 = 0L;
            }
            int var4 = this.method1391();
            if (arg0 != 0) {
                this.field4424 = null;
            }
            if (this.field4445 < (this.field4437 - var4)) {
                this.field4445 = this.field4437 - var4;
            }
            int var5 = this.field4448 + this.field4436;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field4451 < var5 + 256) {
                this.field4451 += 1024;
                if (this.field4451 > 16384) {
                    this.field4451 = 16384;
                }
                this.method1393();
                var4 = 0;
                this.method1392(this.field4451);
                this.field4439 = true;
                if (this.field4451 < var5 + 256) {
                    var5 = this.field4451 - 256;
                    this.field4448 = var5 - this.field4436;
                }
            }
            while (var4 < var5) {
                this.method1982(this.field4432, 256);
                this.method1395();
                var4 += 256;
            }
            if (this.field4449 < var2) {
                if (this.field4439) {
                    this.field4439 = false;
                } else if (this.field4445 == 0 && this.field4446 == 0) {
                    this.method1393();
                    this.field4450 = var2 + 2000L;
                    return;
                } else {
                    this.field4448 = Math.min(this.field4446, this.field4445);
                    this.field4446 = this.field4445;
                }
                this.field4445 = 0;
                this.field4449 = var2 + 2000L;
            }
            this.field4437 = var4;
        } catch (Exception var6) {
            this.method1393();
            this.field4450 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()I", line = 323)
    public int method1391() throws Exception {
        field4418++;
        return this.field4451;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([II)V", line = 334)
    private final void method1982(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class266.field3798) {
            var3 = arg1 << 1;
        }
        class319.method2019(arg0, 0, var3);
        this.field4440 -= arg1;
        if (this.field4424 != null && this.field4440 <= 0) {
            this.field4440 += client.field4279 >> 4;
            class294.method1866(this.field4424, (byte) 70);
            this.method1985(-2058033435, this.field4424.method1933(), this.field4424);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class306 var10 = null;
                        class306 var11 = this.field4441[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class104 var12 = var11.field4328;
                                if (var12 == null || var12.field1468 <= var8) {
                                    var11.field4329 = true;
                                    int var13 = var11.method1497();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1468 += var13;
                                    }
                                    if (var4 >= this.field4419) {
                                        break label107;
                                    }
                                    class306 var14 = var11.method1485();
                                    if (var14 != null) {
                                        int var15 = var11.field4330;
                                        while (var14 != null) {
                                            this.method1985(-2058033435, var15 * var14.method1933() >> 8, var14);
                                            var14 = var11.method1488();
                                        }
                                    }
                                    class306 var16 = var11.field4331;
                                    var11.field4331 = null;
                                    if (var10 == null) {
                                        this.field4441[var7] = var16;
                                    } else {
                                        var10.field4331 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4443[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4331;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class306 var18 = this.field4441[var17];
                this.field4441[var17] = this.field4443[var17] = null;
                while (var18 != null) {
                    class306 var19 = var18.field4331;
                    var18.field4331 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4440 < 0) {
            this.field4440 = 0;
        }
        if (this.field4424 != null) {
            this.field4424.method1491(arg0, 0, arg1);
        }
        this.field4430 = class524.method3075(18);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lha;I)V", line = 493)
    public static final void method1983(class60 arg0, int arg1) {
        field4438++;
        if (!(class68.field969 >= 2 || class282.field3986) || class609.field8613 != null) {
            return;
        }
        String var2;
        if (class282.field3986 && class68.field969 < 2) {
            var2 = class298.field4229 + class430.field6402.method2679(class650.field9160, arg1 + 18136) + class29.field278 + " ->";
        } else if (class209.field3064 && class35.field371.method2474(81, (byte) 127) && class68.field969 > 2) {
            var2 = class180.method1277((byte) -85, class456.field6722);
        } else {
            class342 var3 = class456.field6722;
            if (var3 == null) {
                return;
            }
            var2 = class180.method1277((byte) -85, var3);
            int[] var4 = null;
            if (class88.method713(0, var3.field4972)) {
                var4 = class336.field4876.method2079((int) var3.field4971, (byte) 105).field8219;
            } else if (var3.field4961 != -1) {
                var4 = class336.field4876.method2079(var3.field4961, (byte) -108).field8219;
            } else if (class615.method3555(var3.field4972, 5066)) {
                class432 var7 = (class432) class497.field7067.method2287((long) ((int) var3.field4971), (byte) -117);
                if (var7 != null) {
                    class282 var8 = var7.field6439;
                    class348 var9 = var8.field4008;
                    if (var9.field5076 != null) {
                        var9 = var9.method2207(114, class83.field1160);
                    }
                    if (var9 != null) {
                        var4 = var9.field5045;
                    }
                }
            } else if (class348.method2203((byte) 87, var3.field4972)) {
                Object var5 = null;
                class211 var6;
                if (var3.field4972 == 1008) {
                    var6 = class239.field3470.method388((int) var3.field4971, arg1 ^ 0xFFFFB9C3);
                } else {
                    var6 = class239.field3470.method388((int) (var3.field4971 >>> 32 & 0x7FFFFFFFL), arg1 + 18109);
                }
                if (var6.field3172 != null) {
                    var6 = var6.method1442((byte) -42, class83.field1160);
                }
                if (var6 != null) {
                    var4 = var6.field3098;
                }
            }
            if (var4 != null) {
                var2 = var2 + class518.method3056(arg1 + 18009, var4);
            }
        }
        if (class68.field969 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class68.field969 - 2) + class430.field6395.method2679(class650.field9160, -62);
        }
        if (class289.field4118 != null) {
            class61 var10 = class289.field4118.method345(arg0, -94);
            if (var10 == null) {
                var10 = class298.field4225;
            }
            var10.method547(class289.field4118.field592, class289.field4118.field651, var2, class289.field4118.field549, arg1 ^ 0xFFFFB983, class374.field5678, class289.field4118.field574, class259.field3701, class296.field4213, class409.field6169, class299.field4250, class289.field4118.field548, class371.field5324, class289.field4118.field628, class673.field9385);
            class235.method1563(100, class673.field9385[3], class673.field9385[0], class673.field9385[2], class673.field9385[1]);
        } else if (class61.field871 != null && class555.field7936 == class199.field2993) {
            int var11 = class298.field4225.method549(0, (byte) 113, class374.field5678, class409.field6169, class259.field3701, class299.field4250, var2, class352.field5124 + 16, class501.field7121 + 4, 16777215);
            class235.method1563(arg1 + 18109, 16, class501.field7121 + 4, var11 + class335.field4827.method587(-57, var2), class352.field5124);
        }
        if (arg1 != -18009) {
            field4428 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()V", line = 601)
    public void method1395() throws Exception {
        field4426++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIB)V", line = 631)
    public static final void method1984(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4427++;
        for (class449 var5 = (class449) class269.field3852.method1195(0); var5 != null; var5 = (class449) class269.field3852.method1201(2)) {
            class760.method4231(var5, arg0, arg1, arg2, (byte) -127, arg3);
        }
        class449 var6 = (class449) class478.field6929.method1195(0);
        if (arg4 != -34) {
            method1978(null, false, 107, -22);
        }
        while (var6 != null) {
            byte var12 = 1;
            class264 var13 = var6.field6646.method2577(arg4 ^ 0x21);
            if (var6.field6646.field6123 == -1 || var6.field6646.field6032) {
                var12 = 0;
            } else if (var6.field6646.field6123 == var13.field3740 || var6.field6646.field6123 == var13.field3764 || var6.field6646.field6123 == var13.field3759 || var6.field6646.field6123 == var13.field3747) {
                var12 = 2;
            } else if (var6.field6646.field6123 == var13.field3763 || var6.field6646.field6123 == var13.field3779 || var6.field6646.field6123 == var13.field3738 || var6.field6646.field6123 == var13.field3762) {
                var12 = 3;
            }
            if (var6.field6629 != var12) {
                int var14 = class284.method1819(var6.field6646, (byte) -113);
                class348 var15 = var6.field6646.field4008;
                if (var15.field5076 != null) {
                    var15 = var15.method2207(arg4 + 155, class83.field1160);
                }
                if (var15 == null || var14 == -1) {
                    var6.field6638 = false;
                    var6.field6641 = -1;
                    var6.field6629 = var12;
                } else if (var6.field6641 == var14 && var15.field5065 == var6.field6638) {
                    var6.field6629 = var12;
                    var6.field6651 = var15.field5060;
                } else {
                    boolean var16 = false;
                    if (var6.field6659 == null) {
                        var16 = true;
                    } else {
                        var6.field6651 -= 512;
                        if (var6.field6651 <= 0) {
                            class171.field2666.method3834(var6.field6659);
                            var6.field6659 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field6651 = var15.field5060;
                        var6.field6641 = var14;
                        var6.field6642 = null;
                        var6.field6631 = null;
                        var6.field6629 = var12;
                        var6.field6638 = var15.field5065;
                    }
                }
            }
            var6.field6636 = var6.field6646.field8423;
            var6.field6650 = var6.field6646.field8423 + (var6.field6646.method2579(false) << 8);
            var6.field6637 = var6.field6646.field8428;
            var6.field6658 = var6.field6646.field8428 + (var6.field6646.method2579(false) << 8);
            class760.method4231(var6, arg0, arg1, arg2, (byte) -50, arg3);
            var6 = (class449) class478.field6929.method1201(2);
        }
        for (class449 var7 = (class449) class87.field1236.method2283(false); var7 != null; var7 = (class449) class87.field1236.method2282((byte) 105)) {
            byte var8 = 1;
            class264 var9 = var7.field6660.method2577(-1);
            if (var7.field6660.field6123 == -1 || var7.field6660.field6032) {
                var8 = 0;
            } else if (var7.field6660.field6123 == var9.field3740 || var7.field6660.field6123 == var9.field3764 || var7.field6660.field6123 == var9.field3759 || var7.field6660.field6123 == var9.field3747) {
                var8 = 2;
            } else if (var7.field6660.field6123 == var9.field3763 || var7.field6660.field6123 == var9.field3779 || var7.field6660.field6123 == var9.field3738 || var7.field6660.field6123 == var9.field3762) {
                var8 = 3;
            }
            if (var7.field6629 != var8) {
                int var10 = class390.method2502(var7.field6660, (byte) -11);
                if (var7.field6641 == var10 && var7.field6638 == var7.field6660.field9493) {
                    var7.field6629 = var8;
                    var7.field6651 = var7.field6660.field9506;
                } else {
                    boolean var11 = false;
                    if (var7.field6659 == null) {
                        var11 = true;
                    } else {
                        var7.field6651 -= 512;
                        if (var7.field6651 <= 0) {
                            class171.field2666.method3834(var7.field6659);
                            var7.field6659 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field6641 = var10;
                        var7.field6629 = var8;
                        var7.field6631 = null;
                        var7.field6638 = var7.field6660.field9493;
                        var7.field6642 = null;
                        var7.field6651 = var7.field6660.field9506;
                    }
                }
            }
            var7.field6636 = var7.field6660.field8423;
            var7.field6650 = var7.field6660.field8423 + (var7.field6660.method2579(false) << 8);
            var7.field6637 = var7.field6660.field8428;
            var7.field6658 = var7.field6660.field8428 + (var7.field6660.method2579(false) << 8);
            class760.method4231(var7, arg0, arg1, arg2, (byte) -66, arg3);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILca;)V", line = 807)
    private final void method1985(int arg0, int arg1, class306 arg2) {
        field4431++;
        if (arg0 != -2058033435) {
            method1984(-25, -58, 89, 114, (byte) -126);
        }
        int var4 = arg1 >> 5;
        class306 var5 = this.field4443[var4];
        if (var5 == null) {
            this.field4441[var4] = arg2;
        } else {
            var5.field4331 = arg2;
        }
        this.field4443[var4] = arg2;
        arg2.field4330 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V", line = 849)
    public static final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= class497.field7073 && class391.field5895 >= arg6 && class166.field2622 <= arg4 && class432.field6446 >= arg3) {
            if (arg0 == 1) {
                class171.method1232(arg3, arg4, arg2, arg6, arg1, -26674);
            } else {
                class469.method2841(arg4, arg1, arg2, arg3, true, arg0, arg6);
            }
        } else if (arg0 == 1) {
            class183.method1293(arg6, arg4, arg3, arg1, (byte) -85, arg2);
        } else {
            class61.method548(arg2, arg0, arg3, arg4, arg6, (byte) -96, arg1);
        }
        field4444++;
        if (arg5 != 0) {
            method1983(null, -82);
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V", line = 881)
    public final synchronized void method1987(int arg0) {
        if (arg0 > -23) {
            method1984(-64, -36, 118, -64, (byte) 74);
        }
        field4421++;
        if (class740.field10382 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class740.field10382.field6998[var3] == this) {
                    class740.field10382.field6998[var3] = null;
                }
                if (class740.field10382.field6998[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class740.field10382.field7003 = true;
                while (class740.field10382.field6997) {
                    class277.method1759(50L, 118);
                }
                class740.field10382 = null;
            }
        }
        this.method1393();
        this.field4432 = null;
        this.field4425 = true;
    }
}
