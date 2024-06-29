import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class221 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lga;")
    private class420 field3150;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Ldn;")
    private class540 field3149;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lcb;")
    public static class544 field3148;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 9)
    public class221() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 14)
    public static void method1523(int arg0) {
        if (arg0 == -163) {
            field3148 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 24)
    public static final String method1524(String arg0, int arg1) {
        field3151++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class744.method4153(19, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class744.method4153(16, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        int var6 = var2;
        if (arg1 >= -63) {
            method1523(-56);
        }
        while (var6 < var3) {
            char var7 = arg0.charAt(var6);
            if (class438.method2652(var7, false)) {
                char var8 = class189.method1396(true, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
            var6++;
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Ldn;", line = 81)
    public final class540 method1525(int arg0) {
        if (arg0 != 7064) {
            method1524(null, 24);
        }
        field3152++;
        class540 var2 = this.field3149;
        if (this.field3150.field5911 == var2) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var2.field7578;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lga;B)V", line = 104)
    public final void method1526(class420 arg0, byte arg1) {
        this.field3150 = arg0;
        if (arg1 == 111) {
            field3153++;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Ldn;", line = 115)
    public final class540 method1527(boolean arg0) {
        field3147++;
        class540 var2 = this.field3150.field5911.field7578;
        if (this.field3150.field5911 == var2) {
            this.field3149 = null;
            return null;
        }
        if (!arg0) {
            this.field3150 = null;
        }
        this.field3149 = var2.field7578;
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lga;)V", line = 136)
    public class221(class420 arg0) {
        this.field3150 = arg0;
    }
}
