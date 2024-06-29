import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class303 {

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Leda;")
    private class14 field4615 = new class14(64);

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "Lla;")
    private class422 field4613;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V", line = 4)
    public final void method1990(int arg0, int arg1) {
        class14 var3 = this.field4615;
        synchronized (this.field4615) {
            if (arg0 <= 56) {
                return;
            }
            this.field4615.method68(-16878, arg1);
        }
        field4610++;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1991(int arg0) {
        field4611++;
        class654.field9289.method2292(-37, 1, class654.field9289.field5403);
        class654.field9289.method2292(110, 1, class654.field9289.field5453);
        class654.field9289.method2292(121, 2, class654.field9289.field5444);
        class654.field9289.method2292(110, 2, class654.field9289.field5404);
        class654.field9289.method2292(79, 1, class654.field9289.field5433);
        class654.field9289.method2292(-53, 1, class654.field9289.field5427);
        class654.field9289.method2292(101, 1, class654.field9289.field5434);
        class654.field9289.method2292(78, 1, class654.field9289.field5438);
        class654.field9289.method2292(-108, 1, class654.field9289.field5445);
        class654.field9289.method2292(-90, 1, class654.field9289.field5448);
        class654.field9289.method2292(-76, 1, class654.field9289.field5431);
        class654.field9289.method2292(-49, 1, class654.field9289.field5447);
        class654.field9289.method2292(-55, 0, class654.field9289.field5440);
        class654.field9289.method2292(122, 1, class654.field9289.field5436);
        class654.field9289.method2292(-66, 0, class654.field9289.field5412);
        class654.field9289.method2292(65, 0, class654.field9289.field5417);
        class654.field9289.method2292(121, 1, class654.field9289.field5441);
        if (arg0 < 120) {
            return;
        }
        class654.field9289.method2292(-50, 0, class654.field9289.field5422);
        class654.field9289.method2292(109, 0, class654.field9289.field5429);
        class298.method1916(-122);
        class654.field9289.method2292(98, 1, class654.field9289.field5407);
        class654.field9289.method2292(104, 3, class654.field9289.field5443);
        class710.method3930((byte) 56);
        class525.method3121(-11701);
        class515.field7466 = true;
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)V", line = 55)
    public final void method1992(int arg0) {
        field4612++;
        class14 var2 = this.field4615;
        synchronized (this.field4615) {
            this.field4615.method76(35);
            if (arg0 != 23272) {
                this.method1996(true);
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IILjava/io/File;)[B", line = 75)
    public static final byte[] method1993(int arg0, int arg1, File arg2) {
        if (arg0 != 0) {
            return null;
        }
        field4607++;
        try {
            byte[] var3 = new byte[arg1];
            class86.method756(arg2, var3, arg1, arg0 + 124);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIIII)V", line = 93)
    public static final void method1994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class461.field6699 >= arg1 && class76.field1126 <= arg5) {
            boolean var6;
            if (arg0 < class184.field3102) {
                arg0 = class184.field3102;
                var6 = false;
            } else if (class657.field9347 >= arg0) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class657.field9347;
            }
            boolean var7;
            if (class184.field3102 > arg2) {
                var7 = false;
                arg2 = class184.field3102;
            } else if (class657.field9347 >= arg2) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class657.field9347;
            }
            if (arg1 >= class76.field1126) {
                class608.method3484(class77.field1131[arg1++], arg0, -7, arg3, arg2);
            } else {
                arg1 = class76.field1126;
            }
            if (arg5 > class461.field6699) {
                arg5 = class461.field6699;
            } else {
                class608.method3484(class77.field1131[arg5--], arg0, -7, arg3, arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    int[] var9 = class77.field1131[var8];
                    var9[arg0] = var9[arg2] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg5; var11++) {
                    class77.field1131[var11][arg0] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg5; var10++) {
                    class77.field1131[var10][arg2] = arg3;
                }
            }
        }
        field4609++;
        if (arg4 != 0) {
            method1993(-73, 35, null);
        }
    }

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)Lpha;", line = 199)
    public static final class553 method1995(int arg0) {
        field4614++;
        return arg0 <= 91 ? null : class729.field10201;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V", line = 211)
    public final void method1996(boolean arg0) {
        field4608++;
        class14 var2 = this.field4615;
        synchronized (this.field4615) {
            if (!arg0) {
                this.field4615.method71((byte) 44);
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI)Laj;", line = 228)
    public final class193 method1997(byte arg0, int arg1) {
        field4616++;
        class14 var3 = this.field4615;
        class193 var4;
        synchronized (this.field4615) {
            var4 = (class193) this.field4615.method80((byte) -9, (long) arg1);
            if (arg0 <= 102) {
                method1994(102, 118, 56, 4, 106, -78);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field4613;
        byte[] var6;
        synchronized (this.field4613) {
            var6 = this.field4613.method2624(0, 11, arg1);
        }
        class193 var7 = new class193();
        if (var6 != null) {
            var7.method1465(new class301(var6), (byte) -3);
        }
        class14 var8 = this.field4615;
        synchronized (this.field4615) {
            this.field4615.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 260)
    public class303(class292 arg0, int arg1, class422 arg2) {
        this.field4613 = arg2;
        if (this.field4613 != null) {
            this.field4613.method2615(0, 11);
        }
    }
}
