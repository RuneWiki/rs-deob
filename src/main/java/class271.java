import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class271 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "S")
    public static short field4573 = 32767;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lhi;")
    public static class82 field4577 = class276.method1923(false, 160);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[B", line = 5)
    public static final synchronized byte[] method1897(int arg0, int arg1) {
        field4575++;
        if (arg0 == 100 && class163.field2837 > 0) {
            byte[] var2 = class324.field5564[--class163.field2837];
            class324.field5564[class163.field2837] = null;
            return var2;
        }
        if (arg1 <= 30) {
            method1898(51);
        }
        if (arg0 == 5000 && class34.field509 > 0) {
            byte[] var3 = class65.field1019[--class34.field509];
            class65.field1019[class34.field509] = null;
            return var3;
        } else if (arg0 == 30000 && class153.field2585 > 0) {
            byte[] var4 = class20.field276[--class153.field2585];
            class20.field276[class153.field2585] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 80)
    public static final void method1898(int arg0) {
        class298.field5061 = 0;
        int var1 = (class168.field2932.field1689 >> 7) + class226.field3916;
        int var2 = (class168.field2932.field1685 >> 7) + class230.field3976;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class298.field5061 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class298.field5061 = 1;
        }
        field4576++;
        if (class298.field5061 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class298.field5061 = 0;
        }
        if (arg0 != 1) {
            method1897(-10, -8);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lme;Lhi;B)Lhi;", line = 105)
    public static final class82 method1899(class75 arg0, class82 arg1, byte arg2) {
        field4574++;
        if (arg2 != 123) {
            method1899((class75) null, (class82) null, (byte) -85);
        }
        if (arg1.method563(arg2 - 42, class253.field4357) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method563(arg2 ^ 0x17, class68.field1063);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method563(99, class214.field3726);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method563(98, class24.field331);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method563(87, class26.field346);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method563(83, class201.field3445);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method563(124, class52.field843);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class82 var9 = class129.field2247;
                                                    if (class75.field1300 != null) {
                                                        var9 = class331.method2259(arg2 ^ 0x84, class75.field1300.field5123);
                                                        try {
                                                            if (class75.field1300.field5122 != null) {
                                                                byte[] var10 = ((String) class75.field1300.field5122).getBytes("ISO-8859-1");
                                                                var9 = class14.method78(var10.length, arg2 ^ 0x36, 0, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class29.method182(-6039, new class82[] { arg1.method573(0, 119, var8), var9, arg1.method558((byte) -66, var8 + 4) });
                                                }
                                            }
                                            arg1 = class29.method182(arg2 - 6162, new class82[] { arg1.method573(0, 55, var7), class21.method148((byte) -96, class98.method679(4, arg0, -1)), arg1.method558((byte) -66, var7 + 2) });
                                        }
                                    }
                                    arg1 = class29.method182(-6039, new class82[] { arg1.method573(0, arg2 - 46, var6), class21.method148((byte) -90, class98.method679(3, arg0, arg2 ^ -124)), arg1.method558((byte) -66, var6 + 2) });
                                }
                            }
                            arg1 = class29.method182(-6039, new class82[] { arg1.method573(0, 97, var5), class21.method148((byte) -119, class98.method679(2, arg0, -1)), arg1.method558((byte) -66, var5 + 2) });
                        }
                    }
                    arg1 = class29.method182(-6039, new class82[] { arg1.method573(0, 66, var4), class21.method148((byte) -72, class98.method679(1, arg0, arg2 - 124)), arg1.method558((byte) -66, var4 + 2) });
                }
            }
            arg1 = class29.method182(arg2 ^ 0xFFFFE812, new class82[] { arg1.method573(0, 58, var3), class21.method148((byte) -120, class98.method679(0, arg0, -1)), arg1.method558((byte) -66, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 206)
    public static void method1900(int arg0) {
        if (arg0 != 0) {
            method1897(31, -51);
        }
        field4577 = null;
    }
}
