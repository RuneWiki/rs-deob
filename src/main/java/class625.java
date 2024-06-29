import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class625 extends class460 {

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "[I")
    public static int[] field8907 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
    public static boolean field8913 = false;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Lnd;")
    public static class121 field8919;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjo;I)V", line = 3)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        ++field8912;
        super.field6621.method2295((byte) -116, arg1);
        super.field6621.method2270(arg0, (byte) 110);
        int var4 = -8 % ((65 - arg2) / 53);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BZ)V", line = 15)
    public final void method1177(byte arg0, boolean arg1) {
        int var3 = -83 % ((-85 - arg0) / 38);
        ++field8916;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 30)
    public final void method1174(byte arg0) {
        super.field6621.method2316(false, (byte) -51);
        if (arg0 < -56) {
            ++field8908;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lkfa;)V", line = 46)
    public class625(class382 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(III)V", line = 49)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field8909;
        if (arg2 != 1) {
            this.method1174((byte) -101);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z", line = 62)
    public final boolean method1168(int arg0) {
        ++field8911;
        if (arg0 != 2048) {
            method3528(28, 123);
        }
        return true;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lvo;BI)Lfm;", line = 73)
    public static final class251 method3527(class345 arg0, byte arg1, int arg2) {
        ++field8917;
        byte[] var3 = arg0.method2086(1024, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 < 7) {
                field8910 = 13;
            }
            return new class251(var3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)Llq;", line = 91)
    public static final class292 method3528(int arg0, int arg1) {
        ++field8915;
        if (arg1 != 1) {
            return null;
        } else {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    if ((double) class161.field2616 == 3.0D) {
                        return class666.field9367;
                    }
                    if ((double) class161.field2616 == 4.0D) {
                        return class565.field8274;
                    }
                    if ((double) class161.field2616 == 6.0D) {
                        return class334.field4667;
                    }
                    if ((double) class161.field2616 >= 8.0D) {
                        return class423.field6039;
                    }
                } else if (arg0 == 2) {
                    if ((double) class161.field2616 == 3.0D) {
                        return class334.field4667;
                    }
                    if ((double) class161.field2616 == 4.0D) {
                        return class423.field6039;
                    }
                    if ((double) class161.field2616 == 6.0D) {
                        return class520.field7676;
                    }
                    if ((double) class161.field2616 >= 8.0D) {
                        return class222.field3324;
                    }
                }
            } else {
                if ((double) class161.field2616 == 3.0D) {
                    return class121.field1980;
                }
                if ((double) class161.field2616 == 4.0D) {
                    return class127.field2084;
                }
                if ((double) class161.field2616 == 6.0D) {
                    return class666.field9367;
                }
                if ((double) class161.field2616 >= 8.0D) {
                    return class565.field8274;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZI)V", line = 157)
    public final void method1175(boolean arg0, int arg1) {
        if (arg1 == 0) {
            super.field6621.method2316(true, (byte) -63);
            ++field8914;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 173)
    public static void method3529(boolean arg0) {
        field8919 = null;
        if (!arg0) {
            field8913 = false;
        }
        field8907 = null;
    }
}
