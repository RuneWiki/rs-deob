import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class78 extends class240 {

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
    public static boolean field1188 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lik;")
    public static class259 field1186 = new class259(2);

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "F")
    public static float field1198;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "J")
    public long field1191;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lja;")
    public static class64 field1200;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lpb;")
    public class78 field1195;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Lpb;")
    public class78 field1197;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[Lai;")
    public static class126[] field1199;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method570(String arg0, int arg1) {
        field1190++;
        if (arg1 <= 76) {
            method572((class296) null, (class64) null, (byte) -101, (class64) null);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class11.method97(arg0.charAt(var4), true) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V", line = 33)
    public final void method571(int arg0) {
        field1189++;
        if (this.field1197 == null) {
            return;
        }
        this.field1197.field1195 = this.field1195;
        this.field1195.field1197 = this.field1197;
        this.field1195 = null;
        this.field1197 = null;
        if (arg0 != 7) {
            method575(72, false, false, 2, true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Led;Lja;BLja;)V", line = 62)
    public static final void method572(class296 arg0, class64 arg1, byte arg2, class64 arg3) {
        class175.field2760 = arg3;
        field1185++;
        class269.field4195 = arg0;
        class176.field2764 = arg1;
        if (arg2 != 103) {
            return;
        }
        if (class176.field2764 != null) {
            class273.field4250 = class176.field2764.method465(1, 0);
        }
        if (class175.field2760 != null) {
            class85.field1288 = class175.field2760.method465(1, 0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V", line = 81)
    public static void method573(int arg0) {
        field1200 = null;
        field1199 = null;
        field1186 = null;
        if (arg0 != 21) {
            field1198 = 0.22487488F;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method574(boolean arg0) {
        field1194++;
        if (class316.field4932 == 0) {
            return;
        }
        try {
            if ((++class70.field1113) > 2000) {
                if (class127.field2032 != null) {
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                }
                if (class279.field4313 >= 1) {
                    class316.field4932 = 0;
                    class231.field3671 = -5;
                    return;
                }
                class70.field1113 = 0;
                class316.field4932 = 1;
                class279.field4313++;
                if (class42.field754 == class215.field3418) {
                    class42.field754 = class309.field4866;
                } else {
                    class42.field754 = class215.field3418;
                }
            }
            if (class316.field4932 == 1) {
                class178.field2785 = class83.field1235.method2224(class42.field754, class92.field1521, 45);
                class316.field4932 = 2;
            }
            if (class316.field4932 == 2) {
                if (class178.field2785.field387 == 2) {
                    throw new IOException();
                }
                if (class178.field2785.field387 != 1) {
                    return;
                }
                class127.field2032 = new class16((Socket) class178.field2785.field391, class83.field1235);
                class178.field2785 = null;
                class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                int var1 = class127.field2032.method138(-5380);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                if (var1 != 21) {
                    class316.field4932 = 0;
                    class231.field3671 = var1;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                }
                class316.field4932 = 3;
            }
            if (class316.field4932 == 3) {
                if (class127.field2032.method137((byte) 69) < 1) {
                    return;
                }
                class236.field3714 = new String[class127.field2032.method138(-5380)];
                class316.field4932 = 4;
            }
            if (class316.field4932 == 4) {
                if (class127.field2032.method137((byte) 85) < (class236.field3714.length * 8)) {
                    return;
                }
                class267.field4132.field1667 = 0;
                class127.field2032.method139(class267.field4132.field1661, -3, class236.field3714.length * 8, 0);
                for (int var2 = 0; var2 < class236.field3714.length; var2++) {
                    class236.field3714[var2] = class74.method555((byte) -96, class267.field4132.method723(21649));
                }
                class231.field3671 = 21;
                class316.field4932 = 0;
                class127.field2032.method131(-11918);
                class127.field2032 = null;
                return;
            }
        } catch (IOException var4) {
            if (class127.field2032 != null) {
                class127.field2032.method131(-11918);
                class127.field2032 = null;
            }
            if (class279.field4313 >= 1) {
                class316.field4932 = 0;
                class231.field3671 = -4;
            } else {
                class279.field4313++;
                class316.field4932 = 1;
                class70.field1113 = 0;
                if (class42.field754 == class215.field3418) {
                    class42.field754 = class309.field4866;
                } else {
                    class42.field754 = class215.field3418;
                }
            }
        }
        if (!arg0) {
            field1183 = 54;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZZIZ)Lja;", line = 255)
    public static final class64 method575(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg0 != 1000000) {
            return (class64) null;
        }
        field1192++;
        class103 var5 = null;
        if (class83.field1242 != null) {
            var5 = new class103(arg3, class83.field1242, class30.field498[arg3], 1000000);
        }
        class278.field4308[arg3] = class191.field3061.method2127(class102.field1723, (byte) 115, var5, arg3);
        if (arg2) {
            class278.field4308[arg3].method1568(-2);
        }
        return new class64(class278.field4308[arg3], arg4, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ[BIBIII[Lsj;I)V", line = 276)
    public static final void method576(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class56[] arg9, int arg10) {
        field1193++;
        class101 var11 = new class101(arg3);
        int var12 = -1;
        if (arg5 != -2) {
            method576(123, -103, false, (byte[]) null, -37, (byte) -67, 70, 124, -100, (class56[]) null, 34);
        }
        while (true) {
            int var13 = var11.method783((byte) 116);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method738(-957401312);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFCB) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method741(arg5 ^ 0xFFFFFFCD);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg1 == var18 && var17 >= arg4 && arg4 + 8 > var17 && arg10 <= var16 && arg10 + 8 > var16) {
                    class6 var22 = class28.method190(-115, var12);
                    int var23 = arg8 + class305.method2111(var22.field90, true, var22.field63, arg0, var21, var17 & 0x7, var16 & 0x7);
                    int var24 = class195.method1425(var16 & 0x7, (byte) -80, var17 & 0x7, var22.field63, var21, var22.field90, arg0) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class56 var25 = null;
                        if (!arg2) {
                            int var26 = arg7;
                            if ((class250.field3857[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class181.method1347(arg7, 53, arg0 + var21 & 0x3, arg2, var12, var20, arg7, !arg2, var23, var25, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIBII)V", line = 357)
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 34) {
            method579((class7[]) null, 41, (class64) null);
        }
        field1196++;
        if (class213.method1543(25641, arg2)) {
            client.method1787(class207.field3269[arg2], -1, arg4, arg3, arg0, arg1, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V", line = 371)
    public static final void method578(int arg0) {
        class83.field1241.method1837(-127);
        field1184++;
        if (arg0 < 29) {
            method577(108, 48, -20, -64, 16, (byte) 15, -120, 124);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([Lgk;ILja;)V", line = 388)
    public static final void method579(class7[] arg0, int arg1, class64 arg2) {
        if (arg1 != -3) {
            return;
        }
        class229.field3644 = arg2;
        class278.field4307 = arg0;
        class145.field2268 = new boolean[class278.field4307.length];
        field1187++;
        class54.field852.method1489(200);
        int var3 = class229.field3644.method487(false, "details");
        int[] var4 = class229.field3644.method477(var3, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class54.field852.method1493(-107, class301.method2096(new class101(class229.field3644.method467(var4[var5], 84, var3)), (byte) -25));
        }
    }
}
