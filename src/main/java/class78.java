import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class78 extends class232 {

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Lhi;")
    public static class82 field1328 = class95.method664((byte) -106, "M");

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field1330 = -1;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "Lhi;")
    public static class82 field1332 = class95.method664((byte) -34, "<br>");

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "Lhi;")
    public static class82 field1326 = class95.method664((byte) -64, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "Lhi;")
    public static class82 field1333 = class95.method664((byte) -92, "event_opbase");

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IB)[I", line = 19)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -100 % ((arg1 + 31) / 55);
        field1329++;
        int[] var4 = this.field4008.method131((byte) -101, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(0, (byte) 97, arg0);
            for (int var6 = 0; var6 < class54.field858; var6++) {
                var4[var6] = 4096 - var5[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 50)
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V", line = 55)
    public static void method492(int arg0) {
        int var1 = -108 / ((arg0 - 79) / 44);
        field1333 = null;
        field1332 = null;
        field1326 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLbc;)V", line = 69)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            field1328 = (class82) null;
        }
        if (arg0 == 0) {
            this.field3990 = arg2.method1082(-85) == 1;
        }
        field1331++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[[I", line = 91)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            this.method80(116, (byte) -74);
        }
        int[][] var3 = this.field3996.method136(arg1 + 82, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                var8[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var7[var11];
            }
        }
        field1327++;
        return var3;
    }
}
