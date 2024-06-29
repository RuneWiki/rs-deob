import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class50 {

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Ltr;")
    private class173 field768 = new class173();

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Ltr;")
    private class173 field775 = new class173();

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Ltr;")
    private class173 field778 = new class173();

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Ltr;")
    private class173 field779 = new class173();

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "Lfb;")
    private class341 field781 = new class341(4);

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public volatile int field784 = 0;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "B")
    private byte field787 = 0;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public volatile int field786 = 0;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "Lfb;")
    private class341 field785 = new class341(8);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[I")
    public static int[] field766 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "[[I")
    public static int[][] field772 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "J")
    private long field780;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "Las;")
    private class359 field783;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "Lqn;")
    private class66 field788;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "[[I")
    public static int[][] field777;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[[[B")
    public static byte[][][] field760;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method350(int arg0) {
        if (arg0 != 20) {
            field777 = null;
        }
        field758++;
        return this.method355(false) >= 20;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)I", line = 15)
    public final int method351(int arg0) {
        if (arg0 != 0) {
            method364((byte[]) null, -119);
        }
        field773++;
        return this.field768.method1150((byte) -108) + this.field775.method1150((byte) -119);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIZIB)Lqn;", line = 27)
    public final class66 method352(byte arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field764++;
        long var6 = (long) ((arg3 << 16) + arg1);
        class66 var8 = new class66();
        var8.field974 = arg0;
        var8.field6404 = var6;
        if (arg4 != 35) {
            return null;
        }
        var8.field5226 = arg2;
        if (arg2) {
            if (this.method351(0) >= 20) {
                throw new RuntimeException();
            }
            this.field768.method1154(var8, 0);
        } else if (this.method355(false) < 20) {
            this.field778.method1154(var8, 0);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method353(byte arg0) {
        field771++;
        int var2 = -63 % ((arg0 + 36) / 60);
        return this.method351(0) >= 20;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 82)
    public final void method354(byte arg0) {
        field767++;
        if (this.field783 == null) {
            return;
        }
        try {
            this.field781.field5049 = 0;
            this.field781.method2204(7, 8);
            this.field781.method2234(117, 0);
            if (arg0 > 125) {
                this.field783.method2365(this.field781.field5042, 4, 5000, 0);
            }
        } catch (IOException var3) {
            try {
                this.field783.method2360((byte) -89);
            } catch (Exception var2) {
            }
            this.field783 = null;
            this.field784++;
            this.field786 = -2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I", line = 111)
    private final int method355(boolean arg0) {
        field762++;
        return arg0 ? 93 : this.field778.method1150((byte) -15) + this.field779.method1150((byte) -114);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V", line = 123)
    public final void method356(boolean arg0) {
        if (!arg0) {
            this.method356(false);
        }
        field763++;
        if (this.field783 != null) {
            this.field783.method2360((byte) 77);
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Z", line = 140)
    public final boolean method357(int arg0) {
        field761++;
        if (this.field783 != null) {
            long var2 = class98.method768((byte) -89);
            int var4 = (int) (var2 - this.field780);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field780 = var2;
            this.field782 += var4;
            if (this.field782 > 30000) {
                try {
                    this.field783.method2360((byte) 122);
                } catch (Exception var27) {
                }
                this.field783 = null;
            }
        }
        if (this.field783 == null) {
            return this.method351(0) == 0 && this.method355(false) == 0;
        }
        try {
            this.field783.method2367(-118);
            if (arg0 != -27458) {
                this.field787 = 49;
            }
            for (class66 var5 = (class66) this.field768.method1157(112); var5 != null; var5 = (class66) this.field768.method1151((byte) 72)) {
                this.field781.field5049 = 0;
                this.field781.method2204(1, 8);
                this.field781.method2234(arg0 ^ 0xFFFF94CB, (int) var5.field6404);
                this.field783.method2365(this.field781.field5042, 4, 5000, 0);
                this.field775.method1154(var5, 0);
            }
            for (class66 var6 = (class66) this.field778.method1157(100); var6 != null; var6 = (class66) this.field778.method1151((byte) 72)) {
                this.field781.field5049 = 0;
                this.field781.method2204(0, 8);
                this.field781.method2234(25, (int) var6.field6404);
                this.field783.method2365(this.field781.field5042, 4, arg0 ^ 0xFFFF8736, 0);
                this.field779.method1154(var6, arg0 ^ 0xFFFF94BE);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field783.method2359(true);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field782 = 0;
                byte var9 = 0;
                if (this.field788 == null) {
                    var9 = 8;
                } else if (this.field788.field978 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field788.field972.field5042.length - this.field788.field974;
                    int var11 = 512 - this.field788.field978;
                    if (var10 - this.field788.field972.field5049 < var11) {
                        var11 = var10 - this.field788.field972.field5049;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field783.method2366(this.field788.field972.field5042, 0, this.field788.field972.field5049, var11);
                    if (this.field787 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field788.field972.field5042[this.field788.field972.field5049 + var12] = (byte) class294.method1993(this.field788.field972.field5042[this.field788.field972.field5049 + var12], this.field787);
                        }
                    }
                    this.field788.field972.field5049 += var11;
                    this.field788.field978 += var11;
                    if (this.field788.field972.field5049 == var10) {
                        this.field788.method2764((byte) 119);
                        this.field788.field5227 = false;
                        this.field788 = null;
                    } else if (this.field788.field978 == 512) {
                        this.field788.field978 = 0;
                    }
                } else {
                    int var13 = var9 - this.field785.field5049;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field783.method2366(this.field785.field5042, 0, this.field785.field5049, var13);
                    if (this.field787 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field785.field5042[this.field785.field5049 + var14] = (byte) class294.method1993(this.field785.field5042[this.field785.field5049 + var14], this.field787);
                        }
                    }
                    this.field785.field5049 += var13;
                    if (var9 <= this.field785.field5049) {
                        if (this.field788 == null) {
                            this.field785.field5049 = 0;
                            int var15 = this.field785.method2233((byte) 104);
                            int var16 = this.field785.method2239(arg0 ^ 0x40258436);
                            int var17 = this.field785.method2233((byte) 104);
                            int var18 = this.field785.method2232(arg0 ^ 0x6B13);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class66 var24;
                            if (var20) {
                                for (var24 = (class66) this.field779.method1157(67); var24 != null && var24.field6404 != var21; var24 = (class66) this.field779.method1151((byte) 72)) {
                                }
                            } else {
                                for (var24 = (class66) this.field775.method1157(26); var24 != null && var24.field6404 != var21; var24 = (class66) this.field775.method1151((byte) 72)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field788 = var24;
                            this.field788.field972 = new class341(var18 + var25 + this.field788.field974);
                            this.field788.field972.method2204(var19, 8);
                            this.field788.field972.method2240((byte) -88, var18);
                            this.field788.field978 = 8;
                            this.field785.field5049 = 0;
                        } else if (this.field788.field978 != 0) {
                            throw new IOException();
                        } else if (this.field785.field5042[0] == -1) {
                            this.field788.field978 = 1;
                            this.field785.field5049 = 0;
                        } else {
                            this.field788 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field783.method2360((byte) -48);
            } catch (Exception var26) {
            }
            this.field786 = -2;
            this.field784++;
            this.field783 = null;
            return this.method351(0) == 0 && this.method355(false) == 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V", line = 419)
    public final void method358(int arg0) {
        try {
            this.field783.method2360((byte) 89);
        } catch (Exception var2) {
        }
        field776++;
        this.field784++;
        this.field786 = -1;
        this.field787 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
        this.field783 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V", line = 443)
    public final void method359(boolean arg0, int arg1) {
        field774++;
        if (this.field783 == null) {
            return;
        }
        try {
            this.field781.field5049 = arg1;
            this.field781.method2204(arg0 ? 2 : 3, 8);
            this.field781.method2234(57, 0);
            this.field783.method2365(this.field781.field5042, 4, 5000, 0);
        } catch (IOException var4) {
            try {
                this.field783.method2360((byte) 96);
            } catch (Exception var3) {
            }
            this.field783 = null;
            this.field786 = -2;
            this.field784++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 470)
    public static void method360(byte arg0) {
        field777 = null;
        field760 = null;
        field772 = null;
        field766 = null;
        if (arg0 > -32) {
            method360((byte) -64);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLas;Z)V", line = 483)
    public final void method361(boolean arg0, class359 arg1, boolean arg2) {
        if (this.field783 != null) {
            try {
                this.field783.method2360((byte) 116);
            } catch (Exception var8) {
            }
            this.field783 = null;
        }
        field770++;
        this.field783 = arg1;
        this.method363((byte) -100);
        if (!arg0) {
            this.method350(25);
        }
        this.method359(arg2, 0);
        this.field788 = null;
        this.field785.field5049 = 0;
        while (true) {
            class66 var4 = (class66) this.field775.method1149(0);
            if (var4 == null) {
                while (true) {
                    class66 var5 = (class66) this.field779.method1149(0);
                    if (var5 == null) {
                        if (this.field787 != 0) {
                            try {
                                this.field781.field5049 = 0;
                                this.field781.method2204(4, 8);
                                this.field781.method2204(this.field787, 8);
                                this.field781.method2250(false, 0);
                                this.field783.method2365(this.field781.field5042, 4, 5000, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field783.method2360((byte) -53);
                                } catch (Exception var6) {
                                }
                                this.field783 = null;
                                this.field786 = -2;
                                this.field784++;
                            }
                        }
                        this.field782 = 0;
                        this.field780 = class98.method768((byte) -111);
                        return;
                    }
                    this.field778.method1154(var5, 0);
                }
            }
            this.field768.method1154(var4, 0);
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V", line = 553)
    public final void method362(byte arg0) {
        field759++;
        int var2 = -46 / ((17 - arg0) / 40);
        if (this.field783 != null) {
            this.field783.method2363(-974);
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V", line = 566)
    private final void method363(byte arg0) {
        int var2 = 121 / ((-arg0 - 34) / 38);
        field765++;
        if (this.field783 == null) {
            return;
        }
        try {
            this.field781.field5049 = 0;
            this.field781.method2204(6, 8);
            this.field781.method2234(109, 3);
            this.field783.method2365(this.field781.field5042, 4, 5000, 0);
        } catch (IOException var4) {
            try {
                this.field783.method2360((byte) -114);
            } catch (Exception var3) {
            }
            this.field784++;
            this.field783 = null;
            this.field786 = -2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([BI)Z", line = 616)
    public static final boolean method364(byte[] arg0, int arg1) {
        field769++;
        class341 var2 = new class341(arg0);
        int var3 = var2.method2233((byte) 104);
        if (~var3 != arg1) {
            return false;
        }
        boolean var4 = var2.method2233((byte) 104) == 1;
        if (var4) {
            class48.method341(var2, -9581);
        }
        class107.method810(var2, (byte) -41);
        return true;
    }
}
