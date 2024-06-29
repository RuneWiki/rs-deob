import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class267 extends class129 {

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Lrc;")
    public static class9 field4315 = new class9(64);

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Lag;")
    public static class196 field4316;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Lsa;")
    public static class244 field4318;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Ljava/lang/String;")
    public String field4317;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[C")
    public char[] field4319;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "[C")
    public char[] field4322;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "[I")
    public int[] field4311;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "[I")
    public int[] field4313;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static final void method1753(byte arg0) {
        if (arg0 != -85) {
            field4323 = 70;
        }
        class201.field3302.method58(0);
        field4321++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method1754(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            field4315 = null;
        }
        for (int var9 = 0; var9 < class252.field4135.field3158; var9++) {
            if (class252.field4135.method1280(var9, (byte) 109)) {
                int[] var10 = class158.field2642.method265(class252.field4135.field3149[var9] & 0x3FFF, class252.field4135.field3149[var9] >> 14 & 0x3FFF, (class252.field4135.field3149[var9] & 0x3FDFD1E3) >> 28, 5);
                if (var10 != null) {
                    int var11 = class193.field3114 - (var10[2] - class83.field1514) - 1;
                    int var12 = var10[1] - class124.field2184;
                    int var13 = (arg3 - arg1) * (var11 - arg4) / (arg8 - arg4) + arg1;
                    int var14 = (var12 - arg0) * (arg7 - arg5) / (arg6 - arg0) + arg5;
                    int var15 = class252.field4135.method1275(var9, (byte) -24);
                    int var16 = 16777215;
                    class137 var17 = null;
                    if (var15 == 0) {
                        if ((double) class116.field2077 == 3.0D) {
                            var17 = class183.field2979;
                        }
                        if ((double) class116.field2077 == 4.0D) {
                            var17 = class91.field1613;
                        }
                        if ((double) class116.field2077 == 6.0D) {
                            var17 = class292.field4666;
                        }
                        if ((double) class116.field2077 >= 8.0D) {
                            var17 = class24.field380;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class116.field2077 == 3.0D) {
                            var17 = class292.field4666;
                        }
                        if ((double) class116.field2077 == 4.0D) {
                            var17 = class24.field380;
                        }
                        if ((double) class116.field2077 == 6.0D) {
                            var17 = class140.field2409;
                        }
                        if ((double) class116.field2077 >= 8.0D) {
                            var17 = class158.field2636;
                        }
                    }
                    if (var15 == 2) {
                        if ((double) class116.field2077 == 3.0D) {
                            var17 = class140.field2409;
                        }
                        var16 = 16755200;
                        if ((double) class116.field2077 == 4.0D) {
                            var17 = class158.field2636;
                        }
                        if ((double) class116.field2077 == 6.0D) {
                            var17 = class151.field2535;
                        }
                        if ((double) class116.field2077 >= 8.0D) {
                            var17 = class121.field2122;
                        }
                    }
                    if (class252.field4135.field3142[var9] != -1) {
                        var16 = class252.field4135.field3142[var9];
                    }
                    if (var17 != null) {
                        int var18 = field4318.method1632(class252.field4135.field3152[var9], (int[]) null, class11.field153);
                        int var19 = var13 - (var18 - 1) * var17.method966() / 2;
                        int var20 = var19 + var17.method967() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class11.field153[var21];
                            if (var18 - 1 > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method969(var22, var14, var20, var16, true);
                            var20 += var17.method966();
                        }
                    }
                }
            }
        }
        field4309++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILeh;I)V")
    private final void method1755(int arg0, class101 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4317 = arg1.method662((byte) 1);
        } else if (arg2 == 2) {
            int var4 = arg1.method669((byte) 36);
            this.field4311 = new int[var4];
            this.field4322 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4311[var5] = arg1.method677(false);
                byte var6 = arg1.method646(-125);
                this.field4322[var5] = var6 == 0 ? 0 : class104.method708(true, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method669((byte) 36);
            this.field4313 = new int[var7];
            this.field4319 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4313[var8] = arg1.method677(false);
                byte var9 = arg1.method646(-35);
                this.field4319[var8] = var9 == 0 ? 0 : class104.method708(true, var9);
            }
        }
        if (arg0 == 64) {
            field4314++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BC)I")
    public final int method1756(byte arg0, char arg1) {
        field4325++;
        if (this.field4313 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4313.length; var3++) {
            if (this.field4319[var3] == arg1) {
                return this.field4313[var3];
            }
        }
        if (arg0 != -103) {
            field4324 = -81;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1757(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 > -119) {
            return null;
        }
        field4310++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = arg2.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg0, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        int var11 = 0;
        StringBuffer var12 = new StringBuffer(var7);
        while (true) {
            int var13 = arg1.indexOf(arg0, var11);
            if (var13 < 0) {
                var12.append(arg1.substring(var11));
                return var12.toString();
            }
            var12.append(arg1.substring(var11, var13));
            var12.append(arg2);
            var11 = var13 + var5;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLeh;)V")
    public final void method1758(byte arg0, class101 arg1) {
        if (arg0 <= 5) {
            return;
        }
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                field4308++;
                return;
            }
            this.method1755(64, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        field4316 = null;
        field4318 = null;
        field4315 = null;
        if (arg0 >= -3) {
            field4315 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
    public final void method1760(int arg0) {
        if (this.field4313 != null) {
            for (int var2 = 0; var2 < this.field4313.length; var2++) {
                this.field4313[var2] = class112.method789(this.field4313[var2], 32768);
            }
        }
        field4320++;
        if (arg0 != -692) {
            field4316 = null;
        }
        if (this.field4311 != null) {
            for (int var3 = 0; var3 < this.field4311.length; var3++) {
                this.field4311[var3] = class112.method789(this.field4311[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(CI)I")
    public final int method1761(char arg0, int arg1) {
        field4312++;
        if (this.field4311 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field4311.length; var3++) {
            if (this.field4322[var3] == arg0) {
                return this.field4311[var3];
            }
        }
        return -1;
    }
}
