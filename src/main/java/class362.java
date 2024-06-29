import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class362 extends class333 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
    public boolean field4850;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field4851;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lwd;")
    public static class357 field4853 = new class357(13, 0, 1, 0);

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lsb;")
    public static class305 field4856 = new class305(7, -1);

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "F")
    public static float field4858;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lwn;")
    public static class236 field4859;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILjava/lang/Class;)Let;")
    public static final class613 method2121(int arg0, int arg1, int arg2, Class arg3) {
        class499 var4 = class487.field7044[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class245 var5 = var4.field7215; var5 != null; var5 = var5.field3027) {
            class613 var6 = var5.field3029;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8635 == arg1 && var6.field8627 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method2122(byte arg0) {
        field4856 = null;
        field4853 = null;
        if (arg0 <= 104) {
            method2122((byte) -4);
        }
        field4859 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static final void method2123(boolean arg0) {
        if (class323.field3974 < 102) {
            class323.field3974 += 6;
        }
        field4849++;
        if (class100.field1076 != -1 && class419.field5593 < class557.method3157(-72)) {
            for (int var1 = class100.field1076; var1 < class441.field6209.length; var1++) {
                if (class441.field6209[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class441.field6209[var1].substring(6));
                    } catch (Exception var15) {
                    }
                    class415.method2335("Pausing for " + var2 + " seconds...", 11);
                    class100.field1076 = var1 + 1;
                    class419.field5593 = (long) (var2 * 1000) + class557.method3157(-68);
                    return;
                }
                class222.field2755 = class441.field6209[var1];
                class87.method448(2, false);
            }
            class100.field1076 = -1;
        }
        if (class289.field3612 != 0) {
            class406.field5429 -= class289.field3612 * 5;
            if (class90.field903 <= class406.field5429) {
                class406.field5429 = class90.field903 - 1;
            }
            class289.field3612 = 0;
            if (class406.field5429 < 0) {
                class406.field5429 = 0;
            }
        }
        int var3 = 0;
        if (arg0) {
            field4853 = null;
        }
        while (class557.field7953 > var3) {
            class159 var4 = class537.field7551[var3];
            int var5 = var4.method866(-97);
            char var6 = var4.method868(10943);
            int var7 = var4.method864((byte) -46);
            if (var5 == 84) {
                class87.method448(2, false);
            }
            if (var5 == 80) {
                class87.method448(2, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class128.field1437 != null) {
                    String var13 = "";
                    for (int var14 = class210.field2549.length - 1; var14 >= 0; var14--) {
                        if (class210.field2549[var14] != null && class210.field2549[var14].length() > 0) {
                            var13 = var13 + class210.field2549[var14] + '\n';
                        }
                    }
                    class128.field1437.setContents(new StringSelection(var13), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class128.field1437 != null) {
                    Transferable var8 = class128.field1437.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class182.method1105('\n', (byte) -75, var9);
                                if (var10.length <= 1) {
                                    class222.field2755 = class222.field2755 + var9;
                                } else {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        if (var10[var11].startsWith("pause")) {
                                            int var12 = 5;
                                            try {
                                                var12 = Integer.parseInt(var10[var11].substring(6));
                                            } catch (Exception var16) {
                                            }
                                            class415.method2335("Pausing for " + var12 + " seconds...", 11);
                                            class100.field1076 = var11 + 1;
                                            class441.field6209 = var10;
                                            class419.field5593 = class557.method3157(-56) + (long) (var12 * 1000);
                                            return;
                                        }
                                        class222.field2755 = var10[var11];
                                        class87.method448(2, false);
                                    }
                                }
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            } else if (var5 == 85 && class68.field678 > 0) {
                class222.field2755 = class222.field2755.substring(0, class68.field678 - 1) + class222.field2755.substring(class68.field678);
                class68.field678--;
            } else if (var5 == 101 && class68.field678 < class222.field2755.length()) {
                class222.field2755 = class222.field2755.substring(0, class68.field678) + class222.field2755.substring(class68.field678 + 1);
            } else if (var5 == 96 && class68.field678 > 0) {
                class68.field678--;
            } else if (var5 == 97 && class68.field678 < class222.field2755.length()) {
                class68.field678++;
            } else if (var5 == 102) {
                class68.field678 = 0;
            } else if (var5 == 103) {
                class68.field678 = class222.field2755.length();
            } else if (var5 == 104 && class311.field3846 < class210.field2549.length) {
                class311.field3846++;
                class38.method198(!arg0);
                class68.field678 = class222.field2755.length();
            } else if (var5 == 105 && class311.field3846 > 0) {
                class311.field3846--;
                class38.method198(true);
                class68.field678 = class222.field2755.length();
            } else if (class103.method563(86, var6) || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class222.field2755 = class222.field2755.substring(0, class68.field678) + class537.field7551[var3].method868(10943) + class222.field2755.substring(class68.field678);
                class68.field678++;
            }
            var3++;
        }
        class131.field1472 = 0;
        class557.field7953 = 0;
        class64.method346(8);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIZ)V")
    public class362(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4852 = arg1;
        this.field4850 = arg5;
        this.field4851 = arg4;
        this.field4855 = arg3;
        this.field4854 = arg2;
        this.field4848 = arg0;
    }
}
