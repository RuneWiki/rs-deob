import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class56 {

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field904 = -1;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)I")
    public static final int method434(int arg0, int arg1) {
        if (arg0 != -1816209110) {
            field908 = -29;
        }
        field905++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)V")
    public static final void method435(int arg0, int arg1) {
        field903++;
        int var2 = 27 % ((-arg0 - 42) / 57);
        class456 var3 = class233.method1654(arg1, 16, -36);
        var3.method2862(0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
    public static final void method436(boolean arg0, int arg1) {
        class535.field7841 = 0;
        field901++;
        class368.field5681 = 0;
        class262.method1789((byte) -115);
        class402.method2586(arg1, arg0);
        class3.method35(false);
        boolean var2 = false;
        for (int var3 = 0; var3 < class535.field7841; var3++) {
            int var5 = class169.field2481[var3];
            class38 var6 = (class38) class365.field5659.method1122((byte) 59, (long) var5);
            class378 var7 = var6.field378;
            if (class409.field6204 && class523.method3127(var5, 96)) {
                class94.method643(arg1 + 15831);
            }
            if (class88.field1278 != var7.field801) {
                if (var7.field5809.method1199(114)) {
                    class76.method546(var7, 472);
                }
                var7.method2443(null, (byte) -101);
                var6.method3149(72);
                var2 = true;
            }
        }
        if (var2) {
            class78.field1176 = class365.field5659.method1126(24946);
            class365.field5659.method1120(class14.field150, arg1);
        }
        if (class156.field2156 != class279.field4428.field3162) {
            throw new RuntimeException("gnp1 pos:" + class279.field4428.field3162 + " psize:" + class156.field2156);
        }
        for (int var4 = 0; var4 < class378.field5815; var4++) {
            if (class365.field5659.method1122((byte) 59, (long) class81.field1198[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class378.field5815);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lmn;Lmn;I)I")
    public static final int method437(class162 arg0, class162 arg1, int arg2) {
        if (arg2 != -18288) {
            method435(-10, 94);
        }
        field906++;
        int var3 = 0;
        if (arg0.method1012(class136.field1872, true)) {
            var3++;
        }
        if (arg0.method1012(class68.field1040, true)) {
            var3++;
        }
        if (arg0.method1012(class164.field2376, true)) {
            var3++;
        }
        if (arg1.method1012(class136.field1872, true)) {
            var3++;
        }
        if (arg1.method1012(class68.field1040, true)) {
            var3++;
        }
        if (arg1.method1012(class164.field2376, true)) {
            var3++;
        }
        return var3;
    }
}
