import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class780 {

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lhv;")
    public class151 field10644 = new class151();

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "Z")
    public boolean field10645 = false;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field10643 = -1;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "Luw;")
    public static class208 field10641 = new class208(122, -2);

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "[F")
    public static float[] field10648 = new float[2];

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "Luw;")
    public static class208 field10649 = new class208(30, -1);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field10640;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field10642;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Luw;")
    public static class208 field10647;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)V", line = 6)
    public static void method4273(boolean arg0) {
        field10647 = null;
        field10648 = null;
        field10649 = null;
        if (arg0) {
            field10641 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lpi;I)V", line = 25)
    public final void method4274(class266 arg0, int arg1) {
        field10640++;
        class210 var3 = arg0.field3528;
        if (arg1 != -16115) {
            return;
        }
        boolean var4 = true;
        class706[] var5 = arg0.field3533;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field9324) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field10645) {
            for (class266 var7 = (class266) this.field10644.method857(arg1 + 16005); var7 != null; var7 = (class266) this.field10644.method864(true)) {
                if (var7.field3528 == var3) {
                    var7.method3306(false);
                    class57.method348(var7, 18);
                }
            }
        }
        for (class266 var8 = (class266) this.field10644.method857(-113); var8 != null; var8 = (class266) this.field10644.method864(true)) {
            if (var3.field2887 >= var8.field3528.field2887) {
                class748.method4062(arg0, arg1 ^ 0x3EF2, var8);
                return;
            }
        }
        this.field10644.method855(0, arg0);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V", line = 94)
    public final void method4275(int arg0) {
        field10646++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class266 var2 = (class266) this.field10644.method856(17737);
            if (var2 == null) {
                return;
            }
            var2.method3306(false);
            class57.method348(var2, 18);
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Z)V", line = 213)
    public class780(boolean arg0) {
        this.field10645 = arg0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([IIBLjha;)V", line = 124)
    public static final void method4276(int[] arg0, int arg1, byte arg2, class33 arg3) {
        field10642++;
        if (arg3.field4748 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field4748.length; var5++) {
                if (arg3.field4748[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field4700 != -1) {
                class11 var6 = class143.field1864.method4265(true, arg3.field4700);
                int var7 = var6.field102;
                if (var7 == 1) {
                    arg3.field4663 = 0;
                    arg3.field4692 = arg1;
                    arg3.field4721 = 0;
                    arg3.field4729 = 0;
                    arg3.field4667 = 1;
                    if (!arg3.field4688) {
                        class117.method699(arg3.field4721, var6, false, arg3);
                    }
                }
                if (var7 == 2) {
                    arg3.field4663 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field4748 == null || arg3.field4748[var9] == -1 || class143.field1864.method4265(true, arg0[var9]).field92 >= class143.field1864.method4265(true, arg3.field4748[var9]).field92) {
                arg3.field4748 = arg0;
                arg3.field4692 = arg1;
                break;
            }
        }
        if (arg2 == 75 && var8) {
            arg3.field4692 = arg1;
            arg3.field4748 = arg0;
        }
    }
}
