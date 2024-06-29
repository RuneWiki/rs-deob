import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class409 {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
    public boolean field6162 = false;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field6161 = 0;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field6167 = 0;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Laa;")
    public static class76 field6165 = new class76(12, 8);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field6159;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public int field6168;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lnv;")
    public class44 field6158;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[Z")
    public static boolean[] field6170;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZBLya;I)Ll;", line = 3)
    public final class127 method2452(boolean arg0, byte arg1, class11 arg2, int arg3) {
        field6164++;
        long var5 = (long) (this.field6168 | arg3 << 16 | (arg0 ? 262144 : 0) | arg2.field104 << 19);
        class127 var7 = (class127) this.field6158.field581.method2288(var5, 0);
        if (arg1 != -122) {
            this.field6158 = null;
        }
        if (var7 != null) {
            return var7;
        } else if (this.field6158.field575.method551(124, this.field6168)) {
            class319 var8 = class319.method1994(this.field6158.field575, this.field6168, 0);
            if (var8 != null) {
                var8.field4924 = var8.field4918 = var8.field4919 = var8.field4925 = 0;
                if (arg0) {
                    var8.method1985();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method1991();
                }
            }
            class127 var10 = arg2.method98(var8, true);
            if (var10 != null) {
                this.field6158.field581.method2290(var5, var10, 101);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 50)
    public static void method2453(int arg0) {
        if (arg0 != 0) {
            method2453(28);
        }
        field6170 = null;
        field6165 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z", line = 61)
    public final boolean method2454(int arg0) {
        field6166++;
        if (arg0 != 0) {
            field6167 = 111;
        }
        return this.field6158.field575.method551(101, this.field6168);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLgk;)V", line = 91)
    public final void method2455(byte arg0, class468 arg1) {
        if (arg0 != 20) {
            this.field6158 = null;
        }
        while (true) {
            int var3 = arg1.method2765(114);
            if (var3 == 0) {
                field6160++;
                return;
            }
            this.method2456(arg0 ^ 0x16, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILgk;I)V", line = 114)
    private final void method2456(int arg0, class468 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6168 = arg1.method2727((byte) 43);
        } else if (arg2 == 2) {
            this.field6159 = arg1.method2759(1919914864);
        } else if (arg2 == 3) {
            this.field6162 = true;
        } else if (arg2 == 4) {
            this.field6168 = -1;
        }
        field6163++;
        if (arg0 != 2) {
            field6170 = null;
        }
    }
}
