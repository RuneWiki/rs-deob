import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class44 {

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    private int field981 = 32;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "J")
    private long field991 = class253.method1711((byte) -74);

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    private int field995 = 0;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[Lk;")
    private class174[] field997 = new class174[8];

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    private int field998 = 0;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Z")
    private boolean field996 = true;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    private int field1001 = 0;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    private int field999 = 0;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "J")
    private long field1004 = 0L;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[Lk;")
    private class174[] field1000 = new class174[8];

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "J")
    private long field1006 = 0L;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
    public static int[] field976 = new int[25];

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Ljd;")
    public static class86 field986 = class122.method868("<)4col>", true);

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Ljd;")
    private static class86 field983 = class122.method868("M", true);

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Ljd;")
    public static class86 field985 = field983;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ljd;")
    public static class86 field972 = field983;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lk;")
    private class174 field987;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[[[B")
    public static byte[][][] field988;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public void method333(int arg0) throws Exception {
        field982++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    private final void method349(int arg0, int arg1) {
        if (arg1 >= -69) {
            return;
        }
        this.field999 -= arg0;
        if (this.field999 < 0) {
            this.field999 = 0;
        }
        if (this.field987 != null) {
            this.field987.method277(arg0);
        }
        field975++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public void method332() {
        field979++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLk;I)V")
    private final void method350(boolean arg0, class174 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        field992++;
        int var4 = arg2 >> 5;
        class174 var5 = this.field1000[var4];
        if (var5 == null) {
            this.field997[var4] = arg1;
        } else {
            var5.field3178 = arg1;
        }
        this.field1000[var4] = arg1;
        arg1.field3180 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final synchronized void method351(int arg0) {
        field970++;
        this.field996 = true;
        try {
            this.method334();
        } catch (Exception var2) {
            this.method332();
            this.field1006 = class253.method1711((byte) -112) + 2000L;
        }
        if (arg0 != 256) {
            this.method353(false, (class174) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
    public void method334() throws Exception {
        field989++;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final synchronized void method352(int arg0) {
        if (class265.field4680 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class265.field4680.field2420[var3] == this) {
                    class265.field4680.field2420[var3] = null;
                }
                if (class265.field4680.field2420[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class265.field4680.field2410 = true;
                while (class265.field4680.field2416) {
                    class91.method677(0, 50L);
                }
                class265.field4680 = null;
            }
        }
        if (arg0 != -12563) {
            this.field1000 = null;
        }
        field990++;
        this.method332();
        this.field971 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLk;)V")
    public final synchronized void method353(boolean arg0, class174 arg1) {
        this.field987 = arg1;
        field974++;
        if (arg0) {
            this.field1005 = -62;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method329(Component arg0) throws Exception {
        field977++;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()I")
    public int method328() throws Exception {
        field978++;
        return this.field1005;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field988 = null;
        if (arg0 != -110) {
            field972 = null;
        }
        field976 = null;
        field983 = null;
        field972 = null;
        field986 = null;
        field985 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public final void method355(byte arg0) {
        this.field996 = true;
        field994++;
        if (arg0 <= 26) {
            this.field997 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 > -102) {
            field969 = -72;
        }
        field993++;
        if ((arg5 - arg1) >= class49.field1044 && class129.field2473 >= arg1 + arg5 && class50.field1050 <= (arg4 - arg1) && class56.field1143 >= (arg4 + arg1)) {
            class118.method847(arg3, arg0, arg5, -121, arg4, arg1, arg6);
        } else {
            class144.method1026(arg0, (byte) -105, arg6, arg5, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()V")
    public void method330() throws Exception {
        field980++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([II)V")
    private final void method357(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class24.field590) {
            var3 = arg1 << 1;
        }
        class250.method1691(arg0, 0, var3);
        this.field999 -= arg1;
        if (this.field987 != null && this.field999 <= 0) {
            this.field999 += class65.field1277 >> 4;
            class235.method1630(this.field987, (byte) -112);
            this.method350(true, this.field987, this.field987.method1239());
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
                        class174 var10 = null;
                        class174 var11 = this.field997[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class262 var12 = var11.field3181;
                                if (var12 == null || var12.field4663 <= var8) {
                                    var11.field3179 = true;
                                    int var13 = var11.method302();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4663 += var13;
                                    }
                                    if (var4 >= this.field981) {
                                        break label107;
                                    }
                                    class174 var14 = var11.method283();
                                    if (var14 != null) {
                                        int var15 = var11.field3180;
                                        while (var14 != null) {
                                            this.method350(true, var14, var15 * var14.method1239() >> 8);
                                            var14 = var11.method276();
                                        }
                                    }
                                    class174 var16 = var11.field3178;
                                    var11.field3178 = null;
                                    if (var10 == null) {
                                        this.field997[var7] = var16;
                                    } else {
                                        var10.field3178 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1000[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3178;
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
                class174 var18 = this.field997[var17];
                this.field997[var17] = this.field1000[var17] = null;
                while (var18 != null) {
                    class174 var19 = var18.field3178;
                    var18.field3178 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field999 < 0) {
            this.field999 = 0;
        }
        if (this.field987 != null) {
            this.field987.method281(arg0, 0, arg1);
        }
        this.field991 = class253.method1711((byte) -38);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final synchronized void method358(int arg0) {
        field984++;
        if (arg0 != -15924) {
            this.field987 = null;
        }
        if (this.field971 == null) {
            return;
        }
        long var2 = class253.method1711((byte) -50);
        try {
            if (this.field1006 != 0L) {
                if (this.field1006 > var2) {
                    return;
                }
                this.method333(this.field1005);
                this.field1006 = 0L;
                this.field996 = true;
            }
            int var4 = this.method328();
            if ((this.field995 - var4) > this.field998) {
                this.field998 = this.field995 - var4;
            }
            int var5 = this.field1002 + this.field1003;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1005 < (var5 + 256)) {
                var4 = 0;
                this.field1005 += 1024;
                if (this.field1005 > 16384) {
                    this.field1005 = 16384;
                }
                this.method332();
                this.method333(this.field1005);
                this.field996 = true;
                if ((var5 + 256) > this.field1005) {
                    var5 = this.field1005 - 256;
                    this.field1003 = var5 - this.field1002;
                }
            }
            while (var5 > var4) {
                this.method357(this.field971, 256);
                var4 += 256;
                this.method330();
            }
            if (this.field1004 < var2) {
                if (this.field996) {
                    this.field996 = false;
                } else if (this.field998 == 0 && this.field1001 == 0) {
                    this.method332();
                    this.field1006 = var2 + 2000L;
                    return;
                } else {
                    this.field1003 = Math.min(this.field1001, this.field998);
                    this.field1001 = this.field998;
                }
                this.field1004 = var2 + 2000L;
                this.field998 = 0;
            }
            this.field995 = var4;
        } catch (Exception var7) {
            this.method332();
            this.field1006 = var2 + 2000L;
        }
        try {
            if (var2 > this.field991 + 500000L) {
                var2 = this.field991;
            }
            while (var2 > (this.field991 + 5000L)) {
                this.method349(256, -115);
                this.field991 += (long) (256000 / class65.field1277);
            }
        } catch (Exception var6) {
            this.field991 = var2;
        }
    }
}
