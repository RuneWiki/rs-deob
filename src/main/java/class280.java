import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class280 extends class208 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lve;")
    public static class255 field4787 = class87.method607(103, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lve;")
    public static class255 field4795 = class87.method607(93, "Benutzen");

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Lve;")
    public static class255 field4789 = class87.method607(42, ":");

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lve;")
    public static class255 field4798 = class87.method607(121, "<col=ffffff>");

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lve;")
    public static class255 field4794 = class87.method607(71, "(Udns");

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Z")
    public static boolean field4803 = false;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Ljava/awt/Image;")
    public static Image field4800;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[I")
    public int[] field4793;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[I")
    public int[] field4797;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[I")
    public int[] field4804;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[Ltj;")
    public class169[] field4788;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "[Ltj;")
    public class169[] field4808;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[[[B")
    public byte[][][] field4796;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lfi;", line = 14)
    public static final class250 method1945(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4188; var4++) {
            class250 var5 = var3.field4182[var4];
            if ((var5.field4206 >> 29 & 0x3L) == 2L && var5.field4212 == arg1 && var5.field4216 == arg2) {
                class112.method852(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Lud;", line = 47)
    public static final class269 method1946(int arg0) {
        int var1 = class187.field3027[0] * class132.field2173[0];
        field4799++;
        int var2 = -124 / ((arg0 + 5) / 53);
        int[] var3 = new int[var1];
        byte[] var4 = class282.field4849[0];
        for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = class18.field296[class154.method1134(var4[var5], 255)];
        }
        class269 var6;
        if (class281.field4827) {
            var6 = new class98(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], var3);
        } else {
            var6 = new class83(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], var3);
        }
        class111.method850(-3);
        return var6;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILtg;I)V", line = 79)
    public static final void method1947(int arg0, int arg1, int arg2, int arg3, int arg4, class301 arg5, int arg6) {
        field4791++;
        class247.method1705(arg5.field5173, true, arg5.field5130, arg6, arg0, arg3, arg4, arg1);
        if (arg2 != -64) {
            field4798 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 102)
    public static void method1948(int arg0) {
        field4789 = null;
        field4798 = null;
        if (arg0 != 128) {
            field4798 = (class255) null;
        }
        field4800 = null;
        field4794 = null;
        field4795 = null;
        field4787 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBIIIIZ)V", line = 125)
    public static final void method1949(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 89 % ((arg1 + 36) / 57);
        class56.field876 = arg4;
        field4801++;
        class111.field1876 = arg0;
        class92.field1575 = arg5;
        class47.field696 = arg2;
        class208.field3569 = arg3;
        if (arg6 && class208.field3569 >= 100) {
            class221.field3723 = class111.field1876 * 128 + 64;
            class256.field4373 = class47.field696 * 128 + 64;
            class153.field2599 = class113.method861((byte) -88, class221.field3723, class256.field4373, client.field4039) - class56.field876;
        }
        class3.field50 = 2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lve;I)Z", line = 161)
    public static final boolean method1950(class255 arg0, int arg1) {
        field4807++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class29.field453; var2++) {
            if (arg0.method1779(-124, class184.field2969[var2])) {
                return true;
            }
        }
        if (arg1 < 94) {
            method1945(-83, 27, -85);
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLtg;)V", line = 189)
    public static final void method1951(byte arg0, class301 arg1) {
        field4806++;
        int var2 = arg1.field5134 - class277.field4768;
        int var3 = arg1.field5149 * 128 + (arg1.method1680(-103) * 64);
        int var4 = arg1.field5175 * 128 + (arg1.method1680(-101) * 64);
        arg1.field5130 += (var3 - arg1.field5130) / var2;
        int var5 = 108 % ((-arg0 - 28) / 46);
        arg1.field5144 = 0;
        arg1.field5173 += (var4 - arg1.field5173) / var2;
        if (arg1.field5143 == 0) {
            arg1.field5129 = 1024;
        }
        if (arg1.field5143 == 1) {
            arg1.field5129 = 1536;
        }
        if (arg1.field5143 == 2) {
            arg1.field5129 = 0;
        }
        if (arg1.field5143 == 3) {
            arg1.field5129 = 512;
        }
    }
}
