import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class50 extends class166 {

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public int field965 = 0;

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "Z")
    private boolean field976 = false;

    @OriginalMember(owner = "client!ei", name = "tb", descriptor = "I")
    public int field987 = 0;

    @OriginalMember(owner = "client!ei", name = "Ob", descriptor = "B")
    public byte field1008 = 0;

    @OriginalMember(owner = "client!ei", name = "Cb", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!ei", name = "Jb", descriptor = "[I")
    public int[] field1003;

    @OriginalMember(owner = "client!ei", name = "qb", descriptor = "[I")
    public int[] field984;

    @OriginalMember(owner = "client!ei", name = "Db", descriptor = "[I")
    public int[] field997;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "[I")
    private int[] field969;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "[I")
    public int[] field967;

    @OriginalMember(owner = "client!ei", name = "yb", descriptor = "[I")
    public int[] field992;

    @OriginalMember(owner = "client!ei", name = "zb", descriptor = "[I")
    public int[] field993;

    @OriginalMember(owner = "client!ei", name = "rb", descriptor = "[B")
    public byte[] field985;

    @OriginalMember(owner = "client!ei", name = "Ib", descriptor = "[B")
    public byte[] field1002;

    @OriginalMember(owner = "client!ei", name = "ub", descriptor = "[B")
    public byte[] field988;

    @OriginalMember(owner = "client!ei", name = "Mb", descriptor = "[I")
    private int[] field1006;

    @OriginalMember(owner = "client!ei", name = "xb", descriptor = "[S")
    public short[] field991;

    @OriginalMember(owner = "client!ei", name = "wb", descriptor = "[B")
    public byte[] field990;

    @OriginalMember(owner = "client!ei", name = "vb", descriptor = "[S")
    public short[] field989;

    @OriginalMember(owner = "client!ei", name = "Eb", descriptor = "[B")
    public byte[] field998;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "[S")
    public short[] field975;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "[S")
    public short[] field974;

    @OriginalMember(owner = "client!ei", name = "Hb", descriptor = "[S")
    public short[] field1001;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "[S")
    private short[] field964;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "[S")
    private short[] field963;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "[S")
    private short[] field971;

    @OriginalMember(owner = "client!ei", name = "Bb", descriptor = "[B")
    private byte[] field995;

    @OriginalMember(owner = "client!ei", name = "Fb", descriptor = "[B")
    private byte[] field999;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "[B")
    private byte[] field968;

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "[B")
    private byte[] field977;

    @OriginalMember(owner = "client!ei", name = "mb", descriptor = "[B")
    private byte[] field980;

    @OriginalMember(owner = "client!ei", name = "kb", descriptor = "[[I")
    public int[][] field978;

    @OriginalMember(owner = "client!ei", name = "Ab", descriptor = "[[I")
    public int[][] field994;

    @OriginalMember(owner = "client!ei", name = "Gb", descriptor = "[Lcf;")
    public class27[] field1000;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "[Loc;")
    public class133[] field961;

    @OriginalMember(owner = "client!ei", name = "Kb", descriptor = "[Lcf;")
    public class27[] field1004;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "S")
    public short field966;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "S")
    public short field972;

    @OriginalMember(owner = "client!ei", name = "nb", descriptor = "[I")
    private static int[] field981 = class1.field21;

    @OriginalMember(owner = "client!ei", name = "lb", descriptor = "I")
    private static int field979 = 0;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "[I")
    private static int[] field970 = new int[10000];

    @OriginalMember(owner = "client!ei", name = "ob", descriptor = "[I")
    private static int[] field982 = class1.field8;

    @OriginalMember(owner = "client!ei", name = "Lb", descriptor = "[I")
    private static int[] field1005 = new int[10000];

    @OriginalMember(owner = "client!ei", name = "Nb", descriptor = "S")
    private short field1007;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "S")
    private short field962;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "S")
    private short field973;

    @OriginalMember(owner = "client!ei", name = "pb", descriptor = "S")
    private short field983;

    @OriginalMember(owner = "client!ei", name = "sb", descriptor = "S")
    private short field986;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public final void method301() {
        for (int var1 = 0; var1 < this.field965; ++var1) {
            int var2 = this.field997[var1];
            this.field997[var1] = this.field1003[var1];
            this.field1003[var1] = -var2;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
    public final void method302() {
        for (int var1 = 0; var1 < this.field965; ++var1) {
            int var2 = this.field1003[var1];
            this.field1003[var1] = this.field997[var1];
            this.field997[var1] = -var2;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
    public static void method303() {
        field1005 = null;
        field970 = null;
        field981 = null;
        field982 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
    public final void method304() {
        for (int var1 = 0; var1 < this.field987; ++var1) {
            int var2 = this.field967[var1];
            this.field967[var1] = this.field993[var1];
            this.field993[var1] = var2;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()V")
    public final void method305() {
        int var10002;
        if (this.field969 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field965; ++var3) {
                int var7 = this.field969[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field978 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field978[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field965) {
                int var6 = this.field969[var5];
                this.field978[var6][var1[var6]++] = var5++;
            }
            this.field969 = null;
        }
        if (this.field1006 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field987; ++var10) {
                int var14 = this.field1006[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field994 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field994[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field987) {
                int var13 = this.field1006[var12];
                this.field994[var13][var8[var13]++] = var12++;
            }
            this.field1006 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()Lei;")
    public final class50 method306() {
        class50 var1 = new class50();
        if (this.field985 != null) {
            var1.field985 = new byte[this.field987];
            for (int var2 = 0; var2 < this.field987; ++var2) {
                var1.field985[var2] = this.field985[var2];
            }
        }
        var1.field965 = this.field965;
        var1.field987 = this.field987;
        var1.field996 = this.field996;
        var1.field1003 = this.field1003;
        var1.field984 = this.field984;
        var1.field997 = this.field997;
        var1.field967 = this.field967;
        var1.field992 = this.field992;
        var1.field993 = this.field993;
        var1.field1002 = this.field1002;
        var1.field988 = this.field988;
        var1.field990 = this.field990;
        var1.field989 = this.field989;
        var1.field991 = this.field991;
        var1.field1008 = this.field1008;
        var1.field998 = this.field998;
        var1.field975 = this.field975;
        var1.field974 = this.field974;
        var1.field1001 = this.field1001;
        var1.field964 = this.field964;
        var1.field963 = this.field963;
        var1.field971 = this.field971;
        var1.field995 = this.field995;
        var1.field999 = this.field999;
        var1.field968 = this.field968;
        var1.field977 = this.field977;
        var1.field980 = this.field980;
        var1.field969 = this.field969;
        var1.field1006 = this.field1006;
        var1.field978 = this.field978;
        var1.field994 = this.field994;
        var1.field1000 = this.field1000;
        var1.field961 = this.field961;
        var1.field966 = this.field966;
        var1.field972 = this.field972;
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([B)V")
    private final void method307(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class52 var4 = new class52(arg0);
        class52 var5 = new class52(arg0);
        class52 var6 = new class52(arg0);
        class52 var7 = new class52(arg0);
        class52 var8 = new class52(arg0);
        var4.field1033 = arg0.length - 18;
        int var9 = var4.method390((byte) 93);
        int var10 = var4.method390((byte) 121);
        int var11 = var4.method344(255);
        int var12 = var4.method344(255);
        int var13 = var4.method344(255);
        int var14 = var4.method344(255);
        int var15 = var4.method344(255);
        int var16 = var4.method344(255);
        int var17 = var4.method390((byte) 98);
        int var18 = var4.method390((byte) 114);
        int var19 = var4.method390((byte) 103);
        int var20 = var4.method390((byte) 123);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field965 = var9;
        this.field987 = var10;
        this.field996 = var11;
        this.field1003 = new int[var9];
        this.field984 = new int[var9];
        this.field997 = new int[var9];
        this.field967 = new int[var10];
        this.field992 = new int[var10];
        this.field993 = new int[var10];
        if (var11 > 0) {
            this.field998 = new byte[var11];
            this.field975 = new short[var11];
            this.field974 = new short[var11];
            this.field1001 = new short[var11];
        }
        if (var16 == 1) {
            this.field969 = new int[var9];
        }
        if (var12 == 1) {
            this.field985 = new byte[var10];
            this.field990 = new byte[var10];
            this.field991 = new short[var10];
        }
        if (var13 == 255) {
            this.field1002 = new byte[var10];
        } else {
            this.field1008 = (byte) var13;
        }
        if (var14 == 1) {
            this.field988 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1006 = new int[var10];
        }
        this.field989 = new short[var10];
        var4.field1033 = var21;
        var5.field1033 = var36;
        var6.field1033 = var38;
        var7.field1033 = var40;
        var8.field1033 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method344(255);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method357(-129);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method357(-129);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method357(-129);
            }
            this.field1003[var46] = var43 + var63;
            this.field984[var46] = var44 + var64;
            this.field997[var46] = var45 + var65;
            var43 = this.field1003[var46];
            var44 = this.field984[var46];
            var45 = this.field997[var46];
            if (var16 == 1) {
                this.field969[var46] = var8.method344(255);
            }
        }
        var4.field1033 = var32;
        var5.field1033 = var28;
        var6.field1033 = var26;
        var7.field1033 = var30;
        var8.field1033 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field989[var47] = (short) var4.method390((byte) 97);
            if (var12 == 1) {
                int var61 = var5.method344(255);
                if ((var61 & 1) == 1) {
                    this.field985[var47] = 1;
                    var2 = true;
                } else {
                    this.field985[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field990[var47] = (byte) (var61 >> 2);
                    this.field991[var47] = this.field989[var47];
                    this.field989[var47] = 127;
                    if (this.field991[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field990[var47] = -1;
                    this.field991[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1002[var47] = var6.method353(-76);
            }
            if (var14 == 1) {
                this.field988[var47] = var7.method353(-95);
            }
            if (var15 == 1) {
                this.field1006[var47] = var8.method344(255);
            }
        }
        var4.field1033 = var25;
        var5.field1033 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method344(255);
            if (var57 == 1) {
                var48 = var4.method357(-129) + var51;
                var49 = var4.method357(-129) + var48;
                var50 = var4.method357(-129) + var49;
                var51 = var50;
                this.field967[var52] = var48;
                this.field992[var52] = var49;
                this.field993[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method357(-129) + var51;
                var51 = var50;
                this.field967[var52] = var48;
                this.field992[var52] = var49;
                this.field993[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method357(-129) + var51;
                var51 = var50;
                this.field967[var52] = var48;
                this.field992[var52] = var49;
                this.field993[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method357(-129) + var51;
                var51 = var50;
                this.field967[var52] = var48;
                this.field992[var52] = var60;
                this.field993[var52] = var50;
            }
        }
        var4.field1033 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field998[var53] = 0;
            this.field975[var53] = (short) var4.method390((byte) 112);
            this.field974[var53] = (short) var4.method390((byte) 118);
            this.field1001[var53] = (short) var4.method390((byte) 99);
        }
        if (this.field990 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field990[var55] & 255;
                if (var56 != 255) {
                    if ((this.field975[var56] & 65535) == this.field967[var55] && (this.field974[var56] & 65535) == this.field992[var55] && (this.field1001[var56] & 65535) == this.field993[var55]) {
                        this.field990[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field990 = null;
            }
        }
        if (!var3) {
            this.field991 = null;
        }
        if (!var2) {
            this.field985 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZZ)Lje;")
    public final class91 method308(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class30(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public final void method309(int arg0) {
        int var2 = field981[arg0];
        int var3 = field982[arg0];
        for (int var4 = 0; var4 < this.field965; ++var4) {
            int var5 = this.field997[var4] * var2 + this.field1003[var4] * var3 >> 16;
            this.field997[var4] = this.field997[var4] * var3 - this.field1003[var4] * var2 >> 16;
            this.field1003[var4] = var5;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "()V")
    private final void method310() {
        if (!this.field976) {
            this.field976 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field965; ++var7) {
                int var8 = this.field1003[var7];
                int var9 = this.field984[var7];
                int var10 = this.field997[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field962 = (short) var1;
            this.field1007 = (short) var4;
            super.field3376 = (short) var2;
            this.field986 = (short) var5;
            this.field973 = (short) var3;
            this.field983 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "()V")
    private final void method311() {
        this.field1000 = null;
        this.field1004 = null;
        this.field961 = null;
        this.field976 = false;
    }

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "()V")
    public final void method312() {
        for (int var1 = 0; var1 < this.field965; ++var1) {
            this.field1003[var1] = -this.field1003[var1];
            this.field997[var1] = -this.field997[var1];
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field965; ++var4) {
            this.field1003[var4] = this.field1003[var4] * arg0 / 128;
            this.field984[var4] = this.field984[var4] * arg1 / 128;
            this.field997[var4] = this.field997[var4] * arg2 / 128;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([B)V")
    private final void method314(byte[] arg0) {
        class52 var2 = new class52(arg0);
        class52 var3 = new class52(arg0);
        class52 var4 = new class52(arg0);
        class52 var5 = new class52(arg0);
        class52 var6 = new class52(arg0);
        class52 var7 = new class52(arg0);
        class52 var8 = new class52(arg0);
        var2.field1033 = arg0.length - 23;
        int var9 = var2.method390((byte) 91);
        int var10 = var2.method390((byte) 89);
        int var11 = var2.method344(255);
        int var12 = var2.method344(255);
        int var13 = var2.method344(255);
        int var14 = var2.method344(255);
        int var15 = var2.method344(255);
        int var16 = var2.method344(255);
        int var17 = var2.method344(255);
        int var18 = var2.method390((byte) 99);
        int var19 = var2.method390((byte) 106);
        int var20 = var2.method390((byte) 100);
        int var21 = var2.method390((byte) 94);
        int var22 = var2.method390((byte) 111);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field998 = new byte[var11];
            var2.field1033 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field998[var26] = var2.method353(104);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field965 = var9;
        this.field987 = var10;
        this.field996 = var11;
        this.field1003 = new int[var9];
        this.field984 = new int[var9];
        this.field997 = new int[var9];
        this.field967 = new int[var10];
        this.field992 = new int[var10];
        this.field993 = new int[var10];
        if (var17 == 1) {
            this.field969 = new int[var9];
        }
        if (var12 == 1) {
            this.field985 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1002 = new byte[var10];
        } else {
            this.field1008 = (byte) var13;
        }
        if (var14 == 1) {
            this.field988 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1006 = new int[var10];
        }
        if (var16 == 1) {
            this.field991 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field990 = new byte[var10];
        }
        this.field989 = new short[var10];
        if (var11 > 0) {
            this.field975 = new short[var11];
            this.field974 = new short[var11];
            this.field1001 = new short[var11];
            if (var24 > 0) {
                this.field964 = new short[var24];
                this.field963 = new short[var24];
                this.field971 = new short[var24];
                this.field995 = new byte[var24];
                this.field999 = new byte[var24];
                this.field968 = new byte[var24];
            }
            if (var25 > 0) {
                this.field977 = new byte[var25];
                this.field980 = new byte[var25];
            }
        }
        var2.field1033 = var11;
        var3.field1033 = var44;
        var4.field1033 = var46;
        var5.field1033 = var48;
        var6.field1033 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method344(255);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method357(-129);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method357(-129);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method357(-129);
            }
            this.field1003[var67] = var64 + var82;
            this.field984[var67] = var65 + var83;
            this.field997[var67] = var66 + var84;
            var64 = this.field1003[var67];
            var65 = this.field984[var67];
            var66 = this.field997[var67];
            if (var17 == 1) {
                this.field969[var67] = var6.method344(255);
            }
        }
        var2.field1033 = var42;
        var3.field1033 = var31;
        var4.field1033 = var34;
        var5.field1033 = var37;
        var6.field1033 = var35;
        var7.field1033 = var40;
        var8.field1033 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field989[var68] = (short) var2.method390((byte) 93);
            if (var12 == 1) {
                this.field985[var68] = var3.method353(-120);
            }
            if (var13 == 255) {
                this.field1002[var68] = var4.method353(-111);
            }
            if (var14 == 1) {
                this.field988[var68] = var5.method353(-105);
            }
            if (var15 == 1) {
                this.field1006[var68] = var6.method344(255);
            }
            if (var16 == 1) {
                this.field991[var68] = (short) (var7.method390((byte) 116) - 1);
            }
            if (this.field990 != null) {
                if (this.field991[var68] != -1) {
                    this.field990[var68] = (byte) (var8.method344(255) - 1);
                } else {
                    this.field990[var68] = -1;
                }
            }
        }
        var2.field1033 = var33;
        var3.field1033 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method344(255);
            if (var77 == 1) {
                var69 = var2.method357(-129) + var72;
                var70 = var2.method357(-129) + var69;
                var71 = var2.method357(-129) + var70;
                var72 = var71;
                this.field967[var73] = var69;
                this.field992[var73] = var70;
                this.field993[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method357(-129) + var72;
                var72 = var71;
                this.field967[var73] = var69;
                this.field992[var73] = var70;
                this.field993[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method357(-129) + var72;
                var72 = var71;
                this.field967[var73] = var69;
                this.field992[var73] = var70;
                this.field993[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method357(-129) + var72;
                var72 = var71;
                this.field967[var73] = var69;
                this.field992[var73] = var80;
                this.field993[var73] = var71;
            }
        }
        var2.field1033 = var50;
        var3.field1033 = var52;
        var4.field1033 = var54;
        var5.field1033 = var56;
        var6.field1033 = var58;
        var7.field1033 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field998[var74] & 255;
            if (var76 == 0) {
                this.field975[var74] = (short) var2.method390((byte) 122);
                this.field974[var74] = (short) var2.method390((byte) 118);
                this.field1001[var74] = (short) var2.method390((byte) 113);
            }
            if (var76 == 1) {
                this.field975[var74] = (short) var3.method390((byte) 123);
                this.field974[var74] = (short) var3.method390((byte) 127);
                this.field1001[var74] = (short) var3.method390((byte) 94);
                this.field964[var74] = (short) var4.method390((byte) 89);
                this.field963[var74] = (short) var4.method390((byte) 93);
                this.field971[var74] = (short) var4.method390((byte) 106);
                this.field995[var74] = var5.method353(113);
                this.field999[var74] = var6.method353(-87);
                this.field968[var74] = var7.method353(98);
            }
            if (var76 == 2) {
                this.field975[var74] = (short) var3.method390((byte) 121);
                this.field974[var74] = (short) var3.method390((byte) 97);
                this.field1001[var74] = (short) var3.method390((byte) 96);
                this.field964[var74] = (short) var4.method390((byte) 104);
                this.field963[var74] = (short) var4.method390((byte) 110);
                this.field971[var74] = (short) var4.method390((byte) 114);
                this.field995[var74] = var5.method353(-77);
                this.field999[var74] = var6.method353(-85);
                this.field968[var74] = var7.method353(117);
                this.field977[var74] = var7.method353(-111);
                this.field980[var74] = var7.method353(-1);
            }
            if (var76 == 3) {
                this.field975[var74] = (short) var3.method390((byte) 120);
                this.field974[var74] = (short) var3.method390((byte) 96);
                this.field1001[var74] = (short) var3.method390((byte) 118);
                this.field964[var74] = (short) var4.method390((byte) 115);
                this.field963[var74] = (short) var4.method390((byte) 122);
                this.field971[var74] = (short) var4.method390((byte) 114);
                this.field995[var74] = var5.method353(123);
                this.field999[var74] = var6.method353(-78);
                this.field968[var74] = var7.method353(-103);
            }
        }
        var2.field1033 = var62;
        int var75 = var2.method344(255);
        if (var75 != 0) {
            new class53();
            var2.method390((byte) 114);
            var2.method390((byte) 123);
            var2.method390((byte) 125);
            var2.method383(98);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lei;Lei;IIIZ)V")
    public static final void method315(class50 arg0, class50 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method310();
        arg0.method323();
        arg1.method310();
        arg1.method323();
        ++field979;
        int var6 = 0;
        int[] var7 = arg1.field1003;
        int var8 = arg1.field965;
        for (int var9 = 0; var9 < arg0.field965; ++var9) {
            class27 var12 = arg0.field1000[var9];
            if (var12.field497 != 0) {
                int var13 = arg0.field984[var9] - arg3;
                if (var13 >= arg1.field3376 && var13 <= arg1.field986) {
                    int var14 = arg0.field1003[var9] - arg2;
                    if (var14 >= arg1.field962 && var14 <= arg1.field1007) {
                        int var15 = arg0.field997[var9] - arg4;
                        if (var15 >= arg1.field973 && var15 <= arg1.field983) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class27 var17 = arg1.field1000[var16];
                                if (var7[var16] == var14 && arg1.field997[var16] == var15 && arg1.field984[var16] == var13 && var17.field497 != 0) {
                                    if (arg0.field1004 == null) {
                                        arg0.field1004 = new class27[arg0.field965];
                                    }
                                    if (arg1.field1004 == null) {
                                        arg1.field1004 = new class27[var8];
                                    }
                                    class27 var18 = arg0.field1004[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1004[var9] = new class27(var12);
                                    }
                                    class27 var19 = arg1.field1004[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1004[var16] = new class27(var17);
                                    }
                                    var18.field495 += var17.field495;
                                    var18.field492 += var17.field492;
                                    var18.field500 += var17.field500;
                                    var18.field497 += var17.field497;
                                    var19.field495 += var12.field495;
                                    var19.field492 += var12.field492;
                                    var19.field500 += var12.field500;
                                    var19.field497 += var12.field497;
                                    ++var6;
                                    field1005[var9] = field979;
                                    field970[var16] = field979;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field987; ++var10) {
                if (field1005[arg0.field967[var10]] == field979 && field1005[arg0.field992[var10]] == field979 && field1005[arg0.field993[var10]] == field979) {
                    if (arg0.field985 == null) {
                        arg0.field985 = new byte[arg0.field987];
                    }
                    arg0.field985[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field987; ++var11) {
                if (field970[arg1.field967[var11]] == field979 && field970[arg1.field992[var11]] == field979 && field970[arg1.field993[var11]] == field979) {
                    if (arg1.field985 == null) {
                        arg1.field985 = new byte[arg1.field987];
                    }
                    arg1.field985[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "()V")
    public final void method316() {
        for (int var1 = 0; var1 < this.field965; ++var1) {
            this.field997[var1] = -this.field997[var1];
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lu;II)Lei;")
    public static final class50 method317(class184 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1235(arg2, (byte) -64, arg1);
        return var3 == null ? null : new class50(var3);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([[IIIIZI)Lei;")
    public final class50 method318(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method310();
        int var7 = this.field962 + arg1;
        int var8 = this.field1007 + arg1;
        int var9 = this.field973 + arg3;
        int var10 = this.field983 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class50 var15;
                if (arg4) {
                    var15 = new class50();
                    var15.field965 = this.field965;
                    var15.field987 = this.field987;
                    var15.field996 = this.field996;
                    var15.field1003 = this.field1003;
                    var15.field997 = this.field997;
                    var15.field967 = this.field967;
                    var15.field992 = this.field992;
                    var15.field993 = this.field993;
                    var15.field985 = this.field985;
                    var15.field1002 = this.field1002;
                    var15.field988 = this.field988;
                    var15.field990 = this.field990;
                    var15.field989 = this.field989;
                    var15.field991 = this.field991;
                    var15.field1008 = this.field1008;
                    var15.field998 = this.field998;
                    var15.field975 = this.field975;
                    var15.field974 = this.field974;
                    var15.field1001 = this.field1001;
                    var15.field964 = this.field964;
                    var15.field963 = this.field963;
                    var15.field971 = this.field971;
                    var15.field995 = this.field995;
                    var15.field999 = this.field999;
                    var15.field968 = this.field968;
                    var15.field977 = this.field977;
                    var15.field980 = this.field980;
                    var15.field969 = this.field969;
                    var15.field1006 = this.field1006;
                    var15.field978 = this.field978;
                    var15.field994 = this.field994;
                    var15.field966 = this.field966;
                    var15.field972 = this.field972;
                    var15.field984 = new int[var15.field965];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field965; ++var16) {
                        int var17 = this.field1003[var16] + arg1;
                        int var18 = this.field997[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field984[var16] = this.field984[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field965; ++var26) {
                        int var27 = (this.field984[var26] << 16) / super.field3376;
                        if (var27 < arg5) {
                            int var28 = this.field1003[var26] + arg1;
                            int var29 = this.field997[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field984[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field984[var26];
                        } else {
                            var15.field984[var26] = this.field984[var26];
                        }
                    }
                }
                var15.method311();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(SS)V")
    public final void method319(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field987; ++var3) {
            if (this.field989[var3] == arg0) {
                this.field989[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(III)V")
    public final void method320(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field965; ++var4) {
            this.field1003[var4] += arg0;
            this.field984[var4] += arg1;
            this.field997[var4] += arg2;
        }
        this.method311();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lei;I)I")
    private final int method321(class50 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1003[arg1];
        int var5 = arg0.field984[arg1];
        int var6 = arg0.field997[arg1];
        for (int var7 = 0; var7 < this.field965; ++var7) {
            if (this.field1003[var7] == var4 && this.field984[var7] == var5 && this.field997[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1003[this.field965] = var4;
            this.field984[this.field965] = var5;
            this.field997[this.field965] = var6;
            if (arg0.field969 != null) {
                this.field969[this.field965] = arg0.field969[arg1];
            }
            var3 = this.field965++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(SS)V")
    public final void method322(short arg0, short arg1) {
        if (this.field991 != null) {
            for (int var3 = 0; var3 < this.field987; ++var3) {
                if (this.field991[var3] == arg0) {
                    this.field991[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "()V")
    public final void method323() {
        if (this.field1000 == null) {
            this.field1000 = new class27[this.field965];
            for (int var1 = 0; var1 < this.field965; ++var1) {
                this.field1000[var1] = new class27();
            }
            for (int var2 = 0; var2 < this.field987; ++var2) {
                int var3 = this.field967[var2];
                int var4 = this.field992[var2];
                int var5 = this.field993[var2];
                int var6 = this.field1003[var4] - this.field1003[var3];
                int var7 = this.field984[var4] - this.field984[var3];
                int var8 = this.field997[var4] - this.field997[var3];
                int var9 = this.field1003[var5] - this.field1003[var3];
                int var10 = this.field984[var5] - this.field984[var3];
                int var11 = this.field997[var5] - this.field997[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field985 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field985[var2];
                }
                if (var19 == 0) {
                    class27 var20 = this.field1000[var3];
                    var20.field495 += var16;
                    var20.field492 += var17;
                    var20.field500 += var18;
                    ++var20.field497;
                    class27 var21 = this.field1000[var4];
                    var21.field495 += var16;
                    var21.field492 += var17;
                    var21.field500 += var18;
                    ++var21.field497;
                    class27 var22 = this.field1000[var5];
                    var22.field495 += var16;
                    var22.field492 += var17;
                    var22.field500 += var18;
                    ++var22.field497;
                } else if (var19 == 1) {
                    if (this.field961 == null) {
                        this.field961 = new class133[this.field987];
                    }
                    class133 var23 = this.field961[var2] = new class133();
                    var23.field2761 = var16;
                    var23.field2758 = var17;
                    var23.field2765 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)Lci;")
    public final class30 method324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class30(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    private class50() {
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B)V")
    private class50(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method314(arg0);
        } else {
            this.method307(arg0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([Lei;I)V")
    public class50(class50[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field965 = 0;
        this.field987 = 0;
        this.field996 = 0;
        this.field1008 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class50 var15 = arg0[var9];
            if (var15 != null) {
                this.field965 += var15.field965;
                this.field987 += var15.field987;
                this.field996 += var15.field996;
                if (var15.field1002 != null) {
                    var4 = true;
                } else {
                    if (this.field1008 == -1) {
                        this.field1008 = var15.field1008;
                    }
                    if (this.field1008 != var15.field1008) {
                        var4 = true;
                    }
                }
                var3 |= var15.field985 != null;
                var5 |= var15.field988 != null;
                var6 |= var15.field1006 != null;
                var7 |= var15.field991 != null;
                var8 |= var15.field990 != null;
            }
        }
        this.field1003 = new int[this.field965];
        this.field984 = new int[this.field965];
        this.field997 = new int[this.field965];
        this.field969 = new int[this.field965];
        this.field967 = new int[this.field987];
        this.field992 = new int[this.field987];
        this.field993 = new int[this.field987];
        if (var3) {
            this.field985 = new byte[this.field987];
        }
        if (var4) {
            this.field1002 = new byte[this.field987];
        }
        if (var5) {
            this.field988 = new byte[this.field987];
        }
        if (var6) {
            this.field1006 = new int[this.field987];
        }
        if (var7) {
            this.field991 = new short[this.field987];
        }
        if (var8) {
            this.field990 = new byte[this.field987];
        }
        this.field989 = new short[this.field987];
        if (this.field996 > 0) {
            this.field998 = new byte[this.field996];
            this.field975 = new short[this.field996];
            this.field974 = new short[this.field996];
            this.field1001 = new short[this.field996];
            this.field964 = new short[this.field996];
            this.field963 = new short[this.field996];
            this.field971 = new short[this.field996];
            this.field995 = new byte[this.field996];
            this.field999 = new byte[this.field996];
            this.field968 = new byte[this.field996];
            this.field977 = new byte[this.field996];
            this.field980 = new byte[this.field996];
        }
        this.field965 = 0;
        this.field987 = 0;
        this.field996 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class50 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field987; ++var12) {
                    if (var3 && var11.field985 != null) {
                        this.field985[this.field987] = var11.field985[var12];
                    }
                    if (var4) {
                        if (var11.field1002 != null) {
                            this.field1002[this.field987] = var11.field1002[var12];
                        } else {
                            this.field1002[this.field987] = var11.field1008;
                        }
                    }
                    if (var5 && var11.field988 != null) {
                        this.field988[this.field987] = var11.field988[var12];
                    }
                    if (var6 && var11.field1006 != null) {
                        this.field1006[this.field987] = var11.field1006[var12];
                    }
                    if (var7) {
                        if (var11.field991 != null) {
                            this.field991[this.field987] = var11.field991[var12];
                        } else {
                            this.field991[this.field987] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field990 != null && var11.field990[var12] != -1) {
                            this.field990[this.field987] = (byte) (var11.field990[var12] + this.field996);
                        } else {
                            this.field990[this.field987] = -1;
                        }
                    }
                    this.field989[this.field987] = var11.field989[var12];
                    this.field967[this.field987] = this.method321(var11, var11.field967[var12]);
                    this.field992[this.field987] = this.method321(var11, var11.field992[var12]);
                    this.field993[this.field987] = this.method321(var11, var11.field993[var12]);
                    ++this.field987;
                }
                for (int var13 = 0; var13 < var11.field996; ++var13) {
                    byte var14 = this.field998[this.field996] = var11.field998[var13];
                    if (var14 == 0) {
                        this.field975[this.field996] = (short) this.method321(var11, var11.field975[var13]);
                        this.field974[this.field996] = (short) this.method321(var11, var11.field974[var13]);
                        this.field1001[this.field996] = (short) this.method321(var11, var11.field1001[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field975[this.field996] = var11.field975[var13];
                        this.field974[this.field996] = var11.field974[var13];
                        this.field1001[this.field996] = var11.field1001[var13];
                        this.field964[this.field996] = var11.field964[var13];
                        this.field963[this.field996] = var11.field963[var13];
                        this.field971[this.field996] = var11.field971[var13];
                        this.field995[this.field996] = var11.field995[var13];
                        this.field999[this.field996] = var11.field999[var13];
                        this.field968[this.field996] = var11.field968[var13];
                    }
                    if (var14 == 2) {
                        this.field977[this.field996] = var11.field977[var13];
                        this.field980[this.field996] = var11.field980[var13];
                    }
                    ++this.field996;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lei;ZZZZ)V")
    public class50(class50 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field965 = arg0.field965;
        this.field987 = arg0.field987;
        this.field996 = arg0.field996;
        if (arg1) {
            this.field1003 = arg0.field1003;
            this.field984 = arg0.field984;
            this.field997 = arg0.field997;
        } else {
            this.field1003 = new int[this.field965];
            this.field984 = new int[this.field965];
            this.field997 = new int[this.field965];
            for (int var6 = 0; var6 < this.field965; ++var6) {
                this.field1003[var6] = arg0.field1003[var6];
                this.field984[var6] = arg0.field984[var6];
                this.field997[var6] = arg0.field997[var6];
            }
        }
        if (arg2) {
            this.field989 = arg0.field989;
        } else {
            this.field989 = new short[this.field987];
            for (int var7 = 0; var7 < this.field987; ++var7) {
                this.field989[var7] = arg0.field989[var7];
            }
        }
        if (!arg3 && arg0.field991 != null) {
            this.field991 = new short[this.field987];
            for (int var8 = 0; var8 < this.field987; ++var8) {
                this.field991[var8] = arg0.field991[var8];
            }
        } else {
            this.field991 = arg0.field991;
        }
        if (arg4) {
            this.field988 = arg0.field988;
        } else {
            this.field988 = new byte[this.field987];
            if (arg0.field988 == null) {
                for (int var9 = 0; var9 < this.field987; ++var9) {
                    this.field988[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field987; ++var10) {
                    this.field988[var10] = arg0.field988[var10];
                }
            }
        }
        this.field967 = arg0.field967;
        this.field992 = arg0.field992;
        this.field993 = arg0.field993;
        this.field985 = arg0.field985;
        this.field1002 = arg0.field1002;
        this.field990 = arg0.field990;
        this.field1008 = arg0.field1008;
        this.field998 = arg0.field998;
        this.field975 = arg0.field975;
        this.field974 = arg0.field974;
        this.field1001 = arg0.field1001;
        this.field964 = arg0.field964;
        this.field963 = arg0.field963;
        this.field971 = arg0.field971;
        this.field995 = arg0.field995;
        this.field999 = arg0.field999;
        this.field968 = arg0.field968;
        this.field977 = arg0.field977;
        this.field980 = arg0.field980;
        this.field969 = arg0.field969;
        this.field1006 = arg0.field1006;
        this.field978 = arg0.field978;
        this.field994 = arg0.field994;
        this.field1000 = arg0.field1000;
        this.field961 = arg0.field961;
        this.field1004 = arg0.field1004;
        this.field966 = arg0.field966;
        this.field972 = arg0.field972;
    }
}
