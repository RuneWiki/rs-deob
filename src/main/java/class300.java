import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class300 {

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lkg;")
    public static class179 field3863 = new class179(81, 2);

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lup;")
    public static class181 field3866 = new class181(11, 14);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "[[I")
    public static int[][] field3868;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static final void method1773(int arg0) {
        if (arg0 < 52) {
            field3863 = null;
        }
        field3865++;
        if (class253.field3234) {
            return;
        }
        class100.method751(-100, class38.field506);
        if (class159.field2027 != null) {
            class100.method751(-71, class159.field2027);
        }
        class253.field3234 = true;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static void method1774(int arg0) {
        field3868 = null;
        field3866 = null;
        if (arg0 < -118) {
            field3863 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILfh;Z)V")
    private final void method1775(int arg0, class463 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field3860 = arg1.method2758((byte) 85);
            this.field3861 = arg1.method2737(false);
            this.field3864 = arg1.method2737(false);
        }
        field3862++;
        if (arg2) {
            method1774(-20);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIB)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3859++;
        for (class433 var5 = (class433) class144.field1850.method153(0); var5 != null; var5 = (class433) class144.field1850.method161(-14)) {
            class327.method1908(arg2, var5, arg3, -67, arg0, arg1);
        }
        if (arg4 != -119) {
            method1776(-119, -39, -45, -53, (byte) -50);
        }
        for (class433 var6 = (class433) class149.field1884.method153(0); var6 != null; var6 = (class433) class149.field1884.method161(-31)) {
            byte var11 = 1;
            class511 var12 = var6.field6139.method2128(arg4 - 8);
            if (var6.field6139.field4872) {
                var11 = 0;
            } else if (var6.field6139.field4888 == var12.field7375 || var6.field6139.field4888 == var12.field7395 || var6.field6139.field4888 == var12.field7397 || var6.field6139.field4888 == var12.field7380) {
                var11 = 2;
            } else if (var6.field6139.field4888 == var12.field7374 || var6.field6139.field4888 == var12.field7405 || var6.field6139.field4888 == var12.field7393 || var6.field6139.field4888 == var12.field7418) {
                var11 = 3;
            }
            if (var6.field6136 != var11) {
                int var13 = class19.method170(false, var6.field6139);
                if (var6.field6140 != var13) {
                    if (var6.field6148 != null) {
                        class113.field1506.method2532(var6.field6148);
                        var6.field6148 = null;
                    }
                    var6.field6140 = var13;
                }
                var6.field6136 = var11;
            }
            var6.field6141 = var6.field6139.field2666;
            var6.field6157 = var6.field6139.field2666 + (var6.field6139.method1366((byte) -95) << 6);
            var6.field6144 = var6.field6139.field2677;
            var6.field6155 = var6.field6139.field2677 + (var6.field6139.method1366((byte) -125) << 6);
            class327.method1908(arg2, var6, arg3, -49, arg0, arg1);
        }
        for (class433 var7 = (class433) class437.field6263.method2021(89); var7 != null; var7 = (class433) class437.field6263.method2017(116)) {
            byte var8 = 1;
            class511 var9 = var7.field6154.method2128(-116);
            if (var7.field6154.field4872) {
                var8 = 0;
            } else if (var7.field6154.field4888 == var9.field7375 || var7.field6154.field4888 == var9.field7395 || var7.field6154.field4888 == var9.field7397 || var7.field6154.field4888 == var9.field7380) {
                var8 = 2;
            } else if (var7.field6154.field4888 == var9.field7374 || var7.field6154.field4888 == var9.field7405 || var7.field6154.field4888 == var9.field7393 || var7.field6154.field4888 == var9.field7418) {
                var8 = 3;
            }
            if (var7.field6136 != var8) {
                int var10 = class153.method1005(var7.field6154, 127);
                if (var7.field6140 != var10) {
                    if (var7.field6148 != null) {
                        class113.field1506.method2532(var7.field6148);
                        var7.field6148 = null;
                    }
                    var7.field6140 = var10;
                }
                var7.field6136 = var8;
            }
            var7.field6141 = var7.field6154.field2666;
            var7.field6157 = var7.field6154.field2666 + (var7.field6154.method1366((byte) -95) << 6);
            var7.field6144 = var7.field6154.field2677;
            var7.field6155 = var7.field6154.field2677 + (var7.field6154.method1366((byte) -90) << 6);
            class327.method1908(arg2, var7, arg3, -110, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLfh;)V")
    public final void method1777(byte arg0, class463 arg1) {
        if (arg0 < 121) {
            method1773(-41);
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field3867++;
                return;
            }
            this.method1775(var3, arg1, false);
        }
    }

    static {
        new class335("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
