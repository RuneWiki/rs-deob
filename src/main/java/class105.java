import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class105 extends class291 {

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Lmg;")
    public static class53 field1626 = new class53(64);

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Leg;")
    public static class37 field1630 = class174.method1167("Veuillez patienter )2 tentative de r-Btablissement)3", 95);

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[I")
    public static int[] field1632 = new int[128];

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Leg;")
    public static class37 field1635 = class174.method1167("ul", -30);

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public abstract void method695(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static void method696(int arg0) {
        field1630 = null;
        field1635 = null;
        field1632 = null;
        int var1 = 75 % ((arg0 + 68) / 43);
        field1626 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public abstract void method697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        int var1 = -91 % ((-arg0 - 68) / 36);
        class277.method1865(2);
        class169.method1130(29499);
        class92.method600(-1);
        class61.method434(true);
        class144.method1005(false);
        field1625++;
        class35.method203(128);
        class9.method54((byte) -30);
        class199.method1383(-4);
        class185.method1237((byte) -113);
        class184.method1229(121);
        class248.method1710(23);
        class278.method1870((byte) 2);
        class199.method1388(-122);
        class28.method161(24754);
        class88.field1388.method1409(86);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIII)V")
    public final void method699(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -27) {
            return;
        }
        int var6 = this.field1633 << 3;
        int var7 = this.field1636 << 3;
        int var8 = (arg4 << 4) + (var7 & 0xF);
        field1638++;
        int var9 = (arg1 << 4) + (var6 & 0xF);
        this.method697(var7, var6, var8, var9, arg3, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
    public abstract void method700(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
    public static final void method701(int arg0) {
        class213.field3680.method1702(99);
        field1629++;
        int var1 = class213.field3680.method1705((byte) 117, arg0);
        if (class46.field729 > var1) {
            for (int var2 = var1; var2 < class46.field729; var2++) {
                class223.field3833[class131.field2182++] = class98.field1525[var2];
            }
        }
        if (class46.field729 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class46.field729 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class98.field1525[var3];
            class163 var5 = class55.field833[var4];
            int var6 = class213.field3680.method1705((byte) 118, 1);
            if (var6 == 0) {
                class98.field1525[class46.field729++] = var4;
                var5.field1759 = class72.field1146;
            } else {
                int var7 = class213.field3680.method1705((byte) 126, 2);
                if (var7 == 0) {
                    class98.field1525[class46.field729++] = var4;
                    var5.field1759 = class72.field1146;
                    class203.field3463[class255.field4524++] = var4;
                } else if (var7 == 1) {
                    class98.field1525[class46.field729++] = var4;
                    var5.field1759 = class72.field1146;
                    int var8 = class213.field3680.method1705((byte) 106, 3);
                    var5.method769(false, var8, arg0 ^ 0x5E42);
                    int var9 = class213.field3680.method1705((byte) 107, 1);
                    if (var9 == 1) {
                        class203.field3463[class255.field4524++] = var4;
                    }
                } else if (var7 == 2) {
                    class98.field1525[class46.field729++] = var4;
                    var5.field1759 = class72.field1146;
                    int var10 = class213.field3680.method1705((byte) 123, 3);
                    var5.method769(true, var10, arg0 + 24130);
                    int var11 = class213.field3680.method1705((byte) 125, 3);
                    var5.method769(true, var11, 24138);
                    int var12 = class213.field3680.method1705((byte) 105, 1);
                    if (var12 == 1) {
                        class203.field3463[class255.field4524++] = var4;
                    }
                } else if (var7 == 3) {
                    class223.field3833[class131.field2182++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
    public abstract void method702(int arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public abstract void method703(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljl;I)V")
    public static final void method704(class101 arg0, int arg1) {
        field1628++;
        if (class276.field4899) {
            return;
        }
        class122.method862();
        class47.field734 = class118.method839(arg0, (byte) 120, class159.field2659);
        int var2 = class199.field3390;
        int var3 = var2 * 956 / 503;
        class47.field734.method700((class249.field4479 - var3) / 2, arg1, var3, var2);
        class181.field3019 = class109.method762(class172.field2894, arg1, arg0);
        class181.field3019.method109(class249.field4479 / 2 - (class181.field3019.field3527 / 2), 18);
        class276.field4899 = true;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
    public abstract void method705(int arg0, int arg1);
}
