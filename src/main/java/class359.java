import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class359 {

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Ltk;")
    private class230 field4637 = new class230();

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Ltk;")
    private class230 field4639 = new class230();

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Ltk;")
    private class230 field4642 = new class230();

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Ltk;")
    private class230 field4643 = new class230();

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Lfh;")
    private class463 field4646 = new class463(4);

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "B")
    private byte field4649 = 0;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public volatile int field4650 = 0;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public volatile int field4651 = 0;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Lfh;")
    private class463 field4648 = new class463(8);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lap;")
    public static class335 field4622 = new class335("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field4636 = 0;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "[I")
    public static int[] field4635 = new int[32];

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Lap;")
    public static class335 field4641;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    private int field4645;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "J")
    private long field4647;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "Lkq;")
    private class421 field4644;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Lam;")
    public static class448 field4633;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Ldv;")
    private class470 field4652;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "Lps;")
    public static class63 field4640;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lkq;IZ)V")
    public final void method2055(class421 arg0, int arg1, boolean arg2) {
        if (this.field4644 != null) {
            try {
                this.field4644.method2473(10228);
            } catch (Exception var8) {
            }
            this.field4644 = null;
        }
        field4634++;
        this.field4644 = arg0;
        this.method2059(-105);
        this.method2058(arg2, 0);
        this.field4652 = null;
        this.field4648.field6631 = 0;
        while (true) {
            class470 var4 = (class470) this.field4639.method1393((byte) 126);
            if (var4 == null) {
                while (true) {
                    class470 var5 = (class470) this.field4643.method1393((byte) 126);
                    if (var5 == null) {
                        if (this.field4649 != 0) {
                            try {
                                this.field4646.field6631 = 0;
                                this.field4646.method2729(4, false);
                                this.field4646.method2729(this.field4649, false);
                                this.field4646.method2759((byte) -86, 0);
                                this.field4644.method2475(0, (byte) 118, 4, this.field4646.field6618);
                            } catch (IOException var7) {
                                try {
                                    this.field4644.method2473(10228);
                                } catch (Exception var6) {
                                }
                                this.field4651 = -2;
                                this.field4644 = null;
                                this.field4650++;
                            }
                        }
                        this.field4645 = arg1;
                        this.field4647 = class504.method3034((byte) -105);
                        return;
                    }
                    this.field4642.method1400(false, var5);
                }
            }
            this.field4637.method1400(false, var4);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method2056(byte arg0) {
        field4635 = null;
        field4641 = null;
        field4640 = null;
        field4622 = null;
        field4633 = null;
        if (arg0 != -53) {
            field4635 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)Z")
    public final boolean method2057(byte arg0) {
        if (this.field4644 != null) {
            long var2 = class504.method3034((byte) -115);
            int var4 = (int) (var2 - this.field4647);
            this.field4647 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4645 += var4;
            if (this.field4645 > 30000) {
                try {
                    this.field4644.method2473(10228);
                } catch (Exception var27) {
                }
                this.field4644 = null;
            }
        }
        field4627++;
        if (this.field4644 == null) {
            return this.method2061(5) == 0 && this.method2067(5) == 0;
        }
        try {
            this.field4644.method2477(0);
            for (class470 var5 = (class470) this.field4637.method1399(112); var5 != null; var5 = (class470) this.field4637.method1394((byte) 14)) {
                this.field4646.field6631 = 0;
                this.field4646.method2729(1, false);
                this.field4646.method2731((int) var5.field1098, (byte) 120);
                this.field4644.method2475(0, (byte) 105, 4, this.field4646.field6618);
                this.field4639.method1400(false, var5);
            }
            for (class470 var6 = (class470) this.field4642.method1399(125); var6 != null; var6 = (class470) this.field4642.method1394((byte) 14)) {
                this.field4646.field6631 = 0;
                this.field4646.method2729(0, false);
                this.field4646.method2731((int) var6.field1098, (byte) 122);
                this.field4644.method2475(0, (byte) 125, 4, this.field4646.field6618);
                this.field4643.method1400(false, var6);
            }
            if (arg0 <= 86) {
                this.field4639 = null;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4644.method2470((byte) 60);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4645 = 0;
                byte var9 = 0;
                if (this.field4652 == null) {
                    var9 = 8;
                } else if (this.field4652.field6815 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4652.field6823.field6618.length - this.field4652.field6821;
                    int var11 = 512 - this.field4652.field6815;
                    if (var10 - this.field4652.field6823.field6631 < var11) {
                        var11 = var10 - this.field4652.field6823.field6631;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4644.method2472(-20555, var11, this.field4652.field6823.field6618, this.field4652.field6823.field6631);
                    if (this.field4649 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4652.field6823.field6618[this.field4652.field6823.field6631 + var12] = (byte) class489.method2968(this.field4652.field6823.field6618[this.field4652.field6823.field6631 + var12], this.field4649);
                        }
                    }
                    this.field4652.field6823.field6631 += var11;
                    this.field4652.field6815 += var11;
                    if (this.field4652.field6823.field6631 == var10) {
                        this.field4652.method701(80);
                        this.field4652.field7502 = false;
                        this.field4652 = null;
                    } else if (this.field4652.field6815 == 512) {
                        this.field4652.field6815 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4648.field6631;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4644.method2472(-20555, var13, this.field4648.field6618, this.field4648.field6631);
                    if (this.field4649 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4648.field6618[this.field4648.field6631 + var14] = (byte) class489.method2968(this.field4648.field6618[this.field4648.field6631 + var14], this.field4649);
                        }
                    }
                    this.field4648.field6631 += var13;
                    if (this.field4648.field6631 >= var9) {
                        if (this.field4652 == null) {
                            this.field4648.field6631 = 0;
                            int var15 = this.field4648.method2737(false);
                            int var16 = this.field4648.method2758((byte) 114);
                            int var17 = this.field4648.method2737(false);
                            int var18 = this.field4648.method2727(-122);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class470 var24;
                            if (var20) {
                                for (var24 = (class470) this.field4643.method1399(123); var24 != null && var24.field1098 != var21; var24 = (class470) this.field4643.method1394((byte) 14)) {
                                }
                            } else {
                                for (var24 = (class470) this.field4639.method1399(119); var24 != null && var24.field1098 != var21; var24 = (class470) this.field4639.method1394((byte) 14)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4652 = var24;
                            this.field4652.field6823 = new class463(var18 + this.field4652.field6821 + var25);
                            this.field4652.field6823.method2729(var19, false);
                            this.field4652.field6823.method2777(var18, -11);
                            this.field4652.field6815 = 8;
                            this.field4648.field6631 = 0;
                        } else if (this.field4652.field6815 != 0) {
                            throw new IOException();
                        } else if (this.field4648.field6618[0] == -1) {
                            this.field4652.field6815 = 1;
                            this.field4648.field6631 = 0;
                        } else {
                            this.field4652 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4644.method2473(10228);
            } catch (Exception var26) {
            }
            this.field4651 = -2;
            this.field4650++;
            this.field4644 = null;
            return this.method2061(5) == 0 && this.method2067(5) == 0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
    public final void method2058(boolean arg0, int arg1) {
        field4638++;
        if (this.field4644 == null) {
            return;
        }
        try {
            this.field4646.field6631 = 0;
            this.field4646.method2729(arg0 ? 2 : 3, false);
            this.field4646.method2731(0, (byte) 107);
            this.field4644.method2475(arg1, (byte) 113, 4, this.field4646.field6618);
        } catch (IOException var4) {
            try {
                this.field4644.method2473(arg1 + 10228);
            } catch (Exception var3) {
            }
            this.field4644 = null;
            this.field4651 = -2;
            this.field4650++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    private final void method2059(int arg0) {
        int var2 = -122 / ((39 - arg0) / 41);
        field4625++;
        if (this.field4644 == null) {
            return;
        }
        try {
            this.field4646.field6631 = 0;
            this.field4646.method2729(6, false);
            this.field4646.method2731(3, (byte) 122);
            this.field4644.method2475(0, (byte) 104, 4, this.field4646.field6618);
        } catch (IOException var4) {
            try {
                this.field4644.method2473(10228);
            } catch (Exception var3) {
            }
            this.field4644 = null;
            this.field4651 = -2;
            this.field4650++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Z")
    public final boolean method2060(boolean arg0) {
        if (!arg0) {
            this.method2068((byte) -75);
        }
        field4628++;
        return this.method2067(5) >= 20;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
    public final int method2061(int arg0) {
        field4624++;
        if (arg0 != 5) {
            this.method2065(107);
        }
        return this.field4637.method1398((byte) 43) + this.field4639.method1398((byte) 79);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIIZB)Ldv;")
    public final class470 method2062(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field4621++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class470 var8 = new class470();
        if (!arg3) {
            method2056((byte) -35);
        }
        var8.field7504 = arg0;
        var8.field1098 = var6;
        var8.field6821 = arg4;
        if (arg0) {
            if (this.method2061(5) >= 20) {
                throw new RuntimeException();
            }
            this.field4637.method1400(false, var8);
        } else if (this.method2067(5) < 20) {
            this.field4642.method1400(false, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)V")
    public final void method2063(boolean arg0) {
        field4631++;
        if (arg0 && this.field4644 != null) {
            this.field4644.method2473(10228);
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    public final void method2064(int arg0) {
        field4630++;
        if (this.field4644 == null) {
            return;
        }
        try {
            if (arg0 != -2) {
                field4641 = null;
            }
            this.field4646.field6631 = 0;
            this.field4646.method2729(7, false);
            this.field4646.method2731(0, (byte) 125);
            this.field4644.method2475(0, (byte) 111, 4, this.field4646.field6618);
        } catch (IOException var3) {
            try {
                this.field4644.method2473(arg0 + 10230);
            } catch (Exception var2) {
            }
            this.field4644 = null;
            this.field4650++;
            this.field4651 = -2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public final void method2065(int arg0) {
        field4632++;
        try {
            this.field4644.method2473(10228);
        } catch (Exception var2) {
        }
        this.field4649 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4651 = -1;
        this.field4650++;
        if (arg0 >= -49) {
            this.method2067(-80);
        }
        this.field4644 = null;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
    public final void method2066(byte arg0) {
        if (this.field4644 != null) {
            this.field4644.method2471((byte) -104);
        }
        field4629++;
        if (arg0 != -92) {
            field4640 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)I")
    private final int method2067(int arg0) {
        if (arg0 != 5) {
            field4635 = null;
        }
        field4626++;
        return this.field4642.method1398((byte) 117) + this.field4643.method1398((byte) 118);
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
    public final boolean method2068(byte arg0) {
        if (arg0 > -9) {
            this.field4652 = null;
        }
        field4623++;
        return this.method2061(5) >= 20;
    }

    static {
        new class335("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field4641 = new class335("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
    }
}
