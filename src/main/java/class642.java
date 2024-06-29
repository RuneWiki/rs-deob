import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class642 extends class381 {

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
    public boolean field9207;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "[Leo;")
    public class642[] field9210;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
    public static int[] field9198 = new int[50];

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Ljava/lang/String;")
    public static String field9202 = null;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field9203 = -1;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Lau;")
    public static class692 field9200 = new class692(4);

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public int field9206;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "Lhj;")
    public class150 field9211;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "Lpq;")
    public class171 field9216;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I", line = 7)
    public int method504(int arg0) {
        int var2 = -77 % ((arg0 + 74) / 33);
        field9199++;
        return -1;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 17)
    public void method503(int arg0) {
        if (this.field9207) {
            this.field9216.method1187(-30304);
            this.field9216 = null;
        } else {
            this.field9211.method1070(arg0 - 31049);
            this.field9211 = null;
        }
        field9212++;
        if (arg0 != 30929) {
            this.method138(-83, 1);
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)V", line = 44)
    public static void method3655(int arg0) {
        field9202 = null;
        int var1 = 95 / ((arg0 + 50) / 55);
        field9198 = null;
        field9200 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I", line = 60)
    public int method1250(byte arg0) {
        if (arg0 != 44) {
            this.method502(-117, (byte) -2, -79);
        }
        field9215++;
        return -1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[[I", line = 71)
    public int[][] method138(int arg0, int arg1) {
        if (arg0 != 21402) {
            this.method1(67, null, (byte) -56);
        }
        field9217++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V", line = 89)
    public void method2(int arg0) {
        field9205++;
        if (arg0 != 6276) {
            this.method3658((byte) 127, 9, -44);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lrf;B)I", line = 99)
    public static final int method3656(class157 arg0, byte arg1) {
        field9214++;
        if (class41.field613 == arg0) {
            return 9216;
        } else if (class287.field3984 == arg0) {
            return 34065;
        } else if (class457.field6609 == arg0) {
            return 34066;
        } else {
            if (arg1 != -23) {
                field9202 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[I", line = 122)
    public int[] method3(int arg0, int arg1) {
        if (arg1 == -9) {
            field9204++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBI)V", line = 144)
    public void method502(int arg0, byte arg1, int arg2) {
        field9213++;
        int var4 = this.field9206 == 255 ? arg2 : this.field9206;
        if (arg1 != 7) {
            field9203 = 91;
        }
        if (this.field9207) {
            this.field9216 = new class171(var4, arg2, arg0);
        } else {
            this.field9211 = new class150(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILgk;B)V", line = 172)
    public void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 >= 29) {
            field9209++;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)[[I", line = 183)
    public final int[][] method3657(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method502(-37, (byte) 86, 38);
        }
        field9208++;
        if (this.field9210[arg2].field9207) {
            int[] var4 = this.field9210[arg2].method3(arg0, -9);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9210[arg2].method138(21402, arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)[I", line = 219)
    public final int[] method3658(byte arg0, int arg1, int arg2) {
        field9201++;
        if (arg0 < 54) {
            return null;
        } else if (this.field9210[arg2].field9207) {
            return this.field9210[arg2].method3(arg1, -9);
        } else {
            return this.field9210[arg2].method138(21402, arg1)[0];
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(IZ)V", line = 239)
    public class642(int arg0, boolean arg1) {
        this.field9207 = arg1;
        this.field9210 = new class642[arg0];
    }
}
