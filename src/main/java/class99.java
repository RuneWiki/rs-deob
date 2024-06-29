import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class99 {

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Llh;")
    public static class487 field1384 = new class487(71, 4);

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1387 = 1403;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "J")
    public static long field1386 = 20000000L;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 3)
    public static void method718(int arg0) {
        field1384 = null;
        if (arg0 >= -102) {
            field1387 = 9;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 20)
    public static final void method719(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field1383++;
        class78 var5 = class89.method650(104, arg1, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field1079 != null) {
            class368 var6 = new class368();
            var6.field4955 = arg4;
            var6.field4960 = arg0;
            var6.field4962 = var5.field1079;
            var6.field4957 = var5;
            class97.method708(var6);
        }
        if (class285.field3921 != 10 || !client.method1679(var5).method1847(arg2 ^ 0xFFFFFFF8, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class341.field4564++;
            class352 var7 = class290.method1786(98, class199.field2836, class436.field6059);
            class493.method2787(arg3, var7, var5.field1145, arg1, 255);
            class602.method3388(var7, (byte) 28);
        }
        if (arg0 == 2) {
            class587.field8257++;
            class352 var8 = class290.method1786(98, class199.field2836, class650.field9031);
            class493.method2787(arg3, var8, var5.field1145, arg1, 255);
            class602.method3388(var8, (byte) 28);
        }
        if (arg0 == 3) {
            class238.field3266++;
            class352 var9 = class290.method1786(98, class199.field2836, class659.field9174);
            class493.method2787(arg3, var9, var5.field1145, arg1, 255);
            class602.method3388(var9, (byte) 28);
        }
        if (arg0 == 4) {
            class468.field6437++;
            class352 var10 = class290.method1786(98, class199.field2836, class607.field8448);
            class493.method2787(arg3, var10, var5.field1145, arg1, 255);
            class602.method3388(var10, (byte) 28);
        }
        if (arg0 == 5) {
            class451.field6218++;
            class352 var11 = class290.method1786(98, class199.field2836, class91.field1309);
            class493.method2787(arg3, var11, var5.field1145, arg1, 255);
            class602.method3388(var11, (byte) 28);
        }
        if (~arg0 == arg2) {
            class76.field1002++;
            class352 var12 = class290.method1786(98, class199.field2836, class26.field323);
            class493.method2787(arg3, var12, var5.field1145, arg1, 255);
            class602.method3388(var12, (byte) 28);
        }
        if (arg0 == 7) {
            class319.field4372++;
            class352 var13 = class290.method1786(98, class199.field2836, class614.field8576);
            class493.method2787(arg3, var13, var5.field1145, arg1, 255);
            class602.method3388(var13, (byte) 28);
        }
        if (arg0 == 8) {
            class202.field2854++;
            class352 var14 = class290.method1786(98, class199.field2836, class209.field2941);
            class493.method2787(arg3, var14, var5.field1145, arg1, 255);
            class602.method3388(var14, (byte) 28);
        }
        if (arg0 == 9) {
            class525.field7119++;
            class352 var15 = class290.method1786(arg2 + 105, class199.field2836, class61.field694);
            class493.method2787(arg3, var15, var5.field1145, arg1, arg2 + 262);
            class602.method3388(var15, (byte) 28);
        }
        if (arg0 == 10) {
            class492.field6715++;
            class352 var16 = class290.method1786(arg2 + 105, class199.field2836, class134.field1908);
            class493.method2787(arg3, var16, var5.field1145, arg1, arg2 + 262);
            class602.method3388(var16, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I", line = 154)
    public static final int method720(int arg0) {
        if (arg0 != 71) {
            field1387 = -75;
        }
        field1385++;
        return class370.field4986++;
    }
}
