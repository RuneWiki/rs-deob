import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class766 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lhf;")
    private class413 field10553 = new class413();

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lhf;")
    private class413 field10561 = new class413();

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Lhf;")
    private class413 field10563 = new class413();

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lhf;")
    private class413 field10566 = new class413();

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Lrv;")
    private class120 field10569 = new class120(4);

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public volatile int field10572 = 0;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "B")
    private byte field10571 = 0;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public volatile int field10574 = 0;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Lrv;")
    private class120 field10573 = new class120(8);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field10560;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private int field10570;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "J")
    private long field10567;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lqm;")
    private class153 field10568;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Lte;")
    private class638 field10575;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public final boolean method4213(int arg0) {
        field10565++;
        if (this.field10568 != null) {
            long var2 = class109.method731(arg0 - 4362);
            int var4 = (int) (var2 - this.field10567);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field10567 = var2;
            this.field10570 += var4;
            if (this.field10570 > 30000) {
                try {
                    this.field10568.method1178(-114);
                } catch (Exception var27) {
                }
                this.field10568 = null;
            }
        }
        if (this.field10568 == null) {
            return this.method4222(124) == 0 && this.method4225(arg0 ^ 0xFFFFEE1B) == 0;
        }
        try {
            this.field10568.method1177((byte) -35);
            for (class638 var5 = (class638) this.field10553.method2480(381); var5 != null; var5 = (class638) this.field10553.method2476((byte) 18)) {
                this.field10569.field1521 = 0;
                this.field10569.method851((byte) -2, 1);
                this.field10569.method876((int) var5.field3123, 1);
                this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
                this.field10561.method2475(var5, -19680);
            }
            for (class638 var6 = (class638) this.field10563.method2480(381); var6 != null; var6 = (class638) this.field10563.method2476((byte) 18)) {
                this.field10569.field1521 = 0;
                this.field10569.method851((byte) -2, 0);
                this.field10569.method876((int) var6.field3123, arg0 ^ 0x1181);
                this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
                this.field10566.method2475(var6, -19680);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field10568.method1173(8122);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field10570 = 0;
                byte var9 = 0;
                if (this.field10575 == null) {
                    var9 = 8;
                } else if (this.field10575.field8972 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field10573.field1521;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field10568.method1179(var10, 0, this.field10573.field1521, this.field10573.field1556);
                    if (this.field10571 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field10573.field1556[this.field10573.field1521 + var11] = (byte) class470.method2786(this.field10573.field1556[this.field10573.field1521 + var11], this.field10571);
                        }
                    }
                    this.field10573.field1521 += var10;
                    if (this.field10573.field1521 >= var9) {
                        if (this.field10575 == null) {
                            this.field10573.field1521 = 0;
                            int var12 = this.field10573.method842(2384);
                            int var13 = this.field10573.method898((byte) -95);
                            int var14 = this.field10573.method842(2384);
                            int var15 = this.field10573.method871(23995);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class638 var21;
                            if (var17) {
                                for (var21 = (class638) this.field10566.method2480(381); var21 != null && var21.field3123 != var18; var21 = (class638) this.field10566.method2476((byte) 18)) {
                                }
                            } else {
                                for (var21 = (class638) this.field10561.method2480(381); var21 != null && var21.field3123 != var18; var21 = (class638) this.field10561.method2476((byte) 18)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field10575 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field10575.field8971 = new class120(var15 + var22 + this.field10575.field8976);
                            this.field10575.field8971.method851((byte) -2, var16);
                            this.field10575.field8971.method879((byte) 97, var15);
                            this.field10573.field1521 = 0;
                            this.field10575.field8972 = 8;
                        } else if (this.field10575.field8972 != 0) {
                            throw new IOException();
                        } else if (this.field10573.field1556[0] == -1) {
                            this.field10575.field8972 = 1;
                            this.field10573.field1521 = 0;
                        } else {
                            this.field10575 = null;
                        }
                    }
                } else {
                    int var23 = this.field10575.field8971.field1556.length - this.field10575.field8976;
                    int var24 = 512 - this.field10575.field8972;
                    if (var24 > (var23 - this.field10575.field8971.field1521)) {
                        var24 = var23 - this.field10575.field8971.field1521;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field10568.method1179(var24, 0, this.field10575.field8971.field1521, this.field10575.field8971.field1556);
                    if (this.field10571 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field10575.field8971.field1556[this.field10575.field8971.field1521 + var25] = (byte) class470.method2786(this.field10575.field8971.field1556[this.field10575.field8971.field1521 + var25], this.field10571);
                        }
                    }
                    this.field10575.field8972 += var24;
                    this.field10575.field8971.field1521 += var24;
                    if (this.field10575.field8971.field1521 == var23) {
                        this.field10575.method1512(false);
                        this.field10575.field4984 = false;
                        this.field10575 = null;
                    } else if (this.field10575.field8972 == 512) {
                        this.field10575.field8972 = 0;
                    }
                }
            }
            if (arg0 != 4480) {
                this.field10569 = null;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field10568.method1178(arg0 - 4494);
            } catch (Exception var26) {
            }
            this.field10574 = -2;
            this.field10572++;
            this.field10568 = null;
            return this.method4222(126) == 0 && this.method4225(-43) == 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZ)V")
    public final void method4214(boolean arg0, boolean arg1) {
        field10555++;
        if (this.field10568 == null) {
            return;
        }
        try {
            this.field10569.field1521 = 0;
            if (!arg1) {
                this.method4213(-25);
            }
            this.field10569.method851((byte) -2, arg0 ? 2 : 3);
            this.field10569.method876(0, 1);
            this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
        } catch (IOException var4) {
            try {
                this.field10568.method1178(-55);
            } catch (Exception var3) {
            }
            this.field10574 = -2;
            this.field10568 = null;
            this.field10572++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZIBBI)Lte;")
    public final class638 method4215(boolean arg0, int arg1, byte arg2, byte arg3, int arg4) {
        field10548++;
        if (arg3 >= -55) {
            return null;
        }
        long var6 = (long) ((arg4 << 16) + arg1);
        class638 var8 = new class638();
        var8.field8976 = arg2;
        var8.field4985 = arg0;
        var8.field3123 = var6;
        if (arg0) {
            if (this.method4222(125) >= 20) {
                throw new RuntimeException();
            }
            this.field10553.method2475(var8, -19680);
        } else if (this.method4225(120) < 20) {
            this.field10563.method2475(var8, -19680);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lwq;II)Ljava/lang/String;")
    public static final String method4216(class176 arg0, int arg1, int arg2) {
        field10556++;
        if (!client.method2049(arg0).method3749(arg1, -119) && arg0.field2529 == null) {
            return null;
        } else if (arg0.field2618 == null || arg1 >= arg0.field2618.length || arg0.field2618[arg1] == null || arg0.field2618[arg1].trim().length() == 0) {
            return class52.field744 ? "Hidden-" + arg1 : null;
        } else {
            if (arg2 != -1) {
                method4227(-108, 74);
            }
            return arg0.field2618[arg1];
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lqm;ZB)V")
    public final void method4217(class153 arg0, boolean arg1, byte arg2) {
        if (this.field10568 != null) {
            try {
                this.field10568.method1178(-89);
            } catch (Exception var8) {
            }
            this.field10568 = null;
        }
        field10549++;
        this.field10568 = arg0;
        if (arg2 < 6) {
            this.field10568 = null;
        }
        this.method4218(-125);
        this.method4214(arg1, true);
        this.field10573.field1521 = 0;
        this.field10575 = null;
        while (true) {
            class638 var4 = (class638) this.field10561.method2481((byte) 121);
            if (var4 == null) {
                while (true) {
                    class638 var5 = (class638) this.field10566.method2481((byte) 90);
                    if (var5 == null) {
                        if (this.field10571 != 0) {
                            try {
                                this.field10569.field1521 = 0;
                                this.field10569.method851((byte) -2, 4);
                                this.field10569.method851((byte) -2, this.field10571);
                                this.field10569.method860(0, (byte) 117);
                                this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
                            } catch (IOException var7) {
                                try {
                                    this.field10568.method1178(-78);
                                } catch (Exception var6) {
                                }
                                this.field10568 = null;
                                this.field10572++;
                                this.field10574 = -2;
                            }
                        }
                        this.field10570 = 0;
                        this.field10567 = class109.method731(79);
                        return;
                    }
                    this.field10563.method2475(var5, -19680);
                }
            }
            this.field10553.method2475(var4, -19680);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    private final void method4218(int arg0) {
        field10557++;
        if (this.field10568 == null) {
            return;
        }
        try {
            this.field10569.field1521 = 0;
            int var2 = -41 % ((arg0 + 72) / 50);
            this.field10569.method851((byte) -2, 6);
            this.field10569.method876(3, 1);
            this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
        } catch (IOException var4) {
            try {
                this.field10568.method1178(-115);
            } catch (Exception var3) {
            }
            this.field10568 = null;
            this.field10574 = -2;
            this.field10572++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method4219(int arg0) {
        field10547++;
        try {
            this.field10568.method1178(-41);
        } catch (Exception var2) {
        }
        this.field10574 = -1;
        this.field10571 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        this.field10572++;
        this.field10568 = null;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
    public final boolean method4220(int arg0) {
        if (arg0 != 20) {
            this.field10553 = null;
        }
        field10560++;
        return this.method4222(arg0 + 106) >= 20;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method4221(byte arg0) {
        field10554++;
        if (arg0 == -24 && this.field10568 != null) {
            this.field10568.method1175(0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)I")
    public final int method4222(int arg0) {
        field10552++;
        return arg0 <= 123 ? 57 : this.field10553.method2479(true) + this.field10561.method2479(true);
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)Z")
    public final boolean method4223(int arg0) {
        field10564++;
        if (arg0 != -513) {
            this.method4215(true, 101, (byte) 7, (byte) 49, 37);
        }
        return this.method4225(arg0 ^ 0xFFFFFDAC) >= 20;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    public final void method4224(byte arg0) {
        if (arg0 <= -112) {
            field10551++;
            if (this.field10568 != null) {
                this.field10568.method1178(-72);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
    private final int method4225(int arg0) {
        int var2 = -90 / ((32 - arg0) / 40);
        field10550++;
        return this.field10563.method2479(true) + this.field10566.method2479(true);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
    public final void method4226(byte arg0) {
        field10558++;
        if (this.field10568 == null) {
            return;
        }
        try {
            this.field10569.field1521 = 0;
            this.field10569.method851((byte) -2, 7);
            this.field10569.method876(0, 1);
            if (arg0 >= -51) {
                this.field10570 = 99;
            }
            this.field10568.method1174(this.field10569.field1556, 0, 4, 3);
        } catch (IOException var3) {
            try {
                this.field10568.method1178(-73);
            } catch (Exception var2) {
            }
            this.field10572++;
            this.field10574 = -2;
            this.field10568 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public static final void method4227(int arg0, int arg1) {
        field10562++;
        if (arg1 != -513) {
            field10559 = -99;
        }
        class678 var2 = class630.method3597(29636, 11, (long) arg0);
        var2.method3836((byte) -61);
    }
}
