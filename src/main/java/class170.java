import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class170 extends class313 {

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "[I")
    public static int[] field2941 = new int[50];

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2949 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "Z")
    public static boolean field2956 = false;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "F")
    public static float field2950;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "Z")
    public static boolean field2947;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "[I")
    public static int[] field2946;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V", line = 6)
    public static final void method1339(int arg0, String arg1, String arg2, byte arg3) {
        class263.method1815(arg2, arg1, true, (String) null, -1, arg0);
        if (arg3 == -98) {
            field2952++;
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V", line = 18)
    public static final void method1340(int arg0) {
        field2948++;
        if (!class43.field680 || class283.field4479) {
            return;
        }
        class257[][][] var1 = class279.field4430;
        if (arg0 >= -95) {
            method1341(-84, (byte) -93);
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class257[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class257 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4140 != null && var6.field4140.field5257 instanceof class183) {
                            class183 var7 = (class183) var6.field4140.field5257;
                            if ((var6.field4140.field5260 & Long.MIN_VALUE) == 0L) {
                                var7.method1413(false, true, true, true, false, true, true);
                            } else {
                                var7.method1413(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field4152 != null) {
                            if (var6.field4152.field700 instanceof class183) {
                                class183 var8 = (class183) var6.field4152.field700;
                                if ((Long.MIN_VALUE & var6.field4152.field701) == 0L) {
                                    var8.method1413(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1413(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4152.field694 instanceof class183) {
                                class183 var9 = (class183) var6.field4152.field694;
                                if ((Long.MIN_VALUE & var6.field4152.field701) == 0L) {
                                    var9.method1413(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1413(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field4146 != null) {
                            if (var6.field4146.field4741 instanceof class183) {
                                class183 var10 = (class183) var6.field4146.field4741;
                                if ((var6.field4146.field4732 & Long.MIN_VALUE) == 0L) {
                                    var10.method1413(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1413(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4146.field4744 instanceof class183) {
                                class183 var11 = (class183) var6.field4146.field4744;
                                if ((var6.field4146.field4732 & Long.MIN_VALUE) == 0L) {
                                    var11.method1413(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1413(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field4150; var12++) {
                            if (var6.field4147[var12].field3940 instanceof class183) {
                                class183 var13 = (class183) var6.field4147[var12].field3940;
                                if ((var6.field4147[var12].field3936 & Long.MIN_VALUE) == 0L) {
                                    var13.method1413(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1413(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class283.field4479 = true;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[B", line = 166)
    public static final byte[] method1341(int arg0, byte arg1) {
        if (arg1 != 60) {
            field2950 = 1.4504169F;
        }
        class4 var2 = (class4) class100.field1619.method2400((long) arg0, 99);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class129.method1075(var7, 19192, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class4(var3);
            class100.field1619.method2396(0, (long) arg0, var2);
        }
        field2954++;
        return var2.field60;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V", line = 217)
    public static final void method1342(int arg0, int arg1) {
        field2953++;
        class346.field5507.method469(-11815, arg1);
        if (arg0 > -119) {
            method1344(87);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILpi;)Ljava/lang/String;", line = 231)
    public static final String method1343(int arg0, class336 arg1) {
        if (arg0 != 32767) {
            method1339(-72, (String) null, (String) null, (byte) -107);
        }
        field2951++;
        return class116.method976(arg1, 32767, true);
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)V", line = 243)
    public static void method1344(int arg0) {
        field2946 = null;
        if (arg0 == 50) {
            field2941 = null;
            field2949 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 254)
    public class170() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 260)
    public static final void method1345(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field2942++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        if (arg0 != 255) {
            method1346(115, 111);
        }
        int var7 = (arg1 ? class38.field578 : class156.field2768) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class70 var9 = class202.method1518(var8, 0);
            if (var9.field1139 && var9.method675((byte) 90).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class339.field5425 = -1;
                    class30.field442 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class283.field4489 = 0;
        class30.field442 = var4;
        class339.field5425 = var5;
        String[] var12 = new String[class339.field5425];
        for (int var13 = 0; var13 < class339.field5425; var13++) {
            var12[var13] = class202.method1518(var4[var13], 0).method675((byte) -52);
        }
        client.method1889(-10, var12, class30.field442);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[I", line = 346)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            field2956 = true;
        }
        field2943++;
        return class8.field104;
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)Ljava/lang/String;", line = 357)
    public static final String method1346(int arg0, int arg1) {
        field2955++;
        if (arg1 != 255) {
            method1340(-105);
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }
}
