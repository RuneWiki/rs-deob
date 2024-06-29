import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class301 {

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "[I")
    public int[] field4343;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "[[F")
    public float[][] field4346;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "[I")
    public int[] field4337;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
    public int[] field4339;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lde;")
    public static class556 field4340 = new class556();

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Lfba;")
    public static class27 field4345 = new class27(65, -1);

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1947(int arg0, int arg1, int arg2) {
        field4342++;
        class313 var3 = class312.method1998((long) arg2, arg1, -1);
        var3.method2001((byte) -75);
        var3.field4464 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1948(int arg0) {
        field4341++;
        int var1 = 73 % ((28 - arg0) / 56);
        class23 var2 = null;
        try {
            class141 var3 = class519.field7328.method2839(true, "2", 0);
            while (var3.field2089 == 0) {
                class107.method828(1L, (byte) 30);
            }
            if (var3.field2089 == 1) {
                var2 = (class23) var3.field2092;
                byte[] var4 = new byte[(int) var2.method235((byte) 80)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method229(var4, (byte) -88, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class706.method3993(new class494(var4), (byte) -7);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method230((byte) -127);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 68)
    public static final void method1949(int arg0) {
        field4338++;
        if (arg0 > -66) {
            field4340 = null;
        }
        class394.field5428++;
        class312 var1 = class353.method2245(class87.field971, class747.field10347, (byte) 19);
        var1.field4445.method2952(0, class592.method3442((byte) -105));
        var1.field4445.method2957(class428.field5825, 1267307848);
        var1.field4445.method2957(class714.field9895, 1267307848);
        var1.field4445.method2952(0, class21.field353.field10070.method1629(-71));
        class208.method1440(var1, 115);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 94)
    public static void method1950(byte arg0) {
        if (arg0 != -120) {
            field4340 = null;
        }
        field4345 = null;
        field4340 = null;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "([I[I[I[[F)V", line = 105)
    public class301(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field4343 = arg2;
        this.field4346 = arg3;
        this.field4337 = arg0;
        this.field4339 = arg1;
    }
}
