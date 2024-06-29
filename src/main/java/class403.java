import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class403 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lnj;")
    public static class228[] field5995 = new class228[2048];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lcr;")
    public static class189 field5996 = new class189(10);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Llm;")
    public static class347 field6003;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lh;")
    public static class427 field6001;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[Lcq;")
    public static class67[] field6002;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)V", line = 7)
    public static final void method2599(int arg0, String arg1) {
        if (arg0 != 31991) {
            field6001 = null;
        }
        field6000++;
        System.out.println("Error: " + class135.method850((byte) 104, "%0a", "\n", arg1));
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILlm;)V", line = 18)
    public static final void method2600(int arg0, class347 arg1) {
        if (arg0 != -3) {
            method2603((byte) 110, -27, -62, -103, -74);
        }
        field5999++;
        class161.field2157 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILjava/lang/String;B)V", line = 33)
    public static final void method2601(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        field5997++;
        class394 var5 = class388.method2492((byte) -86, arg0, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field5760 != null) {
            class192 var6 = new class192();
            var6.field2576 = arg2;
            var6.field2566 = var5;
            var6.field2582 = arg3;
            var6.field2578 = var5.field5760;
            class123.method783(var6);
        }
        boolean var7 = true;
        if (var5.field5654 > 0) {
            var7 = class62.method429((byte) 88, var5);
        }
        if (!var7 || !client.method1544(var5).method2073(-115, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class185.field2507.method5(-6445, 144);
            class359.field5195++;
            class185.field2507.method1330(arg1, 82);
            class185.field2507.method1326(arg0, 29);
        }
        if (arg2 == 2) {
            class185.field2507.method5(-6445, 96);
            class233.field3113++;
            class185.field2507.method1330(arg1, -124);
            class185.field2507.method1326(arg0, 45);
        }
        if (arg2 == 3) {
            class185.field2507.method5(-6445, 119);
            class286.field4144++;
            class185.field2507.method1330(arg1, -119);
            class185.field2507.method1326(arg0, -83);
        }
        if (arg2 == 4) {
            class185.field2507.method5(-6445, 52);
            class254.field3506++;
            class185.field2507.method1330(arg1, -89);
            class185.field2507.method1326(arg0, 90);
        }
        if (arg2 == 5) {
            class424.field6272++;
            class185.field2507.method5(-6445, 0);
            class185.field2507.method1330(arg1, 24);
            class185.field2507.method1326(arg0, 117);
        }
        if (arg2 == 6) {
            class185.field2507.method5(-6445, 54);
            class75.field1071++;
            class185.field2507.method1330(arg1, -105);
            class185.field2507.method1326(arg0, 66);
        }
        if (arg2 == 7) {
            class7.field127++;
            class185.field2507.method5(-6445, 250);
            class185.field2507.method1330(arg1, 52);
            class185.field2507.method1326(arg0, 73);
        }
        if (arg2 == 8) {
            class185.field2507.method5(-6445, 186);
            class438.field6427++;
            class185.field2507.method1330(arg1, 60);
            class185.field2507.method1326(arg0, -126);
        }
        if (arg2 == 9) {
            class182.field2442++;
            class185.field2507.method5(-6445, 121);
            class185.field2507.method1330(arg1, -121);
            class185.field2507.method1326(arg0, 103);
        }
        if (arg4 < 91) {
            field6001 = null;
        }
        if (arg2 == 10) {
            class185.field2507.method5(-6445, 204);
            class435.field6399++;
            class185.field2507.method1330(arg1, 83);
            class185.field2507.method1326(arg0, -84);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 163)
    public static void method2602(int arg0) {
        field6001 = null;
        if (arg0 <= -109) {
            field6002 = null;
            field5995 = null;
            field5996 = null;
            field6003 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIIII)V", line = 181)
    public static final void method2603(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -40) {
            method2600(-18, (class347) null);
        }
        field5998++;
        if (class359.field5186 == 0 || arg3 == 0 || class321.field4730 >= 50 || arg2 == -1) {
            return;
        }
        class240.field3218[class321.field4730] = arg2;
        class31.field442[class321.field4730] = arg3;
        class245.field3284[class321.field4730] = arg1;
        class56.field766[class321.field4730] = null;
        class161.field2160[class321.field4730] = 0;
        class164.field2209[class321.field4730] = arg4;
        class321.field4730++;
    }
}
