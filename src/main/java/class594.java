import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class594 {

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public int field8156;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "B")
    public byte field8158;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    private int field8147;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field8151;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field8152;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Ljq;")
    public class594 field8143;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lcv;")
    public static class264 field8145 = new class264();

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "[I")
    public static int[] field8159 = new int[2];

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public int field8142;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public int field8146;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public int field8148;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public int field8149;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public int field8150;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public int field8154;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field8155;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public int field8160;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public int field8161;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Z")
    public static boolean field8144;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILrq;)I", line = 11)
    public static final int method3299(int arg0, class39 arg1) {
        field8162++;
        if (arg1.field474 == 0) {
            return 0;
        }
        if (arg1.field430 != -1) {
            class39 var2 = null;
            if (arg1.field430 < 32768) {
                class637 var3 = (class637) class77.field955.method2506(90, (long) arg1.field430);
                if (var3 != null) {
                    var2 = var3.field8702;
                }
            } else if (arg1.field430 >= 32768) {
                var2 = class292.field3912[arg1.field430 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field3929 - var2.field3929;
                int var5 = arg1.field3917 - var2.field3917;
                if (var4 != 0 || var5 != 0) {
                    arg1.method230(0, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class519) {
            class519 var6 = (class519) arg1;
            if (var6.field7167 != -1 && (var6.field520 == 0 || var6.field523 > 0)) {
                var6.method230(0, var6.field7167);
                var6.field7167 = -1;
            }
        } else if (arg1 instanceof class676) {
            class676 var7 = (class676) arg1;
            if (var7.field9593 != -1 && (var7.field520 == 0 || var7.field523 > 0)) {
                int var8 = var7.field3929 - ((var7.field9593 - class253.field3490 - class253.field3490) * 256);
                int var9 = var7.field3917 - ((var7.field9586 - class186.field2280 - class186.field2280) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method230(0, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field9593 = -1;
            }
        }
        if (arg0 != 256) {
            field8145 = null;
        }
        return arg1.method229(113);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 90)
    public static final void method3300(int arg0) {
        field8141++;
        class560 var1 = class445.field6125;
        synchronized (class445.field6125) {
            class445.field6125.method3144(true);
        }
        if (arg0 != -15069) {
            method3301((byte) 71);
        }
        class560 var2 = class31.field301;
        synchronized (class31.field301) {
            class31.field301.method3144(true);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 118)
    public static void method3301(byte arg0) {
        field8145 = null;
        field8159 = null;
        int var1 = -86 % ((arg0 + 77) / 42);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)Ljq;", line = 129)
    public final class594 method3302(int arg0, int arg1, int arg2, int arg3) {
        field8153++;
        if (arg1 != -32768) {
            method3301((byte) 39);
        }
        return new class594(this.field8147, arg3, arg0, arg2, this.field8158);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIB)V", line = 145)
    public class594(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8156 = arg1;
        this.field8158 = arg4;
        this.field8147 = arg0;
        this.field8151 = arg2;
        this.field8152 = arg3;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljq;I)V", line = 160)
    public class594(class594 arg0, int arg1) {
        this.field8143 = arg0;
        this.field8156 = this.field8143.field8156 + arg1;
        this.field8152 = this.field8143.field8152 + arg1;
        this.field8147 = this.field8143.field8147;
        this.field8151 = this.field8143.field8151 + arg1;
        this.field8158 = this.field8143.field8158;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Lpca;", line = 173)
    public final class315 method3303(boolean arg0) {
        field8157++;
        if (!arg0) {
            method3301((byte) -108);
        }
        return class156.method1035(49, this.field8147);
    }
}
