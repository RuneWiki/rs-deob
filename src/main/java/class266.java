import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class266 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field4785 = new int[50];

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public static boolean field4798 = false;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lud;")
    public static class279 field4795 = class130.method1024(":assistreq:", 255);

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4790 = -1;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field4793;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lok;")
    public static class149 field4799;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Z")
    public static boolean field4788;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V", line = 10)
    public static final void method1902(int arg0, byte arg1) {
        field4792++;
        if (arg1 == -65) {
            class104 var2 = class293.method2085(5, arg0, false);
            var2.method875(arg1 ^ 0xFFFFCF0D);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V", line = 27)
    public static final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 24) {
            method1906((class53) null, -32);
        }
        field4784++;
        if (arg0 == arg3) {
            class191.method1450(arg5, arg4, arg1, (byte) 57, arg0);
        } else if (class249.field4449 <= (arg1 - arg0) && (arg1 + arg0) <= class44.field929 && arg4 - arg3 >= class135.field2463 && (arg3 + arg4) <= class108.field2002) {
            class216.method1579(arg3, arg5, 28193, arg0, arg1, arg4);
        } else {
            class212.method1554(arg4, arg3, true, arg5, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 71)
    public static void method1904(int arg0) {
        if (arg0 <= 99) {
            field4798 = true;
        }
        field4795 = null;
        field4785 = null;
        field4799 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I", line = 88)
    public static final int method1905(boolean arg0) {
        if (!arg0) {
            field4798 = false;
        }
        field4794++;
        return 2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lvh;I)Lj;", line = 102)
    public static final class282 method1906(class53 arg0, int arg1) {
        if (arg1 != 24) {
            field4790 = 36;
        }
        class282 var2 = new class282();
        field4786++;
        var2.field5038 = arg0.method468(arg1 ^ 0x6E2E);
        var2.field5033 = class230.method1666((byte) -19, var2.field5038);
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)J", line = 116)
    public static final long method1907(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null || var3.field3440 == null ? 0L : var3.field3440.field4325;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lvh;B)V", line = 124)
    public static final void method1908(class53 arg0, byte arg1) {
        if (arg1 != -1) {
            field4788 = true;
        }
        byte[] var2 = new byte[24];
        field4800++;
        if (class287.field5126 != null) {
            try {
                class287.field5126.method1874(true, 0L);
                class287.field5126.method1884(true, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method471(0, 24, (byte) -81, var2);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 180)
    public static final void method1909(int arg0) {
        field4801++;
        class161.field2911 = null;
        class272.method1938(0, arg0, class221.field3899, -1, (byte) -116, 0, class176.field3150, 0, class307.field5444);
        if (class161.field2911 != null) {
            class204.method1508(-1412584499, 0, class176.field3150, 0, (byte) 120, class307.field5460.field154, class221.field3899, class117.field2136, class161.field2911, class60.field1260);
            class161.field2911 = null;
        }
    }
}
