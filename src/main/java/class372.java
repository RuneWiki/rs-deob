import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class372 extends class187 {

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field5523 = 0;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Lsf;")
    private class143 field5532 = new class143(16);

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    private int field5558 = 0;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lmi;")
    private class408 field5556 = new class408();

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "J")
    private long field5562 = 0L;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Ljb;")
    private class425 field5528;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "Z")
    private boolean field5560;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Lmi;")
    private class408 field5554;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "Z")
    private boolean field5561;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Ljb;")
    private class425 field5538;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    private int field5544;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    private int field5536;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Lje;")
    private class300 field5553;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Lse;")
    private class332 field5550;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lwr;")
    private class369 field5531;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Lro;")
    public static class249 field5533 = null;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lwo;")
    private class52 field5524;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "Z")
    private boolean field5557;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[B")
    private byte[] field5541;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 7)
    public final void method2444(boolean arg0) {
        field5525++;
        if (this.field5554 != null) {
            if (this.method1163(255) == null) {
                return;
            }
            if (this.field5560) {
                boolean var2 = true;
                for (class393 var3 = this.field5554.method2649(0); var3 != null; var3 = this.field5554.method2656(0)) {
                    int var5 = (int) var3.field5903;
                    if (this.field5541[var5] == 0) {
                        this.method2454(var5, 126, 1);
                    }
                    if (this.field5541[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2574((byte) 119);
                    }
                }
                while (this.field5524.field773.length > this.field5558) {
                    if (this.field5524.field773[this.field5558] == 0) {
                        this.field5558++;
                    } else {
                        if (this.field5553.field4314 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5541[this.field5558] == 0) {
                            this.method2454(this.field5558, 127, 1);
                        }
                        if (this.field5541[this.field5558] == 0) {
                            class393 var4 = new class393();
                            var4.field5903 = (long) this.field5558;
                            this.field5554.method2660((byte) -122, var4);
                            var2 = false;
                        }
                        this.field5558++;
                    }
                }
                if (var2) {
                    this.field5560 = false;
                    this.field5558 = 0;
                }
            } else if (this.field5557) {
                boolean var6 = true;
                for (class393 var7 = this.field5554.method2649(0); var7 != null; var7 = this.field5554.method2656(0)) {
                    int var9 = (int) var7.field5903;
                    if (this.field5541[var9] != 1) {
                        this.method2454(var9, 127, 2);
                    }
                    if (this.field5541[var9] == 1) {
                        var7.method2574((byte) 120);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5524.field773.length > this.field5558) {
                    if (this.field5524.field773[this.field5558] == 0) {
                        this.field5558++;
                    } else {
                        if (this.field5550.method2203((byte) -110)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5541[this.field5558] != 1) {
                            this.method2454(this.field5558, 126, 2);
                        }
                        if (this.field5541[this.field5558] != 1) {
                            class393 var8 = new class393();
                            var8.field5903 = (long) this.field5558;
                            this.field5554.method2660((byte) -127, var8);
                            var6 = false;
                        }
                        this.field5558++;
                    }
                }
                if (var6) {
                    this.field5558 = 0;
                    this.field5557 = false;
                }
            } else {
                this.field5554 = null;
            }
        }
        if (this.field5561 && this.field5562 <= class55.method375(-3913)) {
            for (class369 var10 = (class369) this.field5532.method953(0); var10 != null; var10 = (class369) this.field5532.method951(0)) {
                if (!var10.field5481) {
                    if (var10.field5484) {
                        if (!var10.field5480) {
                            throw new RuntimeException();
                        }
                        var10.method2574((byte) 125);
                    } else {
                        var10.field5484 = true;
                    }
                }
            }
            this.field5562 = class55.method375(-3913) + 1000L;
        }
        if (arg0) {
            this.method1163(19);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I", line = 186)
    public final int method2445(int arg0) {
        field5546++;
        if (this.method1163(arg0 + 255) == null) {
            return this.field5531 == null ? 0 : this.field5531.method462(arg0 + 2);
        } else if (arg0 == 0) {
            return 100;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 207)
    public static final void method2446(Component arg0, byte arg1) {
        field5530++;
        arg0.removeKeyListener(class310.field4436);
        if (arg1 == 2) {
            arg0.removeFocusListener(class310.field4436);
            class37.field603 = -1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III[S[Ljava/lang/String;)V", line = 225)
    public static final void method2447(int arg0, int arg1, int arg2, short[] arg3, String[] arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method2447(arg0, 82, var6 - 1, arg3, arg4);
            method2447(var6 + 1, 74, arg2, arg3, arg4);
        }
        field5542++;
        if (arg1 <= 70) {
            field5533 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)I", line = 278)
    public final int method2448(boolean arg0) {
        field5551++;
        if (!arg0) {
            this.field5532 = null;
        }
        return this.field5523;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V", line = 289)
    public static final void method2449(boolean arg0) {
        if (!arg0) {
            field5555++;
            class157.field2069.method952(105);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[B", line = 304)
    public final byte[] method1165(byte arg0, int arg1) {
        field5548++;
        class369 var3 = this.method2454(arg1, 127, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method461(6);
        if (arg0 < 84) {
            return null;
        } else {
            var3.method2574((byte) 117);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Ljq;", line = 323)
    public static final class184 method2450(int arg0, byte arg1) {
        field5540++;
        class184 var2 = (class184) class360.field5280.method209(118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field513.method1472(arg0, 35, 0);
        if (arg1 < 122) {
            return null;
        }
        class184 var4 = new class184();
        if (var3 != null) {
            var4.method1135(new class265(var3), -128);
        }
        var4.method1132(true);
        class360.field5280.method202(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 349)
    public final void method2451(byte arg0) {
        field5529++;
        int var2 = 29 % ((arg0 - 77) / 40);
        if (this.field5528 != null) {
            this.field5557 = true;
            if (this.field5554 == null) {
                this.field5554 = new class408();
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V", line = 374)
    public final void method2452(byte arg0) {
        field5534++;
        if (this.field5554 == null || this.method1163(255) == null) {
            return;
        }
        for (class393 var2 = this.field5556.method2649(0); var2 != null; var2 = this.field5556.method2656(arg0 - 2)) {
            int var3 = (int) var2.field5903;
            if (var3 < 0 || this.field5524.field763 <= var3 || this.field5524.field773[var3] == 0) {
                var2.method2574((byte) 116);
            } else {
                if (this.field5541[var3] == 0) {
                    this.method2454(var3, 126, 1);
                }
                if (this.field5541[var3] == -1) {
                    this.method2454(var3, 127, 2);
                }
                if (this.field5541[var3] == 1) {
                    var2.method2574((byte) 123);
                }
            }
        }
        if (arg0 != 2) {
            this.method1164(-119, -83);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 422)
    public static final void method2453(int arg0) {
        if (arg0 <= 34) {
            method2460(-72, -89);
        }
        field5559++;
        class11.field128.method204((byte) 56);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Lwr;", line = 433)
    private final class369 method2454(int arg0, int arg1, int arg2) {
        field5522++;
        class369 var4 = (class369) this.field5532.method954(-122, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field5480 && var4.field5481) {
            var4.method2574((byte) 125);
            var4 = null;
        }
        if (arg1 <= 125) {
            this.field5560 = true;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5528 == null || this.field5541[arg0] == -1) {
                    if (this.field5550.method2201(-27332)) {
                        return null;
                    }
                    var4 = this.field5550.method2200(arg0, true, (byte) 2, this.field5527, 20);
                } else {
                    var4 = this.field5553.method1902((byte) -49, arg0, this.field5528);
                }
            } else if (arg2 == 1) {
                if (this.field5528 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5553.method1904(3, arg0, this.field5528);
            } else if (arg2 == 2) {
                if (this.field5528 == null) {
                    throw new RuntimeException();
                }
                if (this.field5541[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5550.method2203((byte) -105)) {
                    return null;
                }
                var4 = this.field5550.method2200(arg0, false, (byte) 2, this.field5527, 20);
            } else {
                throw new RuntimeException();
            }
            this.field5532.method956(false, (long) arg0, var4);
        }
        if (var4.field5481) {
            return null;
        }
        byte[] var5 = var4.method461(6);
        if (!var4 instanceof class75) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class302.field4333.reset();
                class302.field4333.update(var5, 0, var5.length - 2);
                int var9 = (int) class302.field4333.getValue();
                if (this.field5524.field782[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field5550.field4904 = 0;
                this.field5550.field4906 = 0;
            } catch (RuntimeException var12) {
                this.field5550.method2196(true);
                var4.method2574((byte) 121);
                if (var4.field5480 && !this.field5550.method2201(-27332)) {
                    class302 var10 = this.field5550.method2200(arg0, true, (byte) 2, this.field5527, 20);
                    this.field5532.method956(false, (long) arg0, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5524.field777[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field5524.field777[arg0];
            if (this.field5528 != null) {
                this.field5553.method1900(arg0, this.field5528, -31152, var5);
                if (this.field5541[arg0] != 1) {
                    this.field5523++;
                    this.field5541[arg0] = 1;
                }
            }
            if (!var4.field5480) {
                var4.method2574((byte) 115);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class302.field4333.reset();
            class302.field4333.update(var5, 0, var5.length - 2);
            int var6 = (int) class302.field4333.getValue();
            if (this.field5524.field782[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5524.field777[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5541[arg0] != 1) {
                this.field5523++;
                this.field5541[arg0] = 1;
            }
            if (!var4.field5480) {
                var4.method2574((byte) 125);
            }
            return var4;
        } catch (Exception var11) {
            this.field5541[arg0] = -1;
            var4.method2574((byte) 117);
            if (var4.field5480 && !this.field5550.method2201(-27332)) {
                class302 var8 = this.field5550.method2200(arg0, true, (byte) 2, this.field5527, 20);
                this.field5532.method956(false, (long) arg0, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILjb;Ljb;Lse;Lje;IIZ)V", line = 1047)
    public class372(int arg0, class425 arg1, class425 arg2, class332 arg3, class300 arg4, int arg5, int arg6, boolean arg7) {
        this.field5528 = arg1;
        this.field5527 = arg0;
        if (this.field5528 == null) {
            this.field5560 = false;
        } else {
            this.field5560 = true;
            this.field5554 = new class408();
        }
        this.field5561 = arg7;
        this.field5538 = arg2;
        this.field5544 = arg5;
        this.field5536 = arg6;
        this.field5553 = arg4;
        this.field5550 = arg3;
        if (this.field5538 != null) {
            this.field5531 = this.field5553.method1902((byte) -49, this.field5527, this.field5538);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)I", line = 657)
    public final int method1166(byte arg0, int arg1) {
        field5543++;
        if (arg0 != 22) {
            this.field5541 = null;
        }
        class369 var3 = (class369) this.field5532.method954(-90, (long) arg1);
        return var3 == null ? 0 : var3.method462(2);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ[[B[BI[I[[B[I)I", line = 673)
    public static final int method2455(int arg0, boolean arg1, byte[][] arg2, byte[] arg3, int arg4, int[] arg5, byte[][] arg6, int[] arg7) {
        field5547++;
        int var8 = arg7[arg0];
        int var9 = arg5[arg0] + var8;
        if (arg1) {
            method2458(26, -32, 94, 98, -77);
        }
        int var10 = arg7[arg4];
        int var11 = arg5[arg4] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg3[arg0] & 0xFF;
        if (var14 > (arg3[arg4] & 0xFF)) {
            var14 = arg3[arg4] & 0xFF;
        }
        byte[] var15 = arg2[arg0];
        byte[] var16 = arg6[arg4];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 743)
    public static void method2456(int arg0) {
        field5533 = null;
        int var1 = 61 / ((-arg0 - 11) / 57);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I", line = 762)
    public final int method2457(int arg0) {
        field5521++;
        if (arg0 != 0) {
            this.method2448(true);
        }
        return this.field5524 == null ? 0 : this.field5524.field774;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 778)
    public final void method1164(int arg0, int arg1) {
        field5539++;
        if (this.field5528 == null || arg0 != 7355) {
            return;
        }
        for (class393 var3 = this.field5556.method2649(0); var3 != null; var3 = this.field5556.method2656(0)) {
            if (((long) arg1) == var3.field5903) {
                return;
            }
        }
        class393 var4 = new class393();
        var4.field5903 = (long) arg1;
        this.field5556.method2660((byte) -128, var4);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V", line = 808)
    public static final void method2458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5552++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -122 / ((29 - arg2) / 55);
        int var9 = -1;
        class370.method2440(arg0 + arg4, class227.field3201[arg1], arg3, arg0 - arg4, 110);
        while (var5 < var6) {
            var9 += 2;
            var5++;
            var7 += var9;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var10 = class227.field3201[arg1 + var6];
                int[] var11 = class227.field3201[arg1 - var6];
                int var12 = arg0 + var5;
                int var13 = arg0 - var5;
                class370.method2440(var12, var10, arg3, var13, 118);
                class370.method2440(var12, var11, arg3, var13, 127);
            }
            int var14 = arg0 + var6;
            int var15 = arg0 - var6;
            int[] var16 = class227.field3201[arg1 + var5];
            int[] var17 = class227.field3201[arg1 - var5];
            class370.method2440(var14, var16, arg3, var15, 110);
            class370.method2440(var14, var17, arg3, var15, 62);
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)I", line = 860)
    public final int method2459(int arg0) {
        field5537++;
        if (this.field5524 == null) {
            return 0;
        } else if (this.field5560) {
            if (arg0 < 45) {
                this.method2452((byte) 118);
            }
            class393 var2 = this.field5554.method2649(0);
            return var2 == null ? 0 : (int) var2.field5903;
        } else {
            return this.field5524.field774;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I", line = 883)
    public static final int method2460(int arg0, int arg1) {
        field5549++;
        if (arg1 > -42) {
            method2460(86, -71);
        }
        if (class159.field2079 != null) {
            class159.field2079.method243(-1);
            class159.field2079 = null;
        }
        class35.field578++;
        if (class35.field578 > 4) {
            class35.field578 = 0;
            class373.field5609 = 0;
            return arg0;
        }
        class373.field5609 = 0;
        if (class246.field3436 == class10.field111) {
            class10.field111 = class161.field2106;
        } else {
            class10.field111 = class246.field3436;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lwo;", line = 921)
    public final class52 method1163(int arg0) {
        field5545++;
        if (this.field5524 != null) {
            return this.field5524;
        }
        if (this.field5531 == null) {
            if (this.field5550.method2201(-27332)) {
                return null;
            }
            this.field5531 = this.field5550.method2200(this.field5527, true, (byte) 0, 255, 20);
        }
        if (arg0 != 255) {
            this.method1163(6);
        }
        if (this.field5531.field5481) {
            return null;
        }
        byte[] var2 = this.field5531.method461(6);
        if (this.field5531 instanceof class75) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5524 = new class52(var2, this.field5544);
                if (this.field5524.field768 != this.field5536) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5524 = null;
                if (this.field5550.method2201(-27332)) {
                    this.field5531 = null;
                } else {
                    this.field5531 = this.field5550.method2200(this.field5527, true, (byte) 0, 255, 20);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5524 = new class52(var2, this.field5544);
            } catch (RuntimeException var4) {
                this.field5550.method2196(true);
                this.field5524 = null;
                if (this.field5550.method2201(-27332)) {
                    this.field5531 = null;
                } else {
                    this.field5531 = this.field5550.method2200(this.field5527, true, (byte) 0, 255, 20);
                }
                return null;
            }
            if (this.field5538 != null) {
                this.field5553.method1900(this.field5527, this.field5538, arg0 - 31407, var2);
            }
        }
        if (this.field5528 != null) {
            this.field5541 = new byte[this.field5524.field763];
            this.field5523 = 0;
        }
        this.field5531 = null;
        return this.field5524;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)V", line = 1020)
    public static final void method2461(int arg0, byte arg1) {
        field5535++;
        class11.field128.method215(arg1 ^ 0xFFFFFFB6, arg0);
        if (arg1 != -74) {
            field5533 = null;
        }
    }
}
