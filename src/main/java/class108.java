import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class108 {

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "B")
    public byte field1541;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "[I")
    public static int[] field1542 = new int[8];

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "[Z")
    public static boolean[] field1545 = new boolean[100];

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "Lqv;")
    public class108 field1553;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Ll;")
    public static class639 field1536;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Lva;", line = 3)
    public final class500 method796(boolean arg0) {
        if (!arg0) {
            this.field1558 = 65;
        }
        field1539++;
        return class64.method582(this.field1551, 20915);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZLla;Ljava/lang/String;)Liga;", line = 24)
    public static final class494 method797(int arg0, boolean arg1, class423 arg2, String arg3) {
        field1555++;
        int var4 = -124 / ((arg0 - 58) / 36);
        int var5 = arg2.method2602((byte) -118, arg3);
        if (var5 == -1) {
            return new class494(0);
        }
        int[] var6 = arg2.method2621(var5, 100);
        class494 var7 = new class494(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var7.field7111 > var8) {
                class479 var10 = new class479(arg2.method2600(0, var5, var6[var9++]));
                int var11 = var10.method2868(-92);
                int var12 = var10.method2882(-1);
                int var13 = var10.method2886(true);
                if (!arg1 && var13 == 1) {
                    var7.field7111--;
                } else {
                    var7.field7110[var8] = var11;
                    var7.field7108[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 68)
    public static final void method798(byte arg0) {
        if (arg0 != -64) {
            field1542 = null;
        }
        field1557++;
        class751.field10467.method271(((float) class243.field3580.field8018.method3449(false) * 0.1F + 0.7F) * class140.field1912);
        class751.field10467.method363(class159.field2278, class285.field3969, class111.field1571, (float) (class111.field1573 << 2), (float) (class344.field4732 << 2), (float) (class469.field6682 << 2));
        class751.field10467.method353(class36.field322);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V", line = 83)
    public static void method799(byte arg0) {
        field1536 = null;
        field1545 = null;
        if (arg0 <= 91) {
            field1545 = null;
        }
        field1542 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BZLjava/lang/String;ILjava/lang/String;)V", line = 102)
    public static final void method800(byte arg0, boolean arg1, String arg2, int arg3, String arg4) {
        field1544++;
        class403.method2447(arg1, -1, arg4, arg2, (byte) -45, arg3, true);
        if (arg0 != 63) {
            field1545 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIII)Lqv;", line = 113)
    public final class108 method801(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 66) {
            method797(122, true, null, null);
        }
        field1538++;
        return new class108(this.field1551, arg1, arg2, arg3, this.field1541);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIIB)V", line = 134)
    public class108(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1558 = arg1;
        this.field1550 = arg2;
        this.field1551 = arg0;
        this.field1547 = arg3;
        this.field1541 = arg4;
    }
}
