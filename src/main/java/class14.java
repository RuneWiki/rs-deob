import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DOBKXCMM")
public class class14 {

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "I")
    private int field724 = 623;

    @OriginalMember(owner = "DOBKXCMM", name = "b", descriptor = "I")
    public int field725 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "f", descriptor = "I")
    public int field729 = 32;

    @OriginalMember(owner = "DOBKXCMM", name = "g", descriptor = "I")
    public int field730 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "h", descriptor = "I")
    public int field731 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "i", descriptor = "I")
    public int field732 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "j", descriptor = "Z")
    public boolean field733 = true;

    @OriginalMember(owner = "DOBKXCMM", name = "m", descriptor = "I")
    public int field736 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "o", descriptor = "J")
    public long field738 = -1L;

    @OriginalMember(owner = "DOBKXCMM", name = "p", descriptor = "I")
    public int field739 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "q", descriptor = "I")
    public int field740 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "r", descriptor = "I")
    private int field741 = 411;

    @OriginalMember(owner = "DOBKXCMM", name = "u", descriptor = "I")
    private int field744 = 128;

    @OriginalMember(owner = "DOBKXCMM", name = "y", descriptor = "Z")
    public boolean field748 = false;

    @OriginalMember(owner = "DOBKXCMM", name = "z", descriptor = "I")
    public int field749 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "B", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "DOBKXCMM", name = "D", descriptor = "I")
    public int field753 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "G", descriptor = "I")
    private int field756 = 128;

    @OriginalMember(owner = "DOBKXCMM", name = "J", descriptor = "I")
    public int field759 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "K", descriptor = "I")
    public int field760 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "L", descriptor = "I")
    public int field761 = -1;

    @OriginalMember(owner = "DOBKXCMM", name = "M", descriptor = "B")
    public byte field762 = 1;

    @OriginalMember(owner = "DOBKXCMM", name = "x", descriptor = "LQQBOAQZB;")
    public static class50 field747 = new class50(3, 30);

    @OriginalMember(owner = "DOBKXCMM", name = "n", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "DOBKXCMM", name = "s", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "DOBKXCMM", name = "t", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "DOBKXCMM", name = "E", descriptor = "I")
    private static int field754;

    @OriginalMember(owner = "DOBKXCMM", name = "C", descriptor = "LINLHDAGO;")
    private static class29 field752;

    @OriginalMember(owner = "DOBKXCMM", name = "H", descriptor = "Lclient;")
    public static client field757;

    @OriginalMember(owner = "DOBKXCMM", name = "A", descriptor = "Ljava/lang/String;")
    public String field750;

    @OriginalMember(owner = "DOBKXCMM", name = "e", descriptor = "[B")
    public byte[] field728;

    @OriginalMember(owner = "DOBKXCMM", name = "c", descriptor = "[I")
    private int[] field726;

    @OriginalMember(owner = "DOBKXCMM", name = "d", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "DOBKXCMM", name = "l", descriptor = "[I")
    private static int[] field735;

    @OriginalMember(owner = "DOBKXCMM", name = "v", descriptor = "[I")
    public int[] field745;

    @OriginalMember(owner = "DOBKXCMM", name = "F", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "DOBKXCMM", name = "I", descriptor = "[I")
    private int[] field758;

    @OriginalMember(owner = "DOBKXCMM", name = "k", descriptor = "[LDOBKXCMM;")
    private static class14[] field734;

    @OriginalMember(owner = "DOBKXCMM", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field746;

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "(ILINLHDAGO;)V")
    private final void method235(int arg0, class29 arg1) {
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method308();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method308();
                    this.field758 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field758[var5] = arg1.method310();
                    }
                } else if (var3 == 2) {
                    this.field750 = arg1.method315();
                } else if (var3 == 3) {
                    this.field728 = arg1.method316(10453);
                } else if (var3 == 12) {
                    this.field762 = arg1.method309();
                } else if (var3 == 13) {
                    this.field725 = arg1.method310();
                } else if (var3 == 14) {
                    this.field760 = arg1.method310();
                } else if (var3 == 17) {
                    this.field760 = arg1.method310();
                    this.field761 = arg1.method310();
                    this.field736 = arg1.method310();
                    this.field753 = arg1.method310();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field746 == null) {
                        this.field746 = new String[5];
                    }
                    this.field746[var3 - 30] = arg1.method315();
                    if (this.field746[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field746[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method308();
                    this.field755 = new int[var6];
                    this.field726 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field755[var7] = arg1.method310();
                        this.field726[var7] = arg1.method310();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method308();
                    this.field727 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field727[var9] = arg1.method310();
                    }
                } else if (var3 == 90) {
                    this.field759 = arg1.method310();
                } else if (var3 == 91) {
                    this.field730 = arg1.method310();
                } else if (var3 == 92) {
                    this.field731 = arg1.method310();
                } else if (var3 == 93) {
                    this.field733 = false;
                } else if (var3 == 95) {
                    this.field749 = arg1.method310();
                } else if (var3 == 97) {
                    this.field744 = arg1.method310();
                } else if (var3 == 98) {
                    this.field756 = arg1.method310();
                } else if (var3 == 99) {
                    this.field748 = true;
                } else if (var3 == 100) {
                    this.field737 = arg1.method309();
                } else if (var3 == 101) {
                    this.field742 = arg1.method309() * 5;
                } else if (var3 == 102) {
                    this.field740 = arg1.method310();
                } else if (var3 == 103) {
                    this.field729 = arg1.method310();
                } else if (var3 == 106) {
                    this.field732 = arg1.method310();
                    if (this.field732 == 65535) {
                        this.field732 = -1;
                    }
                    this.field739 = arg1.method310();
                    if (this.field739 == 65535) {
                        this.field739 = -1;
                    }
                    int var10 = arg1.method308();
                    this.field745 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field745[var11] = arg1.method310();
                        if (this.field745[var11] == 65535) {
                            this.field745[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "(I)LDHUPIIUL;")
    public final class10 method236(int arg0) {
        if (this.field745 != null) {
            class14 var2 = this.method240(3);
            return var2 == null ? null : var2.method236(0);
        } else if (this.field727 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field727.length; var4++) {
                if (!class10.method192(this.field727[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class10[] var5 = new class10[this.field727.length];
            for (int var6 = 0; var6 < this.field727.length; var6++) {
                var5[var6] = class10.method191(this.field741, this.field727[var6]);
            }
            class10 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class10(17776, var5, var5.length);
            }
            if (this.field755 != null) {
                for (int var8 = 0; var8 < this.field755.length; var8++) {
                    var7.method205(this.field755[var8], this.field726[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "(I[III)LDHUPIIUL;")
    public final class10 method237(int arg0, int[] arg1, int arg2, int arg3) {
        if (this.field745 != null) {
            class14 var5 = this.method240(3);
            return var5 == null ? null : var5.method237(arg0, arg1, arg2, 623);
        }
        class10 var6 = (class10) field747.method421(this.field738);
        int var7 = 85 / arg3;
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field758.length; var9++) {
                if (!class10.method192(this.field758[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class10[] var10 = new class10[this.field758.length];
            for (int var11 = 0; var11 < this.field758.length; var11++) {
                var10[var11] = class10.method191(this.field741, this.field758[var11]);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class10(17776, var10, var10.length);
            }
            if (this.field755 != null) {
                for (int var12 = 0; var12 < this.field755.length; var12++) {
                    var6.method205(this.field755[var12], this.field726[var12]);
                }
            }
            var6.method198(-390);
            var6.method208(this.field737 + 64, this.field742 + 850, -30, -50, -30, true);
            field747.method422(true, var6, this.field738);
        }
        class10 var13 = class10.field612;
        var13.method193(8, var6, class5.method16(arg2, true) & class5.method16(arg0, true));
        if (arg2 != -1 && arg0 != -1) {
            var13.method200(arg1, arg2, arg0, (byte) 1);
        } else if (arg2 != -1) {
            var13.method199(arg2, 0);
        }
        if (this.field744 != 128 || this.field756 != 128) {
            var13.method207(-592, this.field744, this.field756, this.field744);
        }
        var13.method195(1);
        var13.field649 = null;
        var13.field648 = null;
        if (this.field762 == 1) {
            var13.field650 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "(LDYBMLHQM;)V")
    public static final void method238(class16 arg0) {
        field752 = new class29((byte) -28, arg0.method248("npc.dat", null));
        class29 var1 = new class29((byte) -28, arg0.method248("npc.idx", null));
        field743 = var1.method310();
        field735 = new int[field743];
        int var2 = 2;
        for (int var3 = 0; var3 < field743; var3++) {
            field735[var3] = var2;
            var2 += var1.method310();
        }
        field734 = new class14[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field734[var4] = new class14();
        }
    }

    @OriginalMember(owner = "DOBKXCMM", name = "b", descriptor = "(I)LDOBKXCMM;")
    public static final class14 method239(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field734[var1].field738) {
                return field734[var1];
            }
        }
        field754 = (field754 + 1) % 20;
        class14 var2 = field734[field754] = new class14();
        field752.field1107 = field735[arg0];
        var2.field738 = arg0;
        var2.method235(6, field752);
        return var2;
    }

    @OriginalMember(owner = "DOBKXCMM", name = "c", descriptor = "(I)LDOBKXCMM;")
    public final class14 method240(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field751 = !this.field751;
        }
        int var2 = -1;
        if (this.field732 != -1) {
            class44 var3 = class44.field1288[this.field732];
            int var4 = var3.field1290;
            int var5 = var3.field1291;
            int var6 = var3.field1292;
            int var7 = client.field313[var6 - var5];
            var2 = field757.field353[var4] >> var5 & var7;
        } else if (this.field739 != -1) {
            var2 = field757.field353[this.field739];
        }
        return var2 < 0 || var2 >= this.field745.length || this.field745[var2] == -1 ? null : method239(this.field745[var2]);
    }

    @OriginalMember(owner = "DOBKXCMM", name = "a", descriptor = "(Z)V")
    public static final void method241(boolean arg0) {
        field747 = null;
        field735 = null;
        field734 = null;
        field752 = null;
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }
}
