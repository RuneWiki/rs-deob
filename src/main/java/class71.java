import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class71 extends class273 {

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    private int field1060 = 2000;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    private int field1059 = 16;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    private int field1070 = 0;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    private int field1066 = 0;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    private int field1075 = 4096;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "[Z")
    public static boolean[] field1057 = new boolean[100];

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field1063 = 20;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "[C")
    public static char[] field1062 = new char[128];

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "Z")
    public static boolean field1064 = false;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field1076 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field1068 = 1;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1058 = "";

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 5)
    public static final String method509(long arg0, int arg1) {
        class123.field1929.setTime(new Date(arg0));
        int var3 = class123.field1929.get(7);
        field1071++;
        int var4 = class123.field1929.get(5);
        int var5 = class123.field1929.get(arg1);
        int var6 = class123.field1929.get(1);
        int var7 = class123.field1929.get(11);
        int var8 = class123.field1929.get(12);
        int var9 = class123.field1929.get(13);
        return class177.field2700[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class291.field4499[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljh;I)Ljava/lang/String;", line = 28)
    public static final String method510(class207 arg0, int arg1) {
        field1069++;
        if (client.method888(arg0).method733(-162680420) == 0) {
            return null;
        } else if (arg0.field3146 == null || arg0.field3146.trim().length() == 0) {
            return class269.field4149 ? "Hidden-use" : null;
        } else {
            if (arg1 >= -23) {
                method514(-32);
            }
            return arg0.field3146;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)Lsg;", line = 52)
    public static final class298 method511(int arg0, int arg1) {
        field1074++;
        class298 var2 = (class298) class132.field2070.method1294((long) arg0, 118);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 10) {
            field1063 = 124;
        }
        byte[] var3 = class264.field4067.method2103(0, class338.method2342(80, arg0), class289.method1887(58, arg0));
        class298 var4 = new class298();
        var4.field4606 = arg0;
        if (var3 != null) {
            var4.method1952((byte) 88, new class303(var3));
        }
        var4.method1958(true);
        class132.field2070.method1292((long) arg0, arg1 + 107, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[Lqa;)V", line = 82)
    public static final void method512(int arg0, class217[] arg1) {
        class136.field2118[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILgn;)V", line = 91)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 <= 27) {
            method514(53);
        }
        if (arg1 == 0) {
            this.field1070 = arg2.method2043((byte) -127);
        } else if (arg1 == 1) {
            this.field1060 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field1059 = arg2.method2043((byte) -121);
        } else if (arg1 == 3) {
            this.field1066 = arg2.method1994(false);
        } else if (arg1 == 4) {
            this.field1075 = arg2.method1994(false);
        }
        field1056++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I", line = 154)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            this.field1070 = 79;
        }
        field1073++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int var4 = this.field1075 >> 1;
            int[][] var5 = this.field4204.method368(20378);
            Random var6 = new Random((long) this.field1070);
            for (int var7 = 0; var7 < this.field1060; var7++) {
                int var8 = this.field1075 > 0 ? this.field1066 + class7.method39((byte) 57, var6, this.field1075) - var4 : this.field1066;
                int var9 = class7.method39((byte) 57, var6, class27.field346);
                int var10 = var8 >> 4 & 0xFF;
                int var11 = class7.method39((byte) 57, var6, class99.field1533);
                int var12 = var9 + (class125.field1958[var10] * this.field1059 >> 12);
                int var13 = (class159.field2477[var10] * this.field1059 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var9 = var12;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var13 - var11;
                    int var23 = 1024 - (class7.method39((byte) 57, var6, 4096) >> 2);
                    int var24 = var11 < var13 ? 1 : -1;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var25 = var12 - var9;
                    int var26 = -var25 / 2;
                    int var27 = 2048 / var25;
                    for (int var28 = var9; var28 < var12; var28++) {
                        int var29 = var21 & class117.field1819;
                        var26 += var22;
                        int var30 = class197.field2963 & var28;
                        if (var26 > 0) {
                            var26 += -var25;
                            var21 -= -var24;
                        }
                        int var31 = (var28 - var9) * var27 + var23 + 1024;
                        if (var16) {
                            var5[var29][var30] = var31;
                        } else {
                            var5[var30][var29] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)V", line = 287)
    public static final void method513(int arg0, byte arg1) {
        field1061++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class194.field2930 += arg0 * 128;
        if (class231.field3730.length < class194.field2930) {
            class194.field2930 -= class231.field3730.length;
            int var3 = (int) (Math.random() * 12.0D);
            class198.method1338((byte) -18, class30.field371[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class237.field3801[var4 + var5] - (class231.field3730[class231.field3730.length - 1 & class194.field2930 + var4] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class237.field3801[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class237.field3801[var10 + var11] = 255;
                } else {
                    class237.field3801[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg0); var13++) {
            class96.field1476[var13] = class96.field1476[arg0 + var13];
        }
        int var14 = var2 - arg0;
        if (arg1 > -85) {
            method510((class207) null, -24);
        }
        while (var14 < var2) {
            class96.field1476[var14] = (int) (Math.sin((double) class70.field1055 / 14.0D) * 16.0D + Math.sin((double) class70.field1055 / 15.0D) * 14.0D + Math.sin((double) class70.field1055 / 16.0D) * 12.0D);
            class70.field1055++;
            var14++;
        }
        class285.field4372 += arg0;
        int var15 = ((class343.field5341 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class285.field4372; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class237.field3801[(var18 << 7) + var17] = 192;
        }
        class285.field4372 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var20 += class237.field3801[var22 + var21 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class237.field3801[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class172.field2613[var22 + var21] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class172.field2613[var15 * 128 + (var23 + var26)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class172.field2613[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class237.field3801[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 468)
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 474)
    public final void method349(int arg0) {
        class27.method207((byte) 114);
        if (arg0 != 1) {
            this.field1075 = 32;
        }
        field1067++;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V", line = 498)
    public static void method514(int arg0) {
        field1076 = null;
        if (arg0 == -17226) {
            field1062 = null;
            field1058 = null;
            field1057 = null;
        }
    }
}
