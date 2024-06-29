import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    private int[] field1625;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lsc;")
    private static class128 field1633 = class129.method1017(false, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lsc;")
    public static class128 field1626 = class129.method1017(false, "blaugr-Un:");

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lsc;")
    public static class128 field1628 = class129.method1017(false, "Fps:");

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lsc;")
    public static class128 field1630 = class129.method1017(false, "Weiter");

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lsc;")
    public static class128 field1640 = class129.method1017(false, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lsc;")
    public static class128 field1638 = field1633;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lsc;")
    private static class128 field1632 = class129.method1017(false, "Members only world");

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lsc;")
    public static class128 field1627 = field1632;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lqe;")
    public static class116 field1641;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lff;")
    public static class42 field1636;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
    public static boolean field1624;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method548(byte arg0) {
        class103.field2347.method919((byte) -104);
        class46.field854.method919((byte) -104);
        if (arg0 >= -61) {
            field1633 = null;
        }
        field1629++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method549(int arg0) {
        field1635++;
        class51.field1034.method919((byte) -104);
        if (arg0 < 53) {
            method550(null, null, (byte) -11, null, null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsf;Lsc;BLsf;Lsc;)Lgf;")
    public static final class48 method550(class131 arg0, class128 arg1, byte arg2, class131 arg3, class128 arg4) {
        if (arg2 <= 0) {
            method549(-14);
        }
        field1637++;
        int var5 = arg3.method1036(arg4, (byte) -103);
        int var6 = arg3.method1031(var5, arg1, (byte) -52);
        return class1.method2(var5, arg3, arg0, var6, 25195);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
    public class73(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1625 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1625[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1625[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1625[var5 + var5] = arg0[var4];
            this.field1625[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method551(int arg0) {
        field1638 = null;
        field1627 = null;
        if (arg0 != -1) {
            field1627 = null;
        }
        field1636 = null;
        field1632 = null;
        field1641 = null;
        field1626 = null;
        field1628 = null;
        field1633 = null;
        field1630 = null;
        field1640 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public final int method552(int arg0, int arg1) {
        if (arg0 >= -92) {
            return 98;
        }
        int var3 = (this.field1625.length >> 1) - 1;
        int var4 = var3 & arg1;
        field1623++;
        while (true) {
            int var5 = this.field1625[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1625[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
