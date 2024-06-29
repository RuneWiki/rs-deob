import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class431 {

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lhn;")
    public static class509 field6 = new class509(5, -1);

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "Lob;")
    public static class521 field11 = new class521(63, 2);

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field13 = 1401;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILjava/lang/String;Z)Z", line = 12)
    public static final boolean method4(int arg0, int arg1, String arg2, boolean arg3) {
        field8++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z", line = 86)
    public static final boolean method5(int arg0) {
        field9++;
        class295 var1 = (class295) class456.field6644.field2077.field6389;
        if (var1 == null || class456.field6644.field2077 == var1) {
            return false;
        } else {
            if (arg0 >= ~var1.field4498) {
                var1.field4498 -= 2000;
            }
            return var1.field4498 == 1007;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[BI)[B", line = 109)
    public static final byte[] method6(int arg0, byte[] arg1, int arg2) {
        field12++;
        byte[] var3 = new byte[arg0];
        if (arg2 > -113) {
            field6 = null;
        }
        class414.method2598(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 127)
    public static final void method7(byte arg0) {
        field7++;
        if (class69.field955) {
            return;
        }
        class109.method834(class258.field3939, (byte) 125);
        if (arg0 != 93) {
            field11 = null;
        }
        if (class75.field1076 != null) {
            class109.method834(class75.field1076, (byte) 96);
        }
        class69.field955 = true;
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V", line = 155)
    public static void method8(int arg0) {
        if (arg0 != 5) {
            field13 = -1;
        }
        field11 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II)V", line = 166)
    public class2(int arg0, int arg1) {
        this.field14 = arg0;
        this.field10 = arg1;
    }
}
