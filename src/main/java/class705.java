import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class705 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Ldp;")
    public static class468 field9939;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "[I")
    public static int[] field9941;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
    public static void method3950(byte arg0) {
        if (arg0 != 34) {
            method3950((byte) -44);
        }
        field9941 = null;
        field9939 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILes;)V")
    public static final void method3951(int arg0, class630 arg1) {
        field9938++;
        int var2 = arg1.method3504(-13829);
        class138.field1794 = new class11[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class138.field1794[var3] = new class11();
            class138.field1794[var3].field194 = arg1.method3504(-13829);
            class138.field1794[var3].field193 = arg1.method3497(-1);
        }
        if (arg0 <= 109) {
            field9939 = null;
        }
        class557.field7741 = arg1.method3504(-13829);
        class268.field3386 = arg1.method3504(-13829);
        class581.field8127 = arg1.method3504(-13829);
        class415.field5190 = new class532[class268.field3386 + 1 - class557.field7741];
        for (int var4 = 0; var4 < class581.field8127; var4++) {
            int var5 = arg1.method3504(-13829);
            class532 var6 = class415.field5190[var5] = new class532();
            var6.field2902 = arg1.method3501(-9268);
            var6.field2905 = arg1.method3483(64);
            var6.field7180 = class557.field7741 + var5;
            var6.field7183 = arg1.method3497(-1);
            var6.field7178 = arg1.method3497(-1);
        }
        class195.field2456 = arg1.method3483(113);
        class65.field881 = true;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
    public static final void method3952(byte arg0) {
        field9940++;
        if (class174.field2265) {
            return;
        }
        class365.field4649 = true;
        class174.field2265 = true;
        if (class301.field3698.field6607) {
            class331.field4223 = ((int) class331.field4223 - 65 & 0xFFFFFF80);
        } else {
            class539.field7228 += (-class539.field7228 - 24.0F) / 2.0F;
        }
        if (arg0 != 6) {
            field9941 = null;
        }
    }
}
