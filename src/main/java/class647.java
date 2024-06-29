import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class647 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field9014;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[Lbo;")
    private class28[] field9015;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9019 = new BigInteger("a12820b1d6a4e014a5e1dd5efa6bde9b954ce5bc374dd16bbecd6913e768bc36c4153b6b12662f13352ad50423b3aef8070e62560ef9b5c46e7485412b1211fc46b603e5fa7fec712d7a1f1734ad77196851281d650d3213c0b102535ab7111da6fea314a18e757b40b1865848de145a5ad3b82fb15577c02e0d5c4f4df28e8e1f8a683c4961f55f4659a78a6ae4902a075b7cd1f9a2b50906b459d9235afa5c36b84f7b2c75582055ebede7362b34185f152cc8e1ada730e173b11164c35d2981dfda9add475ec799f95209117c9f76a4ab6482e9ac03fccd2a76b73dd8376fedb3630a987818e9897e0ca1a45842d07f3ddff7b45fb9250a73b4f4c08648973e52e5d0b7a737bba345e317f043d646479bcdad3466991c5cd7dcbd31a04af523658416a72b02f290080795e69bf16dc2563d8f5bf0bb6f99668033a705a4d2ea19397674978ff46ee71b218bf77903698225982889261279ac11e85a29e17f59d11b4af0dbf0c10fc9f0ba7bbff4f22e691212b17ad01c23adbe462109e19a8d0a7c67c8bf071bbf1cab5fc364e8cf370fb9e46c31d418c893cebb747775532b3468e51a0419cc63edab940ec0fa7ac63b0f9f5e2e1706c911415643a3822745c25878f038a225f336ec5471f483fa078c7ee1f3b4737b4b061129c2d495cec8e914b530e4d41b3a6895d5bbcc1701d8516613d1a2e3d29685864a354b79bb", 16);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "J")
    private long field9017;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lbo;")
    private class28 field9020;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lpe;")
    public static class615 field9016;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lbo;JI)V", line = 3)
    public final void method3558(class28 arg0, long arg1, int arg2) {
        if (arg2 < 108) {
            method3560((byte) -115);
        }
        if (arg0.field439 != null) {
            arg0.method237((byte) -115);
        }
        field9022++;
        class28 var5 = this.field9015[(int) ((long) (this.field9014 - 1) & arg1)];
        arg0.field439 = var5.field439;
        arg0.field438 = var5;
        arg0.field439.field438 = arg0;
        arg0.field437 = arg1;
        arg0.field438.field439 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 28)
    public static void method3559(int arg0) {
        if (arg0 != 1) {
            field9016 = null;
        }
        field9016 = null;
        field9019 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 48)
    public static final void method3560(byte arg0) {
        field9021++;
        class106.method784((byte) -91);
        if (arg0 >= -51) {
            field9016 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lbo;", line = 61)
    public final class28 method3561(int arg0) {
        field9024++;
        if (arg0 != 22890) {
            this.field9015 = null;
        }
        if (this.field9020 == null) {
            return null;
        }
        class28 var2 = this.field9015[(int) (this.field9017 & (long) (this.field9014 - 1))];
        while (this.field9020 != var2) {
            if (this.field9020.field437 == this.field9017) {
                class28 var3 = this.field9020;
                this.field9020 = this.field9020.field438;
                return var3;
            }
            this.field9020 = this.field9020.field438;
        }
        this.field9020 = null;
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 94)
    public static final void method3562(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        if (arg2 != 8192) {
            return;
        }
        field9023++;
        class659 var9 = class32.field471[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class32.field471[var10] = class32.field471[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class659(arg7, arg0, arg5, arg6, arg8, arg1, arg4, arg3);
        } else {
            var9.method3623(arg6, arg4, arg3, arg0, arg8, arg1, arg7, (byte) 80, arg5);
        }
        class698.field9646++;
        class32.field471[0] = var9;
        class415.field5339 = class166.field2089;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)Lbo;", line = 122)
    public final class28 method3563(long arg0, int arg1) {
        field9018++;
        this.field9017 = arg0;
        class28 var4 = this.field9015[(int) (arg0 & (long) (this.field9014 - 1))];
        this.field9020 = var4.field438;
        if (arg1 > -63) {
            method3562(16, null, -45, null, 76, null, null, 37, null);
        }
        while (this.field9020 != var4) {
            if (this.field9020.field437 == arg0) {
                class28 var5 = this.field9020;
                this.field9020 = this.field9020.field438;
                return var5;
            }
            this.field9020 = this.field9020.field438;
        }
        this.field9020 = null;
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lwk;B)V", line = 158)
    public static final void method3564(class227 arg0, byte arg1) {
        field9013++;
        int var2 = arg0.field2973 - class424.field5503;
        int var3 = -12 / ((-arg1 - 63) / 57);
        int var4 = arg0.field3024 * 512 + (arg0.method1265(67) * 256);
        int var5 = arg0.field2964 * 512 + arg0.method1265(81) * 256;
        arg0.field506 += (var4 - arg0.field506) / var2;
        arg0.field3036 = 0;
        arg0.field503 += (var5 - arg0.field503) / var2;
        if (arg0.field2953 == 0) {
            arg0.method1429(8192, (byte) -84);
        }
        if (arg0.field2953 == 1) {
            arg0.method1429(12288, (byte) -84);
        }
        if (arg0.field2953 == 2) {
            arg0.method1429(0, (byte) -84);
        }
        if (arg0.field2953 == 3) {
            arg0.method1429(4096, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V", line = 191)
    public class647(int arg0) {
        this.field9014 = arg0;
        this.field9015 = new class28[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class28 var3 = this.field9015[var2] = new class28();
            var3.field438 = var3;
            var3.field439 = var3;
        }
    }
}
