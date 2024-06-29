import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class136 extends OutputStream {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2110 = "flash1:";

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lwf;")
    public static class306 field2111;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lwf;")
    public static class306 field2116;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
    public static int[] field2115;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[[Lqa;")
    public static class217[][] field2118;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 11)
    public static void method927(int arg0) {
        field2116 = null;
        field2111 = null;
        field2110 = null;
        if (arg0 <= 33) {
            field2111 = (class306) null;
        }
        field2115 = null;
        field2118 = (class217[][]) null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V", line = 27)
    public static final void method928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class64.field963; var5++) {
            if (class167.field2563[var5] + class15.field159[var5] > arg1 && class15.field159[var5] < arg1 + arg2 && class233.field3750[var5] + class194.field2932[var5] > arg4 && class194.field2932[var5] < (arg4 + arg3)) {
                class2.field12[var5] = true;
            }
        }
        if (arg0 != 713) {
            field2116 = (class306) null;
        }
        field2117++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIZI)V", line = 48)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        for (int var9 = 0; var9 < class23.field293.field1862; var9++) {
            if (class23.field293.method824(var9, 127)) {
                int[] var10 = class205.field3110.method1352((byte) 76, class23.field293.field1874[var9] >> 14 & 0x3FFF, (class23.field293.field1874[var9] & 0x3B1F2E8F) >> 28, class23.field293.field1874[var9] & 0x3FFF);
                if (var10 != null) {
                    int var11 = class338.field5233 + class129.field2021 - var10[2] - 1;
                    int var12 = var10[1] - class78.field1161;
                    int var13 = (var12 - arg8) * (arg4 - arg6) / (arg0 - arg8) + arg6;
                    int var14 = arg2 + ((arg1 - arg2) * (var11 - arg5) / (arg3 - arg5));
                    int var15 = class23.field293.method825(var9, 123);
                    int var16 = 16777215;
                    class8 var17 = null;
                    if (var15 == 0) {
                        if ((double) class276.field4253 == 3.0D) {
                            var17 = class310.field4910;
                        }
                        if ((double) class276.field4253 == 4.0D) {
                            var17 = class152.field2400;
                        }
                        if ((double) class276.field4253 == 6.0D) {
                            var17 = class312.field4937;
                        }
                        if ((double) class276.field4253 >= 8.0D) {
                            var17 = class22.field272;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class276.field4253 == 3.0D) {
                            var17 = class312.field4937;
                        }
                        if ((double) class276.field4253 == 4.0D) {
                            var17 = class22.field272;
                        }
                        if ((double) class276.field4253 == 6.0D) {
                            var17 = class47.field672;
                        }
                        if ((double) class276.field4253 >= 8.0D) {
                            var17 = class305.field4777;
                        }
                    }
                    if (var15 == 2) {
                        if ((double) class276.field4253 == 3.0D) {
                            var17 = class47.field672;
                        }
                        var16 = 16755200;
                        if ((double) class276.field4253 == 4.0D) {
                            var17 = class305.field4777;
                        }
                        if ((double) class276.field4253 == 6.0D) {
                            var17 = class288.field4405;
                        }
                        if ((double) class276.field4253 >= 8.0D) {
                            var17 = class92.field1428;
                        }
                    }
                    if (class23.field293.field1868[var9] != -1) {
                        var16 = class23.field293.field1868[var9];
                    }
                    if (var17 != null) {
                        int var18 = class342.field5329.method1235(class23.field293.field1857[var9], (int[]) null, class91.field1419);
                        int var19 = var14 - var17.method50() * (var18 - 1) / 2;
                        int var20 = var19 + var17.method47() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class91.field1419[var21];
                            if ((var18 - 1) > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method51(var22, var13, var20, var16, true);
                            var20 += var17.method50();
                        }
                    }
                }
            }
        }
        if (!arg7) {
            method929(-24, -39, -18, 41, 126, 94, -107, true, -25);
        }
        field2119++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIBIIIIII)V", line = 173)
    public static final void method930(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class208 var10 = null;
        field2113++;
        for (class208 var11 = (class208) class203.field3069.method10((byte) 73); var11 != null; var11 = (class208) class203.field3069.method13((byte) -32)) {
            if (var11.field3305 == arg1 && var11.field3316 == arg0 && var11.field3322 == arg8 && var11.field3314 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class208();
            var10.field3305 = arg1;
            var10.field3314 = arg9;
            var10.field3322 = arg8;
            var10.field3316 = arg0;
            class95.method650(var10, 1);
            class203.field3069.method7((byte) -51, var10);
        }
        var10.field3309 = arg7;
        var10.field3320 = arg6;
        var10.field3323 = arg4;
        var10.field3311 = arg5;
        int var12 = 21 / ((3 - arg3) / 60);
        var10.field3318 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "write", descriptor = "(I)V", line = 214)
    public final void write(int arg0) throws IOException {
        field2120++;
        throw new IOException();
    }
}
