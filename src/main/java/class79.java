import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lij;")
    private class195 field1474;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Ldc;")
    private class235 field1471;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Log;")
    private class220 field1476;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lhg;")
    public static class177 field1470;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lee;")
    private class280 field1479;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[Lpd;")
    private class57[] field1481;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILah;Lah;IZ)Lpd;")
    private final class57 method545(int arg0, class277 arg1, class277 arg2, int arg3, boolean arg4) {
        field1477++;
        if (this.field1479 == null) {
            throw new RuntimeException();
        }
        this.field1479.field5027 = arg0 * 8 + 5;
        if (this.field1479.field5027 >= this.field1479.field5011.length) {
            throw new RuntimeException();
        } else if (this.field1481[arg0] == null) {
            int var6 = this.field1479.method1872(103);
            int var7 = this.field1479.method1872(101);
            if (arg3 <= 75) {
                this.method547((byte) -10);
            }
            class57 var8 = new class57(arg0, arg2, arg1, this.field1474, this.field1471, var6, var7, arg4);
            this.field1481[arg0] = var8;
            return var8;
        } else {
            return this.field1481[arg0];
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method546(int arg0) {
        if (arg0 == 5821) {
            field1470 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method547(byte arg0) {
        field1475++;
        if (this.field1479 != null) {
            return true;
        } else if (arg0 < 91) {
            return false;
        } else {
            if (this.field1476 == null) {
                if (this.field1474.method1389(true)) {
                    return false;
                }
                this.field1476 = this.field1474.method1406(-292567952, 255, 255, true, (byte) 0);
            }
            if (this.field1476.field343) {
                return false;
            } else {
                this.field1479 = new class280(this.field1476.method144(-24385));
                this.field1481 = new class57[(this.field1479.field5011.length - 5) / 8];
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public final void method548(byte arg0) {
        field1480++;
        if (this.field1481 == null || arg0 != 127) {
            return;
        }
        for (int var2 = 0; var2 < this.field1481.length; var2++) {
            if (this.field1481[var2] != null) {
                this.field1481[var2].method323(0);
            }
        }
        for (int var3 = 0; var3 < this.field1481.length; var3++) {
            if (this.field1481[var3] != null) {
                this.field1481[var3].method321(125);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final void method549(byte arg0) {
        field1478++;
        if (arg0 >= -110) {
            method549((byte) -7);
        }
        class11.field149.method294(0);
        class247.field4447.method294(0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILah;ILah;)Lpd;")
    public final class57 method550(int arg0, class277 arg1, int arg2, class277 arg3) {
        if (arg0 != 255) {
            this.method545(-1, (class277) null, (class277) null, -21, true);
        }
        field1472++;
        return this.method545(arg2, arg3, arg1, arg0 ^ 0xA4, true);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lij;Ldc;)V")
    public class79(class195 arg0, class235 arg1) {
        this.field1474 = arg0;
        this.field1471 = arg1;
        if (!this.field1474.method1389(true)) {
            this.field1476 = this.field1474.method1406(-292567952, 255, 255, true, (byte) 0);
        }
    }
}
