import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class166 {

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[Lpl;")
    public class293[] field134 = new class293[5];

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public int field139 = 0;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
    public int[] field143 = new int[5];

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[Z")
    public static boolean[] field130 = new boolean[8];

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[I")
    public static int[] field128 = new int[4096];

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Lak;")
    public class140 field144;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lqh;")
    public class206 field123;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "Lhi;")
    public class225 field148;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lpc;")
    public class22 field129;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lik;")
    public class267 field124;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lti;")
    public static class5 field122;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lwj;")
    public class6 field145;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "Lbh;")
    public class7 field147;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "Z")
    public boolean field136;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Z")
    public boolean field141;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Z")
    public boolean field142;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)J")
    public static final long method61(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field125; var4++) {
            class293 var5 = var3.field134[var4];
            if ((var5.field4618 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4612 == arg2) {
                return var5.field4618;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void method62(boolean arg0) {
        field130 = null;
        field128 = null;
        if (arg0) {
            method64(-91, 26, (byte) 97, 117, -73);
        }
        field122 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(III)V")
    public class6(int arg0, int arg1, int arg2) {
        this.field146 = arg1;
        this.field138 = this.field133 = arg0;
        this.field131 = arg2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILnj;)V")
    public static final void method63(int arg0, int arg1, class144 arg2) {
        field137++;
        if (class192.field2978 < arg2.field2276) {
            class53.method396((byte) 43, arg2);
        } else if (class192.field2978 <= arg2.field2294) {
            class208.method1398(arg2, -4045);
        } else {
            class152.method1022(arg2, (byte) 124);
        }
        if (arg2.field2240 < 128 || arg2.field2278 < 128 || arg2.field2240 >= 13184 || arg2.field2278 >= 13184) {
            arg2.field2299 = -1;
            arg2.field2294 = 0;
            arg2.field2276 = 0;
            arg2.field2214 = -1;
            arg2.field2240 = arg2.field2268[0] * 128 + (arg2.method971(65535) * 64);
            arg2.field2278 = arg2.field2271[0] * 128 + arg2.method971(65535) * 64;
            arg2.method973(false);
        }
        if (class283.field4473 == arg2 && (arg2.field2240 < 1536 || arg2.field2278 < 1536 || arg2.field2240 >= 11776 || arg2.field2278 >= 11776)) {
            arg2.field2276 = 0;
            arg2.field2294 = 0;
            arg2.field2214 = -1;
            arg2.field2299 = -1;
            arg2.field2240 = arg2.field2268[0] * 128 + (arg2.method971(65535) * 64);
            arg2.field2278 = arg2.field2271[0] * 128 + arg2.method971(65535) * 64;
            arg2.method973(false);
        }
        if (arg0 < 60) {
            field127 = 38;
        }
        class168.method1132(arg2, 65536);
        class265.method1793((byte) 122, arg2);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBII)V")
    public static final void method64(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class90.field1568 <= arg1 && class266.field4247 >= arg1) {
            int var5 = class219.method1470(class223.field3423, arg4, -1, class148.field2338);
            int var6 = class219.method1470(class223.field3423, arg3, -1, class148.field2338);
            class168.method1134(var6, arg0, arg1, var5, 119);
        }
        int var7 = 73 % (-arg2 / 36);
        field119++;
    }
}
