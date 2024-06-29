import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class483 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    private int field7074;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field7081 = 0;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Lji;")
    public static class432 field7077;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZC)V")
    public final void method2863(boolean arg0, char arg1) {
        if (arg0) {
            this.method2870(-100);
        }
        field7082++;
        OpenGL.glCallList(this.field7074 + arg1);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILmq;II)J")
    public static final long method2864(int arg0, class351 arg1, int arg2, int arg3) {
        field7080++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        if (arg2 != 781) {
            method2864(93, null, -123, 126);
        }
        class519 var10 = class252.field3743.method2686(arg1.method20(arg2 - 31466), (byte) 118);
        long var11 = (long) (arg3 | 0x800000 << 7 | arg0 | arg1.method5((byte) -65) << 14 | arg1.method17(arg2 ^ 0x342) << 20);
        if (var10.field7573 == 0) {
            var11 |= var8;
        }
        if (var10.field7658 == 1) {
            var11 |= var4;
        }
        if (var10.field7630) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method20(arg2 ^ 0xFFFF8B2E) << 32;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILic;II)Lje;")
    public static final class275 method2865(int arg0, class491 arg1, int arg2, int arg3) {
        field7079++;
        if (arg0 <= 107) {
            method2864(22, null, -5, -104);
        }
        byte[] var4 = arg1.method2945(arg2, arg3, true);
        return var4 == null ? null : new class275(var4);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2866(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public static final void method2867(byte arg0) {
        if (arg0 != -126) {
            return;
        }
        if (class35.field368 != null) {
            class35.field368.method2415(-25);
        }
        field7075++;
        if (class374.field5695 != null) {
            class374.field5695.method2415(-26);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method2868(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7076++;
        class66.method386(arg1, arg3, arg0, -7737, arg4, arg2, class92.field1377.length - 1);
        class367.field5610 = null;
        class474.field6986 = 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method2869(int arg0, int arg1) {
        field7083++;
        int var3 = 10 % ((-arg1 - 65) / 59);
        OpenGL.glNewList(this.field7074 + arg0, 4864);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method2870(int arg0) {
        if (arg0 == 1952872654) {
            field7078++;
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method2871(byte arg0) {
        if (arg0 != -21) {
            field7081 = 6;
        }
        field7077 = null;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lod;I)V")
    public class483(class349 arg0, int arg1) {
        this.field7074 = OpenGL.glGenLists(arg1);
    }
}
