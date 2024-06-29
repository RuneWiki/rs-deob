import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class487 extends class413 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field7108;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field7111;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public int field7113;

    @OriginalMember(owner = "client!cj", name = "YA", descriptor = "(I)V", line = 6)
    public final void method999(int arg0) {
        this.field7105 = 32768;
        this.field7102 = this.field7103 = class324.field4974[arg0 & 0x3FFF];
        this.field7111 = class324.field4966[arg0 & 0x3FFF];
        this.field7106 = -this.field7111;
        this.field7108 = this.field7109 = this.field7112 = this.field7110 = this.field7104 = this.field7107 = this.field7113 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "(I)V", line = 15)
    public final void method1007(int arg0) {
        this.field7102 = 32768;
        this.field7105 = this.field7103 = class324.field4974[arg0 & 0x3FFF];
        this.field7109 = class324.field4966[arg0 & 0x3FFF];
        this.field7107 = -this.field7109;
        this.field7108 = this.field7112 = this.field7110 = this.field7106 = this.field7104 = this.field7111 = this.field7113 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "(IIIIII)V", line = 23)
    public final void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class324.field4974[arg3 & 0x3FFF];
        int var8 = class324.field4966[arg3 & 0x3FFF];
        int var9 = class324.field4974[arg4 & 0x3FFF];
        int var10 = class324.field4966[arg4 & 0x3FFF];
        int var11 = class324.field4974[arg5 & 0x3FFF];
        int var12 = class324.field4966[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field7105 = var9 * var11 + var10 * var14 >> 15;
        this.field7110 = -var9 * var12 + var10 * var13 >> 15;
        this.field7107 = var7 * var10 >> 15;
        this.field7108 = var7 * var12 >> 15;
        this.field7102 = var7 * var11 >> 15;
        this.field7111 = -var8;
        this.field7109 = -var10 * var11 + var9 * var14 >> 15;
        this.field7106 = var9 * var13 + var10 * var12 >> 15;
        this.field7103 = var7 * var9 >> 15;
        this.field7112 = -arg0 * this.field7105 - this.field7108 * arg1 - this.field7109 * arg2 >> 15;
        this.field7104 = -arg0 * this.field7110 - this.field7102 * arg1 - this.field7106 * arg2 >> 15;
        this.field7113 = -arg0 * this.field7107 - this.field7111 * arg1 - this.field7103 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!cj", name = "ba", descriptor = "(Lia;)V", line = 53)
    public final void method995(class413 arg0) {
        class487 var2 = (class487) arg0;
        this.field7105 = var2.field7105;
        this.field7108 = var2.field7108;
        this.field7109 = var2.field7109;
        this.field7112 = var2.field7112;
        this.field7110 = var2.field7110;
        this.field7102 = var2.field7102;
        this.field7106 = var2.field7106;
        this.field7104 = var2.field7104;
        this.field7107 = var2.field7107;
        this.field7111 = var2.field7111;
        this.field7103 = var2.field7103;
        this.field7113 = var2.field7113;
    }

    @OriginalMember(owner = "client!cj", name = "ZA", descriptor = "(III)V", line = 69)
    public final void method1004(int arg0, int arg1, int arg2) {
        this.field7112 += arg0;
        this.field7104 += arg1;
        this.field7113 += arg2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()Lia;", line = 77)
    public final class413 method1002() {
        class487 var1 = new class487();
        var1.field7105 = this.field7105;
        var1.field7108 = this.field7108;
        var1.field7109 = this.field7109;
        var1.field7112 = this.field7112;
        var1.field7110 = this.field7110;
        var1.field7102 = this.field7102;
        var1.field7106 = this.field7106;
        var1.field7104 = this.field7104;
        var1.field7107 = this.field7107;
        var1.field7111 = this.field7111;
        var1.field7103 = this.field7103;
        var1.field7113 = this.field7113;
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 97)
    public final void method996(int arg0) {
        int var2 = class324.field4974[arg0 & 0x3FFF];
        int var3 = class324.field4966[arg0 & 0x3FFF];
        int var4 = this.field7105;
        int var5 = this.field7108;
        int var6 = this.field7109;
        int var7 = this.field7112;
        this.field7105 = this.field7107 * var3 + var2 * var4 >> 15;
        this.field7107 = this.field7107 * var2 - var3 * var4 >> 15;
        this.field7108 = this.field7111 * var3 + var2 * var5 >> 15;
        this.field7111 = this.field7111 * var2 - var3 * var5 >> 15;
        this.field7109 = this.field7103 * var3 + var2 * var6 >> 15;
        this.field7103 = this.field7103 * var2 - var3 * var6 >> 15;
        this.field7112 = this.field7113 * var3 + var2 * var7 >> 15;
        this.field7113 = this.field7113 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cj", name = "na", descriptor = "(I)V", line = 119)
    public final void method994(int arg0) {
        int var2 = class324.field4974[arg0 & 0x3FFF];
        int var3 = class324.field4966[arg0 & 0x3FFF];
        int var4 = this.field7110;
        int var5 = this.field7102;
        int var6 = this.field7106;
        int var7 = this.field7104;
        this.field7110 = var2 * var4 - this.field7107 * var3 >> 15;
        this.field7107 = this.field7107 * var2 + var3 * var4 >> 15;
        this.field7102 = var2 * var5 - this.field7111 * var3 >> 15;
        this.field7111 = this.field7111 * var2 + var3 * var5 >> 15;
        this.field7106 = var2 * var6 - this.field7103 * var3 >> 15;
        this.field7103 = this.field7103 * var2 + var3 * var6 >> 15;
        this.field7104 = var2 * var7 - this.field7113 * var3 >> 15;
        this.field7113 = this.field7113 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cj", name = "HA", descriptor = "()V", line = 141)
    public final void method1003() {
        this.field7110 = this.field7107 = this.field7108 = this.field7111 = this.field7109 = this.field7106 = this.field7112 = this.field7104 = this.field7113 = 0;
        this.field7105 = this.field7102 = this.field7103 = 32768;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[I)V", line = 145)
    public final void method997(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field7109 * arg2 + this.field7108 * arg1 + this.field7105 * arg0 >> 15) + this.field7112;
        arg3[1] = (this.field7106 * arg2 + this.field7110 * arg0 + this.field7102 * arg1 >> 15) + this.field7104;
        arg3[2] = (this.field7103 * arg2 + this.field7111 * arg1 + this.field7107 * arg0 >> 15) + this.field7113;
    }

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "(III[I)V", line = 150)
    public final void method993(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field7109 * arg2 + this.field7108 * arg1 + this.field7105 * arg0 >> 15;
        arg3[1] = this.field7106 * arg2 + this.field7110 * arg0 + this.field7102 * arg1 >> 15;
        arg3[2] = this.field7103 * arg2 + this.field7111 * arg1 + this.field7107 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "([I)V", line = 157)
    public final void method1005(int[] arg0) {
        int var2 = arg0[0] - this.field7112;
        int var3 = arg0[1] - this.field7104;
        int var4 = arg0[2] - this.field7113;
        arg0[0] = this.field7107 * var4 + this.field7110 * var3 + this.field7105 * var2 >> 15;
        arg0[1] = this.field7111 * var4 + this.field7108 * var2 + this.field7102 * var3 >> 15;
        arg0[2] = this.field7103 * var4 + this.field7109 * var2 + this.field7106 * var3 >> 15;
    }

    @OriginalMember(owner = "client!cj", name = "ma", descriptor = "(I)V", line = 167)
    public final void method998(int arg0) {
        this.field7103 = 32768;
        this.field7105 = this.field7102 = class324.field4974[arg0 & 0x3FFF];
        this.field7110 = class324.field4966[arg0 & 0x3FFF];
        this.field7108 = -this.field7110;
        this.field7109 = this.field7112 = this.field7106 = this.field7104 = this.field7107 = this.field7111 = this.field7113 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "(III)V", line = 176)
    public final void method1008(int arg0, int arg1, int arg2) {
        this.field7110 = this.field7107 = this.field7108 = this.field7111 = this.field7109 = this.field7106 = 0;
        this.field7105 = this.field7102 = this.field7103 = 32768;
        this.field7112 = arg0;
        this.field7104 = arg1;
        this.field7113 = arg2;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 182)
    public class487() {
        this.method1003();
    }
}
