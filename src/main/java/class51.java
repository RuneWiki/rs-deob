import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class51 {

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lgf;")
    private class222 field886 = new class222();

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lgf;")
    private class222 field894 = new class222();

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lgf;")
    private class222 field896 = new class222();

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lgf;")
    private class222 field897 = new class222();

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Leh;")
    private class101 field901 = new class101(4);

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public volatile int field902 = 0;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "B")
    private byte field905 = 0;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public volatile int field904 = 0;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Leh;")
    private class101 field903 = new class101(8);

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lrc;")
    public static class9 field882 = new class9(4);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static volatile int field890 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "J")
    private long field900;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lvh;")
    public static class108 field891;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lwc;")
    private class207 field898;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Ljc;")
    private class268 field906;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[Lcj;")
    public static class74[] field881;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        try {
            this.field898.method1380(true);
        } catch (Exception var2) {
        }
        this.field905 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
        this.field902++;
        this.field898 = null;
        field889++;
        this.field904 = -1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public final void method312(int arg0) {
        field888++;
        if (this.field898 == null) {
            return;
        }
        try {
            this.field901.field1762 = 0;
            this.field901.method682(7, 22555);
            this.field901.method681(0, -94);
            this.field898.method1382(this.field901.field1730, 4, 0, (byte) -110);
            if (arg0 != 23746) {
                this.field886 = null;
            }
        } catch (IOException var3) {
            try {
                this.field898.method1380(true);
            } catch (Exception var2) {
            }
            this.field898 = null;
            this.field904 = -2;
            this.field902++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method313(int arg0) {
        if (this.field898 != null) {
            this.field898.method1380(true);
        }
        field879++;
        if (arg0 != 1957862288) {
            field882 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
    private final int method314(int arg0) {
        field878++;
        return arg0 <= 5 ? 121 : this.field896.method1493(false) + this.field897.method1493(false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
    public final void method315(boolean arg0, int arg1) {
        field892++;
        if (this.field898 == null) {
            return;
        }
        try {
            this.field901.field1762 = 0;
            this.field901.method682(arg0 ? 2 : 3, 22555);
            this.field901.method681(0, -101);
            this.field898.method1382(this.field901.field1730, 4, 0, (byte) -46);
            if (arg1 != 30445) {
                this.method316((byte) -96);
            }
        } catch (IOException var4) {
            try {
                this.field898.method1380(true);
            } catch (Exception var3) {
            }
            this.field904 = -2;
            this.field898 = null;
            this.field902++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
    public final boolean method316(byte arg0) {
        field885++;
        if (arg0 != 35) {
            this.method314(-77);
        }
        return this.method314(47) >= 20;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILwc;Z)V")
    public final void method317(int arg0, class207 arg1, boolean arg2) {
        field883++;
        if (this.field898 != null) {
            try {
                this.field898.method1380(true);
            } catch (Exception var8) {
            }
            this.field898 = null;
        }
        this.field898 = arg1;
        this.method323(-28275);
        this.method315(arg2, 30445);
        this.field906 = null;
        if (arg0 < 5) {
            this.field900 = -11L;
        }
        this.field903.field1762 = 0;
        while (true) {
            class268 var4 = (class268) this.field894.method1492((byte) -114);
            if (var4 == null) {
                while (true) {
                    class268 var5 = (class268) this.field897.method1492((byte) 122);
                    if (var5 == null) {
                        if (this.field905 != 0) {
                            try {
                                this.field901.field1762 = 0;
                                this.field901.method682(4, 22555);
                                this.field901.method682(this.field905, 22555);
                                this.field901.method639(0, 15267);
                                this.field898.method1382(this.field901.field1730, 4, 0, (byte) -32);
                            } catch (IOException var7) {
                                try {
                                    this.field898.method1380(true);
                                } catch (Exception var6) {
                                }
                                this.field898 = null;
                                this.field904 = -2;
                                this.field902++;
                            }
                        }
                        this.field899 = 0;
                        this.field900 = class232.method1544((byte) -68);
                        return;
                    }
                    this.field896.method1498(0, var5);
                }
            }
            this.field886.method1498(0, var4);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
    public final int method318(byte arg0) {
        if (arg0 != -113) {
            this.field906 = null;
        }
        field876++;
        return this.field886.method1493(false) + this.field894.method1493(false);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Z")
    public final boolean method319(int arg0) {
        if (arg0 != 1) {
            this.field905 = -99;
        }
        if (this.field898 != null) {
            long var2 = class232.method1544((byte) -126);
            int var4 = (int) (var2 - this.field900);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field900 = var2;
            this.field899 += var4;
            if (this.field899 > 30000) {
                try {
                    this.field898.method1380(true);
                } catch (Exception var27) {
                }
                this.field898 = null;
            }
        }
        field880++;
        if (this.field898 == null) {
            return this.method318((byte) -113) == 0 && this.method314(arg0 + 37) == 0;
        }
        try {
            this.field898.method1385(30186);
            for (class268 var5 = (class268) this.field886.method1499(-16216); var5 != null; var5 = (class268) this.field886.method1495(112)) {
                this.field901.field1762 = 0;
                this.field901.method682(1, 22555);
                this.field901.method681((int) var5.field2267, -95);
                this.field898.method1382(this.field901.field1730, 4, 0, (byte) -82);
                this.field894.method1498(0, var5);
            }
            for (class268 var6 = (class268) this.field896.method1499(-16216); var6 != null; var6 = (class268) this.field896.method1495(arg0 ^ 0x30)) {
                this.field901.field1762 = 0;
                this.field901.method682(0, 22555);
                this.field901.method681((int) var6.field2267, arg0 ^ 0xFFFFFF9E);
                this.field898.method1382(this.field901.field1730, 4, 0, (byte) -83);
                this.field897.method1498(arg0 ^ 0x1, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field898.method1386(true);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field899 = 0;
                byte var9 = 0;
                if (this.field906 == null) {
                    var9 = 8;
                } else if (this.field906.field4335 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field906.field4332.field1730.length - this.field906.field4329;
                    int var11 = 512 - this.field906.field4335;
                    if (var11 > var10 - this.field906.field4332.field1762) {
                        var11 = var10 - this.field906.field4332.field1762;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field898.method1390(var11, this.field906.field4332.field1762, this.field906.field4332.field1730, true);
                    if (this.field905 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field906.field4332.field1730[this.field906.field4332.field1762 + var12] = (byte) class52.method329(this.field906.field4332.field1730[this.field906.field4332.field1762 + var12], this.field905);
                        }
                    }
                    this.field906.field4332.field1762 += var11;
                    this.field906.field4335 += var11;
                    if (this.field906.field4332.field1762 == var10) {
                        this.field906.method887((byte) -51);
                        this.field906.field2893 = false;
                        this.field906 = null;
                    } else if (this.field906.field4335 == 512) {
                        this.field906.field4335 = 0;
                    }
                } else {
                    int var13 = var9 - this.field903.field1762;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field898.method1390(var13, this.field903.field1762, this.field903.field1730, true);
                    if (this.field905 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field903.field1730[this.field903.field1762 + var14] = (byte) class52.method329(this.field903.field1730[this.field903.field1762 + var14], this.field905);
                        }
                    }
                    this.field903.field1762 += var13;
                    if (this.field903.field1762 >= var9) {
                        if (this.field906 == null) {
                            this.field903.field1762 = 0;
                            int var15 = this.field903.method669((byte) 36);
                            int var16 = this.field903.method677(false);
                            int var17 = this.field903.method669((byte) 36);
                            int var18 = var17 & 0x7F;
                            boolean var19 = (var17 & 0x80) != 0;
                            int var20 = this.field903.method655((byte) 99);
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class268 var24;
                            if (var19) {
                                for (var24 = (class268) this.field897.method1499(arg0 ^ 0xFFFFC0A9); var24 != null && var24.field2267 != var21; var24 = (class268) this.field897.method1495(arg0 ^ 0x4F)) {
                                }
                            } else {
                                for (var24 = (class268) this.field894.method1499(-16216); var24 != null && var24.field2267 != var21; var24 = (class268) this.field894.method1495(arg0 + 50)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var18 == 0 ? 5 : 9;
                            this.field906 = var24;
                            this.field906.field4332 = new class101(var20 + var25 + this.field906.field4329);
                            this.field906.field4332.method682(var18, 22555);
                            this.field906.field4332.method698(109, var20);
                            this.field903.field1762 = 0;
                            this.field906.field4335 = 8;
                        } else if (this.field906.field4335 != 0) {
                            throw new IOException();
                        } else if (this.field903.field1730[0] == -1) {
                            this.field903.field1762 = 0;
                            this.field906.field4335 = 1;
                        } else {
                            this.field906 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field898.method1380(true);
            } catch (Exception var26) {
            }
            this.field898 = null;
            this.field902++;
            this.field904 = -2;
            return this.method318((byte) -113) == 0 && this.method314(102) == 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        field895++;
        if (arg0 <= 77) {
            this.field900 = -111L;
        }
        return this.method318((byte) -113) >= 20;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILeh;I)Lme;")
    public static final class39 method321(int arg0, class101 arg1, int arg2) {
        field893++;
        class39 var3 = new class39(arg2, arg1.method662((byte) 1), arg1.method662((byte) 1), arg1.method655((byte) 108), arg1.method655((byte) 87), arg1.method669((byte) 36) == 1, arg1.method669((byte) 36));
        int var4 = arg1.method669((byte) 36);
        for (int var5 = arg0; var5 < var4; var5++) {
            var3.field575.method374(-1, new class73(arg1.method669((byte) 36), arg1.method669((byte) 36), arg1.method677(false), arg1.method677(false), arg1.method677(false), arg1.method677(false), arg1.method677(false), arg1.method677(false), arg1.method677(false), arg1.method677(false)));
        }
        var3.method267(12800);
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZBIBI)Ljc;")
    public final class268 method322(boolean arg0, byte arg1, int arg2, byte arg3, int arg4) {
        field887++;
        long var6 = (long) ((arg2 << 16) + arg4);
        class268 var8 = new class268();
        var8.field2267 = var6;
        var8.field4329 = arg3;
        var8.field2885 = arg0;
        if (arg0) {
            if (this.method318((byte) -113) >= 20) {
                throw new RuntimeException();
            }
            this.field886.method1498(arg1 ^ 0x17, var8);
        } else if (this.method314(28) < 20) {
            this.field896.method1498(0, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != 23) {
            this.field902 = -126;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    private final void method323(int arg0) {
        field877++;
        if (this.field898 == null) {
            return;
        }
        try {
            this.field901.field1762 = 0;
            this.field901.method682(6, arg0 + 50830);
            this.field901.method681(3, -88);
            this.field898.method1382(this.field901.field1730, 4, 0, (byte) -96);
            if (arg0 != -28275) {
                this.field902 = 12;
            }
        } catch (IOException var3) {
            try {
                this.field898.method1380(true);
            } catch (Exception var2) {
            }
            this.field904 = -2;
            this.field902++;
            this.field898 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public final void method324(byte arg0) {
        field884++;
        if (this.field898 != null) {
            this.field898.method1383((byte) -42);
        }
        if (arg0 > -112) {
            this.field894 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    public static void method325(int arg0) {
        field882 = null;
        field881 = null;
        if (arg0 == 0) {
            field891 = null;
        }
    }
}
