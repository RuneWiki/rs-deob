import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class290 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lmn;")
    public static class43 field3924;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1677(byte arg0) {
        field3924 = null;
        if (arg0 <= 75) {
            method1678(3, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[B", line = 14)
    public static final synchronized byte[] method1678(int arg0, byte arg1) {
        field3923++;
        int var2 = 25 / ((-arg1 - 8) / 59);
        if (arg0 == 100 && class314.field4257 > 0) {
            byte[] var3 = class148.field2265[--class314.field4257];
            class148.field2265[class314.field4257] = null;
            return var3;
        } else if (arg0 == 5000 && class17.field272 > 0) {
            byte[] var4 = class473.field6856[--class17.field272];
            class473.field6856[class17.field272] = null;
            return var4;
        } else if (arg0 == 30000 && class269.field3625 > 0) {
            byte[] var5 = class514.field7532[--class269.field3625];
            class514.field7532[class269.field3625] = null;
            return var5;
        } else {
            return new byte[arg0];
        }
    }
}
