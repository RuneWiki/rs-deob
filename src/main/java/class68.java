import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class68 extends class496 {

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()V")
    public final void method195() {
        this.field1103 = this.field1106 = this.field1097 = this.field1102 = this.field1105 = this.field1098 = this.field1104 = this.field1099 = this.field1101 = 0;
        this.field1107 = this.field1108 = this.field1100 = 32768;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lql;)V")
    public final void method187(class496 arg0) {
        class68 var2 = (class68) arg0;
        this.field1107 = var2.field1107;
        this.field1097 = var2.field1097;
        this.field1105 = var2.field1105;
        this.field1104 = var2.field1104;
        this.field1103 = var2.field1103;
        this.field1108 = var2.field1108;
        this.field1098 = var2.field1098;
        this.field1099 = var2.field1099;
        this.field1106 = var2.field1106;
        this.field1102 = var2.field1102;
        this.field1100 = var2.field1100;
        this.field1101 = var2.field1101;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(III[I)V")
    public final void method186(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1105 * arg2 + this.field1107 * arg0 + this.field1097 * arg1 >> 15) + this.field1104;
        arg3[1] = (this.field1098 * arg2 + this.field1108 * arg1 + this.field1103 * arg0 >> 15) + this.field1099;
        arg3[2] = (this.field1100 * arg2 + this.field1106 * arg0 + this.field1102 * arg1 >> 15) + this.field1101;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(III)V")
    public final void method198(int arg0, int arg1, int arg2) {
        this.field1103 = this.field1106 = this.field1097 = this.field1102 = this.field1105 = this.field1098 = 0;
        this.field1107 = this.field1108 = this.field1100 = 32768;
        this.field1104 = arg0;
        this.field1099 = arg1;
        this.field1101 = arg2;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(III)V")
    public final void method201(int arg0, int arg1, int arg2) {
        this.field1104 += arg0;
        this.field1099 += arg1;
        this.field1101 += arg2;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
    public final void method199(int arg0) {
        int var2 = class195.field3077[arg0 & 0x3FFF];
        int var3 = class195.field3075[arg0 & 0x3FFF];
        int var4 = this.field1103;
        int var5 = this.field1108;
        int var6 = this.field1098;
        int var7 = this.field1099;
        this.field1103 = var2 * var4 - this.field1106 * var3 >> 15;
        this.field1106 = this.field1106 * var2 + var3 * var4 >> 15;
        this.field1108 = var2 * var5 - this.field1102 * var3 >> 15;
        this.field1102 = this.field1102 * var2 + var3 * var5 >> 15;
        this.field1098 = var2 * var6 - this.field1100 * var3 >> 15;
        this.field1100 = this.field1100 * var2 + var3 * var6 >> 15;
        this.field1099 = var2 * var7 - this.field1101 * var3 >> 15;
        this.field1101 = this.field1101 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public final void method194(int arg0) {
        this.field1108 = 32768;
        this.field1107 = this.field1100 = class195.field3077[arg0 & 0x3FFF];
        this.field1105 = class195.field3075[arg0 & 0x3FFF];
        this.field1106 = -this.field1105;
        this.field1097 = this.field1104 = this.field1103 = this.field1098 = this.field1099 = this.field1102 = this.field1101 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
    public final void method196(int arg0) {
        int var2 = class195.field3077[arg0 & 0x3FFF];
        int var3 = class195.field3075[arg0 & 0x3FFF];
        int var4 = this.field1107;
        int var5 = this.field1097;
        int var6 = this.field1105;
        int var7 = this.field1104;
        this.field1107 = this.field1106 * var3 + var2 * var4 >> 15;
        this.field1106 = this.field1106 * var2 - var3 * var4 >> 15;
        this.field1097 = this.field1102 * var3 + var2 * var5 >> 15;
        this.field1102 = this.field1102 * var2 - var3 * var5 >> 15;
        this.field1105 = this.field1100 * var3 + var2 * var6 >> 15;
        this.field1100 = this.field1100 * var2 - var3 * var6 >> 15;
        this.field1104 = this.field1101 * var3 + var2 * var7 >> 15;
        this.field1101 = this.field1101 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class195.field3077[arg3 & 0x3FFF];
        int var8 = class195.field3075[arg3 & 0x3FFF];
        int var9 = class195.field3077[arg4 & 0x3FFF];
        int var10 = class195.field3075[arg4 & 0x3FFF];
        int var11 = class195.field3077[arg5 & 0x3FFF];
        int var12 = class195.field3075[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1107 = var9 * var11 + var10 * var14 >> 15;
        this.field1103 = -var9 * var12 + var10 * var13 >> 15;
        this.field1106 = var7 * var10 >> 15;
        this.field1097 = var7 * var12 >> 15;
        this.field1108 = var7 * var11 >> 15;
        this.field1102 = -var8;
        this.field1105 = -var10 * var11 + var9 * var14 >> 15;
        this.field1098 = var9 * var13 + var10 * var12 >> 15;
        this.field1100 = var7 * var9 >> 15;
        this.field1104 = -arg0 * this.field1107 - this.field1097 * arg1 - this.field1105 * arg2 >> 15;
        this.field1099 = -arg0 * this.field1103 - this.field1108 * arg1 - this.field1098 * arg2 >> 15;
        this.field1101 = -arg0 * this.field1106 - this.field1102 * arg1 - this.field1100 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[I)V")
    public final void method190(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1105 * arg2 + this.field1107 * arg0 + this.field1097 * arg1 >> 15;
        arg3[1] = this.field1098 * arg2 + this.field1108 * arg1 + this.field1103 * arg0 >> 15;
        arg3[2] = this.field1100 * arg2 + this.field1106 * arg0 + this.field1102 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    public final void method185(int arg0) {
        this.field1107 = 32768;
        this.field1108 = this.field1100 = class195.field3077[arg0 & 0x3FFF];
        this.field1102 = class195.field3075[arg0 & 0x3FFF];
        this.field1098 = -this.field1102;
        this.field1097 = this.field1105 = this.field1104 = this.field1103 = this.field1099 = this.field1106 = this.field1101 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public final void method204(int arg0) {
        this.field1100 = 32768;
        this.field1107 = this.field1108 = class195.field3077[arg0 & 0x3FFF];
        this.field1103 = class195.field3075[arg0 & 0x3FFF];
        this.field1097 = -this.field1103;
        this.field1105 = this.field1104 = this.field1098 = this.field1099 = this.field1106 = this.field1102 = this.field1101 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "()Lql;")
    public final class496 method459() {
        class68 var1 = new class68();
        var1.field1107 = this.field1107;
        var1.field1097 = this.field1097;
        var1.field1105 = this.field1105;
        var1.field1104 = this.field1104;
        var1.field1103 = this.field1103;
        var1.field1108 = this.field1108;
        var1.field1098 = this.field1098;
        var1.field1099 = this.field1099;
        var1.field1106 = this.field1106;
        var1.field1102 = this.field1102;
        var1.field1100 = this.field1100;
        var1.field1101 = this.field1101;
        return var1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([I)V")
    public final void method188(int[] arg0) {
        int var2 = arg0[0] - this.field1104;
        int var3 = arg0[1] - this.field1099;
        int var4 = arg0[2] - this.field1101;
        arg0[0] = this.field1106 * var4 + this.field1107 * var2 + this.field1103 * var3 >> 15;
        arg0[1] = this.field1102 * var4 + this.field1108 * var3 + this.field1097 * var2 >> 15;
        arg0[2] = this.field1100 * var4 + this.field1105 * var2 + this.field1098 * var3 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class68() {
        this.method195();
    }
}
