import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DDJHHGTJ")
public class class6 {

    @OriginalMember(owner = "DDJHHGTJ", name = "a", descriptor = "I")
    public int field558 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "c", descriptor = "Z")
    public boolean field560 = true;

    @OriginalMember(owner = "DDJHHGTJ", name = "d", descriptor = "I")
    public int field561 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "h", descriptor = "I")
    public int field565 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "i", descriptor = "B")
    public byte field566 = 1;

    @OriginalMember(owner = "DDJHHGTJ", name = "j", descriptor = "I")
    private int field567 = -754;

    @OriginalMember(owner = "DDJHHGTJ", name = "k", descriptor = "I")
    public int field568 = 32;

    @OriginalMember(owner = "DDJHHGTJ", name = "o", descriptor = "I")
    private int field572 = 128;

    @OriginalMember(owner = "DDJHHGTJ", name = "p", descriptor = "I")
    private int field573 = 128;

    @OriginalMember(owner = "DDJHHGTJ", name = "s", descriptor = "I")
    public int field576 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "u", descriptor = "I")
    public int field578 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "v", descriptor = "Z")
    public boolean field579 = true;

    @OriginalMember(owner = "DDJHHGTJ", name = "w", descriptor = "I")
    public int field580 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "x", descriptor = "I")
    public int field581 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "y", descriptor = "I")
    public int field582 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "C", descriptor = "I")
    public int field586 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "E", descriptor = "I")
    public int field588 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "F", descriptor = "Z")
    public boolean field589 = false;

    @OriginalMember(owner = "DDJHHGTJ", name = "G", descriptor = "I")
    public int field590 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "I", descriptor = "J")
    public long field592 = -1L;

    @OriginalMember(owner = "DDJHHGTJ", name = "M", descriptor = "I")
    public int field596 = -1;

    @OriginalMember(owner = "DDJHHGTJ", name = "N", descriptor = "I")
    private int field597 = 690;

    @OriginalMember(owner = "DDJHHGTJ", name = "m", descriptor = "LVNWSQIXW;")
    public static class54 field570 = new class54(30, (byte) 8);

    @OriginalMember(owner = "DDJHHGTJ", name = "e", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "DDJHHGTJ", name = "q", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "DDJHHGTJ", name = "r", descriptor = "I")
    private static int field575;

    @OriginalMember(owner = "DDJHHGTJ", name = "D", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "DDJHHGTJ", name = "J", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "DDJHHGTJ", name = "g", descriptor = "LGHHPHSRU;")
    private static class14 field564;

    @OriginalMember(owner = "DDJHHGTJ", name = "L", descriptor = "Lclient;")
    public static client field595;

    @OriginalMember(owner = "DDJHHGTJ", name = "H", descriptor = "Ljava/lang/String;")
    public String field591;

    @OriginalMember(owner = "DDJHHGTJ", name = "l", descriptor = "[B")
    public byte[] field569;

    @OriginalMember(owner = "DDJHHGTJ", name = "n", descriptor = "[I")
    private static int[] field571;

    @OriginalMember(owner = "DDJHHGTJ", name = "t", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "DDJHHGTJ", name = "z", descriptor = "[I")
    public int[] field583;

    @OriginalMember(owner = "DDJHHGTJ", name = "A", descriptor = "[I")
    private int[] field584;

    @OriginalMember(owner = "DDJHHGTJ", name = "B", descriptor = "[I")
    private int[] field585;

    @OriginalMember(owner = "DDJHHGTJ", name = "K", descriptor = "[I")
    private int[] field594;

    @OriginalMember(owner = "DDJHHGTJ", name = "f", descriptor = "[LDDJHHGTJ;")
    private static class6[] field563;

    @OriginalMember(owner = "DDJHHGTJ", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field559;

    @OriginalMember(owner = "DDJHHGTJ", name = "a", descriptor = "([IIII)LOQIGXOFQ;")
    public final class35 method158(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field583 != null) {
            class6 var5 = this.method164(46311);
            return var5 == null ? null : var5.method158(arg0, 7, arg2, arg3);
        }
        class35 var6 = (class35) field570.method507(this.field592);
        if (arg1 != 7) {
            this.field567 = 297;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field594.length; var8++) {
                if (!class35.method392(this.field594[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class35[] var9 = new class35[this.field594.length];
            for (int var10 = 0; var10 < this.field594.length; var10++) {
                var9[var10] = class35.method391(this.field594[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class35(var9.length, -537, var9);
            }
            if (this.field584 != null) {
                for (int var11 = 0; var11 < this.field584.length; var11++) {
                    var6.method405(this.field584[var11], this.field585[var11]);
                }
            }
            var6.method398(0);
            var6.method408(this.field587 + 64, this.field562 + 850, -30, -50, -30, true);
            field570.method508(7, this.field592, var6);
        }
        class35 var12 = class35.field1201;
        var12.method393(var6, class68.method582(arg2, 0) & class68.method582(arg3, 0), (byte) 0);
        if (arg2 != -1 && arg3 != -1) {
            var12.method400(arg2, arg0, 7, arg3);
        } else if (arg2 != -1) {
            var12.method399(-230, arg2);
        }
        if (this.field572 != 128 || this.field573 != 128) {
            var12.method407(this.field573, this.field572, false, this.field572);
        }
        var12.method395(this.field574);
        var12.field1238 = null;
        var12.field1237 = null;
        if (this.field566 == 1) {
            var12.field1239 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "a", descriptor = "(LGHHPHSRU;I)V")
    private final void method159(class14 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method202();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method202();
                    this.field594 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field594[var6] = arg0.method204();
                    }
                } else if (var4 == 2) {
                    this.field591 = arg0.method209();
                } else if (var4 == 3) {
                    this.field569 = arg0.method210(5);
                } else if (var4 == 12) {
                    this.field566 = arg0.method203();
                } else if (var4 == 13) {
                    this.field596 = arg0.method204();
                } else if (var4 == 14) {
                    this.field576 = arg0.method204();
                } else if (var4 == 17) {
                    this.field576 = arg0.method204();
                    this.field590 = arg0.method204();
                    this.field581 = arg0.method204();
                    this.field578 = arg0.method204();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field559 == null) {
                        this.field559 = new String[5];
                    }
                    this.field559[var4 - 30] = arg0.method209();
                    if (this.field559[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field559[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method202();
                    this.field584 = new int[var7];
                    this.field585 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field584[var8] = arg0.method204();
                        this.field585[var8] = arg0.method204();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method202();
                    this.field577 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field577[var10] = arg0.method204();
                    }
                } else if (var4 == 90) {
                    this.field561 = arg0.method204();
                } else if (var4 == 91) {
                    this.field558 = arg0.method204();
                } else if (var4 == 92) {
                    this.field582 = arg0.method204();
                } else if (var4 == 93) {
                    this.field579 = false;
                } else if (var4 == 95) {
                    this.field586 = arg0.method204();
                } else if (var4 == 97) {
                    this.field572 = arg0.method204();
                } else if (var4 == 98) {
                    this.field573 = arg0.method204();
                } else if (var4 == 99) {
                    this.field589 = true;
                } else if (var4 == 100) {
                    this.field587 = arg0.method203();
                } else if (var4 == 101) {
                    this.field562 = arg0.method203() * 5;
                } else if (var4 == 102) {
                    this.field565 = arg0.method204();
                } else if (var4 == 103) {
                    this.field568 = arg0.method204();
                } else if (var4 == 106) {
                    this.field580 = arg0.method204();
                    if (this.field580 == 65535) {
                        this.field580 = -1;
                    }
                    this.field588 = arg0.method204();
                    if (this.field588 == 65535) {
                        this.field588 = -1;
                    }
                    int var11 = arg0.method202();
                    this.field583 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field583[var12] = arg0.method204();
                        if (this.field583[var12] == 65535) {
                            this.field583[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field560 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "a", descriptor = "(I)V")
    public static final void method160(int arg0) {
        field570 = null;
        field571 = null;
        if (arg0 < 2 || arg0 > 2) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field563 = null;
        field564 = null;
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "b", descriptor = "(I)Z")
    public boolean method161(int arg0) {
        if (this.field583 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 21262) {
            throw new NullPointerException();
        }
        if (this.field580 != -1) {
            class34 var3 = class34.field1182[this.field580];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field182[var6 - var5];
            var2 = field595.field539[var4] >> var5 & var7;
        } else if (this.field588 != -1) {
            var2 = field595.field539[this.field588];
        }
        return var2 >= 0 && var2 < this.field583.length && this.field583[var2] != -1;
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "c", descriptor = "(I)LDDJHHGTJ;")
    public static final class6 method162(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field563[var1].field592) {
                return field563[var1];
            }
        }
        field575 = (field575 + 1) % 20;
        class6 var2 = field563[field575] = new class6();
        field564.field769 = field571[arg0];
        var2.field592 = arg0;
        var2.method159(field564, 0);
        return var2;
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "d", descriptor = "(I)LOQIGXOFQ;")
    public final class35 method163(int arg0) {
        if (this.field583 != null) {
            class6 var2 = this.method164(46311);
            return var2 == null ? null : var2.method163(600);
        } else if (this.field577 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 <= 0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field577.length; var4++) {
                if (!class35.method392(this.field577[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class35[] var5 = new class35[this.field577.length];
            for (int var6 = 0; var6 < this.field577.length; var6++) {
                var5[var6] = class35.method391(this.field577[var6]);
            }
            class35 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class35(var5.length, -537, var5);
            }
            if (this.field584 != null) {
                for (int var8 = 0; var8 < this.field584.length; var8++) {
                    var7.method405(this.field584[var8], this.field585[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "e", descriptor = "(I)LDDJHHGTJ;")
    public final class6 method164(int arg0) {
        if (arg0 != 46311) {
            this.field597 = 351;
        }
        int var2 = -1;
        if (this.field580 != -1) {
            class34 var3 = class34.field1182[this.field580];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field182[var6 - var5];
            var2 = field595.field539[var4] >> var5 & var7;
        } else if (this.field588 != -1) {
            var2 = field595.field539[this.field588];
        }
        return var2 < 0 || var2 >= this.field583.length || this.field583[var2] == -1 ? null : method162(this.field583[var2]);
    }

    @OriginalMember(owner = "DDJHHGTJ", name = "a", descriptor = "(LDTIATKJO;)V")
    public static final void method165(class8 arg0) {
        field564 = new class14(-527, arg0.method168("npc.dat", null));
        class14 var1 = new class14(-527, arg0.method168("npc.idx", null));
        field593 = var1.method204();
        field571 = new int[field593];
        int var2 = 2;
        for (int var3 = 0; var3 < field593; var3++) {
            field571[var3] = var2;
            var2 += var1.method204();
        }
        field563 = new class6[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field563[var4] = new class6();
        }
    }
}
