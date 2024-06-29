import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class55 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ljava/lang/String;")
    public static String field773 = "glow3:";

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field777 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field771 = -1;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/lang/String;")
    public static String field781 = "Prepared sound engine";

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 11)
    public static final void method351(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class204.field3335[var1] = false;
        }
        field776++;
        class178.field2961 = arg0;
        class31.field423 = 1;
        class150.field2326 = 0;
        class233.field3743 = -1;
        class81.field1127 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V", line = 33)
    public static final void method352(boolean arg0, int arg1, int arg2) {
        class27 var3 = class117.method809(arg1, -95);
        field778++;
        int var4 = var3.field370;
        int var5 = var3.field375;
        if (arg0) {
            field777 = -74;
        }
        int var6 = var3.field380;
        int var7 = class131.field2075[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class31.method170(var4, class335.field5232[var4] & ~var8 | var8 & arg2 << var5, -87);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lak;IBI)Z", line = 61)
    public static final boolean method353(class172 arg0, int arg1, byte arg2, int arg3) {
        field774++;
        byte[] var4 = arg0.method1287(arg3, arg1, -1);
        if (var4 == null) {
            return false;
        }
        class145.method1077((byte) -65, var4);
        if (arg2 != -5) {
            field771 = -75;
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 85)
    public static final void method354(int arg0) {
        class223.field3561.method707(arg0);
        field779++;
        class50.field705.method707(0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 99)
    public static void method355(byte arg0) {
        if (arg0 <= 84) {
            field771 = 28;
        }
        field781 = null;
        field773 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)[Lbf;", line = 120)
    public static final class58[] method356(int arg0) {
        if (arg0 != 255) {
            field771 = -123;
        }
        field775++;
        class58[] var1 = new class58[class48.field680];
        for (int var2 = 0; var2 < class48.field680; var2++) {
            int var3 = class184.field3046[var2] * class102.field1489[var2];
            byte[] var4 = class278.field4481[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class205.field3370[client.method767(255, var4[var6])];
            }
            if (class232.field3690) {
                var1[var2] = new class314(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var5);
            } else {
                var1[var2] = new class220(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var5);
            }
        }
        class106.method727(true);
        return var1;
    }
}
