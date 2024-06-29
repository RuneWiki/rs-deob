import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class118 {

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "B")
    public byte field1454;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Ltn;")
    public class118 field1457;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1456 = 0;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1461 = -1;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1463 = 999999;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1469 = 500;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lsd;")
    public static class74 field1452 = new class74(74, -2);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lvf;")
    public static class166 field1467;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 26)
    public static void method571(byte arg0) {
        field1467 = null;
        field1452 = null;
        int var1 = 34 / ((-arg0 - 22) / 37);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)Lgn;", line = 37)
    public static final class187 method572(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 64) {
            return null;
        }
        field1451++;
        class263 var4 = class293.field4356[arg0][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        class187 var5 = null;
        int var6 = -1;
        for (class248 var7 = var4.field3801; var7 != null; var7 = var7.field3490) {
            class83 var8 = var7.field3487;
            if (var8 instanceof class187) {
                class187 var9 = (class187) var8;
                int var10 = var9.method1012(false) * 64 + 60 - 64;
                int var11 = var9.field1008 - var10 >> 7;
                int var12 = var9.field1005 - var10 >> 7;
                int var13 = var9.field1008 + var10 >> 7;
                int var14 = var9.field1005 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg3 && arg1 <= var13 && arg3 <= var14) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg3);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIB)V", line = 111)
    public class118(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1472 = arg3;
        this.field1471 = arg1;
        this.field1459 = arg2;
        this.field1454 = arg4;
        this.field1470 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ltn;I)V", line = 122)
    public class118(class118 arg0, int arg1) {
        this.field1457 = arg0;
        this.field1470 = this.field1457.field1470;
        this.field1472 = this.field1457.field1472 + arg1;
        this.field1454 = this.field1457.field1454;
        this.field1459 = this.field1457.field1459 + arg1;
        this.field1471 = this.field1457.field1471 + arg1;
    }
}
