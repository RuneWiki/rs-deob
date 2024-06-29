import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class392 {

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "J")
    private long field5876 = -1L;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "J")
    private long field5863 = -1L;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    private int field5870 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lfca;")
    private class135 field5855;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "J")
    private long field5865;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "J")
    private long field5877;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[B")
    private byte[] field5859;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "[B")
    private byte[] field5864;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "J")
    private long field5873;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    private int field5868;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "J")
    private long field5861;

    static {
        new class567("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 4)
    private final void method2367(int arg0) throws IOException {
        if (this.field5876 != -1L) {
            if (this.field5876 != this.field5861) {
                this.field5855.method1033(this.field5876, (byte) 17);
                this.field5861 = this.field5876;
            }
            this.field5855.method1034(this.field5859, 0, 116, this.field5870);
            this.field5861 += this.field5870;
            if (this.field5865 < this.field5861) {
                this.field5865 = this.field5861;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5863 <= this.field5876 && ((long) this.field5868 + this.field5863) > this.field5876) {
                var2 = this.field5876;
            } else if (this.field5863 >= this.field5876 && (long) this.field5870 + this.field5876 > this.field5863) {
                var2 = this.field5863;
            }
            if (this.field5863 < (long) this.field5870 + this.field5876 && (long) this.field5868 + this.field5863 >= (long) this.field5870 + this.field5876) {
                var4 = (long) this.field5870 + this.field5876;
            } else if (this.field5863 + ((long) this.field5868) > this.field5876 && (this.field5863 + ((long) this.field5868)) <= (this.field5876 + ((long) this.field5870))) {
                var4 = (long) this.field5868 + this.field5863;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class164.method1151(this.field5859, (int) (var2 - this.field5876), this.field5864, (int) (var2 - this.field5863), var6);
            }
            this.field5876 = -1L;
            this.field5870 = 0;
        }
        field5866++;
        if (arg0 != -1) {
            this.method2373((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[BII)V", line = 79)
    public final void method2368(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5860++;
        try {
            if (((long) arg3 + this.field5873) > this.field5877) {
                this.field5877 = (long) arg3 + this.field5873;
            }
            if (this.field5876 != -1L && (this.field5876 > this.field5873 || ((long) this.field5870 + this.field5876) < this.field5873)) {
                this.method2367(-1);
            }
            int var5 = -7 % ((arg2 + 47) / 63);
            if (this.field5876 != -1L && this.field5873 + ((long) arg3) > (long) this.field5859.length + this.field5876) {
                int var6 = (int) ((long) this.field5859.length + this.field5876 - this.field5873);
                class164.method1151(arg1, arg0, this.field5859, (int) (this.field5873 - this.field5876), var6);
                arg0 += var6;
                this.field5873 += var6;
                arg3 -= var6;
                this.field5870 = this.field5859.length;
                this.method2367(-1);
            }
            if (this.field5859.length < arg3) {
                if (this.field5873 != this.field5861) {
                    this.field5855.method1033(this.field5873, (byte) 17);
                    this.field5861 = this.field5873;
                }
                this.field5855.method1034(arg1, arg0, 118, arg3);
                this.field5861 += arg3;
                if (this.field5865 < this.field5861) {
                    this.field5865 = this.field5861;
                }
                long var7 = -1L;
                if (this.field5863 <= this.field5873 && (this.field5863 + ((long) this.field5868)) > this.field5873) {
                    var7 = this.field5873;
                } else if (this.field5863 >= this.field5873 && (long) arg3 + this.field5873 > this.field5863) {
                    var7 = this.field5863;
                }
                long var9 = -1L;
                if (this.field5863 < (long) arg3 + this.field5873 && (long) arg3 + this.field5873 <= (long) this.field5868 + this.field5863) {
                    var9 = this.field5873 + ((long) arg3);
                } else if (((long) this.field5868 + this.field5863) > this.field5873 && (long) arg3 + this.field5873 >= (long) this.field5868 + this.field5863) {
                    var9 = (long) this.field5868 + this.field5863;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class164.method1151(arg1, (int) ((long) arg0 + var7 - this.field5873), this.field5864, (int) (var7 - this.field5863), var11);
                }
                this.field5873 += arg3;
            } else if (arg3 > 0) {
                if (this.field5876 == -1L) {
                    this.field5876 = this.field5873;
                }
                class164.method1151(arg1, arg0, this.field5859, (int) (this.field5873 - this.field5876), arg3);
                this.field5873 += arg3;
                if (this.field5873 - this.field5876 > (long) this.field5870) {
                    this.field5870 = (int) (this.field5873 - this.field5876);
                }
            }
        } catch (IOException var13) {
            this.field5861 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(JLqa;I)V", line = 200)
    public static final void method2369(long arg0, class167 arg1, int arg2) {
        field5857++;
        class101.field1736 = arg2;
        class600.field8521 = class150.field2268;
        class150.field2268 = 0;
        long var4 = class508.method2860(false);
        for (class585 var6 = (class585) class501.field7030.method944(arg2 ^ 0xFFFFFF84); var6 != null; var6 = (class585) class501.field7030.method947((byte) 117)) {
            if (var6.method3355(arg1, arg0)) {
                class101.field1736++;
            }
        }
        if (class174.field2522 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class501.field7030.method949(false) + ", running: " + class101.field1736 + ". Particles: " + class150.field2268 + ". Time taken: " + (class508.method2860(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 232)
    private final void method2370(boolean arg0) throws IOException {
        this.field5868 = 0;
        if (arg0) {
            return;
        }
        field5871++;
        if (this.field5873 != this.field5861) {
            this.field5855.method1033(this.field5873, (byte) 17);
            this.field5861 = this.field5873;
        }
        this.field5863 = this.field5873;
        while (this.field5868 < this.field5864.length) {
            int var2 = this.field5864.length - this.field5868;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5855.method1038(this.field5864, var2, -99, this.field5868);
            if (var3 == -1) {
                break;
            }
            this.field5861 += var3;
            this.field5868 += var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)J", line = 285)
    public final long method2371(int arg0) {
        if (arg0 != -2726) {
            this.field5873 = -79L;
        }
        field5875++;
        return this.field5877;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lqa;Lcea;IIIII)V", line = 306)
    public static final void method2372(class167 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class146.field2246 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class362.field5145) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class305.field4400 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class184 var15 = class277.field4051[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class88.field1594[var12].method694(var13, var14) + class88.field1594[var12].method694(var13 + 1, var14) + class88.field1594[var12].method694(var13, var14 + 1) + class88.field1594[var12].method694(var13 + 1, var14 + 1)) / 4 - (class88.field1594[arg2].method694(arg3, arg4) + class88.field1594[arg2].method694(arg3 + 1, arg4) + class88.field1594[arg2].method694(arg3, arg4 + 1) + class88.field1594[arg2].method694(arg3 + 1, arg4 + 1)) / 4;
                                    class363 var17 = var15.field2669;
                                    class363 var18 = var15.field2653;
                                    if (var17 != null && var17.method868(false)) {
                                        arg1.method866((byte) -84, var7, var16, arg0, (var13 - arg3) * class390.field5828 + (1 - arg5) * class468.field6745, (var14 - arg4) * class390.field5828 + (1 - arg6) * class468.field6745, var17);
                                    }
                                    if (var18 != null && var18.method868(false)) {
                                        arg1.method866((byte) -84, var7, var16, arg0, (var13 - arg3) * class390.field5828 + (1 - arg5) * class468.field6745, (var14 - arg4) * class390.field5828 + (1 - arg6) * class468.field6745, var18);
                                    }
                                    for (class277 var19 = var15.field2675; var19 != null; var19 = var19.field4045) {
                                        class360 var20 = var19.field4044;
                                        if (var20 != null && var20.method868(false) && (var20.field5117 == var13 || var8 == var13) && (var20.field5113 == var14 || var10 == var14)) {
                                            int var21 = var20.field5119 + 1 - var20.field5117;
                                            int var22 = var20.field5107 + 1 - var20.field5113;
                                            arg1.method866((byte) -84, var7, var16, arg0, (var20.field5117 - arg3) * class390.field5828 + (var21 - arg5) * class468.field6745, (var20.field5113 - arg4) * class390.field5828 + (var22 - arg6) * class468.field6745, var20);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Ljava/io/File;", line = 397)
    private final File method2373(byte arg0) {
        if (arg0 != 103) {
            this.field5873 = 42L;
        }
        field5862++;
        return this.field5855.method1035(-7763);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([BB)V", line = 408)
    public final void method2374(byte[] arg0, byte arg1) throws IOException {
        int var3 = -57 / ((arg1 + 73) / 43);
        this.method2376(0, arg0.length, arg0, -1);
        field5858++;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(JB)V", line = 420)
    public final void method2375(long arg0, byte arg1) throws IOException {
        field5872++;
        if (arg1 != 59) {
            this.field5876 = 33L;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2373((byte) 103));
        }
        this.field5873 = arg0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[BI)V", line = 437)
    public final void method2376(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5867++;
        try {
            if (arg0 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field5876 != -1L && this.field5873 >= this.field5876 && (long) this.field5870 + this.field5876 >= (long) arg1 + this.field5873) {
                class164.method1151(this.field5859, (int) (this.field5873 - this.field5876), arg2, arg0, arg1);
                this.field5873 += arg1;
                return;
            }
            long var5 = this.field5873;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field5873 >= this.field5863 && this.field5863 + ((long) this.field5868) > this.field5873) {
                int var9 = (int) (this.field5863 + (long) this.field5868 - this.field5873);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class164.method1151(this.field5864, (int) (this.field5873 - this.field5863), arg2, arg0, var9);
                this.field5873 += var9;
                arg0 += var9;
                arg1 -= var9;
            }
            if (this.field5864.length < arg1) {
                this.field5855.method1033(this.field5873, (byte) 17);
                this.field5861 = this.field5873;
                while (arg1 > 0) {
                    int var11 = this.field5855.method1038(arg2, arg1, -68, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field5873 += var11;
                    this.field5861 += var11;
                    arg0 += var11;
                }
            } else if (arg1 > 0) {
                this.method2370(false);
                int var10 = arg1;
                if (arg1 > this.field5868) {
                    var10 = this.field5868;
                }
                class164.method1151(this.field5864, 0, arg2, arg0, var10);
                arg0 += var10;
                arg1 -= var10;
                this.field5873 += var10;
            }
            if (this.field5876 != -1L) {
                if (this.field5873 < this.field5876 && arg1 > 0) {
                    int var12 = (int) (this.field5876 - this.field5873) + arg0;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field5873++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5876 >= var5 && this.field5876 < var5 + ((long) var8)) {
                    var13 = this.field5876;
                } else if (var5 >= this.field5876 && var5 < this.field5876 + ((long) this.field5870)) {
                    var13 = var5;
                }
                if (var5 < (long) this.field5870 + this.field5876 && (this.field5876 + ((long) this.field5870)) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field5870 + this.field5876;
                } else if (var5 + ((long) var8) > this.field5876 && ((long) var8 + var5) <= ((long) this.field5870 + this.field5876)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class164.method1151(this.field5859, (int) (var13 - this.field5876), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (this.field5873 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5873));
                        this.field5873 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5861 = -1L;
            throw var19;
        }
        if (arg3 > ~arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIIII)V", line = 619)
    public static final void method2377(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5874++;
        if (class277.field4051 == null) {
            class159.field2378.method1159(-16777216, arg3, arg2, arg4, (byte) 126, arg5);
        } else if (class644.field9367.field5108 >= 0 && (class146.field2247 * 128) > class644.field9367.field5108 && class644.field9367.field5109 >= 0 && class66.field990 * 128 > class644.field9367.field5109) {
            class79.field1432++;
            if (class644.field9367 != null && class644.field9367.field5108 - (class644.field9367.method781((byte) 55) - 1) * 64 >> 7 == class476.field6810 && class644.field9367.field5109 - (class644.field9367.method781((byte) -102) - 1) * 64 >> 7 == class439.field6391) {
                class439.field6391 = -1;
                class476.field6810 = -1;
                class406.method2468((byte) -67);
            }
            class577.method3300(32767);
            if (!arg0) {
                class321.method2000(127);
            }
            class122.method982((byte) -120);
            int var6 = -113 / ((32 - arg1) / 53);
            class49.method435(arg5, arg2, arg4, true, 5674, arg3);
            int var7 = class10.field113;
            int var8 = class285.field4160;
            int var9 = class401.field6002;
            int var10 = class233.field3435;
            if (class377.field5547 == 1) {
                int var13 = (int) class181.field2622;
                if (var13 < class32.field436 >> 8) {
                    var13 = class32.field436 >> 8;
                }
                if (class574.field8178[4] && (class362.field5147[4] + 128) > var13) {
                    var13 = class362.field5147[4] + 128;
                }
                int var14 = (int) class523.field7256 + class105.field1760 & 0x3FFF;
                class301.method1880(class372.field5377, var9, true, var14, class355.method2160(class644.field9367.field5108, class644.field9367.field5109, class545.field7583, (byte) 103) - 50, class8.field81, (var13 >> 3) * 3 + 600 << 0, var13);
            } else if (class377.field5547 == 4) {
                int var11 = (int) class181.field2622;
                if (var11 < class32.field436 >> 8) {
                    var11 = class32.field436 >> 8;
                }
                if (class574.field8178[4] && class362.field5147[4] + 128 > var11) {
                    var11 = class362.field5147[4] + 128;
                }
                int var12 = (int) class523.field7256 & 0x3FFF;
                class301.method1880(class372.field5377, var9, true, var12, class355.method2160(class69.field1304, class56.field807, class545.field7583, (byte) 103) - 50, class8.field81, ((var11 >> 3) * 3) + 600 << 0, var11);
            } else if (class377.field5547 == 5) {
                class394.method2390(var9, (byte) 64);
            }
            int var15 = class545.field7584;
            int var16 = class448.field6535;
            int var17 = class216.field3274;
            int var18 = class217.field3284;
            int var19 = class265.field3862;
            for (int var20 = 0; var20 < 5; var20++) {
                if (class574.field8178[var20]) {
                    int var23 = (int) ((double) (class442.field6467[var20] * 2 + 1) * Math.random() + Math.sin((double) class394.field5912[var20] / 100.0D * (double) class112.field1861[var20]) * (double) class362.field5147[var20] - (double) class442.field6467[var20]);
                    if (var20 == 0) {
                        class545.field7584 += var23 << 0;
                    }
                    if (var20 == 4) {
                        class217.field3284 += var23;
                        if (class217.field3284 < 1024) {
                            class217.field3284 = 1024;
                        } else if (class217.field3284 > 3072) {
                            class217.field3284 = 3072;
                        }
                    }
                    if (var20 == 1) {
                        class448.field6535 += var23 << 0;
                    }
                    if (var20 == 3) {
                        class265.field3862 = class265.field3862 + var23 & 0x3FFF;
                    }
                    if (var20 == 2) {
                        class216.field3274 += var23 << 0;
                    }
                }
            }
            if (class545.field7584 < 0) {
                class545.field7584 = 0;
            }
            if (class545.field7584 > ((class362.field5145 << 7) - 1)) {
                class545.field7584 = (class362.field5145 << 7) - 1;
            }
            if (class216.field3274 < 0) {
                class216.field3274 = 0;
            }
            if (class216.field3274 > ((class305.field4400 << 7) - 1)) {
                class216.field3274 = (class305.field4400 << 7) - 1;
            }
            class314.method1942(-89);
            class561.method3194(true);
            class159.field2378.method615(var10, var8, var7 + var10, var8 - -var9);
            class159.field2378.method142();
            int var21 = class77.field1403;
            if (class580.field8259 == null) {
                class159.field2378.method121(var21);
            } else {
                class580.field8259.method1500(var8, class399.field5941 << 3, class159.field2378, var10, false, class265.field3862, var7, var9, var21, class217.field3284);
            }
            class547.method3064((byte) 102);
            class81.field1444.method888(class545.field7584, class448.field6535, class216.field3274, -class217.field3284 & 0x3FFF, -class265.field3862 & 0x3FFF, -class394.field5910 & 0x3FFF);
            class159.field2378.method587(class81.field1444);
            class159.field2378.method519(var7 / 2 + var10, var9 / 2 + var8, class108.field1805 << 1, class108.field1805 << 1);
            class69.method678(var9 / 2 + var8, class108.field1805 << 1, class108.field1805 << 1, var7 / 2 + var10, true);
            class182.method1224(class545.field7584, class216.field3274, -class394.field5910 & 0x3FFF, -class265.field3862 & 0x3FFF, -class217.field3284 & 0x3FFF, (byte) -122, class448.field6535);
            byte var22 = class202.field2854.method2639(class646.field9388, (byte) 119) == 2 ? (byte) class79.field1432 : 1;
            class166.method1154(class159.field2378, class310.field4553, class552.field7816, class81.field1444, class545.field7584, class448.field6535, class216.field3274, class338.field4854, class493.field6923, class612.field8693, class321.field4652, class78.field1414, class443.field6475, class644.field9367.field5116 + 1, var22, class644.field9367.field5108 >> 7, class644.field9367.field5109 >> 7, !class202.field2854.field7884);
            class547.method3064((byte) -117);
            if (class64.field893 == 9) {
                class77.method724((byte) -118, 256, 256, var10, var9, var7, var8);
                class562.method3202(256, var9, var10, false, var7, var8, 256);
                class529.method2976(256, var9, var10, -1, var8, var7, 256);
                class503.method2852((byte) -80, var9, var8, var7, var10);
            }
            class221.method1476();
            class265.field3862 = var19;
            class545.field7584 = var15;
            class217.field3284 = var18;
            class448.field6535 = var16;
            class216.field3274 = var17;
            if (class27.field369 && class384.field5712.method896(8) == 0) {
                class27.field369 = false;
            }
            if (class27.field369) {
                class159.field2378.method1159(-16777216, var9, var8, var10, (byte) -77, var7);
                class247.method1570(class130.field2119.method3220(false, class538.field7500), class409.field6077, false, 15900);
            }
        } else {
            class159.field2378.method1159(-16777216, arg3, arg2, arg4, (byte) 97, arg5);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([FBI)[F", line = 810)
    public static final float[] method2378(float[] arg0, byte arg1, int arg2) {
        field5869++;
        if (arg1 != 115) {
            field5856 = 67;
        }
        float[] var3 = new float[arg2];
        class164.method1150(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lfca;II)V", line = 848)
    public class392(class135 arg0, int arg1, int arg2) throws IOException {
        this.field5855 = arg0;
        this.field5877 = this.field5865 = arg0.method1037(0);
        this.field5859 = new byte[arg2];
        this.field5864 = new byte[arg1];
        this.field5873 = 0L;
    }
}
