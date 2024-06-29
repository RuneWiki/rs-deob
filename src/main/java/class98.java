import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class98 {

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
    public static int[] field1384 = new int[4];

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "F")
    public static float field1378;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 5)
    public final void method751(byte arg0) {
        field1385++;
        if (arg0 != 15) {
            field1384 = null;
        }
        this.field1382 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)I", line = 16)
    public final int method752(byte arg0) {
        if (arg0 < 3) {
            return 121;
        } else {
            field1383++;
            return this.field1382 & 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "([[[Lffa;I)V", line = 29)
    public static final void method753(class186[][][] arg0, int arg1) {
        field1380++;
        int var2 = 0;
        if (arg1 < 123) {
            method753(null, -127);
        }
        while (arg0.length > var2) {
            class186[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class186 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2844 instanceof class721) {
                            ((class721) var6.field2844).method316((byte) -66);
                        }
                        if (var6.field2835 instanceof class721) {
                            ((class721) var6.field2835).method316((byte) -66);
                        }
                        if (var6.field2832 instanceof class721) {
                            ((class721) var6.field2832).method316((byte) -66);
                        }
                        if (var6.field2834 instanceof class721) {
                            ((class721) var6.field2834).method316((byte) -66);
                        }
                        if (var6.field2841 instanceof class721) {
                            ((class721) var6.field2841).method316((byte) -66);
                        }
                        for (class754 var7 = var6.field2830; var7 != null; var7 = var7.field10537) {
                            class119 var8 = var7.field10542;
                            if (var8 instanceof class721) {
                                ((class721) var8).method316((byte) -66);
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)Z", line = 102)
    public final boolean method754(int arg0, int arg1, int arg2, int arg3) {
        field1387++;
        int var5 = this.field1381;
        if (this.field1382 == arg3 && this.field1381 == 0) {
            return false;
        }
        if (arg2 <= 7) {
            this.method752((byte) -20);
        }
        boolean var6;
        if (this.field1381 == 0) {
            if (this.field1382 < arg3 && this.field1382 + arg0 >= arg3 || this.field1382 > arg3 && (this.field1382 - arg0) <= arg3) {
                this.field1382 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field1381 > 0 && arg3 > this.field1382) {
            int var7 = this.field1381 * this.field1381 / (arg0 * 2);
            int var8 = this.field1382 + var7;
            if (var8 < arg3 && this.field1382 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1381 < 0 && arg3 < this.field1382) {
            int var9 = this.field1381 * this.field1381 / (arg0 * 2);
            int var10 = this.field1382 - var9;
            if (var10 > arg3 && this.field1382 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field1382 < arg3) {
                this.field1381 += arg0;
                if (arg1 != 0 && this.field1381 > arg1) {
                    this.field1381 = arg1;
                }
            } else {
                this.field1381 -= arg0;
                if (arg1 != 0 && -arg1 > this.field1381) {
                    this.field1381 = -arg1;
                }
            }
            if (this.field1381 != var5) {
                int var11 = this.field1381 * this.field1381 / (arg0 * 2);
                if (arg3 > this.field1382) {
                    if (arg3 < this.field1382 + var11) {
                        this.field1381 = var5;
                    }
                } else if (this.field1382 > arg3 && this.field1382 - var11 < arg3) {
                    this.field1381 = var5;
                }
            }
        } else if (this.field1381 <= 0) {
            this.field1381 += arg0;
            if (this.field1381 > 0) {
                this.field1381 = 0;
            }
        } else {
            this.field1381 -= arg0;
            if (this.field1381 < 0) {
                this.field1381 = 0;
            }
        }
        this.field1382 += this.field1381 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V", line = 241)
    public static void method755(byte arg0) {
        field1384 = null;
        int var1 = 18 % ((arg0 - 73) / 37);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V", line = 256)
    public final void method756(byte arg0, int arg1) {
        field1386++;
        this.field1381 = 0;
        this.field1382 = arg1;
        if (arg0 != -107) {
            this.method752((byte) 122);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Ljava/lang/String;", line = 269)
    public static final String method757(int arg0, int arg1) {
        field1379++;
        if (arg0 >= -54) {
            field1384 = null;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }
}
