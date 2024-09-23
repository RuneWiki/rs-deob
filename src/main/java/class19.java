import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FWGUGZKU")
public class class19 {

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "B")
    private byte field746 = 55;

    @OriginalMember(owner = "FWGUGZKU", name = "c", descriptor = "I")
    public int field748 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "e", descriptor = "I")
    public int field750 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "h", descriptor = "I")
    public int field753 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "j", descriptor = "Z")
    public boolean field755 = false;

    @OriginalMember(owner = "FWGUGZKU", name = "p", descriptor = "I")
    private int field761 = -37665;

    @OriginalMember(owner = "FWGUGZKU", name = "s", descriptor = "B")
    private byte field764 = -125;

    @OriginalMember(owner = "FWGUGZKU", name = "u", descriptor = "I")
    public int field766 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "v", descriptor = "I")
    public int field767 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "w", descriptor = "B")
    public byte field768 = 1;

    @OriginalMember(owner = "FWGUGZKU", name = "x", descriptor = "Z")
    public boolean field769 = true;

    @OriginalMember(owner = "FWGUGZKU", name = "z", descriptor = "I")
    private int field771 = 128;

    @OriginalMember(owner = "FWGUGZKU", name = "B", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "C", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "D", descriptor = "I")
    public int field775 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "E", descriptor = "I")
    public int field776 = 32;

    @OriginalMember(owner = "FWGUGZKU", name = "F", descriptor = "Z")
    private boolean field777 = false;

    @OriginalMember(owner = "FWGUGZKU", name = "G", descriptor = "I")
    public int field778 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "H", descriptor = "I")
    private int field779 = 128;

    @OriginalMember(owner = "FWGUGZKU", name = "I", descriptor = "I")
    public int field780 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "K", descriptor = "Z")
    public boolean field782 = true;

    @OriginalMember(owner = "FWGUGZKU", name = "L", descriptor = "I")
    public int field783 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "M", descriptor = "J")
    public long field784 = -1L;

    @OriginalMember(owner = "FWGUGZKU", name = "N", descriptor = "I")
    public int field785 = -1;

    @OriginalMember(owner = "FWGUGZKU", name = "f", descriptor = "LGOPFMRDJ;")
    public static class22 field751 = new class22(639, 30);

    @OriginalMember(owner = "FWGUGZKU", name = "d", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "FWGUGZKU", name = "k", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "FWGUGZKU", name = "t", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "FWGUGZKU", name = "A", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "FWGUGZKU", name = "O", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "FWGUGZKU", name = "m", descriptor = "LXQPFGONL;")
    private static class62 field758;

    @OriginalMember(owner = "FWGUGZKU", name = "q", descriptor = "Lclient;")
    public static client field762;

    @OriginalMember(owner = "FWGUGZKU", name = "P", descriptor = "Ljava/lang/String;")
    public String field787;

    @OriginalMember(owner = "FWGUGZKU", name = "i", descriptor = "[B")
    public byte[] field754;

    @OriginalMember(owner = "FWGUGZKU", name = "b", descriptor = "[I")
    private int[] field747;

    @OriginalMember(owner = "FWGUGZKU", name = "l", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "FWGUGZKU", name = "o", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "FWGUGZKU", name = "r", descriptor = "[I")
    private int[] field763;

    @OriginalMember(owner = "FWGUGZKU", name = "y", descriptor = "[I")
    private int[] field770;

    @OriginalMember(owner = "FWGUGZKU", name = "J", descriptor = "[I")
    private static int[] field781;

    @OriginalMember(owner = "FWGUGZKU", name = "g", descriptor = "[LFWGUGZKU;")
    private static class19[] field752;

    @OriginalMember(owner = "FWGUGZKU", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field759;

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "(LXQPFGONL;I)V")
    private final void method207(class62 arg0, int arg1) {
        int var3 = 81 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method478();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method478();
                    this.field757 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field757[var6] = arg0.method480();
                    }
                } else if (var4 == 2) {
                    this.field787 = arg0.method485();
                } else if (var4 == 3) {
                    this.field754 = arg0.method486(this.field761);
                } else if (var4 == 12) {
                    this.field768 = arg0.method479();
                } else if (var4 == 13) {
                    this.field778 = arg0.method480();
                } else if (var4 == 14) {
                    this.field766 = arg0.method480();
                } else if (var4 == 17) {
                    this.field766 = arg0.method480();
                    this.field780 = arg0.method480();
                    this.field775 = arg0.method480();
                    this.field783 = arg0.method480();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field759 == null) {
                        this.field759 = new String[5];
                    }
                    this.field759[var4 - 30] = arg0.method485();
                    if (this.field759[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field759[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method478();
                    this.field770 = new int[var7];
                    this.field763 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field770[var8] = arg0.method480();
                        this.field763[var8] = arg0.method480();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method478();
                    this.field747 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field747[var10] = arg0.method480();
                    }
                } else if (var4 == 90) {
                    this.field774 = arg0.method480();
                } else if (var4 == 91) {
                    this.field753 = arg0.method480();
                } else if (var4 == 92) {
                    this.field785 = arg0.method480();
                } else if (var4 == 93) {
                    this.field782 = false;
                } else if (var4 == 95) {
                    this.field748 = arg0.method480();
                } else if (var4 == 97) {
                    this.field779 = arg0.method480();
                } else if (var4 == 98) {
                    this.field771 = arg0.method480();
                } else if (var4 == 99) {
                    this.field755 = true;
                } else if (var4 == 100) {
                    this.field749 = arg0.method479();
                } else if (var4 == 101) {
                    this.field765 = arg0.method479() * 5;
                } else if (var4 == 102) {
                    this.field767 = arg0.method480();
                } else if (var4 == 103) {
                    this.field776 = arg0.method480();
                } else if (var4 == 106) {
                    this.field750 = arg0.method480();
                    if (this.field750 == 65535) {
                        this.field750 = -1;
                    }
                    this.field773 = arg0.method480();
                    if (this.field773 == 65535) {
                        this.field773 = -1;
                    }
                    int var11 = arg0.method478();
                    this.field760 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field760[var12] = arg0.method480();
                        if (this.field760[var12] == 65535) {
                            this.field760[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field769 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "(Z)LFWGUGZKU;")
    public final class19 method208(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            throw new NullPointerException();
        }
        if (this.field750 != -1) {
            class30 var3 = class30.field953[this.field750];
            int var4 = var3.field955;
            int var5 = var3.field956;
            int var6 = var3.field957;
            int var7 = client.field197[var6 - var5];
            var2 = field762.field374[var4] >> var5 & var7;
        } else if (this.field773 != -1) {
            var2 = field762.field374[this.field773];
        }
        return var2 < 0 || var2 >= this.field760.length || this.field760[var2] == -1 ? null : method210(this.field760[var2]);
    }

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "(I)V")
    public static final void method209(int arg0) {
        field751 = null;
        field781 = null;
        field752 = null;
        field758 = null;
        int var1 = 73 / arg0;
    }

    @OriginalMember(owner = "FWGUGZKU", name = "b", descriptor = "(I)LFWGUGZKU;")
    public static final class19 method210(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field752[var1].field784) {
                return field752[var1];
            }
        }
        field786 = (field786 + 1) % 20;
        class19 var2 = field752[field786] = new class19();
        field758.field1542 = field781[arg0];
        var2.field784 = arg0;
        var2.method207(field758, 168);
        return var2;
    }

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "(LXMRRKSSB;)V")
    public static final void method211(class60 arg0) {
        field758 = new class62(arg0.method465("npc.dat", null), 49938);
        class62 var1 = new class62(arg0.method465("npc.idx", null), 49938);
        field756 = var1.method480();
        field781 = new int[field756];
        int var2 = 2;
        for (int var3 = 0; var3 < field756; var3++) {
            field781[var3] = var2;
            var2 += var1.method480();
        }
        field752 = new class19[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field752[var4] = new class19();
        }
    }

    @OriginalMember(owner = "FWGUGZKU", name = "a", descriptor = "(BI[II)LITSMSHJO;")
    public final class27 method212(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != -125) {
            throw new NullPointerException();
        } else if (this.field760 == null) {
            class27 var6 = (class27) field751.method220(this.field784);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field757.length; var8++) {
                    if (!class27.method239(this.field757[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class27[] var9 = new class27[this.field757.length];
                for (int var10 = 0; var10 < this.field757.length; var10++) {
                    var9[var10] = class27.method238((byte) -10, this.field757[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class27(var9, true, var9.length);
                }
                if (this.field770 != null) {
                    for (int var11 = 0; var11 < this.field770.length; var11++) {
                        var6.method252(this.field770[var11], this.field763[var11]);
                    }
                }
                var6.method245(0);
                var6.method255(this.field749 + 64, this.field765 + 850, -30, -50, -30, true);
                field751.method221(this.field784, this.field746, var6);
            }
            class27 var12 = class27.field858;
            var12.method240(var6, 5, class49.method401(arg1, 0) & class49.method401(arg3, 0));
            if (arg1 != -1 && arg3 != -1) {
                var12.method247(arg1, arg2, true, arg3);
            } else if (arg1 != -1) {
                var12.method246(-1851, arg1);
            }
            if (this.field779 != 128 || this.field771 != 128) {
                var12.method254(this.field779, this.field779, this.field771, 619);
            }
            var12.method242(-407);
            var12.field895 = null;
            var12.field894 = null;
            if (this.field768 == 1) {
                var12.field896 = true;
            }
            return var12;
        } else {
            class19 var5 = this.method208(false);
            return var5 == null ? null : var5.method212(this.field764, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "FWGUGZKU", name = "c", descriptor = "(I)LITSMSHJO;")
    public final class27 method213(int arg0) {
        if (this.field760 != null) {
            class19 var2 = this.method208(false);
            return var2 == null ? null : var2.method213(7);
        } else if (this.field747 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 < 7 || arg0 > 7) {
                this.field772 = -347;
            }
            for (int var4 = 0; var4 < this.field747.length; var4++) {
                if (!class27.method239(this.field747[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class27[] var5 = new class27[this.field747.length];
            for (int var6 = 0; var6 < this.field747.length; var6++) {
                var5[var6] = class27.method238((byte) -10, this.field747[var6]);
            }
            class27 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class27(var5, true, var5.length);
            }
            if (this.field770 != null) {
                for (int var8 = 0; var8 < this.field770.length; var8++) {
                    var7.method252(this.field770[var8], this.field763[var8]);
                }
            }
            return var7;
        }
    }
}
