import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class120 implements class243 {

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lcu;")
    public class219 field1245;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "Lkda;")
    public class388 field1253;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lsq;")
    public static class178 field1248 = new class178(6, 0, 4, 2);

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field1251;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V", line = 3)
    public static final void method776(int arg0) {
        field1254++;
        int var1 = class248.field3008.method1474((byte) -92);
        boolean var2 = class248.field3008.method1423(-69) == 1;
        class614.field8787 = class248.field3008.method1426((byte) 39);
        int var3 = class248.field3008.method1426((byte) 39);
        int var4 = class248.field3008.method1474((byte) -90);
        class522.method3067((byte) 88);
        class180.method1117((byte) -110, var3);
        class248.field3008.method1108(-103);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class489.field6976 >> 3; var20++) {
                for (int var21 = 0; var21 < (class153.field1677 >> 3); var21++) {
                    int var22 = class248.field3008.method1102(255, 1);
                    if (var22 == 1) {
                        class366.field4673[var5][var20][var21] = class248.field3008.method1102(class555.method3251(arg0, -6293), 26);
                    } else {
                        class366.field4673[var5][var20][var21] = -1;
                    }
                }
            }
        }
        if (arg0 != -6252) {
            return;
        }
        class248.field3008.method1106(-116);
        int var6 = (class741.field10364 - class248.field3008.field2903) / 16;
        class64.field655 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class64.field655[var7][var19] = class248.field3008.method1438(118);
            }
        }
        class553.field7925 = null;
        class630.field9059 = new byte[var6][];
        class323.field4123 = new int[var6];
        class676.field9572 = new byte[var6][];
        class111.field1173 = new int[var6];
        class331.field4299 = new int[var6];
        class322.field4113 = new int[var6];
        class74.field773 = new int[var6];
        class24.field232 = null;
        class602.field8566 = new byte[var6][];
        class232.field2708 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class489.field6976 >> 3; var10++) {
                for (int var11 = 0; var11 < class153.field1677 >> 3; var11++) {
                    int var12 = class366.field4673[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE474) >> 14;
                        int var14 = (var12 & 0x3FFC) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class74.field773[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class74.field773[var8] = var15;
                            int var17 = (var15 & 0xFF51) >> 8;
                            int var18 = var15 & 0xFF;
                            class331.field4299[var8] = class154.field1692.method2474(arg0 + 6360, "m" + var17 + "_" + var18);
                            class322.field4113[var8] = class154.field1692.method2474(-127, "l" + var17 + "_" + var18);
                            class323.field4123[var8] = class154.field1692.method2474(103, "um" + var17 + "_" + var18);
                            class111.field1173[var8] = class154.field1692.method2474(-120, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class313.method1863(var4, var1, var2, false, 11);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Lhs;", line = 154)
    public class325 method777(int arg0) {
        if (arg0 > -8) {
            return null;
        } else {
            field1256++;
            return null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V", line = 170)
    public static void method778(int arg0) {
        field1251 = null;
        if (arg0 != 0) {
            method776(46);
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(I)V", line = 182)
    public static final void method779(int arg0) {
        if (class570.field8093 != null) {
            try {
                class570.field8093.close();
            } catch (IOException var1) {
            }
        }
        field1246++;
        class570.field8093 = null;
        if (arg0 < 64) {
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lkda;Lcu;IIIIIII)V", line = 214)
    public class120(class388 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1245 = arg1;
        this.field1258 = arg7;
        this.field1247 = arg3;
        this.field1252 = arg8;
        this.field1249 = arg4;
        this.field1250 = arg5;
        this.field1255 = arg6;
        this.field1244 = arg2;
        this.field1253 = arg0;
    }
}
