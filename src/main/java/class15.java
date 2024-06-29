import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class15 extends class249 {

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[B")
    public byte[] field227;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[I")
    public static int[] field231 = new int[64];

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lmb;")
    public static class96 field232 = class243.method1708("Update)2Liste geladen)3", (byte) 101);

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[I")
    public static int[] field230 = new int[32];

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Lmb;")
    public static class96 field236 = class243.method1708("mapdots", (byte) 113);

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lmb;")
    public static class96 field235 = class243.method1708("blaugr-Un:", (byte) 107);

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Luc;")
    public static class11 field233 = new class11(64);

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Luc;")
    public static class11 field237 = new class11(64);

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Ldl;")
    public static class24 field229;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method110(int arg0) {
        field228++;
        if (arg0 < 88) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class208.field3583[var1] = false;
        }
        class270.field4711 = -1;
        class179.field3095 = 1;
        class244.field4243 = -1;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
    public class15(byte[] arg0) {
        this.field227 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method111(int arg0) {
        field236 = null;
        if (arg0 != 64) {
            method110(-85);
        }
        field231 = null;
        field233 = null;
        field230 = null;
        field229 = null;
        field237 = null;
        field235 = null;
        field232 = null;
    }
}
