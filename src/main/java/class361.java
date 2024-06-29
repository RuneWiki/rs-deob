import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class361 extends class387 {

    @OriginalMember(owner = "client!me", name = "x", descriptor = "S")
    public short field5296;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "B")
    public byte field5292;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
    public boolean field5300;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "B")
    public byte field5291;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "S")
    public short field5293;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "S")
    public short field5288;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "S")
    public short field5286;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field5297;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lao;")
    public static class116 field5294;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lud;")
    public static class2 field5285;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[Lro;")
    public static class249[] field5287;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static void method2371(int arg0) {
        field5294 = null;
        field5285 = null;
        field5287 = null;
        if (arg0 != 0) {
            method2373(-7);
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)I")
    public abstract int method194(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public static final void method2372(int arg0, int arg1, int arg2) {
        field5295++;
        int var3 = -58 % ((-arg2 - 16) / 53);
        if (class344.field5043 != arg1) {
            class160.field2096 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class160.field2096[var4] = (var4 << 12) / arg1;
            }
            class232.field3274 = arg1 * 32;
            class344.field5043 = arg1;
            class392.field5887 = arg1 - 1;
        }
        if (class110.field1518 == arg0) {
            return;
        }
        if (class344.field5043 == arg0) {
            class58.field831 = class160.field2096;
        } else {
            class58.field831 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class58.field831[var5] = (var5 << 12) / arg0;
            }
        }
        class315.field4510 = arg0 - 1;
        class110.field1518 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(B)V")
    public void method134(byte arg0) {
        if (arg0 <= -15) {
            field5289++;
        }
    }

    @OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
    public static final void method2373(int arg0) {
        field5299++;
        if (class326.field4683) {
            return;
        }
        if (arg0 < 123) {
            field5285 = null;
        }
        class60.method405(class108.field1475, -17126);
        if (class39.field633 != null) {
            class60.method405(class39.field633, -17126);
        }
        class326.field4683 = true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method2374(int arg0, int arg1) {
        class24 var2 = class258.field3761;
        synchronized (class258.field3761) {
            int var3 = 69 % ((arg1 + 28) / 54);
            class258.field3761.method215(0, arg0);
        }
        field5290++;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field5296 = (short) arg4;
        this.field5292 = arg9;
        this.field5298 = (short) arg3;
        this.field5300 = arg8;
        this.field5291 = (byte) arg0;
        this.field5293 = (short) arg5;
        this.field5288 = (short) arg6;
        this.field5286 = (short) arg7;
        this.field5297 = (short) arg2;
        this.field5284 = (short) arg1;
    }
}
