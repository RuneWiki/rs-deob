import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class377 extends class412 {

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field5496 = -1;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field5506 = -1;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "[I")
    public static int[] field5498 = new int[50];

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[Ljg;")
    public static class215[] field5499 = new class215[5];

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "[F")
    public static float[] field5502 = new float[4];

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field5507;

    static {
        for (int var0 = 0; var0 < field5499.length; ++var0) {
            field5499[var0] = new class215();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqq;BII)Z", line = 7)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field5505;
        class496 var5 = arg0.method1976();
        var5.method198(super.field5975, super.field5977, super.field5973);
        if (arg1 != -44) {
            return true;
        } else {
            class198 var6 = class288.field4362.method3030((byte) 71, this.field5494).method1134(131072, (class87) null, (class320) null, -1, arg0, 0, 206918595, this.field5503, 0);
            if (var6 != null && var6.method495(arg2, arg3, var5, true)) {
                return true;
            } else {
                if (this.field5506 != -1) {
                    class198 var7 = class288.field4362.method3030((byte) 78, this.field5506).method1134(131072, (class87) null, (class320) null, -1, arg0, 0, arg1 + 206918639, this.field5497, 0);
                    if (var7 != null && var7.method495(arg2, arg3, var5, true)) {
                        return true;
                    }
                }
                if (~this.field5496 != 0) {
                    class198 var8 = class288.field4362.method3030((byte) 69, this.field5496).method1134(131072, (class87) null, (class320) null, -1, arg0, 0, arg1 + 206918639, this.field5495, 0);
                    if (var8 != null && var8.method495(arg2, arg3, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZ)V", line = 46)
    public static final void method2269(boolean arg0, boolean arg1) {
        ++field5504;
        class233.method1400(false);
        if (client.field2992 == 30 || client.field2992 == 25) {
            ++class376.field5488;
            if (class376.field5488 >= 50 || arg1) {
                class376.field5488 = 0;
                if (arg0) {
                    if (!class458.field7053 && class163.field2534 != null) {
                        ++class369.field5423;
                        class400.method2379((byte) -75, class164.field2541);
                        try {
                            class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                            class230.field3508.field585 = 0;
                        } catch (IOException var2) {
                            class458.field7053 = true;
                        }
                    }
                    class233.method1400(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLqq;)Lkm;", line = 89)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field5500;
        class496 var3 = arg1.method1976();
        var3.method198(super.field5975, super.field5977, super.field5973);
        class227 var4 = class145.method951(3, 0);
        if (~this.field5496 != 0) {
            class198 var5 = class288.field4362.method3030((byte) 59, this.field5496).method1134(2048, (class87) null, (class320) null, -1, arg1, 0, 206918595, this.field5495, 0);
            if (var5 != null) {
                var5.method461(var3, var4.field3476[2], 0);
            }
        }
        if (~this.field5506 != 0) {
            class198 var6 = class288.field4362.method3030((byte) 76, this.field5506).method1134(2048, (class87) null, (class320) null, -1, arg1, 0, 206918595, this.field5497, 0);
            if (var6 != null) {
                var6.method461(var3, var4.field3476[1], 0);
            }
        }
        class198 var7 = class288.field4362.method3030((byte) 75, this.field5494).method1134(2048, (class87) null, (class320) null, -1, arg1, 0, 206918595, this.field5503, 0);
        if (arg0 >= -11) {
            return null;
        } else {
            if (var7 != null) {
                var7.method461(var3, var4.field3476[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZLqq;)V", line = 133)
    public final void method172(boolean arg0, class318 arg1) {
        ++field5493;
        if (arg0) {
            this.method169((byte) -23, (class318) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 146)
    public static void method2270(int arg0) {
        field5499 = null;
        field5498 = null;
        if (arg0 == 14890) {
            field5502 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 165)
    public static final void method2271(int arg0, int arg1, int arg2, String arg3, int arg4) {
        ++field5501;
        class427 var5 = class59.method419(arg0, 12782, arg1);
        if (var5 != null) {
            if (var5.field6226 != null) {
                class298 var6 = new class298();
                var6.field4520 = var5.field6226;
                var6.field4517 = var5;
                var6.field4513 = arg3;
                var6.field4524 = arg4;
                class94.method704(var6);
            }
            boolean var7 = true;
            if (~var5.field6187 != -1) {
                var7 = class54.method379(-36, var5);
            }
            if (var7) {
                if (client.method1176(var5).method374(797621697, arg4 + -1)) {
                    if (~arg4 == -2) {
                        class400.method2379((byte) -75, class305.field4628);
                        ++class481.field7342;
                        class159.method1022((byte) 90, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 2) {
                        ++class406.field5897;
                        class400.method2379((byte) -75, class504.field7622);
                        class159.method1022((byte) 117, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 3) {
                        class400.method2379((byte) -75, class418.field6018);
                        ++class375.field5464;
                        class159.method1022((byte) 110, arg1, var5.field6274, arg0);
                    }
                    if (~arg4 == -5) {
                        ++class152.field2434;
                        class400.method2379((byte) -75, class193.field3046);
                        class159.method1022((byte) 86, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 5) {
                        ++class167.field2581;
                        class400.method2379((byte) -75, class456.field6985);
                        class159.method1022((byte) 120, arg1, var5.field6274, arg0);
                    }
                    if (~arg4 == -7) {
                        ++class458.field7025;
                        class400.method2379((byte) -75, class292.field4448);
                        class159.method1022((byte) 126, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 7) {
                        ++class289.field4378;
                        class400.method2379((byte) -75, class239.field3608);
                        class159.method1022((byte) 103, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 8) {
                        class400.method2379((byte) -75, class57.field979);
                        ++class289.field4377;
                        class159.method1022((byte) 93, arg1, var5.field6274, arg0);
                    }
                    int var8 = 32 % ((38 - arg2) / 55);
                    if (~arg4 == -10) {
                        ++class448.field6912;
                        class400.method2379((byte) -75, class304.field4619);
                        class159.method1022((byte) 100, arg1, var5.field6274, arg0);
                    }
                    if (arg4 == 10) {
                        ++class487.field7420;
                        class400.method2379((byte) -75, class457.field7003);
                        class159.method1022((byte) 119, arg1, var5.field6274, arg0);
                    }
                }
            }
        }
    }
}
