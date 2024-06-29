import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class641 {

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lan;")
    public class23 field8902 = new class23();

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Z")
    public boolean field8903 = false;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Lkg;")
    public static class275 field8898 = new class275(45, -1);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Lnd;")
    public static class547 field8904;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3602(byte arg0) {
        field8899++;
        class700 var1 = null;
        try {
            class181 var2 = class162.field2227.method2638("2", 3070, true);
            while (var2.field2538 == 0) {
                class149.method1052(1L, true);
            }
            if (var2.field2538 == 1) {
                var1 = (class700) var2.field2540;
                byte[] var3 = new byte[(int) var1.method3939((byte) 82)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3938(false, var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class10.method64(new class461(var3), 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3941(true);
            }
            if (arg0 != 86) {
                method3604((byte) 95);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 59)
    public final void method3603(int arg0) {
        while (true) {
            class635 var2 = (class635) this.field8902.method157((byte) -52);
            if (var2 == null) {
                field8901++;
                if (arg0 != -14913) {
                    field8898 = null;
                    return;
                }
                return;
            }
            var2.method3835(0);
            class358.method2077((byte) -14, var2);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V", line = 80)
    public static void method3604(byte arg0) {
        field8904 = null;
        field8898 = null;
        if (arg0 <= 105) {
            method3604((byte) 95);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjk;)V", line = 91)
    public final void method3605(int arg0, class635 arg1) {
        field8897++;
        class435 var3 = arg1.field8757;
        boolean var4 = true;
        class314[] var5 = arg1.field8760;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field4099) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field8903) {
            for (class635 var7 = (class635) this.field8902.method162(-22305); var7 != null; var7 = (class635) this.field8902.method158(false)) {
                if (var7.field8757 == var3) {
                    var7.method3835(0);
                    class358.method2077((byte) -14, var7);
                }
            }
        }
        if (arg0 != 24723) {
            return;
        }
        for (class635 var8 = (class635) this.field8902.method162(-22305); var8 != null; var8 = (class635) this.field8902.method158(false)) {
            if (var3.field5798 >= var8.field8757.field5798) {
                class85.method707(var8, 0, arg1);
                return;
            }
        }
        this.field8902.method166(-8839, arg1);
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Z)V", line = 193)
    public class641(boolean arg0) {
        this.field8903 = arg0;
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V", line = 163)
    public static final void method3606(byte arg0) {
        if (class699.field9728 != null) {
            class502[] var1 = class699.field9728;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class502 var3 = var1[var2];
                var3.method1938(-126);
            }
        }
        field8900++;
        if (arg0 <= 98) {
            method3606((byte) -111);
        }
    }
}
