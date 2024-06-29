import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class240 {

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public int field3161 = 128;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public int field3159 = 128;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Lvg;")
    public static class622 field3158 = new class622(29, 8);

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "Z")
    public static boolean field3162 = true;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "Z")
    public static boolean field3164 = false;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "[B")
    public static byte[] field3166 = new byte[520];

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Lnga;", line = 5)
    public final class240 method1476(int arg0) {
        if (arg0 != 520) {
            this.field3157 = 28;
        }
        field3165++;
        return new class240(this.field3163, this.field3159, this.field3161, this.field3168, this.field3157, this.field3169);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lnga;I)V", line = 16)
    public final void method1477(class240 arg0, int arg1) {
        this.field3163 = arg0.field3163;
        this.field3159 = arg0.field3159;
        this.field3169 = arg0.field3169;
        this.field3168 = arg0.field3168;
        this.field3161 = arg0.field3161;
        this.field3157 = arg0.field3157;
        field3167++;
        int var3 = -118 / ((-arg1 - 47) / 59);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1478(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field3160++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 != -28325) {
            method1479((byte) -96);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V", line = 61)
    public static void method1479(byte arg0) {
        field3166 = null;
        field3158 = null;
        if (arg0 != -3) {
            method1478(-13, 81);
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V", line = 90)
    public class240(int arg0) {
        this.field3163 = arg0;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIII)V", line = 97)
    private class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3159 = arg1;
        this.field3168 = arg3;
        this.field3157 = arg4;
        this.field3163 = arg0;
        this.field3169 = arg5;
        this.field3161 = arg2;
    }
}
