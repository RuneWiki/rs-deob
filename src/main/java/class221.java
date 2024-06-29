import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class221 extends class248 {

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Lod;")
    public static class127 field3718 = new class127(128);

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "[J")
    public static long[] field3720 = new long[1000];

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Lij;")
    public static class50 field3721 = class78.method578(127, "Wordpack geladen)3");

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Lpe;")
    public static class100 field3722 = new class100(64);

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Lv;")
    public static class143 field3707;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lij;")
    public class50 field3706;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "Ldb;")
    public static class58 field3725;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "Z")
    public static boolean field3726;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
    public int[] field3709;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[I")
    public int[] field3711;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "[I")
    public int[] field3712;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "[I")
    public int[] field3713;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method1512(int arg0) {
        field3725 = null;
        field3707 = null;
        field3720 = null;
        int var1 = 34 / ((51 - arg0) / 52);
        field3718 = null;
        field3721 = null;
        field3722 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method1513(byte arg0) {
        if (this.field3711 != null) {
            for (int var2 = 0; var2 < this.field3711.length; var2++) {
                this.field3711[var2] = class29.method261(this.field3711[var2], 32768);
            }
        }
        if (arg0 != -128) {
            return;
        }
        field3714++;
        if (this.field3709 != null) {
            for (int var3 = 0; var3 < this.field3709.length; var3++) {
                this.field3709[var3] = class29.method261(this.field3709[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
    public final int method1514(int arg0, int arg1) {
        field3710++;
        if (this.field3711 == null) {
            return -1;
        } else if (arg1 == -1921) {
            for (int var3 = 0; var3 < this.field3711.length; var3++) {
                if (this.field3712[var3] == arg0) {
                    return this.field3711[var3];
                }
            }
            return -1;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)Lwd;")
    public static final class217 method1515(int arg0) {
        class217 var1 = new class217(24);
        var1.method1471(2, (byte) 24);
        field3715++;
        var1.method1471(class99.field1828, (byte) 24);
        var1.method1471(class193.field3208 ? 1 : 0, (byte) 24);
        if (arg0 != 1) {
            method1512(-57);
        }
        var1.method1471(class193.field3211 ? 1 : 0, (byte) 24);
        var1.method1471(class172.field2878 ? 1 : 0, (byte) 24);
        var1.method1471(class21.field459 ? 1 : 0, (byte) 24);
        var1.method1471(class44.field808 ? 1 : 0, (byte) 24);
        var1.method1471(class56.field998 ? 1 : 0, (byte) 24);
        var1.method1471(class146.field2530 ? 1 : 0, (byte) 24);
        var1.method1471(class76.field1440 ? 1 : 0, (byte) 24);
        var1.method1471(class83.field1556, (byte) 24);
        var1.method1471(client.field1525 ? 1 : 0, (byte) 24);
        var1.method1471(class70.field1344 ? 1 : 0, (byte) 24);
        var1.method1471(class126.field2210 ? 1 : 0, (byte) 24);
        var1.method1471(class170.field2841, (byte) 24);
        var1.method1471(class5.field68 ? 1 : 0, (byte) 24);
        var1.method1471(class196.field3249, (byte) 24);
        var1.method1471(class66.field1260, (byte) 24);
        var1.method1471(class203.field3379, (byte) 24);
        var1.method1494(class241.field4146, (byte) -80);
        var1.method1494(class87.field1682, (byte) -114);
        return var1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lwd;I)V")
    public final void method1516(class217 arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        field3708++;
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method1517(arg0, var3, 83);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lwd;II)V")
    private final void method1517(class217 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3706 = arg0.method1469((byte) -82);
        } else if (arg1 == 2) {
            int var7 = arg0.method1487(255);
            this.field3709 = new int[var7];
            this.field3713 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3709[var8] = arg0.method1441(100);
                int var10 = arg0.method1487(255);
                if (var10 == 0) {
                    this.field3713[var8] = -1;
                } else {
                    this.field3713[var8] = var10;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1487(255);
            this.field3711 = new int[var4];
            this.field3712 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3711[var5] = arg0.method1441(109);
                int var6 = arg0.method1487(255);
                if (var6 == 0) {
                    this.field3712[var5] = -1;
                } else {
                    this.field3712[var5] = var6;
                }
            }
        }
        field3717++;
        int var9 = 98 / ((arg2 - 48) / 34);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)I")
    public final int method1518(int arg0, byte arg1) {
        field3719++;
        if (this.field3709 == null) {
            return -1;
        }
        if (arg1 > -74) {
            this.method1516((class217) null, 15);
        }
        for (int var3 = 0; var3 < this.field3709.length; var3++) {
            if (this.field3713[var3] == arg0) {
                return this.field3709[var3];
            }
        }
        return -1;
    }
}
