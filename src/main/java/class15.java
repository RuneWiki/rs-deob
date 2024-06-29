import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 {

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lad;")
    public static class448 field219 = new class448();

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method84(int arg0) {
        if (arg0 != 0) {
            method87(91);
        }
        if (class378.field5161 != null) {
            for (int var1 = 0; var1 < class378.field5161.length; var1++) {
                for (int var2 = 0; var2 < class378.field5161[var1].length; var2++) {
                    class378.field5161[var1][var2] = class241.field3435;
                }
            }
        }
        field221++;
    }

    @OriginalMember(owner = "client!vl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field225++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
    public final int method85(int arg0) {
        field222++;
        return arg0 >= -109 ? 113 : this.field220;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V")
    public class15(int arg0, int arg1) {
        this.field223 = arg1;
        this.field220 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 != -21707) {
            field219 = null;
        }
        field219 = null;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public static final void method87(int arg0) {
        field224++;
        class410.method2433(class84.field1157, 14049);
        class520.field7055++;
        if (class268.field3763 && class454.field6201) {
            int var1 = 0;
            int var2 = 0;
            if (class618.field8597) {
                var1 = class146.method1175(-29909);
                var2 = class605.method3435((byte) -98);
            }
            int var3 = class420.field5727.method1326((byte) 25) + var1;
            int var4 = class420.field5727.method1319((byte) 126) + var2;
            int var5 = var4 - class455.field6206;
            int var6 = var3 - class262.field3675;
            if (var6 < class517.field7030) {
                var6 = class517.field7030;
            }
            if ((class517.field7030 + class679.field9452.field347) < (class84.field1157.field347 + var6)) {
                var6 = class517.field7030 - (class84.field1157.field347 - class679.field9452.field347);
            }
            if (var5 < class300.field4136) {
                var5 = class300.field4136;
            }
            if (arg0 != 19597) {
                field219 = null;
            }
            if (var5 + class84.field1157.field330 > class300.field4136 + class679.field9452.field330) {
                var5 = class679.field9452.field330 + class300.field4136 - class84.field1157.field330;
            }
            int var7 = var6 + class679.field9452.field252 - class517.field7030;
            int var8 = class679.field9452.field362 + var5 - class300.field4136;
            if (class420.field5727.method1327((byte) -100)) {
                if (class520.field7055 > class84.field1157.field373) {
                    int var9 = var6 - class190.field2929;
                    int var10 = var5 - class614.field8561;
                    if (var9 > class84.field1157.field307 || var9 < -class84.field1157.field307 || var10 > class84.field1157.field307 || -class84.field1157.field307 > var10) {
                        class280.field3896 = true;
                    }
                }
                if (class84.field1157.field287 != null && class280.field3896) {
                    class255 var11 = new class255();
                    var11.field3595 = var7;
                    var11.field3586 = class84.field1157.field287;
                    var11.field3591 = var8;
                    var11.field3583 = class84.field1157;
                    class76.method644(var11);
                    return;
                }
            } else {
                if (class280.field3896) {
                    class200.method1443(false);
                    if (class84.field1157.field262 != null) {
                        class255 var12 = new class255();
                        var12.field3591 = var8;
                        var12.field3583 = class84.field1157;
                        var12.field3595 = var7;
                        var12.field3586 = class84.field1157.field262;
                        var12.field3582 = class335.field4518;
                        class76.method644(var12);
                    }
                    if (class335.field4518 != null && client.method2027(class84.field1157) != null) {
                        class442.method2570(class335.field4518, (byte) -76, class84.field1157);
                    }
                } else if ((class302.field4147 == 1 || class423.method2501(1001)) && class690.field9574 > 2) {
                    class588.method3380((byte) -117, class455.field6206 + class614.field8561, class262.field3675 + class190.field2929);
                } else if (class200.method1441((byte) -74)) {
                    class588.method3380((byte) 111, class614.field8561 + class455.field6206, class262.field3675 - -class190.field2929);
                }
                class84.field1157 = null;
            }
        } else if (class520.field7055 > 1) {
            class84.field1157 = null;
        }
    }
}
