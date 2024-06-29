import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class33 extends class147 {

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Lwc;")
    public static class36 field403 = null;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Lqj;")
    public static class196 field404 = class80.method502("Lade Benutzeroberfl-=che )2 ", -48);

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "[I")
    public static int[] field405 = new int[2000];

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "Lpe;")
    public class258 field407;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field403 = null;
        if (arg0) {
            method171(true);
        }
        field405 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lic;III)V")
    public static final void method172(class134 arg0, int arg1, int arg2, int arg3) {
        field400++;
        if (arg2 != 0) {
            method176(-11, (byte) -118);
        }
        if (arg0.field2086 == arg1 && arg1 != -1) {
            class149 var4 = class116.method704(arg1, -10304);
            int var5 = var4.field2366;
            if (var5 == 1) {
                arg0.field2109 = 0;
                arg0.field2084 = arg3;
                arg0.field2105 = 0;
                arg0.field2079 = 0;
                class209.method1447(arg0.field2105, arg0.field2085, class102.field1477 == arg0, var4, arg0.field2081, -2);
            }
            if (var5 == 2) {
                arg0.field2109 = 0;
                return;
            }
        } else if (arg1 == -1 || arg0.field2086 == -1 || class116.method704(arg1, -10304).field2365 >= class116.method704(arg0.field2086, -10304).field2365) {
            arg0.field2104 = arg0.field2071;
            arg0.field2079 = 0;
            arg0.field2109 = 0;
            arg0.field2105 = 0;
            arg0.field2084 = arg3;
            arg0.field2086 = arg1;
            if (arg0.field2086 != -1) {
                class209.method1447(arg0.field2105, arg0.field2085, class102.field1477 == arg0, class116.method704(arg0.field2086, -10304), arg0.field2081, -2);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lni;")
    public static final class7 method173(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class7 var4 = var3.field830;
            var3.field830 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIILpe;Lpe;IIJ)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3, class258 arg4, class258 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class221 var10 = new class221();
        var10.field3978 = arg8;
        var10.field3983 = arg1 * 128 + 64;
        var10.field3986 = arg2 * 128 + 64;
        var10.field3988 = arg3;
        var10.field3992 = arg4;
        var10.field3979 = arg5;
        var10.field3985 = arg6;
        var10.field3982 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class249.field4410[var11][arg1][arg2] == null) {
                class249.field4410[var11][arg1][arg2] = new class61(var11, arg1, arg2);
            }
        }
        class249.field4410[arg0][arg1][arg2].field829 = var10;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
    public static final void method175(int arg0, int arg1, int arg2) {
        int var3 = arg0--;
        field408++;
        if (arg1 > ~var3) {
            var3 = 25;
        }
        int var4 = class30.field375[arg0];
        int var5 = class172.field2892[arg0];
        if (arg2 == 0) {
            class44.field520.method1173(224, 14592);
            class171.field2868++;
            class44.field520.method329((byte) 85, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class106.field1524++;
            class44.field520.method1173(115, 14592);
            class44.field520.method329((byte) 54, var3 + var3 + 17);
        }
        if (arg2 == 2) {
            class44.field520.method1173(111, 14592);
            class44.field520.method329((byte) 35, var3 + var3 + 3);
            class203.field3653++;
        }
        class44.field520.method352(false, class106.field1523 + var4);
        class44.field520.method323(var5 + class178.field3011, (byte) -113);
        class12.field133 = class30.field375[0];
        class80.field1151 = class172.field2892[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class44.field520.method341(arg1 ^ 0xFFFFF793, class30.field375[arg0] - var4);
            class44.field520.method333(class172.field2892[arg0] - var5, false);
        }
        class44.field520.method329((byte) 62, class174.field2936[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Loi;")
    public static final class199 method176(int arg0, byte arg1) {
        class199 var2 = (class199) class185.field3250.method575(0, (long) arg0);
        field406++;
        if (arg1 <= 0) {
            method172(null, 123, 90, -66);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1330.method842(class84.method524(arg0, -8927), (byte) 59, class1.method1((byte) -99, arg0));
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1347(new class56(var3), -1);
        }
        class185.field3250.method574((long) arg0, false, var4);
        return var4;
    }
}
