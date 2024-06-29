import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class367 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field5364 = 16777215;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field5369 = 8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field5362 = 0;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field5360 = 0;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
    public boolean field5354;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)Ldl;")
    public static final class39 method2318(int arg0, byte arg1, int arg2) {
        field5367++;
        class39 var3 = new class39();
        var3.field413 = -1;
        var3.field402 = arg2 + 6;
        var3.field407 = arg0 + 6;
        var3.field398 = -1;
        var3.field394 = new int[var3.field407][var3.field402];
        var3.method240((byte) -103);
        if (arg1 >= -95) {
            method2318(-74, (byte) -122, 16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLbk;)V")
    public final void method2319(int arg0, boolean arg1, class211 arg2) {
        field5361++;
        if (arg1) {
            this.field5356 = 62;
        }
        while (true) {
            int var4 = arg2.method1342((byte) -126);
            if (var4 == 0) {
                return;
            }
            this.method2320(-1, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILbk;)V")
    private final void method2320(int arg0, int arg1, int arg2, class211 arg3) {
        field5368++;
        if (arg1 == 1) {
            this.field5369 = arg3.method1355(32136);
        } else if (arg1 == 2) {
            this.field5354 = true;
        } else if (arg1 == 3) {
            this.field5355 = arg3.method1344((byte) -4);
            this.field5365 = arg3.method1344((byte) -4);
            this.field5359 = arg3.method1344((byte) -4);
        } else if (arg1 == 4) {
            this.field5356 = arg3.method1342((byte) -126);
        } else if (arg1 == 5) {
            this.field5363 = arg3.method1355(arg0 ^ 0xFFFF8277);
        } else if (arg1 == 6) {
            this.field5364 = arg3.method1353(arg0 ^ 0xFFFFFFAE);
        }
        if (arg0 != -1) {
            this.field5355 = -85;
        }
    }
}
