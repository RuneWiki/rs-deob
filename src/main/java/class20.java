import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HEKJNUPL")
public class class20 {

    @OriginalMember(owner = "HEKJNUPL", name = "g", descriptor = "I")
    private int field739 = 128;

    @OriginalMember(owner = "HEKJNUPL", name = "i", descriptor = "I")
    public int field741 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "j", descriptor = "I")
    public int field742 = 32;

    @OriginalMember(owner = "HEKJNUPL", name = "k", descriptor = "I")
    public int field743 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "l", descriptor = "I")
    public int field744 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "m", descriptor = "I")
    public int field745 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "s", descriptor = "B")
    public byte field751 = 1;

    @OriginalMember(owner = "HEKJNUPL", name = "t", descriptor = "I")
    public int field752 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "v", descriptor = "Z")
    public boolean field754 = false;

    @OriginalMember(owner = "HEKJNUPL", name = "w", descriptor = "Z")
    public boolean field755 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "y", descriptor = "Z")
    private boolean field757 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "z", descriptor = "I")
    private int field758 = -30892;

    @OriginalMember(owner = "HEKJNUPL", name = "A", descriptor = "I")
    public int field759 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "B", descriptor = "J")
    public long field760 = -1L;

    @OriginalMember(owner = "HEKJNUPL", name = "C", descriptor = "I")
    private int field761 = 128;

    @OriginalMember(owner = "HEKJNUPL", name = "D", descriptor = "Z")
    public boolean field762 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "H", descriptor = "I")
    public int field766 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "J", descriptor = "I")
    public int field768 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "K", descriptor = "I")
    public int field769 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "L", descriptor = "I")
    public int field770 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "M", descriptor = "Z")
    private boolean field771 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "N", descriptor = "I")
    public int field772 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "Q", descriptor = "I")
    public int field775 = -1;

    @OriginalMember(owner = "HEKJNUPL", name = "h", descriptor = "Z")
    private static boolean field740 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "o", descriptor = "LRPWOWYDL;")
    public static class51 field747 = new class51(0, 30);

    @OriginalMember(owner = "HEKJNUPL", name = "r", descriptor = "I")
    private static int field750 = 4;

    @OriginalMember(owner = "HEKJNUPL", name = "I", descriptor = "Z")
    private static boolean field767 = true;

    @OriginalMember(owner = "HEKJNUPL", name = "d", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "HEKJNUPL", name = "f", descriptor = "I")
    private static int field738;

    @OriginalMember(owner = "HEKJNUPL", name = "p", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "HEKJNUPL", name = "E", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "HEKJNUPL", name = "x", descriptor = "LDNRIFKTO;")
    private static class11 field756;

    @OriginalMember(owner = "HEKJNUPL", name = "O", descriptor = "Lclient;")
    public static client field773;

    @OriginalMember(owner = "HEKJNUPL", name = "u", descriptor = "Ljava/lang/String;")
    public String field753;

    @OriginalMember(owner = "HEKJNUPL", name = "n", descriptor = "[B")
    public byte[] field746;

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "[I")
    public int[] field733;

    @OriginalMember(owner = "HEKJNUPL", name = "b", descriptor = "[I")
    private int[] field734;

    @OriginalMember(owner = "HEKJNUPL", name = "q", descriptor = "[I")
    private static int[] field749;

    @OriginalMember(owner = "HEKJNUPL", name = "F", descriptor = "[I")
    private int[] field764;

    @OriginalMember(owner = "HEKJNUPL", name = "G", descriptor = "[I")
    private int[] field765;

    @OriginalMember(owner = "HEKJNUPL", name = "P", descriptor = "[I")
    private int[] field774;

    @OriginalMember(owner = "HEKJNUPL", name = "c", descriptor = "[LHEKJNUPL;")
    private static class20[] field735;

    @OriginalMember(owner = "HEKJNUPL", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field737;

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(B)Z")
    public boolean method267(byte arg0) {
        if (arg0 != 9) {
            throw new NullPointerException();
        } else if (this.field733 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field741 != -1) {
                class31 var3 = class31.field1035[this.field741];
                int var4 = var3.field1037;
                int var5 = var3.field1038;
                int var6 = var3.field1039;
                int var7 = client.field554[var6 - var5];
                var2 = field773.field588[var4] >> var5 & var7;
            } else if (this.field743 != -1) {
                var2 = field773.field588[this.field743];
            }
            return var2 >= 0 && var2 < this.field733.length && this.field733[var2] != -1;
        }
    }

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(ZI[II)LSNMMQNPZ;")
    public final class55 method268(boolean arg0, int arg1, int[] arg2, int arg3) {
        if (!arg0) {
            this.field757 = !this.field757;
        }
        if (this.field733 != null) {
            class20 var5 = this.method272(-362);
            return var5 == null ? null : var5.method268(this.field771, arg1, arg2, arg3);
        }
        class55 var6 = (class55) field747.method401(this.field760);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field774.length; var8++) {
                if (!class55.method419(this.field774[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class55[] var9 = new class55[this.field774.length];
            for (int var10 = 0; var10 < this.field774.length; var10++) {
                var9[var10] = class55.method418(this.field774[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class55(var9.length, false, var9);
            }
            if (this.field765 != null) {
                for (int var11 = 0; var11 < this.field765.length; var11++) {
                    var6.method432(this.field765[var11], this.field734[var11]);
                }
            }
            var6.method425(false);
            var6.method435(this.field736 + 64, this.field763 + 850, -30, -50, -30, true);
            field747.method402((byte) 124, this.field760, var6);
        }
        class55 var12 = class55.field1333;
        var12.method420(var6, (byte) 38, class39.method356((byte) 68, arg1) & class39.method356((byte) 68, arg3));
        if (arg1 != -1 && arg3 != -1) {
            var12.method427(arg3, arg2, 4, arg1);
        } else if (arg1 != -1) {
            var12.method426(arg1, (byte) 1);
        }
        if (this.field739 != 128 || this.field761 != 128) {
            var12.method434(2985, this.field739, this.field739, this.field761);
        }
        var12.method422(4);
        var12.field1370 = null;
        var12.field1369 = null;
        if (this.field751 == 1) {
            var12.field1371 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(LDNRIFKTO;I)V")
    private final void method269(class11 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method189();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method189();
                    this.field774 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field774[var5] = arg0.method191();
                    }
                } else if (var3 == 2) {
                    this.field753 = arg0.method196();
                } else if (var3 == 3) {
                    this.field746 = arg0.method197(0);
                } else if (var3 == 12) {
                    this.field751 = arg0.method190();
                } else if (var3 == 13) {
                    this.field768 = arg0.method191();
                } else if (var3 == 14) {
                    this.field752 = arg0.method191();
                } else if (var3 == 17) {
                    this.field752 = arg0.method191();
                    this.field744 = arg0.method191();
                    this.field745 = arg0.method191();
                    this.field770 = arg0.method191();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field737 == null) {
                        this.field737 = new String[5];
                    }
                    this.field737[var3 - 30] = arg0.method196();
                    if (this.field737[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field737[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method189();
                    this.field765 = new int[var6];
                    this.field734 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field765[var7] = arg0.method191();
                        this.field734[var7] = arg0.method191();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method189();
                    this.field764 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field764[var9] = arg0.method191();
                    }
                } else if (var3 == 90) {
                    this.field775 = arg0.method191();
                } else if (var3 == 91) {
                    this.field769 = arg0.method191();
                } else if (var3 == 92) {
                    this.field772 = arg0.method191();
                } else if (var3 == 93) {
                    this.field755 = false;
                } else if (var3 == 95) {
                    this.field759 = arg0.method191();
                } else if (var3 == 97) {
                    this.field739 = arg0.method191();
                } else if (var3 == 98) {
                    this.field761 = arg0.method191();
                } else if (var3 == 99) {
                    this.field754 = true;
                } else if (var3 == 100) {
                    this.field736 = arg0.method190();
                } else if (var3 == 101) {
                    this.field763 = arg0.method190() * 5;
                } else if (var3 == 102) {
                    this.field766 = arg0.method191();
                } else if (var3 == 103) {
                    this.field742 = arg0.method191();
                } else if (var3 == 106) {
                    this.field741 = arg0.method191();
                    if (this.field741 == 65535) {
                        this.field741 = -1;
                    }
                    this.field743 = arg0.method191();
                    if (this.field743 == 65535) {
                        this.field743 = -1;
                    }
                    int var10 = arg0.method189();
                    this.field733 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field733[var11] = arg0.method191();
                        if (this.field733[var11] == 65535) {
                            this.field733[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field762 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(Z)LSNMMQNPZ;")
    public final class55 method270(boolean arg0) {
        if (this.field733 != null) {
            class20 var2 = this.method272(-362);
            return var2 == null ? null : var2.method270(true);
        } else if (this.field764 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (!arg0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field764.length; var4++) {
                if (!class55.method419(this.field764[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class55[] var5 = new class55[this.field764.length];
            for (int var6 = 0; var6 < this.field764.length; var6++) {
                var5[var6] = class55.method418(this.field764[var6]);
            }
            class55 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class55(var5.length, false, var5);
            }
            if (this.field765 != null) {
                for (int var8 = 0; var8 < this.field765.length; var8++) {
                    var7.method432(this.field765[var8], this.field734[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(LFNOQZAYQ;)V")
    public static final void method271(class14 arg0) {
        field756 = new class11(arg0.method246("npc.dat", null), field740);
        class11 var1 = new class11(arg0.method246("npc.idx", null), field740);
        field748 = var1.method191();
        field749 = new int[field748];
        int var2 = 2;
        for (int var3 = 0; var3 < field748; var3++) {
            field749[var3] = var2;
            var2 += var1.method191();
        }
        field735 = new class20[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field735[var4] = new class20();
        }
    }

    @OriginalMember(owner = "HEKJNUPL", name = "a", descriptor = "(I)LHEKJNUPL;")
    public final class20 method272(int arg0) {
        while (arg0 >= 0) {
            this.field758 = -80;
        }
        int var2 = -1;
        if (this.field741 != -1) {
            class31 var3 = class31.field1035[this.field741];
            int var4 = var3.field1037;
            int var5 = var3.field1038;
            int var6 = var3.field1039;
            int var7 = client.field554[var6 - var5];
            var2 = field773.field588[var4] >> var5 & var7;
        } else if (this.field743 != -1) {
            var2 = field773.field588[this.field743];
        }
        if (var2 < 0 || var2 >= this.field733.length || this.field733[var2] == -1) {
            return null;
        } else {
            return method273(this.field733[var2]);
        }
    }

    @OriginalMember(owner = "HEKJNUPL", name = "b", descriptor = "(I)LHEKJNUPL;")
    public static final class20 method273(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field735[var1].field760) {
                return field735[var1];
            }
        }
        field738 = (field738 + 1) % 20;
        class20 var2 = field735[field738] = new class20();
        field756.field643 = field749[arg0];
        var2.field760 = arg0;
        var2.method269(field756, -25);
        return var2;
    }

    @OriginalMember(owner = "HEKJNUPL", name = "c", descriptor = "(I)V")
    public static final void method274(int arg0) {
        field747 = null;
        field749 = null;
        field735 = null;
        field756 = null;
        if (field750 != arg0) {
            field767 = !field767;
        }
    }
}
