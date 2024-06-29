import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class589 {

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Ljo;")
    private class303 field8386;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "[[I")
    private int[][] field8384;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8381 = 0;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "F")
    public static float field8383;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[Lxa;")
    public static class458[] field8385;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Liu;")
    public final class527 method3308(int arg0, int arg1) {
        field8380++;
        byte[] var3 = this.field8386.method1719(arg1, 1, 4);
        class527 var4 = new class527();
        var4.method3000(new class452(var3), -87);
        if (arg0 != 503) {
            method3310((byte) -53);
        }
        return var4;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)[I")
    public final int[] method3309(boolean arg0, int arg1) {
        field8382++;
        if (arg0) {
            method3311(116);
        }
        return arg1 >= 0 && arg1 < this.field8384.length ? this.field8384[arg1] : new int[0];
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public static void method3310(byte arg0) {
        field8385 = null;
        if (arg0 < 51) {
            field8383 = -0.033048477F;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)[Lpr;")
    public static final class407[] method3311(int arg0) {
        if (arg0 != 22227) {
            field8385 = null;
        }
        field8387++;
        return new class407[] { class381.field4941, class443.field6111, class292.field3815, class18.field164, class104.field1133, class692.field9751, class214.field2583, class244.field3162, class269.field3393, class501.field7216, class284.field3599, class673.field9563, class647.field9150, class471.field6579, class461.field6403, class386.field5162, class385.field5146, class256.field3278, class633.field8970, class625.field8868, class179.field2216, class526.field7519, class274.field3471, class678.field9610, class146.field1640, class84.field889, class269.field3392, class18.field157, class450.field6200, class463.field6443, class503.field7237, class516.field7388, class266.field3349, class454.field6298, class561.field7968, class11.field110, class104.field1131, class393.field5236, class352.field4613, class206.field2510, class353.field4633, class266.field3356, class145.field1632, class583.field8297, class629.field8927, class513.field7341, class183.field2234, class676.field9581, class46.field506, class384.field5138, class482.field7054, class622.field8827, class278.field3518, class372.field4830, class146.field1637, class249.field3195, class347.field4518, class595.field8452, class549.field7838, class606.field8565, class348.field4542, class213.field2568, class194.field2333, class581.field8254, class667.field9524, class568.field8048, class112.field1303, class396.field5273, class261.field3318, class581.field8257, class671.field9537, class185.field2251, class622.field8826, class677.field9593, class682.field9678, class206.field2504, class52.field546, class515.field7366, class59.field611, class526.field7521, class523.field7498, class679.field9615, class464.field6454, class516.field7378, class447.field6138, class108.field1257, class87.field924, class352.field4619, class230.field2933, class692.field9749, class65.field690, class80.field842, class345.field4509, class260.field3314, class250.field3226, class552.field7869, class582.field8266, class259.field3299, class623.field8831, class193.field2320, class583.field8289, class65.field688, class634.field8976, class474.field6909, class645.field9141, class445.field6117, class461.field6406, class541.field7765, class164.field1959, class252.field3232, class449.field6189, class484.field7056, class170.field2040, class489.field7098, class677.field9591, class438.field6097, class157.field1765 };
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class589(class207 arg0, int arg1, class303 arg2) {
        this.field8386 = arg2;
        this.field8386.method1727(-77, 1);
        class452 var4 = new class452(this.field8386.method1719(0, 0, 4));
        int var5 = var4.method2541(122);
        if (var5 > 1) {
            this.field8384 = new int[0][];
        } else {
            int var6 = var4.method2541(35);
            class406[] var7 = class374.method2056(-43);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2541(123);
                    if (var7[var9].field5411 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2541(52);
                int var12 = var4.method2541(96);
                this.field8384 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var14 = var4.method2541(118);
                    int var15 = var4.method2574(-1758460248);
                    this.field8384[var14] = new int[var15];
                    for (int var16 = 0; var16 < var15; var16++) {
                        this.field8384[var13][var16] = var4.method2574(-1758460248);
                    }
                }
            } else {
                this.field8384 = new int[0][];
            }
        }
    }
}
