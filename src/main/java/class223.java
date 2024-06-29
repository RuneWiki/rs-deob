import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class223 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
    public boolean field3903 = false;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lke;")
    public static class256 field3906 = class316.method2202(":tradereq:", 27626);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lke;")
    public static class256 field3907 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "J")
    public long field3902;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lmc;")
    public class51 field3905;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lec;", line = 9)
    public static final class94 method1533(int arg0, int arg1) {
        if (arg1 != 0) {
            method1535(15);
        }
        class94 var2 = (class94) class17.field225.method2077(-13408, (long) arg0);
        field3908++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class239.field4081.method1016(16, arg1 ^ 0x64, arg0);
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method689(new class41(var3), 28256);
        }
        class17.field225.method2074(var4, (long) arg0, -1);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 60)
    public static void method1534(boolean arg0) {
        field3906 = null;
        field3907 = null;
        if (!arg0) {
            field3907 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lj;", line = 73)
    public static final class227 method1535(int arg0) {
        field3899++;
        byte[] var1 = class6.field92[0];
        int var2 = class94.field1692[0] * class62.field1093[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class305.field5270[class150.method1123(var1[var4], 255)];
        }
        class227 var5 = new class227(class142.field2486, class153.field2740, class13.field172[arg0], class307.field5283[0], class94.field1692[0], class62.field1093[0], var3);
        class183.method1343(255);
        return var5;
    }
}
