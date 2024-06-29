import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class138 extends class254 {

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[Lm;")
    public class116[] field2403;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Lcf;")
    public static class93 field2400 = class147.method1066("Lade Texturen )2 ", -48);

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Z")
    public static boolean field2402 = false;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field2407 = 0;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Z")
    public final boolean method1005(int arg0, int arg1) {
        field2408++;
        return arg0 == -24204 ? this.field2403[arg1].field2060 : true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)Z")
    public final boolean method1006(int arg0, boolean arg1) {
        if (arg1) {
            method1009(false, (class177) null, true, (class177) null);
        }
        field2401++;
        return this.field2403[arg0].field2047;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        field2409++;
        if (arg0 != 0) {
            field2402 = true;
        }
        class234.field4175.method840((byte) -13);
        class66.field1213 = null;
        class120.field2138 = 1;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field2400 = null;
        if (arg0 >= -53) {
            field2402 = false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLhg;ZLhg;)V")
    public static final void method1009(boolean arg0, class177 arg1, boolean arg2, class177 arg3) {
        class249.field4484 = arg2;
        class238.field4251 = arg1;
        if (!arg0) {
            field2400 = null;
        }
        field2406++;
        class76.field1418 = arg3;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)Z")
    public static final boolean method1010(int arg0, int arg1) {
        if (arg1 <= 44) {
            return true;
        } else {
            field2399++;
            return arg0 >= 0 && class112.field1917.length > arg0 ? class112.field1917[arg0] : false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lhg;Lhg;IZ)V")
    public class138(class177 arg0, class177 arg1, int arg2, boolean arg3) {
        class160 var5 = new class160();
        int var6 = arg0.method1283(arg2, -5357);
        this.field2403 = new class116[var6];
        int[] var7 = arg0.method1260(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class3 var9 = null;
            byte[] var10 = arg0.method1271(arg2, -2154, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class3 var12 = (class3) var5.method1151(109); var12 != null; var12 = (class3) var5.method1159(57)) {
                if (var12.field26 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1265(0, false, var11);
                } else {
                    var13 = arg1.method1265(var11, false, 0);
                }
                var9 = new class3(var11, var13);
                var5.method1152((byte) -5, var9);
            }
            this.field2403[var7[var8]] = new class116(var10, var9);
        }
    }
}
