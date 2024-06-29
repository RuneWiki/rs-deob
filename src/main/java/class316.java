import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class316 extends class208 {

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
    private int field4489 = 0;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    private int field4473 = 0;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    private int field4488 = 0;

    @OriginalMember(owner = "client!hc", name = "Fb", descriptor = "Z")
    private boolean field4507 = false;

    @OriginalMember(owner = "client!hc", name = "Jb", descriptor = "I")
    private int field4511 = 0;

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "Z")
    private boolean field4501 = false;

    @OriginalMember(owner = "client!hc", name = "Cb", descriptor = "I")
    private int field4504 = -1;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
    private int field4485;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    private int field4481;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Z")
    private boolean field4480;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!hc", name = "Qb", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lje;")
    private class98 field4478;

    @OriginalMember(owner = "client!hc", name = "Gb", descriptor = "Llja;")
    public static class724 field4508;

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "Llja;")
    public static class724 field4495 = field4508 = new class724(false);

    @OriginalMember(owner = "client!hc", name = "Rb", descriptor = "Lin;")
    public static class380 field4519 = new class380(58, -1);

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "D")
    private double field4483;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "D")
    private double field4487;

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "D")
    private double field4491;

    @OriginalMember(owner = "client!hc", name = "yb", descriptor = "D")
    private double field4500;

    @OriginalMember(owner = "client!hc", name = "Ab", descriptor = "D")
    private double field4502;

    @OriginalMember(owner = "client!hc", name = "Eb", descriptor = "D")
    private double field4506;

    @OriginalMember(owner = "client!hc", name = "Mb", descriptor = "D")
    private double field4514;

    @OriginalMember(owner = "client!hc", name = "Tb", descriptor = "D")
    private double field4521;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!hc", name = "wb", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!hc", name = "xb", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!hc", name = "Bb", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!hc", name = "Db", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!hc", name = "Ib", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!hc", name = "Kb", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!hc", name = "Nb", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!hc", name = "Pb", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!hc", name = "Sb", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!hc", name = "Ub", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "Leea;")
    private class187 field4497;

    @OriginalMember(owner = "client!hc", name = "Ob", descriptor = "[Lkm;")
    public static class208[] field4516;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I", line = 6)
    public final int method1167(int arg0) {
        if (arg0 <= 75) {
            return 41;
        } else {
            ++field4510;
            return this.field4489;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(BLha;)Lmg;", line = 23)
    public final class248 method205(byte arg0, class475 arg1) {
        ++field4512;
        if (arg0 != 45) {
            this.method1923(4);
        }
        return null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIB)V", line = 35)
    public final void method1919(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4471;
        if (!this.field4501) {
            double var6 = (double) (-super.field10347 + arg3);
            double var8 = (double) (-super.field10350 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4483 = (double) this.field4518 * var8 / var10 + (double) super.field10350;
            this.field4502 = (double) this.field4518 * var6 / var10 + (double) super.field10347;
            if (!this.field4480) {
                this.field4491 = (double) super.field10358;
            } else {
                this.field4491 = (double) (class577.method3399((int) this.field4483, (int) this.field4502, -8724, super.field10361) + -this.field4474);
            }
        }
        int var12 = 109 / ((-15 - arg4) / 51);
        double var13 = (double) (-arg2 + 1 + this.field4475);
        this.field4506 = ((double) arg3 + -this.field4502) / var13;
        this.field4500 = ((double) arg0 + -this.field4483) / var13;
        this.field4514 = Math.sqrt(this.field4506 * this.field4506 + this.field4500 * this.field4500);
        if (this.field4485 == -1) {
            this.field4521 = ((double) arg1 + -this.field4491) / var13;
        } else {
            if (!this.field4501) {
                this.field4521 = -this.field4514 * Math.tan((double) this.field4485 * 0.02454369D);
            }
            this.field4487 = ((double) arg1 - this.field4491 + -(this.field4521 * var13)) * 2.0D / (var13 * var13);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 77)
    public final void method1920(int arg0, int arg1) {
        this.field4501 = true;
        this.field4502 += (double) arg1 * this.field4506;
        this.field4483 += (double) arg1 * this.field4500;
        ++field4517;
        if (!this.field4480) {
            if (~this.field4485 == 0) {
                this.field4491 += (double) arg1 * this.field4521;
            } else {
                this.field4491 += this.field4487 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4521;
                this.field4521 += (double) arg1 * this.field4487;
            }
        } else {
            this.field4491 = (double) (class577.method3399((int) this.field4483, (int) this.field4502, -8724, super.field10361) + -this.field4474);
        }
        if (arg0 != -1) {
            this.field4514 = 0.5115092949050885D;
        }
        this.field4469 = 16383 & (int) (Math.atan2(this.field4506, this.field4500) * 2607.5945876176133D) + 8192;
        this.field4484 = (int) (Math.atan2(this.field4521, this.field4514) * 2607.5945876176133D) & 16383;
        if (this.field4478 != null) {
            this.field4511 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field4511 >= ~this.field4478.field1388[this.field4473]) {
                            return;
                        }
                        this.field4511 -= this.field4478.field1388[this.field4473];
                        ++this.field4473;
                        if (this.field4478.field1402.length <= this.field4473) {
                            this.field4473 -= this.field4478.field1411;
                            if (this.field4473 < 0 || this.field4478.field1402.length <= this.field4473) {
                                this.field4473 = 0;
                            }
                        }
                        this.field4504 = this.field4473 + 1;
                    } while (~this.field4504 > ~this.field4478.field1402.length);
                    this.field4504 -= this.field4478.field1411;
                } while (this.field4504 >= 0 && ~this.field4504 > ~this.field4478.field1402.length);
                this.field4504 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)Z", line = 138)
    public final boolean method1175(byte arg0) {
        ++field4520;
        if (arg0 < 38) {
            this.field4514 = -2.3557635586774044D;
        }
        return this.field4507;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(ILha;)V", line = 150)
    public final void method192(int arg0, class475 arg1) {
        if (arg0 <= 2) {
            this.field4506 = 0.49718375035715906D;
        }
        ++field4479;
        class233 var3 = this.method1921(8192, 0, arg1);
        if (var3 != null) {
            class765 var4 = arg1.method457();
            var4.method1562(this.field4484);
            var4.method1566(this.field4469);
            var4.method1558((int) this.field4502, (int) this.field4491, (int) this.field4483);
            this.field4489 = var3.method534();
            this.field4488 = var3.method544();
            this.method1925(arg1, var4, var3, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILha;)Lka;", line = 178)
    private final class233 method1921(int arg0, int arg1, class475 arg2) {
        if (arg0 != 8192) {
            method1924(-54);
        }
        ++field4494;
        class113 var4 = class620.field8760.method1832(arg0 + -8300, this.field4513);
        return var4.method938(this.field4473, this.field4504, arg2, this.field4511, arg1, class168.field2552, 29582);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lha;I)Luh;", line = 192)
    public final class162 method204(class475 arg0, int arg1) {
        ++field4503;
        if (arg1 != -1) {
            this.field4514 = 0.2941648715796035D;
        }
        class233 var3 = this.method1921(8192, 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            class765 var4 = arg0.method457();
            var4.method1562(this.field4484);
            var4.method1566(this.field4469);
            var4.method1558((int) this.field4502, (int) this.field4491, (int) this.field4483);
            this.method1925(arg0, var4, var3, (byte) -111);
            class162 var5 = class527.method3085(1, false, 0);
            if (!class765.field10581) {
                var3.method575(var4, var5.field2500[0], 0);
            } else {
                var3.method546(var4, var5.field2500[0], class349.field4956, 0);
            }
            if (this.field4497 != null) {
                class667 var6 = this.field4497.method1346();
                if (class765.field10581) {
                    arg0.method429(var6, class349.field4956);
                } else {
                    arg0.method455(var6);
                }
            }
            this.field4507 = var3.method558();
            this.field4489 = var3.method534();
            this.field4488 = var3.method544();
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 239)
    protected final void finalize() {
        if (this.field4497 != null) {
            this.field4497.method1344();
        }
        ++field4499;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V", line = 249)
    public class316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, class577.method3399(arg4, arg3, -8724, arg1) + -arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field4485 = arg8;
        this.field4481 = arg14;
        this.field4501 = false;
        this.field4480 = arg13;
        this.field4476 = arg6;
        this.field4513 = arg0;
        this.field4475 = arg7;
        this.field4518 = arg9;
        this.field4493 = arg10;
        this.field4474 = arg5;
        this.field4472 = arg12;
        this.field4509 = arg11;
        int var16 = class620.field8760.method1832(-104, this.field4513).field1628;
        if (~var16 != 0) {
            this.field4478 = class168.field2552.method3287(118, var16);
        } else {
            this.field4478 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 282)
    public final void method1922(int arg0) {
        if (arg0 != -1) {
            this.method192(11, (class475) null);
        }
        ++field4498;
        if (!this.field4501) {
            if (this.field4493 != 0) {
                class281 var2 = null;
                if (this.field4493 >= 0) {
                    int var3 = this.field4493 + -1;
                    class647 var4 = (class647) class486.field6697.method4253((long) var3, arg0);
                    if (var4 != null) {
                        var2 = var4.field9191;
                    }
                } else {
                    int var5 = -this.field4493 - 1;
                    if (~class541.field7492 != ~var5) {
                        var2 = class588.field8451[var5];
                    } else {
                        var2 = class719.field10041;
                    }
                }
                if (var2 != null) {
                    super.field10347 = var2.field10347;
                    super.field10350 = var2.field10350;
                    super.field10358 = class577.method3399(var2.field10350, var2.field10347, -8724, super.field10361) - this.field4474;
                    if (this.field4481 >= 0) {
                        class31 var6 = var2.method1783(true);
                        int var7 = 0;
                        int var8 = 0;
                        if (var6.field384 != null && var6.field384[this.field4481] != null) {
                            var8 += var6.field384[this.field4481][2];
                            var7 += var6.field384[this.field4481][0];
                        }
                        if (var6.field372 != null && var6.field372[this.field4481] != null) {
                            var7 += var6.field372[this.field4481][0];
                            var8 += var6.field372[this.field4481][2];
                        }
                        if (~var7 != -1 || ~var8 != -1) {
                            int var9 = var2.field4067.method1856(0);
                            int var10 = var9;
                            if (var2.field4125 != null && ~var2.field4125[this.field4481] != 0) {
                                var10 = var2.field4125[this.field4481];
                            }
                            int var11 = 16383 & -var9 + var10;
                            int var12 = class253.field3634[var11];
                            int var13 = class253.field3633[var11];
                            int var14 = var8 * var12 - -(var7 * var13) >> 14;
                            int var15 = var8 * var13 + -(var7 * var12) >> 14;
                            super.field10347 += var14;
                            super.field10350 += var15;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I", line = 380)
    public final int method1173(boolean arg0) {
        if (!arg0) {
            return -15;
        } else {
            ++field4496;
            return this.field4488;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIILha;)Z", line = 394)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        int var5 = -43 / ((51 - arg0) / 51);
        ++field4515;
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)V", line = 407)
    public final void method1923(int arg0) {
        if (this.field4497 != null) {
            this.field4497.method1344();
        }
        ++field4522;
        if (arg0 != -28690) {
            this.method197(true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V", line = 421)
    public final void method1445(int arg0) {
        super.field3027 = super.field3030 = (short) ((int) (this.field4502 / 512.0D));
        super.field3035 = super.field3038 = (short) ((int) (this.field4483 / 512.0D));
        if (arg0 == 245373737) {
            ++field4477;
        }
    }

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "(I)V", line = 435)
    public static void method1924(int arg0) {
        field4516 = null;
        field4495 = null;
        field4519 = null;
        field4508 = null;
        if (arg0 > -81) {
            field4508 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z", line = 450)
    public final boolean method1170(int arg0) {
        ++field4482;
        if (arg0 != 16383) {
            this.method198((byte) 109, 95, 101, (class475) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)Z", line = 463)
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field4492;
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 490)
    public final void method196(int arg0) {
        if (arg0 != -10382) {
            this.field4475 = -111;
        }
        ++field4490;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lha;Ldm;Lka;B)V", line = 509)
    private final void method1925(class475 arg0, class765 arg1, class233 arg2, byte arg3) {
        arg2.method582(arg1);
        if (arg3 > -103) {
            this.method1925((class475) null, (class765) null, (class233) null, (byte) 93);
        }
        ++field4470;
        class335[] var5 = arg2.method590();
        class740[] var6 = arg2.method588();
        if ((this.field4497 == null || this.field4497.field2814) && (var5 != null || var6 != null)) {
            this.field4497 = class187.method1349(class594.field8494, true);
        }
        if (this.field4497 != null) {
            this.field4497.method1347(arg0, (long) class594.field8494, var5, var6, false);
            this.field4497.method1355(super.field10361, super.field3027, super.field3030, super.field3035, super.field3038);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 542)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field4505;
        if (arg0 == -24659) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "(I)Z", line = 557)
    public static final boolean method1926(int arg0) {
        ++field4486;
        Hashtable var1 = new Hashtable();
        if (arg0 != 7957) {
            method1924(122);
        }
        Enumeration var2 = class488.field6709.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class488.field6709.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class488.field6709.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class156.field2453.get(var9);
                        Class var11 = (Class) class488.field6709.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var12.size() < ~var13; ++var13) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class488.field6709 = var1;
        return class488.field6709.isEmpty();
    }
}
