import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Ll;")
    public static class21 field9 = class28.method185(-20839, "map");

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static volatile int field8 = -1;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "[I")
    public static int[] field11 = new int[256];

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Ll;")
    public static class21 field14;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "I")
    public static int sizeZ;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "J")
    public static long field13;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "[I")
    public static int[] field12;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(JI)V", line = 11)
    public static final void method4(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class1.method1(arg0 - 1L, (byte) 70);
            class1.method1(1L, (byte) 42);
        } else {
            class1.method1(arg0, (byte) 103);
        }
        int var3 = 101 % ((arg1 - 36) / 62);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 42)
    public static void method5(byte arg0) {
        field9 = null;
        field14 = null;
        if (arg0 > -25) {
            method6(-122);
        }
        field11 = null;
        field12 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field11[var0] = var1;
        }
        field14 = class28.method185(-20839, "overlay)3dat");
        field15 = 0;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 62)
    public static final void method6(int arg0) {
        class27 var1 = class29.field342;
        synchronized (class29.field342) {
            class5.field39 = class17.field154;
            class17.field158 = field8;
            class20.field181 = class20.field188;
            class28.field336 = class10.field71;
            class14.field138 = class26.field318;
            class6.field49 = class26.field319;
            class10.field71 = arg0;
        }
    }
}
