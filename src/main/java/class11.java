import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class504 {

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "[I")
    public static int[] field206 = new int[2];

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "Ldb;")
    public static class298 field204 = new class298(58, 11);

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "J")
    public long field207;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "Ldaa;")
    public class11 field208;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "Ldaa;")
    public class11 field211;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field212;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method127(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg0 << 3;
        int var6 = arg3 << 3;
        field210++;
        if (class140.field2254 == 2) {
            class331.field4539 = var4;
            class510.field6806 = var6;
            class370.field4993 = var5;
        }
        class463.field6263 = var6;
        class42.field602 = var4;
        class680.method3794((byte) -55);
        class457.field6204 = true;
        if (arg1 < 116) {
            method127(-71, -93, 47, 36);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method128(byte arg0) {
        if (arg0 > -58) {
            field212 = null;
        }
        field213++;
        return this.field208 != null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLe;Ljava/awt/Canvas;Z)Loa;", line = 53)
    public static final class651 method129(byte arg0, class498 arg1, Canvas arg2, boolean arg3) {
        int var4 = -64 / ((arg0 - 80) / 43);
        field205++;
        return arg3 ? new class667(arg2, arg1) : new class609(arg2, arg1);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V", line = 74)
    public static void method130(boolean arg0) {
        field212 = null;
        field204 = null;
        field206 = null;
        if (!arg0) {
            field212 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 86)
    public final void method131(int arg0) {
        if (arg0 < 119) {
            method129((byte) -9, null, null, false);
        }
        field209++;
        if (this.field208 != null) {
            this.field208.field211 = this.field211;
            this.field211.field208 = this.field208;
            this.field208 = null;
            this.field211 = null;
        }
    }
}
