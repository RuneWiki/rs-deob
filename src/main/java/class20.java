import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Lnj;")
    private class162 field262 = new class162(64);

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Lnj;")
    private class162 field266 = new class162(100);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lmg;")
    private class101 field257;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Lwj;")
    public static class270 field263 = new class270(27, 6);

    @OriginalMember(owner = "client!an", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field267;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Lwj;")
    public static class270 field268;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Lnn;")
    public static class287 field269;

    static {
        new class466("Ok", "Okay", "OK", "Ok");
        field267 = new String[100];
        field268 = new class270(85, 5);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 3)
    public final void method123(byte arg0) {
        field255++;
        class162 var2 = this.field262;
        synchronized (this.field262) {
            this.field262.method1066(arg0 + 4030);
        }
        class162 var3 = this.field266;
        synchronized (this.field266) {
            if (arg0 != 50) {
                field268 = null;
            }
            this.field266.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V", line = 19)
    public final void method124(int arg0, int arg1) {
        field259++;
        class162 var3 = this.field262;
        synchronized (this.field262) {
            this.field262.method1065((byte) -95, arg0);
            int var4 = -80 / (arg1 / 39);
        }
        class162 var5 = this.field266;
        synchronized (this.field266) {
            this.field266.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(CI)Z", line = 35)
    public static final boolean method125(char arg0, int arg1) {
        field261++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class44.method414(arg0, 48)) {
            return true;
        } else {
            char[] var2 = class19.field253;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class259.field3610;
            for (int var5 = arg1; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)Lvf;", line = 78)
    public final class104 method126(int arg0, int arg1) {
        field264++;
        class162 var3 = this.field262;
        class104 var4;
        synchronized (this.field262) {
            var4 = (class104) this.field262.method1073((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field257.method727(class254.method1521(-111, arg1), class115.method820(arg1, (byte) 76), -123);
        class104 var6 = new class104();
        var6.field1553 = arg1;
        var6.field1571 = this;
        if (var5 != null) {
            var6.method763(new class391(var5), -1);
        }
        var6.method766((byte) 121);
        class162 var7 = this.field262;
        synchronized (this.field262) {
            this.field262.method1072((long) arg1, var6, false);
            if (arg0 >= -63) {
                field258 = -24;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 119)
    public static void method127(int arg0) {
        field269 = null;
        field268 = null;
        field263 = null;
        field267 = null;
        if (arg0 != 417) {
            method127(55);
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(II)Lcq;", line = 132)
    public final class327 method128(int arg0, int arg1) {
        if (arg1 != -10423) {
            method127(32);
        }
        field254++;
        class162 var3 = this.field266;
        class327 var4;
        synchronized (this.field266) {
            var4 = (class327) this.field266.method1073((long) arg0, false);
            if (var4 == null) {
                var4 = new class327(arg0);
                this.field266.method1072((long) arg0, var4, false);
            }
        }
        synchronized (var4) {
            return var4.method1897(arg1 ^ 0x4C3E) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 159)
    public final void method129(int arg0) {
        field265++;
        class162 var2 = this.field262;
        synchronized (this.field262) {
            this.field262.method1068(0);
        }
        if (arg0 != 5) {
            field268 = null;
        }
        class162 var3 = this.field266;
        synchronized (this.field266) {
            this.field266.method1068(0);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIIIIII)V", line = 178)
    public static final void method130(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg0) {
            method130(true, -118, 20, -64, 7, -121, -87);
        }
        field260++;
        if (arg4 >= class424.field6204 && class76.field1021 >= arg5 && class417.field6057 <= arg1 && arg3 <= class224.field3193) {
            if (arg6 == 1) {
                class382.method2265(arg4, arg1, false, arg3, arg5, arg2);
            } else {
                class393.method2368(arg4, arg2, arg5, arg6, -1, arg3, arg1);
            }
        } else if (arg6 == 1) {
            class367.method2216(arg2, arg3, arg4, arg1, arg5, 0);
        } else {
            class338.method1961(arg6, arg5, arg1, -10568, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lal;ILmg;Lmg;Lmg;)V", line = 236)
    public class20(class66 arg0, int arg1, class101 arg2, class101 arg3, class101 arg4) {
        this.field257 = arg2;
        if (this.field257 != null) {
            int var6 = this.field257.method746(56) - 1;
            this.field257.method753(var6, -65);
        }
        class111.method805(arg4, 2, arg3);
    }
}
