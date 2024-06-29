import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class254 {

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Lcc;")
    public static class209 field195 = class95.method669(95, "underlay");

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lcc;")
    public static class209 field206 = class95.method669(99, "Textures charg-Bes");

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static volatile int field199 = 0;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Lmf;")
    public class10 field196;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Lmf;")
    public class10 field198;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Lsj;")
    public static class49 field204;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Z")
    public static boolean field194;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "[[B")
    public static byte[][] field202;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final void method89(byte arg0) {
        field200++;
        if (this.field196 == null) {
            return;
        }
        this.field196.field198 = this.field198;
        this.field198.field196 = this.field196;
        int var2 = 39 / ((arg0 + 15) / 62);
        this.field198 = null;
        this.field196 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method90(boolean arg0) {
        field204 = null;
        field195 = null;
        field206 = null;
        if (arg0) {
            method90(true);
        }
        field202 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method91(byte arg0) {
        field205++;
        if ((class11.field224 > class116.field2324)) {
            class116.field2324 = (float) ((double) class116.field2324 / 30.0D + (double) class116.field2324);
            if (class11.field224 < class116.field2324) {
                class116.field2324 = class11.field224;
            }
            class112.method801((byte) 48);
        } else if (class11.field224 < class116.field2324) {
            class116.field2324 = (float) ((double) class116.field2324 - (double) class116.field2324 / 30.0D);
            if (class11.field224 > class116.field2324) {
                class116.field2324 = class11.field224;
            }
            class112.method801((byte) 93);
        }
        if (class49.field978 != -1 && class279.field4919 != -1) {
            int var1 = class49.field978 - class200.field3580;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class279.field4919 - class118.field2370;
            class200.field3580 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class279.field4919 = -1;
                class49.field978 = -1;
            }
            class118.field2370 += var2;
            class112.method801((byte) -84);
        }
        int var3 = 69 / ((arg0 - 15) / 35);
    }
}
