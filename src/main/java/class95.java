import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class95 extends class117 {

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    private int field1529 = -1;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field1538 = 1;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
    private int[] field1524;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method653(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            try {
                class56.field933.getAppletContext().showDocument(new URL(class56.field933.getCodeBase(), arg2), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class297.method1967(false, "loggedout", class268.field4323.field751);
            } catch (Throwable var4) {
            }
            try {
                class56.field933.getAppletContext().showDocument(new URL(class56.field933.getCodeBase(), arg2), "_top");
            } catch (Exception var3) {
            }
        }
        ++field1532;
        if (arg1 != 357801124) {
            method653(false, -40, (String) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)I")
    public final int method654(int arg0) {
        ++field1525;
        if (arg0 != -1) {
            this.field1529 = 126;
        }
        return this.field1529;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public final void method655(byte arg0) {
        ++field1531;
        super.method655((byte) -125);
        this.field1524 = null;
        if (arg0 >= -54) {
            field1539 = -121;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, false);
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "(I)Z")
    private final boolean method656(int arg0) {
        ++field1536;
        if (this.field1524 != null) {
            return true;
        } else {
            int var2 = -4 / ((-16 - arg0) / 43);
            if (this.field1529 >= 0) {
                int var3 = class168.field2737;
                int var4 = class149.field2335;
                int var5 = !class134.field2126.method1034(this.field1529, -1).field1142 ? 128 : 64;
                this.field1524 = class134.field2126.method1033(var5, this.field1529, var5, 1.0F, false, -119);
                this.field1535 = var5;
                this.field1526 = var5;
                class41.method270(var3, 0, var4);
                return this.field1524 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "k", descriptor = "(I)V")
    public static final void method657(int arg0) {
        ++field1533;
        class68 var1 = class177.field2899;
        synchronized (class177.field2899) {
            class163.field2642 = class220.field3600;
            ++class273.field4377;
            class269.field4344 = class225.field3661;
            class77.field1281 = class71.field1201;
            class20.field257 = class285.field4525;
            class309.field4941 = class247.field3929;
            class42.field609 = class137.field2165;
            class304.field4865 = class175.field2871;
            if (arg0 != -13333) {
                method653(true, -54, (String) null);
            }
            class285.field4525 = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = 55 / ((arg1 - 37) / 38);
        ++field1534;
        int[][] var4 = super.field1886.method419(arg0, (byte) -114);
        if (super.field1886.field1022 && this.method656(28)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = this.field1535 * (class149.field2335 != this.field1526 ? this.field1526 * arg0 / class149.field2335 : arg0);
            int[] var8 = var4[2];
            if (class168.field2737 != this.field1535) {
                for (int var9 = 0; var9 < class168.field2737; ++var9) {
                    int var10 = this.field1535 * var9 / class168.field2737;
                    int var11 = this.field1524[var7 - -var10];
                    var8[var9] = class51.method359(255, var11) << 4;
                    var6[var9] = class51.method359(var11 >> 4, 4080);
                    var5[var9] = class51.method359(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; class168.field2737 > var12; ++var12) {
                    int var13 = this.field1524[var7++];
                    var8[var12] = class51.method359(var13, 255) << 4;
                    var6[var12] = class51.method359(65280, var13) >> 4;
                    var5[var12] = class51.method359(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static final void method658(boolean arg0) {
        ++field1528;
        if (arg0) {
            method657(-77);
        }
        class1.field14 = new class155(32);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static final void method659(byte arg0) {
        ++field1527;
        class314.field5061.method828(120, 247);
        ++class123.field1952;
        class314.field5061.method1108(class56.method383(false), true);
        class314.field5061.method1120(class294.field4709, true);
        class314.field5061.method1120(class310.field4964, true);
        class314.field5061.method1108(class265.field4273, true);
        int var1 = 85 % ((30 - arg0) / 58);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            method659((byte) 36);
        }
        ++field1530;
        if (arg2 == 0) {
            this.field1529 = arg0.method1142(-18970);
        }
    }
}
