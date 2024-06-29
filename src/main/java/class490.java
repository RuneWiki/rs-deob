import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class490 extends class637 {

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    private int field6982 = 0;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Llb;")
    private class465 field6976 = new class465(16);

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    private int field6987 = 0;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Lbu;")
    private class19 field6991 = new class19();

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "J")
    private long field6992 = 0L;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Lcw;")
    private class157 field6986;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    private int field6975;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
    private boolean field6990;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lbu;")
    private class19 field6989;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lje;")
    private class341 field6963;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[B")
    private byte[] field6962;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field6981;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Z")
    private boolean field6993;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lcw;")
    private class157 field6966;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    private int field6965;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lhca;")
    private class418 field6960;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lsda;")
    private class217 field6974;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lvp;")
    public static class162 field6959 = null;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lada;")
    public static class144 field6979 = new class144(89, 2);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Luo;")
    private class494 field6968;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Z")
    private boolean field6988;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
    private byte[] field6967;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "[[B")
    public static byte[][] field6977;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 13)
    public final void method2929(boolean arg0) {
        field6971++;
        if (this.field6989 == null || this.method2939((byte) 22) == null) {
            return;
        }
        for (class417 var2 = this.field6991.method124((byte) 42); var2 != null; var2 = this.field6991.method120(25)) {
            int var3 = (int) var2.field5651;
            if (var3 < 0 || var3 >= this.field6968.field7025 || this.field6968.field7018[var3] == 0) {
                var2.method2457(-8422);
            } else {
                if (this.field6967[var3] == 0) {
                    this.method2932(var3, (byte) 91, 1);
                }
                if (this.field6967[var3] == -1) {
                    this.method2932(var3, (byte) 91, 2);
                }
                if (this.field6967[var3] == 1) {
                    var2.method2457(-8422);
                }
            }
        }
        if (!arg0) {
            this.method2933(true);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 61)
    public final void method2930(int arg0) {
        int var2 = 82 / ((-arg0 - 64) / 50);
        field6970++;
        if (this.field6989 != null) {
            if (this.method2939((byte) 18) == null) {
                return;
            }
            if (this.field6990) {
                boolean var7 = true;
                for (class417 var8 = this.field6989.method124((byte) 42); var8 != null; var8 = this.field6989.method120(32)) {
                    int var10 = (int) var8.field5651;
                    if (this.field6967[var10] == 0) {
                        this.method2932(var10, (byte) 91, 1);
                    }
                    if (this.field6967[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method2457(-8422);
                    }
                }
                while (this.field6987 < this.field6968.field7018.length) {
                    if (this.field6968.field7018[this.field6987] == 0) {
                        this.field6987++;
                    } else {
                        if (this.field6963.field4726 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field6967[this.field6987] == 0) {
                            this.method2932(this.field6987, (byte) 91, 1);
                        }
                        if (this.field6967[this.field6987] == 0) {
                            class417 var9 = new class417();
                            var9.field5651 = this.field6987;
                            var7 = false;
                            this.field6989.method131(var9, 0);
                        }
                        this.field6987++;
                    }
                }
                if (var7) {
                    this.field6990 = false;
                    this.field6987 = 0;
                }
            } else if (this.field6988) {
                boolean var3 = true;
                for (class417 var4 = this.field6989.method124((byte) 42); var4 != null; var4 = this.field6989.method120(22)) {
                    int var6 = (int) var4.field5651;
                    if (this.field6967[var6] != 1) {
                        this.method2932(var6, (byte) 91, 2);
                    }
                    if (this.field6967[var6] == 1) {
                        var4.method2457(-8422);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field6968.field7018.length > this.field6987) {
                    if (this.field6968.field7018[this.field6987] == 0) {
                        this.field6987++;
                    } else {
                        if (this.field6960.method2459(false)) {
                            var3 = false;
                            break;
                        }
                        if (this.field6967[this.field6987] != 1) {
                            this.method2932(this.field6987, (byte) 91, 2);
                        }
                        if (this.field6967[this.field6987] != 1) {
                            class417 var5 = new class417();
                            var5.field5651 = this.field6987;
                            var3 = false;
                            this.field6989.method131(var5, 0);
                        }
                        this.field6987++;
                    }
                }
                if (var3) {
                    this.field6987 = 0;
                    this.field6988 = false;
                }
            } else {
                this.field6989 = null;
            }
        }
        if (!this.field6993 || class598.method3538(true) < this.field6992) {
            return;
        }
        for (class217 var11 = (class217) this.field6976.method2798((byte) -92); var11 != null; var11 = (class217) this.field6976.method2806(true)) {
            if (!var11.field3178) {
                if (var11.field3177) {
                    if (!var11.field3179) {
                        throw new RuntimeException();
                    }
                    var11.method2457(-8422);
                } else {
                    var11.field3177 = true;
                }
            }
        }
        this.field6992 = class598.method3538(true) + 1000L;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I", line = 241)
    public final int method2931(byte arg0) {
        field6978++;
        if (this.field6968 == null) {
            return 0;
        } else if (!this.field6990) {
            return this.field6968.field7019;
        } else if (arg0 == -14) {
            class417 var2 = this.field6989.method124((byte) 42);
            return var2 == null ? 0 : (int) var2.field5651;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Lsda;", line = 269)
    private final class217 method2932(int arg0, byte arg1, int arg2) {
        if (arg1 != 91) {
            return null;
        }
        field6984++;
        class217 var4 = (class217) this.field6976.method2799((long) arg0, true);
        if (var4 != null && arg2 == 0 && !var4.field3179 && var4.field3178) {
            var4.method2457(-8422);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6986 == null || this.field6967[arg0] == -1) {
                    if (this.field6960.method2458(-118)) {
                        return null;
                    }
                    var4 = this.field6960.method2460(arg0, this.field6975, true, (byte) 2, -101);
                } else {
                    var4 = this.field6963.method2089(this.field6986, arg0, 1);
                }
            } else if (arg2 == 1) {
                if (this.field6986 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6963.method2093(arg0, this.field6986, (byte) 126);
            } else if (arg2 == 2) {
                if (this.field6986 == null) {
                    throw new RuntimeException();
                }
                if (this.field6967[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6960.method2459(false)) {
                    return null;
                }
                var4 = this.field6960.method2460(arg0, this.field6975, false, (byte) 2, -19);
            } else {
                throw new RuntimeException();
            }
            this.field6976.method2797(-4234, var4, (long) arg0);
        }
        if (var4.field3178) {
            return null;
        }
        byte[] var5 = var4.method207(192);
        if (!(var4 instanceof class523)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class350.field4783.reset();
                class350.field4783.update(var5, 0, var5.length - 2);
                int var6 = (int) class350.field4783.getValue();
                if (this.field6968.field7030[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field6968.field7027 != null && this.field6968.field7027[arg0] != null) {
                    byte[] var7 = this.field6968.field7027[arg0];
                    byte[] var8 = class45.method286(var5, arg1 - 18431, var5.length - 2, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field6960.field5677 = 0;
                this.field6960.field5680 = 0;
            } catch (RuntimeException var17) {
                this.field6960.method2465(true);
                var4.method2457(-8422);
                if (var4.field3179 && !this.field6960.method2458(76)) {
                    class32 var10 = this.field6960.method2460(arg0, this.field6975, true, (byte) 2, -106);
                    this.field6976.method2797(-4234, var10, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6968.field7029[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field6968.field7029[arg0];
            if (this.field6986 != null) {
                this.field6963.method2086(var5, this.field6986, (byte) -37, arg0);
                if (this.field6967[arg0] != 1) {
                    this.field6982++;
                    this.field6967[arg0] = 1;
                }
            }
            if (!var4.field3179) {
                var4.method2457(-8422);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class350.field4783.reset();
            class350.field4783.update(var5, 0, var5.length - 2);
            int var11 = (int) class350.field4783.getValue();
            if (this.field6968.field7030[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field6968.field7027 != null && this.field6968.field7027[arg0] != null) {
                byte[] var12 = this.field6968.field7027[arg0];
                byte[] var13 = class45.method286(var5, arg1 ^ 0xFFFFB807, var5.length - 2, 0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6968.field7029[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field6967[arg0] != 1) {
                this.field6982++;
                this.field6967[arg0] = 1;
            }
            if (!var4.field3179) {
                var4.method2457(arg1 ^ 0xFFFFDF41);
            }
            return var4;
        } catch (Exception var18) {
            this.field6967[arg0] = -1;
            var4.method2457(arg1 - 8513);
            if (var4.field3179 && !this.field6960.method2458(arg1 + 4)) {
                class32 var16 = this.field6960.method2460(arg0, this.field6975, true, (byte) 2, -49);
                this.field6976.method2797(-4234, var16, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 539)
    public final void method2933(boolean arg0) {
        field6969++;
        if (this.field6986 == null) {
            return;
        }
        this.field6988 = true;
        if (arg0) {
            this.field6991 = null;
        }
        if (this.field6989 == null) {
            this.field6989 = new class19();
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I", line = 561)
    public final int method2934(int arg0) {
        field6983++;
        if (this.method2939((byte) 98) == null) {
            return this.field6974 == null ? 0 : this.field6974.method209((byte) 40);
        } else {
            if (arg0 != -94) {
                this.method2932(113, (byte) 34, 91);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 581)
    public static void method2935(int arg0) {
        field6977 = null;
        field6959 = null;
        if (arg0 != 0) {
            method2935(-117);
        }
        field6979 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIBI)V", line = 593)
    public static final void method2936(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6985++;
        int var6 = arg2 - arg0;
        if (arg4 < 63) {
            field6959 = null;
        }
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class84.method636(arg1, arg5, (byte) 15, arg0, arg3);
            }
        } else if (var7 == 0) {
            class228.method1469(arg2, arg5, arg0, arg1, false);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class14.field136 > arg2) {
                var10 = (class14.field136 * var8 >> 12) + var9;
                var11 = class14.field136;
            } else if (class130.field1801 < arg2) {
                var10 = (class130.field1801 * var8 >> 12) + var9;
                var11 = class130.field1801;
            } else {
                var11 = arg2;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (arg0 < class14.field136) {
                var12 = class14.field136;
                var13 = (class14.field136 * var8 >> 12) + var9;
            } else if (arg0 > class130.field1801) {
                var12 = class130.field1801;
                var13 = var9 + (class130.field1801 * var8 >> 12);
            } else {
                var12 = arg0;
                var13 = arg1;
            }
            if (var13 < class3.field25) {
                var13 = class3.field25;
                var12 = (class3.field25 - var9 << 12) / var8;
            } else if (var13 > class100.field1452) {
                var12 = (class100.field1452 - var9 << 12) / var8;
                var13 = class100.field1452;
            }
            if (class3.field25 > var10) {
                var11 = (class3.field25 - var9 << 12) / var8;
                var10 = class3.field25;
            } else if (var10 > class100.field1452) {
                var11 = (class100.field1452 - var9 << 12) / var8;
                var10 = class100.field1452;
            }
            class627.method3666(-848573300, var13, var10, var12, arg5, var11);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[B", line = 695)
    public final byte[] method2937(int arg0, int arg1) {
        field6973++;
        class217 var3 = this.method2932(arg0, (byte) 91, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method207(arg1 + 193);
        var3.method2457(-8422);
        if (arg1 != -1) {
            this.method2942(-128);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V", line = 720)
    public final void method2938(int arg0, byte arg1) {
        field6964++;
        if (this.field6986 == null) {
            return;
        }
        for (class417 var3 = this.field6991.method124((byte) 42); var3 != null; var3 = this.field6991.method120(18)) {
            if (((long) arg0) == var3.field5651) {
                return;
            }
        }
        class417 var4 = new class417();
        if (arg1 != -18) {
            this.field6989 = null;
        }
        var4.field5651 = arg0;
        this.field6991.method131(var4, 0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Luo;", line = 748)
    public final class494 method2939(byte arg0) {
        field6958++;
        if (this.field6968 != null) {
            return this.field6968;
        }
        if (this.field6974 == null) {
            if (this.field6960.method2458(119)) {
                return null;
            }
            this.field6974 = this.field6960.method2460(this.field6975, 255, true, (byte) 0, -73);
        }
        if (this.field6974.field3178) {
            return null;
        }
        byte[] var2 = this.field6974.method207(192);
        int var3 = 67 / ((arg0 + 30) / 41);
        if (this.field6974 instanceof class523) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6968 = new class494(var2, this.field6965, this.field6962);
                if (this.field6968.field7016 != this.field6981) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field6968 = null;
                if (this.field6960.method2458(-102)) {
                    this.field6974 = null;
                } else {
                    this.field6974 = this.field6960.method2460(this.field6975, 255, true, (byte) 0, -30);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6968 = new class494(var2, this.field6965, this.field6962);
            } catch (RuntimeException var5) {
                this.field6960.method2465(true);
                this.field6968 = null;
                if (this.field6960.method2458(55)) {
                    this.field6974 = null;
                } else {
                    this.field6974 = this.field6960.method2460(this.field6975, 255, true, (byte) 0, -124);
                }
                return null;
            }
            if (this.field6966 != null) {
                this.field6963.method2086(var2, this.field6966, (byte) -37, this.field6975);
            }
        }
        this.field6974 = null;
        if (this.field6986 != null) {
            this.field6982 = 0;
            this.field6967 = new byte[this.field6968.field7025];
        }
        return this.field6968;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)I", line = 844)
    public final int method2940(int arg0) {
        field6972++;
        if (arg0 == -8719) {
            return this.field6968 == null ? 0 : this.field6968.field7019;
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I", line = 858)
    public final int method2941(int arg0, boolean arg1) {
        field6961++;
        if (arg1) {
            this.method2931((byte) -111);
        }
        class217 var3 = (class217) this.field6976.method2799((long) arg0, true);
        return var3 == null ? 0 : var3.method209((byte) 40);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I", line = 876)
    public final int method2942(int arg0) {
        if (arg0 != 9198) {
            this.field6974 = null;
        }
        field6980++;
        return this.field6982;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILcw;Lcw;Lhca;Lje;I[BIZ)V", line = 921)
    public class490(int arg0, class157 arg1, class157 arg2, class418 arg3, class341 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field6986 = arg1;
        this.field6975 = arg0;
        if (this.field6986 == null) {
            this.field6990 = false;
        } else {
            this.field6990 = true;
            this.field6989 = new class19();
        }
        this.field6963 = arg4;
        this.field6962 = arg6;
        this.field6981 = arg7;
        this.field6993 = arg8;
        this.field6966 = arg2;
        this.field6965 = arg5;
        this.field6960 = arg3;
        if (this.field6966 != null) {
            this.field6974 = this.field6963.method2089(this.field6966, this.field6975, 1);
        }
    }
}
