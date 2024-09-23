import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("COIHKGSL")
public class class6 {

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "I")
    public int field566 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "d", descriptor = "I")
    public int field569 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "h", descriptor = "I")
    public int field573 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "i", descriptor = "I")
    private int field574 = -261;

    @OriginalMember(owner = "COIHKGSL", name = "l", descriptor = "I")
    public int field577 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "n", descriptor = "I")
    public int field579 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "o", descriptor = "Z")
    public boolean field580 = true;

    @OriginalMember(owner = "COIHKGSL", name = "p", descriptor = "I")
    public int field581 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "q", descriptor = "I")
    public int field582 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "t", descriptor = "I")
    private int field585 = -548;

    @OriginalMember(owner = "COIHKGSL", name = "w", descriptor = "I")
    public int field588 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "B", descriptor = "B")
    public byte field593 = 1;

    @OriginalMember(owner = "COIHKGSL", name = "C", descriptor = "I")
    private int field594 = 128;

    @OriginalMember(owner = "COIHKGSL", name = "D", descriptor = "Z")
    public boolean field595 = false;

    @OriginalMember(owner = "COIHKGSL", name = "F", descriptor = "I")
    public int field597 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "G", descriptor = "I")
    public int field598 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "H", descriptor = "I")
    public int field599 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "I", descriptor = "I")
    public int field600 = -1;

    @OriginalMember(owner = "COIHKGSL", name = "J", descriptor = "I")
    public int field601 = 32;

    @OriginalMember(owner = "COIHKGSL", name = "L", descriptor = "Z")
    public boolean field603 = true;

    @OriginalMember(owner = "COIHKGSL", name = "M", descriptor = "J")
    public long field604 = -1L;

    @OriginalMember(owner = "COIHKGSL", name = "N", descriptor = "I")
    private int field605 = 128;

    @OriginalMember(owner = "COIHKGSL", name = "k", descriptor = "LECXUVDNP;")
    public static class12 field576 = new class12(0, 30);

    @OriginalMember(owner = "COIHKGSL", name = "e", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "COIHKGSL", name = "j", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "COIHKGSL", name = "y", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "COIHKGSL", name = "A", descriptor = "I")
    private static int field592;

    @OriginalMember(owner = "COIHKGSL", name = "K", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "COIHKGSL", name = "E", descriptor = "LMQZHAILV;")
    private static class33 field596;

    @OriginalMember(owner = "COIHKGSL", name = "m", descriptor = "Lclient;")
    public static client field578;

    @OriginalMember(owner = "COIHKGSL", name = "x", descriptor = "Ljava/lang/String;")
    public String field589;

    @OriginalMember(owner = "COIHKGSL", name = "c", descriptor = "[B")
    public byte[] field568;

    @OriginalMember(owner = "COIHKGSL", name = "b", descriptor = "[I")
    private static int[] field567;

    @OriginalMember(owner = "COIHKGSL", name = "g", descriptor = "[I")
    private int[] field572;

    @OriginalMember(owner = "COIHKGSL", name = "r", descriptor = "[I")
    public int[] field583;

    @OriginalMember(owner = "COIHKGSL", name = "s", descriptor = "[I")
    private int[] field584;

    @OriginalMember(owner = "COIHKGSL", name = "v", descriptor = "[I")
    private int[] field587;

    @OriginalMember(owner = "COIHKGSL", name = "z", descriptor = "[I")
    private int[] field591;

    @OriginalMember(owner = "COIHKGSL", name = "f", descriptor = "[LCOIHKGSL;")
    private static class6[] field571;

    @OriginalMember(owner = "COIHKGSL", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field586;

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "(LMQZHAILV;I)V")
    private final void method165(class33 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method325();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method325();
                    this.field572 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field572[var5] = arg0.method327();
                    }
                } else if (var3 == 2) {
                    this.field589 = arg0.method332();
                } else if (var3 == 3) {
                    this.field568 = arg0.method333((byte) 2);
                } else if (var3 == 12) {
                    this.field593 = arg0.method326();
                } else if (var3 == 13) {
                    this.field597 = arg0.method327();
                } else if (var3 == 14) {
                    this.field582 = arg0.method327();
                } else if (var3 == 17) {
                    this.field582 = arg0.method327();
                    this.field598 = arg0.method327();
                    this.field599 = arg0.method327();
                    this.field581 = arg0.method327();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field586 == null) {
                        this.field586 = new String[5];
                    }
                    this.field586[var3 - 30] = arg0.method332();
                    if (this.field586[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field586[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method325();
                    this.field591 = new int[var6];
                    this.field584 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field591[var7] = arg0.method327();
                        this.field584[var7] = arg0.method327();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method325();
                    this.field587 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field587[var9] = arg0.method327();
                    }
                } else if (var3 == 90) {
                    this.field588 = arg0.method327();
                } else if (var3 == 91) {
                    this.field579 = arg0.method327();
                } else if (var3 == 92) {
                    this.field573 = arg0.method327();
                } else if (var3 == 93) {
                    this.field603 = false;
                } else if (var3 == 95) {
                    this.field566 = arg0.method327();
                } else if (var3 == 97) {
                    this.field594 = arg0.method327();
                } else if (var3 == 98) {
                    this.field605 = arg0.method327();
                } else if (var3 == 99) {
                    this.field595 = true;
                } else if (var3 == 100) {
                    this.field570 = arg0.method326();
                } else if (var3 == 101) {
                    this.field602 = arg0.method326() * 5;
                } else if (var3 == 102) {
                    this.field577 = arg0.method327();
                } else if (var3 == 103) {
                    this.field601 = arg0.method327();
                } else if (var3 == 106) {
                    this.field569 = arg0.method327();
                    if (this.field569 == 65535) {
                        this.field569 = -1;
                    }
                    this.field600 = arg0.method327();
                    if (this.field600 == 65535) {
                        this.field600 = -1;
                    }
                    int var10 = arg0.method325();
                    this.field583 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field583[var11] = arg0.method327();
                        if (this.field583[var11] == 65535) {
                            this.field583[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field580 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "(IZ[II)LYYHPBDED;")
    public final class70 method166(int arg0, boolean arg1, int[] arg2, int arg3) {
        if (this.field583 != null) {
            class6 var5 = this.method167(0);
            return var5 == null ? null : var5.method166(arg0, false, arg2, arg3);
        }
        class70 var6 = (class70) field576.method221(this.field604);
        if (arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field572.length; var9++) {
                if (!class70.method552(this.field572[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class70[] var10 = new class70[this.field572.length];
            for (int var11 = 0; var11 < this.field572.length; var11++) {
                var10[var11] = class70.method551(this.field585, this.field572[var11]);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class70(var10, 0, var10.length);
            }
            if (this.field591 != null) {
                for (int var12 = 0; var12 < this.field591.length; var12++) {
                    var6.method565(this.field591[var12], this.field584[var12]);
                }
            }
            var6.method558(895);
            var6.method568(this.field570 + 64, this.field602 + 850, -30, -50, -30, true);
            field576.method222(this.field604, var6, -17668);
        }
        class70 var13 = class70.field1566;
        var13.method553((byte) 7, class60.method513(3, arg0) & class60.method513(3, arg3), var6);
        if (arg0 != -1 && arg3 != -1) {
            var13.method560(arg3, arg2, 33944, arg0);
        } else if (arg0 != -1) {
            var13.method559(arg0, -682);
        }
        if (this.field594 != 128 || this.field605 != 128) {
            var13.method567(this.field590, this.field605, this.field594, this.field594);
        }
        var13.method555((byte) 6);
        var13.field1603 = null;
        var13.field1602 = null;
        if (this.field593 == 1) {
            var13.field1604 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "(I)LCOIHKGSL;")
    public final class6 method167(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field569 != -1) {
            class9 var3 = class9.field626[this.field569];
            int var4 = var3.field628;
            int var5 = var3.field629;
            int var6 = var3.field630;
            int var7 = client.field283[var6 - var5];
            var2 = field578.field232[var4] >> var5 & var7;
        } else if (this.field600 != -1) {
            var2 = field578.field232[this.field600];
        }
        return var2 < 0 || var2 >= this.field583.length || this.field583[var2] == -1 ? null : method171(this.field583[var2]);
    }

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "(LCXFTMSCH;)V")
    public static final void method168(class8 arg0) {
        field596 = new class33(true, arg0.method176("npc.dat", null));
        class33 var1 = new class33(true, arg0.method176("npc.idx", null));
        field575 = var1.method327();
        field567 = new int[field575];
        int var2 = 2;
        for (int var3 = 0; var3 < field575; var3++) {
            field567[var3] = var2;
            var2 += var1.method327();
        }
        field571 = new class6[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field571[var4] = new class6();
        }
    }

    @OriginalMember(owner = "COIHKGSL", name = "b", descriptor = "(I)LYYHPBDED;")
    public final class70 method169(int arg0) {
        if (arg0 != -37722) {
            this.field574 = 72;
        }
        if (this.field583 != null) {
            class6 var2 = this.method167(0);
            return var2 == null ? null : var2.method169(-37722);
        } else if (this.field587 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field587.length; var4++) {
                if (!class70.method552(this.field587[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class70[] var5 = new class70[this.field587.length];
            for (int var6 = 0; var6 < this.field587.length; var6++) {
                var5[var6] = class70.method551(this.field585, this.field587[var6]);
            }
            class70 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class70(var5, 0, var5.length);
            }
            if (this.field591 != null) {
                for (int var8 = 0; var8 < this.field591.length; var8++) {
                    var7.method565(this.field591[var8], this.field584[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "COIHKGSL", name = "a", descriptor = "(B)V")
    public static final void method170(byte arg0) {
        field576 = null;
        field567 = null;
        field571 = null;
        if (arg0 == -56) {
            field596 = null;
        }
    }

    @OriginalMember(owner = "COIHKGSL", name = "c", descriptor = "(I)LCOIHKGSL;")
    public static final class6 method171(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field571[var1].field604) {
                return field571[var1];
            }
        }
        field592 = (field592 + 1) % 20;
        class6 var2 = field571[field592] = new class6();
        field596.field945 = field567[arg0];
        var2.field604 = arg0;
        var2.method165(field596, -261);
        return var2;
    }
}
