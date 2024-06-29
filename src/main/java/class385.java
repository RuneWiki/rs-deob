import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class385 extends class134 {

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public int field5358 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public int field5356 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public int field5360 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public int field5367 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field5357 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public int field5364 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public int field5359 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public int field5363 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "Lm;")
    public class191 field5365;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "[I")
    public static int[] field5362 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Z")
    public static boolean field5353 = true;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "[F")
    public static float[] field5366 = new float[4];

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Loh;")
    public static class404 field5354;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lda;)V")
    public static final void method2388(class59 arg0) {
        class254.field3055 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
    public final boolean method2389(int arg0, int arg1, int arg2) {
        field5361++;
        if (this.field5363 <= arg1 && this.field5358 >= arg1 && arg0 >= this.field5360 && arg0 <= this.field5359) {
            return true;
        } else if (arg2 == 128) {
            return arg1 >= this.field5367 && arg1 <= this.field5364 && arg0 >= this.field5357 && arg0 <= this.field5356;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static void method2390(byte arg0) {
        field5362 = null;
        field5366 = null;
        field5354 = null;
        if (arg0 < 19) {
            field5362 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static final void method2391(int arg0) {
        field5355++;
        class251.field3036.method1610(arg0 + 25833);
        if (arg0 != -25891) {
            field5366 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lm;)V")
    public class385(class191 arg0) {
        this.field5365 = arg0;
    }
}
