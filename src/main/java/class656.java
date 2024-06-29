import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class656 {

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "[I")
    public static int[] field9492 = new int[1];

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "[I")
    public static int[] field9491 = new int[14];

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lkea;")
    public static class203 field9485;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method3748(int arg0) {
        if (arg0 == 2048) {
            field9492 = null;
            field9485 = null;
            field9491 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static final void method3749(int arg0) {
        class88.field1018 = 0;
        field9486++;
        if (arg0 != -31964) {
            field9488 = -81;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class444.field6644[var1] = null;
            class297.field4401[var1] = 1;
            class554.field7859[var1] = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public static final void method3750(int arg0) {
        field9490++;
        int var1 = class88.field1018;
        int[] var2 = class457.field6839;
        for (int var3 = 0; var3 < var1; var3++) {
            class655 var4 = class142.field1749[var2[var3]];
            if (var4 != null) {
                class309.method2050(var4, 2, var4.method1153(true));
            }
        }
        if (arg0 != -31900) {
            method3749(99);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3751(String arg0, byte arg1) {
        field9487++;
        if (arg0 == null) {
            return;
        }
        if (!(class602.field8781 < 200 || class114.field1429) || class602.field8781 >= 200) {
            class163.method945(true, class207.field2772.method2902(class35.field396, -20139), 4);
            String var2 = class362.field5182.method2902(class35.field396, -20139);
            if (var2 != null) {
                class163.method945(true, var2, 4);
            }
            return;
        }
        String var3 = class207.method1323(32682, arg0);
        if (var3 == null || arg1 != 104) {
            return;
        }
        for (int var4 = 0; var4 < class602.field8781; var4++) {
            String var8 = class207.method1323(32682, class37.field408[var4]);
            if (var8 != null && var8.equals(var3)) {
                class163.method945(true, arg0 + class611.field8897.method2902(class35.field396, arg1 ^ 0xFFFFB13D), 4);
                return;
            }
            if (class546.field7812[var4] != null) {
                String var9 = class207.method1323(32682, class546.field7812[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class163.method945(true, arg0 + class611.field8897.method2902(class35.field396, -20139), 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class245.field3464; var5++) {
            String var6 = class207.method1323(32682, class601.field8772[var5]);
            if (var6 != null && var6.equals(var3)) {
                class163.method945(true, class331.field4761.method2902(class35.field396, -20139) + arg0 + class111.field1361.method2902(class35.field396, -20139), 4);
                return;
            }
            if (class446.field6667[var5] != null) {
                String var7 = class207.method1323(32682, class446.field6667[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class163.method945(true, class331.field4761.method2902(class35.field396, -20139) + arg0 + class111.field1361.method2902(class35.field396, -20139), 4);
                    return;
                }
            }
        }
        if (class207.method1323(32682, class439.field6548.field9452).equals(var3)) {
            class163.method945(true, class50.field536.method2902(class35.field396, arg1 ^ 0xFFFFB13D), 4);
        } else {
            class11.field92++;
            class308.method2044(class24.field254, -7434);
            class468.field6960.method1205((byte) -69, class456.method2816(-110, arg0));
            class468.field6960.method1237(1049279824, arg0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)Z")
    public static final boolean method3752(int arg0, int arg1, int arg2) {
        int var3 = -52 % ((arg0 - 18) / 49);
        field9489++;
        return (arg2 & 0x800) != 0;
    }
}
