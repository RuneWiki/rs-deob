import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "La;")
    public static class1 field1648 = class113.method934(-11538, "@or3@");

    @OriginalMember(owner = "client!l", name = "c", descriptor = "La;")
    public static class1 field1649 = class113.method934(-11538, "mapscene");

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1651 = -1;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "La;")
    public static class1 field1652 = class113.method934(-11538, " x");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lvc;")
    public static class129 field1654;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 17)
    public static void method633(int arg0) {
        field1652 = null;
        field1648 = null;
        field1649 = null;
        field1654 = null;
        if (arg0 != 8) {
            field1651 = 83;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method634(int arg0, int arg1, int arg2) {
        field1647++;
        if (arg1 == 0 && class115.field2884 == arg2) {
            return true;
        } else if (arg1 == 1 && class5.field215 == arg2) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class108.field2715 == arg2) {
            return true;
        } else {
            return arg0 != 8247;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 59)
    public static final int method635(int arg0, int arg1) {
        field1650++;
        if (arg0 <= 92) {
            method635(4, 3);
        }
        return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 70)
    public static final void method636(byte arg0) {
        field1657++;
        int var1 = class15.field489.method413(8, (byte) -65);
        if (class118.field2942 > var1) {
            for (int var2 = var1; var2 < class118.field2942; var2++) {
                class11.field376[class31.field842++] = class112.field2761[var2];
            }
        }
        if (var1 > class118.field2942) {
            throw new RuntimeException("gppov1");
        }
        class118.field2942 = 0;
        if (arg0 != -5) {
            method633(45);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class112.field2761[var3];
            class2 var5 = class80.field2033[var4];
            int var6 = class15.field489.method413(1, (byte) -65);
            if (var6 == 0) {
                class112.field2761[class118.field2942++] = var4;
                var5.field2011 = class82.field2066;
            } else {
                int var7 = class15.field489.method413(2, (byte) -65);
                if (var7 == 0) {
                    class112.field2761[class118.field2942++] = var4;
                    var5.field2011 = class82.field2066;
                    class50.field1350[class80.field2030++] = var4;
                } else if (var7 == 1) {
                    class112.field2761[class118.field2942++] = var4;
                    var5.field2011 = class82.field2066;
                    int var8 = class15.field489.method413(3, (byte) -65);
                    var5.method728(var8, (byte) -96, false);
                    int var9 = class15.field489.method413(1, (byte) -65);
                    if (var9 == 1) {
                        class50.field1350[class80.field2030++] = var4;
                    }
                } else if (var7 == 2) {
                    class112.field2761[class118.field2942++] = var4;
                    var5.field2011 = class82.field2066;
                    int var10 = class15.field489.method413(3, (byte) -65);
                    var5.method728(var10, (byte) -96, true);
                    int var11 = class15.field489.method413(3, (byte) -65);
                    var5.method728(var11, (byte) -96, true);
                    int var12 = class15.field489.method413(1, (byte) -65);
                    if (var12 == 1) {
                        class50.field1350[class80.field2030++] = var4;
                    }
                } else if (var7 == 3) {
                    class11.field376[class31.field842++] = var4;
                }
            }
        }
    }
}
