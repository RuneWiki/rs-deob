import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class185 {

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2969 = -1;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ltl;")
    public static class222 field2976 = new class222(64);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[F")
    public static float[] field2978 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
    public static boolean field2977 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1271(int arg0) {
        field2970++;
        class21.field313.method1541(-122, arg0);
        class35.field473++;
        class21.field313.method1368(class331.field5159, arg0 ^ 0x12BA);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 28)
    public static void method1272(int arg0) {
        field2976 = null;
        field2978 = null;
        if (arg0 != 6) {
            field2978 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V", line = 46)
    public static final void method1273(byte arg0, int arg1) {
        field2975++;
        class138.field2067.method1625(arg1, (byte) 122);
        if (arg0 != -54) {
            field2979 = 110;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 59)
    public class185(int arg0, int arg1, int arg2) {
        this.field2974 = arg1;
        this.field2972 = arg0;
        this.field2973 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
    public abstract void method717(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
    public abstract void method718(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public abstract void method721(int arg0, int arg1, int arg2);
}
