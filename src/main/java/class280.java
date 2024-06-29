import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class280 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field4939 = -1;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Leg;")
    private static class37 field4938 = class174.method1167("Loading sprites )2 ", 76);

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Leg;")
    public static class37 field4948 = field4938;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4941 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lbf;")
    public static class202 field4949 = new class202(64);

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Leg;")
    public static class37 field4951 = class174.method1167("Atteindre", -19);

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Ll;")
    public class9 field4946;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public int[] field4937;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[Leg;")
    public class37[] field4942;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public static final void method1879(int arg0, int arg1) {
        class213.field3677.method1402((byte) -22, arg1);
        if (arg0 != 1) {
            method1881(36);
        }
        field4944++;
        class144.field2448.method1402((byte) -72, arg1);
        class113.field1923.method1402((byte) -51, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljl;BII)Lrk;")
    public static final class14 method1880(class101 arg0, byte arg1, int arg2, int arg3) {
        field4943++;
        if (class131.method941(arg2, arg0, arg3, -34)) {
            int var4 = 14 / ((-arg1 - 38) / 46);
            return class79.method535(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method1881(int arg0) {
        field4938 = null;
        if (arg0 == -1) {
            field4948 = null;
            field4949 = null;
            field4941 = null;
            field4951 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B[B)V")
    public static final void method1882(byte arg0, byte[] arg1) {
        field4940++;
        class187 var2 = new class187(arg1);
        var2.field3169 = arg1.length - 2;
        class5.field91 = var2.method1244(false);
        class224.field3852 = new int[class5.field91];
        class158.field2636 = new int[class5.field91];
        class242.field4362 = new boolean[class5.field91];
        class99.field1536 = new byte[class5.field91][];
        class170.field2848 = new byte[class5.field91][];
        class249.field4476 = new int[class5.field91];
        class125.field2101 = new int[class5.field91];
        var2.field3169 = arg1.length - (class5.field91 * 8) - 7;
        class257.field4567 = var2.method1244(false);
        class126.field2118 = var2.method1244(false);
        int var3 = (var2.method1268(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class5.field91; var4++) {
            class249.field4476[var4] = var2.method1244(false);
        }
        for (int var5 = 0; var5 < class5.field91; var5++) {
            class158.field2636[var5] = var2.method1244(false);
        }
        for (int var6 = 0; var6 < class5.field91; var6++) {
            class224.field3852[var6] = var2.method1244(false);
        }
        if (arg0 != 43) {
            field4941 = null;
        }
        for (int var7 = 0; var7 < class5.field91; var7++) {
            class125.field2101[var7] = var2.method1244(false);
        }
        var2.field3169 = arg1.length - ((var3 - 1) * 3) - (class5.field91 * 8) - 7;
        class262.field4617 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class262.field4617[var8] = var2.method1248((byte) 84);
            if (class262.field4617[var8] == 0) {
                class262.field4617[var8] = 1;
            }
        }
        var2.field3169 = 0;
        for (int var9 = 0; var9 < class5.field91; var9++) {
            int var10 = class224.field3852[var9];
            int var11 = class125.field2101[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class170.field2848[var9] = var14;
            class99.field1536[var9] = var13;
            int var15 = var2.method1268(255);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method1269(arg0 + 212);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1269(255);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var13[var10 * var22 + var21] = var2.method1269(class4.method24(arg0, 212));
                                var16 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var14[var10 * var24 + var20] = var2.method1269(255);
                    }
                    var20++;
                }
            }
            class242.field4362[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
    public static final void method1883(int arg0, boolean arg1) {
        field4947++;
        if (arg0 > -78) {
            return;
        }
        int var2 = class47.field740.length;
        byte[][] var3 = class115.field1941;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class210.field3615[var4] >> 8) * 64 - class40.field642;
                int var7 = (class210.field3615[var4] & 0xFF) * 64 - class144.field2456;
                class126.method898((byte) 83);
                class227.method1577(var7, (byte) -125, class215.field3719, var6, arg1, var5);
            }
        }
    }
}
