import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class28 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
    public static int[] field277 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lgi;")
    public static class705 field280 = new class705();

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 12)
    public static void method160(byte arg0) {
        field280 = null;
        if (arg0 == 33) {
            field277 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V", line = 27)
    public static final void method162(byte arg0) {
        field278++;
        int var1 = -105 % ((54 - arg0) / 42);
        int var2 = class361.field5245.length;
        for (int var3 = 0; var3 < var2; var3++) {
            if (class361.field5245[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class318.field4520; var5++) {
                    if (class87.field1227[var5] == class649.field8753[var3]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class87.field1227[class318.field4520] = class649.field8753[var3];
                    var4 = class318.field4520++;
                }
                class254 var6 = new class254(class361.field5245[var3]);
                int var7 = 0;
                while (class361.field5245[var3].length > var6.field3725 && var7 < 511 && class178.field2352 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method1728((byte) 52);
                    int var10 = var9 >> 14;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 & 0x3F;
                    int var13 = (class649.field8753[var3] >> 8) * 64 + var11 - class120.field1625;
                    int var14 = (class649.field8753[var3] & 0xFF) * 64 + var12 - class259.field3849;
                    class304 var15 = class107.field1507.method3587(var6.method1728((byte) 40), 0);
                    class316 var16 = (class316) class176.field2326.method1248(92, (long) var8);
                    if (var16 == null && (var15.field4316 & 0x1) > 0 && class786.field10794 == var10 && var13 >= 0 && class102.field1467 > (var13 + var15.field4300) && var14 >= 0 && (var15.field4300 + var14) < class393.field5663) {
                        class22 var17 = new class22();
                        var17.field6146 = var8;
                        class316 var18 = new class316(var17);
                        class176.field2326.method1247(4070, (long) var8, var18);
                        class110.field1528[class181.field2380++] = var18;
                        class245.field3206[class178.field2352++] = var8;
                        var17.field6141 = class572.field7788;
                        var17.method132((byte) -60, var15);
                        var17.method2559((byte) -81, var17.field217.field4300);
                        var17.field6101 = var17.field217.field4299 << 3;
                        var17.method2561(false, true, var17.field217.field4280 + 4 << 11 & 0x3BB7);
                        var17.method115(true, var17.method2563(-12840), var14, var10, var13, (byte) 58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIC)C", line = 130)
    public static final char method163(int arg0, int arg1, char arg2) {
        if (arg1 != -1) {
            return 'Y';
        }
        field279++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIZII)J", line = 210)
    public static final long method164(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class79.field1090.clear();
        field276++;
        if (!arg4) {
            field281 = 68;
        }
        class79.field1090.set(arg3, arg6, arg0, arg5, arg2, arg1);
        return class79.field1090.getTime().getTime();
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z", line = 229)
    public static final boolean method165(byte arg0, int arg1, int arg2) {
        field275++;
        if (arg0 != 70) {
            method163(-90, -43, (char) 65498);
        }
        return class319.method2066(arg1, (byte) 116, arg2) || class424.method2554((byte) -11, arg1, arg2);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lqo;I)Lqo;")
    public abstract class24 method161(class24 arg0, int arg1);
}
