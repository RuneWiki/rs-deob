import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class248 extends class65 {

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public int field3966 = -1;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public int field3975 = 0;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "[F")
    public static float[] field3970 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "Llw;")
    public static class233 field3973 = new class233(1);

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 11)
    public static void method1706(int arg0) {
        field3970 = null;
        int var1 = 48 / ((arg0 + 27) / 51);
        field3973 = null;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Z", line = 36)
    public static final boolean method1707(int arg0) {
        if (arg0 != 0) {
            field3970 = null;
        }
        field3974++;
        return class608.field8588 > 0;
    }
}
