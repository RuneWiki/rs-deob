import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class465 extends class90 {

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[B")
    public byte[] field6552;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6549 = 1406;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field6555 = 0;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field6550 = -1;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field6556 = 0;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lct;")
    public static class285 field6553 = new class285(6, -1);

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Ldp;")
    public static class319 field6548;

    static {
        new class332("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 5)
    public static void method2731(byte arg0) {
        field6548 = null;
        field6553 = null;
        if (arg0 <= 65) {
            method2732(81, -82, -67, false, 75, -55, true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V", line = 24)
    public class465(byte[] arg0) {
        this.field6552 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZIIZ)V", line = 34)
    public static final void method2732(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field6557++;
        if (arg2 != -1400) {
            method2735((byte) -1);
        }
        if (arg1 >= arg0) {
            return;
        }
        int var7 = (arg1 + arg0) / 2;
        int var8 = arg1;
        class187 var9 = class201.field3056[var7];
        class201.field3056[var7] = class201.field3056[arg0];
        class201.field3056[arg0] = var9;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if (class132.method916(arg5, arg4, class201.field3056[var10], (byte) 101, var9, arg3, arg6) <= 0) {
                class187 var11 = class201.field3056[var10];
                class201.field3056[var10] = class201.field3056[var8];
                class201.field3056[var8++] = var11;
            }
        }
        class201.field3056[arg0] = class201.field3056[var8];
        class201.field3056[var8] = var9;
        method2732(var8 - 1, arg1, -1400, arg3, arg4, arg5, arg6);
        method2732(arg0, var8 + 1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 78)
    public static final int method2733(int arg0, int arg1) {
        return class318.field4780 == null ? 0 : (class318.field4780[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 82)
    public static final void method2734(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5044 != null) {
            var3.field5044 = null;
        }
        if (var3.field5047 != null) {
            var3.field5047 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 99)
    public static final void method2735(byte arg0) {
        field6554++;
        for (class171 var1 = (class171) class36.field460.method2456(32101); var1 != null; var1 = (class171) class36.field460.method2461(301)) {
            class226 var3 = var1.field2432;
            if (class486.field6836 != var3.field4545 || var3.field3301 < class452.field6418) {
                var1.method283(2);
                var3.method1470(-1);
            } else if (class452.field6418 >= var3.field3286) {
                if (var3.field3292 > 0) {
                    class349 var4 = class18.field241[var3.field3292 - 1];
                    if (var4 != null && var4.field4543 >= 0 && var4.field4543 < (class379.field5642 * 128) && var4.field4538 >= 0 && var4.field4538 < (class456.field6477 * 128)) {
                        var3.method1471(class25.method219(48602855, var3.field4545, var4.field4538, var4.field4543) - var3.field3309, var4.field4543, class452.field6418, var4.field4538, 75);
                    }
                }
                if (var3.field3292 < 0) {
                    int var5 = -var3.field3292 - 1;
                    class257 var6;
                    if (class263.field3910 == var5) {
                        var6 = class472.field6622;
                    } else {
                        var6 = class40.field565[var5];
                    }
                    if (var6 != null && var6.field4543 >= 0 && var6.field4543 < class379.field5642 * 128 && var6.field4538 >= 0 && class456.field6477 * 128 > var6.field4538) {
                        var3.method1471(class25.method219(48602855, var3.field4545, var6.field4538, var6.field4543) - var3.field3309, var6.field4543, class452.field6418, var6.field4538, 118);
                    }
                }
                var3.method1472(16383, class269.field3987);
                class204.method1394(var3, true);
            }
        }
        int var2 = -97 / ((arg0 - 48) / 33);
    }
}
