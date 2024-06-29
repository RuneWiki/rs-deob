import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class347 {

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "F")
    public float field5082 = 0.25F;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "F")
    public float field5089 = 1.0F;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "F")
    public float field5094 = 1.0F;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "F")
    public float field5088;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "F")
    public float field5091;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public int field5083;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "F")
    public float field5090;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "Ldn;")
    public class544 field5092;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "[Lub;")
    public static class22[] field5086 = new class22[37];

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field5095 = 0;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static void method2192(byte arg0) {
        if (arg0 >= -103) {
            field5086 = null;
        }
        field5086 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLjp;)V")
    public final void method2193(byte arg0, class376 arg1) {
        field5099++;
        if (arg0 >= -61) {
            this.field5083 = -56;
        }
        this.field5089 = (float) (arg1.method2398(-1372747256) * 8) / 255.0F;
        this.field5082 = (float) (arg1.method2398(-1372747256) * 8) / 255.0F;
        this.field5094 = (float) (arg1.method2398(-1372747256) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lsaa;B)Z")
    public final boolean method2194(class347 arg0, byte arg1) {
        field5098++;
        if (arg1 < 5) {
            return true;
        } else {
            return this.field5096 == arg0.field5096 && this.field5088 == arg0.field5088 && this.field5090 == arg0.field5090 && this.field5091 == arg0.field5091 && this.field5082 == arg0.field5082 && this.field5089 == arg0.field5089 && this.field5094 == arg0.field5094 && this.field5085 == arg0.field5085 && this.field5083 == arg0.field5083 && this.field5092 == arg0.field5092;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILjp;)Lk;")
    public static final class592 method2195(int arg0, class376 arg1) {
        field5084++;
        class651 var2 = class652.method3628(arg1, false);
        if (arg0 != -4971) {
            method2192((byte) -21);
        }
        int var3 = arg1.method2384(28);
        int var4 = arg1.method2384(46);
        int var5 = arg1.method2359(arg0 + 4970);
        return new class592(var2.field9027, var2.field9024, var2.field9031, var2.field9028, var2.field9033, var2.field9025, var2.field9029, var2.field9034, var2.field9032, var3, var4, var5);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
    public class347() {
        this.field5088 = 1.1523438F;
        this.field5091 = 1.2F;
        this.field5083 = 0;
        this.field5090 = 0.69921875F;
        this.field5097 = -60;
        this.field5092 = class708.field9928;
        this.field5093 = -50;
        this.field5096 = class382.field5572;
        this.field5085 = class730.field10129;
        this.field5087 = -50;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljp;)V")
    public class347(class376 arg0) {
        int var2 = arg0.method2398(-1372747256);
        if (class712.field9959.field1288.method3327(62) == 1 && class66.field937.method451() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5096 = class382.field5572;
            } else {
                this.field5096 = arg0.method2384(70);
            }
            if ((var2 & 0x2) == 0) {
                this.field5088 = 1.1523438F;
            } else {
                this.field5088 = (float) arg0.method2359(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5090 = 0.69921875F;
            } else {
                this.field5090 = (float) arg0.method2359(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5091 = 1.2F;
            } else {
                this.field5091 = (float) arg0.method2359(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2384(33);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2359(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2359(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2359(-1);
            }
            this.field5090 = 0.69921875F;
            this.field5096 = class382.field5572;
            this.field5088 = 1.1523438F;
            this.field5091 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5087 = -50;
            this.field5093 = -50;
            this.field5097 = -60;
        } else {
            this.field5093 = arg0.method2355(3);
            this.field5097 = arg0.method2355(3);
            this.field5087 = arg0.method2355(3);
        }
        if ((var2 & 0x20) == 0) {
            this.field5085 = class730.field10129;
        } else {
            this.field5085 = arg0.method2384(13);
        }
        if ((var2 & 0x40) == 0) {
            this.field5083 = 0;
        } else {
            this.field5083 = arg0.method2359(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field5092 = class708.field9928;
        } else {
            int var3 = arg0.method2359(-1);
            int var4 = arg0.method2359(-1);
            int var5 = arg0.method2359(-1);
            int var6 = arg0.method2359(-1);
            int var7 = arg0.method2359(-1);
            int var8 = arg0.method2359(-1);
            this.field5092 = class737.method4084(var3, var4, (byte) -117, var6, var5, var8, var7);
        }
    }
}
