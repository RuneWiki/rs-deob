import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class211 extends class227 {

    @OriginalMember(owner = "client!uga", name = "D", descriptor = "Lal;")
    public static class102 field2791 = new class102("runescape", 0);

    @OriginalMember(owner = "client!uga", name = "F", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!uga", name = "A", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!uga", name = "B", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!uga", name = "C", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!uga", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field2794;

    @OriginalMember(owner = "client!uga", name = "E", descriptor = "[B")
    private byte[] field2792;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILvda;)I")
    public static final int method1355(int arg0, class184 arg1) {
        if (arg0 < 99) {
            return -116;
        } else {
            field2788++;
            String var2 = class38.method235(-56, arg1);
            return class270.field3406.method1620(var2, class120.field1751, -52);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILaa;Liea;IBILria;I)V")
    public static final void method1356(int arg0, class489 arg1, class481 arg2, int arg3, byte arg4, int arg5, class288 arg6, int arg7) {
        field2787++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (class650.field9023 == 4) {
            var8 = (int) class521.field7309 & 0x3FFF;
        } else {
            var8 = (int) class521.field7309 + class683.field9519 & 0x3FFF;
        }
        int var9 = Math.max(arg6.field3617 / 2, arg6.field3714 / 2) + 10;
        int var10 = arg0 * arg0 + arg5 * arg5;
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class16.field320[var8];
        int var12 = class16.field322[var8];
        int var13 = 104 / ((26 - arg4) / 41);
        if (class650.field9023 != 4) {
            var12 = var12 * 256 / (class127.field1815 + 256);
            var11 = var11 * 256 / (class127.field1815 + 256);
        }
        int var14 = arg0 * var12 + arg5 * var11 >> 14;
        int var15 = arg5 * var12 - (arg0 * var11) >> 14;
        arg2.method140(arg6.field3617 / 2 + arg3 + var14 - arg2.method142() / 2, arg6.field3714 / 2 + arg7 + -var15 - arg2.method149() / 2, arg1, arg3, arg7);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)V")
    public static void method1357(boolean arg0) {
        field2794 = null;
        if (arg0) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBB)V")
    public final void method1358(int arg0, byte arg1, byte arg2) {
        field2790++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        if (arg2 <= -15) {
            this.field2792[var4++] = var5;
            this.field2792[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1359(int arg0, int arg1, int arg2, int arg3) {
        this.field2792 = new byte[arg1 * arg2 * arg0 * 2];
        field2789++;
        if (arg3 <= 60) {
            return null;
        } else {
            this.method1058(arg1, arg0, arg2, (byte) -124);
            return this.field2792;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
    public class211() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
