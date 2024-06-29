import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class112 implements class104 {

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/String;")
    public String field1465;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Lffa;")
    public class562 field1462;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Loca;")
    public class573 field1458;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static final void method856(int arg0) {
        field1463++;
        if (class87.field1160 != 0) {
            class377.field4834 -= class87.field1160 * 5;
            if (class5.field36 <= class377.field4834) {
                class377.field4834 = class5.field36 - 1;
            }
            class87.field1160 = 0;
            if (class377.field4834 < 0) {
                class377.field4834 = 0;
            }
        }
        if (class677.field9344 < 102) {
            class677.field9344 += 6;
        }
        if (arg0 != -68) {
            field1473 = -91;
        }
        for (int var1 = 0; var1 < class458.field5999; var1++) {
            class409 var2 = class495.field6533[var1];
            int var3 = var2.method317(-5929);
            char var4 = var2.method316((byte) -83);
            int var5 = var2.method313(false);
            if (var3 == 84) {
                class289.method1716(false, (byte) 73);
            }
            if (var3 == 80) {
                class289.method1716(true, (byte) 49);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class64.field873 != null) {
                    String var6 = "";
                    for (int var7 = class612.field8281.length - 1; var7 >= 0; var7--) {
                        if (class612.field8281[var7] != null && class612.field8281[var7].length() > 0) {
                            var6 = var6 + class612.field8281[var7] + '\n';
                        }
                    }
                    class64.field873.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class64.field873 != null) {
                    Transferable var8 = class64.field873.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class420.method2420('\n', 98, var9);
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class247.field3327 = var10[var11];
                                        class289.method1716(false, (byte) 104);
                                    }
                                } else {
                                    class247.field3327 = class247.field3327 + var9;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class41.field583 > 0) {
                class247.field3327 = class247.field3327.substring(0, class41.field583 - 1) + class247.field3327.substring(class41.field583);
                class41.field583--;
            } else if (var3 == 101 && class41.field583 < class247.field3327.length()) {
                class247.field3327 = class247.field3327.substring(0, class41.field583) + class247.field3327.substring(class41.field583 + 1);
            } else if (var3 == 96 && class41.field583 > 0) {
                class41.field583--;
            } else if (var3 == 97 && class41.field583 < class247.field3327.length()) {
                class41.field583++;
            } else if (var3 == 102) {
                class41.field583 = 0;
            } else if (var3 == 103) {
                class41.field583 = class247.field3327.length();
            } else if (var3 == 104 && class612.field8281.length > class213.field2750) {
                class213.field2750++;
                class480.method2656((byte) -22);
                class41.field583 = class247.field3327.length();
            } else if (var3 == 105 && class213.field2750 > 0) {
                class213.field2750--;
                class480.method2656((byte) -22);
                class41.field583 = class247.field3327.length();
            } else if (class298.method1760(var4, (byte) -113) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class247.field3327 = class247.field3327.substring(0, class41.field583) + class495.field6533[var1].method316((byte) -83) + class247.field3327.substring(class41.field583);
                class41.field583++;
            }
        }
        class307.field4023 = 0;
        class458.field5999 = 0;
        class211.method1355(arg0 ^ 0x5554);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lfl;")
    public final class103 method318(int arg0) {
        if (arg0 != -26207) {
            method857(-75, (byte) -7);
        }
        field1460++;
        return class469.field6131;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
    public static final void method857(int arg0, byte arg1) {
        field1475++;
        if (class152.method1106(52, arg0) && arg1 == -116) {
            class37.method302((byte) -94, class322.field4179[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;Lffa;Loca;IIIIIIIIII)V")
    public class112(String arg0, class562 arg1, class573 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field1459 = arg10;
        this.field1464 = arg3;
        this.field1470 = arg11;
        this.field1468 = arg12;
        this.field1461 = arg8;
        this.field1467 = arg5;
        this.field1465 = arg0;
        this.field1462 = arg1;
        this.field1458 = arg2;
        this.field1474 = arg6;
        this.field1469 = arg4;
        this.field1471 = arg7;
        this.field1472 = arg9;
    }
}
