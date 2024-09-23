import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FKIKYVJJ")
public class class19 {

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "I")
    public int field743 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "d", descriptor = "I")
    public int field746 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "i", descriptor = "I")
    public int field751 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "j", descriptor = "Z")
    public boolean field752 = true;

    @OriginalMember(owner = "FKIKYVJJ", name = "k", descriptor = "B")
    private byte field753 = 6;

    @OriginalMember(owner = "FKIKYVJJ", name = "l", descriptor = "B")
    public byte field754 = 1;

    @OriginalMember(owner = "FKIKYVJJ", name = "n", descriptor = "I")
    public int field756 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "o", descriptor = "Z")
    public boolean field757 = true;

    @OriginalMember(owner = "FKIKYVJJ", name = "p", descriptor = "B")
    private byte field758 = 7;

    @OriginalMember(owner = "FKIKYVJJ", name = "q", descriptor = "I")
    public int field759 = 32;

    @OriginalMember(owner = "FKIKYVJJ", name = "r", descriptor = "Z")
    public boolean field760 = false;

    @OriginalMember(owner = "FKIKYVJJ", name = "s", descriptor = "I")
    public int field761 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "t", descriptor = "I")
    public int field762 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "u", descriptor = "I")
    public int field763 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "z", descriptor = "I")
    private int field768 = 128;

    @OriginalMember(owner = "FKIKYVJJ", name = "B", descriptor = "I")
    public int field770 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "C", descriptor = "I")
    private int field771 = 128;

    @OriginalMember(owner = "FKIKYVJJ", name = "F", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "H", descriptor = "I")
    public int field776 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "I", descriptor = "B")
    private byte field777 = 44;

    @OriginalMember(owner = "FKIKYVJJ", name = "J", descriptor = "J")
    public long field778 = -1L;

    @OriginalMember(owner = "FKIKYVJJ", name = "K", descriptor = "I")
    public int field779 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "N", descriptor = "I")
    public int field782 = -1;

    @OriginalMember(owner = "FKIKYVJJ", name = "c", descriptor = "LGOHJFVWE;")
    public static class23 field745 = new class23((byte) -54, 30);

    @OriginalMember(owner = "FKIKYVJJ", name = "b", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "FKIKYVJJ", name = "x", descriptor = "I")
    private static int field766;

    @OriginalMember(owner = "FKIKYVJJ", name = "y", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "FKIKYVJJ", name = "E", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "FKIKYVJJ", name = "M", descriptor = "LYOXDZEVD;")
    private static class68 field781;

    @OriginalMember(owner = "FKIKYVJJ", name = "f", descriptor = "Lclient;")
    public static client field748;

    @OriginalMember(owner = "FKIKYVJJ", name = "G", descriptor = "Ljava/lang/String;")
    public String field775;

    @OriginalMember(owner = "FKIKYVJJ", name = "L", descriptor = "[B")
    public byte[] field780;

    @OriginalMember(owner = "FKIKYVJJ", name = "e", descriptor = "[I")
    private int[] field747;

    @OriginalMember(owner = "FKIKYVJJ", name = "g", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "FKIKYVJJ", name = "m", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "FKIKYVJJ", name = "w", descriptor = "[I")
    private static int[] field765;

    @OriginalMember(owner = "FKIKYVJJ", name = "A", descriptor = "[I")
    private int[] field769;

    @OriginalMember(owner = "FKIKYVJJ", name = "D", descriptor = "[I")
    public int[] field772;

    @OriginalMember(owner = "FKIKYVJJ", name = "v", descriptor = "[LFKIKYVJJ;")
    private static class19[] field764;

    @OriginalMember(owner = "FKIKYVJJ", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field750;

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "(I)LFKIKYVJJ;")
    public static final class19 method202(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field764[var1].field778) {
                return field764[var1];
            }
        }
        field766 = (field766 + 1) % 20;
        class19 var2 = field764[field766] = new class19();
        field781.field1612 = field765[arg0];
        var2.field778 = arg0;
        var2.method203((byte) 44, field781);
        return var2;
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "(BLYOXDZEVD;)V")
    private final void method203(byte arg0, class68 arg1) {
        if (this.field777 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method549();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method549();
                    this.field769 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field769[var5] = arg1.method551();
                    }
                } else if (var3 == 2) {
                    this.field775 = arg1.method556();
                } else if (var3 == 3) {
                    this.field780 = arg1.method557(262);
                } else if (var3 == 12) {
                    this.field754 = arg1.method550();
                } else if (var3 == 13) {
                    this.field743 = arg1.method551();
                } else if (var3 == 14) {
                    this.field762 = arg1.method551();
                } else if (var3 == 17) {
                    this.field762 = arg1.method551();
                    this.field770 = arg1.method551();
                    this.field746 = arg1.method551();
                    this.field763 = arg1.method551();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field750 == null) {
                        this.field750 = new String[5];
                    }
                    this.field750[var3 - 30] = arg1.method556();
                    if (this.field750[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field750[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method549();
                    this.field749 = new int[var6];
                    this.field755 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field749[var7] = arg1.method551();
                        this.field755[var7] = arg1.method551();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method549();
                    this.field747 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field747[var9] = arg1.method551();
                    }
                } else if (var3 == 90) {
                    this.field751 = arg1.method551();
                } else if (var3 == 91) {
                    this.field761 = arg1.method551();
                } else if (var3 == 92) {
                    this.field774 = arg1.method551();
                } else if (var3 == 93) {
                    this.field752 = false;
                } else if (var3 == 95) {
                    this.field776 = arg1.method551();
                } else if (var3 == 97) {
                    this.field768 = arg1.method551();
                } else if (var3 == 98) {
                    this.field771 = arg1.method551();
                } else if (var3 == 99) {
                    this.field760 = true;
                } else if (var3 == 100) {
                    this.field773 = arg1.method550();
                } else if (var3 == 101) {
                    this.field744 = arg1.method550() * 5;
                } else if (var3 == 102) {
                    this.field782 = arg1.method551();
                } else if (var3 == 103) {
                    this.field759 = arg1.method551();
                } else if (var3 == 106) {
                    this.field756 = arg1.method551();
                    if (this.field756 == 65535) {
                        this.field756 = -1;
                    }
                    this.field779 = arg1.method551();
                    if (this.field779 == 65535) {
                        this.field779 = -1;
                    }
                    int var10 = arg1.method549();
                    this.field772 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field772[var11] = arg1.method551();
                        if (this.field772[var11] == 65535) {
                            this.field772[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field757 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "(LOTSGNSQM;)V")
    public static final void method204(class41 arg0) {
        field781 = new class68(arg0.method376("npc.dat", null), -103);
        class68 var1 = new class68(arg0.method376("npc.idx", null), -103);
        field767 = var1.method551();
        field765 = new int[field767];
        int var2 = 2;
        for (int var3 = 0; var3 < field767; var3++) {
            field765[var3] = var2;
            var2 += var1.method551();
        }
        field764 = new class19[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field764[var4] = new class19();
        }
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "(B)LOIBEFFXI;")
    public final class39 method205(byte arg0) {
        if (this.field758 != arg0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (this.field772 != null) {
            class19 var3 = this.method206(false);
            return var3 == null ? null : var3.method205((byte) 7);
        } else if (this.field747 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field747.length; var5++) {
                if (!class39.method347(this.field747[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class39[] var6 = new class39[this.field747.length];
            for (int var7 = 0; var7 < this.field747.length; var7++) {
                var6[var7] = class39.method346(true, this.field747[var7]);
            }
            class39 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class39(var6, (byte) 0, var6.length);
            }
            if (this.field749 != null) {
                for (int var9 = 0; var9 < this.field749.length; var9++) {
                    var8.method360(this.field749[var9], this.field755[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "(Z)LFKIKYVJJ;")
    public final class19 method206(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field756 != -1) {
            class50 var3 = class50.field1300[this.field756];
            int var4 = var3.field1302;
            int var5 = var3.field1303;
            int var6 = var3.field1304;
            int var7 = client.field421[var6 - var5];
            var2 = field748.field631[var4] >> var5 & var7;
        } else if (this.field779 != -1) {
            var2 = field748.field631[this.field779];
        }
        return var2 < 0 || var2 >= this.field772.length || this.field772[var2] == -1 ? null : method202(this.field772[var2]);
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "b", descriptor = "(Z)V")
    public static final void method207(boolean arg0) {
        field745 = null;
        field765 = null;
        field764 = null;
        field781 = null;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "FKIKYVJJ", name = "a", descriptor = "([IIII)LOIBEFFXI;")
    public final class39 method208(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else if (this.field772 == null) {
            class39 var6 = (class39) field745.method227(this.field778);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field769.length; var8++) {
                    if (!class39.method347(this.field769[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class39[] var9 = new class39[this.field769.length];
                for (int var10 = 0; var10 < this.field769.length; var10++) {
                    var9[var10] = class39.method346(true, this.field769[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class39(var9, (byte) 0, var9.length);
                }
                if (this.field749 != null) {
                    for (int var11 = 0; var11 < this.field749.length; var11++) {
                        var6.method360(this.field749[var11], this.field755[var11]);
                    }
                }
                var6.method353(10544);
                var6.method363(this.field773 + 64, this.field744 + 850, -30, -50, -30, true);
                field745.method228(0, var6, this.field778);
            }
            class39 var12 = class39.field1101;
            var12.method348((byte) 9, class55.method455(true, arg1) & class55.method455(true, arg3), var6);
            if (arg1 != -1 && arg3 != -1) {
                var12.method355(arg0, arg1, true, arg3);
            } else if (arg1 != -1) {
                var12.method354(arg1, this.field753);
            }
            if (this.field768 != 128 || this.field771 != 128) {
                var12.method362((byte) 7, this.field771, this.field768, this.field768);
            }
            var12.method350((byte) -85);
            var12.field1138 = null;
            var12.field1137 = null;
            if (this.field754 == 1) {
                var12.field1139 = true;
            }
            return var12;
        } else {
            class19 var5 = this.method206(false);
            return var5 == null ? null : var5.method208(arg0, arg1, -837, arg3);
        }
    }
}
