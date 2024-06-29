import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class60 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static volatile int field1169 = 0;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Lob;")
    public static class141 field1175 = class175.method1195(40, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[Z")
    public static boolean[] field1177 = new boolean[112];

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lob;")
    private static class141 field1179 = class175.method1195(40, "Take");

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lob;")
    public static class141 field1170 = class175.method1195(40, "title)3jpg");

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lob;")
    public static class141 field1176 = field1179;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lob;")
    private static class141 field1171 = class175.method1195(40, "World");

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Lob;")
    public static class141 field1173 = field1171;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lob;")
    public static class141 field1180 = field1171;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
    public static long field1158;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "[B")
    public byte[] field1181;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "[B")
    public byte[] field1182;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
    public static int[] field1178;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[Lfa;")
    public static class52[] field1164;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method402(int arg0) {
        field1180 = null;
        field1164 = null;
        field1177 = null;
        if (arg0 < 23) {
            method402(126);
        }
        field1176 = null;
        field1179 = null;
        field1170 = null;
        field1175 = null;
        field1178 = null;
        field1173 = null;
        field1171 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method403(byte arg0, Component arg1) {
        arg1.removeMouseListener(class212.field4046);
        if (arg0 <= 15) {
            field1173 = null;
        }
        arg1.removeMouseMotionListener(class212.field4046);
        arg1.removeFocusListener(class212.field4046);
        field1166++;
        field1169 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public static final void method404() {
        for (int var0 = 0; var0 < class17.field304; var0++) {
            class9 var1 = class113.field2165[var0];
            class1.method6(var1);
            class113.field2165[var0] = null;
        }
        class17.field304 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V")
    public static final void method405(boolean arg0, byte arg1) {
        class47.field892 = arg0;
        int var2 = -1 / ((35 - arg1) / 50);
        field1159++;
        if (!class47.field892) {
            int var3 = class156.field3014.method1015((byte) 110);
            int var4 = class156.field3014.method1015((byte) 110);
            int var5 = class156.field3014.method967((byte) -127);
            int var6 = class156.field3014.method965((byte) -126);
            int var7 = class156.field3014.method982((byte) 127);
            int var8 = (class187.field3632 - class156.field3014.field2865) / 16;
            class110.field2123 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class110.field2123[var9][var15] = class156.field3014.method985((byte) -70);
                }
            }
            class83.field1653 = new int[var8];
            class195.field3736 = new byte[var8][];
            class172.field3412 = new byte[var8][];
            class167.field3226 = new int[var8];
            boolean var10 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && (var4 / 8) == 48) {
                var10 = true;
            }
            class18.field321 = new int[var8];
            if (var7 / 8 == 48 && var4 / 8 == 148) {
                var10 = true;
            }
            int var11 = 0;
            for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                for (int var13 = (var4 - 6) / 8; var13 <= (var4 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (!var10 || var13 != 49 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || var13 != 47)) {
                        class18.field321[var11] = var14;
                        class83.field1653[var11] = class125.field2414.method1071((byte) -120, class220.method1422(new class141[] { class117.field2280, class78.method543((byte) 93, var12), class152.field2916, class78.method543((byte) 93, var13) }, -3));
                        class167.field3226[var11] = class125.field2414.method1071((byte) -125, class220.method1422(new class141[] { class8.field130, class78.method543((byte) 93, var12), class152.field2916, class78.method543((byte) 93, var13) }, -3));
                        var11++;
                    }
                }
            }
            class123.method795(var5, var4, (byte) -64, var3, var6, var7);
            return;
        }
        int var16 = class156.field3014.method982((byte) 91);
        int var17 = class156.field3014.method982((byte) -121);
        class156.field3014.method35((byte) -65);
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var36 = 0; var36 < 13; var36++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    int var38 = class156.field3014.method34(1, 11339);
                    if (var38 == 1) {
                        class116.field2237[var18][var36][var37] = class156.field3014.method34(26, 11339);
                    } else {
                        class116.field2237[var18][var36][var37] = -1;
                    }
                }
            }
        }
        class156.field3014.method41(8);
        int var19 = (class187.field3632 - class156.field3014.field2865) / 16;
        class110.field2123 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var35 = 0; var35 < 4; var35++) {
                class110.field2123[var20][var35] = class156.field3014.method979(1029109968);
            }
        }
        int var21 = class156.field3014.method965((byte) -118);
        int var22 = class156.field3014.method1002(-8544);
        int var23 = class156.field3014.method965((byte) -125);
        class167.field3226 = new int[var19];
        class195.field3736 = new byte[var19][];
        class18.field321 = new int[var19];
        class172.field3412 = new byte[var19][];
        class83.field1653 = new int[var19];
        int var24 = 0;
        for (int var25 = 0; var25 < 4; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    int var28 = class116.field2237[var25][var26][var27];
                    if (var28 != -1) {
                        int var29 = var28 >> 14 & 0x3FF;
                        int var30 = var28 >> 3 & 0x7FF;
                        int var31 = (var29 / 8 << 8) + var30 / 8;
                        for (int var32 = 0; var32 < var24; var32++) {
                            if (class18.field321[var32] == var31) {
                                var31 = -1;
                                break;
                            }
                        }
                        if (var31 != -1) {
                            int var33 = var31 >> 8 & 0xFF;
                            class18.field321[var24] = var31;
                            int var34 = var31 & 0xFF;
                            class83.field1653[var24] = class125.field2414.method1071((byte) -119, class220.method1422(new class141[] { class117.field2280, class78.method543((byte) 93, var33), class152.field2916, class78.method543((byte) 93, var34) }, -3));
                            class167.field3226[var24] = class125.field2414.method1071((byte) -120, class220.method1422(new class141[] { class8.field130, class78.method543((byte) 93, var33), class152.field2916, class78.method543((byte) 93, var34) }, -3));
                            var24++;
                        }
                    }
                }
            }
        }
        class123.method795(var22, var17, (byte) -71, var16, var21, var23);
    }
}
