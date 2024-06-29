import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 {

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
    public int field1002 = 1;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public int field999 = 64;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "Z")
    public boolean field1000 = false;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
    public int field1007 = 64;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "Z")
    public boolean field1003 = false;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "I")
    public int field1006 = 2;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "Lhj;")
    public static class596 field1001 = new class596(56, 6);

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "Lbja;")
    public static class34 field1011 = new class34(13, 0, 1, 0);

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IILes;I)V")
    private final void method688(int arg0, int arg1, class403 arg2, int arg3) {
        field1008++;
        if (arg3 == 1) {
            this.field1004 = arg2.method2390((byte) -121);
            if (this.field1004 == 65535) {
                this.field1004 = -1;
            }
        } else if (arg3 == 2) {
            this.field999 = arg2.method2390((byte) -99) + 1;
            this.field1007 = arg2.method2390((byte) -117) + 1;
        } else if (arg3 == 3) {
            arg2.method2392(-100);
        } else if (arg3 == 4) {
            this.field1006 = arg2.method2396((byte) 95);
        } else if (arg3 == 5) {
            this.field1002 = arg2.method2396((byte) 76);
        } else if (arg3 == 6) {
            this.field1003 = true;
        } else if (arg3 == 7) {
            this.field1000 = true;
        }
        if (arg1 < 56) {
            this.field999 = 35;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
    public static void method689(int arg0) {
        if (arg0 < 67) {
            method691(-5, null);
        }
        field1001 = null;
        field1011 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Les;II)V")
    public final void method690(class403 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return;
        }
        while (true) {
            int var4 = arg0.method2396((byte) 14);
            if (var4 == 0) {
                field1005++;
                return;
            }
            this.method688(arg1, arg2 ^ 0x4E, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method691(int arg0, String arg1) {
        field1010++;
        for (int var2 = 0; var2 < class433.field5714.length; var2++) {
            if (class433.field5714[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 != -1) {
            method689(107);
        }
        return -1;
    }
}
