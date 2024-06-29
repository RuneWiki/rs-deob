import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class23 extends class335 {

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    private int field375 = 0;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    private int field381 = 1365;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    private int field382 = 0;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    private int field383 = 20;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "Lql;")
    public static class87 field376 = new class87();

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static volatile int field384 = -1;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field385 = -1;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 5)
    public static void method226(int arg0) {
        int var1 = 10 % ((arg0 + 8) / 45);
        field376 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLl;II)[Lwj;", line = 16)
    public static final class270[] method227(byte arg0, class133 arg1, int arg2, int arg3) {
        field379++;
        if (class181.method1296(false, arg1, arg3, arg2)) {
            int var4 = 109 / ((arg0 + 8) / 50);
            return class112.method835((byte) -92);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 33)
    public static final void method228(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        int var4 = 0;
        field380++;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class186.field2786; var6++) {
            class299 var7 = class237.method1657(2, var6);
            if ((!arg1 || var7.field4619) && var7.field4616 == -1 && var7.field4668 == -1 && var7.field4621 == 0 && var7.field4650.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class121.field1849 = null;
                    class55.field921 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class120.field1836 = 0;
        class55.field921 = var4;
        class121.field1849 = var5;
        String[] var10 = new String[class55.field921];
        if (arg2 != -25942) {
            field378 = -73;
        }
        for (int var11 = 0; var11 < class55.field921; var11++) {
            var10[var11] = class237.method1657(2, var5[var11]).field4650;
        }
        class263.method1792(class121.field1849, (byte) 5, var10);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 110)
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 114)
    public static final void method229(int[] arg0, byte arg1, Object[] arg2) {
        class317.method2158(arg0.length - 1, arg0, 0, arg2, (byte) -97);
        if (arg1 < -21) {
            field386++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILkh;I)V", line = 127)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field387++;
        if (arg2 < 51) {
            this.method230(-76, (class166) null, 33);
        }
        if (arg0 == 0) {
            this.field381 = arg1.method1151(-125);
        } else if (arg0 == 1) {
            this.field383 = arg1.method1151(-128);
        } else if (arg0 == 2) {
            this.field382 = arg1.method1151(-93);
        } else if (arg0 == 3) {
            this.field375 = arg1.method1151(-88);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I", line = 203)
    public final int[] method149(int arg0, int arg1) {
        field377++;
        if (arg1 != 621) {
            return (int[]) null;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            for (int var4 = 0; var4 < class105.field1630; var4++) {
                int var5 = (class90.field1437[var4] << 12) / this.field381 + this.field382;
                int var6 = (class280.field4316[arg0] << 12) / this.field381 + this.field375;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                for (int var13 = var5 * var5 >> 12; var11 + var13 < 16384 && var12 < this.field383; var13 = var8 * var8 >> 12) {
                    var10 = (var8 * var10 >> 12) * 2 + var7;
                    var8 = var13 + var9 - var11;
                    var11 = var10 * var10 >> 12;
                    var12++;
                }
                var3[var4] = this.field383 - 1 <= var12 ? 0 : (var12 << 12) / this.field383;
            }
        }
        return var3;
    }
}
