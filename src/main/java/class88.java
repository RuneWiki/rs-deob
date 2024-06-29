import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class88 {

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "[Lpda;")
    private class627[] field1584 = new class627[10];

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "()I", line = 5)
    public final int method828() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1584[var2] != null && this.field1584[var2].field9009 / 20 < var1) {
                var1 = this.field1584[var2].field9009 / 20;
            }
        }
        if (this.field1583 < this.field1582 && this.field1583 / 20 < var1) {
            var1 = this.field1583 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1584[var3] != null) {
                this.field1584[var3].field9009 -= var1 * 20;
            }
        }
        if (this.field1583 < this.field1582) {
            this.field1583 -= var1 * 20;
            this.field1582 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Leq;II)Loia;", line = 48)
    public static final class88 method829(class209 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1453(arg2, -122, arg1);
        return var3 == null ? null : new class88(new class35(var3));
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "()[B", line = 61)
    private final byte[] method830() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1584[var2] != null && this.field1584[var2].field9009 + this.field1584[var2].field9005 > var1) {
                var1 = this.field1584[var2].field9009 + this.field1584[var2].field9005;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1584[var5] != null) {
                int var6 = this.field1584[var5].field9005 * 22050 / 1000;
                int var7 = this.field1584[var5].field9009 * 22050 / 1000;
                int[] var8 = this.field1584[var5].method3623(var6, this.field1584[var5].field9005);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "()Lcj;", line = 121)
    public final class690 method831() {
        byte[] var1 = this.method830();
        return new class690(22050, var1, this.field1583 * 22050 / 1000, this.field1582 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lud;)V", line = 129)
    private class88(class35 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method273(255);
            if (var3 != 0) {
                arg0.field469--;
                this.field1584[var2] = new class627();
                this.field1584[var2].method3621(arg0);
            }
        }
        this.field1583 = arg0.method253(-13900);
        this.field1582 = arg0.method253(-13900);
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V", line = 149)
    private class88() {
    }
}
