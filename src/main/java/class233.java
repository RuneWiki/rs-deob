import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class233 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "J")
    public long field3852;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lna;")
    private class211 field3847;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
    public static int[] field3848 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3847.method1556(this.field3852, (byte) -64);
        field3853++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Lii;")
    public static final class456 method1654(int arg0, int arg1, int arg2) {
        field3851++;
        int var3 = -28 % ((86 - arg2) / 36);
        class456 var4 = (class456) class298.field4680.method1122((byte) 59, (long) arg1 << 32 | (long) arg0);
        if (var4 == null) {
            var4 = new class456(arg1, arg0);
            class298.field4680.method1127(var4, (byte) 41, var4.field7780);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method1655(int arg0) {
        field3848 = null;
        int var1 = 92 % ((arg0 - 59) / 51);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1656(String arg0, byte arg1) {
        field3849++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 95 / ((arg1 + 5) / 44);
        for (int var3 = 0; var3 < class162.field2352; var3++) {
            if (arg0.equalsIgnoreCase(class401.field6038[var3])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class358.field5565.field5443);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILmn;Lza;)V")
    public static final void method1657(int arg0, class162 arg1, class497 arg2) {
        field3850++;
        class175[] var3 = class175.method1110(arg1, class192.field2850, arg0);
        class279.field4413 = new class139[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class279.field4413[var4] = arg2.method1278(var3[var4], true);
        }
        class175[] var5 = class175.method1110(arg1, class183.field2655, 0);
        class263.field4258 = new class139[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class263.field4258[var6] = arg2.method1278(var5[var6], true);
        }
        class175[] var7 = class175.method1110(arg1, class454.field7030, 0);
        class171.field2493 = new class139[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class171.field2493[var8] = arg2.method1278(var7[var8], true);
        }
        class175[] var9 = class175.method1110(arg1, class109.field1559, 0);
        class500.field7506 = new class139[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class500.field7506[var10] = arg2.method1278(var9[var10], true);
        }
        class175[] var11 = class175.method1110(arg1, class254.field4116, 0);
        class491.field7436 = new class139[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class491.field7436[var12] = arg2.method1278(var11[var12], true);
        }
        class175[] var13 = class175.method1110(arg1, class464.field7129, 0);
        class247.field4025 = new class139[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class247.field4025[var14] = arg2.method1278(var13[var14], true);
        }
        class175[] var15 = class175.method1110(arg1, class363.field5612, 0);
        class172.field2526 = new class139[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class172.field2526[var16] = arg2.method1278(var15[var16], true);
        }
        class175[] var17 = class175.method1110(arg1, class275.field4366, 0);
        class38.field381 = new class139[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class38.field381[var18] = arg2.method1278(var17[var18], true);
        }
        class175[] var19 = class175.method1110(arg1, class437.field6753, 0);
        class382.field5865 = new class139[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class382.field5865[var20] = arg2.method1278(var19[var20], true);
        }
        class175[] var21 = class175.method1110(arg1, class32.field330, 0);
        class522.field7725 = new class139[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class522.field7725[var22] = arg2.method1278(var21[var22], true);
        }
        class175[] var23 = class175.method1110(arg1, class538.field7879, 0);
        class468.field7178 = new class139[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class468.field7178[var24] = arg2.method1278(var23[var24], true);
        }
        class175[] var25 = class175.method1110(arg1, class402.field6056, 0);
        class447.field6944 = new class139[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class447.field6944[var26] = arg2.method1278(var25[var26], true);
        }
        class457.field7052 = arg2.method1278(class175.method1115(arg1, class4.field50, 0), true);
        class120.field1645 = arg2.method1278(class175.method1115(arg1, class254.field4117, 0), true);
        class175[] var27 = class175.method1110(arg1, class80.field1189, 0);
        class376.field5792 = new class139[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class376.field5792[var28] = arg2.method1278(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lna;J[Lim;)V")
    public class233(class211 arg0, long arg1, class297[] arg2) {
        this.field3852 = arg1;
        this.field3847 = arg0;
    }
}
