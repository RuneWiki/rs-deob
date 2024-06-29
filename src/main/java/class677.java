import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class677 {

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
    public boolean field9602 = false;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Llp;")
    public static class270 field9600 = new class270(15, 0, 1, 0);

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Z")
    public static boolean field9606 = false;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public int field9599;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public int field9605;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lcr;")
    public static class112 field9607;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Lpg;")
    public class150 field9603;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
    public final boolean method3741(int arg0) {
        field9598++;
        if (arg0 > -66) {
            this.field9599 = -30;
        }
        return this.field9603.field1892.method1086((byte) 121, this.field9599);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZLoa;I)Lxa;")
    public final class424 method3742(byte arg0, boolean arg1, class689 arg2, int arg3) {
        field9597++;
        long var5 = (long) (arg2.field9733 << 19 | (arg1 ? 262144 : 0) | this.field9599 | arg3 << 16);
        if (arg0 != -127) {
            this.field9603 = null;
        }
        class424 var7 = (class424) this.field9603.field1896.method3134(var5, -102);
        if (var7 != null) {
            return var7;
        } else if (this.field9603.field1892.method1086((byte) 122, this.field9599)) {
            class366 var8 = class366.method2245(this.field9603.field1892, this.field9599, 0);
            if (var8 != null) {
                var8.field5249 = var8.field5250 = var8.field5254 = var8.field5251 = 0;
                if (arg1) {
                    var8.method2246();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2250();
                }
            }
            class424 var10 = arg2.method1951(var8, true);
            if (var10 != null) {
                this.field9603.field1896.method3130(var5, true, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILdga;)V")
    private final void method3743(int arg0, int arg1, class138 arg2) {
        field9601++;
        if (arg0 != 10745) {
            return;
        }
        if (arg1 == 1) {
            this.field9599 = arg2.method922((byte) -126);
        } else if (arg1 == 2) {
            this.field9605 = arg2.method904(126);
            return;
        } else if (arg1 == 3) {
            this.field9602 = true;
            return;
        } else if (arg1 == 4) {
            this.field9599 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLdga;)V")
    public final void method3744(byte arg0, class138 arg1) {
        while (true) {
            int var3 = arg1.method957((byte) -81);
            if (var3 == 0) {
                int var4 = -90 % ((arg0 + 58) / 39);
                field9604++;
                return;
            }
            this.method3743(10745, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
    public static void method3745(int arg0) {
        field9600 = null;
        field9607 = null;
        if (arg0 != 1) {
            method3745(75);
        }
    }
}
