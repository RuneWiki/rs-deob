import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class49 extends class179 {

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public int field572 = 0;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "F")
    public static float field571 = 0.0F;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "Z")
    public static boolean field574 = false;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "F")
    public static float field575;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lwo;")
    public static class285 field570;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 4)
    public static void method271(int arg0) {
        field570 = null;
        if (arg0 != 2) {
            method274(-71);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILbg;)V", line = 16)
    private final void method272(int arg0, int arg1, class242 arg2) {
        if (arg0 == 2) {
            this.field572 = arg2.method1587((byte) -102);
        }
        if (arg1 == 32723) {
            field567++;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)V", line = 32)
    public static final void method273(int arg0, byte arg1, int arg2) {
        field568++;
        class12 var3 = class390.method2422(341555040, arg2, 12);
        if (arg1 != -53) {
            method273(-47, (byte) 123, -122);
        }
        var3.method66(-31);
        var3.field144 = arg0;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V", line = 46)
    public static final void method274(int arg0) {
        field573++;
        int var1 = 0;
        if (class252.field3298) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class80.method505((byte) 123, var1);
        class39.method251((byte) 63, var1);
        class209.method1282(true, var1);
        class208.method1275(var1, true);
        class169.method1075(var1, -3);
        class170.method1082(var1, 0);
        if (arg0 <= 31) {
            field574 = false;
        }
        class96.method595(var1, -93);
        class28.method175(0, var1);
        class8.method43(256, var1);
        if (class174.field2017 == 10) {
            class259.method1637(28, (byte) 79);
        } else if (class174.field2017 == 30) {
            class259.method1637(25, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILbg;)V", line = 84)
    public final void method275(int arg0, class242 arg1) {
        field569++;
        if (arg0 <= 95) {
            field574 = false;
        }
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                return;
            }
            this.method272(var3, 32723, arg1);
        }
    }
}
