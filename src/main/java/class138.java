import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class138 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lcp;")
    private class470 field1818 = new class470(256);

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lcp;")
    private class470 field1822 = new class470(256);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lb;")
    private class201 field1812;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lb;")
    private class201 field1819;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lef;")
    public static class311 field1821 = new class311(8, 3);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field1823 = 12;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Z")
    public static boolean field1828;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1827;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lus;")
    public static class1 field1829;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ltr;")
    public static class176 field1824;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZI)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1825++;
        int var6 = class156.method978(0, arg0, class485.field6827, class345.field5011);
        int var7 = class156.method978(0, arg3, class485.field6827, class345.field5011);
        int var8 = class156.method978(0, arg1, class94.field1209, class168.field2449);
        int var9 = class156.method978(0, arg5, class94.field1209, class168.field2449);
        for (int var10 = var6; var10 <= var7; var10++) {
            class103.method579((byte) 115, var8, var9, arg2, class128.field1676[var10]);
        }
        if (arg4) {
            method868(73, (class145) null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILdt;)Ljava/lang/String;")
    public static final String method868(int arg0, class145 arg1) {
        field1813++;
        if (arg0 != 41) {
            return null;
        } else if (client.method1122(arg1).method2319(-2829) == 0) {
            return null;
        } else if (arg1.field1944 == null || arg1.field1944.trim().length() == 0) {
            return class342.field4986 ? "Hidden-use" : null;
        } else {
            return arg1.field1944;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[II)Lnd;")
    public final class352 method869(boolean arg0, int[] arg1, int arg2) {
        field1820++;
        if (this.field1819.method1233(-1) == 1) {
            return this.method874(0, arg2, (byte) 50, arg1);
        } else if (this.field1819.method1235(0, arg2) == 1) {
            return this.method874(arg2, 0, (byte) 29, arg1);
        } else {
            if (arg0) {
                this.method871(97, (int[]) null, true);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method870(byte arg0) {
        int var1 = 42 % (arg0 / 62);
        field1821 = null;
        field1824 = null;
        field1829 = null;
        field1827 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[IZ)Lnd;")
    public final class352 method871(int arg0, int[] arg1, boolean arg2) {
        field1826++;
        if (arg2) {
            this.field1822 = null;
        }
        if (this.field1812.method1233(-1) == 1) {
            return this.method873(arg1, arg0, 0, -128);
        } else if (this.field1812.method1235(0, arg0) == 1) {
            return this.method873(arg1, 0, arg0, -127);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method872(int arg0, Throwable arg1) throws IOException {
        if (arg0 != -7671) {
            method870((byte) 24);
        }
        field1817++;
        String var2;
        if ((arg1 instanceof class76)) {
            class76 var3 = (class76) arg1;
            arg1 = var3.field937;
            var2 = var3.field939 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIII)Lnd;")
    private final class352 method873(int[] arg0, int arg1, int arg2, int arg3) {
        field1815++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x50000FFF) << 4) ^ arg1;
        int var6 = var5 | arg2 << 16;
        if (arg3 >= -126) {
            return null;
        }
        long var7 = (long) var6;
        class352 var9 = (class352) this.field1822.method2761(var7, (byte) -112);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class192 var10 = class192.method1187(this.field1812, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class352 var11 = var10.method1190();
            this.field1822.method2767(-1, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field5088.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lb;Lb;)V")
    public class138(class201 arg0, class201 arg1) {
        this.field1812 = arg0;
        this.field1819 = arg1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB[I)Lnd;")
    private final class352 method874(int arg0, int arg1, byte arg2, int[] arg3) {
        field1816++;
        if (arg2 < 25) {
            this.method873((int[]) null, -6, -112, 5);
        }
        int var5 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class352 var9 = (class352) this.field1822.method2761(var7, (byte) -112);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class354 var10 = (class354) this.field1818.method2761(var7, (byte) -112);
            if (var10 == null) {
                var10 = class354.method2208(this.field1819, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1818.method2767(-1, var7, var10);
            }
            class352 var11 = var10.method2209(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1510((byte) -13);
                this.field1822.method2767(-1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    static {
        new class326("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field1828 = true;
        field1827 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field1829 = new class1(31, 3);
    }
}
