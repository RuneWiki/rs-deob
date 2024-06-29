import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class698 {

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Ldp;")
    private class514 field9769 = new class514();

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Ldp;")
    private class514 field9771 = new class514();

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Ldp;")
    private class514 field9773 = new class514();

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Ldp;")
    private class514 field9774 = new class514();

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Ljc;")
    private class711 field9777 = new class711(4);

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "B")
    private byte field9780 = 0;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public volatile int field9779 = 0;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public volatile int field9781 = 0;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Ljc;")
    private class711 field9782 = new class711(8);

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field9784 = new String[] { method5034(method5033("&fr\u001ad")), method5034(method5033("&fr\u0019d")), method5034(method5033("&fr\u001cd")), method5034(method5033("&fr\u0017d")), method5034(method5033("&fr\u001dd")), method5034(method5033("7 r~1")), method5034(method5033("\"{0<")), method5034(method5033("&fr\u0018d")), method5034(method5033("&fr\u0015d")), method5034(method5033("&fr\u0011d")), method5034(method5033("&fr\u0012d")), method5034(method5033("&fr\u0013d")), method5034(method5033("&fr\u0014d")), method5034(method5033("&fr\u0016d")), method5034(method5033("&fr\u001bd")) };

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field9772 = -50;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    private int field9776;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "J")
    private long field9778;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Laf;")
    private class289 field9783;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lqda;")
    private class678 field9775;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
    public final boolean method5020(byte arg0) {
        try {
            field9760++;
            if (arg0 != 107) {
                this.field9783 = null;
            }
            return this.method5022((byte) 93) >= 20;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9784[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
    public final boolean method5021(int arg0) {
        try {
            if (this.field9775 != null) {
                long var2 = class614.method4531(-56);
                int var4 = (int) (var2 - this.field9778);
                this.field9778 = var2;
                if (var4 > 200) {
                    var4 = 200;
                }
                this.field9776 += var4;
                if (this.field9776 > 30000) {
                    try {
                        this.field9775.method4870(26);
                    } catch (Exception var28) {
                    }
                    this.field9775 = null;
                }
            }
            field9761++;
            if (this.field9775 == null) {
                return this.method5027(-12237) == 0 && this.method5022((byte) -102) == 0;
            }
            try {
                this.field9775.method4862(arg0 + 2);
                if (arg0 != -1) {
                    return false;
                }
                for (class289 var5 = (class289) this.field9769.method3932((byte) -61); var5 != null; var5 = (class289) this.field9769.method3939((byte) -75)) {
                    this.field9777.field9945 = 0;
                    this.field9777.method5114(arg0 ^ 0xFFFFFF00, 1);
                    this.field9777.method5107((int) var5.field9630, true);
                    this.field9775.method4869((byte) 123, 4, 0, this.field9777.field9996);
                    this.field9771.method3937(true, var5);
                }
                for (class289 var6 = (class289) this.field9773.method3932((byte) -24); var6 != null; var6 = (class289) this.field9773.method3939((byte) -75)) {
                    this.field9777.field9945 = 0;
                    this.field9777.method5114(255, 0);
                    this.field9777.method5107((int) var6.field9630, true);
                    this.field9775.method4869((byte) 78, 4, 0, this.field9777.field9996);
                    this.field9774.method3937(true, var6);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field9775.method4867(0);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field9776 = 0;
                    byte var9 = 0;
                    if (this.field9783 == null) {
                        var9 = 8;
                    } else if (this.field9783.field4084 == 0) {
                        var9 = 1;
                    }
                    if (var9 <= 0) {
                        int var10 = this.field9783.field4085.field9996.length - this.field9783.field4087;
                        int var11 = 512 - this.field9783.field4084;
                        if (var11 > var10 - this.field9783.field4085.field9945) {
                            var11 = var10 - this.field9783.field4085.field9945;
                        }
                        if (var11 > var8) {
                            var11 = var8;
                        }
                        this.field9775.method4863(var11, 94, this.field9783.field4085.field9945, this.field9783.field4085.field9996);
                        if (this.field9780 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field9783.field4085.field9996[this.field9783.field4085.field9945 + var12] = (byte) class52.method560(this.field9783.field4085.field9996[this.field9783.field4085.field9945 + var12], this.field9780);
                            }
                        }
                        this.field9783.field4084 += var11;
                        this.field9783.field4085.field9945 += var11;
                        if (this.field9783.field4085.field9945 == var10) {
                            this.field9783.method4911(117);
                            this.field9783.field4364 = false;
                            this.field9783 = null;
                        } else if (this.field9783.field4084 == 512) {
                            this.field9783.field4084 = 0;
                        }
                    } else {
                        int var13 = var9 - this.field9782.field9945;
                        if (var8 < var13) {
                            var13 = var8;
                        }
                        this.field9775.method4863(var13, 90, this.field9782.field9945, this.field9782.field9996);
                        if (this.field9780 != 0) {
                            for (int var14 = 0; var14 < var13; var14++) {
                                this.field9782.field9996[this.field9782.field9945 + var14] = (byte) class52.method560(this.field9782.field9996[this.field9782.field9945 + var14], this.field9780);
                            }
                        }
                        this.field9782.field9945 += var13;
                        if (var9 <= this.field9782.field9945) {
                            if (this.field9783 == null) {
                                this.field9782.field9945 = 0;
                                int var15 = this.field9782.method5128(0);
                                int var16 = this.field9782.method5116((byte) -118);
                                int var17 = this.field9782.method5128(0);
                                int var18 = this.field9782.method5113(18443);
                                int var19 = var17 & 0x7F;
                                boolean var20 = (var17 & 0x80) != 0;
                                long var21 = (long) ((var15 << 16) + var16);
                                Object var23 = null;
                                class289 var24;
                                if (var20) {
                                    for (var24 = (class289) this.field9774.method3932((byte) -46); var24 != null && var24.field9630 != var21; var24 = (class289) this.field9774.method3939((byte) -75)) {
                                    }
                                } else {
                                    for (var24 = (class289) this.field9771.method3932((byte) -40); var24 != null && var24.field9630 != var21; var24 = (class289) this.field9771.method3939((byte) -75)) {
                                    }
                                }
                                if (var24 == null) {
                                    throw new IOException();
                                }
                                this.field9783 = var24;
                                int var25 = var19 == 0 ? 5 : 9;
                                this.field9783.field4085 = new class711(var18 + this.field9783.field4087 + var25);
                                this.field9783.field4085.method5114(arg0 ^ 0xFFFFFF00, var19);
                                this.field9783.field4085.method5127(var18, 26108);
                                this.field9782.field9945 = 0;
                                this.field9783.field4084 = 8;
                            } else if (this.field9783.field4084 != 0) {
                                throw new IOException();
                            } else if (this.field9782.field9996[0] == -1) {
                                this.field9783.field4084 = 1;
                                this.field9782.field9945 = 0;
                            } else {
                                this.field9783 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var29) {
                try {
                    this.field9775.method4870(79);
                } catch (Exception var27) {
                }
                this.field9779++;
                this.field9775 = null;
                this.field9781 = -2;
                return this.method5027(-12237) == 0 && this.method5022((byte) -90) == 0;
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field9784[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)I")
    private final int method5022(byte arg0) {
        try {
            int var2 = 13 / ((-arg0 - 40) / 46);
            field9767++;
            return this.field9773.method3935(3003) + this.field9774.method3935(3003);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9784[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLqda;I)V")
    public final void method5023(boolean arg0, class678 arg1, int arg2) {
        try {
            field9759++;
            if (this.field9775 != null) {
                try {
                    this.field9775.method4870(42);
                } catch (Exception var9) {
                }
                this.field9775 = null;
            }
            if (arg2 != -2) {
                this.field9777 = null;
            }
            this.field9775 = arg1;
            this.method5025((byte) -75);
            this.method5026(arg0, (byte) 94);
            this.field9782.field9945 = 0;
            this.field9783 = null;
            while (true) {
                class289 var4 = (class289) this.field9771.method3938((byte) -113);
                if (var4 == null) {
                    while (true) {
                        class289 var5 = (class289) this.field9774.method3938((byte) -117);
                        if (var5 == null) {
                            if (this.field9780 != 0) {
                                try {
                                    this.field9777.field9945 = 0;
                                    this.field9777.method5114(255, 4);
                                    this.field9777.method5114(arg2 ^ 0xFFFFFF01, this.field9780);
                                    this.field9777.method5138((byte) -112, 0);
                                    this.field9775.method4869((byte) 70, 4, 0, this.field9777.field9996);
                                } catch (IOException var8) {
                                    try {
                                        this.field9775.method4870(27);
                                    } catch (Exception var7) {
                                    }
                                    this.field9775 = null;
                                    this.field9779++;
                                    this.field9781 = -2;
                                }
                            }
                            this.field9776 = 0;
                            this.field9778 = class614.method4531(-49);
                            return;
                        }
                        this.field9773.method3937(true, var5);
                    }
                }
                this.field9769.method3937(true, var4);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9784[4] + arg0 + ',' + (arg1 == null ? field9784[6] : field9784[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public final void method5024(int arg0) {
        try {
            field9768++;
            if (this.field9775 != null) {
                try {
                    this.field9777.field9945 = 0;
                    this.field9777.method5114(255, 7);
                    this.field9777.method5107(0, true);
                    if (arg0 < 32) {
                        this.method5032(true);
                    }
                    this.field9775.method4869((byte) 69, 4, 0, this.field9777.field9996);
                } catch (IOException var4) {
                    try {
                        this.field9775.method4870(45);
                    } catch (Exception var3) {
                    }
                    this.field9781 = -2;
                    this.field9779++;
                    this.field9775 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9784[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)V")
    private final void method5025(byte arg0) {
        try {
            field9763++;
            if (this.field9775 != null) {
                try {
                    this.field9777.field9945 = 0;
                    this.field9777.method5114(255, 6);
                    this.field9777.method5107(3, true);
                    this.field9775.method4869((byte) 95, 4, 0, this.field9777.field9996);
                } catch (IOException var4) {
                    try {
                        this.field9775.method4870(34);
                    } catch (Exception var3) {
                    }
                    this.field9775 = null;
                    this.field9779++;
                    this.field9781 = -2;
                }
                if (arg0 > -15) {
                    this.field9779 = -32;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9784[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
    public final void method5026(boolean arg0, byte arg1) {
        try {
            field9758++;
            if (arg1 > 76 && this.field9775 != null) {
                try {
                    this.field9777.field9945 = 0;
                    this.field9777.method5114(255, arg0 ? 2 : 3);
                    this.field9777.method5107(0, true);
                    this.field9775.method4869((byte) 124, 4, 0, this.field9777.field9996);
                } catch (IOException var5) {
                    try {
                        this.field9775.method4870(114);
                    } catch (Exception var4) {
                    }
                    this.field9779++;
                    this.field9781 = -2;
                    this.field9775 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9784[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
    public final int method5027(int arg0) {
        try {
            if (arg0 != -12237) {
                this.field9769 = null;
            }
            field9766++;
            return this.field9769.method3935(arg0 ^ 0xFFFFDB88) + this.field9771.method3935(arg0 ^ 0xFFFFDB88);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9784[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Z")
    public final boolean method5028(boolean arg0) {
        try {
            field9762++;
            if (arg0) {
                this.method5029((byte) 64);
            }
            return this.method5027(-12237) >= 20;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9784[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public final void method5029(byte arg0) {
        try {
            if (this.field9775 != null) {
                this.field9775.method4864((byte) -117);
            }
            if (arg0 == 71) {
                field9765++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9784[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public final void method5030(int arg0) {
        try {
            if (this.field9775 != null) {
                this.field9775.method4870(arg0 ^ 0x67);
            }
            if (arg0 != 20) {
                this.method5023(true, null, -44);
            }
            field9757++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9784[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIBIZ)Laf;")
    public final class289 method5031(byte arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        try {
            field9770++;
            long var6 = (long) ((arg3 << 16) + arg1);
            class289 var8 = new class289();
            if (arg2 != -5) {
                this.field9775 = null;
            }
            var8.field9630 = var6;
            var8.field4087 = arg0;
            var8.field4361 = arg4;
            if (arg4) {
                if (this.method5027(-12237) >= 20) {
                    throw new RuntimeException();
                }
                this.field9769.method3937(true, var8);
            } else if (this.method5022((byte) 44) < 20) {
                this.field9773.method3937(true, var8);
            } else {
                throw new RuntimeException();
            }
            return var8;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9784[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public final void method5032(boolean arg0) {
        try {
            try {
                this.field9775.method4870(45);
            } catch (Exception var3) {
            }
            field9756++;
            this.field9779++;
            this.field9780 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field9781 = -1;
            if (!arg0) {
                this.method5032(true);
            }
            this.field9775 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9784[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5033(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5034(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
