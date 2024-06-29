import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class150 {

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "J")
    private long field1713;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field1711 = -1;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "[S")
    public static short[] field1705 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "Lfv;")
    public static class108 field1710 = new class108(15, 0, 1, 0);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    public static final void method820(int arg0) {
        field1709++;
        for (class208 var1 = (class208) class530.field7597.method3174((byte) 49); var1 != null; var1 = (class208) class530.field7597.method3168(false)) {
            if (class138.method769(var1.field2527, 107)) {
                class689.method3822(var1, -11872);
            }
        }
        if (arg0 < 44) {
            method822((byte) 46);
        }
        if (class145.field1625 == 1) {
            class32.method171(107);
            return;
        }
        class281.method1608(-12040, class350.field4586, class553.field7888, class70.field749, client.field3414);
        int var2 = class612.field8650.method3622(62, class221.field2743.method1296(class226.field2899, (byte) -118));
        for (class208 var3 = (class208) class530.field7597.method3174((byte) 49); var3 != null; var3 = (class208) class530.field7597.method3168(false)) {
            int var4 = class231.method1345(var3, (byte) -71);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class70.field749 = class145.field1625 * 16 + (class604.field8551 ? 26 : 22);
        class350.field4586 = var2 + 8;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lai;I)V")
    private final void method821(class546 arg0, int arg1) {
        if (arg1 != -17649) {
            this.method821(null, -80);
        }
        field1708++;
        this.field1713 |= (arg0.field7806 << class546.field7820 * this.field1716++);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
    public static final void method822(byte arg0) {
        field1706++;
        class397.method2172();
        for (int var1 = 0; var1 < 4; var1++) {
            class475.field6919[var1].method1580(-112);
        }
        if (arg0 >= -28) {
            field1707 = 6;
        }
        class622.method3488(6065);
        class99.method612(-28086);
        System.gc();
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V")
    public static void method823(boolean arg0) {
        field1710 = null;
        if (arg0) {
            method820(-74);
        }
        field1705 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method824(int arg0, Throwable arg1, String arg2) {
        field1714++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class320.method1799(arg1, 119);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class355.method1960(var3, (byte) -100);
            String var4 = class404.method2201("%3a", ":", arg0 + 84, var3);
            String var5 = class404.method2201("%40", "@", 14, var4);
            String var6 = class404.method2201("%26", "&", 112, var5);
            String var7 = class404.method2201("%23", "#", 23, var6);
            if (arg0 != 15) {
                field1705 = null;
            }
            if (class623.field8832 != null) {
                class199 var8 = class626.field8889.method3148(false, new URL(class623.field8832.getCodeBase(), "clienterror.ws?c=" + class200.field2444 + "&u=" + class249.field3199 + "&v1=" + class556.field7919 + "&v2=" + class556.field7918 + "&e=" + var7));
                while (var8.field2437 == 0) {
                    class370.method2025(arg0 ^ 0xFFFFFFF0, 1L);
                }
                if (var8.field2437 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2434;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Lai;")
    public final class546 method825(int arg0, int arg1) {
        if (arg1 != 15) {
            field1711 = 34;
        }
        field1715++;
        return class546.method3094((byte) -58)[this.method826((byte) 93, arg0)];
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)I")
    private final int method826(byte arg0, int arg1) {
        int var3 = 112 % ((arg0 + 29) / 49);
        field1712++;
        return (int) (this.field1713 >> class546.field7820 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I")
    public final int method827(int arg0) {
        if (arg0 == -21571) {
            field1704++;
            return this.field1716;
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lai;)V")
    public class150(class546 arg0) {
        this.field1716 = 1;
        this.field1713 = arg0.field7806;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "([Lai;)V")
    public class150(class546[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method821(arg0[var2], -17649);
        }
    }
}
