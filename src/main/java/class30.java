import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 extends OutputStream {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Ljava/lang/String;")
    public static String field399 = null;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field402 = -1;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ldl;")
    public static class123 field397;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lch;")
    public static final class283 method241(int arg0, int arg1) {
        field398++;
        class283 var2 = (class283) class31.field408.method765((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field1652.method807((byte) 126, class71.method483(-72, arg1), class172.method1213((byte) 16, arg1));
        class283 var4 = new class283();
        if (var3 != null) {
            var4.method1889((byte) -121, new class25(var3));
        }
        class31.field408.method763(118, var4, (long) arg1);
        if (arg0 < 15) {
            field401 = -124;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field403++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method242(int arg0) {
        if (arg0 != 16) {
            method241(-95, 99);
        }
        field397 = null;
        field399 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leh;IIIIIIZ)V")
    public static final void method243(class81 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1169.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1169[var9] - class172.field2696;
            int var23 = arg0.field1172[var9] - client.field2328;
            int var24 = arg0.field1175[var9] - class82.field1285;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1168 != null) {
                class81.field1176[var9] = var25;
                class81.field1174[var9] = var28;
                class81.field1188[var9] = var29;
            }
            class81.field1177[var9] = (var25 << 9) / var29 + class171.field2673;
            class81.field1171[var9] = (var28 << 9) / var29 + class171.field2682;
        }
        class171.field2674 = 0;
        int var10 = arg0.field1178.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1178[var11];
            int var13 = arg0.field1185[var11];
            int var14 = arg0.field1182[var11];
            int var15 = class81.field1177[var12];
            int var16 = class81.field1177[var13];
            int var17 = class81.field1177[var14];
            int var18 = class81.field1171[var12];
            int var19 = class81.field1171[var13];
            int var20 = class81.field1171[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class78.field1109 && class115.method764(class171.field2673 + class135.field1964, class5.field74 + class171.field2682, var18, var19, var20, var15, var16, var17)) {
                    class139.field2050 = arg5;
                    client.field2314 = arg6;
                }
                if (!arg7) {
                    class171.field2679 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class171.field2684 || var16 > class171.field2684 || var17 > class171.field2684) {
                        class171.field2679 = true;
                    }
                    if (arg0.field1168 == null || arg0.field1168[var11] == -1) {
                        if (arg0.field1187[var11] != 12345678) {
                            class171.method1195(var18, var19, var20, var15, var16, var17, arg0.field1187[var11], arg0.field1181[var11], arg0.field1170[var11]);
                        }
                    } else if (!class184.field2893) {
                        int var21 = class171.field2689.method259((byte) -115, arg0.field1168[var11]);
                        class171.method1195(var18, var19, var20, var15, var16, var17, class226.method1542(var21, arg0.field1187[var11]), class226.method1542(var21, arg0.field1181[var11]), class226.method1542(var21, arg0.field1170[var11]));
                    } else if (arg0.field1173) {
                        class171.method1199(var18, var19, var20, var15, var16, var17, arg0.field1187[var11], arg0.field1181[var11], arg0.field1170[var11], class81.field1176[0], class81.field1176[1], class81.field1176[3], class81.field1174[0], class81.field1174[1], class81.field1174[3], class81.field1188[0], class81.field1188[1], class81.field1188[3], arg0.field1168[var11]);
                    } else {
                        class171.method1199(var18, var19, var20, var15, var16, var17, arg0.field1187[var11], arg0.field1181[var11], arg0.field1170[var11], class81.field1176[var12], class81.field1176[var13], class81.field1176[var14], class81.field1174[var12], class81.field1174[var13], class81.field1174[var14], class81.field1188[var12], class81.field1188[var13], class81.field1188[var14], arg0.field1168[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IC)Z")
    public static final boolean method244(int arg0, char arg1) {
        field400++;
        int var2 = -112 / ((arg0 + 8) / 52);
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
