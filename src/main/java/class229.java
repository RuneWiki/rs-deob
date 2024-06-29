import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class229 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[B")
    public static byte[] field4166 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field4168 = 1;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field4162 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lcc;")
    public static class209 field4170 = class95.method669(84, "unzap");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lsj;")
    public static class49 field4164;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        field4170 = null;
        field4164 = null;
        field4166 = null;
        int var1 = -21 / ((-arg0 - 46) / 42);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lga;I[BIIZI)V")
    public static final void method1603(int arg0, class170[] arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field4165++;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && (arg5 + var9) < 103 && arg7 + var10 > 0 && arg7 + var10 < 103) {
                            arg1[var8].field3103[arg5 + var9][arg7 + var10] = class27.method220(arg1[var8].field3103[arg5 + var9][arg7 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class106 var12 = new class106(arg3);
        for (int var13 = arg2; var13 < var11; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class124.method902(arg7 + var37, arg0, arg5 + var36, var12, arg6, 0, arg4, var13, (byte) -58);
                }
            }
        }
        boolean var14 = false;
        while (var12.field2108.length > var12.field2085) {
            int var15 = var12.method774((byte) 82);
            if (var15 != 129) {
                var12.field2085--;
                break;
            }
            for (int var21 = 0; var21 < 4; var21++) {
                byte var22 = var12.method777(85);
                if (var22 == 0) {
                    int var23 = arg5 + 64;
                    int var24 = arg5;
                    int var25 = arg7 + 64;
                    int var26 = arg7;
                    if (arg5 < 0) {
                        var24 = 0;
                    } else if (arg5 >= 104) {
                        var24 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 >= 104) {
                        var25 = 104;
                    }
                    if (arg7 < 0) {
                        var26 = 0;
                    } else if (arg7 >= 104) {
                        var26 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    while (var24 < var23) {
                        while (var26 < var25) {
                            class110.field2222[var21][var24][var26] = 0;
                            var26++;
                        }
                        var24++;
                    }
                } else if (var22 == 1) {
                    for (int var31 = 0; var31 < 64; var31 += 4) {
                        for (int var32 = 0; var32 < 64; var32 += 4) {
                            byte var33 = var12.method777(87);
                            for (int var34 = arg5 + var31; var34 < var31 + arg5 + 4; var34++) {
                                for (int var35 = arg7 + var32; var35 < var32 + arg7 + 4; var35++) {
                                    if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                        class110.field2222[var21][var34][var35] = var33;
                                    }
                                }
                            }
                        }
                    }
                } else if (var22 == 2 && var21 > 0) {
                    int var27 = arg5;
                    if (arg5 < 0) {
                        var27 = 0;
                    } else if (arg5 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg5 + 64;
                    int var29 = arg7;
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 >= 104) {
                        var28 = 104;
                    }
                    int var30 = arg7 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    if (arg7 < 0) {
                        var29 = 0;
                    } else if (arg7 >= 104) {
                        var29 = 104;
                    }
                    while (var27 < var28) {
                        while (var29 < var30) {
                            class110.field2222[var21][var27][var29] = class110.field2222[var21 - 1][var27][var29];
                            var29++;
                        }
                        var27++;
                    }
                }
            }
            var14 = true;
        }
        if (var14) {
            return;
        }
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 16; var17++) {
                for (int var18 = 0; var18 < 16; var18++) {
                    int var19 = (arg7 >> 2) + var18;
                    int var20 = (arg5 >> 2) + var17;
                    if (var20 >= 0 && var20 < 26 && var19 >= 0 && var19 < 26) {
                        class110.field2222[var16][var20][var19] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lcc;B)Lcc;")
    public static final class209 method1604(class209[] arg0, byte arg1) {
        field4167++;
        if (arg1 <= 22) {
            field4168 = 100;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class34.method262(arg0, -676, 0, arg0.length);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lsj;I)V")
    public static final void method1605(class49 arg0, int arg1) {
        class159.field2892 = arg0;
        if (arg1 != 64) {
            method1604((class209[]) null, (byte) 16);
        }
        field4161++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1606(Throwable arg0, int arg1) throws IOException {
        if (arg1 != -17337) {
            method1602((byte) -4);
        }
        String var3;
        if (arg0 instanceof class235) {
            class235 var2 = (class235) arg0;
            arg0 = var2.field4226;
            var3 = var2.field4231 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        field4163++;
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }
}
