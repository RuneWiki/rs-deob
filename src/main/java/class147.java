import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class147 extends class126 {

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Z")
    public boolean field2011 = false;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
    public boolean field2018 = false;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2014 = "wave:";

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "[I")
    public static int[] field2015;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([JII[II)V", line = 4)
    public static final void method932(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field2016++;
        if (arg2 != 2) {
            method935((byte) -107);
        }
        if (arg4 >= arg1) {
            return;
        }
        int var5 = (arg4 + arg1) / 2;
        int var6 = arg4;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var9;
        for (int var10 = arg4; var10 < arg1; var10++) {
            if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var13 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var13;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var9;
        method932(arg0, var6 - 1, 2, arg3, arg4);
        method932(arg0, arg1, 2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIII)V", line = 58)
    public static final void method933(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2017++;
        class359.field5189 = 0L;
        if (arg3 != 1) {
            return;
        }
        int var5 = class215.method1266(arg3 ^ 0x3);
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class61.field807.method1743()) {
            arg1 = true;
        }
        class144.method922(arg4, -127, arg2, var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZZ)V", line = 135)
    public class147(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2012 = arg0;
        this.field2011 = arg4;
        this.field2010 = arg2;
        this.field2018 = arg3;
        this.field2019 = arg1;
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V", line = 85)
    public static final void method934(int arg0) {
        class189 var1 = class240.field3217;
        synchronized (class240.field3217) {
            if (arg0 >= -57) {
                field2014 = null;
            }
            class240.field3217.method1141(256);
        }
        field2013++;
        class189 var2 = class284.field4133;
        synchronized (class284.field4133) {
            class284.field4133.method1141(256);
        }
        class189 var3 = class33.field469;
        synchronized (class33.field469) {
            class33.field469.method1141(256);
        }
        class189 var4 = class398.field5926;
        synchronized (class398.field5926) {
            class398.field5926.method1141(256);
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V", line = 115)
    public static void method935(byte arg0) {
        if (arg0 == -21) {
            field2015 = null;
            field2014 = null;
        }
    }
}
