import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class68 extends class281 {

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field886 = 765;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lwl;")
    public static class452 field885 = new class452(78, 4);

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field891 = new String[100];

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lwl;")
    public static class452 field890 = new class452(94, 15);

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "J")
    public long field887;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient;")
    public static client field876;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "[I")
    public static int[] field874;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static final void method458(boolean arg0) {
        if (!arg0) {
            field874 = null;
        }
        if (class326.field4904 < 102) {
            class326.field4904 += 6;
        }
        field882++;
        if (class91.field1286 != 0) {
            class319.field4819 -= class91.field1286 * 5;
            if (class319.field4819 >= class57.field760) {
                class319.field4819 = class57.field760 - 1;
            }
            if (class319.field4819 < 0) {
                class319.field4819 = 0;
            }
            class91.field1286 = 0;
        }
        for (int var1 = 0; var1 < class296.field4495; var1++) {
            int var2 = class43.field542[var1].method1067(55);
            char var3 = class43.field542[var1].method1070((byte) -100);
            if (var2 == 84) {
                class115.method695(112);
            } else if (class185.field2786.method578(false, 82) && var2 == 66) {
                if (class213.field3204 != null) {
                    String var4 = "";
                    for (int var5 = class314.field4766.length - 1; var5 >= 0; var5--) {
                        if (class314.field4766[var5] != null && class314.field4766[var5].length() > 0) {
                            var4 = var4 + class314.field4766[var5] + '\n';
                        }
                    }
                    class213.field3204.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class185.field2786.method578(!arg0, 82) && var2 == 67) {
                if (class213.field3204 != null) {
                    Transferable var6 = class213.field3204.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class110.method677('\n', var7, (byte) -117);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class271.field4157 = var8[var9];
                                        class115.method695(107);
                                    }
                                } else {
                                    class271.field4157 = class271.field4157 + var7;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class339.field5063 > 0) {
                class271.field4157 = class271.field4157.substring(0, class339.field5063 - 1) + class271.field4157.substring(class339.field5063);
                class339.field5063--;
            } else if (var2 == 101 && class339.field5063 < class271.field4157.length()) {
                class271.field4157 = class271.field4157.substring(0, class339.field5063) + class271.field4157.substring(class339.field5063 + 1);
            } else if (var2 == 96 && class339.field5063 > 0) {
                class339.field5063--;
            } else if (var2 == 97 && class339.field5063 < class271.field4157.length()) {
                class339.field5063++;
            } else if (var2 == 102) {
                class339.field5063 = 0;
            } else if (var2 == 103) {
                class339.field5063 = class271.field4157.length();
            } else if (var2 == 104 && class314.field4766.length > class121.field1593) {
                class121.field1593++;
                class304.method1868(0);
                class339.field5063 = class271.field4157.length();
            } else if (var2 == 105 && class121.field1593 > 0) {
                class121.field1593--;
                class304.method1868(0);
                class339.field5063 = class271.field4157.length();
            } else if (class56.method320(-1, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class271.field4157 = class271.field4157.substring(0, class339.field5063) + class43.field542[var1].method1070((byte) -100) + class271.field4157.substring(class339.field5063);
                class339.field5063++;
            }
        }
        class296.field4495 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class62.field788[var10]) {
                var10002 = class265.field4049[var10]++;
                if (class265.field4049[var10] > 102) {
                    class62.field788[var10] = false;
                }
            } else {
                var10002 = class265.field4049[var10]--;
                if (class265.field4049[var10] < 0) {
                    class353.field5221[var10] = (int) (Math.random() * (double) class221.field3368);
                    class314.field4754[var10] = (int) (Math.random() * 350.0D);
                    class265.field4049[var10] = 0;
                    class62.field788[var10] = true;
                }
            }
        }
        class141.method887((byte) -91);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static final void method459(byte arg0) {
        field879++;
        if (class465.field6838 != null) {
            if (class465.field6838.field3172 == 1) {
                class465.field6838 = null;
                return;
            }
            if (class465.field6838.field3172 == 2) {
                class452.method2807(-120, class210.field3166, class100.field1372, 2);
                class465.field6838 = null;
                return;
            }
        }
        int var1 = -64 % ((arg0 + 53) / 46);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)J")
    public final long method460(int arg0) {
        if (arg0 != -7904) {
            this.method467(-94);
        }
        field875++;
        return this.field887;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
    public final int method461(int arg0) {
        field877++;
        return arg0 <= 69 ? -119 : this.field878;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method462(byte arg0, long arg1) {
        if (arg0 >= -82) {
            method462((byte) 20, 54L);
        }
        field884++;
        class310.field4675.setTime(new Date(arg1));
        int var3 = class310.field4675.get(7);
        int var4 = class310.field4675.get(5);
        int var5 = class310.field4675.get(2);
        int var6 = class310.field4675.get(1);
        int var7 = class310.field4675.get(11);
        int var8 = class310.field4675.get(12);
        int var9 = class310.field4675.get(13);
        return class319.field4824[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class192.field2852[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lje;B[I[I[I)V")
    public static final void method463(class169 arg0, byte arg1, int[] arg2, int[] arg3, int[] arg4) {
        int var5 = -4 % ((-arg1 - 13) / 50);
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6];
            int var8 = arg2[var6];
            int var9 = arg4[var6];
            for (int var10 = 0; var8 != 0 && var10 < arg0.field1947.length; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field1947[var10] = null;
                    } else {
                        class379 var11 = class98.method629(var7, (byte) -115);
                        int var12 = var11.field5531;
                        class410 var13 = arg0.field1947[var10];
                        if (var13 != null) {
                            if (var13.field6105 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field1947[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field6111 = 0;
                                    var13.field6103 = var9;
                                    var13.field6107 = 1;
                                    var13.field6102 = 0;
                                    var13.field6106 = 0;
                                    class251.method1528(class113.field1500 == arg0, 0, arg0.field1892, arg0.field1900, var11, arg0.field1902, (byte) -118);
                                } else if (var12 == 2) {
                                    var13.field6111 = 0;
                                }
                            } else if (var11.field5536 >= class98.method629(var13.field6105, (byte) -115).field5536) {
                                var13 = arg0.field1947[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class410 var14 = arg0.field1947[var10] = new class410();
                            var14.field6105 = var7;
                            var14.field6111 = 0;
                            var14.field6106 = 0;
                            var14.field6102 = 0;
                            var14.field6103 = var9;
                            var14.field6107 = 1;
                            class251.method1528(class113.field1500 == arg0, 0, arg0.field1892, arg0.field1900, var11, arg0.field1902, (byte) -118);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field881++;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method464(int arg0) {
        field890 = null;
        field885 = null;
        field876 = null;
        field874 = null;
        field891 = null;
        if (arg0 != -4547) {
            method466(80, -34);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)I")
    public final int method465(byte arg0) {
        if (arg0 > -80) {
            field892 = -57;
        }
        field873++;
        return this.field883;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public static final boolean method466(int arg0, int arg1) {
        field880++;
        if ((short) arg0 == arg1 || arg1 == 44 || arg1 == 12 || arg1 == 46 || arg1 == 22) {
            return true;
        } else {
            return arg1 == 51 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)I")
    public final int method467(int arg0) {
        if (arg0 == 9) {
            field888++;
            return this.field889;
        } else {
            return -86;
        }
    }
}
