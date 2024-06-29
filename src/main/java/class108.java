import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class108 extends class261 {

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    private int field1828 = -1;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[Lhf;")
    public static class190[] field1824 = new class190[4];

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lve;")
    public static class255 field1820 = class87.method607(49, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "[I")
    private int[] field1825;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 15)
    public class108() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)V", line = 21)
    public static void method830(byte arg0) {
        field1820 = null;
        if (arg0 < 9) {
            field1820 = (class255) null;
        }
        field1824 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lpb;BI)V", line = 33)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1828 = arg0.method423(255);
        }
        field1822++;
        if (arg1 > -115) {
            this.field1828 = 123;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)Z", line = 47)
    private final boolean method831(boolean arg0) {
        field1823++;
        if (!arg0) {
            this.method831(true);
        }
        if (this.field1825 != null) {
            return true;
        } else if (this.field1828 < 0) {
            return false;
        } else {
            int var2 = class92.field1576;
            int var3 = class210.field3590;
            int var4 = class60.field942.method985(this.field1828, (byte) 119) ? 64 : 128;
            this.field1825 = class60.field942.method984(this.field1828, 118);
            this.field1817 = var4;
            this.field1814 = var4;
            class42.method257(var2, var3, -107);
            return this.field1825 != null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 82)
    public final void method832(boolean arg0) {
        field1815++;
        super.method832(arg0);
        this.field1825 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I", line = 98)
    public final int method833(byte arg0) {
        if (arg0 < 53) {
            method836(false);
        }
        field1827++;
        return this.field1828;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLtl;)V", line = 110)
    public static final void method834(byte arg0, class197 arg1) {
        if (class6.field95 == arg1.field3278) {
            class187.field3008[arg1.field3248] = true;
        }
        if (arg0 != 49) {
            method830((byte) 17);
        }
        field1826++;
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(B)[Lvi;", line = 129)
    public static final class5[] method835(byte arg0) {
        class5[] var1 = new class5[class109.field1850];
        int var2 = -13 / ((arg0 - 58) / 52);
        for (int var3 = 0; var3 < class109.field1850; var3++) {
            if (class281.field4827) {
                var1[var3] = new class263(class153.field2608, class154.field2632, class131.field2167[var3], class298.field5098[var3], class132.field2173[var3], class187.field3027[var3], class282.field4849[var3], class18.field296);
            } else {
                var1[var3] = new class273(class153.field2608, class154.field2632, class131.field2167[var3], class298.field5098[var3], class132.field2173[var3], class187.field3027[var3], class282.field4849[var3], class18.field296);
            }
        }
        field1816++;
        class111.method850(-3);
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(Z)V", line = 156)
    public static final void method836(boolean arg0) {
        field1818++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class186.field3003; var1++) {
            class102 var2 = class2.method10(var1, 16);
            if (var2 != null && var2.field1721 == 0) {
                class93.field1601[var1] = 0;
                class76.field1246[var1] = 0;
            }
        }
        class252.field4244 = new class47(16);
    }

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "(B)V", line = 187)
    public static final void method837(byte arg0) {
        field1819++;
        if (arg0 != -111) {
            return;
        }
        int var1 = class277.field4761.method498(class196.field3225);
        for (int var2 = 0; var2 < class136.field2272; var2++) {
            int var3 = class277.field4761.method498(class9.method47(true, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class136.field2272 * 15 + 21;
        int var5 = class251.field4239 - (var1 / 2);
        if (class210.field3589 < (var5 + var1)) {
            var5 = class210.field3589 - var1;
        }
        int var6 = class197.field3306;
        if (var5 < 0) {
            var5 = 0;
        }
        if (class201.field3479 < (var6 + var4)) {
            var6 = class201.field3479 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class166.field2795 == 1) {
            if (class9.field126 == class251.field4239 && class197.field3306 == class196.field3236) {
                class184.field2974 = var6;
                class156.field2651 = true;
                class249.field4172 = var5;
                class173.field2864 = var1;
                class148.field2507 = class136.field2272 * 15 + 22;
                class166.field2795 = 0;
            }
        } else if (class251.field4239 == class184.field2973 && class197.field3306 == class115.field1953) {
            class184.field2974 = var6;
            class166.field2795 = 0;
            class173.field2864 = var1;
            class148.field2507 = class136.field2272 * 15 + 22;
            class156.field2651 = true;
            class249.field4172 = var5;
        } else {
            class196.field3236 = class115.field1953;
            class9.field126 = class184.field2973;
            class166.field2795 = 1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)[[I", line = 278)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[][]) ((int[][]) null);
        }
        field1821++;
        int[][] var3 = this.field4418.method35(arg1, 125);
        if (this.field4418.field94 && this.method831(true)) {
            int var4 = (class210.field3590 == this.field1817 ? arg1 : this.field1817 * arg1 / class210.field3590) * this.field1814;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class92.field1576 == this.field1814) {
                for (int var11 = 0; var11 < class92.field1576; var11++) {
                    int var12 = this.field1825[var4++];
                    var6[var11] = class154.method1134(4080, var12 << 4);
                    var7[var11] = class154.method1134(65280, var12) >> 4;
                    var5[var11] = class154.method1134(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class92.field1576; var8++) {
                    int var9 = this.field1814 * var8 / class92.field1576;
                    int var10 = this.field1825[var4 + var9];
                    var6[var8] = class154.method1134(255, var10) << 4;
                    var7[var8] = class154.method1134(4080, var10 >> 4);
                    var5[var8] = class154.method1134(var10 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
