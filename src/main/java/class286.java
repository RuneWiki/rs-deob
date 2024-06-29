import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class286 {

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Luc;")
    private class202 field4465 = new class202();

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Luc;")
    private class202 field4475 = new class202();

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Luc;")
    private class202 field4476 = new class202();

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Luc;")
    private class202 field4478 = new class202();

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Laj;")
    private class1 field4482 = new class1(4);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public volatile int field4483 = 0;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public volatile int field4484 = 0;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "B")
    private byte field4486 = 0;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Laj;")
    private class1 field4485 = new class1(8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4456 = "glow3:";

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "J")
    private long field4480;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Ldk;")
    private class226 field4487;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lkc;")
    private class41 field4481;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 4)
    public final void method1995(int arg0) {
        if (arg0 == 128) {
            if (this.field4481 != null) {
                this.field4481.method378((byte) -121);
            }
            field4474++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 19)
    private final void method1996(boolean arg0) {
        if (arg0) {
            field4456 = (String) null;
        }
        field4469++;
        if (this.field4481 == null) {
            return;
        }
        try {
            this.field4482.field48 = 0;
            this.field4482.method21(64, 6);
            this.field4482.method17(3, (byte) 109);
            this.field4481.method373(1, 0, this.field4482.field34, 4);
        } catch (IOException var5) {
            try {
                this.field4481.method371(-2);
            } catch (Exception var4) {
            }
            this.field4484 = -2;
            this.field4481 = null;
            this.field4483++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I", line = 53)
    private final int method1997(byte arg0) {
        if (arg0 == -77) {
            field4477++;
            return this.field4476.method1450((byte) -107) + this.field4478.method1450((byte) -85);
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z", line = 65)
    public final boolean method1998(byte arg0) {
        if (arg0 == -122) {
            field4462++;
            return this.method1997((byte) -77) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Z", line = 76)
    public final boolean method1999(boolean arg0) {
        field4457++;
        if (this.field4481 != null) {
            long var2 = class212.method1543(22326);
            int var4 = (int) (var2 - this.field4480);
            this.field4480 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4479 += var4;
            if (this.field4479 > 30000) {
                try {
                    this.field4481.method371(-2);
                } catch (Exception var30) {
                }
                this.field4481 = null;
            }
        }
        if (this.field4481 == null) {
            return this.method2006(18744) == 0 && this.method1997((byte) -77) == 0;
        }
        try {
            this.field4481.method374((byte) 127);
            for (class226 var6 = (class226) this.field4465.method1449(40); var6 != null; var6 = (class226) this.field4465.method1448(23)) {
                this.field4482.field48 = 0;
                this.field4482.method21(120, 1);
                this.field4482.method17((int) var6.field2003, (byte) 60);
                this.field4481.method373(1, 0, this.field4482.field34, 4);
                this.field4475.method1453(var6, -105);
            }
            class226 var7 = (class226) this.field4476.method1449(126);
            if (arg0) {
                this.field4479 = -71;
            }
            while (var7 != null) {
                this.field4482.field48 = 0;
                this.field4482.method21(83, 0);
                this.field4482.method17((int) var7.field2003, (byte) 111);
                this.field4481.method373(1, 0, this.field4482.field34, 4);
                this.field4478.method1453(var7, 121);
                var7 = (class226) this.field4476.method1448(23);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4481.method370((byte) 124);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4479 = 0;
                byte var10 = 0;
                if (this.field4487 == null) {
                    var10 = 8;
                } else if (this.field4487.field3498 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field4487.field3499.field34.length - this.field4487.field3504;
                    int var12 = 512 - this.field4487.field3498;
                    if (var11 - this.field4487.field3499.field48 < var12) {
                        var12 = var11 - this.field4487.field3499.field48;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field4481.method377(10647, this.field4487.field3499.field48, var12, this.field4487.field3499.field34);
                    if (this.field4486 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4487.field3499.field34[this.field4487.field3499.field48 + var13] = (byte) class85.method677(this.field4487.field3499.field34[this.field4487.field3499.field48 + var13], this.field4486);
                        }
                    }
                    this.field4487.field3498 += var12;
                    this.field4487.field3499.field48 += var12;
                    if (this.field4487.field3499.field48 == var11) {
                        this.field4487.method981(-114);
                        this.field4487.field2433 = false;
                        this.field4487 = null;
                    } else if (this.field4487.field3498 == 512) {
                        this.field4487.field3498 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4485.field48;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field4481.method377(10647, this.field4485.field48, var14, this.field4485.field34);
                    if (this.field4486 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4485.field34[this.field4485.field48 + var15] = (byte) class85.method677(this.field4485.field34[this.field4485.field48 + var15], this.field4486);
                        }
                    }
                    this.field4485.field48 += var14;
                    if (var10 <= this.field4485.field48) {
                        if (this.field4487 == null) {
                            this.field4485.field48 = 0;
                            int var16 = this.field4485.method15((byte) -116);
                            int var17 = this.field4485.method56(19612);
                            int var18 = this.field4485.method15((byte) 113);
                            int var19 = var18 & 0x7F;
                            Object var20 = null;
                            int var21 = this.field4485.method33(false);
                            boolean var22 = (var18 & 0x80) != 0;
                            long var23 = (long) ((var16 << 16) + var17);
                            class226 var25;
                            if (var22) {
                                for (var25 = (class226) this.field4478.method1449(69); var25 != null && var25.field2003 != var23; var25 = (class226) this.field4478.method1448(23)) {
                                }
                            } else {
                                for (var25 = (class226) this.field4475.method1449(56); var25 != null && var25.field2003 != var23; var25 = (class226) this.field4475.method1448(23)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field4487 = var25;
                            int var26 = var19 == 0 ? 5 : 9;
                            this.field4487.field3499 = new class1(var21 + var26 + this.field4487.field3504);
                            this.field4487.field3499.method21(88, var19);
                            this.field4487.field3499.method11(var21, 31932);
                            this.field4487.field3498 = 8;
                            this.field4485.field48 = 0;
                        } else if (this.field4487.field3498 != 0) {
                            throw new IOException();
                        } else if (this.field4485.field34[0] == -1) {
                            this.field4485.field48 = 0;
                            this.field4487.field3498 = 1;
                        } else {
                            this.field4487 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4481.method371(-2);
            } catch (Exception var29) {
            }
            this.field4481 = null;
            this.field4483++;
            this.field4484 = -2;
            return this.method2006(18744) == 0 && this.method1997((byte) -77) == 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZIZB)Ldk;", line = 355)
    public final class226 method2000(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        if (arg1) {
            this.field4484 = 5;
        }
        long var6 = (long) ((arg0 << 16) + arg2);
        class226 var8 = new class226();
        var8.field2003 = var6;
        field4471++;
        var8.field3504 = arg4;
        var8.field2439 = arg3;
        if (arg3) {
            if (this.method2006(18744) >= 20) {
                throw new RuntimeException();
            }
            this.field4465.method1453(var8, -34);
        } else if (this.method1997((byte) -77) < 20) {
            this.field4476.method1453(var8, 118);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 398)
    public static final void method2001(int arg0) {
        field4460++;
        if (arg0 != 1) {
            return;
        }
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class178.field2841 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 426)
    public static final void method2002(int arg0, int arg1) {
        field4466++;
        if (arg0 != 0) {
            field4456 = (String) null;
        }
        class174.field2777.method2285(arg1, (byte) -6);
        class77.field1196.method2285(arg1, (byte) -33);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lkc;ZB)V", line = 442)
    public final void method2003(class41 arg0, boolean arg1, byte arg2) {
        field4468++;
        if (this.field4481 != null) {
            try {
                this.field4481.method371(-2);
            } catch (Exception var12) {
            }
            this.field4481 = null;
        }
        this.field4481 = arg0;
        this.method1996(false);
        this.method2008(-127, arg1);
        this.field4485.field48 = 0;
        this.field4487 = null;
        while (true) {
            class226 var5 = (class226) this.field4475.method1452(13634);
            if (var5 == null) {
                while (true) {
                    class226 var6 = (class226) this.field4478.method1452(13634);
                    if (var6 == null) {
                        if (this.field4486 != 0) {
                            try {
                                this.field4482.field48 = 0;
                                this.field4482.method21(38, 4);
                                this.field4482.method21(-128, this.field4486);
                                this.field4482.method14(-246866616, 0);
                                this.field4481.method373(1, 0, this.field4482.field34, 4);
                            } catch (IOException var11) {
                                try {
                                    this.field4481.method371(-2);
                                } catch (Exception var10) {
                                }
                                this.field4483++;
                                this.field4481 = null;
                                this.field4484 = -2;
                            }
                        }
                        this.field4479 = 0;
                        this.field4480 = class212.method1543(22326);
                        int var9 = 100 % ((-arg2 - 2) / 63);
                        return;
                    }
                    this.field4476.method1453(var6, 117);
                }
            }
            this.field4465.method1453(var5, -22);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)Z", line = 510)
    public final boolean method2004(boolean arg0) {
        if (!arg0) {
            this.field4478 = (class202) null;
        }
        field4470++;
        return this.method2006(18744) >= 20;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 521)
    public final void method2005(int arg0) {
        field4458++;
        if (arg0 <= 56) {
            this.method2003((class41) null, false, (byte) 47);
        }
        if (this.field4481 != null) {
            this.field4481.method371(-2);
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I", line = 535)
    public final int method2006(int arg0) {
        if (arg0 == 18744) {
            field4463++;
            return this.field4465.method1450((byte) -115) + this.field4475.method1450((byte) -86);
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V", line = 546)
    public static void method2007(boolean arg0) {
        if (!arg0) {
            method2011(63, -104, (byte) 54, 62, 10, -72, 109, 17, 84, -39);
        }
        field4456 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V", line = 557)
    public final void method2008(int arg0, boolean arg1) {
        int var3 = 75 / ((arg0 + 70) / 38);
        field4461++;
        if (this.field4481 == null) {
            return;
        }
        try {
            this.field4482.field48 = 0;
            this.field4482.method21(-107, arg1 ? 2 : 3);
            this.field4482.method17(0, (byte) 102);
            this.field4481.method373(1, 0, this.field4482.field34, 4);
        } catch (IOException var7) {
            try {
                this.field4481.method371(-2);
            } catch (Exception var6) {
            }
            this.field4483++;
            this.field4481 = null;
            this.field4484 = -2;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 585)
    public final void method2009(byte arg0) {
        field4472++;
        if (this.field4481 == null) {
            return;
        }
        try {
            if (arg0 != -32) {
                return;
            }
            this.field4482.field48 = 0;
            this.field4482.method21(arg0 ^ 0xFFFFFFB8, 7);
            this.field4482.method17(0, (byte) 124);
            this.field4481.method373(1, 0, this.field4482.field34, 4);
        } catch (IOException var5) {
            try {
                this.field4481.method371(-2);
            } catch (Exception var4) {
            }
            this.field4483++;
            this.field4481 = null;
            this.field4484 = -2;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 621)
    public final void method2010(int arg0) {
        int var2 = -64 % ((arg0 - 65) / 44);
        field4467++;
        try {
            this.field4481.method371(-2);
        } catch (Exception var4) {
        }
        this.field4486 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4481 = null;
        this.field4483++;
        this.field4484 = -1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIIIIIII)V", line = 639)
    public static final void method2011(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -27) {
            return;
        }
        if (arg5 == arg9 && arg3 == arg4 && arg1 == arg7 && arg6 == arg8) {
            class3.method74(arg0, arg3, arg8, arg1, -104, arg9);
        } else {
            int var10 = arg9;
            int var11 = arg9 * 3;
            int var12 = arg3 * 3;
            int var13 = arg5 * 3;
            int var14 = arg3;
            int var15 = arg6 * 3;
            int var16 = arg7 * 3;
            int var17 = arg4 * 3;
            int var18 = arg8 + var17 - var15 - arg3;
            int var19 = arg1 - (var16 + arg9 - var13);
            int var20 = var11 + var16 - var13 - var13;
            int var21 = var17 - var12;
            int var22 = var13 - var11;
            int var23 = var12 + var15 - var17 - var17;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var25;
                int var31 = var22 * var24;
                int var32 = arg9 + (var28 + var31 + var29 >> 12);
                int var33 = var21 * var24;
                int var34 = (var27 + var30 + var33 >> 12) + arg3;
                class3.method74(arg0, var14, var34, var32, -108, var10);
                var14 = var34;
                var10 = var32;
            }
        }
        field4459++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 718)
    public static final boolean method2012(String arg0, boolean arg1) {
        field4464++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            method2011(33, 84, (byte) -107, 27, -87, 24, 124, 40, 120, 123);
        }
        for (int var2 = 0; var2 < class321.field5024; var2++) {
            if (arg0.equalsIgnoreCase(class197.field3030[var2])) {
                return true;
            }
        }
        return false;
    }
}
