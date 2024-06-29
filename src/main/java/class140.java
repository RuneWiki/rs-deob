import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class140 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    private int field2012 = 32;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
    private boolean field2029 = false;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
    private long field2020 = class440.method2583(25267);

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
    private boolean field2037 = true;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "J")
    private long field2036 = 0L;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
    private long field2039 = 0L;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    private int field2033 = 0;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    private int field2040 = 0;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "[Lll;")
    private class224[] field2041 = new class224[8];

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lll;")
    private class224[] field2034 = new class224[8];

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    private int field2044 = 0;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    private int field2043 = 0;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lhu;")
    public static class76 field2023 = new class76(20);

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Ls;")
    public static class169 field2045 = new class169(10, 6);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Ljd;")
    public static class139 field2042;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Lll;")
    private class224 field2030;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
    public int[] field2017;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field2047;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final synchronized void method845(int arg0) {
        field2026++;
        if (this.field2029) {
            return;
        }
        long var2 = class440.method2583(25267);
        try {
            if (var2 > this.field2020 + 500000L) {
                this.field2020 = var2 - 500000L;
            }
            while ((this.field2020 + 5000L) < var2) {
                this.method853((byte) 110, 256);
                this.field2020 += (long) (256000 / class165.field2290);
            }
        } catch (Exception var7) {
            this.field2020 = var2;
        }
        if (this.field2017 == null) {
            return;
        }
        try {
            if (this.field2036 != 0L) {
                if (var2 < this.field2036) {
                    return;
                }
                this.method739(this.field2038);
                this.field2036 = 0L;
                this.field2037 = true;
            }
            int var4 = this.method741();
            if (this.field2044 - var4 > this.field2033) {
                this.field2033 = this.field2044 - var4;
            }
            int var5 = this.field2035 + this.field2032;
            if ((arg0 + var5) > 16384) {
                var5 = 16128;
            }
            if (this.field2038 < var5 + 256) {
                this.field2038 += 1024;
                if (this.field2038 > 16384) {
                    this.field2038 = 16384;
                }
                this.method738();
                var4 = 0;
                this.method739(this.field2038);
                if (this.field2038 < var5 + 256) {
                    var5 = this.field2038 - 256;
                    this.field2035 = var5 - this.field2032;
                }
                this.field2037 = true;
            }
            while (var5 > var4) {
                this.method850(this.field2017, 256);
                this.method742();
                var4 += 256;
            }
            if (var2 > this.field2039) {
                if (this.field2037) {
                    this.field2037 = false;
                } else if (this.field2033 == 0 && this.field2040 == 0) {
                    this.method738();
                    this.field2036 = var2 + 2000L;
                    return;
                } else {
                    this.field2035 = Math.min(this.field2040, this.field2033);
                    this.field2040 = this.field2033;
                }
                this.field2033 = 0;
                this.field2039 = var2 + 2000L;
            }
            this.field2044 = var4;
        } catch (Exception var6) {
            this.method738();
            this.field2036 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final synchronized void method846(int arg0) {
        field2019++;
        this.field2037 = true;
        try {
            this.method743();
            if (arg0 != -30243) {
                this.field2037 = false;
            }
        } catch (Exception var2) {
            this.method738();
            this.field2036 = class440.method2583(25267) + 2000L;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
    public static final boolean method847(byte arg0) {
        if (arg0 > -64) {
            return false;
        } else {
            field2024++;
            return class307.field4055;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static void method848(int arg0) {
        field2042 = null;
        field2047 = null;
        if (arg0 == 0) {
            field2045 = null;
            field2023 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lll;BI)V")
    private final void method849(class224 arg0, byte arg1, int arg2) {
        field2021++;
        int var4 = arg2 >> 5;
        class224 var5 = this.field2034[var4];
        if (var5 == null) {
            this.field2041[var4] = arg0;
        } else {
            var5.field2967 = arg0;
        }
        this.field2034[var4] = arg0;
        if (arg1 >= -29) {
            this.method850((int[]) null, -108);
        }
        arg0.field2968 = arg2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
    public int method741() throws Exception {
        field2027++;
        return this.field2038;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
    public void method743() throws Exception {
        field2018++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([II)V")
    private final void method850(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class267.field3526) {
            var3 = arg1 << 1;
        }
        class380.method2335(arg0, 0, var3);
        this.field2043 -= arg1;
        if (this.field2030 != null && this.field2043 <= 0) {
            this.field2043 += class165.field2290 >> 4;
            class458.method2692(0, this.field2030);
            this.method849(this.field2030, (byte) -119, this.field2030.method290());
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
                        class224 var10 = null;
                        class224 var11 = this.field2041[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class83 var12 = var11.field2969;
                                if (var12 == null || var12.field1098 <= var8) {
                                    var11.field2970 = true;
                                    int var13 = var11.method58();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1098 += var13;
                                    }
                                    if (var4 >= this.field2012) {
                                        break label107;
                                    }
                                    class224 var14 = var11.method53();
                                    if (var14 != null) {
                                        int var15 = var11.field2968;
                                        while (var14 != null) {
                                            this.method849(var14, (byte) -96, var15 * var14.method290() >> 8);
                                            var14 = var11.method56();
                                        }
                                    }
                                    class224 var16 = var11.field2967;
                                    var11.field2967 = null;
                                    if (var10 == null) {
                                        this.field2041[var7] = var16;
                                    } else {
                                        var10.field2967 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2034[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2967;
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
                class224 var18 = this.field2041[var17];
                this.field2041[var17] = this.field2034[var17] = null;
                while (var18 != null) {
                    class224 var19 = var18.field2967;
                    var18.field2967 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2043 < 0) {
            this.field2043 = 0;
        }
        if (this.field2030 != null) {
            this.field2030.method59(arg0, 0, arg1);
        }
        this.field2020 = class440.method2583(25267);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
    public void method738() {
        field2011++;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public final void method851(int arg0) {
        if (arg0 != 8) {
            this.field2035 = -66;
        }
        this.field2037 = true;
        field2016++;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public final synchronized void method852(int arg0) {
        field2015++;
        if (class12.field167 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class12.field167.field6643[var3] == this) {
                    class12.field167.field6643[var3] = null;
                }
                if (class12.field167.field6643[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class12.field167.field6650 = true;
                while (class12.field167.field6642) {
                    class374.method2298(-28114, 50L);
                }
                class12.field167 = null;
            }
        }
        int var4 = -2 / ((-arg0 - 1) / 44);
        this.method738();
        this.field2029 = true;
        this.field2017 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method740(Component arg0) throws Exception {
        field2028++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    private final void method853(byte arg0, int arg1) {
        this.field2043 -= arg1;
        field2031++;
        if (this.field2043 < 0) {
            this.field2043 = 0;
        }
        if (arg0 != 110) {
            this.method846(91);
        }
        if (this.field2030 != null) {
            this.field2030.method63(arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
    public void method742() throws Exception {
        field2022++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILll;)V")
    public final synchronized void method854(int arg0, class224 arg1) {
        if (arg0 == 0) {
            this.field2030 = arg1;
            field2025++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
    public static final int method855(int arg0) {
        field2014++;
        if ((double) class55.field744 == 3.0D) {
            return 37;
        }
        if (arg0 != 200) {
            field2023 = null;
        }
        if ((double) class55.field744 == 4.0D) {
            return 50;
        } else if ((double) class55.field744 == 6.0D) {
            return 75;
        } else if ((double) class55.field744 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public void method739(int arg0) throws Exception {
        field2013++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILr;)I")
    public static final int method856(int arg0, class110 arg1) {
        field2046++;
        int var2 = arg0;
        if (arg1.method700((byte) 117, class311.field4104)) {
            var2 = arg0 + 1;
        }
        if (arg1.method700((byte) -108, class155.field2170)) {
            var2++;
        }
        return var2;
    }

    static {
        new class206("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
