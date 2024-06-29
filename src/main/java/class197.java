import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class197 extends class401 {

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
    private boolean field2764;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    private int field2768;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
    private boolean field2758;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Ljava/lang/String;")
    private String field2753;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Ljava/lang/String;")
    private String field2763;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "Ljava/lang/String;")
    private String field2774;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Ljava/lang/String;")
    private String field2767;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lft;")
    public static class4 field2756;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)I", line = 3)
    public final int method1303(boolean arg0) {
        field2770++;
        byte var2 = 23;
        int var3 = var2 + class468.method2646(-193, this.field2767);
        int var4 = var3 + class468.method2646(-193, this.field2774);
        if (arg0) {
            this.field2766 = -69;
        }
        int var5 = var4 + class468.method2646(-193, this.field2763);
        return var5 + class468.method2646(-193, this.field2753);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V", line = 22)
    public static void method1304(boolean arg0) {
        field2756 = null;
        if (arg0) {
            field2756 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 49)
    private final void method1305(int arg0) {
        if (this.field2767.length() > 40) {
            this.field2767 = this.field2767.substring(0, 40);
        }
        field2754++;
        if (arg0 > ~this.field2774.length()) {
            this.field2774 = this.field2774.substring(0, 40);
        }
        if (this.field2763.length() > 10) {
            this.field2763 = this.field2763.substring(0, 10);
        }
        if (this.field2753.length() > 10) {
            this.field2753 = this.field2753.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lac;B)V", line = 71)
    public final void method1306(class501 arg0, byte arg1) {
        arg0.method2817(5, true);
        field2773++;
        arg0.method2817(this.field2760, true);
        arg0.method2817(this.field2764 ? 1 : 0, true);
        arg0.method2817(this.field2766, true);
        arg0.method2817(this.field2775, true);
        arg0.method2817(this.field2757, true);
        arg0.method2817(this.field2768, true);
        arg0.method2817(this.field2759, true);
        arg0.method2817(this.field2758 ? 1 : 0, true);
        arg0.method2837(this.field2772, arg1 ^ 0x55);
        arg0.method2817(this.field2761, true);
        arg0.method2832(14255, this.field2751);
        arg0.method2837(this.field2771, -2);
        arg0.method2817(this.field2755, true);
        arg0.method2817(this.field2765, true);
        arg0.method2817(this.field2762, true);
        arg0.method2850(this.field2767, false);
        arg0.method2850(this.field2774, false);
        arg0.method2850(this.field2763, false);
        if (arg1 != -85) {
            this.method1303(false);
        }
        arg0.method2850(this.field2753, false);
        arg0.method2817(this.field2750, true);
        arg0.method2837(this.field2769, arg1 ^ 0x55);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBII)V", line = 105)
    public static final void method1307(int arg0, byte arg1, int arg2, int arg3) {
        field2752++;
        class51 var4 = class703.method3938(-1989279584, arg0, 11);
        var4.method402((byte) 78);
        var4.field603 = arg3;
        var4.field605 = arg2;
        if (arg1 < 70) {
            method1304(false);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 126)
    public class197() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ZLlaa;)V", line = 128)
    public class197(boolean arg0, class105 arg1) {
        if (arg0) {
            if (class105.field1466.startsWith("win")) {
                this.field2760 = 1;
            } else if (class105.field1466.startsWith("mac")) {
                this.field2760 = 2;
            } else if (class105.field1466.startsWith("linux")) {
                this.field2760 = 3;
            } else {
                this.field2760 = 4;
            }
            if (class105.field1455.startsWith("amd64") || class105.field1455.startsWith("x86_64")) {
                this.field2764 = true;
            } else {
                this.field2764 = false;
            }
            if (this.field2760 == 1) {
                if (class105.field1478.indexOf("4.0") != -1) {
                    this.field2766 = 1;
                } else if (class105.field1478.indexOf("4.1") != -1) {
                    this.field2766 = 2;
                } else if (class105.field1478.indexOf("4.9") != -1) {
                    this.field2766 = 3;
                } else if (class105.field1478.indexOf("5.0") != -1) {
                    this.field2766 = 4;
                } else if (class105.field1478.indexOf("5.1") != -1) {
                    this.field2766 = 5;
                } else if (class105.field1478.indexOf("6.0") != -1) {
                    this.field2766 = 6;
                } else if (class105.field1478.indexOf("6.1") != -1) {
                    this.field2766 = 7;
                }
            } else if (this.field2760 == 2) {
                if (class105.field1478.indexOf("10.4") != -1) {
                    this.field2766 = 20;
                } else if (class105.field1478.indexOf("10.5") != -1) {
                    this.field2766 = 21;
                } else if (class105.field1478.indexOf("10.6") != -1) {
                    this.field2766 = 22;
                }
            }
            if (class105.field1477.toLowerCase().indexOf("sun") != -1) {
                this.field2775 = 1;
            } else if (class105.field1477.toLowerCase().indexOf("microsoft") != -1) {
                this.field2775 = 2;
            } else if (class105.field1477.toLowerCase().indexOf("apple") == -1) {
                this.field2775 = 4;
            } else {
                this.field2775 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class105.field1480.length()) {
                    char var5 = class105.field1480.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + (var5 - '0');
                }
            } catch (Exception var15) {
            }
            this.field2757 = var4;
            int var6 = 0;
            int var7 = class105.field1480.indexOf(46, 2) + 1;
            try {
                while (class105.field1480.length() > var7) {
                    char var8 = class105.field1480.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + var8 - 48;
                }
            } catch (Exception var14) {
            }
            this.field2768 = var6;
            int var9 = class105.field1480.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class105.field1480.length()) {
                    char var11 = class105.field1480.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var13) {
            }
            if (arg1.field1456) {
                this.field2758 = false;
            } else {
                this.field2758 = true;
            }
            this.field2759 = var10;
            if (this.field2757 <= 3) {
                this.field2761 = 0;
            } else {
                this.field2761 = class463.field6380;
            }
            this.field2772 = class651.field9037;
            try {
                this.field2751 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field2751 = 0;
            }
        }
        if (this.field2753 == null) {
            this.field2753 = "";
        }
        if (this.field2763 == null) {
            this.field2763 = "";
        }
        if (this.field2774 == null) {
            this.field2774 = "";
        }
        if (this.field2767 == null) {
            this.field2767 = "";
        }
        this.method1305(-41);
    }
}
