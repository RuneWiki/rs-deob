import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[Lv;")
    public static class146[] field1805 = new class146[100];

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lv;")
    public static class146 field1811 = class159.method1226((byte) -37, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lv;")
    public static class146 field1812 = class159.method1226((byte) -37, "Titelbild geladen)3");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1819 = 0;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ldc;")
    public static class25 field1815;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    public static int[] field1810;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method569(int arg0, int arg1) {
        field1807++;
        if (arg1 <= 40) {
            method571(-128, 16, null, 74, (byte) 76, -98, 49, 74);
        }
        if (arg0 == 100 && class66.field1483 > 0) {
            byte[] var2 = class121.field2814[--class66.field1483];
            class121.field2814[class66.field1483] = null;
            return var2;
        } else if (arg0 == 5000 && class95.field2271 > 0) {
            byte[] var3 = class110.field2610[--class95.field2271];
            class110.field2610[class95.field2271] = null;
            return var3;
        } else if (arg0 == 30000 && class97.field2345 > 0) {
            byte[] var4 = class31.field662[--class97.field2345];
            class31.field662[class97.field2345] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method570(boolean arg0) {
        field1812 = null;
        field1811 = null;
        if (arg0) {
            field1806 = 111;
        }
        field1810 = null;
        field1815 = null;
        field1805 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILdd;IBIII)V")
    public static final void method571(int arg0, int arg1, class26 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (class35.field808) {
            class103.field2512 = 32;
        } else {
            class103.field2512 = 0;
        }
        if (arg4 != 50) {
            return;
        }
        field1822++;
        class35.field808 = false;
        if (class146.field3386 != 0) {
            if (arg1 <= arg0 && arg0 < arg1 + 16 && arg6 <= arg7 && arg7 < arg6 + 16) {
                arg2.field505 -= 4;
                class75.method567((byte) 112, arg2);
            } else if (arg1 <= arg0 && arg0 < arg1 + 16 && arg5 + arg6 - 16 <= arg7 && arg7 < arg6 + arg5) {
                arg2.field505 += 4;
                class75.method567((byte) 119, arg2);
            } else if (arg1 - class103.field2512 <= arg0 && class103.field2512 + arg1 + 16 > arg0 && arg6 + 16 <= arg7 && arg5 + arg6 - 16 > arg7) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg6 - var8 / 2 - 16;
                int var10 = arg5 - var8 - 32;
                arg2.field505 = (arg3 - arg5) * var9 / var10;
                class75.method567((byte) 127, arg2);
                class35.field808 = true;
            }
        }
        if (class148.field3447 == 0) {
            return;
        }
        int var11 = arg2.field543;
        if (arg0 >= arg1 - var11 && arg6 <= arg7 && arg0 < arg1 + 16 && arg5 + arg6 >= arg7) {
            arg2.field505 += class148.field3447 * 45;
            class75.method567((byte) 120, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method572(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 22) {
            field1805 = null;
        }
        field1816++;
        boolean var4 = true;
        class95 var5 = new class95(arg1);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method759((byte) 127);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var5.method759((byte) 123);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = var9 >> 6 & 0x3F;
                    int var14 = arg2 + var13;
                    int var15 = var12 + arg0;
                    int var16 = var5.method790((byte) 73) >> 2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class69 var17 = class124.method928(arg3 ^ 0xFFFFFFE9, var6);
                        if (var16 != 22 || !class91.field2196 || var17.field1605 != 0 || var17.field1589 == 1 || var17.field1613) {
                            var8 = true;
                            if (!var17.method500(-4)) {
                                class159.field3652++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method759((byte) 122);
                if (var10 == 0) {
                    break;
                }
                var5.method790((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lv;ZLdd;)Lv;")
    public static final class146 method573(class146 arg0, boolean arg1, class26 arg2) {
        if (!arg1) {
            method571(-24, 116, null, -104, (byte) 9, -74, -86, 57);
        }
        field1809++;
        if (arg0.method1090(class145.field3314, 0) == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method1090(class138.field3136, 0);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method1090(class125.field2914, 0);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method1090(class159.field3650, 0);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method1090(class79.field1954, 0);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method1090(class48.field1102, 0);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method1090(class98.field2378, 0);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class146 var9 = class158.field3633;
                                                    if (class159.field3661 != null) {
                                                        var9 = class3.method20(class159.field3661.field869, (byte) 87);
                                                        try {
                                                            if (class159.field3661.field870 != null) {
                                                                byte[] var10 = ((String) class159.field3661.field870).getBytes("ISO-8859-1");
                                                                var9 = class113.method882(0, var10, (byte) 124, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg0 = class71.method509(new class146[] { arg0.method1105(var8, -106, 0), var9, arg0.method1103(true, var8 + 4) }, (byte) 54);
                                                }
                                            }
                                            arg0 = class71.method509(new class146[] { arg0.method1105(var7, -111, 0), class59.method408(class38.method258(!arg1, arg2, 4), 10), arg0.method1103(arg1, var7 + 2) }, (byte) 127);
                                        }
                                    }
                                    arg0 = class71.method509(new class146[] { arg0.method1105(var6, -56, 0), class59.method408(class38.method258(!arg1, arg2, 3), 83), arg0.method1103(true, var6 + 2) }, (byte) -106);
                                }
                            }
                            arg0 = class71.method509(new class146[] { arg0.method1105(var5, 97, 0), class59.method408(class38.method258(false, arg2, 2), 77), arg0.method1103(true, var5 + 2) }, (byte) 65);
                        }
                    }
                    arg0 = class71.method509(new class146[] { arg0.method1105(var4, 93, 0), class59.method408(class38.method258(false, arg2, 1), 48), arg0.method1103(arg1, var4 + 2) }, (byte) -73);
                }
            }
            arg0 = class71.method509(new class146[] { arg0.method1105(var3, 123, 0), class59.method408(class38.method258(false, arg2, 0), 38), arg0.method1103(true, var3 + 2) }, (byte) -107);
        }
    }
}
