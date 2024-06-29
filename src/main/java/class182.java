import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class182 {

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static volatile int field3276 = -1;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "J")
    public long field3272;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lj;")
    public class139 field3269;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpi;I)I")
    public static final int method1328(class181 arg0, int arg1) {
        field3275++;
        if (arg1 != 255) {
            method1328((class181) null, 29);
        }
        int var2 = 0;
        if (arg0.method1307((byte) -14, class26.field520)) {
            var2++;
        }
        if (arg0.method1307((byte) -14, class148.field2665)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lkg;")
    public static final class21 method1329(int arg0) {
        field3270++;
        int var1 = class219.field3858[0] * class118.field2209[0];
        byte[] var2 = class273.field4765[0];
        int var3 = -26 / ((47 - arg0) / 50);
        int[] var4 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = class107.field1980[class50.method369(255, var2[var5])];
        }
        class21 var6 = new class21(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[0], class118.field2209[0], var4);
        class242.method1661(29720);
        return var6;
    }
}
