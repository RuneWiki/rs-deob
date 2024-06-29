import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class288 extends class114 {

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    private int field4603 = -1;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4601 = "Face here";

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Z")
    public static boolean field4598 = true;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "[I")
    public static int[] field4608 = new int[32];

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Lmh;")
    public static class64 field4599;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "[I")
    public int[] field4607;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "[Lnk;")
    public static class185[] field4590;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public static final void method1923(byte arg0) {
        ++field4596;
        if (arg0 >= -10) {
            field4593 = -111;
        }
        if (class197.field3023 == null || class134.field1843 == null) {
            class197.field3023 = new int[256];
            class134.field1843 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class197.field3023[var1] = (int) (Math.sin(var2) * 4096.0D);
                class134.field1843[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
    public static final void method1924(boolean arg0) {
        ++field4609;
        if (arg0) {
            field4610 = 72;
        }
        for (class309 var1 = (class309) class153.field2128.method369((byte) -98); var1 != null; var1 = (class309) class153.field2128.method362(false)) {
            if (var1.field4962) {
                var1.method2100(true);
            }
        }
        for (class309 var2 = (class309) class75.field1056.method369((byte) -112); var2 != null; var2 = (class309) class75.field1056.method362(arg0)) {
            if (var2.field4962) {
                var2.method2100(true);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
    public final int method728(boolean arg0) {
        if (!arg0) {
            return 38;
        } else {
            ++field4592;
            return this.field4603;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class288() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)Z")
    public final boolean method1925(byte arg0) {
        ++field4604;
        if (this.field4607 != null) {
            return true;
        } else if (~this.field4603 <= -1) {
            class203 var2 = class120.field1715 >= 0 ? class280.method1816(class120.field1715, this.field4603, class171.field2444, 0) : class307.method2088(class171.field2444, 5, this.field4603);
            var2.method1266();
            this.field4607 = var2.field3058;
            this.field4602 = var2.field1543;
            this.field4589 = var2.field1540;
            return true;
        } else {
            return arg0 >= -85;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[[I")
    public int[][] method73(byte arg0, int arg1) {
        ++field4605;
        int[][] var3 = super.field1627.method104(arg1, (byte) 125);
        if (super.field1627.field280 && this.method1925((byte) -101)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class263.field4216 != this.field4602 ? this.field4602 * arg1 / class263.field4216 : arg1) * this.field4589;
            if (class145.field2009 == this.field4589) {
                for (int var8 = 0; ~var8 > ~class145.field2009; ++var8) {
                    int var9 = this.field4607[var7++];
                    var6[var8] = class32.method199(var9 << 4, 4080);
                    var5[var8] = class32.method199(65280, var9) >> 4;
                    var4[var8] = class32.method199(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class145.field2009 > var10; ++var10) {
                    int var11 = this.field4589 * var10 / class145.field2009;
                    int var12 = this.field4607[var7 + var11];
                    var6[var10] = class32.method199(4080, var12 << 4);
                    var5[var10] = class32.method199(var12 >> 4, 4080);
                    var4[var10] = class32.method199(16711680, var12) >> 12;
                }
            }
        }
        return arg0 != -112 ? null : var3;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V")
    public static final void method1926(int arg0, int arg1) {
        ++field4591;
        if (arg1 == 4096) {
            if (class14.field226 == null || class14.field226.length < arg0) {
                class14.field226 = new int[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4590 = null;
        if (arg0 != 0) {
            field4590 = null;
        }
        field4599 = null;
        field4608 = null;
        field4601 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1928(byte arg0, Component arg1) {
        if (arg0 <= -98) {
            arg1.addMouseListener(class96.field1379);
            ++field4595;
            arg1.addMouseMotionListener(class96.field1379);
            arg1.addFocusListener(class96.field1379);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public final void method732(boolean arg0) {
        ++field4594;
        if (arg0) {
            this.field4603 = -55;
        }
        super.method732(arg0);
        this.field4607 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 == 12953) {
            ++field4588;
            if (arg1 == 0) {
                this.field4603 = arg0.method1379(-79);
            }
        }
    }
}
