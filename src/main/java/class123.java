import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class123 extends OutputStream {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Llc;")
    public static class143 field2160 = class66.method374("Fallen lassen", -1);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[[[I")
    public static int[][][] field2155;

    @OriginalMember(owner = "client!d", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2157++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method744(int arg0) {
        if (arg0 == -19) {
            field2155 = null;
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLvh;I)I")
    public static final int method745(boolean arg0, class43 arg1, int arg2) {
        field2156++;
        if (arg1.field815 == null || arg1.field815.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg1.field815[arg2];
            if (arg0) {
                method746(82, 0, -107, 65, -123, -6, 2);
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class224.field4067[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class221.field4002[var3[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class259.field4647[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class43 var12 = class27.method186(1341, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class262.method1743(var13, 17366).field2679 || class110.field1943)) {
                        for (int var14 = 0; var14 < var12.field737.length; var14++) {
                            if ((var13 + 1) == var12.field737[var14]) {
                                var9 += var12.field889[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class148.field2691[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class255.field4574[class221.field4002[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class148.field2691[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class229.field4195.field510;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class172.field3086[var15]) {
                            var9 += class221.field4002[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class43 var18 = class27.method186(1341, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class262.method1743(var19, 17366).field2679 || class110.field1943)) {
                        for (int var20 = 0; var20 < var18.field737.length; var20++) {
                            if (var19 + 1 == var18.field737[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class43.field858;
                }
                if (var7 == 12) {
                    var9 = class167.field2980;
                }
                if (var7 == 13) {
                    int var21 = class148.field2691[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class48.method291((byte) -43, var23);
                }
                if (var7 == 18) {
                    var9 = (class229.field4195.field4178 >> 7) + class148.field2733;
                }
                if (var7 == 19) {
                    var9 = (class229.field4195.field4108 >> 7) + class141.field2466;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2159++;
        int var7 = class83.method476(true, class188.field3398, arg0, class239.field4321);
        int var8 = class83.method476(true, class188.field3398, arg5, class239.field4321);
        int var9 = class83.method476(true, class31.field481, arg4, class9.field173);
        int var10 = class83.method476(true, class31.field481, arg1, class9.field173);
        int var11 = class83.method476(true, class188.field3398, arg0 + arg3, class239.field4321);
        int var12 = class83.method476(true, class188.field3398, arg5 - arg3, class239.field4321);
        for (int var13 = var7; var13 < var11; var13++) {
            class289.method1927(class15.field268[var13], arg2, var9, -124, var10);
        }
        int var14 = var8;
        if (arg6 != -5) {
            field2158 = 84;
        }
        while (var12 < var14) {
            class289.method1927(class15.field268[var14], arg2, var9, -98, var10);
            var14--;
        }
        int var15 = class83.method476(true, class31.field481, arg3 + arg4, class9.field173);
        int var16 = class83.method476(true, class31.field481, arg1 - arg3, class9.field173);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class15.field268[var17];
            class289.method1927(var18, arg2, var9, -124, var15);
            class289.method1927(var18, arg2, var16, -83, var10);
        }
    }
}
