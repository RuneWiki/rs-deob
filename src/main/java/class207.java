import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class207 {

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field3081 = 10;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lqu;")
    public static class364 field3080 = new class364(47, 8);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Ljaa;")
    public static class62 field3082;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public static void method1348(boolean arg0) {
        field3082 = null;
        if (arg0) {
            field3081 = 11;
        }
        field3080 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1349(int arg0, int arg1) {
        field3079++;
        if (arg1 == 100 && class501.field7499 > 0) {
            byte[] var2 = class469.field7122[--class501.field7499];
            class469.field7122[class501.field7499] = null;
            return var2;
        } else if (arg1 == 5000 && class377.field5523 > 0) {
            byte[] var3 = class419.field6015[--class377.field5523];
            class419.field6015[class377.field5523] = null;
            return var3;
        } else if (~arg1 == arg0 && class470.field7195 > 0) {
            byte[] var4 = class487.field7384[--class470.field7195];
            class487.field7384[class470.field7195] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static final void method1350(byte arg0) {
        class529.field7847 = 0;
        field3078++;
        class158.field2058 = -1;
        int var1 = -7 % ((71 - arg0) / 45);
        class117.field1529 = -1;
        class415.field5969 = -1;
    }
}
