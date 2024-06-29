import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class228 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4272 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4278 = 0;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[Li;")
    public static class88[] field4282 = new class88[100];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[[I")
    public static int[][] field4269 = new int[104][104];

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "Li;")
    public static class88 field4283 = class208.method1425(105, "");

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Li;")
    public static class88 field4277 = class208.method1425(105, ":duelfriend:");

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Li;")
    public static class88 field4280 = class208.method1425(105, "sl_back");

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field4274;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    public int[] field4271;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method1523(int arg0) {
        if (arg0 != 3739) {
            field4282 = null;
        }
        class72.method496(this.field4271, this.field4276, this.field4273);
        field4281++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public abstract void method243(int arg0, int arg1, boolean arg2, Component arg3);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static void method1524(int arg0) {
        field4277 = null;
        field4283 = null;
        field4269 = null;
        field4280 = null;
        field4282 = null;
        if (arg0 != -1978971583) {
            field4272 = -127;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public abstract void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I")
    public static final int method1525(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        field4279++;
        if (class53.field990 != null && class53.field990.field1219 == var3) {
            return arg2 == -14013488 ? class149.field2910.field831 * 99 / (class149.field2910.field842.length - class53.field990.field1784) + 1 : 81;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    protected class228() {
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)I")
    public static final int method1526(int arg0, byte arg1, int arg2) {
        field4275++;
        if (arg1 != -77) {
            method1525(-54, 103, 90);
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method246(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)I")
    public static final int method1527(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -38) {
            method1524(-127);
        }
        field4284++;
        int var4 = 256 - arg1;
        return ((arg3 & 0xFF00FF) * var4 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }
}
