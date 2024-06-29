import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class24 extends class86 {

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public static int[] field209 = new int[13];

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method104(int arg0, int arg1, byte arg2) {
        ++field210;
        int var3 = -112 % ((arg2 - -34) / 57);
        return ~(arg1 & 32768) != -1;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field209 = null;
        }
        ++field205;
        return 1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field204;
        if (arg0 == -65) {
            if (~super.field1200 != -2 && ~super.field1200 != -1) {
                super.field1200 = this.method73(arg0 ^ -65);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            field206 = -59;
        }
        ++field212;
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JZ)I")
    public static final int method105(long arg0, boolean arg1) {
        ++field203;
        if (arg1) {
            return -49;
        } else {
            class525.method2886(-121, arg0);
            return class368.field4508.get(1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILsf;)V")
    public class24(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)I")
    public final int method106(boolean arg0) {
        if (arg0) {
            method104(-81, 102, (byte) -126);
        }
        ++field211;
        return super.field1200;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field207;
        if (arg0 != 0) {
            field206 = -80;
        }
        return 1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLlfa;ZZ)V")
    public static final void method107(byte arg0, class278 arg1, boolean arg2, boolean arg3) {
        ++field208;
        int var4 = arg1.field3617;
        int var5 = (int) arg1.field4108;
        arg1.method1946(-10364);
        if (arg2) {
            class70.method422(0, var4);
        }
        class118.method708(-1489937552, var4);
        class391 var6 = class738.method4006(112, var5);
        if (var6 != null) {
            class776.method4255(var6, -1007);
        }
        class88.method541((byte) 68);
        if (!arg3 && client.field6070 != -1) {
            class664.method3614(false, client.field6070, 1);
        }
        class555 var7 = new class555(class149.field1895);
        for (class278 var8 = (class278) var7.method3015(104); var8 != null; var8 = (class278) var7.method3017(-1)) {
            if (!var8.method1942(27475)) {
                var8 = (class278) var7.method3015(-103);
                if (var8 == null) {
                    break;
                }
            }
            if (~var8.field3613 == -4) {
                int var9 = (int) var8.field4108;
                if (var9 >>> 16 == var4) {
                    method107((byte) -72, var8, true, arg3);
                }
            }
        }
        if (arg0 >= -20) {
            method107((byte) 65, (class278) null, false, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lsf;)V")
    public class24(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method108(byte arg0) {
        int var1 = -110 % ((-56 - arg0) / 43);
        field209 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method109(Object arg0, int arg1, int arg2, int arg3) {
        ++field202;
        if (arg2 != -2312) {
            field206 = 10;
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class446.method2557(arg3, 125, var4, arg1);
        } else if (arg0 instanceof class521) {
            class521 var5 = (class521) arg0;
            return var5.method2438(arg1, true, arg3);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
