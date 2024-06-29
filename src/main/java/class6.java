import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 extends class172 {

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "Ljh;")
    public static class258 field55;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Ljava/lang/String;")
    public String field58;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "[I")
    public int[] field44;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[I")
    public int[] field45;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "[Lvl;")
    public class164[] field53;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field50;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lfl;", line = 15)
    public static final class52 method22(int arg0, int arg1) {
        field54++;
        class52 var2 = (class52) class317.field5061.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field956.method472(class143.method1104(arg0, (byte) -90), arg1 - 16326, class260.method1984(arg0, false));
        class52 var4 = new class52();
        var4.field823 = arg0;
        if (var3 != null) {
            var4.method400(new class227(var3), (byte) 91);
        }
        var4.method414(-1);
        if (var4.field824 != -1) {
            var4.method407(method22(var4.field824, arg1 ^ 0x0), method22(var4.field863, 16430), (byte) -34);
        }
        if (arg1 != 16430) {
            return (class52) null;
        }
        if (var4.field812 != -1) {
            var4.method416(false, method22(var4.field880, 16430), method22(var4.field812, 16430));
        }
        if (!class4.field43 && var4.field875) {
            var4.field830 = 0;
            var4.field871 = class182.field2928;
            var4.field845 = class176.field2814;
            var4.field876 = class101.field1659;
            var4.field849 = false;
        }
        class317.field5061.method2333((long) arg0, arg1 - 16430, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Ljava/lang/String;", line = 59)
    public static final String method23(int arg0, int arg1) {
        field51++;
        if (arg0 < 20) {
            return (String) null;
        } else if (class200.field3193[arg1].length() > 0) {
            return class22.field249[arg1] + class247.field4041 + class200.field3193[arg1];
        } else {
            return class22.field249[arg1];
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 78)
    public static void method24(boolean arg0) {
        if (arg0) {
            field55 = (class258) null;
        }
        field55 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)[Lsi;", line = 96)
    public static final class351[] method25(byte arg0) {
        int var1 = -16 / ((-arg0 - 5) / 36);
        field47++;
        class351[] var2 = new class351[class301.field4845];
        for (int var3 = 0; var3 < class301.field4845; var3++) {
            int var4 = class322.field5132[var3] * class221.field3595[var3];
            int[] var5 = new int[var4];
            byte[] var6 = class163.field2578[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var5[var7] = class121.field2026[class343.method2418(255, var6[var7])];
            }
            var2[var3] = new class351(class164.field2595, class318.field5070, class189.field3035[var3], class19.field211[var3], class221.field3595[var3], class322.field5132[var3], var5);
        }
        class211.method1592((byte) 41);
        return var2;
    }
}
