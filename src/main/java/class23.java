import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class23 extends class35 {

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public volatile int field345 = -1;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field347;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Ldi;")
    public static class284 field350 = new class284();

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field354 = "red:";

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/util/Random;")
    public static Random field351 = new Random();

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)V", line = 3)
    public static final void method160(byte arg0, boolean arg1) {
        class322.field4650 = arg1;
        field348++;
        if (arg0 != 54) {
            field350 = null;
        }
        if (!class322.field4650) {
            int var2 = class268.field4020.method294(-1280438392);
            int var3 = class268.field4020.method294(-1280438392);
            int var4 = class268.field4020.method279((byte) 89);
            boolean var5 = class268.field4020.method279((byte) 57) == 1;
            int var6 = class268.field4020.method279((byte) 94);
            int var7 = (class51.field824 - class268.field4020.field565) / 16;
            class151.field2314 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class151.field2314[var8][var16] = class268.field4020.method304(65280);
                }
            }
            int var9 = class268.field4020.method293(arg0 + 21515);
            int var10 = class268.field4020.method293(21569);
            class387.method2451((byte) -32, var4);
            class79.field1336 = new int[var7];
            class61.field983 = null;
            class358.field5114 = new int[var7];
            class92.field1453 = new int[var7];
            class388.field5565 = null;
            class188.field2779 = new byte[var7][];
            class347.field4906 = new byte[var7][];
            class79.field1343 = new byte[var7][];
            class253.field3665 = new int[var7];
            class403.field5895 = new byte[var7][];
            class85.field1373 = new int[var7];
            boolean var11 = false;
            if (((var9 / 8) == 48 || var9 / 8 == 49) && var10 / 8 == 48) {
                var11 = true;
            }
            if ((var9 / 8) == 48 && (var10 / 8) == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var9 - (class183.field2703 >> 4)) / 8; var13 <= (((class183.field2703 >> 4) + var9) / 8); var13++) {
                for (int var14 = (var10 - (class66.field1056 >> 4)) / 8; var14 <= (((class66.field1056 >> 4) + var10) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class79.field1336[var12] = var15;
                        class358.field5114[var12] = -1;
                        class85.field1373[var12] = -1;
                        class253.field3665[var12] = -1;
                        class92.field1453[var12] = -1;
                    } else {
                        class79.field1336[var12] = var15;
                        class358.field5114[var12] = class119.field1862.method1359(arg0 + 63, "m" + var13 + "_" + var14);
                        class85.field1373[var12] = class119.field1862.method1359(122, "l" + var13 + "_" + var14);
                        class253.field3665[var12] = class119.field1862.method1359(arg0 + 49, "um" + var13 + "_" + var14);
                        class92.field1453[var12] = class119.field1862.method1359(57, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class157.method1233(28, var2, var10, var3, var9, var6, var5, false);
            return;
        }
        int var17 = class268.field4020.method288(-16826);
        int var18 = class268.field4020.method310(arg0 - 32771);
        int var19 = class268.field4020.method288(arg0 - 16880);
        int var20 = class268.field4020.method276(-1536);
        int var21 = class268.field4020.method288(-16826);
        int var22 = class268.field4020.method294(-1280438392);
        boolean var23 = class268.field4020.method276(-1536) == 1;
        class387.method2451((byte) -32, var20);
        class268.field4020.method2782((byte) -96);
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var39 = 0; var39 < (class183.field2703 >> 3); var39++) {
                for (int var40 = 0; var40 < class66.field1056 >> 3; var40++) {
                    int var41 = class268.field4020.method2778(1, (byte) -95);
                    if (var41 == 1) {
                        class41.field630[var24][var39][var40] = class268.field4020.method2778(26, (byte) -95);
                    } else {
                        class41.field630[var24][var39][var40] = -1;
                    }
                }
            }
        }
        class268.field4020.method2779(-120);
        int var25 = (class51.field824 - class268.field4020.field565) / 16;
        class151.field2314 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var38 = 0; var38 < 4; var38++) {
                class151.field2314[var26][var38] = class268.field4020.method278(class277.method1976(arg0, -70));
            }
        }
        class358.field5114 = new int[var25];
        class79.field1336 = new int[var25];
        class79.field1343 = new byte[var25][];
        class347.field4906 = new byte[var25][];
        class403.field5895 = new byte[var25][];
        class85.field1373 = new int[var25];
        class188.field2779 = new byte[var25][];
        class388.field5565 = null;
        class253.field3665 = new int[var25];
        class61.field983 = null;
        class92.field1453 = new int[var25];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < class183.field2703 >> 3; var29++) {
                for (int var30 = 0; var30 < class66.field1056 >> 3; var30++) {
                    int var31 = class41.field630[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = var31 >> 14 & 0x3FF;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + (var33 / 8);
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class79.field1336[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class79.field1336[var27] = var34;
                            int var36 = var34 >> 8 & 0xFF;
                            int var37 = var34 & 0xFF;
                            class358.field5114[var27] = class119.field1862.method1359(74, "m" + var36 + "_" + var37);
                            class85.field1373[var27] = class119.field1862.method1359(arg0 + 57, "l" + var36 + "_" + var37);
                            class253.field3665[var27] = class119.field1862.method1359(107, "um" + var36 + "_" + var37);
                            class92.field1453[var27] = class119.field1862.method1359(110, "ul" + var36 + "_" + var37);
                            var27++;
                        }
                    }
                }
            }
        }
        class157.method1233(arg0 - 26, var17, var19, var21, var22, var18, var23, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 256)
    public static void method161(boolean arg0) {
        field350 = null;
        if (arg0) {
            method164(-74, (class174) null);
        }
        field351 = null;
        field354 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I", line = 269)
    public static final int method162(int arg0, int arg1) {
        if (arg0 != -10857) {
            method161(false);
        }
        field346++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 289)
    public static final void method163(int arg0, String arg1) {
        field349++;
        if (arg0 != -1357113757) {
            field354 = null;
        }
        if (arg1 == null) {
            return;
        }
        String var2 = class126.method1065(false, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class119.field1866; var3++) {
            String var4 = class126.method1065(false, class443.field6438[var3]);
            if (var4 != null && var4.equals(var2)) {
                class119.field1866--;
                for (int var5 = var3; var5 < class119.field1866; var5++) {
                    class443.field6438[var5] = class443.field6438[var5 + 1];
                    class390.field5636[var5] = class390.field5636[var5 + 1];
                    class205.field3010[var5] = class205.field3010[var5 + 1];
                    class267.field4005[var5] = class267.field4005[var5 + 1];
                    class420.field6121[var5] = class420.field6121[var5 + 1];
                }
                class49.field789 = class341.field4845;
                class288.field4297++;
                class13.field216.method2781(false, 34);
                class13.field216.method267(class429.method2677(arg1, arg0 ^ 0xAF1C1662), false);
                class13.field216.method265((byte) -75, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 346)
    public class23(String arg0) {
        this.field347 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILdp;)V", line = 369)
    public static final void method164(int arg0, class174 arg1) {
        int var2 = -54 % ((arg0 - 78) / 43);
        field353++;
        class115.field1828 = arg1;
    }
}
