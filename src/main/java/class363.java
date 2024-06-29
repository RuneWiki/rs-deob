import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class363 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Ljk;")
    public static class449 field4723 = new class449(5);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4726 = 0;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method2082(int arg0) {
        field4725++;
        for (int var1 = arg0; var1 < class489.field7114; var1++) {
            int var2 = class403.field5735[var1];
            class295 var3 = class187.field2446[var2];
            if (var3 != null) {
                class489.method2964(var3.field3773.field6921, 0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4724++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Z")
    public static final boolean method2083(boolean arg0) {
        for (int var1 = class329.field4164; var1 < class524.field7753; var1++) {
            class490[][] var2 = class125.field1664[var1];
            for (int var3 = -class230.field2929; var3 <= 0; var3++) {
                int var4 = class255.field3246 + var3;
                int var5 = class255.field3246 - var3;
                if (var4 >= class253.field3235 || var5 < class469.field6812) {
                    for (int var6 = -class230.field2929; var6 <= 0; var6++) {
                        int var7 = class139.field1797 + var6;
                        int var8 = class139.field1797 - var6;
                        if (var4 >= class253.field3235) {
                            if (var7 >= class205.field2680) {
                                class490 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7142) {
                                    class291.field3709 = arg0;
                                    class523.field7719.method1419(1911, var9);
                                    class523.field7719.method1422(255);
                                }
                            }
                            if (var8 < class316.field4043) {
                                class490 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7142) {
                                    class291.field3709 = arg0;
                                    class523.field7719.method1419(1911, var10);
                                    class523.field7719.method1422(255);
                                }
                            }
                        }
                        if (var5 < class469.field6812) {
                            if (var7 >= class205.field2680) {
                                class490 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7142) {
                                    class291.field3709 = arg0;
                                    class523.field7719.method1419(1911, var11);
                                    class523.field7719.method1422(255);
                                }
                            }
                            if (var8 < class316.field4043) {
                                class490 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7142) {
                                    class291.field3709 = arg0;
                                    class523.field7719.method1419(1911, var12);
                                    class523.field7719.method1422(255);
                                }
                            }
                        }
                        if (class356.field4584 == 0) {
                            if (class467.field6749) {
                                class523.field7719.method1421(5000, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method2084(int arg0) {
        field4723 = null;
        if (arg0 != 0) {
            method2084(-20);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class363(String arg0, int arg1) {
        this.field4728 = arg1;
    }
}
