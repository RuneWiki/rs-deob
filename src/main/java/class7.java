import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class7 extends class306 {

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
    private int field81 = 2048;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
    private int field85 = 10;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "Ljava/lang/String;")
    public static String field83 = "slide:";

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!sn", name = "R", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "Lse;")
    public static class15 field82;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "[I")
    private int[] field79;

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "[I")
    private int[] field91;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V", line = 4)
    public static final void method41(int arg0) {
        field78++;
        int var1 = -24 / ((arg0 - 32) / 50);
        class347.field5503.method383((byte) -48);
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V", line = 14)
    public static void method42(byte arg0) {
        if (arg0 == 109) {
            field82 = null;
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 29)
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V", line = 50)
    public final void method43(byte arg0) {
        this.method46((byte) -70);
        if (arg0 > -103) {
            this.field85 = 1;
        }
        field84++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 62)
    public static final void method44(String arg0, byte arg1) {
        field87++;
        if (arg1 <= 108) {
            field90 = -122;
        }
        client.field4444 = arg0;
        if (class156.field2451.field254 == null) {
            return;
        }
        try {
            String var2 = class156.field2451.field254.getParameter("cookieprefix");
            String var3 = class156.field2451.field254.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class232.method1603(class9.method57(-14133) + 94608000000L, 115) + "; Max-Age=" + 94608000L;
            }
            class198.method1379(class156.field2451.field254, (byte) -112, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILlf;I)V", line = 111)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field85 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field81 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field86 = arg1.method1043(true);
        }
        field88++;
        if (arg0 != -15334) {
            field82 = (class15) null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)V", line = 145)
    private final void method46(byte arg0) {
        this.field79 = new int[this.field85 + 1];
        field89++;
        if (arg0 > -13) {
            this.field91 = (int[]) null;
        }
        this.field91 = new int[this.field85 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field85;
        int var4 = this.field81 * var3 >> 12;
        for (int var5 = 0; var5 < this.field85; var5++) {
            this.field79[var5] = var2;
            this.field91[var5] = var2 + var4;
            var2 += var3;
        }
        this.field79[this.field85] = 4096;
        this.field91[this.field85] = this.field91[0] + 4096;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I", line = 185)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, -101);
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0];
            if (this.field86 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field85; var6++) {
                    if (var4 >= this.field79[var6] && var4 < this.field79[var6 + 1]) {
                        if (var4 < this.field91[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class8.method49(var3, 0, class31.field367, var5);
            } else {
                for (int var7 = 0; var7 < class31.field367; var7++) {
                    int var8 = class25.field288[var7];
                    int var9 = 0;
                    int var10 = this.field86;
                    if (var10 == 1) {
                        var9 = var8;
                    } else if (var10 == 2) {
                        var9 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var9 = (var8 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field85; var12++) {
                        if (this.field79[var12] <= var9 && var9 < this.field79[var12 + 1]) {
                            if (var9 < this.field91[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        field80++;
        return var3;
    }
}
