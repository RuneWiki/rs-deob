import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class455 {

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    private int field6674 = 0;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    private int field6679 = -1;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lfr;")
    private class497 field6673 = new class497();

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
    public boolean field6681 = false;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field6672;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field6670;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "[Lem;")
    private class496[] field6676;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[[[I")
    private int[][][] field6671;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field6666 = new int[2];

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field6675 = -1;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Ltf;")
    public static class533 field6667;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)[Luv;", line = 5)
    public static final class2[] method2645(int arg0) {
        if (arg0 == 0) {
            field6677++;
            return new class2[] { class424.field6320, class266.field3964, class164.field2438, class47.field603, class487.field7255, class324.field5040, class373.field5640, class42.field547, class326.field5082, class26.field386, class404.field6094, class435.field6424, class166.field2466, class68.field903, class174.field2546, class250.field3419, class59.field804, class299.field4439, class83.field1328, class126.field1894, class481.field7112, class238.field3329, class143.field2157, class511.field7501, class378.field5695, class155.field2346, class337.field5199, class71.field963, class525.field7768, class270.field4018, class324.field5061, class108.field1607, class202.field2936, class289.field4336, class163.field2432, class494.field7340, class310.field4781, class147.field2215, class496.field7359, class295.field4421, class132.field1978, class218.field3121, class389.field5861, class467.field6798, class34.field470, class184.field2721, class330.field5138, class410.field6197, class468.field6836, class531.field7823, class444.field6527, class339.field5233, class513.field7513, class18.field282, class510.field7493, class476.field7024, class375.field5652, class519.field7605, class128.field1912, class333.field5167, class103.field1546, class272.field4061, class141.field2119, class60.field824, class492.field7331, class419.field6277, class298.field4438, class21.field311, class211.field3033, class226.field3199, class260.field3900, class38.field517, class274.field4093, class84.field1338, class393.field5891, class80.field1102, class505.field7432, class19.field293, class355.field5440, class291.field4362, class90.field1409, class47.field606, class4.field36, class153.field2321, class52.field670, class264.field3945, class254.field3454, class44.field571, class105.field1573, class239.field3342, class367.field5595, class348.field5351, class359.field5498, class265.field3952, class74.field1039, class347.field5336, class407.field6132, class71.field951, class245.field3398, class138.field2071, class194.field2865, class367.field5598, class363.field5550, class290.field4351, class65.field880, class456.field6683, class535.field7867, class310.field4806, class377.field5681, class336.field5189, class434.field6413, class469.field6878 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)[[[I", line = 25)
    public final int[][][] method2646(int arg0) {
        field6668++;
        if (this.field6672 != this.field6670) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6672; var2++) {
            this.field6676[var2] = class14.field194;
        }
        return this.field6671;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 46)
    public static void method2647(byte arg0) {
        if (arg0 == -46) {
            field6666 = null;
            field6667 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 60)
    public final void method2648(byte arg0) {
        for (int var2 = 0; var2 < this.field6672; var2++) {
            this.field6671[var2][0] = null;
            this.field6671[var2][1] = null;
            this.field6671[var2][2] = null;
            this.field6671[var2] = null;
        }
        if (arg0 >= -109) {
            method2647((byte) 107);
        }
        field6678++;
        this.field6676 = null;
        this.field6671 = null;
        this.field6673.method2955(2131289328);
        this.field6673 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[[I", line = 86)
    public final int[][] method2649(int arg0, boolean arg1) {
        field6680++;
        if (arg1) {
            this.field6672 = 102;
        }
        if (this.field6672 == this.field6670) {
            this.field6681 = this.field6676[arg0] == null;
            this.field6676[arg0] = class14.field194;
            return this.field6671[arg0];
        } else if (this.field6672 == 1) {
            this.field6681 = this.field6679 != arg0;
            this.field6679 = arg0;
            return this.field6671[0];
        } else {
            class496 var3 = this.field6676[arg0];
            if (var3 == null) {
                this.field6681 = true;
                if (this.field6674 >= this.field6672) {
                    class496 var4 = (class496) this.field6673.method2949(-103);
                    var3 = new class496(arg0, var4.field7356);
                    this.field6676[var4.field7358] = null;
                    var4.method876((byte) -96);
                } else {
                    var3 = new class496(arg0, this.field6674);
                    this.field6674++;
                }
                this.field6676[arg0] = var3;
            } else {
                this.field6681 = false;
            }
            this.field6673.method2953(var3, (byte) 43);
            return this.field6671[var3.field7356];
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V", line = 173)
    public class455(int arg0, int arg1, int arg2) {
        this.field6672 = arg0;
        this.field6670 = arg1;
        this.field6676 = new class496[this.field6670];
        this.field6671 = new int[this.field6672][3][arg2];
    }
}
