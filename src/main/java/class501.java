import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class501 {

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lfc;")
    private class174 field7090 = new class174(128);

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Loi;")
    private class53 field7089;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Ltn;")
    public static class60 field7092 = new class60(80, 16);

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
    public static int[] field7095 = new int[2];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 7)
    public static void method2907(int arg0) {
        field7095 = null;
        if (arg0 >= -116) {
            method2910((byte) 13);
        }
        field7092 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 18)
    public static final void method2908(String arg0, int arg1) {
        field7086++;
        if (arg1 != 20605) {
            method2907(-12);
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class487.method2806(arg1 ^ 0xFFFFF2CA, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class520.field7656; var3++) {
            String var4 = class540.field7902[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class487.method2806(-23881, var4);
            if (var5 != null && var5.equals(var2)) {
                class520.field7656--;
                for (int var6 = var3; var6 < class520.field7656; var6++) {
                    class540.field7902[var6] = class540.field7902[var6 + 1];
                    class474.field6600[var6] = class474.field6600[var6 + 1];
                    class505.field7488[var6] = class505.field7488[var6 + 1];
                    class363.field5200[var6] = class363.field5200[var6 + 1];
                    class62.field775[var6] = class62.field775[var6 + 1];
                    class215.field3103[var6] = class215.field3103[var6 + 1];
                }
                class278.field4115++;
                class360.field5154 = class371.field5285;
                class61.method498(class513.field7577, arg1 ^ 0x507C);
                class30.field357.method2376((byte) 122, class540.method3175(arg0, arg1 ^ 0x507C));
                class30.field357.method2377((byte) -53, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V", line = 83)
    public final void method2909(int arg0, byte arg1) {
        field7087++;
        class174 var3 = this.field7090;
        synchronized (this.field7090) {
            this.field7090.method1087(1, arg0);
        }
        if (arg1 != -82) {
            this.method2911(82);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 97)
    public static final void method2910(byte arg0) {
        class340.field4928.method414(10);
        field7094++;
        class211.field3058.method2913(128);
        class539.field7885.method3003(69);
        class377.field5338.method1904(0);
        class106.field1400.method2581(-1);
        class344.field5000.method985(22552);
        class62.field784.method2568((byte) -20);
        class125.field1688.method2458(18686);
        class181.field2596.method2801(false);
        class385.field5412.method1952((byte) 97);
        class498.field7049.method2070(-128);
        class412.field5829.method1857(34);
        class69.field876.method1314(3);
        class373.field5309.method1629((byte) 122);
        class454.field6365.method1997((byte) 83);
        class361.field5163.method1246(95);
        class39.field423.method1183((byte) 101);
        class52.field628.method2139((byte) 46);
        class344.field5004.method2783((byte) -54);
        class473.field6588.method2765((byte) 99);
        class133.method843((byte) 93);
        class112.method757(1);
        class434.method2558(true);
        class287.method1769(-84);
        class20.field238.method1095(0);
        class455.field6389.method1095(0);
        class168.field2443.method1095(0);
        if (arg0 >= -74) {
            field7095 = null;
        }
        class92.field1178.method1095(0);
        class495.field7021.method1095(0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 137)
    public final void method2911(int arg0) {
        int var2 = -17 % ((10 - arg0) / 35);
        field7088++;
        class174 var3 = this.field7090;
        synchronized (this.field7090) {
            this.field7090.method1096((byte) 122);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)Lae;", line = 149)
    public final class168 method2912(int arg0, boolean arg1) {
        field7091++;
        class174 var3 = this.field7090;
        class168 var4;
        synchronized (this.field7090) {
            if (arg1) {
                this.field7089 = null;
            }
            var4 = (class168) this.field7090.method1088((long) arg0, (byte) 123);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field7089;
        byte[] var6;
        synchronized (this.field7089) {
            var6 = this.field7089.method426(1, (byte) 9, arg0);
        }
        class168 var7 = new class168();
        if (var6 != null) {
            var7.method1059(new class403(var6), -107);
        }
        class174 var8 = this.field7090;
        synchronized (this.field7090) {
            this.field7090.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 207)
    public class501(class205 arg0, int arg1, class53 arg2) {
        this.field7089 = arg2;
        this.field7089.method435(1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 195)
    private final void method2913(int arg0) {
        if (arg0 != 128) {
            this.method2912(-25, true);
        }
        field7093++;
        class174 var2 = this.field7090;
        synchronized (this.field7090) {
            this.field7090.method1095(0);
        }
    }
}
