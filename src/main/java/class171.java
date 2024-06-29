import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class171 extends class21 {

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    private int field2759 = 1;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    private int field2753 = 1;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    private int field2761 = 204;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field2751 = 255;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field2754 = -1;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field2755 = null;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2763 = "Face here";

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "[I")
    public static int[] field2762 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 4)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -127 % ((arg0 - 33) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        field2756++;
        if (this.field443.field2637) {
            for (int var5 = 0; var5 < class294.field4489; var5++) {
                int var6 = class330.field5058[arg1];
                int var7 = this.field2753 * var6 >> 12;
                int var8 = class51.field1027[var5];
                int var9 = this.field2759 * var8 >> 12;
                int var10 = var8 % (4096 / this.field2759) * this.field2759;
                int var11 = var6 % (4096 / this.field2753) * this.field2753;
                if (this.field2761 > var11) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (this.field2761 > var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field2761 > var10) {
                    int var12;
                    for (var12 = var9 - var7; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 97)
    public static void method1083(int arg0) {
        field2762 = null;
        field2763 = null;
        field2755 = null;
        if (arg0 != 2) {
            method1083(58);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 114)
    public static final void method1084(String arg0, int arg1) {
        class228.field3604 = arg0;
        field2766++;
        if (class177.field2849.field2139 == null) {
            return;
        }
        try {
            String var2 = class177.field2849.field2139.getParameter("cookieprefix");
            if (arg1 != 4096) {
                field2762 = (int[]) null;
            }
            String var3 = class177.field2849.field2139.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class212.method1431(class338.method2339((byte) -120) + 94608000000L, (byte) -121) + "; Max-Age=" + 94608000L;
            }
            class102.method667("document.cookie=\"" + var5 + "\"", class177.field2849.field2139, false);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I", line = 157)
    public static final int method1085(int arg0) {
        field2752++;
        if (class222.field3517 == null) {
            return -1;
        }
        while (class222.field3517.field3672 > class78.field1542) {
            if (class222.field3517.method1551(class78.field1542, arg0 - 92)) {
                return class78.field1542++;
            }
            class78.field1542++;
        }
        if (arg0 != -1) {
            method1084((String) null, -56);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILag;)V", line = 194)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field2758++;
        if (arg0 != -318) {
            field2765 = 8;
        }
        if (arg1 == 0) {
            this.field2759 = arg2.method1317((byte) -100);
        } else if (arg1 == 1) {
            this.field2753 = arg2.method1317((byte) -97);
        } else if (arg1 == 2) {
            this.field2761 = arg2.method1315(arg0 ^ 0xFFFFC913);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lta;I)V", line = 256)
    public static final void method1086(class286 arg0, int arg1) {
        field2760++;
        if (arg1 == 8) {
            class281.field4322 = arg0;
        }
    }
}
