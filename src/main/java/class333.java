import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class333 {

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5187 = "yellow:";

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field5186 = 0;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Z")
    public static volatile boolean field5183 = false;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5193 = 0;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "[I")
    public static int[] field5184;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "[I")
    public static int[] field5188;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[Lbh;")
    public static class18[] field5190;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)I", line = 8)
    public static final int method2317(int arg0, int arg1, int arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 <= 123) {
            return 25;
        } else {
            field5194++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 40)
    public static void method2318(int arg0) {
        if (arg0 != 0) {
            field5188 = (int[]) null;
        }
        field5190 = null;
        field5184 = null;
        field5188 = null;
        field5187 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 53)
    public static int method2319(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lvi;I)V", line = 60)
    public static final void method2320(class240 arg0, int arg1) {
        class238.field3731 = arg0;
        if (arg1 != 9470) {
            field5188 = (int[]) null;
        }
        field5182++;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I", line = 75)
    public static final int method2321(int arg0, int arg1) {
        field5189++;
        class221 var2 = class46.method359(75, arg1);
        if (arg0 != 0) {
            method2322(-99, -127, 26);
        }
        int var3 = var2.field3507;
        int var4 = var2.field3498;
        int var5 = var2.field3499;
        int var6 = class33.field484[var5 - var4];
        return class220.field3477[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)V", line = 116)
    public static final void method2322(int arg0, int arg1, int arg2) {
        class221 var3 = class46.method359(-128, arg1);
        field5185++;
        int var4 = var3.field3507;
        int var5 = var3.field3498;
        int var6 = var3.field3499;
        int var7 = class33.field484[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        if (arg0 < 91) {
            method2323(true);
        }
        class119.method851(class220.field3477[var4] & ~var8 | var8 & arg2 << var5, 3924, var4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 142)
    public static final void method2323(boolean arg0) {
        if (arg0) {
            method2321(-27, 60);
        }
        field5191++;
        class256.method1855(0, -122, 0);
    }
}
