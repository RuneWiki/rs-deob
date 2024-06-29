import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class221 {

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Lej;")
    public static class104 field3163 = new class104("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "F")
    public static float field3165;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[I")
    public static int[] field3162;

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIII)V")
    public class221(int arg0, int arg1, int arg2, int arg3) {
        this.field3158 = arg2;
        this.field3159 = arg3;
        this.field3157 = arg0;
        this.field3160 = arg1;
    }

    @OriginalMember(owner = "client!oca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3161++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field3163 = null;
        int var1 = 118 / ((arg0 + 70) / 48);
        field3162 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIZLwf;)J")
    public static final long method1420(int arg0, int arg1, boolean arg2, class115 arg3) {
        field3164++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class364 var10 = class18.field227.method1201((byte) 111, arg3.method748(false));
        long var11 = (long) (arg1 | 0x800000 << 7 | arg0 | arg3.method752(true) << 14 | arg3.method749(24194) << 20);
        if (var10.field4881 == 0) {
            var11 |= var8;
        }
        if (var10.field4900 == 1) {
            var11 |= var4;
        }
        if (var10.field4912) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method748(arg2) << 32;
    }
}
