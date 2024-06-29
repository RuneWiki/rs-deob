import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class41 extends class634 {

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "J")
    public static volatile long field560 = 0L;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "Lvh;")
    public static class125 field547 = new class125(15, -1);

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "J")
    public long field553;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
    public final int method332(byte arg0) {
        field546++;
        return arg0 <= 2 ? 14 : this.field545;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)I")
    public final int method333(int arg0) {
        field554++;
        if (arg0 != 25632) {
            this.method332((byte) -61);
        }
        return this.field557;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I")
    public final int method334(boolean arg0) {
        field558++;
        if (!arg0) {
            method337(-29);
        }
        return this.field559;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)J")
    public final long method335(int arg0) {
        if (arg0 == 19807) {
            field556++;
            return this.field553;
        } else {
            return 114L;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class43.field586; var5++) {
            Rectangle var6 = class50.field666[var5];
            if ((var6.x + var6.width) > arg1 && (arg1 + arg2) > var6.x && (var6.y + var6.height) > arg3 && (arg3 + arg4) > var6.y) {
                class636.field9030[var5] = true;
            }
        }
        field552++;
    }

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "(I)V")
    public static void method337(int arg0) {
        field547 = null;
        if (arg0 >= -44) {
            field550 = 121;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I")
    public final int method338(int arg0) {
        if (arg0 == -9993) {
            field549++;
            return this.field551;
        } else {
            return -44;
        }
    }
}
