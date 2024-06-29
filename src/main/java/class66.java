import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 extends class55 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Ljava/lang/String;")
    public static String field776 = null;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static volatile int field789 = -1;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field787 = -1;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Ljava/lang/String;")
    public String field785;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public static final void method403(boolean arg0, int arg1) {
        if (!arg0) {
            method405(true);
        }
        class274.field4099.method62(-124, arg1);
        class277.field4211.method62(-84, arg1);
        ++field779;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILwe;I)V")
    public static final void method404(int arg0, int arg1, class82 arg2, int arg3) {
        if (arg1 != 22595) {
            field789 = 49;
        }
        ++field780;
        if (~arg2.field1057 != -1) {
            if (~arg2.field1057 != -2) {
                if (arg2.field1057 == 2) {
                    arg2.field1096 = -arg2.field1048 + arg3 + -arg2.field1089;
                } else if (arg2.field1057 == 3) {
                    arg2.field1096 = arg2.field1089 * arg3 >> 14;
                } else if (arg2.field1057 != 4) {
                    arg2.field1096 = arg3 - ((arg2.field1089 * arg3 >> 14) + arg2.field1048);
                } else {
                    arg2.field1096 = (arg2.field1089 * arg3 >> 14) + (arg3 - arg2.field1048) / 2;
                }
            } else {
                arg2.field1096 = (-arg2.field1048 + arg3) / 2 + arg2.field1089;
            }
        } else {
            arg2.field1096 = arg2.field1089;
        }
        if (~arg2.field1076 != -1) {
            if (arg2.field1076 == 1) {
                arg2.field1000 = (-arg2.field1131 + arg0) / 2 + arg2.field1112;
            } else if (arg2.field1076 == 2) {
                arg2.field1000 = -arg2.field1131 + -arg2.field1112 + arg0;
            } else if (~arg2.field1076 == -4) {
                arg2.field1000 = arg2.field1112 * arg0 >> 14;
            } else if (~arg2.field1076 == -5) {
                arg2.field1000 = (arg2.field1112 * arg0 >> 14) + (-arg2.field1131 + arg0) / 2;
            } else {
                arg2.field1000 = arg0 - arg2.field1131 - (arg2.field1112 * arg0 >> 14);
            }
        } else {
            arg2.field1000 = arg2.field1112;
        }
        if (class296.field4679) {
            if (~client.method1920(arg2).field2525 != -1 || ~arg2.field1026 == -1) {
                if (~arg2.field1000 <= -1) {
                    if (arg2.field1131 + arg2.field1000 > arg0) {
                        arg2.field1000 = arg0 - arg2.field1131;
                    }
                } else {
                    arg2.field1000 = 0;
                }
                if (arg2.field1096 >= 0) {
                    if (~(arg2.field1096 + arg2.field1048) < ~arg3) {
                        arg2.field1096 = -arg2.field1048 + arg3;
                        return;
                    }
                } else {
                    arg2.field1096 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static final void method405(boolean arg0) {
        ++field774;
        class55.field648.method838(65535);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class129.field1860[var1] = 0L;
        }
        if (!arg0) {
            method411(116);
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class107.field1446[var2] = 0L;
        }
        class33.field384 = 0;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)I")
    public final int method406(int arg0) {
        if (arg0 <= 66) {
            method405(true);
        }
        ++field778;
        return (int) super.field4489;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)J")
    public final long method407(int arg0) {
        ++field788;
        if (arg0 != -1) {
            field789 = -81;
        }
        return super.field651 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public final void method408(int arg0) {
        super.field651 |= Long.MIN_VALUE;
        ++field775;
        if (this.method407(~arg0) == (long) arg0) {
            class189.field2713.method1656(this, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)I")
    public final int method409(byte arg0) {
        ++field781;
        int var2 = 24 % ((66 - arg0) / 45);
        return (int) (255L & super.field4489 >>> 32);
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public final void method410(int arg0) {
        ++field783;
        super.field651 = class86.method509(false) - -500L | super.field651 & Long.MIN_VALUE;
        class45.field538.method1656(this, (byte) -62);
        if (arg0 <= 115) {
            field776 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
    public static void method411(int arg0) {
        if (arg0 != 2) {
            field790 = 52;
        }
        field776 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V")
    public class66(int arg0, int arg1) {
        super.field4489 = (long) arg1 | (long) arg0 << 32;
    }
}
