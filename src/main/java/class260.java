import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class260 extends class262 {

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public static int field4321 = 0;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "Lok;")
    public static class146 field4318 = class235.method1724(-12908, " loggt sich aus)3");

    @OriginalMember(owner = "client!cn", name = "Z", descriptor = "I")
    public static int field4328 = 0;

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "Lok;")
    public static class146 field4323 = class235.method1724(-12908, "rot:");

    @OriginalMember(owner = "client!cn", name = "bb", descriptor = "Lok;")
    public static class146 field4330 = class235.method1724(-12908, "_");

    @OriginalMember(owner = "client!cn", name = "ab", descriptor = "Z")
    public static boolean field4329 = false;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!cn", name = "Y", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!cn", name = "V", descriptor = "[I")
    public static int[] field4324;

    @OriginalMember(owner = "client!cn", name = "X", descriptor = "[Lr;")
    public static class264[] field4326;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)[I", line = 9)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            field4328 = 115;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 110);
        field4320++;
        if (this.field4350.field3333) {
            int[][] var4 = this.method1893(0, arg0, 95);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class98.field1598; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V", line = 50)
    public static void method1882(int arg0) {
        field4323 = null;
        field4326 = null;
        if (arg0 == 28802) {
            field4324 = null;
            field4318 = null;
            field4330 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)Z", line = 78)
    public static final boolean method1883(int arg0) {
        field4322++;
        if (arg0 != 14083) {
            field4321 = 74;
        }
        try {
            return class148.method1139((byte) -38);
        } catch (IOException var5) {
            class264.method1904(4803);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class199.field3331 + "," + class177.field3004 + "," + class268.field4616 + " - " + class46.field781 + "," + (class102.field1639.field5419[0] + class15.field300) + "," + (class201.field3357 + class102.field1639.field5432[0]) + " - ";
            for (int var4 = 0; var4 < class46.field781 && var4 < 50; var4++) {
                var3 = var3 + client.field4080.field860[var4] + ",";
            }
            class245.method1771(var6, var3, 0);
            class239.method1743(86);
            return true;
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)V", line = 108)
    public static final void method1884(byte arg0) {
        class119.field1920.method791(8);
        if (arg0 >= 4) {
            field4317++;
            class280.field4797.method791(8);
            class7.field141.method791(8);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 129)
    public static final void method1885(int arg0, int arg1) {
        int var2 = -34 % ((-arg1 - 51) / 51);
        field4327++;
        class76.field1239 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BZIZZ)Loh;", line = 139)
    public static final class15 method1886(byte arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg0 != 12) {
            return (class15) null;
        }
        class245 var5 = null;
        field4325++;
        if (class79.field1268 != null) {
            var5 = new class245(arg2, class79.field1268, class273.field4702[arg2], 1000000);
        }
        class296.field5040[arg2] = class214.field3531.method20(arg2, var5, class292.field4965, (byte) -29);
        if (arg3) {
            class296.field5040[arg2].method238(52);
        }
        return new class15(class296.field5040[arg2], arg4, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 166)
    public class260() {
        super(1, true);
    }
}
