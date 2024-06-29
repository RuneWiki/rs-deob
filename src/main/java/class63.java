import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class63 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method423(byte arg0, int arg1, int arg2) {
        if (arg0 <= 10) {
            return;
        }
        field677++;
        class515 var3 = class337.field4413[arg2][arg1];
        if (var3 != null) {
            class84.field894 = var3.field7361;
            class316.field4115 = var3.field7370;
            class386.field5165 = var3.field7373;
        }
        class99.method611((byte) -86);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIILbfa;)V", line = 27)
    public static final void method424(byte arg0, int arg1, int arg2, int arg3, class335 arg4) {
        int var5 = -29 / ((25 - arg0) / 54);
        field675++;
        for (class282 var6 = (class282) class144.field1618.method3174((byte) 49); var6 != null; var6 = (class282) class144.field1618.method3168(false)) {
            if (var6.field3585 == arg1 && (arg3 << 9) == var6.field3588 && arg2 << 9 == var6.field3582 && var6.field3564.field4324 == arg4.field4324) {
                if (var6.field3577 != null) {
                    class424.field5641.method2852(var6.field3577);
                    var6.field3577 = null;
                }
                if (var6.field3586 != null) {
                    class424.field5641.method2852(var6.field3586);
                    var6.field3586 = null;
                }
                var6.method1519((byte) 121);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V", line = 66)
    public static final void method425(int arg0, int arg1) {
        field679++;
        if (arg1 == -1 || !class485.field7070[arg1]) {
            return;
        }
        class238.field3009.method1710(-182, arg1);
        class271.field3434[arg1] = null;
        class461.field6408[arg1] = null;
        class485.field7070[arg1] = false;
        if (arg0 != -794) {
            method424((byte) -34, 12, -78, 8, null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILpe;)[Lbi;", line = 93)
    public static final class438[] method426(int arg0, class556 arg1) {
        field678++;
        if (!arg1.method3139(255)) {
            return new class438[0];
        }
        class199 var2 = arg1.method3147(false);
        while (var2.field2437 == 0) {
            class370.method2025(-1, 10L);
        }
        if (~var2.field2437 == arg0) {
            return new class438[0];
        }
        int[] var3 = (int[]) var2.field2434;
        class438[] var4 = new class438[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class438 var6 = new class438();
            var4[var5] = var6;
            var6.field6090 = var3[var5 << 2];
            var6.field6092 = var3[(var5 << 2) + 1];
            var6.field6088 = var3[(var5 << 2) + 2];
            var6.field6094 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
