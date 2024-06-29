import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public abstract class class450 extends class239 {

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "S")
    public short field6367;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "S")
    public short field6359;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "S")
    public short field6357;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Z")
    public boolean field6355;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
    public short field6361;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "B")
    public byte field6356;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "B")
    public byte field6358;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "[I")
    public static int[] field6365 = new int[32];

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "S")
    public static short field6370;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "Lvt;")
    public static class344 field6369;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
    public void method143(boolean arg0) {
        field6363++;
        if (!arg0) {
            field6369 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)V")
    public static void method2619(boolean arg0) {
        field6369 = null;
        if (arg0) {
            field6370 = -128;
        }
        field6365 = null;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(B)I")
    public abstract int method103(byte arg0);

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6367 = (short) arg7;
        this.field6359 = (short) arg6;
        this.field6366 = arg2;
        this.field6357 = (short) arg5;
        this.field6355 = arg8;
        this.field6362 = arg1;
        this.field6368 = arg3;
        this.field6361 = (short) arg4;
        this.field6356 = arg9;
        this.field6358 = (byte) arg0;
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
    public static final void method2620(int arg0) {
        field6360++;
        if (class126.field1565 == -1) {
            return;
        }
        int var1 = class343.field4760.method100((byte) -100);
        int var2 = class343.field4760.method92(8);
        class7 var3 = (class7) class644.field9336.method3188((byte) -100);
        if (var3 != null) {
            var1 = var3.method27(2);
            var2 = var3.method32(32679);
        }
        if (arg0 < 126) {
            method2620(45);
        }
        class208.method1331(class502.field6955, 0, var2, 0, -17139, class604.field8711, 0, var1, class126.field1565, 0);
        if (class516.field7207 != null) {
            class538.method2990(var1, (byte) 108, var2);
        }
    }

    static {
        new class344(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field6370 = 32767;
        field6369 = new class344("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");
    }
}
