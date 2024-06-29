import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class92 {

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Z")
    public boolean field1440 = false;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field1436 = -1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[I")
    private int[] field1435 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1433 = 1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Leg;")
    public static class37 field1432 = class174.method1167("Chargement des polices )2 ", -64);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Ljl;")
    public static class101 field1442;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Ljl;")
    public static class101 field1449;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Laa;")
    public static class183 field1431;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
    private int[] field1438;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[S")
    private short[] field1430;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[S")
    private short[] field1434;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[S")
    private short[] field1448;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[S")
    private short[] field1451;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Leg;I)I")
    public static final int method597(class37 arg0, int arg1) {
        field1453++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class242.field4363; var2++) {
            if (arg0.method256(true, class22.field289[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)Lel;")
    public final class211 method598(boolean arg0) {
        field1443++;
        if (arg0) {
            this.method598(true);
        }
        class211[] var2 = new class211[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1435[var4] != -1) {
                var2[var3++] = class211.method1494(class75.field1172, this.field1435[var4], 0);
            }
        }
        class211 var5 = new class211(var2, var3);
        if (this.field1434 != null) {
            for (int var6 = 0; var6 < this.field1434.length; var6++) {
                var5.method1489(this.field1434[var6], this.field1448[var6]);
            }
        }
        if (this.field1430 != null) {
            for (int var7 = 0; var7 < this.field1430.length; var7++) {
                var5.method1497(this.field1430[var7], this.field1451[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)[Lmd;")
    public static final class208[] method599(boolean arg0) {
        field1446++;
        class208[] var1 = new class208[class5.field91];
        for (int var2 = 0; var2 < class5.field91; var2++) {
            var1[var2] = new class14(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], class170.field2848[var2], class262.field4617);
        }
        if (arg0) {
            method600(52);
        }
        class5.method33(24094);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method600(int arg0) {
        class208.field3521.method1409(arg0 + 121);
        if (arg0 != -1) {
            method600(-6);
        }
        field1450++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lva;II)V")
    private final void method601(class187 arg0, int arg1, int arg2) {
        field1437++;
        if (arg1 != 4025) {
            return;
        }
        if (arg2 == 1) {
            this.field1436 = arg0.method1268(255);
        } else if (arg2 == 2) {
            int var4 = arg0.method1268(255);
            this.field1438 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1438[var5] = arg0.method1244(false);
            }
        } else if (arg2 == 3) {
            this.field1440 = true;
        } else if (arg2 == 40) {
            int var8 = arg0.method1268(255);
            this.field1434 = new short[var8];
            this.field1448 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1434[var9] = (short) arg0.method1244(false);
                this.field1448[var9] = (short) arg0.method1244(false);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1268(arg1 ^ 0xF46);
            this.field1430 = new short[var6];
            this.field1451 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1430[var7] = (short) arg0.method1244(false);
                this.field1451[var7] = (short) arg0.method1244(false);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1435[arg2 - 60] = arg0.method1244(false);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1431 = null;
        field1442 = null;
        field1449 = null;
        field1432 = null;
        if (arg0 > -71) {
            method602((byte) -57);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)Z")
    public final boolean method603(byte arg0) {
        field1444++;
        if (this.field1438 == null) {
            return true;
        } else if (arg0 == -86) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1438.length; var3++) {
                if (!class75.field1172.method667(0, this.field1438[var3], (byte) -104)) {
                    var2 = false;
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILva;)V")
    public final void method604(int arg0, class187 arg1) {
        field1445++;
        while (true) {
            int var3 = arg1.method1268(255);
            if (var3 == 0) {
                if (arg0 == 2657) {
                    return;
                } else {
                    method607(-43, -102);
                    return;
                }
            }
            this.method601(arg1, 4025, var3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lel;")
    public final class211 method605(int arg0) {
        field1439++;
        if (this.field1438 == null) {
            return null;
        }
        class211[] var2 = new class211[this.field1438.length];
        for (int var3 = 0; var3 < this.field1438.length; var3++) {
            var2[var3] = class211.method1494(class75.field1172, this.field1438[var3], 0);
        }
        if (arg0 != -7407) {
            return null;
        }
        class211 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class211(var2, var2.length);
        }
        if (this.field1434 != null) {
            for (int var5 = 0; var5 < this.field1434.length; var5++) {
                var4.method1489(this.field1434[var5], this.field1448[var5]);
            }
        }
        if (this.field1430 != null) {
            for (int var6 = 0; var6 < this.field1430.length; var6++) {
                var4.method1497(this.field1430[var6], this.field1451[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Z")
    public final boolean method606(int arg0) {
        field1447++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1435[var3] != -1 && !class75.field1172.method667(0, this.field1435[var3], (byte) -104)) {
                var2 = false;
            }
        }
        if (arg0 < 55) {
            this.method603((byte) -50);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method607(int arg0, int arg1) {
        class120.field2029 = 1;
        if (arg1 != 41) {
            return;
        }
        class75.field1171 = arg0;
        class47.field737 = -1;
        field1441++;
        class56.field874 = -1;
        class156.field2607 = 0;
        class116.field1979 = false;
        class269.field4697 = null;
    }
}
