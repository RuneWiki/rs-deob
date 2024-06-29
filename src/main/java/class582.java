import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class582 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "S")
    public short field8229;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public int field8241;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "S")
    public short field8235;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public int field8231;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Z")
    public boolean field8228;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public int field8238;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field8239;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "B")
    public byte field8233;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "S")
    public short field8243;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
    public static int[] field8242 = new int[2048];

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3341(boolean arg0) {
        field8242 = null;
        if (arg0) {
            field8242 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method3342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg2) >= class268.field3766 && (arg2 + arg3) <= class236.field3392 && arg4 - arg2 >= class223.field3260 && (arg2 + arg4) <= class706.field9700) {
            class549.method3082(arg3, arg1, arg4, arg2, (byte) -106);
        } else {
            class37.method227(arg0 - 28220, arg1, arg3, arg4, arg2);
        }
        field8236++;
        if (arg0 != -3) {
            method3345(-25, true, -10);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V", line = 39)
    public static final void method3343(byte arg0, String arg1, String arg2) {
        class328.field4463 = 1;
        if (arg0 != 124) {
            method3344(87);
        }
        field8240++;
        class459.field6232 = -1;
        class678.method3823(arg2, (byte) -95, false, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I", line = 60)
    public static final int method3344(int arg0) {
        if (arg0 >= -10) {
            return 87;
        } else {
            field8237++;
            return class450.method2609(0, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)V", line = 71)
    public static final void method3345(int arg0, boolean arg1, int arg2) {
        if (class64.field890 > class64.field891) {
            class64.field891 = (float) ((double) class64.field891 / 30.0D + (double) class64.field891);
            if (class64.field890 < class64.field891) {
                class64.field891 = class64.field890;
            }
            class538.method3044(-108);
            class64.field885 = (int) class64.field891 >> 1;
            class64.field889 = class424.method2503((byte) 26, class64.field885);
        } else if (class64.field891 > class64.field890) {
            class64.field891 = (float) ((double) class64.field891 - (double) class64.field891 / 30.0D);
            if (class64.field891 < class64.field890) {
                class64.field891 = class64.field890;
            }
            class538.method3044(-112);
            class64.field885 = (int) class64.field891 >> 1;
            class64.field889 = class424.method2503((byte) 26, class64.field885);
        }
        field8230++;
        if (class210.field3141 != -1 && class499.field6826 != -1) {
            int var3 = class210.field3141 - class215.field3194;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class499.field6826 - class211.field3161;
            class215.field3194 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class211.field3161 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class210.field3141 = -1;
                class499.field6826 = -1;
            }
            class538.method3044(-112);
        }
        if (class439.field5965 > 0) {
            class299.field4116--;
            if (class299.field4116 == 0) {
                class299.field4116 = 100;
                class439.field5965--;
            }
        } else {
            class769.field10607 = -1;
            class428.field5845 = -1;
        }
        if (class164.field2645 && class497.field6805 != null) {
            for (class24 var5 = (class24) class497.field6805.method3589((byte) -128); var5 != null; var5 = (class24) class497.field6805.method3591(0)) {
                class393 var6 = class64.field882.method4031(36, var5.field485.field6973);
                if (var5.method161(arg0, (byte) 41, arg2)) {
                    if (var6.field5407 != null) {
                        if (var6.field5407[4] != null) {
                            class596.method3396(true, false, -1, -1, 0, (long) var5.field485.field6973, var6.field5420, 1008, var6.field5407[4], (long) var5.field485.field6973, (byte) 34, false, var6.field5430);
                        }
                        if (var6.field5407[3] != null) {
                            class596.method3396(true, false, -1, -1, 0, (long) var5.field485.field6973, var6.field5420, 1006, var6.field5407[3], (long) var5.field485.field6973, (byte) 34, false, var6.field5430);
                        }
                        if (var6.field5407[2] != null) {
                            class596.method3396(true, false, -1, -1, 0, (long) var5.field485.field6973, var6.field5420, 1003, var6.field5407[2], (long) var5.field485.field6973, (byte) 34, false, var6.field5430);
                        }
                        if (var6.field5407[1] != null) {
                            class596.method3396(true, false, -1, -1, 0, (long) var5.field485.field6973, var6.field5420, 1012, var6.field5407[1], (long) var5.field485.field6973, (byte) 34, false, var6.field5430);
                        }
                        if (var6.field5407[0] != null) {
                            class596.method3396(true, false, -1, -1, 0, (long) var5.field485.field6973, var6.field5420, 1011, var6.field5407[0], (long) var5.field485.field6973, (byte) 34, false, var6.field5430);
                        }
                    }
                    if (!var5.field485.field6975) {
                        var5.field485.field6975 = true;
                        class76.method660(class661.field9159, var5.field485.field6973, var6.field5430);
                    }
                    if (var5.field485.field6975) {
                        class76.method660(class666.field9270, var5.field485.field6973, var6.field5430);
                    }
                } else if (var5.field485.field6975) {
                    var5.field485.field6975 = false;
                    class76.method660(class240.field3418, var5.field485.field6973, var6.field5430);
                }
            }
        }
        if (arg1) {
            field8242 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 210)
    public class582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8229 = (short) arg5;
        this.field8241 = arg1;
        this.field8235 = (short) arg4;
        this.field8231 = arg3;
        this.field8228 = arg10;
        this.field8238 = arg2;
        this.field8239 = arg0;
        this.field8232 = arg11;
        this.field8233 = (byte) arg8;
        this.field8243 = (short) arg6;
    }
}
