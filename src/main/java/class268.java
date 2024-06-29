import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class268 extends class86 {

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field4354;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "S")
    public static short field4352 = 205;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Leb;")
    public static class103 field4348;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[I")
    public static int[] field4349;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)[Ljg;")
    public static final class271[] method1815(int arg0) {
        field4355++;
        class271[] var1 = new class271[class154.field2484];
        for (int var2 = 0; var2 < class154.field2484; var2++) {
            byte[] var4 = class168.field2726[var2];
            int var5 = class263.field4168[var2] * class207.field3348[var2];
            if (class130.field2181[var2]) {
                byte[] var8 = class106.field1851[var2];
                int[] var9 = new int[var5];
                for (int var10 = 0; var10 < var5; var10++) {
                    var9[var10] = class45.method348(class131.field2187[class204.method1369(var4[var10], 255)], class204.method1369(var8[var10], 255) << 24);
                }
                var1[var2] = new class24(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], var9);
            } else {
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = class131.field2187[class204.method1369(255, var4[var7])];
                }
                var1[var2] = new class43(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], var6);
            }
        }
        int var3 = -51 % ((arg0 + 43) / 52);
        class111.method804(0);
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V")
    public static void method1816(int arg0) {
        field4348 = null;
        field4349 = null;
        if (arg0 <= 81) {
            method1816(32);
        }
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method613(int arg0) {
        field4353++;
        int var2 = -59 / ((arg0 - 7) / 37);
        return this.field4354;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Lfd;")
    public static final class219 method1817(int arg0, int arg1) {
        if (arg1 > -65) {
            field4349 = null;
        }
        field4356++;
        return class196.field3169 && class26.field315 <= arg0 && arg0 <= class77.field1046 ? class238.field3803[arg0 - class26.field315] : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method1818(Object arg0, boolean arg1, boolean arg2) {
        field4357++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class242.method1591((byte) -52, var3) : var3;
        } else if (arg0 instanceof class274) {
            class274 var4 = (class274) arg0;
            return var4.method631((byte) -84);
        } else {
            if (arg1) {
                method1816(-5);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Leb;I)Z")
    public static final boolean method1819(class103 arg0, int arg1) {
        if (arg1 != -3) {
            return true;
        }
        field4351++;
        if (arg0.field1618 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1618.length; var2++) {
            int var3 = class124.method863((byte) 121, arg0, var2);
            int var4 = arg0.field1553[var2];
            if (arg0.field1618[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1618[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1618[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class268(Object arg0) {
        this.field4354 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(Z)Z")
    public final boolean method612(boolean arg0) {
        if (!arg0) {
            method1815(-104);
        }
        field4350++;
        return false;
    }
}
