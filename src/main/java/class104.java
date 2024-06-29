import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class104 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "[I")
    public int[] field1236 = new int[4];

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[I")
    public int[] field1246 = new int[4];

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
    public int[] field1237 = new int[4];

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "B")
    public byte field1241;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "B")
    public byte field1243;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "S")
    public short field1235;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "S")
    public short field1249;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "S")
    public short field1248;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "[S")
    public short[] field1244;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "S")
    public short field1239;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "[S")
    public short[] field1238;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "[S")
    public short[] field1247;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "[I")
    public static int[] field1234 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "[Loia;")
    public static class88[] field1242;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI[Ljb;)V")
    public static final void method739(byte arg0, int arg1, class493[] arg2) {
        if (arg0 != -70) {
            method739((byte) -57, 41, null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class493 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field7016 == 0) {
                    if (var4.field7009 != null) {
                        method739((byte) -70, arg1, var4.field7009);
                    }
                    class47 var5 = (class47) class475.field6744.method1180((byte) 26, (long) var4.field6956);
                    if (var5 != null) {
                        class118.method821(arg1, -85, var5.field550);
                    }
                }
                if (arg1 == 0 && var4.field7017 != null) {
                    class357 var6 = new class357();
                    var6.field5076 = var4.field7017;
                    var6.field5082 = var4;
                    class241.method1543(var6);
                }
                if (arg1 == 1 && var4.field7048 != null) {
                    if (var4.field6944 >= 0) {
                        class493 var7 = class127.method854((byte) -85, var4.field6956);
                        if (var7 == null || var7.field7009 == null || var7.field7009.length <= var4.field6944 || var7.field7009[var4.field6944] != var4) {
                            continue;
                        }
                    }
                    class357 var8 = new class357();
                    var8.field5076 = var4.field7048;
                    var8.field5082 = var4;
                    class241.method1543(var8);
                }
            }
        }
        field1240++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBLha;IILd;I)V")
    public static final void method740(int arg0, byte arg1, class58 arg2, int arg3, int arg4, class149 arg5, int arg6) {
        field1245++;
        if (class725.field10122 < 100) {
            class55.method352(arg5, arg2, arg1 ^ 0xFFFFFFE8);
        }
        arg2.method469(arg4, arg3, arg4 + arg0, arg3 + arg6);
        if (class725.field10122 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg4;
            int var9 = arg6 / 2 + arg3 - var7 - 18;
            arg2.method431(arg4, arg3, arg0, arg6, -16777216, 0);
            arg2.method445(var8 - 152, var9, 304, 34, class578.field8169[class55.field642].getRGB(), 0);
            arg2.method431(var8 - 150, var9 + 2, class725.field10122 * 3, 30, class709.field9838[class55.field642].getRGB(), 0);
            class505.field7241.method499(var7 + var9, var8, -1, false, class509.field7280[class55.field642].getRGB(), class71.field914.method588((byte) 91, class549.field7669));
            return;
        }
        int var10 = class299.field4217 - (int) ((float) arg0 / class678.field9281);
        int var11 = (int) ((float) arg6 / class678.field9281) + class193.field2580;
        int var12 = (int) ((float) arg0 / class678.field9281) + class299.field4217;
        int var13 = class193.field2580 - ((int) ((float) arg6 / class678.field9281));
        class102.field1215 = class299.field4217 - ((int) ((float) arg0 / class678.field9281));
        class144.field2061 = class193.field2580 - ((int) ((float) arg6 / class678.field9281));
        class739.field10284 = (int) ((float) (arg0 * 2) / class678.field9281);
        class753.field10478 = (int) ((float) (arg6 * 2) / class678.field9281);
        class678.method3786(class678.field9294 + var10, class678.field9304 + var11, class678.field9294 + var12, class678.field9304 + var13, arg4, arg3, arg4 + arg0, arg3 + arg6 + 1);
        if (arg1 != -80) {
            field1234 = null;
        }
        class678.method3778(arg2);
        class464 var14 = class678.method3785(arg2);
        class635.method3529(var14, arg2, 1, 0, 0);
        if (class236.field3170 > 0) {
            class322.field4447--;
            if (class322.field4447 == 0) {
                class236.field3170--;
                class322.field4447 = 20;
            }
        }
        if (!class59.field737) {
            return;
        }
        int var15 = arg0 + arg4 - 5;
        int var16 = arg3 + arg6 - 8;
        class478.field6780.method506((byte) -92, -1, var15, "Fps:" + class411.field5801, 16776960, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class478.field6780.method506((byte) -92, -1, var15, "Mem:" + var18 + "k", var19, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method741(int arg0) {
        field1242 = null;
        field1234 = null;
        if (arg0 != -18226) {
            field1234 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field1241 = (byte) arg1;
        this.field1243 = (byte) arg0;
        this.field1236[0] = arg2;
        this.field1236[2] = arg4;
        this.field1236[1] = arg3;
        this.field1236[3] = arg5;
        this.field1246[1] = arg7;
        this.field1246[3] = arg9;
        this.field1246[0] = arg6;
        this.field1246[2] = arg8;
        this.field1237[0] = arg10;
        this.field1235 = (short) (arg2 >> class660.field9038);
        this.field1237[1] = arg11;
        this.field1237[2] = arg12;
        this.field1237[3] = arg13;
        this.field1249 = (short) (arg4 >> class660.field9038);
        this.field1248 = (short) (arg10 >> class660.field9038);
        this.field1244 = new short[4];
        this.field1239 = (short) (arg12 >> class660.field9038);
        this.field1238 = new short[4];
        this.field1247 = new short[4];
    }
}
