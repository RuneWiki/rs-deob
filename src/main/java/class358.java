import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class358 extends class371 {

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    private int field5195 = 4096;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "Z")
    private boolean field5198 = true;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "[I")
    public static int[] field5197 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "[I")
    public static int[] field5201;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -84 % ((-15 - arg1) / 39);
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field5198 = ~arg2.method2561((byte) 118) == -2;
            }
        } else {
            this.field5195 = arg2.method2620(85);
        }
        ++field5204;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field5203;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (arg0 != 36) {
            field5197 = null;
        }
        if (super.field5364.field7632) {
            int[] var4 = this.method2260((byte) -48, arg1 + -1 & class135.field1789, 0);
            int[] var5 = this.method2260((byte) -83, arg1, 0);
            int[] var6 = this.method2260((byte) -79, class135.field1789 & arg1 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class41.field455; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field5195;
                int var12 = (var5[var10 + 1 & class343.field5013] + -var5[class343.field5013 & var10 + -1]) * this.field5195;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field5198) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2199(String arg0, int arg1) {
        ++field5202;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var8 = arg0.charAt(var4);
            if (~var8 == -61 || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var2 > var6; ++var6) {
            char var7 = arg0.charAt(var6);
            if (~var7 == -61) {
                var5.append("<lt>");
            } else if (var7 != '>') {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
        }
        if (arg1 != -61) {
            field5197 = null;
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class358() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V")
    public static void method2200(int arg0) {
        field5201 = null;
        field5197 = null;
        if (arg0 != 16777216) {
            method2200(-15);
        }
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Z")
    public static final boolean method2201(int arg0) {
        if (arg0 != 0) {
            field5197 = null;
        }
        ++field5199;
        try {
            return class361.method2215(16383);
        } catch (IOException var4) {
            class561.method3283((byte) 125);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class260.field3820 == null ? -1 : class260.field3820.method3421(arg0 + 28888)) + "," + (class135.field1794 == null ? -1 : class135.field1794.method3421(arg0 + 28888)) + "," + (class127.field1686 != null ? class127.field1686.method3421(28888) : -1) + " - " + class425.field6072 + "," + (class239.field3493.field1090[0] + class584.field8677) + "," + (class239.field3493.field1089[0] + class424.field6061) + " - ";
            for (int var3 = 0; var3 < class425.field6072 && var3 < 50; ++var3) {
                var2 = var2 + class271.field4010.field6162[var3] + ",";
            }
            class31.method140(var2, arg0 + -120, var5);
            class550.method3221(0, false);
            return true;
        }
    }
}
