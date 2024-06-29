import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
    public boolean field503 = true;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Ljava/lang/Object;")
    public Object field517 = new Object();

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
    public int[] field519 = new int[500];

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public int field520 = 0;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
    public int[] field518 = new int[500];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
    public static int[] field502 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lke;")
    public static class65 field498 = class1.method17("Musik)2Engine vorbereitet)3", -112);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field505 = 10;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field510 = 1;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lke;")
    public static class65 field499 = class1.method17("Wen m-Ochten Sie hinzuf-Ugen?", -124);

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
    public static int[] field514 = new int[25];

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lke;")
    public static class65 field516 = class1.method17("m-Ochte sich mit Ihnen duellieren)3", -118);

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lcc;")
    public static class15 field515;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Ljd;")
    public static class58 field511;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILg;)Lke;", line = 7)
    public static final class65 method170(int arg0, class39 arg1) {
        if (arg0 == 0) {
            field506++;
            return class81.method713(arg1, 16776960, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILke;Lke;Ljd;)Lkb;", line = 22)
    public static final class61 method171(int arg0, class65 arg1, class65 arg2, class58 arg3) {
        field508++;
        int var4 = arg3.method490(arg1, 76);
        int var5 = arg3.method470(28389, arg2, var4);
        if (arg0 < 61) {
            field514 = null;
        }
        return class17.method128(var4, false, var5, arg3);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lke;)Lke;", line = 38)
    public static final class65 method172(int arg0, class65[] arg1) {
        if (arg0 > -35) {
            field504 = 108;
        }
        field513++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class52.method414(arg1.length, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 62)
    public static void method173(int arg0) {
        field498 = null;
        field516 = null;
        field515 = null;
        field502 = null;
        field514 = null;
        if (arg0 == 0) {
            field499 = null;
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V", line = 93)
    public final void run() {
        field496++;
        while (this.field503) {
            Object var1 = this.field517;
            synchronized (this.field517) {
                if (this.field520 < 500) {
                    this.field519[this.field520] = class91.field2418;
                    this.field518[this.field520] = class52.field1320;
                    this.field520++;
                }
            }
            class58.method498(50L, 10);
        }
    }
}
