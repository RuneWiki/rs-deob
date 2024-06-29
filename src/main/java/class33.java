import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class33 extends class41 {

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field535;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Ljava/lang/String;")
    public static String field537 = "Use";

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "[I")
    public static int[] field541 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!na", name = "P", descriptor = "Ljava/lang/String;")
    public static String field540 = "Walk here";

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Ljava/lang/String;")
    public static String field543 = "Drop";

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Z")
    public static boolean field545 = true;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Li;")
    public static class58 field546 = new class58(16);

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field548 = -1;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "[I")
    public static int[] field549;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method244(boolean arg0) {
        field541 = null;
        if (arg0) {
            method244(true);
        }
        field537 = null;
        field546 = null;
        field544 = null;
        field549 = null;
        field543 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method245(int arg0) {
        field538++;
        if (arg0 != -15007) {
            field549 = null;
        }
        return this.field535;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            return;
        }
        if (arg3 <= arg0) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class232.field3629[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class232.field3629[var6][arg1] = arg4;
            }
        }
        field534++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V")
    public static final void method247(int arg0, long arg1) {
        field536++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class146.field2345; var3++) {
            if (class44.field651[var3] == arg1) {
                class140.field2262++;
                class146.field2345--;
                for (int var4 = var3; var4 < class146.field2345; var4++) {
                    class240.field3748[var4] = class240.field3748[var4 + 1];
                    class135.field2186[var4] = class135.field2186[var4 + 1];
                    class6.field128[var4] = class6.field128[var4 + 1];
                    class44.field651[var4] = class44.field651[var4 + 1];
                    class210.field3359[var4] = class210.field3359[var4 + 1];
                    class112.field1721[var4] = class112.field1721[var4 + 1];
                }
                class24.field439 = class68.field1083;
                class311.field5027.method2081(false, 197);
                class311.field5027.method1840((byte) 47, arg1);
                break;
            }
        }
        if (arg0 <= 23) {
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILjava/awt/Component;Ltl;)Lfg;")
    public static final class13 method248(int arg0, int arg1, int arg2, Component arg3, class69 arg4) {
        field533++;
        if (~class296.field4841 == arg0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class13 var5 = (class13) Class.forName("od").getDeclaredConstructor().newInstance();
                var5.field257 = new int[(class253.field4144 ? 2 : 1) * 256];
                var5.field288 = arg2;
                var5.method110(arg3);
                var5.field279 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field279 > 16384) {
                    var5.field279 = 16384;
                }
                var5.method119(var5.field279);
                if (class312.field5035 > 0 && class285.field4627 == null) {
                    class285.field4627 = new class4();
                    class285.field4627.field93 = arg4;
                    arg4.method487(arg0 - 20348, class312.field5035, class285.field4627);
                }
                if (class285.field4627 != null) {
                    if (class285.field4627.field99[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class285.field4627.field99[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class293 var6 = new class293(arg4, arg1);
                    var6.field257 = new int[(class253.field4144 ? 2 : 1) * 256];
                    var6.field288 = arg2;
                    var6.method110(arg3);
                    var6.field279 = 16384;
                    var6.method119(var6.field279);
                    if (class312.field5035 > 0 && class285.field4627 == null) {
                        class285.field4627 = new class4();
                        class285.field4627.field93 = arg4;
                        arg4.method487(arg0 ^ 0x4F7C, class312.field5035, class285.field4627);
                    }
                    if (class285.field4627 != null) {
                        if (class285.field4627.field99[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class285.field4627.field99[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class13();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class33(Object arg0) {
        this.field535 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Z")
    public final boolean method249(byte arg0) {
        field542++;
        if (arg0 > -67) {
            field540 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)V")
    public static final void method250(long arg0, int arg1) {
        if (arg1 != 256) {
            return;
        }
        field547++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class58.method378(arg0 - 1L, arg1 + -256);
            class58.method378(1L, 0);
        } else {
            class58.method378(arg0, 0);
        }
    }
}
