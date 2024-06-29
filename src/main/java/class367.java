import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class367 extends class280 {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    public boolean field5222 = false;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public boolean field5218 = false;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field5216;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lcs;")
    public static class351 field5220;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public static final void method2216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5219++;
        if (class258.field3605 == 1) {
            class128.field1818[class238.field3358 / 100].method2301(class228.field3231 - 8, class235.field3329 + -8);
        }
        if (arg1 != 4) {
            field5225 = 53;
        }
        if (class258.field3605 == 2) {
            class128.field1818[class238.field3358 / 100 + 4].method2301(class228.field3231 - 8, class235.field3329 + -8);
        }
        class423.method2451(2);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILlk;I)V")
    public static final void method2217(int arg0, class425 arg1, int arg2) {
        field5221++;
        if (class491.field6929 != null) {
            try {
                class491.field6929.method1907(24675, 0L);
                class491.field6929.method1916((byte) 123, 24, arg1.field5886, arg2);
            } catch (Exception var3) {
            }
        }
        if (arg0 < 12) {
            field5225 = -10;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method2218(byte arg0) {
        field5220 = null;
        if (arg0 != 4) {
            method2216(-63, 16, 25, 55, -44);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
    public static final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5226++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        if (arg4 != 3287) {
            return;
        }
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        class80.method554(class2.field16[arg0], 113, arg5, arg1 + arg3, -arg1 + arg3);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class80.method554(class2.field16[var21], 122, arg5, var23, var24);
            class80.method554(class2.field16[var22], 114, arg5, var23, var24);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIZZ)V")
    public class367(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5223 = arg2;
        this.field5216 = arg1;
        this.field5218 = arg4;
        this.field5224 = arg0;
        this.field5222 = arg3;
    }

    static {
        new class112("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field5220 = new class351(33, 12);
    }
}
