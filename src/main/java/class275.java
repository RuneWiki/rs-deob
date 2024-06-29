import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class275 extends class308 {

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field4526 = 0;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field4534 = -1;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field4530 = -1;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Z")
    public boolean field4540 = true;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public int field4535 = 12800;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public int field4538 = 0;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public int field4536 = 12800;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Ljava/lang/String;")
    public String field4541;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Ljava/lang/String;")
    public String field4525;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Ljo;")
    public class150 field4537;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "[J")
    public static long[] field4528 = new long[256];

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4523 = "wave2:";

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[I")
    public static int[] field4547;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "Lbg;")
    public static class216 field4544;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "[[[Ljj;")
    public static class50[][][] field4546;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[III)Z", line = 4)
    public final boolean method1962(int arg0, int[] arg1, int arg2, int arg3) {
        field4545++;
        if (arg2 != 12800) {
            field4523 = (String) null;
        }
        for (class196 var5 = (class196) this.field4537.method1081(arg2 ^ 0xFFFFCDAB); var5 != null; var5 = (class196) this.field4537.method1083((byte) 113)) {
            if (var5.method1336(arg3, arg0, (byte) -99)) {
                var5.method1338(113, arg3, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([IIIII)Z", line = 29)
    public final boolean method1963(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field4532++;
        for (class196 var6 = (class196) this.field4537.method1081(-80); var6 != null; var6 = (class196) this.field4537.method1083((byte) 113)) {
            if (var6.method1335(arg1, arg3, 127, arg2)) {
                var6.method1341(arg1, true, arg0, arg2);
                return true;
            }
        }
        int var7 = -51 % ((-arg4 - 32) / 48);
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IB)Z", line = 63)
    public final boolean method1964(int arg0, int arg1, int[] arg2, byte arg3) {
        field4542++;
        if (arg3 != 121) {
            this.method1966(-33, 106, 117);
        }
        for (class196 var5 = (class196) this.field4537.method1081(arg3 ^ 0xFFFFFFED); var5 != null; var5 = (class196) this.field4537.method1083((byte) 113)) {
            if (var5.method1337(arg0, arg1, arg3 - 39)) {
                var5.method1341(arg1, true, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V", line = 89)
    public static void method1965(int arg0) {
        field4528 = null;
        field4523 = null;
        field4546 = (class50[][][]) null;
        field4547 = null;
        field4544 = null;
        if (arg0 != 12800) {
            method1965(102);
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)Z", line = 103)
    public final boolean method1966(int arg0, int arg1, int arg2) {
        field4527++;
        class196 var4 = (class196) this.field4537.method1081(103);
        if (arg1 != 0) {
            field4544 = (class216) null;
        }
        while (var4 != null) {
            if (var4.method1337(arg2, arg0, 114)) {
                return true;
            }
            var4 = (class196) this.field4537.method1083((byte) 113);
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 235)
    public class275(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4524 = arg0;
        this.field4530 = arg4;
        this.field4541 = arg2;
        this.field4540 = arg5;
        this.field4529 = arg3;
        this.field4525 = arg1;
        this.field4534 = arg6;
        if (this.field4534 == 255) {
            this.field4534 = 0;
        }
        this.field4537 = new class150();
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4528[var0] = var1;
        }
        field4547 = new int[50];
        field4544 = new class216();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 140)
    public final void method1967(byte arg0) {
        int var2 = 49 % ((arg0 + 23) / 33);
        this.field4526 = 0;
        this.field4536 = 12800;
        field4531++;
        this.field4535 = 12800;
        this.field4538 = 0;
        for (class196 var3 = (class196) this.field4537.method1081(93); var3 != null; var3 = (class196) this.field4537.method1083((byte) 113)) {
            if (var3.field3000 < this.field4535) {
                this.field4535 = var3.field3000;
            }
            if (this.field4536 > var3.field2997) {
                this.field4536 = var3.field2997;
            }
            if (this.field4526 < var3.field2999) {
                this.field4526 = var3.field2999;
            }
            if (var3.field3011 > this.field4538) {
                this.field4538 = var3.field3011;
            }
        }
    }
}
