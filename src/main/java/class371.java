import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class371 {

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "[[F")
    public static float[][] field5666 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lki;")
    public static class498 field5668 = new class498(31, -1);

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[S")
    public static short[] field5669 = new short[256];

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field5670 = -1;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "[S")
    public static short[] field5671 = new short[256];

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Lts;")
    public class371 field5663;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Lts;")
    public class371 field5665;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method2288(int arg0) {
        field5666 = null;
        field5668 = null;
        field5669 = null;
        field5671 = null;
        int var1 = -8 % ((-arg0 - 42) / 61);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method2289(byte arg0) {
        field5667++;
        if (this.field5663 == null) {
            return;
        }
        this.field5663.field5665 = this.field5665;
        this.field5665.field5663 = this.field5663;
        this.field5665 = null;
        if (arg0 != -55) {
            this.method2289((byte) -44);
        }
        this.field5663 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static final void method2290(int arg0) {
        field5664++;
        if (class347.field4998) {
            return;
        }
        class264.field3869 = true;
        if (arg0 != 10521) {
            method2290(89);
        }
        class347.field4998 = true;
        if (class426.field6401.field1013) {
            class24.field262 = ((int) class24.field262 + 47 & 0xFFFFFFF0);
        } else {
            class244.field3608 += (12.0F - class244.field3608) / 2.0F;
        }
    }
}
