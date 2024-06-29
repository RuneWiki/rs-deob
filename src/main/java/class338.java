import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class338 extends class5 {

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "[B")
    public byte[] field5252;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
    public static int[] field5249 = new int[50];

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field5251 = -2;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field5255 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Ljd;")
    public static class95 field5254;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;Lmn;)Ljava/lang/String;", line = 11)
    public static final String method2356(int arg0, String arg1, class161 arg2) {
        if (arg1.indexOf("%") != -1) {
            label58: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        String var9 = "";
                                                        if (class43.field620 != null) {
                                                            if (class43.field620.field3186 == null) {
                                                                var9 = class115.method884(class43.field620.field3184, (byte) -4);
                                                            } else {
                                                                var9 = (String) class43.field620.field3186;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class183.method1362(class40.method305(arg0 - 1, 4, arg2), true) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class183.method1362(class40.method305(-1, 3, arg2), true) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class183.method1362(class40.method305(arg0 - 1, 2, arg2), true) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class183.method1362(class40.method305(~arg0, 1, arg2), true) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class183.method1362(class40.method305(-1, 0, arg2), true) + arg1.substring(var3 + 2);
            }
        }
        if (arg0 != 0) {
            method2357((byte) -108);
        }
        field5248++;
        return arg1;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)[Ljn;", line = 101)
    public static final class327[] method2357(byte arg0) {
        field5247++;
        class327[] var1 = new class327[class131.field2005];
        if (arg0 != 93) {
            return (class327[]) null;
        }
        for (int var2 = 0; var2 < class131.field2005; var2++) {
            if (class73.field1058) {
                var1[var2] = new class66(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], class220.field3362[var2], class82.field1212);
            } else {
                var1[var2] = new class42(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], class220.field3362[var2], class82.field1212);
            }
        }
        class245.method1684(255);
        return var1;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 131)
    public static void method2358(int arg0) {
        field5249 = null;
        field5254 = null;
        if (arg0 >= -61) {
            field5255 = -19;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V", line = 141)
    public class338(byte[] arg0) {
        this.field5252 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)C", line = 152)
    public static final char method2359(byte arg0, int arg1) {
        int var2 = arg0 & 0xFF;
        field5256++;
        if (arg1 != 3213) {
            field5255 = -10;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class181.field2872[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
