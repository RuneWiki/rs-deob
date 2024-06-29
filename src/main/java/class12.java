import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 extends class271 {

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public int field158 = 0;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "S")
    public static short field159 = 1;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "Lgb;")
    public static class158 field157 = new class158(100);

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "[I")
    public static int[] field163 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lcb;Z)V", line = 10)
    public static final void method61(class267 arg0, boolean arg1) {
        field160++;
        class272.field4698 = class88.method703(0, arg0, 1, class211.field3594);
        class116.field1957 = new class68[class272.field4698.length];
        class301.field5144 = new class68[class272.field4698.length];
        class205.field3476 = new class68[class272.field4698.length];
        for (int var2 = 0; var2 < class272.field4698.length; var2++) {
            class272.field4698[var2].method576();
            class116.field1957[var2] = class272.field4698[var2].method579();
            class272.field4698[var2].method576();
            class301.field5144[var2] = class272.field4698[var2].method579();
            class272.field4698[var2].method576();
            class205.field3476[var2] = class272.field4698[var2].method579();
            class272.field4698[var2].method576();
        }
        class37.field544 = class170.method1262(0, arg0, -27907, class206.field3492);
        class133.field2290 = class304.method2094(-7865, class7.field90, 0, arg0);
        class61.field1072 = class304.method2094(-7865, class2.field24, 0, arg0);
        class89.field1473 = class304.method2094(-7865, class76.field1325, 0, arg0);
        class215.field3675 = class304.method2094(-7865, class267.field4602, 0, arg0);
        class63.field1101 = class134.method1037(class70.field1196, 36, 0, arg0);
        class69.field1188 = class134.method1037(class291.field4992, -115, 0, arg0);
        class66.field1144 = class121.method919(23044, arg0, 0, class300.field5137);
        class24.field306 = class134.method1037(class311.field5296, 106, 0, arg0);
        class246.field4156 = class134.method1037(class144.field2488, 85, 0, arg0);
        class283.field4891 = class117.method899(0, arg0, (byte) -119, class63.field1104);
        class24.field316 = class117.method899(0, arg0, (byte) -124, class17.field223);
        class132.field2280.method796(class24.field316, (int[]) null);
        if (arg1) {
            return;
        }
        class269.field4654.method796(class24.field316, (int[]) null);
        class3.field28.method796(class24.field316, (int[]) null);
        class18.field239 = class88.method703(0, arg0, 1, class78.field1342);
        for (int var3 = 0; var3 < class18.field239.length; var3++) {
            class18.field239[var3].method581();
        }
        class181 var4 = class51.method373(arg0, 0, class87.field1446, -24887);
        var4.method1338();
        class94.field1526 = new class277(var4);
        class181[] var5 = class170.method1262(0, arg0, -27907, class266.field4590);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1338();
        }
        class168.field2836 = new class258[var5.length];
        for (int var7 = 0; var7 < var5.length; var7++) {
            class168.field2836[var7] = new class277(var5[var7]);
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class37.field544.length; var12++) {
            class37.field544[var12].method1326(var8 + var11, var10 - -var11, var9 + var11);
        }
        class272.field4698[0].method577(var8 + var11, var10 - -var11, var9 + var11);
        class196.field3295 = new class258[class37.field544.length];
        for (int var13 = 0; var13 < class37.field544.length; var13++) {
            class196.field3295[var13] = new class277(class37.field544[var13]);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 121)
    public static final void method62(byte arg0) {
        field161++;
        if (class16.field202 == null) {
            return;
        }
        try {
            byte[] var1 = class16.field202.method1054(112);
            if (arg0 >= -79) {
                field157 = (class158) null;
            }
            if (var1 != null) {
                class60 var2 = new class60(var1);
                class168.field2833 = var2.method485((byte) -2);
                class115.field1946 = new class29[class168.field2833];
                for (int var3 = 0; var3 < class168.field2833; var3++) {
                    class29 var4 = class115.field1946[var3] = new class29();
                    int var5 = var2.method485((byte) -2);
                    var4.field410 = var5 & 0x7FFF;
                    var4.field407 = (var5 & 0x8000) != 0;
                    var4.field414 = var2.method532(-1);
                    var4.field402 = var2.method487((byte) -89);
                    var4.field403 = var3;
                    int var6 = var2.method485((byte) -2);
                    var4.field415 = class258.method1843(var6, (byte) -109);
                }
                class178.method1316(0, -1, class115.field1946.length - 1, class115.field1946);
                class16.field202 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class16.field202 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 173)
    public static void method63(byte arg0) {
        field163 = null;
        field157 = null;
        int var1 = -3 % ((-arg0 - 16) / 54);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILja;I)V", line = 185)
    private final void method64(int arg0, class60 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field158 = arg1.method485((byte) -2);
        }
        field162++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lja;I)V", line = 198)
    public final void method65(class60 arg0, int arg1) {
        field156++;
        if (arg1 > -28) {
            method61((class267) null, true);
        }
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                return;
            }
            this.method64(2, arg0, var3);
        }
    }
}
