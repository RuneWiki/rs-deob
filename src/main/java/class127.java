import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class127 extends class187 {

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1639 = new String[8];

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Lam;")
    public static class286 field1635;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Lam;")
    public static class286 field1649;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "[Ldb;")
    public class26[] field1640;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "[[B")
    private byte[][] field1647;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "[[[B")
    public static byte[][][] field1645;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public static final void method683(int arg0) {
        field1646++;
        class114 var1 = class424.field6221;
        synchronized (class424.field6221) {
            class424.field6221.method606((byte) 90);
            int var2 = 87 % ((44 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public static void method684(byte arg0) {
        if (arg0 != 80) {
            method689(false, (byte) -27);
        }
        field1635 = null;
        field1645 = null;
        field1649 = null;
        field1639 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
    public final boolean method685(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field1647 = null;
        }
        field1634++;
        return this.field1640[arg0].field247;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)Z")
    public final boolean method686(int arg0, boolean arg1) {
        if (arg1) {
            field1648++;
            return this.field1640[arg0].field248;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z")
    public final boolean method687(boolean arg0) {
        field1636++;
        if (this.field1640 != null) {
            return true;
        }
        if (this.field1647 == null) {
            if (!class244.field3322.method1671(this.field1643, (byte) -84)) {
                return false;
            }
            int[] var2 = class244.field3322.method1685(0, this.field1643);
            this.field1647 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1647[var3] = class244.field3322.method1687(var2[var3], this.field1643, 255);
            }
        }
        boolean var4 = arg0;
        for (int var5 = 0; var5 < this.field1647.length; var5++) {
            byte[] var14 = this.field1647[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class184.field2347.method1673(-126, var15);
        }
        if (!var4) {
            return false;
        }
        class154 var6 = new class154();
        int var7 = class244.field3322.method1691(this.field1643, 0);
        this.field1640 = new class26[var7];
        int[] var8 = class244.field3322.method1685(0, this.field1643);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1647[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class210 var12 = null;
            for (class210 var13 = (class210) var6.method814((byte) 90); var13 != null; var13 = (class210) var6.method827(85)) {
                if (var13.field2860 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class210(var11, class184.field2347.method1699(var11, 37));
                var6.method825(84, var12);
            }
            this.field1640[var8[var9]] = new class26(var10, var12);
        }
        this.field1647 = null;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)I")
    public static final int method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1638++;
        if (arg4 != 1) {
            method683(-52);
        }
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg2 : arg3;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg0) : arg2;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
    public static final void method689(boolean arg0, byte arg1) {
        field1644++;
        if (class12.field118 == arg0) {
            return;
        }
        class12.field118 = arg0;
        if (arg1 > -39) {
            field1645 = null;
        }
        class112.method602(true);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field1643 = arg0;
    }
}
