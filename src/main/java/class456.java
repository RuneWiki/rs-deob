import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class456 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public volatile int field6761 = 0;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field6763 = 0;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
    public float[] field6765 = new float[5000];

    @OriginalMember(owner = "client!or", name = "i", descriptor = "[B")
    public byte[] field6769 = new byte[5000];

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public int field6767 = 0;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field6772 = new Object[5000];

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public volatile int field6766 = 0;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lbj;")
    public static class162 field6762 = new class162(44, 3);

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Z")
    public static boolean field6768 = true;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Los;")
    public static class309 field6770 = new class309("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "Lvp;")
    public static class126 field6773;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZII)V", line = 4)
    public static final void method2719(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            field6774++;
            if (class186.field2990.field2532 != 0 && arg4 != 0 && class218.field3439 < 50 && arg2 != -1) {
                class276.field4170[class218.field3439++] = new class387((byte) 1, arg2, arg4, arg1, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 22)
    public static final void method2720(int arg0, int arg1) {
        class31 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class38 var4 = class531.field7727[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class220.field3464; var5++) {
                    for (int var6 = 0; var6 < class493.field7231; var6++) {
                        var2 = var4.method189(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class353.field5216;
                            int var8 = var5 << class353.field5216;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class38 var10 = class531.field7727[var9];
                                if (var10 != null) {
                                    int var11 = var4.method177(var6, var5) - var10.method177(var6, var5);
                                    int var12 = var4.method177(var6 + 1, var5) - var10.method177(var6 + 1, var5);
                                    int var13 = var4.method177(var6 + 1, var5 + 1) - var10.method177(var6 + 1, var5 + 1);
                                    int var14 = var4.method177(var6, var5 + 1) - var10.method177(var6, var5 + 1);
                                    var10.method180(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 101)
    public static void method2721(int arg0) {
        field6762 = null;
        field6773 = null;
        field6770 = null;
        if (arg0 != 29501) {
            method2720(-98, -48);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIIZ)V", line = 128)
    public static final void method2722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6764++;
        if (arg6) {
            field6762 = null;
        }
        class481[] var7 = class139.field2328;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class481 var9 = var7[var8];
            if (var9 != null && var9.field7094 == 2) {
                class49.method467(-5206, var9.field7095, var9.field7099, var9.field7103 * 2, arg4 >> 1, arg1, arg2 >> 1, var9.field7104, arg3);
                if (class60.field1240[0] > -1 && (class62.field1268 % 20) < 10) {
                    class398.field6036[var9.field7098].method159(class60.field1240[0] + arg0 - 12, arg5 - -class60.field1240[1] + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLak;)V")
    public abstract void method1344(byte arg0, class234 arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(FIZLya;I)V")
    public abstract void method1346(float arg0, int arg1, boolean arg2, class38 arg3, int arg4);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public abstract void method1345(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILak;)V")
    public abstract void method1339(int arg0, class234 arg1);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
    public abstract void method1347(int arg0, int arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
    public abstract void method1341(byte arg0, int arg1);

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public abstract void method1349(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lak;I)V")
    public abstract void method1343(class234 arg0, int arg1);
}
