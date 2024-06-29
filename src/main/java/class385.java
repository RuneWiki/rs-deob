import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class385 extends class329 {

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4845 = new BigInteger("b41869dac93c680e2294f33f689d50d8b5bbd5e4c608d6a66cab11c93380172e91189dc67ce59a6a51b7fc832cf1f0ac8e48e70b7db0f542076de4b546ac52ab862704a36c6aeca609cd3c2934aa8d5650414f33e8e23f34a8a4060f27ce96a9efeea42ec4443bafa8d9a43448957811b1c312fa040cae201f0a465b45fc5c48889d34151830377e77941a392759e0595a13b1ae676eb2286626d96b47d85a4bc1585160311316a754a5842ce0bf5e5bd63e7509bd89a81658ae5ac8561f182291e20451df6e4bf0dbbd5c3e28a4043f6febf98a09b24552266fc8f74d980e8070f5a35c1d5687499620b96a56b11fa8d333905301b1009a532c6aa99bce8535ef33537bf7b20dab84f411179b9a9a44ea34a38480e901a05b562eaaa048adbde36a9373a0d1f95327898f30481475718366c9b69cbd4256cb71c33250aa577e2b6da13750585a88d59c8f389cfee8cb5d5e95e09f24f5650a746d28150067f75f9747a2f0f2920827ae733c7629d3b5acf2fba65b5c213809921bb3edae3a29c63fd896132380875a057e4e23230dcc1f136b5283e36af56b68ce8f47f5d159393036e1244e70fd64ccb4eece2adaf1c8ad6da1d39cbc2eafdb8fe5d5f46af1e0039ab4127bb3b1d1c1229b84d86c4b918998c05b3d6c209bacecc5daaedcd25922637276d8d73026c898951631495d3f981acf7b1c1911b9644882f4af5e1d", 16);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Llea;")
    public static class326 field4847 = new class326();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public static final int method2073(int arg0, int arg1) {
        return class540.field7230 == null ? 0 : class540.field7230[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method2074(boolean arg0) {
        field4845 = null;
        field4847 = null;
        if (arg0) {
            method2075((byte) 53);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)[Lwp;")
    public static final class453[] method2075(byte arg0) {
        int var1 = -57 % ((2 - arg0) / 62);
        field4846++;
        return new class453[] { class454.field5815, class659.field9341, class64.field869, class248.field3063, class378.field4787, class391.field4926, class266.field3380, class235.field2938, class662.field9369, class92.field1283, class476.field6041, class676.field9499, class405.field5077, class152.field1944, class317.field4066, class16.field265, class549.field7637, class224.field2803, class138.field1787, class40.field528, class344.field4420, class370.field4692, class507.field6756, class389.field4902, class561.field7791, class260.field3195, class49.field698, class214.field2666, class551.field7665, class668.field9419, class237.field2967, class257.field3132, class102.field1380, class30.field430, class566.field7889, class66.field893, class600.field8415, class564.field7832, class680.field9559, class128.field1602, class269.field3399, class603.field8492, class551.field7672, class174.field2261, class290.field3605, class517.field7062, class280.field3515, class568.field7959, class403.field5057, class549.field7642, class468.field5951, class245.field3047, class135.field1759, class72.field969, class534.field7200, class490.field6481, class68.field920, class250.field3076, class64.field874, class280.field3520, class318.field4072, class58.field817, class298.field3669, class494.field6534, class149.field1921, class195.field2451, class245.field3037, class487.field6451, class127.field1594, class683.field9597, class514.field7026, class52.field779, class241.field3009, class102.field1372, class465.field5922, class198.field2503, class2.field20, class177.field2293, class514.field7022, class209.field2636, class220.field2691, class248.field3066, class680.field9561, class511.field6944, class622.field8691, class668.field9422, class432.field5404, class583.field8146, class337.field4331, class503.field6654, class429.field5379, class582.field8132, class591.field8309, class329.field4202, class156.field2037, class551.field7688, class577.field8063, class237.field2964, class595.field8373, class39.field519, class538.field7222, class230.field2882, class280.field3506, class164.field2161, class685.field9619, class85.field1196, class323.field4155, class203.field2590, class531.field7175, class170.field2217, class551.field7681, class279.field3499, class330.field4208, class103.field1387, class528.field7146, class452.field5796, class429.field5380 };
    }
}
