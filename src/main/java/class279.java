import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class279 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4432 = "white:";

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lwb;")
    public static class171 field4431;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lkh;")
    public static class17 field4426;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lcg;")
    public static class49 field4424;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lcg;")
    public static class49 field4425;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[[[Lk;")
    public static class257[][][] field4430;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1910(int arg0) {
        if (arg0 != -1) {
            method1910(37);
        }
        field4428++;
        if ((double) class305.field4839 == 3.0D) {
            return 37;
        } else if ((double) class305.field4839 == 4.0D) {
            return 50;
        } else if ((double) class305.field4839 == 6.0D) {
            return 75;
        } else if ((double) class305.field4839 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 29)
    public static void method1911(int arg0) {
        field4430 = (class257[][][]) null;
        field4432 = null;
        field4424 = null;
        field4431 = null;
        field4425 = null;
        field4426 = null;
        if (arg0 <= 44) {
            field4424 = (class49) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1912(byte arg0) {
        class276.field4398.method29(true);
        field4429++;
        int var1 = class276.field4398.method35(8, (byte) 61);
        if (var1 < class191.field3200) {
            for (int var2 = var1; var2 < class191.field3200; var2++) {
                class180.field3037[class34.field489++] = class33.field468[var2];
            }
        }
        if (class191.field3200 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class191.field3200 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class33.field468[var3];
            class278 var5 = class320.field5071[var4];
            int var6 = class276.field4398.method35(1, (byte) 77);
            if (var6 == 0) {
                class33.field468[class191.field3200++] = var4;
                var5.field2029 = class181.field3045;
            } else {
                int var7 = class276.field4398.method35(2, (byte) -117);
                if (var7 == 0) {
                    class33.field468[class191.field3200++] = var4;
                    var5.field2029 = class181.field3045;
                    class146.field2641[class119.field2067++] = var4;
                } else if (var7 == 1) {
                    class33.field468[class191.field3200++] = var4;
                    var5.field2029 = class181.field3045;
                    int var12 = class276.field4398.method35(3, (byte) 95);
                    var5.method978(1, var12, -1);
                    int var13 = class276.field4398.method35(1, (byte) -126);
                    if (var13 == 1) {
                        class146.field2641[class119.field2067++] = var4;
                    }
                } else if (var7 == 2) {
                    class33.field468[class191.field3200++] = var4;
                    var5.field2029 = class181.field3045;
                    if (class276.field4398.method35(1, (byte) 65) == 1) {
                        int var8 = class276.field4398.method35(3, (byte) -127);
                        var5.method978(2, var8, -1);
                        int var9 = class276.field4398.method35(3, (byte) -118);
                        var5.method978(2, var9, -1);
                    } else {
                        int var10 = class276.field4398.method35(3, (byte) 88);
                        var5.method978(0, var10, -1);
                    }
                    int var11 = class276.field4398.method35(1, (byte) -117);
                    if (var11 == 1) {
                        class146.field2641[class119.field2067++] = var4;
                    }
                } else if (var7 == 3) {
                    class180.field3037[class34.field489++] = var4;
                }
            }
        }
        if (arg0 < 67) {
            field4425 = (class49) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V", line = 172)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class341.field5443.field5353 = 0;
        class341.field5443.method2370(20, (byte) -20);
        class341.field5443.method2370(arg4, (byte) -20);
        field4434++;
        class341.field5443.method2370(arg1, (byte) -20);
        if (arg2 > -41) {
            method1913(-41, 40, -102, 29, 40);
        }
        class341.field5443.method2359(-805606200, arg0);
        class341.field5443.method2359(-805606200, arg3);
        class225.field3792 = 0;
        class148.field2660 = -3;
        class69.field1127 = 1;
        class108.field1843 = 0;
    }
}
