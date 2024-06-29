import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class185 extends class7 {

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public int field3004 = 0;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "S")
    public static short field3001 = 32767;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "[I")
    public static int[] field3009 = new int[50];

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field3005 = 100;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3011;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field3012;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1266(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjg;)V", line = 3)
    public final void method1257(byte arg0, class186 arg1) {
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                if (arg0 != 62) {
                    return;
                }
                field3002++;
                return;
            }
            this.method1264(var3, (byte) 11, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 24)
    public static final void method1258(int arg0) {
        for (int var1 = arg0; var1 < class21.field274; var1++) {
            int var2 = class208.field3349[var1];
            class219 var3 = class216.field3517[var2];
            int var4 = class158.field2514.method1322(false);
            if ((var4 & 0x2) != 0) {
                var4 += class158.field2514.method1322(false) << 8;
            }
            class396.method2494(var3, var2, var4, 125);
        }
        field3003++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII)Z", line = 50)
    public static final boolean method1259(int arg0, byte arg1, int arg2, int arg3) {
        field3010++;
        int var4 = 59 / ((55 - arg1) / 47);
        class149 var5 = (class149) class139.method1016(arg2, arg0, arg3);
        boolean var6 = true;
        if (var5 != null) {
            var6 &= class132.method969(var5, false);
        }
        class149 var7 = (class149) class12.method117(arg2, arg0, arg3, field3012 == null ? (field3012 = method1266("up")) : field3012);
        if (var7 != null) {
            var6 &= class132.method969(var7, false);
        }
        class149 var8 = (class149) class316.method2107(arg2, arg0, arg3);
        if (var8 != null) {
            var6 &= class132.method969(var8, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V", line = 77)
    public static final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class89.field1120 = arg1;
        class364.field5541 = arg0;
        class217.field3557 = arg4;
        class181.field2966 = arg3;
        class136.field2123 = arg5;
        field3008++;
        if (class181.field2966 >= 100) {
            int var6 = class364.field5541 * 128 + 64;
            int var7 = class136.field2123 * 128 + 64;
            int var8 = class58.method386(class266.field4286, (byte) -114, var6, var7) - class89.field1120;
            int var9 = var6 - class427.field6301;
            int var10 = var8 - class379.field5733;
            int var11 = var7 - class290.field4631;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class396.field5928 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class108.field1516 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class396.field5928 < 1024) {
                class396.field5928 = 1024;
            }
            if (class396.field5928 > 3072) {
                class396.field5928 = 3072;
            }
        }
        class13.field194 = arg2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZI)V", line = 118)
    public static final void method1261(boolean arg0, int arg1, boolean arg2, int arg3) {
        field3011++;
        if (!arg0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class29.field339 = arg2;
        class234.field3902 = arg1;
        class413.field6106 = arg3;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)Z", line = 141)
    public static final boolean method1262(boolean arg0) {
        for (int var1 = class198.field3193; var1 < class81.field1006; var1++) {
            class232[][] var2 = class423.field6252[var1];
            for (int var3 = -class374.field5649; var3 <= 0; var3++) {
                int var4 = class235.field3937 + var3;
                int var5 = class235.field3937 - var3;
                if (var4 >= class255.field4137 || var5 < class391.field5871) {
                    for (int var6 = -class374.field5649; var6 <= 0; var6++) {
                        int var7 = class181.field2959 + var6;
                        int var8 = class181.field2959 - var6;
                        if (var4 >= class255.field4137) {
                            if (var7 >= class269.field4315) {
                                class232 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3886) {
                                    class341.field5266 = arg0;
                                    class264.field4255.method434(var9, -29009);
                                    class264.field4255.method436(-109);
                                }
                            }
                            if (var8 < class236.field3952) {
                                class232 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3886) {
                                    class341.field5266 = arg0;
                                    class264.field4255.method434(var10, -29009);
                                    class264.field4255.method436(-109);
                                }
                            }
                        }
                        if (var5 < class391.field5871) {
                            if (var7 >= class269.field4315) {
                                class232 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3886) {
                                    class341.field5266 = arg0;
                                    class264.field4255.method434(var11, -29009);
                                    class264.field4255.method436(-122);
                                }
                            }
                            if (var8 < class236.field3952) {
                                class232 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3886) {
                                    class341.field5266 = arg0;
                                    class264.field4255.method434(var12, -29009);
                                    class264.field4255.method436(-112);
                                }
                            }
                        }
                        if (class7.field95 == 0) {
                            if (class271.field4345) {
                                class264.field4255.method432(24, 32);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 250)
    public static final String method1263(Throwable arg0, int arg1) throws IOException {
        field3006++;
        String var3;
        if (arg0 instanceof class386) {
            class386 var2 = (class386) arg0;
            arg0 = var2.field5827;
            var3 = var2.field5834 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 32) {
            method1258(-9);
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLjg;)V", line = 344)
    private final void method1264(int arg0, byte arg1, class186 arg2) {
        if (arg1 != 11) {
            this.field3004 = 55;
        }
        field2999++;
        if (arg0 == 2) {
            this.field3004 = arg2.method1272((byte) -78);
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V", line = 371)
    public static void method1265(int arg0) {
        if (arg0 == -20473) {
            field3009 = null;
        }
    }
}
