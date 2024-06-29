import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class75 extends class199 {

    @OriginalMember(owner = "client!v", name = "D", descriptor = "[Lrh;")
    public class311[] field1210;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "[I")
    public static int[] field1207 = new int[100];

    @OriginalMember(owner = "client!v", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1208 = null;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[Ltc;")
    public static class235[] field1216 = new class235[8];

    @OriginalMember(owner = "client!v", name = "I", descriptor = "F")
    public static float field1214;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Ll;")
    public static class133 field1212;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "[I")
    public static int[] field1215;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z", line = 5)
    public final boolean method549(int arg0, int arg1) {
        field1211++;
        if (arg1 != 0) {
            this.method549(-115, 46);
        }
        return this.field1210[arg0].field4825;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Ll;IZ)V", line = 34)
    public class75(class133 arg0, class133 arg1, int arg2, boolean arg3) {
        class87 var5 = new class87();
        int var6 = arg0.method954(-24001, arg2);
        this.field1210 = new class311[var6];
        int[] var7 = arg0.method973(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method980(arg2, var7[var8], 5);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class71 var11 = null;
            for (class71 var12 = (class71) var5.method636(-1); var12 != null; var12 = (class71) var5.method638(120)) {
                if (var12.field1156 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method968(0, var10, 0);
                } else {
                    var13 = arg1.method968(var10, 0, 0);
                }
                var11 = new class71(var10, var13);
                var5.method632(-69, var11);
            }
            this.field1210[var7[var8]] = new class311(var9, var11);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 92)
    public static void method550(byte arg0) {
        if (arg0 != -52) {
            field1207 = (int[]) null;
        }
        field1215 = null;
        field1216 = null;
        field1207 = null;
        field1212 = null;
        field1208 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Z", line = 106)
    public final boolean method551(int arg0, byte arg1) {
        field1209++;
        if (arg1 >= -69) {
            this.method549(88, 70);
        }
        return this.field1210[arg0].field4828;
    }
}
