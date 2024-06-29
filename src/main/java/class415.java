import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class415 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lpn;")
    private class66 field5748;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lee;")
    private class442 field5749;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Ln;")
    private class25 field5755;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Z")
    public static boolean field5752 = false;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lrg;")
    private class366 field5746;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
    public static int[] field5756;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lgo;")
    private class177[] field5744;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2560(int arg0) {
        if (arg0 < 41) {
            this.method2562(33, (class258) null, (class258) null, true, (byte) 57);
        }
        field5754++;
        if (this.field5746 != null) {
            return true;
        }
        if (this.field5755 == null) {
            if (this.field5748.method529(false)) {
                return false;
            }
            this.field5755 = this.field5748.method537((byte) 0, true, 255, -108, 255);
        }
        if (this.field5755.field484) {
            return false;
        } else {
            this.field5746 = new class366(this.field5755.method154(true));
            this.field5744 = new class177[(this.field5746.field5076.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnf;Lnf;II)Lgo;", line = 34)
    public final class177 method2561(class258 arg0, class258 arg1, int arg2, int arg3) {
        if (arg3 > -7) {
            this.method2564(-50);
        }
        field5745++;
        return this.method2562(arg2, arg1, arg0, true, (byte) 28);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILnf;Lnf;ZB)Lgo;", line = 45)
    private final class177 method2562(int arg0, class258 arg1, class258 arg2, boolean arg3, byte arg4) {
        field5753++;
        if (this.field5746 == null) {
            throw new RuntimeException();
        }
        this.field5746.field5048 = arg0 * 8 + 5;
        if (this.field5746.field5048 >= this.field5746.field5076.length) {
            throw new RuntimeException();
        }
        if (arg4 != 28) {
            this.method2564(-22);
        }
        if (this.field5744[arg0] != null) {
            return this.field5744[arg0];
        }
        int var6 = this.field5746.method2258(1177515464);
        int var7 = this.field5746.method2258(arg4 + 1177515436);
        class177 var8 = new class177(arg0, arg2, arg1, this.field5748, this.field5749, var6, var7, arg3);
        this.field5744[arg0] = var8;
        return var8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 84)
    public static void method2563(byte arg0) {
        if (arg0 > -118) {
            method2563((byte) -44);
        }
        field5756 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 103)
    public final void method2564(int arg0) {
        field5750++;
        if (this.field5744 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5744.length; var2++) {
            if (this.field5744[var2] != null) {
                this.field5744[var2].method1259(arg0 + 5);
            }
        }
        for (int var3 = 0; var3 < this.field5744.length; var3++) {
            if (this.field5744[var3] != null) {
                this.field5744[var3].method1260(true);
            }
        }
        if (arg0 != -6) {
            method2566(-17, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lap;", line = 150)
    public static final class290 method2565(int arg0, int arg1) {
        field5751++;
        class290 var2 = (class290) class254.field3518.method2529(arg0 ^ arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field93.method1926(0, arg1, 1);
        class290 var4 = new class290();
        if (var3 != null) {
            var4.method1781(arg0 ^ 0x6C1, arg1, new class366(var3));
        }
        class254.field3518.method2527(-93, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lpn;Lee;)V", line = 170)
    public class415(class66 arg0, class442 arg1) {
        this.field5748 = arg0;
        this.field5749 = arg1;
        if (!this.field5748.method529(false)) {
            this.field5755 = this.field5748.method537((byte) 0, true, 255, 104, 255);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 182)
    public static final String[] method2566(int arg0, String[] arg1) {
        field5747++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0 != 255) {
            return null;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
            var3++;
        }
        return var2;
    }
}
