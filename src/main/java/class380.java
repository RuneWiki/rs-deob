import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class380 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[F")
    public static float[] field5003 = new float[4];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field5001 = 0;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5004 = new String[100];

    @OriginalMember(owner = "client!j", name = "h", descriptor = "B")
    public byte field5007;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ljava/lang/String;")
    public String field5000;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Ljava/lang/String;")
    public String field5005;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Ljava/lang/String;")
    public String field5008;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Ljava/lang/String;")
    public String field5010;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2157(int arg0, int arg1) {
        field5006++;
        class153 var2 = class75.method656(12, 255, arg1);
        var2.method997((byte) 93);
        if (arg0 != 0) {
            field5004 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 22)
    public static void method2158(int arg0) {
        field5003 = null;
        if (arg0 != 1354998088) {
            method2158(16);
        }
        field5004 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 34)
    public static final void method2159(int arg0) {
        field5009++;
        int var1 = class513.field7443.method2743(false);
        class387.field5108 = class513.field7443.method2742((byte) -91);
        int var2 = class513.field7443.method2775(-4672);
        int var3 = class513.field7443.method2772((byte) 124);
        boolean var4 = class513.field7443.method2776((byte) -27) == 1;
        class309.method1803(var1, -30493);
        class513.field7443.method1204(true);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class452.field6526 >> 3); var20++) {
                for (int var21 = 0; var21 < class440.field6307 >> 3; var21++) {
                    int var22 = class513.field7443.method1199(30304, 1);
                    if (var22 == 1) {
                        class225.field2867[var5][var20][var21] = class513.field7443.method1199(arg0 + 30288, 26);
                    } else {
                        class225.field2867[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class513.field7443.method1202(-7);
        int var6 = (class312.field3986 - class513.field7443.field6631) / arg0;
        class268.field3391 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class268.field3391[var7][var19] = class513.field7443.method2727(-75);
            }
        }
        class166.field2121 = null;
        class42.field521 = new byte[var6][];
        class79.field1025 = new int[var6];
        class53.field709 = new int[var6];
        class502.field7256 = new int[var6];
        class523.field7708 = new int[var6];
        class296.field3805 = new int[var6];
        class189.field2476 = new byte[var6][];
        class433.field6138 = null;
        class141.field1826 = new byte[var6][];
        class450.field6476 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class452.field6526 >> 3; var10++) {
                for (int var11 = 0; var11 < class440.field6307 >> 3; var11++) {
                    int var12 = class225.field2867[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class79.field1025[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class79.field1025[var8] = var15;
                            int var17 = (var15 & 0xFF02) >> 8;
                            int var18 = var15 & 0xFF;
                            class296.field3805[var8] = class351.field4507.method488("m" + var17 + "_" + var18, 86);
                            class523.field7708[var8] = class351.field4507.method488("l" + var17 + "_" + var18, arg0 + 101);
                            class502.field7256[var8] = class351.field4507.method488("um" + var17 + "_" + var18, 104);
                            class53.field709[var8] = class351.field4507.method488("ul" + var17 + "_" + var18, class489.method2968(arg0, 76));
                            var8++;
                        }
                    }
                }
            }
        }
        class400.method2371(10, var4, var2, false, var3);
    }
}
