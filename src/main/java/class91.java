import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class91 extends class258 {

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
    public static int field1248 = 64;

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!vga", name = "o", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vga", name = "p", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!vga", name = "q", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!vga", name = "n", descriptor = "Lpu;")
    public static class772 field1241;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIIII)V", line = 8)
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 104) {
            return;
        }
        class651.field8308 = arg6;
        field1242++;
        class33.field341 = arg4;
        class273.field3582 = arg1;
        class131.field1741 = arg5;
        class687.field8845 = arg2;
        class32.field323 = arg3;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lim;B)V", line = 24)
    public final void method547(class652 arg0, byte arg1) {
        arg0.method3533(this.field1249, this.field1243, this.field1240, 1, this.field1246);
        if (arg1 <= 123) {
            method552('l', (byte) 12);
        }
        field1245++;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLmc;)V", line = 36)
    public final void method546(byte arg0, class234 arg1) {
        this.field1243 = arg1.method1497((byte) 116);
        field1247++;
        this.field1246 = arg1.method1497((byte) 109);
        this.field1249 = arg1.method1509(true);
        int var3 = -100 / ((arg0 - 7) / 41);
        this.field1240 = arg1.method1509(true);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 50)
    public static void method551(byte arg0) {
        field1241 = null;
        if (arg0 >= -51) {
            method551((byte) -18);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(CB)I", line = 64)
    public static final int method552(char arg0, byte arg1) {
        field1244++;
        if (arg0 >= '\u0000' && arg0 < class394.field5190.length) {
            return class394.field5190[arg0];
        } else {
            if (arg1 >= -68) {
                field1248 = 78;
            }
            return -1;
        }
    }
}
