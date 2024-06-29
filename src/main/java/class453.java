import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class453 {

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "Llb;")
    private class465 field6398 = new class465(256);

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "Llb;")
    private class465 field6409 = new class465(256);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Lkda;")
    private class328 field6394;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Lkda;")
    private class328 field6407;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Lh;")
    public static class572 field6396 = new class572("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "Lhm;")
    public static class188 field6405 = new class188();

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field6397;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "([III)Lqk;", line = 4)
    public final class16 method2750(int[] arg0, int arg1, int arg2) {
        field6395++;
        if (arg1 < 96) {
            return null;
        } else if (this.field6407.method1974(-8588) == 1) {
            return this.method2751(-2, 0, arg2, arg0);
        } else if (this.field6407.method1975(104, arg2) == 1) {
            return this.method2751(-2, arg2, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III[I)Lqk;", line = 28)
    private final class16 method2751(int arg0, int arg1, int arg2, int[] arg3) {
        field6404++;
        int var5 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class16 var9 = (class16) this.field6409.method2799(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class475 var10 = (class475) this.field6398.method2799(var7, true);
            if (arg0 != -2) {
                method2755(28, -7);
            }
            if (var10 == null) {
                var10 = class475.method2866(this.field6407, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field6398.method2797(-4234, var10, var7);
            }
            class16 var11 = var10.method2857(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2457(-8422);
                this.field6409.method2797(-4234, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[IIB)Lqk;", line = 71)
    private final class16 method2752(int arg0, int[] arg1, int arg2, byte arg3) {
        field6401++;
        int var5 = arg0 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class16 var9 = (class16) this.field6409.method2799(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg3 != 39) {
                method2755(-54, -116);
            }
            class154 var10 = class154.method1120(this.field6394, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class16 var11 = var10.method1119();
            this.field6409.method2797(-4234, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field159.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lgba;BI)V", line = 112)
    public static final void method2753(class574 arg0, byte arg1, int arg2) {
        field6403++;
        boolean var3 = arg0.method3417(1, (byte) -86) == 1;
        if (var3) {
            class632.field9279[class580.field8538++] = arg2;
        }
        int var4 = arg0.method3417(2, (byte) -86);
        class373 var5 = class293.field4036[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field5122 = false;
            } else if (class183.field2758 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class115 var6 = class163.field2573[arg2] = new class115();
                var6.field1622 = (var5.field1955[0] + class38.field463 >> 6) + (var5.field1957[0] + class473.field6687 >> 6 << 14) + (var5.field8501 << 28);
                if (var5.field5120 == -1) {
                    var6.field1618 = var5.field1927.method1318(arg1 + 16295);
                } else {
                    var6.field1618 = var5.field5120;
                }
                var6.field1612 = var5.field5124;
                var6.field1616 = var5.field1923;
                if (var5.field5135 > 0) {
                    class359.method2171((byte) 110, var5);
                }
                class293.field4036[arg2] = null;
                if (arg0.method3417(1, (byte) -86) != 0) {
                    class102.method768(arg2, arg0, 3);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method3417(3, (byte) -86);
            int var8 = var5.field1957[0];
            int var9 = var5.field1955[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field5122 = true;
                var5.field5158 = var8;
                var5.field5153 = var9;
            } else {
                var5.method2230(var9, 116, var8, class432.field5787[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method3417(4, (byte) -86);
            int var11 = var5.field1957[0];
            int var12 = var5.field1955[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field5158 = var11;
                var5.field5153 = var12;
                var5.field5122 = true;
            } else {
                var5.method2230(var12, arg1 ^ 0x37, var11, class432.field5787[arg2]);
            }
        } else {
            int var13 = arg0.method3417(1, (byte) -86);
            if (var13 == 0) {
                int var14 = arg0.method3417(12, (byte) -86);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3ED) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1957[0] + var16;
                int var19 = var5.field1955[0] + var17;
                if (var3) {
                    var5.field5122 = true;
                    var5.field5158 = var18;
                    var5.field5153 = var19;
                } else {
                    var5.method2230(var19, 124, var18, class432.field5787[arg2]);
                }
                var5.field8501 = (byte) (var5.field8501 + var15 & 0x3);
                if (class183.field2758 == arg2) {
                    class89.field1339 = var5.field8501;
                }
            } else {
                int var20 = arg0.method3417(30, (byte) -86);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field1957[0] + class473.field6687 + var22 & 0x3FFF) - class473.field6687;
                int var25 = (var5.field1955[0] + class38.field463 + var23 & 0x3FFF) - class38.field463;
                if (var3) {
                    var5.field5153 = var25;
                    var5.field5158 = var24;
                    var5.field5122 = true;
                } else {
                    var5.method2230(var25, 73, var24, class432.field5787[arg2]);
                }
                var5.field8501 = (byte) (var5.field8501 + var21 & 0x3);
                if (arg1 == 88 && class183.field2758 == arg2) {
                    class89.field1339 = var5.field8501;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZIII)V", line = 429)
    public static final void method2754(boolean arg0, int arg1, int arg2, int arg3) {
        field6399++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class418.field5653 = arg1;
        class103.field1505 = arg0;
        int var4 = -128 / ((-arg2 - 60) / 46);
        class270.field3834 = arg3;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Z", line = 448)
    public static final boolean method2755(int arg0, int arg1) {
        field6402++;
        if (arg1 != 24152) {
            field6408 = 76;
        }
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V", line = 469)
    public static void method2756(byte arg0) {
        if (arg0 != -94) {
            method2756((byte) 86);
        }
        field6397 = null;
        field6396 = null;
        field6405 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(CBI)I", line = 485)
    public static final int method2757(char arg0, byte arg1, int arg2) {
        field6400++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg1 != -34) {
            method2753(null, (byte) -5, -5);
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lkda;Lkda;)V", line = 537)
    public class453(class328 arg0, class328 arg1) {
        this.field6394 = arg0;
        this.field6407 = arg1;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[II)Lqk;", line = 515)
    public final class16 method2758(int arg0, int[] arg1, int arg2) {
        field6406++;
        if (this.field6394.method1974(-8588) == 1) {
            return this.method2752(arg2, arg1, 0, (byte) 39);
        }
        int var4 = -60 / ((arg0 + 43) / 39);
        if (this.field6394.method1975(46, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method2752(0, arg1, arg2, (byte) 39);
    }
}
