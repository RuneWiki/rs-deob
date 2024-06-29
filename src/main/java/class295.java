import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class295 extends class478 implements class278 {

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Ltq;")
    public class478 field4081;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "[I")
    public static int[] field4082 = new int[1000];

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4083 = new CRC32();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIILtq;)V", line = 4)
    public class295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class478 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class148.method911(arg1, arg0, (byte) -118));
        this.field4081 = arg10;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkm;BII)Z", line = 12)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 123) {
            field4083 = null;
        }
        field4089++;
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I", line = 26)
    public final int method219(int arg0) {
        if (arg0 != -17942) {
            this.method214(26);
        }
        field4080++;
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)Z", line = 40)
    public final boolean method195(int arg0) {
        if (arg0 <= 91) {
            method1827(8);
        }
        field4088++;
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkm;I)V", line = 51)
    public final void method216(class487 arg0, int arg1) {
        field4068++;
        int var3 = 113 / ((arg1 + 12) / 60);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lms;IIZ)V", line = 61)
    public static final void method1824(class363 arg0, int arg1, int arg2, boolean arg3) {
        field4084++;
        class90 var4 = arg0.method2198(class338.field4636, 0);
        if (arg3) {
            method1827(89);
        }
        if (var4 == null) {
            return;
        }
        class338.field4636.method1094(arg1, arg2, arg0.field5101 + arg1, arg2 - -arg0.field5200);
        if (class306.field4191 >= 3) {
            class338.field4636.method1110(-16777216, var4, arg1, arg2);
        } else {
            class394.field5543.method2300((float) arg0.field5101 / 2.0F + (float) arg1, (float) arg0.field5200 / 2.0F + (float) arg2, 4096, (int) (-class418.field5750) & 0x3FFF << 2, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLto;)V", line = 84)
    public static final void method1825(boolean arg0, class370 arg1) {
        arg1.field5232 = null;
        if (!arg0) {
            field4083 = null;
        }
        field4066++;
        int var2 = arg1.field5233.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field5233[var3].field3098 = false;
        }
        class479[] var4 = class254.field3560;
        synchronized (class254.field3560) {
            if (var2 < class254.field3560.length && class145.field2022[var2] < 200) {
                class254.field3560[var2].method2817(false, arg1);
                int var10002 = class145.field2022[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I", line = 117)
    public final int method205(byte arg0) {
        if (arg0 != 114) {
            this.method216((class487) null, -46);
        }
        field4079++;
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lkm;I)V", line = 130)
    public final void method218(class487 arg0, int arg1) {
        if (arg1 >= -73) {
            method1826(25, 30);
        }
        field4075++;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z", line = 140)
    public final boolean method214(int arg0) {
        if (arg0 < 24) {
            return true;
        } else {
            field4077++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 155)
    public final void method217(boolean arg0) {
        field4069++;
        if (arg0) {
            this.method216((class487) null, 80);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkm;II)Lab;", line = 170)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        field4076++;
        int var4 = -111 % ((arg1 + 12) / 47);
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)Ljava/lang/String;", line = 181)
    public static final String method1826(int arg0, int arg1) {
        if (arg1 > 0) {
            return null;
        } else {
            field4072++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF4E) >> 8) + "." + (arg0 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 195)
    public final void method202(byte arg0) {
        field4071++;
        if (arg0 < 42) {
            this.method198(-69, (class487) null, 107, false, 0, (class280) null, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lkm;I)V", line = 205)
    public final void method197(class487 arg0, int arg1) {
        int var3 = 108 / ((arg1 - 64) / 59);
        field4070++;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I", line = 214)
    public final int method211(boolean arg0) {
        if (!arg0) {
            this.field4081 = null;
        }
        field4067++;
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I", line = 225)
    public final int method215(int arg0) {
        field4073++;
        if (arg0 != -11524) {
            method1824((class363) null, 6, -17, true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)Lwt;", line = 236)
    public static final class200 method1827(int arg0) {
        field4087++;
        return arg0 == -476678640 ? class379.field5359 : null;
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)V", line = 247)
    public static void method1828(int arg0) {
        field4083 = null;
        field4082 = null;
        if (arg0 != 65358) {
            field4085 = 24;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Lkm;I)Lto;", line = 261)
    public final class370 method193(class487 arg0, int arg1) {
        field4078++;
        if (arg1 >= -6) {
            this.method202((byte) 84);
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 276)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        field4074++;
        if (arg6 != 59) {
            this.method211(true);
        }
    }
}
