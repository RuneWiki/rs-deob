import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class159 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILjava/lang/Class;)Lwl;")
    public static final class233 method1013(int arg0, int arg1, int arg2, Class arg3) {
        class193 var4 = class250.field3570[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class250 var5 = var4.field2779; var5 != null; var5 = var5.field3568) {
            class233 var6 = var5.field3571;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3268 == arg1 && var6.field3267 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        class55.field668 = arg0;
        for (int var1 = 0; var1 < class415.field5953; var1++) {
            for (int var2 = 0; var2 < class299.field4190; var2++) {
                if (class250.field3570[arg0][var1][var2] == null) {
                    class250.field3570[arg0][var1][var2] = new class193(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ltq;I)V")
    public static final void method1015(class376 arg0, int arg1) {
        field2070++;
        class183.field2508 = arg0;
        if (arg1 >= -121) {
            method1016(false, false, 67);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZI)V")
    public static final void method1016(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field2069++;
        class411 var3 = class144.method878(arg0, arg2, -109);
        if (var3 != null) {
            var3.method2594((byte) -22);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1017(byte arg0) {
        field2066++;
        if (arg0 < 46) {
            return;
        }
        if (class40.field475 == 10) {
            class178.method1210(28, -99);
        }
        if (class40.field475 == 30) {
            class178.method1210(25, -80);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)V")
    public static final void method1018(int arg0, int arg1, int arg2, long arg3) {
        field2067++;
        int var5 = ((int) arg3 & 0x7F95E) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class88 var8 = class374.method2382(var7, false);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1008;
                var10 = var8.field1029;
            } else {
                var9 = var8.field1029;
                var10 = var8.field1008;
            }
            int var11 = var8.field1047;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class95.method530(0, class384.field5422.field5677[0], true, var11, var10, arg1, 0, arg0, class384.field5422.field5664[0], var9, (byte) -45);
        } else {
            class95.method530(var6, class384.field5422.field5677[0], true, 0, 0, arg1, var5, arg0, class384.field5422.field5664[0], 0, (byte) -45);
        }
        if (arg2 != 0) {
            method1015((class376) null, -63);
        }
    }
}
