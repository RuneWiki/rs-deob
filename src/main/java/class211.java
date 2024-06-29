import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class211 extends class133 implements class171 {

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "Llc;")
    public class444 field2562;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "Z")
    private boolean field2565;

    @OriginalMember(owner = "client!pr", name = "W", descriptor = "Lcq;")
    public static class72 field2574 = new class72("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!pr", name = "X", descriptor = "Lcq;")
    public static class72 field2575 = new class72("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!pr", name = "Y", descriptor = "Z")
    public static boolean field2576 = false;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
    public final int method409(int arg0) {
        ++field2571;
        return arg0 != -50 ? 78 : this.field2562.field6132;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Luo;B)V")
    public final void method422(class118 arg0, byte arg1) {
        if (arg1 == -7) {
            this.field2562.method2750(arg1 + -121, arg0);
            ++field2569;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
    public final boolean method412(int arg0) {
        ++field2564;
        if (arg0 != 18942) {
            this.method129(-32);
        }
        return this.field2562.method2755(-1);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Luo;B)V")
    public final void method411(class118 arg0, byte arg1) {
        if (arg1 != 88) {
            this.method422((class118) null, (byte) -116);
        }
        ++field2556;
        this.field2562.method2747(arg0, 13694);
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)I")
    public final int method246(byte arg0) {
        ++field2567;
        if (arg0 != 110) {
            field2574 = null;
        }
        return this.field2562.method2745((byte) -124);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I")
    public final int method420(byte arg0) {
        ++field2560;
        int var2 = -117 / ((-21 - arg0) / 44);
        return this.field2562.field6163;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public final void method423(int arg0) {
        ++field2566;
        if (arg0 != 22486) {
            this.method412(91);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Luo;II)Lge;")
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        if (arg1 != -20264) {
            this.method417((byte) -74);
        }
        ++field2563;
        return this.field2562.method2746(arg2, arg0, 0, 0, false, false, false);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Luo;IIZ)Z")
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field2559;
        if (!arg3) {
            this.method417((byte) -120);
        }
        class386 var5 = this.field2562.method2746(65536, arg0, super.field1514, super.field1516, false, false, false);
        if (var5 == null) {
            return false;
        } else {
            class450 var6 = arg0.method742();
            var6.method929(super.field1516, super.field1521, super.field1514);
            return var5.method1474(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(Luo;B)Lkj;")
    public final class175 method130(class118 arg0, byte arg1) {
        ++field2573;
        class386 var3 = this.field2562.method2746(1024, arg0, super.field1514, super.field1516, true, false, false);
        if (var3 == null) {
            return null;
        } else {
            class450 var4 = arg0.method742();
            var4.method929(super.field1516, super.field1521, super.field1514);
            int var5 = 58 % ((11 - arg1) / 37);
            class175 var6 = null;
            if (this.field2565) {
                var6 = class68.method392((byte) 107, 1);
            }
            if (this.field2562.field6131 != null) {
                class291 var7 = this.field2562.field6131.method404();
                arg0.method729(var3, var7, var4, var6 != null ? var6.field2030[0] : null, 0);
            } else {
                var3.method1441(var4, var6 == null ? null : var6.field2030[0], 0);
            }
            this.field2562.method2754((byte) -32, arg0, var3, super.field1518, super.field1510, true, super.field1517, super.field1512);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        if (arg0 != 3652) {
            this.method246((byte) -101);
        }
        ++field2570;
        return false;
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(B)V")
    public static void method1290(byte arg0) {
        field2574 = null;
        if (arg0 >= -74) {
            field2574 = null;
        }
        field2575 = null;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Luo;Lnd;IIIIIIIZIIIII)V")
    public class211(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field6215 == -2, class446.method2766((byte) 124, arg2, arg3));
        this.field2562 = new class444(arg0, arg1, arg2, arg3, super.field1528, arg5, arg6, arg8, arg9, arg14);
        this.field2565 = arg1.field6235 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
    public static final void method1291(int arg0) {
        ++field2572;
        if (~class54.field633 > -1) {
            class54.field633 = 0;
            class419.field5717 = -1;
            class157.field1832 = -1;
        }
        if (class54.field633 > class224.field2816) {
            class54.field633 = class224.field2816;
            class419.field5717 = -1;
            class157.field1832 = -1;
        }
        if (~class394.field5366 > -1) {
            class419.field5717 = -1;
            class157.field1832 = -1;
            class394.field5366 = 0;
        }
        if (arg0 != 131072) {
            method1290((byte) -15);
        }
        if (class394.field5366 > class224.field2833) {
            class419.field5717 = -1;
            class157.field1832 = -1;
            class394.field5366 = class224.field2833;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLuo;)V")
    public final void method138(byte arg0, class118 arg1) {
        if (arg0 < 78) {
            field2574 = null;
        }
        ++field2561;
        class386 var3 = this.field2562.method2746(131072, arg1, super.field1514, super.field1516, true, false, true);
        if (var3 != null) {
            this.field2562.method2754((byte) -32, arg1, var3, super.field1518, super.field1510, false, super.field1517, super.field1512);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        if (arg5 > -115) {
            method1290((byte) -6);
        }
        ++field2557;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)I")
    public final int method417(byte arg0) {
        if (arg0 != -116) {
            this.method140(22);
        }
        ++field2558;
        return this.field2562.field6136;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Luo;Lpc;III)V")
    public static final void method1292(class118 arg0, class22 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class43.field512) {
            class316 var5 = class347.field4722[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4255 != null && var5.field4255.method129(3652)) {
                arg1.method137(arg0, 0, 128, 0, true, (byte) -122, var5.field4255);
            }
        }
        if (arg4 < class43.field512) {
            class316 var6 = class347.field4722[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4255 != null && var6.field4255.method129(3652)) {
                arg1.method137(arg0, 128, 0, 0, true, (byte) -123, var6.field4255);
            }
        }
        if (arg3 < class43.field512 && arg4 < class262.field3367) {
            class316 var7 = class347.field4722[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4255 != null && var7.field4255.method129(3652)) {
                arg1.method137(arg0, 128, 128, 0, true, (byte) -117, var7.field4255);
            }
        }
        if (arg3 < class43.field512 && arg4 > 0) {
            class316 var8 = class347.field4722[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4255 != null && var8.field4255.method129(3652)) {
                arg1.method137(arg0, -128, 128, 0, true, (byte) -126, var8.field4255);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field2568;
        if (arg0 > -24) {
            field2576 = true;
        }
        throw new IllegalStateException();
    }
}
