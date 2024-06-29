import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class271 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field4867 = 0;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    private int field4870 = -1;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lgk;")
    private class157 field4880 = new class157();

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Z")
    public boolean field4887 = false;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    private int field4881;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[[I")
    private int[][] field4886;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[Llc;")
    private class84[] field4877;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field4876 = 0;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lid;")
    public static class149 field4878 = class60.method382("blinken1:", (byte) 105);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lhf;")
    public static class137[] field4866 = new class137[14];

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[[B")
    public static byte[][] field4882 = new byte[250][];

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Lve;")
    public static class189 field4879 = new class189(4);

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Lbi;")
    public static class92 field4883 = new class92();

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Lid;")
    private static class149 field4884 = class60.method382("Your ignore list is full)3 Max of 100 users)3", (byte) 86);

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lid;")
    public static class149 field4885 = field4884;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lej;")
    public static class50 field4868;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)[I")
    public final int[] method1879(int arg0, boolean arg1) {
        field4869++;
        if (!arg1) {
            this.field4880 = null;
        }
        if (this.field4881 == this.field4871) {
            this.field4887 = this.field4877[arg0] == null;
            this.field4877[arg0] = class66.field1167;
            return this.field4886[arg0];
        } else if (this.field4881 == 1) {
            this.field4887 = this.field4870 != arg0;
            this.field4870 = arg0;
            return this.field4886[0];
        } else {
            class84 var3 = this.field4877[arg0];
            if (var3 == null) {
                this.field4887 = true;
                if (this.field4867 < this.field4881) {
                    var3 = new class84(arg0, this.field4867);
                    this.field4867++;
                } else {
                    class84 var4 = (class84) this.field4880.method1128((byte) -114);
                    var3 = new class84(arg0, var4.field1530);
                    this.field4877[var4.field1532] = null;
                    var4.method401((byte) -118);
                }
                this.field4877[arg0] = var3;
            } else {
                this.field4887 = false;
            }
            this.field4880.method1136(var3, (byte) -128);
            return this.field4886[var3.field1530];
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method1880(int arg0) {
        for (int var2 = arg0; var2 < this.field4881; var2++) {
            this.field4886[var2] = null;
        }
        field4865++;
        this.field4877 = null;
        this.field4886 = null;
        this.field4880.method1132((byte) 126);
        this.field4880 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static final void method1881(byte arg0) {
        class98 var1 = class86.field1570;
        synchronized (class86.field1570) {
            int var2 = 48 / ((-arg0 - 29) / 33);
            class263.field4671 = class264.field4734;
            class49.field883 = class41.field640;
            class285.field5068 = class30.field447;
            class183.field3314++;
            class80.field1487 = class131.field2382;
            class260.field4582 = class183.field3306;
            class159.field2921 = class92.field1634;
            class84.field1533 = class52.field944;
            class131.field2382 = 0;
        }
        field4872++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public static final void method1882(int arg0, int arg1, int arg2) {
        field4875++;
        int var3 = arg0--;
        int var4 = class119.field2032[arg0];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class16.field231[arg0];
        if (arg2 == 0) {
            class98.field1746++;
            class208.field3720.method162(2, 215);
            class208.field3720.method494((byte) 4, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class103.field1807++;
            class208.field3720.method162(2, 39);
            class208.field3720.method494((byte) 4, var3 + var3 + 14 + 3);
        }
        if (~arg2 == arg1) {
            class268.field4778++;
            class208.field3720.method162(2, 77);
            class208.field3720.method494((byte) 4, var3 + var3 + 3);
        }
        class208.field3720.method495(-27699, class131.field2312[82] ? 1 : 0);
        class208.field3720.method518(16711680, class125.field2199 + var5);
        class208.field3720.method504(class115.field1969 + var4, arg1 ^ 0x2FA1);
        class210.field3748 = class16.field231[0];
        class141.field2598 = class119.field2032[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class208.field3720.method495(-27699, class16.field231[arg0] - var5);
            class208.field3720.method493(class119.field2032[arg0] - var4, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)I")
    public static final int method1883(int arg0, int arg1, byte arg2) {
        field4874++;
        if (arg2 >= -81) {
            return 118;
        }
        class19 var3 = (class19) class10.field135.method639((byte) -88, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field286.length) {
            return var3.field286[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1884(int arg0) {
        field4866 = null;
        field4883 = null;
        field4885 = null;
        field4884 = null;
        field4882 = null;
        field4879 = null;
        field4878 = null;
        field4868 = null;
        int var1 = 107 % ((34 - arg0) / 61);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)[[I")
    public final int[][] method1885(byte arg0) {
        field4873++;
        if (arg0 < 33) {
            this.field4881 = 95;
        }
        if (this.field4881 != this.field4871) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4881; var2++) {
            this.field4877[var2] = class66.field1167;
        }
        return this.field4886;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1886(int arg0, int arg1, int arg2, int arg3) {
        if (!class7.method37(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class189.field3393[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class82.field1495) {
                    if (!class272.method1888(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1888(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1888(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1888(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class226.field3971) {
                    if (!class272.method1888(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1888(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1888(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class272.method1888(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class82.field1495) {
                    if (!class272.method1888(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1888(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1888(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class272.method1888(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class226.field3971) {
                    if (!class272.method1888(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1888(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1888(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class272.method1888(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1888(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class272.method1888(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class272.method1888(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class272.method1888(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class272.method1888(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class272.method1888(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V")
    public class271(int arg0, int arg1, int arg2) {
        this.field4881 = arg0;
        this.field4886 = new int[this.field4881][arg2];
        this.field4871 = arg1;
        this.field4877 = new class84[this.field4871];
    }
}
