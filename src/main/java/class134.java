import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class134 implements class545 {

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lwf;B)Z")
    public static final boolean method907(class115 arg0, byte arg1) {
        field2125++;
        if (arg1 < 53) {
            return true;
        }
        class364 var2 = class18.field227.method1201((byte) 123, arg0.method748(false));
        if (var2.field4957 == -1) {
            return true;
        } else {
            class283 var3 = class340.field4583.method3256(var2.field4957, (byte) 23);
            return var3.field3906 == -1 ? true : var3.method1823(true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Loca;JB[I)Ljava/lang/String;")
    public final String method908(class221 arg0, long arg1, byte arg2, int[] arg3) {
        field2124++;
        if (class103.field1567 == arg0) {
            class37 var6 = class643.field9342.method3519(1, arg3[0]);
            return var6.method391((byte) 98, (int) arg1);
        } else if (class648.field9396 == arg0 || class133.field2120 == arg0) {
            class621 var7 = class181.field2574.method866((int) arg1, (byte) 79);
            return var7.field8924;
        } else if (class548.field7579 == arg0 || class385.field5158 == arg0 || class144.field2224 == arg0) {
            return class643.field9342.method3519(1, arg3[0]).method391((byte) 92, (int) arg1);
        } else if (arg2 <= 82) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
    public static final void method909(byte arg0) {
        field2126++;
        try {
            if (arg0 == 4 && class112.field1726 == 1) {
                int var1 = class218.field3105.method3491(93);
                if (var1 > 0 && class218.field3105.method3490((byte) -95)) {
                    int var2 = var1 - class587.field8397;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class218.field3105.method3488((byte) 119, var2);
                } else {
                    class218.field3105.method3468(27881);
                    class218.field3105.method3482((byte) -69);
                    class646.field9384 = null;
                    class557.field7728 = null;
                    if (class291.field4011 == null) {
                        class112.field1726 = 0;
                    } else {
                        class112.field1726 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class218.field3105.method3468(27881);
            class557.field7728 = null;
            class112.field1726 = 0;
            class291.field4011 = null;
            class646.field9384 = null;
        }
    }
}
