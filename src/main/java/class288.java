import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class288 extends OutputStream {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lke;")
    public static class256 field4979 = class316.method2202(")4j", 27626);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lke;")
    public static class256 field4983 = class316.method2202("Number of player models in cache:", 27626);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lti;")
    public static class182[] field4988 = new class182[0];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lta;")
    public static class82 field4980;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BZ)V", line = 12)
    public static final void method2008(byte arg0, boolean arg1) {
        if (arg0 > -45) {
            field4979 = (class256) null;
        }
        field4982++;
        class153.field2744 = arg1;
        if (!class153.field2744) {
            int var2 = (class290.field5027 - class23.field302.field738) / 16;
            class175.field3111 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    class175.field3111[var3][var4] = class23.field302.method327(4);
                }
            }
            int var5 = class23.field302.method362((byte) 47);
            int var6 = class23.field302.method346(-16);
            int var7 = class23.field302.method362((byte) 47);
            boolean var8 = false;
            int var9 = class23.field302.method357(false);
            int var10 = class23.field302.method362((byte) 47);
            class115.field2021 = new byte[var2][];
            class13.field178 = (byte[][]) null;
            class196.field3583 = new int[var2];
            class167.field2952 = new int[var2];
            if (((var10 / 8) == 48 || (var10 / 8) == 49) && var6 / 8 == 48) {
                var8 = true;
            }
            class35.field550 = new int[var2];
            class28.field383 = new int[var2];
            if ((var10 / 8) == 48 && (var6 / 8) == 148) {
                var8 = true;
            }
            class77.field1460 = new byte[var2][];
            class17.field231 = new byte[var2][];
            class44.field829 = new int[var2];
            class51.field939 = new byte[var2][];
            int var11 = 0;
            class111.field1945 = null;
            for (int var12 = (var10 - 6) / 8; var12 <= (var10 + 6) / 8; var12++) {
                for (int var13 = (var6 - 6) / 8; var13 <= (var6 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var8 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class44.field829[var11] = var14;
                        class28.field383[var11] = -1;
                        class167.field2952[var11] = -1;
                        class35.field550[var11] = -1;
                        class196.field3583[var11] = -1;
                    } else {
                        class44.field829[var11] = var14;
                        class28.field383[var11] = class246.field4184.method1006((byte) 63, class30.method214(new class256[] { class198.field3621, class305.method2125((byte) 27, var12), class179.field3170, class305.method2125((byte) 65, var13) }, 29784));
                        class167.field2952[var11] = class246.field4184.method1006((byte) 75, class30.method214(new class256[] { class311.field5363, class305.method2125((byte) 123, var12), class179.field3170, class305.method2125((byte) 88, var13) }, 29784));
                        class35.field550[var11] = class246.field4184.method1006((byte) 64, class30.method214(new class256[] { class290.field5021, class305.method2125((byte) 124, var12), class179.field3170, class305.method2125((byte) 115, var13) }, 29784));
                        class196.field3583[var11] = class246.field4184.method1006((byte) -74, class30.method214(new class256[] { class233.field3989, class305.method2125((byte) 77, var12), class179.field3170, class305.method2125((byte) 89, var13) }, 29784));
                    }
                    var11++;
                }
            }
            class23.method153(-17682, var9, var5, false, var7, var10, var6);
            return;
        }
        int var15 = class23.field302.method310((byte) -110);
        int var16 = class23.field302.method346(-16);
        int var17 = class23.field302.method315(-95);
        int var18 = class23.field302.method362((byte) 47);
        int var19 = class23.field302.method346(-16);
        class23.field302.method1597(0);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    int var23 = class23.field302.method1595(1, false);
                    if (var23 == 1) {
                        class198.field3613[var20][var21][var22] = class23.field302.method1595(26, false);
                    } else {
                        class198.field3613[var20][var21][var22] = -1;
                    }
                }
            }
        }
        class23.field302.method1602(7);
        int var24 = (class290.field5027 - class23.field302.field738) / 16;
        class175.field3111 = new int[var24][4];
        for (int var25 = 0; var25 < var24; var25++) {
            for (int var26 = 0; var26 < 4; var26++) {
                class175.field3111[var25][var26] = class23.field302.method363(-240439704);
            }
        }
        class35.field550 = new int[var24];
        class167.field2952 = new int[var24];
        class17.field231 = new byte[var24][];
        class13.field178 = (byte[][]) null;
        class115.field2021 = new byte[var24][];
        class44.field829 = new int[var24];
        class28.field383 = new int[var24];
        class196.field3583 = new int[var24];
        class51.field939 = new byte[var24][];
        class77.field1460 = new byte[var24][];
        class111.field1945 = null;
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class198.field3613[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = var31 >> 14 & 0x3FF;
                        int var33 = (var31 & 0x3FFB) >> 3;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class44.field829[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class44.field829[var27] = var34;
                            int var36 = var34 & 0xFF;
                            int var37 = (var34 & 0xFFC6) >> 8;
                            class28.field383[var27] = class246.field4184.method1006((byte) -107, class30.method214(new class256[] { class198.field3621, class305.method2125((byte) 37, var37), class179.field3170, class305.method2125((byte) 112, var36) }, 29784));
                            class167.field2952[var27] = class246.field4184.method1006((byte) -115, class30.method214(new class256[] { class311.field5363, class305.method2125((byte) 97, var37), class179.field3170, class305.method2125((byte) 33, var36) }, 29784));
                            class35.field550[var27] = class246.field4184.method1006((byte) 107, class30.method214(new class256[] { class290.field5021, class305.method2125((byte) 56, var37), class179.field3170, class305.method2125((byte) 82, var36) }, 29784));
                            class196.field3583[var27] = class246.field4184.method1006((byte) -116, class30.method214(new class256[] { class233.field3989, class305.method2125((byte) 102, var37), class179.field3170, class305.method2125((byte) 68, var36) }, 29784));
                            var27++;
                        }
                    }
                }
            }
        }
        class23.method153(-17682, var17, var15, false, var18, var16, var19);
    }

    @OriginalMember(owner = "client!ua", name = "write", descriptor = "(I)V", line = 259)
    public final void write(int arg0) throws IOException {
        field4987++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 284)
    public static void method2009(byte arg0) {
        field4979 = null;
        field4983 = null;
        if (arg0 == -119) {
            field4980 = null;
            field4988 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V", line = 300)
    public static final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class105.field1887 = arg4;
        field4985++;
        class175.field3106 = arg2;
        if (arg0 <= -83) {
            class274.field4748 = arg3;
            class244.field4161 = arg1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 317)
    public static int method2011(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
