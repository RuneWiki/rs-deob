import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class39 {

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    private int field621 = 32;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "J")
    private long field613 = class28.method200(-122);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    private int field625 = 0;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    private int field631 = 0;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    private int field626 = 0;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    private int field630 = 0;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[Ldg;")
    private class136[] field629 = new class136[8];

    @OriginalMember(owner = "client!r", name = "K", descriptor = "J")
    private long field633 = 0L;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "J")
    private long field623 = 0L;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "[Ldg;")
    private class136[] field634 = new class136[8];

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Ljd;")
    public static class85 field610 = class221.method1499("showVideoAd", (byte) 95);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Ljd;")
    public static class85 field619 = class221.method1499("Konfig geladen)3", (byte) -62);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Ljd;")
    public static class85 field603 = null;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field618 = 7759444;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public static int[] field599 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field616 = 2;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Ldg;")
    private class136 field614;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lqe;")
    public static class94 field615;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
    public int[] field611;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[I")
    public static int[] field622;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldg;IB)V")
    private final void method255(class136 arg0, int arg1, byte arg2) {
        field597++;
        int var4 = arg1 >> 5;
        class136 var5 = this.field634[var4];
        if (var5 == null) {
            this.field629[var4] = arg0;
        } else {
            var5.field2374 = arg0;
        }
        this.field634[var4] = arg0;
        if (arg2 != -57) {
            this.method263(-64);
        }
        arg0.field2377 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public void method256() {
        field612++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    private final void method257(int arg0, int arg1) {
        field606++;
        this.field626 -= arg0;
        if (this.field626 < arg1) {
            this.field626 = 0;
        }
        if (this.field614 != null) {
            this.field614.method795(arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method258(Component arg0) throws Exception {
        field600++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public void method259(int arg0) throws Exception {
        field602++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method260(byte arg0) {
        if (arg0 <= 61) {
            field616 = 121;
        }
        field599 = null;
        field610 = null;
        field619 = null;
        field603 = null;
        field615 = null;
        field622 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
    public void method261() throws Exception {
        field604++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
    public static final void method262(byte arg0, int arg1) {
        field607++;
        if (arg1 == -1) {
            return;
        }
        int var2 = -102 % ((-arg0 - 73) / 53);
        if (!class222.method1508(0, arg1)) {
            return;
        }
        class255[] var3 = class215.field3774[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class255 var5 = var3[var4];
            if (var5.field4529 != null) {
                class5 var6 = new class5();
                var6.field58 = var5;
                var6.field67 = var5.field4529;
                class252.method1741(110, var6, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public final synchronized void method263(int arg0) {
        field609++;
        if (this.field611 == null) {
            return;
        }
        long var2 = class28.method200(arg0 - 26473);
        try {
            if (this.field623 != 0L) {
                if (var2 < this.field623) {
                    return;
                }
                this.method259(this.field627);
                this.field624 = true;
                this.field623 = 0L;
            }
            int var4 = this.method266();
            int var5 = this.field632 + this.field628;
            if (this.field625 < this.field631 - var4) {
                this.field625 = this.field631 - var4;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field627) {
                this.field627 += 1024;
                if (this.field627 > 16384) {
                    this.field627 = 16384;
                }
                var4 = 0;
                this.method256();
                this.method259(this.field627);
                this.field624 = true;
                if ((var5 + 256) > this.field627) {
                    var5 = this.field627 - 256;
                    this.field632 = var5 - this.field628;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method268(this.field611, 256);
                this.method267();
            }
            if (var2 > this.field633) {
                if (this.field624) {
                    this.field624 = false;
                } else if (this.field625 == 0 && this.field630 == 0) {
                    this.method256();
                    this.field623 = var2 + 2000L;
                    return;
                } else {
                    this.field632 = Math.min(this.field630, this.field625);
                    this.field630 = this.field625;
                }
                this.field625 = 0;
                this.field633 = var2 + 2000L;
            }
            this.field631 = var4;
        } catch (Exception var7) {
            this.method256();
            this.field623 = var2 + 2000L;
        }
        try {
            if (var2 > this.field613 + 500000L) {
                var2 = this.field613;
            }
            while (this.field613 + 5000L < var2) {
                this.method257(256, 0);
                this.field613 += (long) (256000 / class159.field2706);
            }
            if (arg0 != 26595) {
                this.method265(-4, (class136) null);
            }
        } catch (Exception var6) {
            this.field613 = var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public final synchronized void method264(byte arg0) {
        field620++;
        if (class110.field1927 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class110.field1927.field829[var3] == this) {
                    class110.field1927.field829[var3] = null;
                }
                if (class110.field1927.field829[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class110.field1927.field835 = true;
                while (class110.field1927.field821) {
                    class190.method1311(50L, 1);
                }
                class110.field1927 = null;
            }
        }
        if (arg0 != 109) {
            this.method264((byte) -127);
        }
        this.method256();
        this.field611 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILdg;)V")
    public final synchronized void method265(int arg0, class136 arg1) {
        int var3 = 71 / ((arg0 + 77) / 43);
        this.field614 = arg1;
        field601++;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
    public int method266() throws Exception {
        field605++;
        return this.field627;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public void method267() throws Exception {
        field598++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([II)V")
    private final void method268(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class256.field4568) {
            var3 = arg1 << 1;
        }
        class248.method1722(arg0, 0, var3);
        this.field626 -= arg1;
        if (this.field614 != null && this.field626 <= 0) {
            this.field626 += class159.field2706 >> 4;
            class222.method1503(this.field614, (byte) 1);
            this.method255(this.field614, this.field614.method905(), (byte) -57);
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
                        class136 var10 = null;
                        class136 var11 = this.field629[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class174 var12 = var11.field2375;
                                if (var12 == null || var12.field3002 <= var8) {
                                    var11.field2376 = true;
                                    int var13 = var11.method764();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3002 += var13;
                                    }
                                    if (var4 >= this.field621) {
                                        break label107;
                                    }
                                    class136 var14 = var11.method791();
                                    if (var14 != null) {
                                        int var15 = var11.field2377;
                                        while (var14 != null) {
                                            this.method255(var14, var15 * var14.method905() >> 8, (byte) -57);
                                            var14 = var11.method780();
                                        }
                                    }
                                    class136 var16 = var11.field2374;
                                    var11.field2374 = null;
                                    if (var10 == null) {
                                        this.field629[var7] = var16;
                                    } else {
                                        var10.field2374 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field634[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2374;
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
                class136 var18 = this.field629[var17];
                this.field629[var17] = this.field634[var17] = null;
                while (var18 != null) {
                    class136 var19 = var18.field2374;
                    var18.field2374 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field626 < 0) {
            this.field626 = 0;
        }
        if (this.field614 != null) {
            this.field614.method775(arg0, 0, arg1);
        }
        this.field613 = class28.method200(117);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public final void method269(int arg0) {
        field617++;
        if (arg0 == -21792) {
            this.field624 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public final synchronized void method270(byte arg0) {
        field608++;
        this.field624 = true;
        try {
            this.method261();
        } catch (Exception var3) {
            this.method256();
            this.field623 = class28.method200(120) + 2000L;
        }
        int var2 = -90 % ((arg0 + 17) / 63);
    }
}
