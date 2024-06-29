import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 extends class261 {

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    private int field311 = 204;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    private int field316 = 1;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    private int field309 = 1;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "Lfg;")
    public static class203 field312 = new class203();

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "Lve;")
    public static class255 field319 = class87.method607(61, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "J")
    public static long field318 = 0L;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 4)
    public class19() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)[I", line = 23)
    public final int[] method21(byte arg0, int arg1) {
        field310++;
        int var3 = 94 % ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            for (int var5 = 0; var5 < class92.field1576; var5++) {
                int var6 = class245.field4120[var5];
                int var7 = class20.field324[arg1];
                int var8 = var6 % (4096 / this.field316) * this.field316;
                int var9 = this.field316 * var6 >> 12;
                int var10 = this.field309 * var7 >> 12;
                int var11 = var7 % (4096 / this.field309) * this.field309;
                if (this.field311 > var11) {
                    for (var9 -= var10; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (var8 < this.field311) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field311 > var8) {
                    int var12;
                    for (var12 = var9 - var10; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 105)
    public static void method108(int arg0) {
        if (arg0 != 0) {
            field319 = (class255) null;
        }
        field319 = null;
        field312 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lpb;BI)V", line = 124)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field317++;
        if (arg1 > -115) {
            this.field311 = -66;
        }
        if (arg2 == 0) {
            this.field316 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field309 = arg0.method481(0);
        } else if (arg2 == 2) {
            this.field311 = arg0.method423(255);
        }
    }
}
