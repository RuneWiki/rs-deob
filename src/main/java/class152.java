import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class152 extends class49 {

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lmb;")
    public class426 field1988;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Lfa;")
    public class691 field1991;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Lqk;")
    public static class1 field1989 = new class1(19, -1);

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    public static boolean field1997 = false;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "[[[Z")
    public static boolean[][][] field1994;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public final void method999(byte arg0) {
        field1985++;
        this.field1986 = this.field1988.field5945;
        this.field1995 = this.field1988.field5943;
        this.field1987 = this.field1988.field5947;
        if (this.field1988.field5946 != null) {
            this.field1988.field5946.method43(this.field1991.field9647, this.field1991.field9653, this.field1991.field9635, class742.field10217);
        }
        this.field1993 = class742.field10217[0];
        if (arg0 < -49) {
            this.field1990 = class742.field10217[2];
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lmb;Lju;)V")
    public class152(class426 arg0, class388 arg1) {
        this.field1988 = arg0;
        this.field1991 = this.field1988.method2571(-8706);
        this.method999((byte) -102);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field1994 = null;
        if (arg0 == -27567) {
            field1989 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1001(byte arg0, String arg1) {
        field1992++;
        if (arg1 == null) {
            return;
        }
        if (!(class688.field9600 < 200 || class161.field2078) || class688.field9600 >= 200) {
            class128.method876(4, (byte) 127, class712.field9864.method3999(class553.field7667, (byte) -92));
            return;
        }
        String var2 = class690.method3915(-4097, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class688.field9600; var3++) {
            String var9 = class690.method3915(-4097, class396.field5622[var3]);
            if (var9 != null && var9.equals(var2)) {
                class128.method876(4, (byte) 120, arg1 + class712.field9891.method3999(class553.field7667, (byte) -85));
                return;
            }
            if (class715.field9932[var3] != null) {
                String var10 = class690.method3915(-4097, class715.field9932[var3]);
                if (var10 != null && var10.equals(var2)) {
                    class128.method876(4, (byte) 112, arg1 + class712.field9891.method3999(class553.field7667, (byte) -124));
                    return;
                }
            }
        }
        int var4 = 57 % ((arg0 - 1) / 44);
        for (int var5 = 0; var5 < class302.field4404; var5++) {
            String var7 = class690.method3915(-4097, class17.field100[var5]);
            if (var7 != null && var7.equals(var2)) {
                class128.method876(4, (byte) 124, class712.field9896.method3999(class553.field7667, (byte) -54) + arg1 + class712.field9897.method3999(class553.field7667, (byte) -115));
                return;
            }
            if (class554.field7679[var5] != null) {
                String var8 = class690.method3915(-4097, class554.field7679[var5]);
                if (var8 != null && var8.equals(var2)) {
                    class128.method876(4, (byte) 117, class712.field9896.method3999(class553.field7667, (byte) -47) + arg1 + class712.field9897.method3999(class553.field7667, (byte) -109));
                    return;
                }
            }
        }
        if (class690.method3915(-4097, class724.field10031.field9965).equals(var2)) {
            class128.method876(4, (byte) 124, class712.field9894.method3999(class553.field7667, (byte) -95));
            return;
        }
        class244.field3612++;
        class116 var6 = class248.method1672(class84.field1023, class579.field8135, -20647);
        var6.field1575.method3005(255, class395.method2435(arg1, 1));
        var6.field1575.method3037(0, arg1);
        class443.method2655(0, var6);
    }
}
