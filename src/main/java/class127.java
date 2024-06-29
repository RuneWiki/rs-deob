import java.awt.Container;
import java.awt.Insets;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class127 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 3)
    public static final void method906(byte arg0) {
        field1839++;
        for (int var1 = 0; var1 < class380.field5732; var1++) {
            class268 var2 = class141.field2038[var1];
            if (var2.field3495 == 3) {
                if (var2.field3508 == null) {
                    var2.field3511 = Integer.MIN_VALUE;
                } else {
                    class556.field8166.method2205(var2.field3508);
                }
            }
        }
        if (arg0 <= 114) {
            method912(-16);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V", line = 36)
    public static final void method907(byte arg0) {
        field1840++;
        if (class391.field5908 != null) {
            return;
        }
        class391.field5908 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        if (arg0 > -6) {
            method911(116);
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3BF) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class391.field5908[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V", line = 150)
    public class127(int arg0) {
        this.field1838 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBIIZ)V", line = 159)
    public static final void method908(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        if (class348.field5160 != null && (arg1 != 3 || class335.field4872.field9505 != arg4 || class335.field4872.field9490 != arg0)) {
            class683.method3826(class348.field5160, 10, class61.field978);
            class348.field5160 = null;
        }
        field1841++;
        if (arg1 == 3 && class348.field5160 == null) {
            class348.field5160 = class169.method1181(0, class61.field978, arg4, 0, arg0, (byte) -109);
            if (class348.field5160 != null) {
                class335.field4872.field9505 = arg4;
                class335.field4872.field9490 = arg0;
                class335.field4872.method3442(class61.field978, 106);
            }
        }
        if (arg1 == 3 && class348.field5160 == null) {
            method908(-1, class335.field4872.field9474, (byte) 28, arg3, -1, true);
            return;
        }
        Container var6;
        if (class348.field5160 != null) {
            class173.field2443 = arg4;
            class300.field4447 = arg0;
            var6 = class348.field5160;
        } else if (class388.field5808 == null) {
            if (class551.field8116 == null) {
                var6 = class679.field9602;
            } else {
                var6 = class551.field8116;
            }
            class173.field2443 = var6.getSize().width;
            class300.field4447 = var6.getSize().height;
        } else {
            Insets var7 = class388.field5808.getInsets();
            int var10001 = var7.right + var7.left;
            class173.field2443 = class388.field5808.getSize().width - var10001;
            class300.field4447 = class388.field5808.getSize().height - var7.bottom - var7.top;
            var6 = class388.field5808;
        }
        if (arg1 == 1) {
            class454.field6538 = class677.field9591;
            class356.field5273 = 0;
            class425.field6218 = class619.field8966;
            class189.field2573 = (class173.field2443 - class677.field9591) / 2;
        } else {
            class487.method2784(0);
        }
        if (class280.field3708 != class215.field2882) {
            boolean var10000;
            if (class454.field6538 < 1024 && class425.field6218 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class106.method749(255);
        } else {
            class410.field6110.setSize(class454.field6538, class425.field6218);
            class332.field4821.method641(class410.field6110);
            if (class388.field5808 == var6) {
                Insets var8 = class388.field5808.getInsets();
                class410.field6110.setLocation(var8.left + class189.field2573, class356.field5273 + var8.top);
            } else {
                class410.field6110.setLocation(class189.field2573, class356.field5273);
            }
        }
        if (arg1 < 2) {
            class63.field1000 = false;
        } else {
            class63.field1000 = true;
        }
        if (class567.field8270 != -1) {
            class537.method3101(true, 3531);
        }
        if (class230.field3051 != null && class515.method2903(class264.field3451, -13)) {
            class392.method2431(1698664816);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class394.field5969[var9] = true;
        }
        if (arg2 > 14) {
            class471.field6786 = true;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IJII)V", line = 290)
    public static final void method909(int arg0, long arg1, int arg2, int arg3) {
        field1844++;
        if (arg3 != 1214441056) {
            return;
        }
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class151.method1077(0, var5, 0, (byte) -124, arg0, 0, true, var6, arg2);
            return;
        }
        class289 var8 = class60.field965.method2596(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field4269;
            var9 = var8.field4197;
        } else {
            var9 = var8.field4269;
            var10 = var8.field4197;
        }
        int var11 = var8.field4235;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class151.method1077(var11, 0, var9, (byte) -119, arg0, var10, true, 0, arg2);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 339)
    public static final boolean method910(String arg0, int arg1, int arg2) {
        if (arg1 >= -55) {
            method907((byte) -30);
        }
        field1837++;
        if (class61.field978.field3004) {
            class684.field9654 = new class102();
            class684.field9654.field1527 = arg0;
            class684.field9654.field1522 = arg2;
            if (class280.field3708 != class215.field2882) {
                class684.field9654.field1526 = class684.field9654.field1522 + 40000;
                class684.field9654.field1528 = class684.field9654.field1522 + 50000;
            }
            if (arg2 < class568.field8284.length && class568.field8284[arg2] != null) {
                class605.field8743 = class568.field8284[arg2].field5368;
            }
            return true;
        }
        String var3 = "";
        if (class280.field3708 != class215.field2882) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class433.field6283 != null) {
            var4 = "/p=" + class433.field6283;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class262.field3401 + "/a=" + class122.field1815 + var4 + "/j" + (class295.field4357 ? "1" : "0") + ",o" + (class517.field7256 ? "1" : "0") + ",a2";
        try {
            class420.field6187.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 386)
    public static final void method911(int arg0) {
        class338.field4915 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 389)
    public static final void method912(int arg0) {
        if (class492.field7004 == null) {
            class497 var1 = new class497();
            byte[] var2 = var1.method2835((byte) -113, 128, 16, 128);
            class492.field7004 = class600.method3414(var2, false, true);
        }
        field1842++;
        if (arg0 == 0 && class684.field9644 == null) {
            class325 var3 = new class325();
            byte[] var4 = var3.method2011(128, -11320, 128, 16);
            class684.field9644 = class600.method3414(var4, false, true);
        }
    }

    @OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;", line = 420)
    public final String toString() {
        field1843++;
        throw new IllegalStateException();
    }
}
