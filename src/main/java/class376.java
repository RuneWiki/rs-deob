import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class376 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lgh;")
    public class392 field5408 = null;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Lgh;")
    public class392 field5411 = null;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[Luk;")
    public class176[] field5409 = null;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lgh;")
    public class392 field5414 = null;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[Luk;")
    public class176[] field5418 = null;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Z")
    public boolean field5415;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Lqv;")
    public static class316 field5410 = new class316(82, 4);

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
    public static final void method2295(short[] arg0, int arg1, String[] arg2) {
        if (arg1 >= 8) {
            class21.method116(0, arg2, arg2.length - 1, 1, arg0);
            field5413++;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBIII)V")
    public static final void method2296(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5412++;
        class275 var5 = class213.method1433((byte) 62, 8, arg0);
        var5.method1778(0);
        var5.field4106 = arg3;
        var5.field4113 = arg4;
        var5.field4104 = arg2;
        if (arg1 != -99) {
            method2296(40, (byte) -125, -35, 53, -64);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2297(int arg0) {
        if (arg0 >= 107) {
            field5410 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLqa;Lci;)V")
    public static final void method2298(byte arg0, class167 arg1, class320 arg2) {
        if (arg0 < 29) {
            method2296(-22, (byte) -58, -27, -128, -77);
        }
        field5416++;
        if (class332.field4925) {
            return;
        }
        arg1.method233(0);
        class387.field5510 = arg1.method308(class104.method763(arg2, class473.field6896), true);
        class387.field5510.method2175((class50.field927 - class387.field5510.method376()) / 2, (class76.field1247 - class387.field5510.method374()) / 2);
        class490.field7069 = arg1.method308(class104.method763(arg2, class322.field4797), true);
        class490.field7069.method2175((class50.field927 - class490.field7069.method376()) / 2, 18);
        class332.field4925 = true;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lbt;)V")
    public class376(class33 arg0) {
        this.field5415 = arg0.field692;
        class163.method1176(arg0, 0);
        if (this.field5415) {
            byte[] var2 = class42.method419(false, true, class399.field5664);
            this.field5411 = new class392(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class42.method419(false, true, class347.field5105);
            this.field5408 = new class392(arg0, 6410, 128, 128, 16, var3, 6410);
            class302 var4 = arg0.field619;
            if (var4.method1932(-89)) {
                byte[] var5 = class42.method419(false, true, class126.field1985);
                this.field5414 = new class392(arg0, 6408, 128, 128, 16);
                class392 var6 = new class392(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1935(-119, var6, this.field5414, 2.0F)) {
                    this.field5414.method882(9728);
                } else {
                    this.field5414.method883(-8820);
                    this.field5414 = null;
                }
                var6.method883(-8820);
                return;
            }
        } else {
            this.field5418 = new class176[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class137.method996(var7 * 128 * 128 * 2, (byte) 100, class399.field5664, 32768);
                this.field5418[var7] = new class176(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field5409 = new class176[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class137.method996(var8 * 128 * 2 * 128, (byte) -120, class347.field5105, 32768);
                this.field5409[var8] = new class176(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
