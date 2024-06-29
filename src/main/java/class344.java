import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class344 extends class8 {

    @OriginalMember(owner = "client!in", name = "S", descriptor = "Z")
    public static boolean field5355 = false;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "Lpf;")
    public static class342 field5350 = new class342(5000);

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public int field5344;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public int field5349;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "Ljava/lang/String;")
    public String field5352;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5357;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)I", line = 8)
    public final int method2382(int arg0) {
        if (arg0 != 0) {
            this.field5344 = 115;
        }
        field5345++;
        return (int) this.field2744;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lak;ZLak;)V", line = 25)
    public static final void method2383(class172 arg0, boolean arg1, class172 arg2) {
        field5343++;
        class119.field1811 = arg0;
        if (!arg1) {
            method2386(49);
        }
        class14.field164 = arg2;
        class219.field3538 = class14.field164.method1299(3, (byte) 78);
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 38)
    public final void method2384(int arg0) {
        field5358++;
        this.field109 = class283.method2038((byte) 126) + 500L | this.field109 & Long.MIN_VALUE;
        class172.field2853.method1412(this, (byte) -2);
        if (arg0 != -27354) {
            this.field5344 = 68;
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)I", line = 57)
    public final int method2385(int arg0) {
        if (arg0 >= -25) {
            method2388(-124, -118, 31, 60, -22, 62, 79, 80, -28);
        }
        field5348++;
        return (int) (this.field2744 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 70)
    public static void method2386(int arg0) {
        if (arg0 == 16755200) {
            field5350 = null;
            field5357 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V", line = 81)
    public static final void method2387(int arg0, byte arg1) {
        if (arg1 >= -28) {
            method2387(11, (byte) -35);
        }
        field5353++;
        class344 var2 = class110.method759(12, arg0, false);
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V", line = 93)
    public class344(int arg0, int arg1) {
        this.field2744 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIII)V", line = 107)
    public static final void method2388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 >= -98) {
            field5355 = true;
        }
        for (int var9 = 0; var9 < class20.field289.field3270; var9++) {
            if (class20.field289.method1470(var9, 116)) {
                int[] var10 = class225.field3604.method2086(class20.field289.field3269[var9] >> 14 & 0x3FFF, (byte) 56, (class20.field289.field3269[var9] & 0x3F4B2ADA) >> 28, class20.field289.field3269[var9] & 0x3FFF);
                if (var10 != null) {
                    int var11 = var10[1] - class27.field377;
                    int var12 = class74.field1048 + class93.field1276 - var10[2] - 1;
                    int var13 = class20.field289.method1467(var9, true);
                    int var14 = arg8 + ((var12 - arg5) * (arg4 - arg8) / (arg1 - arg5));
                    int var15 = (var11 - arg6) * (arg0 - arg3) / (arg2 - arg6) + arg3;
                    class140 var16 = null;
                    int var17 = 16777215;
                    if (var13 == 0) {
                        if ((double) class122.field1920 == 3.0D) {
                            var16 = class102.field1483;
                        }
                        if ((double) class122.field1920 == 4.0D) {
                            var16 = class157.field2473;
                        }
                        if ((double) class122.field1920 == 6.0D) {
                            var16 = class64.field922;
                        }
                        if ((double) class122.field1920 >= 8.0D) {
                            var16 = class10.field129;
                        }
                    }
                    if (var13 == 1) {
                        if ((double) class122.field1920 == 3.0D) {
                            var16 = class64.field922;
                        }
                        if ((double) class122.field1920 == 4.0D) {
                            var16 = class10.field129;
                        }
                        if ((double) class122.field1920 == 6.0D) {
                            var16 = class103.field1505;
                        }
                        if ((double) class122.field1920 >= 8.0D) {
                            var16 = class54.field770;
                        }
                    }
                    if (var13 == 2) {
                        var17 = 16755200;
                        if ((double) class122.field1920 == 3.0D) {
                            var16 = class103.field1505;
                        }
                        if ((double) class122.field1920 == 4.0D) {
                            var16 = class54.field770;
                        }
                        if ((double) class122.field1920 == 6.0D) {
                            var16 = class133.field2085;
                        }
                        if ((double) class122.field1920 >= 8.0D) {
                            var16 = class128.field2004;
                        }
                    }
                    if (class20.field289.field3261[var9] != -1) {
                        var17 = class20.field289.field3261[var9];
                    }
                    if (var16 != null) {
                        int var18 = class2.field30.method1811(class20.field289.field3262[var9], (int[]) null, class228.field3630);
                        int var19 = var14 - (var18 - 1) * var16.method1039() / 2;
                        int var20 = var19 + var16.method1037() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class228.field3630[var21];
                            if (var21 < var18 - 1) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var16.method1040(var22, var15, var20, var17, true);
                            var20 += var16.method1039();
                        }
                    }
                }
            }
        }
        field5356++;
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V", line = 235)
    public static final void method2389(int arg0) {
        field5347++;
        if (arg0 != -13950) {
            field5355 = true;
        }
        for (class90 var1 = (class90) class243.field3842.method458((byte) -16); var1 != null; var1 = (class90) class243.field3842.method455((byte) 121)) {
            int var2 = var1.field1249;
            if (class263.method1875(arg0 ^ 0xFFFFC9DE, var2)) {
                boolean var3 = true;
                class157[] var4 = class221.field3547[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2421;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2744;
                    class157 var7 = class142.method1053(var6, arg0 + 79485);
                    if (var7 != null) {
                        class320.method2252(var7, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V", line = 295)
    public final void method2390(byte arg0) {
        this.field109 |= Long.MIN_VALUE;
        field5351++;
        if (arg0 > -20) {
            this.field5352 = (String) null;
        }
        if (this.method2391((byte) 52) == 0L) {
            class42.field529.method1412(this, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)J", line = 309)
    public final long method2391(byte arg0) {
        field5346++;
        if (arg0 != 52) {
            this.field5344 = 17;
        }
        return Long.MAX_VALUE & this.field109;
    }
}
