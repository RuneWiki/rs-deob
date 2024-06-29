import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class90 {

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lhn;")
    private class509 field1080 = new class509(64);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lhn;")
    public class509 field1081 = new class509(64);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lfo;")
    public class361 field1078;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lfo;")
    private class361 field1072;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lso;")
    public static class330 field1079 = new class330();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 4)
    public final void method496(int arg0, int arg1, int arg2) {
        field1075++;
        this.field1080 = new class509(arg2);
        if (arg0 == 64) {
            this.field1081 = new class509(arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)Z", line = 17)
    public static final boolean method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1076++;
        if ((class252.field3358[arg2][arg0][arg1] & 0x2) != 0) {
            return true;
        } else if ((class252.field3358[arg3][arg0][arg1] & 0x10) == 0) {
            return class193.method1098(arg0, false, arg1, arg3) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 35)
    public static final String method498(long arg0, int arg1) {
        field1073++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class498.field7254[(int) (var7 - (arg0 * 37L))]);
            }
            if (arg1 != 64) {
                field1079 = null;
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 75)
    public final void method499(int arg0, int arg1) {
        if (arg0 <= 84) {
            method500(-4);
        }
        field1074++;
        class509 var3 = this.field1080;
        synchronized (this.field1080) {
            this.field1080.method3036(arg1, (byte) -90);
        }
        class509 var4 = this.field1081;
        synchronized (this.field1081) {
            this.field1081.method3036(arg1, (byte) -35);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 97)
    public static void method500(int arg0) {
        field1079 = null;
        if (arg0 != 34) {
            method497(-66, 2, -1, -86, -87);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 108)
    public final void method501(boolean arg0) {
        class509 var2 = this.field1080;
        synchronized (this.field1080) {
            if (!arg0) {
                this.method496(83, -50, 13);
            }
            this.field1080.method3034((byte) 69);
        }
        field1077++;
        class509 var3 = this.field1081;
        synchronized (this.field1081) {
            this.field1081.method3034((byte) 87);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lqp;", line = 125)
    public final class470 method502(byte arg0, int arg1) {
        field1071++;
        class509 var3 = this.field1080;
        class470 var4;
        synchronized (this.field1080) {
            var4 = (class470) this.field1080.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field1072;
        byte[] var6;
        synchronized (this.field1072) {
            var6 = this.field1072.method2130(34, arg1, -125);
        }
        class470 var7 = new class470();
        var7.field6966 = this;
        if (var6 != null) {
            var7.method2867(new class396(var6), true);
        }
        int var8 = -95 % ((-arg0 - 32) / 50);
        class509 var9 = this.field1080;
        synchronized (this.field1080) {
            this.field1080.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 157)
    public final void method503(int arg0) {
        field1082++;
        class509 var2 = this.field1080;
        synchronized (this.field1080) {
            this.field1080.method3045(48);
        }
        if (arg0 == 64) {
            class509 var3 = this.field1081;
            synchronized (this.field1081) {
                this.field1081.method3045(48);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ld;ILfo;Lfo;)V", line = 190)
    public class90(class104 arg0, int arg1, class361 arg2, class361 arg3) {
        this.field1078 = arg3;
        this.field1072 = arg2;
        this.field1072.method2136(-121, 34);
    }
}
