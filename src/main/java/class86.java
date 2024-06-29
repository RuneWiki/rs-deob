import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class86 extends class113 {

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    private int field1847 = -1;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "Lwg;")
    public static class204 field1850 = new class204(0, 0);

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "Lcd;")
    public static class23 field1854 = class54.method414("Weiter", -1);

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Z")
    public static boolean field1852 = true;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Lla;")
    public static class99 field1853;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method571(byte arg0) {
        field1848++;
        if (arg0 <= 74) {
            field1853 = null;
        }
        for (int var1 = -1; var1 < class57.field1348; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class69.field1622[var1];
            }
            class57 var6 = class95.field2007[var5];
            if (var6 != null && var6.field221 > 0) {
                var6.field221--;
                if (var6.field221 == 0) {
                    var6.field256 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class67.field1583; var2++) {
            int var3 = class8.field161[var2];
            class182 var4 = class91.field1944[var3];
            if (var4 != null && var4.field221 > 0) {
                var4.field221--;
                if (var4.field221 == 0) {
                    var4.field256 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILva;I)V")
    private final void method572(byte arg0, int arg1, class189 arg2, int arg3) {
        int var5 = -4 % ((arg0 - 11) / 62);
        if (arg3 == 1) {
            this.field1842 = arg2.method1177(true);
        } else if (arg3 == 2) {
            this.field1847 = arg2.method1197(-1);
            if (this.field1847 == 65535) {
                this.field1847 = -1;
            }
        }
        field1846++;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method573(int arg0) {
        field1850 = null;
        if (arg0 != 16722911) {
            field1852 = true;
        }
        field1854 = null;
        field1853 = null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
    public static final void method574(byte arg0) {
        if (arg0 > -88) {
            method571((byte) -2);
        }
        field1838++;
        class143.field2929.method997(false);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
    public final void method575(boolean arg0) {
        this.method576(this.field1842, -7588);
        if (arg0) {
            this.method575(true);
        }
        field1843++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    private final void method576(int arg0, int arg1) {
        field1845++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 > var5) {
            var11 = var5;
        }
        if (var3 < var5) {
            var9 = var5;
        }
        if (var7 > var9) {
            var9 = var7;
        }
        if (arg1 != -7588) {
            return;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 + -var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
        }
        this.field1839 = (int) (var17 * 256.0D);
        if (this.field1839 < 0) {
            this.field1839 = 0;
        } else if (this.field1839 > 255) {
            this.field1839 = 255;
        }
        this.field1840 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field1840 < 0) {
            this.field1840 = 0;
        } else if (this.field1840 > 255) {
            this.field1840 = 255;
        }
        if (var17 > 0.5D) {
            this.field1841 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1841 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1841 < 1) {
            this.field1841 = 1;
        }
        this.field1851 = (int) ((double) this.field1841 * var19);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLva;I)V")
    public final void method577(byte arg0, class189 arg1, int arg2) {
        field1849++;
        if (arg0 != -46) {
            this.method572((byte) 95, 104, null, 64);
        }
        while (true) {
            int var4 = arg1.method1202(104);
            if (var4 == 0) {
                return;
            }
            this.method572((byte) 105, arg2, arg1, var4);
        }
    }
}
