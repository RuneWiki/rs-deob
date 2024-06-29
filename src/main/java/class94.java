import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class94 {

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field1315 = -1;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field1308 = -1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Z")
    public static boolean field1309 = true;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Ljd;")
    public static class361 field1312;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    public int[] field1316;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method617(boolean arg0) {
        if (arg0) {
            class277.field4216 = class103.field1393;
            class307.field4638 = class154.field2118;
        } else {
            class277.field4216 = class17.field251;
            class307.field4638 = class85.field1201;
        }
        class56.field750 = class277.field4216.length;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    public static final int method618(int arg0, int arg1, int arg2) {
        field1313++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (arg0 <= 96) {
                method618(2, -42, 78);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILef;)V")
    public final void method619(int arg0, int arg1, class385 arg2) {
        if (arg0 < 68) {
            this.field1315 = 51;
        }
        while (true) {
            int var4 = arg2.method2343(255);
            if (var4 == 0) {
                field1317++;
                return;
            }
            this.method620(7, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIILef;)V")
    private final void method620(int arg0, int arg1, int arg2, class385 arg3) {
        field1311++;
        if (arg1 == 1) {
            this.field1315 = arg3.method2323(-65);
        } else if (arg1 == 2) {
            this.field1316 = new int[arg3.method2343(255)];
            for (int var5 = 0; var5 < this.field1316.length; var5++) {
                this.field1316[var5] = arg3.method2323(-81);
            }
        } else if (arg1 == 3) {
            this.field1308 = arg3.method2343(255);
        }
        int var6 = 24 / ((74 - arg0) / 37);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method621(byte arg0) {
        field1312 = null;
        if (arg0 >= -31) {
            field1310 = 39;
        }
    }
}
