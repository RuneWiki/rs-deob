import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class153 extends class108 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field2298 = -1;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Z")
    public boolean field2301 = false;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Z")
    public static boolean field2297 = false;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lgp;")
    public static class561 field2296;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    public static final int method1087(int arg0) {
        if (arg0 != 64) {
            field2296 = null;
        }
        field2302++;
        return class454.field6572++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lod;Z[[B)V")
    public static final void method1088(class568 arg0, boolean arg1, byte[][] arg2) {
        field2299++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class268 var11 = new class268(var10);
                int var12 = class43.field584[var5] >> 8;
                int var13 = class43.field584[var5] & 0xFF;
                int var14 = var12 * 64 - class382.field5687;
                int var15 = var13 * 64 - class597.field8500;
                class547.method3064((byte) 114);
                arg0.method502(var14, class597.field8500, class268.field3916, var15, 0, class382.field5687, var11);
                arg0.method3222(-1, var11, var3, var14, class159.field2378, var15);
                if (!arg0.field870 && (class559.field7931 / 8) == var12 && class533.field7443 / 8 == var13 && var3[0] != -1) {
                    class580.field8259 = class316.field4615.method1318(var3[3], class92.field1638, (byte) -17, var3[2], var3[1], var3[0]);
                    class399.field5941 = var3[4];
                }
            }
        }
        if (arg1) {
            method1089(-96, -97);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class43.field584[var6] >> 8) * 64 - class382.field5687;
            int var8 = (class43.field584[var6] & 0xFF) * 64 - class597.field8500;
            byte[] var9 = arg2[var6];
            if (var9 == null && class533.field7443 < 800) {
                class547.method3064((byte) -100);
                arg0.method497(var7, var8, 64, 64, (byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)S")
    public static final short method1089(int arg0, int arg1) {
        field2293++;
        int var2 = (arg1 & 0xFEBF) >> 10;
        int var3 = (arg1 & 0x380) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        if (arg0 != -1628372184) {
            field2296 = null;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2296 = null;
        int var1 = 73 % ((arg0 - 7) / 54);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lae;Ljava/lang/Object;I)V")
    public static final void method1091(class40 arg0, Object arg1, int arg2) {
        if (arg2 >= -9) {
            method1091(null, null, 73);
        }
        field2300++;
        if (arg0.field556 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field556.peekEvent() != null; var3++) {
            class210.method1342(-38, 1L);
        }
        if (arg1 != null) {
            arg0.field556.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
    public class153(int arg0) {
        this.field2298 = arg0;
    }
}
