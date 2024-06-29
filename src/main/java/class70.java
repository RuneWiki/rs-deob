import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class70 {

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Ldc;")
    private class5 field1033 = new class5(64);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lhe;")
    private class239 field1025;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[B")
    public static byte[] field1030 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lgn;")
    public static class475 field1032 = new class475(75, 3);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Lhe;")
    public static class239 field1035;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lup;", line = 3)
    public final class171 method473(int arg0, byte arg1) {
        field1034++;
        if (arg1 > -64) {
            return null;
        }
        class5 var3 = this.field1033;
        class171 var4;
        synchronized (this.field1033) {
            var4 = (class171) this.field1033.method40(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1025.method1470(4, arg0, 32);
        class171 var6 = new class171();
        if (var5 != null) {
            var6.method1079(new class156(var5), 124);
        }
        class5 var7 = this.field1033;
        synchronized (this.field1033) {
            this.field1033.method36(-20960, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILbn;)V", line = 30)
    public static final void method474(int arg0, class294 arg1) {
        field1024++;
        int var2 = arg1.field4225 - class263.field3748;
        int var3 = arg1.field4181 * 128 + arg1.method1773(-48) * 64;
        int var4 = arg1.field4202 * 128 + arg1.method1773(-101) * 64;
        arg1.field2966 += (var4 - arg1.field2966) / var2;
        if (arg0 != 11377) {
            method475((byte) 55);
        }
        arg1.field4275 = 0;
        arg1.field2959 += (var3 - arg1.field2959) / var2;
        if (arg1.field4237 == 0) {
            arg1.method1775((byte) -58, 8192);
        }
        if (arg1.field4237 == 1) {
            arg1.method1775((byte) -94, 12288);
        }
        if (arg1.field4237 == 2) {
            arg1.method1775((byte) 116, 0);
        }
        if (arg1.field4237 == 3) {
            arg1.method1775((byte) -124, 4096);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 64)
    public static void method475(byte arg0) {
        field1030 = null;
        field1035 = null;
        int var1 = 117 / ((28 - arg0) / 51);
        field1032 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 77)
    public final void method476(int arg0, int arg1) {
        class5 var3 = this.field1033;
        synchronized (this.field1033) {
            this.field1033.method39(false, arg1);
            if (arg0 != 1118821096) {
                method474(4, null);
            }
        }
        field1027++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)I", line = 93)
    public static final int method477(int arg0, boolean arg1) {
        field1023++;
        if (arg1) {
            return 52;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 116)
    public final void method478(byte arg0) {
        field1028++;
        class5 var2 = this.field1033;
        synchronized (this.field1033) {
            this.field1033.method35((byte) -1);
        }
        if (arg0 != -16) {
            this.method473(25, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V", line = 140)
    public final void method479(byte arg0) {
        class5 var2 = this.field1033;
        synchronized (this.field1033) {
            this.field1033.method38((byte) -39);
        }
        field1031++;
        if (arg0 != -112) {
            this.method478((byte) -32);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 164)
    public class70(class298 arg0, int arg1, class239 arg2) {
        this.field1025 = arg2;
        this.field1025.method1473(4309, 32);
    }
}
