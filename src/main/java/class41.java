import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class41 extends class101 {

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Ltg;")
    public class184 field760 = class154.field2753;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "S")
    public short field762 = 0;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    private int field764 = 128;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public int field761 = -1;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "[Ltg;")
    public class184[] field767 = new class184[5];

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public int field769 = -1;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Z")
    public boolean field759 = false;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    private int field772 = 128;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field765 = -1;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
    public int field781 = -1;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    public int field784 = 1;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Z")
    public boolean field777 = true;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
    public boolean field770 = true;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "S")
    public short field787 = 0;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
    private int field786 = -1;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "I")
    private int field789 = 0;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Z")
    public boolean field779 = true;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public int field783 = -1;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public int field778 = 32;

    @OriginalMember(owner = "client!ea", name = "nb", descriptor = "I")
    public int field794 = -1;

    @OriginalMember(owner = "client!ea", name = "ob", descriptor = "I")
    public int field795 = -1;

    @OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
    public int field793 = -1;

    @OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
    public int field797 = -1;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Ltg;")
    public static class184 field782 = class135.method812("(Y", 3);

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Ltg;")
    public static class184 field763 = class135.method812("Lade Wordpack )2 ", 3);

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!ea", name = "pb", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ea", name = "sb", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
    private int[] field776;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "[I")
    public int[] field785;

    @OriginalMember(owner = "client!ea", name = "rb", descriptor = "[I")
    private int[] field798;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "[S")
    private short[] field755;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[S")
    private short[] field757;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "[S")
    private short[] field758;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "[S")
    private short[] field771;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILub;Lub;I)Loh;")
    public final class140 method232(byte arg0, int arg1, class188 arg2, class188 arg3, int arg4) {
        field773++;
        if (this.field785 != null) {
            class41 var6 = this.method240(-27284);
            return var6 == null ? null : var6.method232((byte) -120, arg1, arg2, arg3, arg4);
        }
        class140 var7 = (class140) class51.field938.method773((long) this.field792, 1);
        if (arg0 != -120) {
            field763 = null;
        }
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field798.length; var9++) {
                if (!class12.field213.method1251(0, this.field798[var9], 23947)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class181[] var10 = new class181[this.field798.length];
            for (int var11 = 0; var11 < this.field798.length; var11++) {
                var10[var11] = class181.method1124(class12.field213, this.field798[var11], 0);
            }
            class181 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class181(var10, var10.length);
            }
            if (this.field771 != null) {
                for (int var13 = 0; var13 < this.field771.length; var13++) {
                    var12.method1109(this.field771[var13], this.field757[var13]);
                }
            }
            if (this.field755 != null) {
                for (int var14 = 0; var14 < this.field755.length; var14++) {
                    var12.method1113(this.field755[var14], this.field758[var14]);
                }
            }
            var7 = var12.method1102(this.field791 + 64, this.field789 + 850, -30, -50, -30, true, true);
            class51.field938.method776(var7, (long) this.field792, (byte) -105);
        }
        class140 var15;
        if (arg3 != null && arg2 != null) {
            var15 = arg3.method1196(-65536, var7, arg1, arg4, arg2);
        } else if (arg3 != null) {
            var15 = arg3.method1184((byte) -73, arg1, var7);
        } else if (arg2 == null) {
            var15 = var7.method546(true);
        } else {
            var15 = arg2.method1184((byte) -59, arg4, var7);
        }
        if (this.field764 != 128 || this.field772 != 128) {
            var15.method868(this.field764, this.field772, this.field764);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Z")
    public final boolean method233(boolean arg0) {
        field775++;
        if (this.field785 == null) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            int var2 = -1;
            if (this.field786 != -1) {
                var2 = class116.method710(0, this.field786);
            } else if (this.field765 != -1) {
                var2 = class94.field1710[this.field765];
            }
            return var2 >= 0 && var2 < this.field785.length && this.field785[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lka;B)V")
    public final void method234(class97 arg0, byte arg1) {
        field780++;
        if (arg1 >= -81) {
            this.field783 = -24;
        }
        while (true) {
            int var3 = arg0.method588((byte) -38);
            if (var3 == 0) {
                return;
            }
            this.method235(var3, (byte) -34, arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLka;)V")
    private final void method235(int arg0, byte arg1, class97 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method588((byte) -126);
            this.field798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field798[var5] = arg2.method611(false);
            }
        } else if (arg0 == 2) {
            this.field760 = arg2.method596(-1);
        } else if (arg0 == 12) {
            this.field784 = arg2.method588((byte) -51);
        } else if (arg0 == 13) {
            this.field795 = arg2.method611(false);
        } else if (arg0 == 14) {
            this.field769 = arg2.method611(false);
        } else if (arg0 == 15) {
            this.field781 = arg2.method611(false);
        } else if (arg0 == 16) {
            this.field774 = arg2.method611(false);
        } else if (arg0 == 17) {
            this.field769 = arg2.method611(false);
            this.field794 = arg2.method611(false);
            this.field761 = arg2.method611(false);
            this.field797 = arg2.method611(false);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field767[arg0 - 30] = arg2.method596(class51.method283(arg1, 33));
            if (this.field767[arg0 - 30].method1150(class146.field2635, arg1 ^ 0x44)) {
                this.field767[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var6 = arg2.method588((byte) -83);
            this.field771 = new short[var6];
            this.field757 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field771[var7] = (short) arg2.method611(false);
                this.field757[var7] = (short) arg2.method611(false);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method588((byte) -29);
            this.field758 = new short[var8];
            this.field755 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field755[var9] = (short) arg2.method611(false);
                this.field758[var9] = (short) arg2.method611(false);
            }
        } else if (arg0 == 60) {
            int var12 = arg2.method588((byte) -78);
            this.field776 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field776[var13] = arg2.method611(false);
            }
        } else if (arg0 == 93) {
            this.field777 = false;
        } else if (arg0 == 95) {
            this.field793 = arg2.method611(false);
        } else if (arg0 == 97) {
            this.field764 = arg2.method611(false);
        } else if (arg0 == 98) {
            this.field772 = arg2.method611(false);
        } else if (arg0 == 99) {
            this.field759 = true;
        } else if (arg0 == 100) {
            this.field791 = arg2.method591(65280);
        } else if (arg0 == 101) {
            this.field789 = arg2.method591(arg1 ^ 0xFFFF00DE) * 5;
        } else if (arg0 == 102) {
            this.field783 = arg2.method611(false);
        } else if (arg0 == 103) {
            this.field778 = arg2.method611(false);
        } else if (arg0 == 106) {
            this.field786 = arg2.method611(false);
            if (this.field786 == 65535) {
                this.field786 = -1;
            }
            this.field765 = arg2.method611(false);
            if (this.field765 == 65535) {
                this.field765 = -1;
            }
            int var10 = arg2.method588((byte) -49);
            this.field785 = new int[var10 + 1];
            for (int var11 = 0; var11 <= var10; var11++) {
                this.field785[var11] = arg2.method611(false);
                if (this.field785[var11] == 65535) {
                    this.field785[var11] = -1;
                }
            }
        } else if (arg0 == 107) {
            this.field779 = false;
        } else if (arg0 == 109) {
            this.field770 = false;
        } else if (arg0 != 111) {
            if (arg0 == 113) {
                arg2.method611(false);
                arg2.method611(false);
            } else if (arg0 == 114) {
                arg2.method591(65280);
                arg2.method591(65280);
            } else if (arg0 == 115) {
                this.field787 = (short) (arg2.method588((byte) -32) * 4);
                this.field762 = (short) (arg2.method588((byte) -102) * 4);
            }
        }
        if (arg1 != -34) {
            this.field776 = null;
        }
        field788++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILub;)Loh;")
    public final class140 method236(boolean arg0, int arg1, class188 arg2) {
        if (!arg0) {
            return null;
        }
        field756++;
        if (this.field785 != null) {
            class41 var4 = this.method240(-27284);
            return var4 == null ? null : var4.method236(true, arg1, arg2);
        } else if (this.field776 == null) {
            return null;
        } else {
            class140 var5 = (class140) class201.field3886.method773((long) this.field792, 1);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field776.length; var7++) {
                    if (!class12.field213.method1251(0, this.field776[var7], 23947)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class181[] var8 = new class181[this.field776.length];
                for (int var9 = 0; var9 < this.field776.length; var9++) {
                    var8[var9] = class181.method1124(class12.field213, this.field776[var9], 0);
                }
                class181 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class181(var8, var8.length);
                }
                if (this.field771 != null) {
                    for (int var11 = 0; var11 < this.field771.length; var11++) {
                        var10.method1109(this.field771[var11], this.field757[var11]);
                    }
                }
                if (this.field755 != null) {
                    for (int var12 = 0; var12 < this.field755.length; var12++) {
                        var10.method1113(this.field755[var12], this.field758[var12]);
                    }
                }
                var5 = var10.method1102(64, 768, -50, -10, -50, true, true);
                class201.field3886.method776(var5, (long) this.field792, (byte) 96);
            }
            if (arg2 != null) {
                var5 = arg2.method1186(var5, arg1, 9999999);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static void method237(byte arg0) {
        if (arg0 != 75) {
            field782 = null;
        }
        field763 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Ltg;")
    public static final class184 method238(int arg0, byte arg1) {
        field796++;
        int var2 = 63 % ((arg1 + 61) / 63);
        return class144.method884(0, new class184[] { class170.method1060(arg0 >> 24 & 0xFF, -117), class141.field2560, class170.method1060(arg0 >> 16 & 0xFF, -108), class141.field2560, class170.method1060(arg0 >> 8 & 0xFF, -125), class141.field2560, class170.method1060(arg0 & 0xFF, -101) });
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final void method239(int arg0) {
        if (arg0 == -6824) {
            field799++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lea;")
    public final class41 method240(int arg0) {
        field766++;
        if (arg0 != -27284) {
            this.field767 = null;
        }
        int var2 = -1;
        if (this.field786 != -1) {
            var2 = class116.method710(0, this.field786);
        } else if (this.field765 != -1) {
            var2 = class94.field1710[this.field765];
        }
        return var2 < 0 || this.field785.length <= var2 || this.field785[var2] == -1 ? null : class194.method1233(this.field785[var2], arg0 ^ 0xFFFFE8E5);
    }
}
