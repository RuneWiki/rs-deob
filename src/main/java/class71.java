import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 {

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Lpa;")
    private class387 field969 = new class387(256);

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Lcb;")
    private class544 field962;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lcb;")
    public static class544 field967;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lwc;", line = 4)
    public final class74 method559(int arg0, byte arg1) {
        field961++;
        class387 var3 = this.field969;
        class74 var4;
        synchronized (this.field969) {
            var4 = (class74) this.field969.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field962;
        byte[] var6;
        synchronized (this.field962) {
            var6 = this.field962.method3150(arg0, 54, 26);
        }
        class74 var7 = new class74();
        if (var6 != null) {
            var7.method580((byte) 96, new class120(var6));
        }
        class387 var8 = this.field969;
        synchronized (this.field969) {
            this.field969.method2362(var7, 0, (long) arg0);
        }
        int var9 = -32 % ((arg1 - 10) / 37);
        return var7;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBII)V", line = 32)
    public static final void method560(int arg0, byte arg1, int arg2, int arg3) {
        field963++;
        int var4 = arg2 << 3;
        int var5 = arg0 << 3;
        int var6 = arg3 << 3;
        class509.field7256 = var4;
        if (class763.field10510 == 2) {
            class689.field9757 = var4;
            class666.field9380 = var6;
            class118.field1478 = var5;
        }
        class562.field8001 = var5;
        class182.method1363(true);
        class452.field6508 = true;
        if (arg1 >= -7) {
            field967 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 58)
    public static void method561(byte arg0) {
        if (arg0 != 42) {
            field967 = null;
        }
        field967 = null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)V", line = 68)
    public final void method562(int arg0, byte arg1) {
        field966++;
        class387 var3 = this.field969;
        synchronized (this.field969) {
            this.field969.method2366(arg0, 122);
            int var4 = 76 % ((45 - arg1) / 58);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I", line = 80)
    public static final int method563(int arg0, int arg1) {
        return class322.field4766 == null ? 0 : class322.field4766[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z", line = 87)
    public static final boolean method564(int arg0, int arg1, int arg2) {
        if (arg2 <= 67) {
            return false;
        } else {
            field965++;
            return (arg0 & 0xC580) != 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 105)
    public final void method565(int arg0) {
        field964++;
        class387 var2 = this.field969;
        synchronized (this.field969) {
            if (arg0 != 2608) {
                field967 = null;
            }
            this.field969.method2364(1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 118)
    public final void method566(byte arg0) {
        field968++;
        if (arg0 != -33) {
            this.field962 = null;
        }
        class387 var2 = this.field969;
        synchronized (this.field969) {
            this.field969.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 133)
    public class71(class106 arg0, int arg1, class544 arg2) {
        this.field962 = arg2;
        this.field962.method3147(26, -124);
    }
}
