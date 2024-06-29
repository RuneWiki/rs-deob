import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class282 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    public static int[] field4222 = new int[32];

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Z")
    public static boolean field4224 = true;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[Ljl;")
    public static class391[] field4226 = new class391[5];

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    public static boolean field4229;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4231;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[[Z")
    public static boolean[][] field4230;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method1998(byte arg0, int arg1) {
        field4219++;
        class263.field3960 = arg1;
        class450.field6534.method106((byte) -113);
        if (arg0 != 20) {
            field4229 = false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method1999(boolean arg0) {
        field4230 = null;
        if (arg0) {
            field4226 = null;
            field4231 = null;
            field4222 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method2000(int arg0) {
        field4225++;
        if (!class291.field4332) {
            return;
        }
        class258 var1 = class102.method849((byte) -105, class46.field751, class242.field3536);
        if (var1 != null && var1.field3777 != null) {
            class254 var2 = new class254();
            var2.field3678 = var1;
            var2.field3683 = var1.field3777;
            class216.method1636(var2);
        }
        class291.field4332 = false;
        if (arg0 > 11) {
            class436.field6354 = -1;
            class107.method947(true, var1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ICI)I")
    public static final int method2001(int arg0, char arg1, int arg2) {
        field4221++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        int var4 = 44 / ((-arg2 - 53) / 42);
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public static final void method2002(int arg0, int arg1) {
        field4220++;
        class221 var2 = class447.method2795(arg0, (byte) -49, arg1);
        var2.method1689(arg0 ^ 0xFFFFFF89);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method2003(String arg0, int arg1, Throwable arg2) {
        field4227++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class228.method1703(-1, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class399.method2546(93, var3);
            String var4 = class162.method1265(-1, "%3a", ":", var3);
            String var5 = class162.method1265(arg1 + 24829, "%40", "@", var4);
            String var6 = class162.method1265(-1, "%26", "&", var5);
            String var7 = class162.method1265(-1, "%23", "#", var6);
            if (class157.field2394.field2639 != null) {
                class131 var8 = class157.field2394.method1376(true, new URL(class157.field2394.field2639.getCodeBase(), "clienterror.ws?c=" + class354.field5041 + "&u=" + class359.field5118 + "&v1=" + class177.field2645 + "&v2=" + class177.field2646 + "&e=" + var7));
                while (var8.field2121 == 0) {
                    class134.method1106(1L, 10);
                }
                if (arg1 == -24830 && var8.field2121 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2125;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lqo;[IB[I[I)V")
    public static final void method2004(class127 arg0, int[] arg1, byte arg2, int[] arg3, int[] arg4) {
        field4223++;
        if (arg2 < 116) {
            field4226 = null;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field5646.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field5646[var9] = null;
                    } else {
                        class51 var10 = class113.method974(var6, (byte) -117);
                        int var11 = var10.field817;
                        class109 var12 = arg0.field5646[var9];
                        if (var12 != null) {
                            if (var12.field1789 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field5646[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1784 = 0;
                                    var12.field1781 = 0;
                                    var12.field1783 = var8;
                                    var12.field1776 = 1;
                                    var12.field1788 = 0;
                                    class50.method399(0, arg0.field6519, (byte) 60, var10, arg0.field6520, class86.field1394 == arg0);
                                } else if (var11 == 2) {
                                    var12.field1781 = 0;
                                }
                            } else if (var10.field840 >= class113.method974(var12.field1789, (byte) -79).field840) {
                                var12 = arg0.field5646[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class109 var13 = arg0.field5646[var9] = new class109();
                            var13.field1783 = var8;
                            var13.field1776 = 1;
                            var13.field1788 = 0;
                            var13.field1784 = 0;
                            var13.field1781 = 0;
                            var13.field1789 = var6;
                            class50.method399(0, arg0.field6519, (byte) 121, var10, arg0.field6520, class86.field1394 == arg0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < field4226.length; var0++) {
            field4226[var0] = new class391();
        }
        field4229 = false;
        field4228 = 0;
        field4231 = new String[100];
        field4230 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
    }
}
