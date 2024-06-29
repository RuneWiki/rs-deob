import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class100 {

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Leo;")
    private class310 field1264 = new class310();

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Ljava/lang/String;")
    public String field1262;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
    public static boolean field1266 = false;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    private volatile int field1269;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lun;")
    private class442 field1268;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        if (arg0 != 2) {
            this.method698((byte) -125, null);
        }
        field1273++;
        return this.field1269 == 0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLsf;)V")
    public final void method698(byte arg0, class547 arg1) {
        field1265++;
        arg1.field7720 = true;
        class310 var3 = this.field1264;
        synchronized (this.field1264) {
            this.field1264.method2026((byte) 51, arg1);
            this.field1269++;
        }
        if (this.field1268 != null) {
            class442 var4 = this.field1268;
            synchronized (this.field1268) {
                this.field1268.notify();
            }
        }
        if (arg0 != -78) {
            field1266 = true;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lun;Z)V")
    public final void method699(class442 arg0, boolean arg1) {
        this.field1268 = arg0;
        if (arg1) {
            field1274++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(BLsf;)V")
    public final void method700(byte arg0, class547 arg1) {
        arg1.field7720 = false;
        field1263++;
        if (arg0 >= -87) {
            return;
        }
        class310 var3 = this.field1264;
        synchronized (this.field1264) {
            this.field1264.method2026((byte) 51, arg1);
            this.field1269++;
        }
        if (this.field1268 != null) {
            class442 var4 = this.field1268;
            synchronized (this.field1268) {
                this.field1268.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLw;)V")
    public final void method701(byte arg0, class313 arg1) {
        class310 var3 = this.field1264;
        synchronized (this.field1264) {
            this.field1264.method2026((byte) 51, arg1);
            this.field1269++;
            int var4 = -91 % ((-arg0 - 59) / 62);
        }
        field1272++;
        if (this.field1268 != null) {
            class442 var5 = this.field1268;
            synchronized (this.field1268) {
                this.field1268.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
    public static final void method702(Rectangle[] arg0, int arg1, int arg2) throws class138 {
        if (arg1 != 0) {
            field1260 = 66;
        }
        field1261++;
        if (class463.field6612 == 1) {
            class438.field6281.method472(arg0, arg2, class614.field8677, class364.field5265);
        } else {
            class438.field6281.method472(arg0, arg2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILpg;)I")
    public static final int method703(int arg0, class762 arg1) {
        field1271++;
        if (class772.field10656 == arg1) {
            return 9216;
        } else if (class163.field2391 == arg1) {
            return 34065;
        } else if (class219.field3128 == arg1) {
            return 34066;
        } else {
            if (arg0 != 9216) {
                field1260 = 46;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I")
    public static final int method704(int arg0) {
        field1267++;
        if (arg0 != 0) {
            field1266 = false;
        }
        if (class677.field9637 == null) {
            return client.field4662 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class100(String arg0) {
        this.field1262 = arg0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Lsga;")
    public final class76 method705(byte arg0) {
        field1270++;
        if (arg0 > -14) {
            this.field1264 = null;
        }
        Object var2 = null;
        class310 var3 = this.field1264;
        synchronized (this.field1264) {
            class76 var4 = this.field1264.method2033(0);
            var4.method592(2);
            this.field1269--;
            return var4;
        }
    }
}
