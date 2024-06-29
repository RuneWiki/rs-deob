import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class265 extends class240 {

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    private int field4553 = 10;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    private int field4564 = 2048;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    private int field4551 = 0;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lcd;")
    public static class64 field4552 = class44.method335((byte) 71, "Okay");

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field4562 = 0;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "Lvd;")
    public static class127 field4566;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lqd;")
    public static class40 field4558;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lja;")
    public static class60 field4561;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[I")
    private int[] field4559;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "[I")
    private int[] field4563;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 20)
    public static void method1856(int arg0) {
        field4552 = null;
        field4561 = null;
        if (arg0 != -1) {
            field4566 = (class127) null;
        }
        field4558 = null;
        field4566 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 162)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            field4554 = -7;
        }
        field4560++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1];
            if (this.field4551 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4553; var12++) {
                    if (var4 >= this.field4559[var12] && var4 < this.field4559[var12 + 1]) {
                        if (this.field4563[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class95.method718(var3, 0, class169.field2936, var11);
            } else {
                for (int var5 = 0; var5 < class169.field2936; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class74.field1408[var5];
                    int var9 = this.field4551;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var8 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field4553; var10++) {
                        if (var6 >= this.field4559[var10] && this.field4559[var10 + 1] > var6) {
                            if (this.field4563[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILkh;)V", line = 176)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field4553 = arg2.method152((byte) -91);
        } else if (arg1 == 1) {
            this.field4564 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field4551 = arg2.method152((byte) -86);
        }
        if (arg0 != 2) {
            this.method16(-81, 118, (class13) null);
        }
        field4549++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lja;ILcd;)Lcd;", line = 211)
    public static final class64 method1857(class60 arg0, int arg1, class64 arg2) {
        field4555++;
        int var3 = -125 % ((-arg1 - 26) / 63);
        if (arg2.method500(39, class3.field32) == -1) {
            return arg2;
        }
        while (true) {
            int var4 = arg2.method500(24, class55.field919);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg2.method500(27, class103.field1913);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg2.method500(-120, class288.field4925);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg2.method500(-120, class252.field4387);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg2.method500(26, class53.field847);
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg2.method500(112, class159.field2808);
                                                    if (var9 == -1) {
                                                        return arg2;
                                                    }
                                                    class64 var10 = class188.field3240;
                                                    if (class106.field1956 != null) {
                                                        var10 = class164.method1173((byte) -29, class106.field1956.field376);
                                                        try {
                                                            if (class106.field1956.field377 != null) {
                                                                byte[] var11 = ((String) class106.field1956.field377).getBytes("ISO-8859-1");
                                                                var10 = class292.method2015(0, var11, 0, var11.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var13) {
                                                        }
                                                    }
                                                    arg2 = class104.method768(new class64[] { arg2.method524(var9, (byte) 68, 0), var10, arg2.method508((byte) 99, var9 + 4) }, false);
                                                }
                                            }
                                            arg2 = class104.method768(new class64[] { arg2.method524(var8, (byte) 62, 0), class195.method1370((byte) -102, class175.method1223(0, 4, arg0)), arg2.method508((byte) 99, var8 + 2) }, false);
                                        }
                                    }
                                    arg2 = class104.method768(new class64[] { arg2.method524(var7, (byte) 58, 0), class195.method1370((byte) -102, class175.method1223(0, 3, arg0)), arg2.method508((byte) 99, var7 + 2) }, false);
                                }
                            }
                            arg2 = class104.method768(new class64[] { arg2.method524(var6, (byte) 70, 0), class195.method1370((byte) -102, class175.method1223(0, 2, arg0)), arg2.method508((byte) 99, var6 + 2) }, false);
                        }
                    }
                    arg2 = class104.method768(new class64[] { arg2.method524(var5, (byte) 126, 0), class195.method1370((byte) -102, class175.method1223(0, 1, arg0)), arg2.method508((byte) 99, var5 + 2) }, false);
                }
            }
            arg2 = class104.method768(new class64[] { arg2.method524(var4, (byte) 98, 0), class195.method1370((byte) -102, class175.method1223(0, 0, arg0)), arg2.method508((byte) 99, var4 + 2) }, false);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIJ)Z", line = 313)
    public static final boolean method1858(int arg0, int arg1, int arg2, long arg3) {
        int var5 = (int) arg3 >> 20 & 0x3;
        int var6 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        field4557++;
        int var7 = (int) arg3 >> 14 & 0x1F;
        if (arg2 < 124) {
            return true;
        }
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class290 var8 = class172.method1207(var6, -125);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field5017;
                var9 = var8.field4957;
            } else {
                var9 = var8.field5017;
                var10 = var8.field4957;
            }
            int var11 = var8.field4996;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class85.method650(0, 2, 0, -12920, arg1, arg0, var10, true, class139.field2472.field1876[0], class139.field2472.field1898[0], var11, var9);
        } else {
            class85.method650(var7 + 1, 2, var5, -12920, arg1, arg0, 0, true, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
        }
        class237.field3995 = 2;
        class277.field4778 = class268.field4609;
        class237.field4004 = class238.field4061;
        class238.field4051 = 0;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 364)
    public final void method288(int arg0) {
        field4565++;
        this.method1859(206);
        if (arg0 != 17772) {
            this.method12(-97, 73);
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V", line = 400)
    private final void method1859(int arg0) {
        this.field4559 = new int[this.field4553 + 1];
        field4556++;
        this.field4563 = new int[this.field4553 + 1];
        int var2 = 4096 / this.field4553;
        int var3 = 0;
        int var4 = this.field4564 * var2 >> 12;
        if (arg0 != 206) {
            method1858(92, 44, -117, 95L);
        }
        for (int var5 = 0; var5 < this.field4553; var5++) {
            this.field4559[var5] = var3;
            this.field4563[var5] = var3 + var4;
            var3 += var2;
        }
        this.field4559[this.field4553] = 4096;
        this.field4563[this.field4553] = this.field4563[0] + 4096;
    }
}
