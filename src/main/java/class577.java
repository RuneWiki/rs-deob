import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class577 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Laf;")
    public static class39 field8108 = new class39(30);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field8107;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field8111;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIII)V", line = 6)
    public static final void method3377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8114++;
        if (class718.method4015(arg3, 73)) {
            int var10 = arg6;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class55.field651) {
                var13 = class419.field5839;
                var14 = class702.field9784;
                var11 = class500.field6850;
                var10 = class525.field7237;
                var12 = class455.field6369;
                class702.field9784 = 1;
            }
            if (class558.field7840[arg3] == null) {
                class675.method3844(-1, ~arg0 > -1, arg5, arg7, class609.field8594[arg3], arg0, arg1, arg4, 0, arg2, arg8);
            } else {
                class675.method3844(-1, arg0 < 0, arg5, arg7, class558.field7840[arg3], arg0, arg1, arg4, 0, arg2, arg8);
            }
            if (class55.field651) {
                if (arg0 >= 0 && class702.field9784 == 2) {
                    class338.method2144((byte) -61, class455.field6369, class500.field6850, class419.field5839, class525.field7237);
                }
                class500.field6850 = var11;
                class455.field6369 = var12;
                class702.field9784 = var14;
                class525.field7237 = var10;
                class419.field5839 = var13;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class363.field5240[var9] = true;
            }
        } else {
            class363.field5240[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 71)
    public static final void method3378(byte arg0) {
        int var1 = 47 % ((70 - arg0) / 41);
        if (class204.method1307(-40)) {
            if (class74.field826 == null) {
                class547.method3234(-109);
            }
            class246.field3642 = true;
            class605.field8487 = 0;
        }
        field8115++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[Lff;", line = 90)
    public static final class308[] method3379(int arg0) {
        field8117++;
        return arg0 < 99 ? null : new class308[] { class377.field5403, class377.field5412, class377.field5413, class377.field5414, class377.field5415, class377.field5416, class377.field5417, class377.field5418, class377.field5419, class377.field5420, class377.field5421, class377.field5422 };
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/lang/String;Z)V", line = 111)
    public static final void method3380(int arg0, int arg1, String arg2, boolean arg3) {
        class770.method4252(13593);
        field8113++;
        class31.method259(arg0 - 10);
        class726.method4037(127);
        class418.method2527(arg2, -2, arg3, arg1);
        class253.method1696((byte) -80);
        class715.method4006(class111.field1332, arg0 ^ arg0);
        class669.method3822(class111.field1332, (byte) 122);
        class60.method482(class111.field1332, class149.field1968, arg0 - 511);
        class523.method3120(true);
        class68.method521(17, class475.field6585);
        class23.method99(100);
        class511.method3009(arg0 ^ 0xFFFFC6FF);
        if (class664.field9331 == 3) {
            class285.method1884(true, 4);
        } else if (class664.field9331 == 7) {
            class285.method1884(true, 8);
        } else if (class664.field9331 == 10) {
            class285.method1884(true, 11);
        } else if (class664.field9331 == 1 || class664.field9331 == 2) {
            method3381((byte) 127);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 147)
    public static final void method3381(byte arg0) {
        if (arg0 <= 126) {
            return;
        }
        field8109++;
        if (class381.field5458 == null) {
            return;
        }
        class26[] var1 = class381.field5458;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class26 var3 = var1[var2];
            var3.method112(false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 171)
    public static void method3382(byte arg0) {
        field8108 = null;
        int var1 = 18 % ((arg0 - 11) / 63);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)Z", line = 183)
    public static final boolean method3383(boolean arg0, int arg1, int arg2) {
        field8110++;
        if (!arg0) {
            field8108 = null;
        }
        return (arg2 & 0x800) != 0;
    }
}
