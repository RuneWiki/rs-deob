import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class461 extends class245 implements class722 {

    @OriginalMember(owner = "client!fea", name = "D", descriptor = "I")
    private int field6322;

    @OriginalMember(owner = "client!fea", name = "G", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
    private int field6321;

    @OriginalMember(owner = "client!fea", name = "F", descriptor = "[I")
    public static int[] field6324 = new int[2];

    @OriginalMember(owner = "client!fea", name = "E", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
    public static void method2759(int arg0) {
        if (arg0 == 0) {
            field6324 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)[Lqk;")
    public static final class148[] method2760(int arg0) {
        if (arg0 != -26198) {
            return null;
        } else {
            ++field6323;
            return new class148[] { class687.field9636, class426.field5901, class492.field6799, class164.field2252, class589.field8459, class742.field10342, class47.field691, class256.field3511, class539.field7538, class230.field3199, class675.field9506, class350.field4452, class702.field9779, class144.field1988, class352.field4546, class399.field5525, class699.field9741, class165.field2261, class384.field5396, class616.field8773, class153.field2111, class62.field835, class50.field740, class65.field902, class408.field5685, class163.field2251, class333.field4266, class209.field2977, class592.field8543, class292.field3821, class40.field554, class527.field7370, class562.field7994, class635.field9037, class611.field8692, class416.field5796, class672.field9449, class475.field6490, class691.field9674, class430.field5921, class256.field3512, class537.field7513, class45.field657, class245.field3412, class99.field1432, class468.field6396, class205.field2939, class680.field9577, class614.field8738, class667.field9395, class710.field9909, class169.field2309, class446.field6092, class734.field10278, class261.field3561, class517.field7201, class413.field5759, class253.field3502, class599.field8596, class459.field6312, class237.field3297, class644.field9141, class54.field755, class62.field834, class380.field5352, class616.field8777, class231.field3212, class231.field3206, class233.field3238, class638.field9066, class705.field9801, class456.field6278, class545.field7704, class676.field9529, class440.field6033, class714.field10130, class589.field8462, class513.field7160, class290.field3800, class8.field69, class114.field1606, class379.field5318, class244.field3389, class524.field7348, class72.field1001, class676.field9515, class369.field4719, class330.field4227, class375.field5200, class13.field190, class556.field7848, class105.field1535, class228.field3171, class278.field3708, class494.field6938, class735.field10288, class30.field424, class529.field7385, class70.field989, class158.field2145, class260.field3533, class41.field578, class265.field3616, class265.field3617, class77.field1057, class480.field6523, class748.field10426, class413.field5752, class651.field9205, class656.field9283, class517.field7225, class399.field5522, class142.field1964, class652.field9220, class690.field9669, class463.field6338, class47.field677, class31.field472, class437.field6013, class621.field8842, class676.field9522 };
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lsb;Lkea;III[B)V")
    public class461(class93 arg0, class77 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class720.field10164, arg2 * arg3 * arg4, false);
        this.field6322 = arg4;
        this.field6325 = arg3;
        this.field6321 = arg2;
        super.field3397.method2933((byte) 97, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3406, 0, this.method1554(-115), this.field6321, this.field6325, this.field6322, 0, class185.method1243(110, super.field3410), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
