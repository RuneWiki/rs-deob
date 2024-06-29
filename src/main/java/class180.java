import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class180 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lka;")
    private class473 field2673 = new class473(256);

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Ldk;")
    private class421 field2679;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Lrb;")
    public static class283 field2678;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "F")
    public static float field2683;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field2682;

    static {
        new class157("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2678 = new class283(11, 3);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILla;ZIILza;B)V", line = 7)
    public static final void method1222(int arg0, class306 arg1, boolean arg2, int arg3, int arg4, class295 arg5, byte arg6) {
        if (arg2) {
            class61.field884.method2142((class66.field953 - class61.field884.method204()) / 2, (class348.field5033 - class61.field884.method207()) / 2);
            class526.field7675.method2142((class66.field953 - class526.field7675.method204()) / 2, 18);
        }
        field2680++;
        String var7 = "";
        if (class98.field1564 == class152.field2343) {
            var7 = class79.field1117.method1126(class486.field6998, (byte) -19);
        } else if (class308.field4192 == class152.field2343) {
            var7 = class44.field634.method1126(class486.field6998, (byte) -19);
        }
        arg1.method1772(arg4, var7, -54, -1, class348.field5033 / 2 - 26, class66.field953 / 2);
        int var8 = class348.field5033 / 2 - 18;
        arg5.method527(class66.field953 / 2 - 152, var8, 304, 34, arg0, 0);
        arg5.method527(class66.field953 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        if (arg6 <= 69) {
            method1223(48);
        }
        arg5.method508(class66.field953 / 2 - 150, var8 + 2, class220.field3101 * 3, 30, arg3, 0);
        arg5.method508(class66.field953 / 2 + (class220.field3101 * 3) - 150, var8 - -2, 300 - (class220.field3101 * 3), 30, 0, 0);
        arg1.method1772(arg4, class397.field5705, -124, -1, class348.field5033 / 2 + 4, class66.field953 / 2);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 42)
    public static void method1223(int arg0) {
        if (arg0 != 18) {
            field2683 = -2.0550003F;
        }
        field2678 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)Lfq;", line = 52)
    public final class93 method1224(int arg0, boolean arg1) {
        field2675++;
        class473 var3 = this.field2673;
        class93 var4;
        synchronized (this.field2673) {
            var4 = (class93) this.field2673.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field2679;
        byte[] var6;
        synchronized (this.field2679) {
            var6 = this.field2679.method2512(26, (byte) -93, arg0);
            if (arg1) {
                this.method1229(-120);
            }
        }
        class93 var7 = new class93();
        if (var6 != null) {
            var7.method762(121, new class319(var6));
        }
        class473 var8 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 82)
    public final void method1225(int arg0, int arg1) {
        field2674++;
        class473 var3 = this.field2673;
        synchronized (this.field2673) {
            if (arg0 >= -74) {
                this.field2673 = null;
            }
            this.field2673.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I", line = 96)
    public static final int method1226(int arg0, int arg1) {
        if (arg0 != 2) {
            field2683 = 1.4468483F;
        }
        field2682++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 113)
    public final void method1227(int arg0) {
        field2681++;
        class473 var2 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method2764(-769);
        }
        if (arg0 < 80) {
            field2678 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 126)
    public static final String method1228(boolean arg0) {
        field2676++;
        String var1 = "www";
        if (!arg0) {
            method1228(true);
        }
        if (class523.field7659 == class478.field6908) {
            var1 = "www-wtrc";
        } else if (class523.field7659 == class271.field3659) {
            var1 = "www-wtqa";
        } else if (class523.field7659 == class270.field3637) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class255.field3476 != null) {
            var2 = "/p=" + class255.field3476;
        }
        return "http://" + var1 + "." + class152.field2343.field129 + ".com/l=" + class486.field6998 + "/a=" + class387.field5536 + var2 + "/";
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 164)
    public final void method1229(int arg0) {
        int var2 = -80 % ((arg0 + 8) / 54);
        class473 var3 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method2774((byte) -6);
        }
        field2677++;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 182)
    public class180(class12 arg0, int arg1, class421 arg2) {
        this.field2679 = arg2;
        this.field2679.method2509(0, 26);
    }
}
