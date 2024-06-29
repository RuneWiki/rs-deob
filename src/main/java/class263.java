import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class263 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "J")
    public long field3321;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lkd;")
    public class263 field3319;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lkd;")
    public class263 field3320;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method1565(byte arg0) {
        if (arg0 <= 120) {
            this.method1565((byte) 74);
        }
        field3318++;
        return this.field3319 != null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 20)
    public final void method1566(int arg0) {
        field3322++;
        if (this.field3319 == null) {
            return;
        }
        this.field3319.field3320 = this.field3320;
        if (arg0 > -46) {
            this.field3321 = -18L;
        }
        this.field3320.field3319 = this.field3319;
        this.field3319 = null;
        this.field3320 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 41)
    public static final Class method1567(byte arg0, String arg1) throws ClassNotFoundException {
        field3317++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = 59 % ((42 - arg0) / 37);
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}
