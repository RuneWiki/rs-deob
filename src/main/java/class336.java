import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class336 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field4863;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(CI)V")
    public final void method2006(char arg0, int arg1) {
        field4859++;
        OpenGL.glCallList(this.field4858 + arg0);
        if (arg1 != -14591) {
            this.method2006((char) 65531, -127);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method2007(boolean arg0) {
        field4863 = null;
        if (arg0) {
            method2007(true);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lri;BLoi;Loi;Loi;)Z")
    public static final boolean method2008(class75 arg0, byte arg1, class53 arg2, class53 arg3, class53 arg4) {
        class500.field7083 = arg3;
        class50.field610 = arg2;
        class206.field2986 = arg4;
        if (arg1 != 104) {
            method2011(24);
        }
        class22.field267 = arg0;
        field4865++;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method2009(int arg0) {
        field4862++;
        int var1 = -61 % ((arg0 - 10) / 48);
        class403.field5681.method2408(82);
        class135.field1766.method2408(123);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Let;B)V")
    public static final void method2010(class429 arg0, byte arg1) {
        field4860++;
        if (arg1 != -78) {
            field4863 = null;
        }
        for (class136 var2 = (class136) class503.field7294.method2655(15152); var2 != null; var2 = (class136) class503.field7294.method2660((byte) 67)) {
            if (var2.field1778 == arg0) {
                if (var2.field1780 != null) {
                    class138.field1810.method2312(var2.field1780);
                    var2.field1780 = null;
                }
                var2.method2891(-128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)[Leh;")
    public static final class246[] method2011(int arg0) {
        field4861++;
        if (arg0 >= -68) {
            method2008(null, (byte) 67, null, null, null);
        }
        return new class246[] { class20.field237, class514.field7586, class37.field406, class513.field7580, class127.field1708, class284.field4164, class292.field4260, class81.field1049, class437.field6123, class80.field1046, class100.field1336, class12.field157, class427.field6023, class15.field194, class353.field5074, class53.field657, class442.field6185, class117.field1600, class190.field2721, class95.field1238, class353.field5064, class308.field4470, class258.field3832, class108.field1475, class146.field1923, class386.field5424, class194.field2759, class400.field5633, class79.field1030, class500.field7084, class460.field6431, class105.field1388, class12.field155, class371.field5292, class372.field5299, class162.field2395, class372.field5300, class526.field7738, class503.field7309, class304.field4434, class97.field1277, class117.field1617, class57.field722, class446.field6231, class179.field2562, class56.field708, class455.field6391, class400.field5634, class427.field6017, class31.field369, class269.field3919, class396.field5618, class411.field5801, class511.field7566, class519.field7645, class117.field1633, class38.field418, class207.field2998, class47.field535, class344.field5003, class488.field6831, class422.field5953, class263.field3869, class168.field2453, class424.field5970, class514.field7591, class207.field3002, class450.field6292, class100.field1332, class441.field6156, class318.field4600, class378.field5354, class393.field5522, class426.field5987, class419.field5896, class319.field4623, class392.field5511, class498.field7051, class389.field5467, class380.field5362, class509.field7544, class121.field1667, class6.field106, class462.field6465, class435.field6116, class12.field160, class438.field6142, class316.field4589, class204.field2905, class158.field2361, class350.field5033, class121.field1663, class205.field2972, class152.field2189, class215.field3117, class202.field2899, class285.field4171, class461.field6444, class354.field5079, class139.field1817, class188.field2701, class1.field6, class386.field5421, class476.field6631, class155.field2244, class282.field4149, class460.field6439, class287.field4192, class322.field4713, class375.field5325, class384.field5403, class330.field4815, class88.field1107, class471.field6566 };
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public final void method2012(int arg0, int arg1) {
        field4864++;
        OpenGL.glNewList(this.field4858 + arg1, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lih;I)V")
    public class336(class503 arg0, int arg1) {
        this.field4858 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public final void method2013(int arg0) {
        OpenGL.glEndList();
        if (arg0 != 4864) {
            this.method2006((char) 65492, -73);
        }
        field4866++;
    }
}
