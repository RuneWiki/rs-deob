import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class302 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public static int[] field4138 = new int[13];

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "F")
    public static float field4141;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Ljc;")
    public class302 field4140;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lbt;")
    public class33 field4136;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 5)
    public final void method1719(byte arg0) {
        field4142++;
        if (class31.field452 >= 500) {
            return;
        }
        this.field4139 = 0;
        this.field4140 = class135.field1954;
        if (arg0 < 84) {
            this.field4139 = 90;
        }
        this.field4136 = null;
        class31.field452++;
        class135.field1954 = this;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V", line = 25)
    public static final void method1720(boolean arg0, int arg1) {
        if (arg1 == 66) {
            field4135++;
            class505.method2968(arg0, class177.field2513, class351.field4795, class319.field4419, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 41)
    public static void method1721(int arg0) {
        if (arg0 < -31) {
            field4138 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 54)
    public static final void method1722(int arg0) {
        field4137++;
        if (class408.field5646 < 102) {
            class408.field5646 += 6;
        }
        if (class530.field7810 != 0) {
            class233.field3231 -= class530.field7810 * 5;
            if (class307.field4213 <= class233.field3231) {
                class233.field3231 = class307.field4213 - 1;
            }
            class530.field7810 = 0;
            if (class233.field3231 < 0) {
                class233.field3231 = 0;
            }
        }
        int var1 = 90 % ((arg0 + 45) / 52);
        for (int var2 = 0; var2 < class171.field2449; var2++) {
            int var3 = class270.field3697[var2].method276((byte) -66);
            char var4 = class270.field3697[var2].method274(-95);
            if (var3 == 84) {
                class476.method2801(-4230);
            } else if (class488.field7125.method1212(-1, 82) && var3 == 66) {
                if (class263.field3604 != null) {
                    String var9 = "";
                    for (int var10 = class306.field4199.length - 1; var10 >= 0; var10--) {
                        if (class306.field4199[var10] != null && class306.field4199[var10].length() > 0) {
                            var9 = var9 + class306.field4199[var10] + '\n';
                        }
                    }
                    class263.field3604.setContents(new StringSelection(var9), null);
                }
            } else if (class488.field7125.method1212(-1, 82) && var3 == 67) {
                if (class263.field3604 != null) {
                    Transferable var5 = class263.field3604.getContents(null);
                    if (var5 != null) {
                        try {
                            String var6 = (String) var5.getTransferData(DataFlavor.stringFlavor);
                            if (var6 != null) {
                                String[] var7 = class96.method654(var6, '\n', false);
                                if (var7.length <= 1) {
                                    class452.field6564 = class452.field6564 + var6;
                                } else {
                                    for (int var8 = 0; var8 < var7.length; var8++) {
                                        class452.field6564 = var7[var8];
                                        class476.method2801(-4230);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var3 == 85 && class29.field436 > 0) {
                class452.field6564 = class452.field6564.substring(0, class29.field436 - 1) + class452.field6564.substring(class29.field436);
                class29.field436--;
            } else if (var3 == 101 && class29.field436 < class452.field6564.length()) {
                class452.field6564 = class452.field6564.substring(0, class29.field436) + class452.field6564.substring(class29.field436 + 1);
            } else if (var3 == 96 && class29.field436 > 0) {
                class29.field436--;
            } else if (var3 == 97 && class29.field436 < class452.field6564.length()) {
                class29.field436++;
            } else if (var3 == 102) {
                class29.field436 = 0;
            } else if (var3 == 103) {
                class29.field436 = class452.field6564.length();
            } else if (var3 == 104 && class410.field5850 < class306.field4199.length) {
                class410.field5850++;
                class315.method1781(false);
                class29.field436 = class452.field6564.length();
            } else if (var3 == 105 && class410.field5850 > 0) {
                class410.field5850--;
                class315.method1781(false);
                class29.field436 = class452.field6564.length();
            } else if (class307.method1740(var4, false) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class452.field6564 = class452.field6564.substring(0, class29.field436) + class270.field3697[var2].method274(-104) + class452.field6564.substring(class29.field436);
                class29.field436++;
            }
        }
        class171.field2449 = 0;
        class242.method1428((byte) 56);
    }
}
