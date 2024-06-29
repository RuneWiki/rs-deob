import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public abstract class class43 {

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "Z")
    public boolean field540;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "Z")
    private boolean field526;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "[[B")
    public static byte[][] field532 = new byte[1000][];

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Z")
    public static volatile boolean field537 = false;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "Lua;")
    public static class41 field536 = class16.method86("Holiday Event", true);

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "Ln;")
    public static class26 field533;

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "Loa;")
    private class29 field530;

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "Lp;")
    public static class30 field538;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "[I")
    private int[] field519;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "[I")
    private int[] field521;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "[I")
    public int[] field524;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "[I")
    private int[] field525;

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "[I")
    private int[] field529;

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "[I")
    private int[] field539;

    @OriginalMember(owner = "mapview!w", name = "w", descriptor = "[I")
    public static int[] field541;

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "[Loa;")
    private class29[] field534;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field528;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "[[I")
    private int[][] field527;

    @OriginalMember(owner = "mapview!w", name = "x", descriptor = "[[I")
    private int[][] field542;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field535;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(BLua;Lua;)[B", line = 8)
    public final byte[] method251(byte arg0, class41 arg1, class41 arg2) {
        if (arg0 >= -100) {
            this.field525 = null;
        }
        class41 var4 = arg2.method237(-128);
        class41 var5 = arg1.method237(-125);
        int var6 = this.field530.method178(-95, var4.method243((byte) 113));
        if (this.method266((byte) -21, var6)) {
            int var7 = this.field534[var6].method178(-115, var5.method243((byte) 110));
            return this.method267(0, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II[Lua;I)Lua;", line = 34)
    public static final class41 method252(int arg0, int arg1, class41[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class34.field433;
            }
            var4 += arg2[arg1 + var5].field503;
        }
        int var6 = arg3;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class41 var9 = arg2[arg1 + var8];
            class33.method195(var9.field509, 0, var7, var6, var9.field503);
            var6 += var9.field503;
        }
        class41 var10 = new class41();
        var10.field509 = var7;
        var10.field503 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IB)V", line = 79)
    private final void method253(int arg0, byte arg1) {
        if (arg1 != -31) {
            method263(null, (byte) 82);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)B", line = 88)
    public static final byte method254(boolean arg0) {
        if (!arg0) {
            method252(28, -42, null, -43);
        }
        return class35.field440 == null ? 0 : class35.field440[class42.field514];
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpa;", line = 103)
    public static final class31 method255(Throwable arg0, String arg1) {
        class31 var2;
        if (arg0 instanceof class31) {
            var2 = (class31) arg0;
            var2.field410 = var2.field410 + ' ' + arg1;
        } else {
            var2 = new class31(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lua;I)I", line = 120)
    public final int method256(class41 arg0, int arg1) {
        class41 var3 = arg0.method237(104);
        int var4 = this.field530.method178(-126, var3.method243((byte) 110));
        if (arg1 > -22) {
            this.method251((byte) -106, null, null);
        }
        return this.method266((byte) -21, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([IIB)Z", line = 149)
    private final boolean method257(int[] arg0, int arg1, byte arg2) {
        if (!this.method266((byte) -21, arg1)) {
            return false;
        } else if (this.field528[arg1] == null) {
            return false;
        } else {
            int var4 = this.field525[arg1];
            if (arg2 != -81) {
                this.field520 = -110;
            }
            boolean var5 = true;
            int[] var6 = this.field527[arg1];
            if (this.field535[arg1] == null) {
                this.field535[arg1] = new Object[this.field519[arg1]];
            }
            Object[] var7 = this.field535[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var6 == null) {
                    var9 = var8;
                } else {
                    var9 = var6[var8];
                }
                if (var7[var9] == null) {
                    var5 = false;
                    break;
                }
            }
            if (var5) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = mapview.method166(false, this.field528[arg1], false);
            } else {
                var10 = mapview.method166(false, this.field528[arg1], true);
                class19 var11 = new class19(var10);
                var11.method102(32, 5, arg0, var11.field157.length);
            }
            byte[] var12;
            try {
                var12 = class23.method126(arg2 + 79, var10);
            } catch (RuntimeException var31) {
                throw method255(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class13.method75(var10, (byte) 13, var10.length) + "," + class13.method75(var10, (byte) 13, var10.length - 2) + "," + this.field529[arg1] + "," + this.field520);
            }
            if (this.field540) {
                this.field528[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var6 == null) {
                    var14 = 0;
                } else {
                    var14 = var6[0];
                }
                if (this.field526) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class41.method236(false, var12, (byte) 63);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class19 var17 = new class19(var12);
                int[] var18 = new int[var4];
                int var19 = var32 - var4 * var16 * 4;
                var17.field158 = var19;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        if (var6 != null) {
                        }
                        var21 += var17.method105(-106);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var17.field158 = var19;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method105(122);
                        class33.method195(var12, var25, var23[var28], var18[var28], var27);
                        var25 += var27;
                        var18[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field526) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class41.method236(false, var23[var29], (byte) 67);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(III)Z", line = 345)
    private final boolean method258(int arg0, int arg1, int arg2) {
        if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field519.length && this.field519[arg1] > arg2) {
            if (arg0 != 23631) {
                field532 = null;
            }
            return true;
        } else if (class41.field508) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IB[II)[B", line = 365)
    private final byte[] method259(int arg0, byte arg1, int[] arg2, int arg3) {
        if (!this.method258(23631, arg3, arg0)) {
            return null;
        }
        if (arg1 != 92) {
            this.method257(null, 16, (byte) -124);
        }
        if (this.field535[arg3] == null || this.field535[arg3][arg0] == null) {
            boolean var5 = this.method257(arg2, arg3, (byte) -81);
            if (!var5) {
                this.method253(arg3, (byte) -31);
                boolean var6 = this.method257(arg2, arg3, (byte) -81);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = mapview.method166(false, this.field535[arg3][arg0], false);
        if (this.field526) {
            this.field535[arg3][arg0] = null;
            if (this.field519[arg3] == 1) {
                this.field535[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([BI)V", line = 405)
    public final void method260(byte[] arg0, int arg1) {
        this.field520 = class13.method75(arg0, (byte) 13, arg0.length);
        class19 var3 = new class19(class23.method126(arg1 ^ 0xFFFFFFF8, arg0));
        int var4 = var3.method100(-83);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (arg1 <= var4) {
            var3.method105(110);
        }
        int var5 = var3.method100(-94);
        int var6 = 0;
        this.field523 = var3.method99(255);
        this.field524 = new int[this.field523];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field523; var8++) {
            this.field524[var8] = var6 += var3.method99(255);
            if (var7 < this.field524[var8]) {
                var7 = this.field524[var8];
            }
        }
        this.field527 = new int[var7 + 1][];
        this.field535 = new Object[var7 + 1][];
        this.field519 = new int[var7 + 1];
        this.field529 = new int[var7 + 1];
        this.field521 = new int[var7 + 1];
        this.field525 = new int[var7 + 1];
        this.field528 = new Object[var7 + 1];
        if (var5 != 0) {
            this.field539 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field539[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field523; var10++) {
                this.field539[this.field524[var10]] = var3.method105(96);
            }
            this.field530 = new class29(this.field539);
        }
        for (int var11 = 0; var11 < this.field523; var11++) {
            this.field529[this.field524[var11]] = var3.method105(73);
        }
        for (int var12 = 0; var12 < this.field523; var12++) {
            this.field521[this.field524[var12]] = var3.method105(class37.method206(arg1, -104));
        }
        for (int var13 = 0; var13 < this.field523; var13++) {
            this.field525[this.field524[var13]] = var3.method99(255);
        }
        for (int var14 = 0; var14 < this.field523; var14++) {
            int var15 = 0;
            int var16 = this.field524[var14];
            int var17 = -1;
            int var18 = this.field525[var16];
            this.field527[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field527[var16][var19] = var15 += var3.method99(255);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field519[var16] = var17 + 1;
            if (var17 + 1 == var18) {
                this.field527[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field542 = new int[var7 + 1][];
        this.field534 = new class29[var7 + 1];
        for (int var21 = 0; var21 < this.field523; var21++) {
            int var22 = this.field524[var21];
            int var23 = this.field525[var22];
            this.field542[var22] = new int[this.field519[var22]];
            for (int var24 = 0; var24 < this.field519[var22]; var24++) {
                this.field542[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field527[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field527[var22][var25];
                }
                this.field542[var22][var26] = var3.method105(-68);
            }
            this.field534[var22] = new class29(this.field542[var22]);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 574)
    public static void method261(int arg0) {
        field536 = null;
        field541 = null;
        if (arg0 != 6) {
            method265(-66, 70);
        }
        field532 = null;
        field533 = null;
        field538 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lw;III)[Lj;", line = 593)
    public static final class18[] method262(class43 arg0, int arg1, int arg2, int arg3) {
        if (class25.method144(-121, arg1, arg3, arg0)) {
            int var4 = -104 % ((39 - arg2) / 60);
            return class42.method248(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 611)
    public static final void method263(Component arg0, byte arg1) {
        if (arg1 <= 53) {
            method255(null, null);
        }
        arg0.removeKeyListener(class17.field145);
        arg0.removeFocusListener(class17.field145);
        class3.field53 = -1;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lua;II)I", line = 626)
    public final int method264(class41 arg0, int arg1, int arg2) {
        if (!this.method266((byte) -21, arg2)) {
            return -1;
        }
        class41 var4 = arg0.method237(53);
        if (arg1 == 868) {
            int var5 = this.field534[arg2].method178(-104, var4.method243((byte) 115));
            return this.method258(23631, arg2, var5) ? var5 : -1;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)I", line = 647)
    public static final int method265(int arg0, int arg1) {
        if (arg0 >= 65 && arg0 <= 90 || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else if (arg1 == -1) {
            return arg0;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(BI)Z", line = 673)
    private final boolean method266(byte arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field519.length && this.field519[arg1] != 0) {
            if (arg0 != -21) {
                this.method257(null, -81, (byte) 101);
            }
            return true;
        } else if (class41.field508) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(III)[B", line = 711)
    public final byte[] method267(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field521 = null;
        }
        return this.method259(arg2, (byte) 92, null, arg1);
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "(ZZ)V", line = 728)
    public class43(boolean arg0, boolean arg1) {
        this.field540 = arg0;
        this.field526 = arg1;
    }
}
