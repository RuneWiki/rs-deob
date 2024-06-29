import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class280 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lnja;")
    public class455 field4051 = new class455();

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lwv;")
    public static class37 field4058 = new class37();

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lnja;")
    private class455 field4053;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I", line = 5)
    public final int method1828(byte arg0) {
        field4055++;
        int var2 = 0;
        if (arg0 != 38) {
            return 121;
        }
        class455 var3 = this.field4051.field6516;
        while (this.field4051 != var3) {
            var3 = var3.field6516;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Lnja;", line = 27)
    public final class455 method1829(int arg0) {
        if (arg0 <= 92) {
            return null;
        }
        field4056++;
        class455 var2 = this.field4053;
        if (this.field4051 == var2) {
            this.field4053 = null;
            return null;
        } else {
            this.field4053 = var2.field6516;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 51)
    public static void method1830(byte arg0) {
        if (arg0 > 60) {
            field4058 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Lnja;", line = 61)
    public final class455 method1831(boolean arg0) {
        field4050++;
        class455 var2 = this.field4051.field6516;
        if (this.field4051 == var2) {
            this.field4053 = null;
            return null;
        } else if (arg0) {
            this.field4053 = var2.field6516;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 113)
    public class280() {
        this.field4051.field6516 = this.field4051;
        this.field4051.field6514 = this.field4051;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 87)
    public final void method1832(byte arg0) {
        if (arg0 > -116) {
            this.field4051 = null;
        }
        field4054++;
        while (true) {
            class455 var2 = this.field4051.field6516;
            if (this.field4051 == var2) {
                this.field4053 = null;
                return;
            }
            var2.method2701(-114);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLnja;)V", line = 124)
    public final void method1833(byte arg0, class455 arg1) {
        field4052++;
        int var3 = -10 % ((arg0 + 18) / 32);
        if (arg1.field6514 != null) {
            arg1.method2701(39);
        }
        arg1.field6514 = this.field4051.field6514;
        arg1.field6516 = this.field4051;
        arg1.field6514.field6516 = arg1;
        arg1.field6516.field6514 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)V", line = 146)
    public static final void method1834(byte arg0, String arg1) {
        if (class614.field8305 == null) {
            class307.method1983(arg0 - 209);
        }
        field4057++;
        class791.field10861.setTime(new Date(class401.method2440(false)));
        int var2 = class791.field10861.get(11);
        int var3 = class791.field10861.get(12);
        int var4 = class791.field10861.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        if (arg0 != 88) {
            method1830((byte) 37);
        }
        String[] var6 = class684.method3748(-2242, arg1, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class559.field7666; var8 > 0; var8--) {
                class614.field8305[var8] = class614.field8305[var8 - 1];
            }
            class614.field8305[0] = var5 + ": " + var6[var7];
            if (class640.field8634 != null) {
                try {
                    class640.field8634.write(class50.method322(class614.field8305[0] + "\n", -1985169656));
                } catch (IOException var9) {
                }
            }
            if (class614.field8305.length - 1 > class559.field7666) {
                if (class507.field7106 > 0) {
                    class507.field7106++;
                }
                class559.field7666++;
            }
        }
    }
}
