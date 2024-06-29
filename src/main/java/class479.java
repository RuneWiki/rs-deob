import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class479 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Leda;")
    public static class116 field6862 = new class116(44, -2);

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[I")
    public static int[] field6866 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method2805(byte arg0) {
        if (arg0 == 93) {
            field6862 = null;
            field6866 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6865++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([[[Lko;I)V")
    public static final void method2806(class293[][][] arg0, int arg1) {
        if (arg1 != 21357) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class293[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class293 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4084 instanceof class394) {
                            ((class394) var6.field4084).method902(arg1 + 6549);
                        }
                        if (var6.field4093 instanceof class394) {
                            ((class394) var6.field4093).method902(27906);
                        }
                        if (var6.field4090 instanceof class394) {
                            ((class394) var6.field4090).method902(27906);
                        }
                        if (var6.field4091 instanceof class394) {
                            ((class394) var6.field4091).method902(27906);
                        }
                        if (var6.field4095 instanceof class394) {
                            ((class394) var6.field4095).method902(27906);
                        }
                        for (class198 var7 = var6.field4097; var7 != null; var7 = var7.field3078) {
                            class144 var8 = var7.field3085;
                            if (var8 instanceof class394) {
                                ((class394) var8).method902(27906);
                            }
                        }
                    }
                }
            }
        }
        field6863++;
    }
}
