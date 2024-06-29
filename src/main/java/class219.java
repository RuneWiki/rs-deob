import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class219 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lid;")
    private class287 field3636;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lbo;")
    private class347 field3631;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lcg;")
    private class50 field3628;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
    public static int[] field3642 = new int[5];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Loe;")
    private class146 field3635;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[Lfc;")
    private class250[] field3641;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILma;ILma;)Lfc;", line = 7)
    public final class250 method1521(int arg0, class318 arg1, int arg2, class318 arg3) {
        field3639++;
        return arg0 < 115 ? (class250) null : this.method1529(arg3, true, arg1, arg2, 61);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 19)
    public static final void method1522(int arg0, int arg1) {
        field3643++;
        if (!class267.method1874(arg0, (byte) 12)) {
            return;
        }
        class181[] var2 = class178.field2938[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            if (var4 != null) {
                var4.field3010 = 1;
                var4.field3102 = 0;
                var4.field3100 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I", line = 56)
    public static final int method1523(int arg0, int arg1) {
        if (arg0 >= -2) {
            return -14;
        } else {
            field3633++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 67)
    public final void method1524(int arg0) {
        field3630++;
        if (this.field3641 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3641.length; var2++) {
            if (this.field3641[var2] != null) {
                this.field3641[var2].method1762(arg0 ^ 0x0);
            }
        }
        for (int var3 = arg0; var3 < this.field3641.length; var3++) {
            if (this.field3641[var3] != null) {
                this.field3641[var3].method1759((byte) -1);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V", line = 103)
    public static final void method1525(int arg0, int arg1) {
        class199 var2 = class173.method1231(false, arg1, arg0);
        field3629++;
        var2.method1358(-1);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 115)
    public static final void method1526(int arg0) {
        if (arg0 != 256) {
            method1528((byte) -79);
        }
        if (class223.field3690 == null || class107.field1937 == null) {
            class223.field3690 = new int[256];
            class107.field1937 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class223.field3690[var1] = (int) (Math.sin(var2) * 4096.0D);
                class107.field1937[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3632++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Z", line = 146)
    public final boolean method1527(byte arg0) {
        field3637++;
        if (this.field3635 != null) {
            return true;
        }
        int var2 = -1 / ((41 - arg0) / 62);
        if (this.field3628 == null) {
            if (this.field3631.method2482(512)) {
                return false;
            }
            this.field3628 = this.field3631.method2485(0, (byte) 0, 255, 255, true);
        }
        if (this.field3628.field1243) {
            return false;
        } else {
            this.field3635 = new class146(this.field3628.method442(116));
            this.field3641 = new class250[(this.field3635.field2496.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 179)
    public static void method1528(byte arg0) {
        if (arg0 == 0) {
            field3642 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lma;ZLma;II)Lfc;", line = 189)
    private final class250 method1529(class318 arg0, boolean arg1, class318 arg2, int arg3, int arg4) {
        field3638++;
        if (this.field3635 == null) {
            throw new RuntimeException();
        }
        this.field3635.field2435 = arg3 * 8 + 5;
        if (arg4 < 35) {
            return (class250) null;
        } else if (this.field3635.field2496.length <= this.field3635.field2435) {
            throw new RuntimeException();
        } else if (this.field3641[arg3] == null) {
            int var6 = this.field3635.method1004(3);
            int var7 = this.field3635.method1004(3);
            class250 var8 = new class250(arg3, arg0, arg2, this.field3631, this.field3636, var6, var7, arg1);
            this.field3641[arg3] = var8;
            return var8;
        } else {
            return this.field3641[arg3];
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lbo;Lid;)V", line = 231)
    public class219(class347 arg0, class287 arg1) {
        this.field3636 = arg1;
        this.field3631 = arg0;
        if (!this.field3631.method2482(512)) {
            this.field3628 = this.field3631.method2485(0, (byte) 0, 255, 255, true);
        }
    }
}
