import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class32 extends class287 {

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field472 = new String[500];

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field474 = "Hidden";

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[I")
    public static int[] field475 = new int[1000];

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
    public static int[] field480 = new int[1000];

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "B")
    public byte field469;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "F")
    public static float field471;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lug;")
    public static class253 field473;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Ljava/lang/String;")
    public String field470;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Ljava/lang/String;")
    public String field478;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 5)
    public static void method298(int arg0) {
        field475 = null;
        field480 = null;
        field474 = null;
        field473 = null;
        field472 = null;
        int var1 = -42 % ((4 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Lun;", line = 23)
    public static final class190 method299(int arg0) {
        field482++;
        int var1 = class81.field1103[0] * class213.field3355[0];
        int[] var2 = new int[var1];
        byte[] var3 = class207.field3298[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class81.field1101[class333.method2319(var3[var4], 255)];
        }
        if (arg0 > -41) {
            return (class190) null;
        } else {
            class190 var5 = new class190(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], var2);
            class207.method1526(0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 58)
    public static final void method300(byte arg0) {
        class57.field786 = null;
        class261.field4097 = null;
        if (arg0 >= -74) {
            field481 = -39;
        }
        class36.field517 = null;
        field476++;
    }
}
