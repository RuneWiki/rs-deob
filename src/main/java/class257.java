import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class257 extends class194 {

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    private int field4543 = 0;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Lka;")
    private class157 field4542 = new class157(16);

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    private int field4560 = 0;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Lb;")
    private class48 field4557 = new class48();

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "J")
    private long field4562 = 0L;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field4553;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Lvd;")
    private class110 field4547;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "Z")
    private boolean field4559;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Lb;")
    private class48 field4558;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lmf;")
    private class37 field4531;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field4554;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lvd;")
    private class110 field4530;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lkj;")
    private class147 field4538;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "Z")
    private boolean field4561;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lhk;")
    private class255 field4535;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4526 = 0;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field4540 = 0;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Z")
    public static boolean field4532 = false;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
    public static int[] field4546 = new int[1000];

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Ltk;")
    private class208 field4545;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lcg;")
    public static class34 field4527;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Z")
    private boolean field4555;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "[B")
    private byte[] field4536;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIILdl;BI)V")
    public static final void method1780(int arg0, int arg1, int arg2, int arg3, class31 arg4, byte arg5, int arg6) {
        if (arg5 > -108) {
            return;
        }
        int var7 = arg1 * arg1 + (arg0 * arg0);
        field4534++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg4.field728 / 2, arg4.field670 / 2);
        if (var8 * var8 >= var7) {
            class115.method897(arg0, arg3, class64.field1424[arg6], arg1, arg2, (byte) 36, arg4);
            return;
        }
        int var9 = class147.field2811 + class110.field2202 & 0x7FF;
        int var10 = class213.field3849[var9];
        var8 -= 10;
        int var11 = var10 * 256 / (class50.field1139 + 256);
        int var12 = class213.field3846[var9];
        int var13 = var12 * 256 / (class50.field1139 + 256);
        int var14 = arg0 * var11 + arg1 * var13 >> 16;
        int var15 = arg0 * var13 - (arg1 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class152) class135.field2638[arg6]).method1145(arg4.field728 / 2 + arg3 - (-var18 + 10), arg4.field670 / 2 + -var19 + arg2 - 10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Lhk;")
    private final class255 method1781(int arg0, int arg1, int arg2) {
        class255 var4 = (class255) this.field4542.method1168(arg1 - 3, (long) arg0);
        field4539++;
        if (var4 != null && arg2 == 0 && !var4.field4502 && var4.field4506) {
            var4.method1681(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4547 == null || this.field4536[arg0] == -1) {
                    if (this.field4531.method365(56)) {
                        return null;
                    }
                    var4 = this.field4531.method364(this.field4553, arg0, 95, (byte) 2, true);
                } else {
                    var4 = this.field4538.method1079((byte) 22, arg0, this.field4547);
                }
            } else if (arg2 == 1) {
                if (this.field4547 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4538.method1075(true, arg0, this.field4547);
            } else if (arg2 == 2) {
                if (this.field4547 == null) {
                    throw new RuntimeException();
                }
                if (this.field4536[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4531.method361((byte) -66)) {
                    return null;
                }
                var4 = this.field4531.method364(this.field4553, arg0, 101, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field4542.method1164((byte) -46, (long) arg0, var4);
        }
        if (var4.field4506) {
            return null;
        }
        if (arg1 != 0) {
            this.method1787((byte) 109);
        }
        byte[] var5 = var4.method109(true);
        if (!var4 instanceof class11) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class149.field2839.reset();
                class149.field2839.update(var5, 0, var5.length - 2);
                int var6 = (int) class149.field2839.getValue();
                if (this.field4545.field3731[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field4531.field909 = 0;
                this.field4531.field911 = 0;
            } catch (RuntimeException var12) {
                this.field4531.method358(3);
                var4.method1681(false);
                if (var4.field4502 && !this.field4531.method365(98)) {
                    class270 var7 = this.field4531.method364(this.field4553, arg0, 117, (byte) 2, true);
                    this.field4542.method1164((byte) -78, (long) arg0, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4545.field3729[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4545.field3729[arg0];
            if (this.field4547 != null) {
                this.field4538.method1078(false, this.field4547, arg0, var5);
                if (this.field4536[arg0] != 1) {
                    this.field4543++;
                    this.field4536[arg0] = 1;
                }
            }
            if (!var4.field4502) {
                var4.method1681(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class149.field2839.reset();
            class149.field2839.update(var5, 0, var5.length - 2);
            int var8 = (int) class149.field2839.getValue();
            if (this.field4545.field3731[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4545.field3729[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4536[arg0] != 1) {
                this.field4543++;
                this.field4536[arg0] = 1;
            }
            if (!var4.field4502) {
                var4.method1681(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field4536[arg0] = -1;
            var4.method1681(false);
            if (var4.field4502 && !this.field4531.method365(126)) {
                class270 var10 = this.field4531.method364(this.field4553, arg0, 118, (byte) 2, true);
                this.field4542.method1164((byte) 78, (long) arg0, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
    public final int method1403(byte arg0, int arg1) {
        field4544++;
        int var3 = 60 / ((arg0 + 66) / 40);
        class255 var4 = (class255) this.field4542.method1168(-3, (long) arg1);
        return var4 == null ? 0 : var4.method113(0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1782(int arg0) {
        field4546 = null;
        if (arg0 > -95) {
            method1782(2);
        }
        field4527 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public final void method1783(byte arg0) {
        if (arg0 != -15) {
            this.method1789((byte) -9);
        }
        field4550++;
        if (this.field4558 != null) {
            if (this.method1409(false) == null) {
                return;
            }
            if (this.field4559) {
                boolean var2 = true;
                for (class236 var3 = this.field4558.method478(0); var3 != null; var3 = this.field4558.method476((byte) 13)) {
                    int var5 = (int) var3.field4215;
                    if (this.field4536[var5] == 0) {
                        this.method1781(var5, 0, 1);
                    }
                    if (this.field4536[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1681(false);
                    }
                }
                while (this.field4545.field3735.length > this.field4560) {
                    if (this.field4545.field3735[this.field4560] == 0) {
                        this.field4560++;
                    } else {
                        if (this.field4538.field2822 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4536[this.field4560] == 0) {
                            this.method1781(this.field4560, 0, 1);
                        }
                        if (this.field4536[this.field4560] == 0) {
                            var2 = false;
                            class236 var4 = new class236();
                            var4.field4215 = (long) this.field4560;
                            this.field4558.method477(var4, (byte) 6);
                        }
                        this.field4560++;
                    }
                }
                if (var2) {
                    this.field4559 = false;
                    this.field4560 = 0;
                }
            } else if (this.field4555) {
                boolean var6 = true;
                for (class236 var7 = this.field4558.method478(arg0 + 15); var7 != null; var7 = this.field4558.method476((byte) 13)) {
                    int var9 = (int) var7.field4215;
                    if (this.field4536[var9] != 1) {
                        this.method1781(var9, arg0 + 15, 2);
                    }
                    if (this.field4536[var9] == 1) {
                        var7.method1681(false);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4560 < this.field4545.field3735.length) {
                    if (this.field4545.field3735[this.field4560] == 0) {
                        this.field4560++;
                    } else {
                        if (this.field4531.method361((byte) -47)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4536[this.field4560] != 1) {
                            this.method1781(this.field4560, 0, 2);
                        }
                        if (this.field4536[this.field4560] != 1) {
                            class236 var8 = new class236();
                            var8.field4215 = (long) this.field4560;
                            var6 = false;
                            this.field4558.method477(var8, (byte) 6);
                        }
                        this.field4560++;
                    }
                }
                if (var6) {
                    this.field4555 = false;
                    this.field4560 = 0;
                }
            } else {
                this.field4558 = null;
            }
        }
        if (!this.field4561 || class111.method874(30351) < this.field4562) {
            return;
        }
        for (class255 var10 = (class255) this.field4542.method1178(true); var10 != null; var10 = (class255) this.field4542.method1176((byte) 22)) {
            if (!var10.field4506) {
                if (var10.field4496) {
                    if (!var10.field4502) {
                        throw new RuntimeException();
                    }
                    var10.method1681(false);
                } else {
                    var10.field4496 = true;
                }
            }
        }
        this.field4562 = class111.method874(30351) + 1000L;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)I")
    public final int method1784(boolean arg0) {
        field4549++;
        if (arg0) {
            this.field4530 = null;
        }
        return this.field4543;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public final void method1401(int arg0, int arg1) {
        field4537++;
        if (this.field4547 == null) {
            return;
        }
        if (arg0 >= -37) {
            method1785(55, -118, 86, -71, 84, -74);
        }
        for (class236 var3 = this.field4557.method478(0); var3 != null; var3 = this.field4557.method476((byte) 13)) {
            if (((long) arg1) == var3.field4215) {
                return;
            }
        }
        class236 var4 = new class236();
        var4.field4215 = (long) arg1;
        this.field4557.method477(var4, (byte) 6);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public static final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg3; var6++) {
            class194.method1405(true, class121.field2390[var6], arg0, arg5, arg1);
        }
        field4548++;
        if (arg2 != 100) {
            method1785(90, -90, 53, 86, -78, 96);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)I")
    public final int method1786(byte arg0) {
        field4552++;
        if (this.method1409(false) == null) {
            return this.field4535 == null ? 0 : this.field4535.method113(0);
        } else {
            int var2 = 102 / ((arg0 + 57) / 43);
            return 100;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public final void method1787(byte arg0) {
        field4528++;
        if (arg0 <= -110 && this.field4547 != null) {
            this.field4555 = true;
            if (this.field4558 == null) {
                this.field4558 = new class48();
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)Lsg;")
    public static final class30 method1788(boolean arg0, int arg1) {
        if (arg0) {
            field4524++;
            return class160.method1188(new class30[] { class73.method675(-98, arg1 >> 24 & 0xFF), class47.field1077, class73.method675(-37, arg1 >> 16 & 0xFF), class47.field1077, class73.method675(-107, (arg1 & 0xFFA8) >> 8), class47.field1077, class73.method675(-22, arg1 & 0xFF) }, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V")
    public final void method1789(byte arg0) {
        field4525++;
        if (this.field4558 == null) {
            return;
        }
        int var2 = -17 / ((17 - arg0) / 40);
        if (this.method1409(false) == null) {
            return;
        }
        for (class236 var3 = this.field4557.method478(0); var3 != null; var3 = this.field4557.method476((byte) 13)) {
            int var4 = (int) var3.field4215;
            if (var4 < 0 || this.field4545.field3734 <= var4 || this.field4545.field3735[var4] == 0) {
                var3.method1681(false);
            } else {
                if (this.field4536[var4] == 0) {
                    this.method1781(var4, 0, 1);
                }
                if (this.field4536[var4] == -1) {
                    this.method1781(var4, 0, 2);
                }
                if (this.field4536[var4] == 1) {
                    var3.method1681(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
    public final int method1790(int arg0) {
        if (arg0 == 0) {
            field4556++;
            return this.field4545 == null ? 0 : this.field4545.field3750;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)I")
    public final int method1791(byte arg0) {
        field4541++;
        if (arg0 != 26) {
            return -119;
        } else if (this.field4545 == null) {
            return 0;
        } else if (this.field4559) {
            class236 var2 = this.field4558.method478(arg0 ^ 0x1A);
            return var2 == null ? 0 : (int) var2.field4215;
        } else {
            return this.field4545.field3750;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[B")
    public final byte[] method1402(int arg0, byte arg1) {
        class255 var3 = this.method1781(arg0, 0, 0);
        if (arg1 <= 30) {
            this.method1409(false);
        }
        field4529++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method109(true);
            var3.method1681(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Ltk;")
    public final class208 method1409(boolean arg0) {
        field4533++;
        if (this.field4545 != null) {
            return this.field4545;
        }
        if (arg0) {
            this.method1784(false);
        }
        if (this.field4535 == null) {
            if (this.field4531.method365(72)) {
                return null;
            }
            this.field4535 = this.field4531.method364(255, this.field4553, 127, (byte) 0, true);
        }
        if (this.field4535.field4506) {
            return null;
        }
        byte[] var2 = this.field4535.method109(true);
        if (this.field4535 instanceof class11) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4545 = new class208(var2, this.field4551);
                if (this.field4545.field3739 != this.field4554) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4545 = null;
                if (this.field4531.method365(58)) {
                    this.field4535 = null;
                } else {
                    this.field4535 = this.field4531.method364(255, this.field4553, 81, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4545 = new class208(var2, this.field4551);
            } catch (RuntimeException var4) {
                this.field4531.method358(3);
                this.field4545 = null;
                if (this.field4531.method365(90)) {
                    this.field4535 = null;
                } else {
                    this.field4535 = this.field4531.method364(255, this.field4553, 65, (byte) 0, true);
                }
                return null;
            }
            if (this.field4530 != null) {
                this.field4538.method1078(arg0, this.field4530, this.field4553, var2);
            }
        }
        if (this.field4547 != null) {
            this.field4536 = new byte[this.field4545.field3734];
            this.field4543 = 0;
        }
        this.field4535 = null;
        return this.field4545;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILvd;Lvd;Lmf;Lkj;IIZ)V")
    public class257(int arg0, class110 arg1, class110 arg2, class37 arg3, class147 arg4, int arg5, int arg6, boolean arg7) {
        this.field4553 = arg0;
        this.field4547 = arg1;
        if (this.field4547 == null) {
            this.field4559 = false;
        } else {
            this.field4559 = true;
            this.field4558 = new class48();
        }
        this.field4531 = arg3;
        this.field4554 = arg6;
        this.field4530 = arg2;
        this.field4551 = arg5;
        this.field4538 = arg4;
        this.field4561 = arg7;
        if (this.field4530 != null) {
            this.field4535 = this.field4538.method1079((byte) 22, this.field4553, this.field4530);
        }
    }
}
