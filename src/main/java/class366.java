import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class366 implements class582 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ldba;")
    public class80 field5206;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5205 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
    public final void method109(int arg0, boolean arg1) {
        field5207++;
        if (arg0 != 8444) {
            this.method109(-4, false);
        }
        int var3 = this.field5206.field1108.method371(this.field5206.field1113, (byte) -124, class652.field9217) + this.field5206.field1116;
        int var4 = this.field5206.field1117.method2192(class603.field8386, 2, this.field5206.field1109) + this.field5206.field1118;
        this.method1227(var4, var3, arg1, 63);
        this.method1228(var3, var4, arg1, (byte) -68);
        class548.field7419.method1305(this.field5206.field1110, var4 + (this.field5206.field1109 / 2) + 4, class463.field6522, true, var3 + (this.field5206.field1113 / 2), -1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZB)V")
    public abstract void method1228(int arg0, int arg1, boolean arg2, byte arg3);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2140(int arg0, int[] arg1) {
        field5204++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class508.field6966;
        if (arg0 != 4) {
            return null;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class603 var5 = class210.field3099.method605((byte) -110, arg1[var4]);
            if (var5.field8383 != -1) {
                class461 var6 = (class461) class528.field7230.method1986((byte) -120, (long) var5.field8383);
                if (var6 == null) {
                    class543 var7 = class543.method2990(class460.field6517, var5.field8383, 0);
                    if (var7 != null) {
                        var6 = class630.field8790.method412(var7, true);
                        class528.field7230.method1985(var6, (long) var5.field8383, (byte) -102);
                    }
                }
                if (var6 != null) {
                    class206.field3038[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZI)V")
    public abstract void method1227(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldba;)V")
    public class366(class80 arg0) {
        this.field5206 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public abstract void method108(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
    public abstract boolean method104(byte arg0);
}
