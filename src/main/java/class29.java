import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class29 extends class321 {

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Lil;")
    public class586 field496;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lkq;")
    public class696 field504;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "[Ljava/awt/Color;")
    public static Color[] field498 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 16)
    public static void method185(int arg0) {
        field498 = null;
        if (arg0 != -51) {
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 27)
    public final void method186(byte arg0) {
        this.field503 = this.field496.field8506;
        this.field495 = this.field496.field8505;
        this.field502 = this.field496.field8508;
        field499++;
        if (this.field496.field8502 != null) {
            this.field496.field8502.method880(this.field504.field9803, this.field504.field9807, this.field504.field9795, class643.field9219);
        }
        this.field497 = class643.field9219[0];
        if (arg0 != 57) {
            method185(58);
        }
        this.field501 = class643.field9219[2];
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 49)
    public static final void method187(boolean arg0, int arg1) {
        class413.method2520(false);
        field500++;
        if (!class515.method2903(class264.field3451, -13)) {
            return;
        }
        class227.field3021++;
        if (arg1 != -5963) {
            field498 = null;
        }
        if (class227.field3021 < 50 && !arg0) {
            return;
        }
        class227.field3021 = 0;
        if (!class87.field1347 && class230.field3051 != null) {
            class577.field8379++;
            class654 var2 = class631.method3628(class688.field9716, (byte) -51, class357.field5280);
            class444.method2623(arg1 ^ 0xFFFFE8C3, var2);
            try {
                class220.method1385(true);
            } catch (IOException var3) {
                class87.field1347 = true;
            }
        }
        class413.method2520(false);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lil;Lkv;)V", line = 82)
    public class29(class586 arg0, class16 arg1) {
        this.field496 = arg0;
        this.field504 = this.field496.method3349(100);
        this.method186((byte) 57);
    }
}
