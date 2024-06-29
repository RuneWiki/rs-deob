import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class257 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3681 = -1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public abstract void method107(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvc;Lnl;BLnl;)V")
    public static final void method1737(class89 arg0, class435 arg1, byte arg2, class435 arg3) {
        field3679++;
        class473.field6660 = class297.method1924(-7962, class167.field2423, arg3, 0);
        class411.field5629 = arg0.method367(class473.field6660, class355.method2189(arg1, class167.field2423, 0), true);
        if (arg2 > 103) {
            class293.field4144 = class297.method1924(-7962, class282.field4059, arg3, 0);
            class189.field2830 = arg0.method367(class293.field4144, class355.method2189(arg1, class282.field4059, 0), true);
            class402.field5516 = class297.method1924(-7962, class68.field1000, arg3, 0);
            class408.field5584 = arg0.method367(class402.field5516, class355.method2189(arg1, class68.field1000, 0), true);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lde;)V")
    public abstract void method109(class257 arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public abstract void method102(int arg0);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        class46.field710.method710(false);
        field3676++;
        int var1 = class46.field710.method712(false, 8);
        if (class24.field257 > var1) {
            for (int var2 = var1; var2 < class24.field257; var2++) {
                class105.field1473[class141.field1972++] = class193.field2873[var2];
            }
        }
        if (class24.field257 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class24.field257 = 0;
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class193.field2873[var3];
            class361 var5 = class163.field2377[var4];
            int var6 = class46.field710.method712(false, 1);
            if (var6 == 0) {
                class193.field2873[class24.field257++] = var4;
                var5.field5762 = class364.field5010;
            } else {
                int var7 = class46.field710.method712(false, 2);
                if (var7 == 0) {
                    class193.field2873[class24.field257++] = var4;
                    var5.field5762 = class364.field5010;
                    class22.field252[class53.field789++] = var4;
                } else if (var7 == 1) {
                    class193.field2873[class24.field257++] = var4;
                    var5.field5762 = class364.field5010;
                    int var8 = class46.field710.method712(false, 3);
                    var5.method2215(arg0 ^ 0x78, 1, var8);
                    int var9 = class46.field710.method712(false, 1);
                    if (var9 == 1) {
                        class22.field252[class53.field789++] = var4;
                    }
                } else if (var7 == 2) {
                    class193.field2873[class24.field257++] = var4;
                    var5.field5762 = class364.field5010;
                    if (class46.field710.method712(false, 1) == 1) {
                        int var11 = class46.field710.method712(false, 3);
                        var5.method2215(arg0 ^ 0x7E, 2, var11);
                        int var12 = class46.field710.method712(false, 3);
                        var5.method2215(79, 2, var12);
                    } else {
                        int var10 = class46.field710.method712(false, 3);
                        var5.method2215(90, 0, var10);
                    }
                    int var13 = class46.field710.method712(false, 1);
                    if (var13 == 1) {
                        class22.field252[class53.field789++] = var4;
                    }
                } else if (var7 == 3) {
                    class105.field1473[class141.field1972++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        for (class73 var1 = (class73) class6.field38.method775(1); var1 != null; var1 = (class73) class6.field38.method763(0)) {
            if (class183.method1306(false, var1.field1048)) {
                class96.method796(var1, (byte) 117);
            }
        }
        int var2 = -79 / ((-arg0 - 71) / 47);
        field3678++;
        if (class303.field4310 == 1) {
            class205.field3005 = false;
            class69.method638(class433.field6135, class315.field4455, class104.field1469, (byte) 85, class167.field2424);
            return;
        }
        class69.method638(class433.field6135, class315.field4455, class104.field1469, (byte) 113, class167.field2424);
        int var3 = class402.field5516.method1354((byte) -77, class462.field6526.method1078(class66.field967, 100));
        for (class73 var4 = (class73) class6.field38.method775(1); var4 != null; var4 = (class73) class6.field38.method763(0)) {
            int var5 = class490.method2873((byte) 118, var4);
            if (var5 > var3) {
                var3 = var5;
            }
        }
        class433.field6135 = (class128.field1746 ? 26 : 22) + class303.field4310 * 16;
        class315.field4455 = var3 + 8;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[I)V")
    public abstract void method108(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public abstract void method110(int arg0);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public abstract void method106(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public abstract void method100();

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([JII[II)V")
    public static final void method1740(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field3680++;
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var9;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var9;
            method1740(arg0, arg1, arg2, arg3, var6 - 1);
            method1740(arg0, var6 + 1, 1, arg3, arg4);
        }
        if (arg2 != 1) {
            field3681 = -80;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
    public abstract void method96(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([I)V")
    public abstract void method103(int[] arg0);

    static {
        new class151("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
