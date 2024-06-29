import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public abstract class class715 extends class577 {

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9978 = new BigInteger("a56a914e1a08786bd12ac1ed9be9fdb2b36ce6b153f20325a4d9440d8477381ab251a63d6d9a5c5113f76668451c095303b47b0e8cee328004e4b74b607ac3f2570ae2f0a4e067a166a2472e73fb901db49133c1fe7c2e33817e94a6acf0bd8004cc411fcae7c58db4c23ed302b1d4b9287f52e6625b636b5372783fd48ac0fb5b36d248df37689cf4af92dc71c70d472a0ed79eb46919311bc5775e78ba28a3d5baed4363b21e229ccde644572de46892d293cdc60481637be8d658d49d4b20e955c9275bcd5421bbf835449eb6bfde808ea033753bed6a4075904ee3512bb1219d7cbf57114cd134fe7107e6e9c4d0fe62599e0ca42bbda7c78df10c670222c9c6b85c77895dbdb739aeff88dd72545a5ef8ec31628eb5de77a9603b4afe626dccf854fa85c85ad7e23c906f13c35549e2825ce40e252657c321a4e1943ea3aadf1861442ad932f315b46db2ba5ac177ddb70e88ba3d0daa129c24243a55e4349a0c75bd0e88b4069bf35b2470fbb0affe2de9f06a575c0a6f9dd377cf6878d043bf4372ed6cabfafba4869af983739202fb9a5759862b1c9a162251bd2e86f6afc23193a25a917b894562adc892c85180cd833f697bb3539ec23162d9845fc42311ec2276a7393d9df413ebeea9b4564218ba463ddd1b878903e1cd50766dbe9ba54a89b9fa7cb21dbfa00d5399dc06647bb520c0c6789a57435b87f94a2d", 16);

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "Luu;")
    public static class237 field9979;

    // $FF: synthetic field
    @OriginalMember(owner = "client!paa", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field9980;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lcea;Z)V")
    public static final void method4014(class96 arg0, boolean arg1) {
        if (arg1) {
            field9976 = -81;
        }
        field9972++;
        class457 var2 = (class457) class516.field7206.method812(119, (long) arg0.field7148);
        if (var2 == null) {
            return;
        }
        if (var2.field6340 != null) {
            class483.field6739.method361(var2.field6340);
            var2.field6340 = null;
        }
        var2.method549(6410);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method4015(String arg0, int arg1) {
        if (arg1 != -1) {
            field9978 = null;
        }
        field9974++;
        return class698.method3941(arg0, field9980 == null ? (field9980 = method4019("eea")) : field9980, -125);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Lifa;")
    public abstract class413 method1148(int arg0);

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
    public static void method4016(boolean arg0) {
        field9978 = null;
        if (arg0) {
            field9979 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BZ)V")
    public static final void method4017(byte arg0, boolean arg1) {
        field9977++;
        if (arg0 != 53 || class445.field6173.length() == 0) {
            return;
        }
        class261.method1772((byte) -122, "--> " + class445.field6173);
        class537.method3182((byte) -36, class445.field6173, false, arg1);
        class214.field2808 = 0;
        class445.field6173 = "";
        class507.field7045 = 0;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([FII)[F")
    public static final float[] method4018(float[] arg0, int arg1, int arg2) {
        if (arg1 > -105) {
            return null;
        } else {
            field9975++;
            float[] var3 = new float[arg2];
            class245.method1651(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4019(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
