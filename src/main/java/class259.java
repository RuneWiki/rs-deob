import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class259 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Ldu;")
    private class237 field3729 = new class237();

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lao;")
    public static class188 field3735 = new class188(100, 3);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Ltn;")
    public static class58 field3741 = null;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Ldu;")
    private class237 field3733;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3743;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Ldu;", line = 3)
    public final class237 method1635(boolean arg0) {
        field3732++;
        if (arg0) {
            return null;
        }
        class237 var2 = this.field3729.field3435;
        if (this.field3729 == var2) {
            this.field3733 = null;
            return null;
        } else {
            this.field3733 = var2.field3435;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 25)
    public static void method1636(int arg0) {
        field3735 = null;
        if (arg0 != 1349767207) {
            field3741 = null;
        }
        field3741 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLdu;)V", line = 36)
    public final void method1637(byte arg0, class237 arg1) {
        if (arg1.field3435 != null) {
            arg1.method1540(-1);
        }
        field3734++;
        arg1.field3435 = this.field3729.field3435;
        arg1.field3439 = this.field3729;
        arg1.field3435.field3439 = arg1;
        if (arg0 > -44) {
            this.field3733 = null;
        }
        arg1.field3439.field3435 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 54)
    public static final void method1638(byte arg0) {
        field3738++;
        if (class312.field4479 == 2) {
            class445.field6538 = 96;
        } else {
            try {
                Method var1 = (field3743 == null ? (field3743 = method1647("java.lang.Runtime")) : field3743).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class445.field6538 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != -29) {
            field3741 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Ldu;", line = 95)
    public final class237 method1639(int arg0) {
        field3740++;
        class237 var2 = this.field3729.field3439;
        if (this.field3729 == var2) {
            this.field3733 = null;
            return null;
        }
        if (arg0 != -1) {
            method1646(-113, 57, -82, -118);
        }
        this.field3733 = var2.field3439;
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)Z", line = 117)
    public final boolean method1640(boolean arg0) {
        field3736++;
        if (arg0) {
            this.method1643(26);
        }
        return this.field3729.field3439 == this.field3729;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 245)
    public class259() {
        this.field3729.field3435 = this.field3729;
        this.field3729.field3439 = this.field3729;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 136)
    public final void method1641(int arg0) {
        if (arg0 != 3) {
            this.method1642((byte) 76);
        }
        while (true) {
            class237 var2 = this.field3729.field3439;
            if (this.field3729 == var2) {
                field3728++;
                this.field3733 = null;
                return;
            }
            var2.method1540(arg0 ^ 0xFFFFFFFC);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Ldu;", line = 160)
    public final class237 method1642(byte arg0) {
        field3742++;
        class237 var2 = this.field3733;
        if (this.field3729 == var2) {
            this.field3733 = null;
            return null;
        } else {
            this.field3733 = var2.field3439;
            int var3 = 93 / ((58 - arg0) / 32);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)I", line = 179)
    public final int method1643(int arg0) {
        if (arg0 > -66) {
            return -43;
        }
        field3731++;
        int var2 = 0;
        for (class237 var3 = this.field3729.field3439; var3 != this.field3729; var3 = var3.field3439) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Ldu;", line = 203)
    public final class237 method1644(byte arg0) {
        if (arg0 > -36) {
            return null;
        }
        field3730++;
        class237 var2 = this.field3729.field3439;
        if (this.field3729 == var2) {
            return null;
        } else {
            var2.method1540(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 223)
    public static final void method1645(int arg0) {
        class173.field2646 = new class348();
        if (arg0 <= 119) {
            method1638((byte) 4);
        }
        field3739++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)I", line = 254)
    public static final int method1646(int arg0, int arg1, int arg2, int arg3) {
        field3737++;
        if (class529.field7807 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (arg2 != 851701031) {
            method1646(-87, 97, -117, 88);
        }
        if (var4 < 0 || var5 < 0 || class237.field3436 - 1 < var4 || var5 > (class83.field1366 - 1)) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class364.field5475[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class529.field7807[var6].method273(arg1, arg0);
    }
}
