import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class635 extends class577 implements Runnable {

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
    private boolean field8931 = true;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public int field8933 = -1;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lkr;")
    private class683 field8930;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field8929;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 5)
    public static void method3527(int arg0) {
        if (arg0 != 32714) {
            method3528((byte) -19, 80, -14, null, -17);
        }
        field8929 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BIILuea;I)V", line = 15)
    public static final void method3528(byte arg0, int arg1, int arg2, class286 arg3, int arg4) {
        field8932++;
        int var5 = arg3.field6483[0];
        int var6 = arg3.field6477[0];
        if (var5 < 0 || class86.field1185 <= var5 || var6 < 0 || class526.field7212 <= var6 || arg2 < 0 || arg2 >= class86.field1185 || arg1 < 0 || class526.field7212 <= arg1) {
            return;
        }
        int var7 = class371.method2170(-4, arg1, class480.field6696[arg3.field520], true, class315.field4687, false, arg2, 0, var6, 0, class66.field871, var5, 0, arg3.method1722((byte) -119), 0);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        int var8 = 0;
        int var9 = 103 % ((arg4 - 66) / 32);
        while ((var7 - 1) > var8) {
            arg3.method1725(class66.field871[var8], class315.field4687[var8], arg0, 0);
            var8++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 51)
    public static final String method3529(boolean arg0) {
        field8928++;
        if (arg0) {
            field8929 = null;
        }
        String var1 = "www";
        if (class500.field6862 == class292.field4392) {
            var1 = "www-wtrc";
        } else if (class500.field6862 == class23.field315) {
            var1 = "www-wtqa";
        } else if (class500.field6862 == class128.field1770) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class240.field3454 != null) {
            var2 = "/p=" + class240.field3454;
        }
        return "http://" + var1 + "." + class158.field2374.field9177 + ".com/l=" + class666.field9377 + "/a=" + class287.field3995 + var2 + "/";
    }

    @OriginalMember(owner = "client!hg", name = "run", descriptor = "()V", line = 85)
    public final void run() {
        while (this.field8931) {
            this.field8930.method3765(0, this);
        }
        field8937++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjr;I)V", line = 98)
    public static final void method3530(int arg0, class96 arg1, int arg2) {
        if (class432.field6076 != null) {
            try {
                class432.field6076.method2337(0, 0L);
                class432.field6076.method2329(24, arg2, arg1.field1316, false);
            } catch (Exception var3) {
            }
        }
        field8927++;
        if (arg0 != 27336) {
            method3528((byte) 114, -70, 7, null, 68);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V", line = 119)
    public static final void method3531(int arg0, boolean arg1, int arg2) {
        field8935++;
        class421 var3 = class172.method1175(true, arg1, arg0);
        int var4 = 98 % (-arg2 / 41);
        if (var3 != null) {
            for (int var5 = 0; var5 < var3.field5945.length; var5++) {
                var3.field5945[var5] = -1;
                var3.field5946[var5] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lkr;)V", line = 164)
    public class635(class683 arg0) {
        this.field8930 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 147)
    public final void method3532(int arg0) {
        if (arg0 == -9817) {
            field8936++;
            this.field8931 = false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V", line = 173)
    public final void method3533(boolean arg0) {
        field8934++;
        (new Thread(this, "a")).start();
        if (arg0) {
            this.field8933 = 55;
        }
    }
}
