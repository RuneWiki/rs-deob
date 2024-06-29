import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class433 extends class275 {

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field6390 = new String[5];

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6391 = "level: ";

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field6392 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lcb;")
    public class387 field6384;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6379;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[Lnp;")
    public class206[] field6381;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method2745(byte arg0) {
        if (arg0 != 26) {
            method2752((class249) null, 64, 23, -17);
        }
        field6390 = null;
        field6379 = null;
        field6391 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)V")
    public static final void method2746(int arg0, int arg1, byte arg2) {
        field6380++;
        class115.field1564 = arg1 - class76.field1044;
        if (arg2 < 93) {
            method2745((byte) -34);
        }
        class291.field4211 = arg0 - class76.field1041;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
    public static final boolean method2747(int arg0, byte arg1) {
        field6388++;
        if (arg1 >= -101) {
            method2748(true);
        }
        if (arg0 == 37 || arg0 == 45 || arg0 == 47 || arg0 == 33 || arg0 == 1011) {
            return true;
        } else {
            return arg0 == 12 || arg0 == 44 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method2748(boolean arg0) {
        if (class90.field1245 < 102) {
            class90.field1245 += 6;
        }
        field6378++;
        if (field6392 != 0) {
            class208.field2988 -= field6392 * 5;
            field6392 = 0;
            if (class452.field6588 <= class208.field2988) {
                class208.field2988 = class452.field6588 - 1;
            } else if (class208.field2988 < 0) {
                class208.field2988 = 0;
            }
        }
        for (int var1 = 0; var1 < class187.field2544; var1++) {
            int var2 = class344.field5046[var1];
            char var3 = (char) class240.field3384[var1];
            if (var2 == 84) {
                class345.method2278(0);
            } else if (class1.field5[82] && var2 == 66) {
                if (field6379 != null) {
                    String var4 = "";
                    for (int var5 = class248.field3458.length - 1; var5 >= 0; var5--) {
                        if (class248.field3458[var5] != null && class248.field3458[var5].length() > 0) {
                            var4 = var4 + class248.field3458[var5] + '\n';
                        }
                    }
                    field6379.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class1.field5[82] && var2 == 67) {
                if (field6379 != null) {
                    Transferable var6 = field6379.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class369.method2436((byte) 102, var7, '\n');
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class155.field2030 = var8[var9];
                                        class345.method2278(0);
                                    }
                                } else {
                                    class155.field2030 = class155.field2030 + var7;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class159.field2080 > 0) {
                class155.field2030 = class155.field2030.substring(0, class159.field2080 - 1) + class155.field2030.substring(class159.field2080);
                class159.field2080--;
            } else if (var2 == 101 && class159.field2080 < class155.field2030.length()) {
                class155.field2030 = class155.field2030.substring(0, class159.field2080) + class155.field2030.substring(class159.field2080 + 1);
            } else if (var2 == 96 && class159.field2080 > 0) {
                class159.field2080--;
            } else if (var2 == 97 && class159.field2080 < class155.field2030.length()) {
                class159.field2080++;
            } else if (var2 == 102) {
                class159.field2080 = 0;
            } else if (var2 == 103) {
                class159.field2080 = class155.field2030.length();
            } else if (var2 == 104 && class248.field3458.length > class179.field2355) {
                class179.field2355++;
                class38.method301(0);
                class159.field2080 = class155.field2030.length();
            } else if (var2 == 105 && class179.field2355 > 0) {
                class179.field2355--;
                class38.method301(0);
                class159.field2080 = class155.field2030.length();
            } else if (class312.method1946(var3, 18768) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class155.field2030 = class155.field2030.substring(0, class159.field2080) + (char) class240.field3384[var1] + class155.field2030.substring(class159.field2080);
                class159.field2080++;
            }
        }
        class187.field2544 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class133.field1783[var10]) {
                var10002 = class122.field1641[var10]++;
                if (class122.field1641[var10] > 102) {
                    class133.field1783[var10] = false;
                }
            } else {
                var10002 = class122.field1641[var10]--;
                if (class122.field1641[var10] < 0) {
                    class410.field6134[var10] = (int) ((double) class345.field5120 * Math.random());
                    class309.field4407[var10] = (int) (Math.random() * 350.0D);
                    class122.field1641[var10] = 0;
                    class133.field1783[var10] = true;
                }
            }
        }
        class176.method1075((byte) -125);
        if (arg0) {
            method2746(121, 83, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public static final void method2749(int arg0, int arg1, int arg2) {
        boolean var3 = class343.field5032[0][arg1][arg2] != null && class343.field5032[0][arg1][arg2].field103 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class343.field5032[var4][arg1][arg2] == null) {
                class10 var5 = class343.field5032[var4][arg1][arg2] = new class10(var4, arg1, arg2);
                if (var3) {
                    var5.field116++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnr;BII)Z")
    public final boolean method2750(class437 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 62) {
            method2749(68, -35, 106);
        }
        field6386++;
        if (this.field6381 != null) {
            for (int var5 = 0; var5 < this.field6381.length; var5++) {
                if (this.field6381[var5].method1302(arg2, arg3) && this.field6384.method159(arg3, arg0, arg2, 26)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Loq;III)V")
    public static final void method2751(class120 arg0, int arg1, int arg2, int arg3) {
        int var4 = class38.field612[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field1611 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field1610[arg0.field1611++] = class74.field997[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field1611; var7 < 4; var7++) {
            arg0.field1610[var7] = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lro;III)V")
    public static final void method2752(class249 arg0, int arg1, int arg2, int arg3) {
        field6383++;
        if (class372.field5533 != null || class229.field3230 || arg0 == null || class220.method1371((byte) -128, arg0) == null) {
            return;
        }
        class372.field5533 = arg0;
        class194.field2785 = class220.method1371((byte) 64, arg0);
        class116.field1579 = 0;
        class58.field837 = arg2;
        class139.field1858 = arg1;
        class17.field206 = false;
        if (arg3 >= -68) {
            field6379 = null;
        }
    }
}
