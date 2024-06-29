import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class511 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "F")
    public float field7272 = 0.25F;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "F")
    public float field7274 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "F")
    public float field7278 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "F")
    public float field7281;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public int field7276;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field7271;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public int field7273;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field7275;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lom;")
    public class374 field7280;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public int field7277;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "F")
    public float field7283;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "F")
    public float field7286;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method3029(boolean arg0) {
        field7279++;
        if (arg0) {
            method3029(false);
        }
        if (class88.field1263 == null) {
            class88.field1263 = class59.method409(30);
            class647.field9127 = class88.field1263[0];
            class501.field7122 = class524.method3075(18);
        }
        if (class311.field4401 == null) {
            class537.method3156(1914161577);
        }
        class59 var1 = class647.field9127;
        int var2 = class564.method3288(100);
        if (class647.field9127 == var1) {
            class529.field7548 = class647.field9127.field810.method2679(class650.field9160, 101);
            if (class647.field9127.field802) {
                class705.field9936 = (class647.field9127.field812 - class647.field9127.field814) * var2 / 100 + class647.field9127.field814;
            }
            if (class647.field9127.field807) {
                class529.field7548 = class529.field7548 + class705.field9936 + "%";
            }
        } else if (class647.field9127 == class59.field837) {
            class311.field4401 = null;
            class49.method363(3, 115);
        } else {
            class529.field7548 = var1.field817.method2679(class650.field9160, -63);
            class705.field9936 = var1.field812;
            if (class647.field9127.field807) {
                class529.field7548 = class529.field7548 + var1.field812 + "%";
            }
            if (class647.field9127.field802 || var1.field802) {
                class501.field7122 = class524.method3075(18);
            }
        }
        if (class311.field4401 == null) {
            return;
        }
        class311.field4401.method3373(class501.field7122, class529.field7548, 30, class705.field9936, class647.field9127);
        if (class612.field8653 == null) {
            return;
        }
        for (int var3 = class34.field354 + 1; var3 < class612.field8653.length; var3++) {
            if (class612.field8653[var3].method2064(87) >= 100 && (var3 - 1) == class34.field354 && class87.field1246 >= 1 && class311.field4401.method3372(10556)) {
                try {
                    class612.field8653[var3].method2066(true);
                } catch (Exception var4) {
                    class612.field8653 = null;
                    return;
                }
                class311.field4401.method3380(class612.field8653[var3], -90);
                class34.field354++;
                if (class34.field354 >= (class612.field8653.length - 1) && class612.field8653.length > 1) {
                    class34.field354 = class672.field9370.method2971((byte) 114) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILrg;)V", line = 114)
    public final void method3030(int arg0, class645 arg1) {
        field7282++;
        this.field7274 = (float) (arg1.method3745(arg0 ^ 0x47C2) * 8) / 255.0F;
        this.field7272 = (float) (arg1.method3745(-6314) * 8) / 255.0F;
        this.field7278 = (float) (arg1.method3745(-6314) * 8) / 255.0F;
        if (arg0 != -24428) {
            this.field7271 = 120;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqj;I)Z", line = 129)
    public final boolean method3031(class511 arg0, int arg1) {
        if (arg1 != 19892) {
            this.method3030(77, null);
        }
        field7284++;
        return this.field7276 == arg0.field7276 && this.field7281 == arg0.field7281 && this.field7286 == arg0.field7286 && this.field7283 == arg0.field7283 && this.field7272 == arg0.field7272 && this.field7274 == arg0.field7274 && this.field7278 == arg0.field7278 && this.field7271 == arg0.field7271 && this.field7277 == arg0.field7277 && this.field7280 == arg0.field7280;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 156)
    public class511() {
        this.field7281 = 1.1523438F;
        this.field7276 = class283.field4021;
        this.field7271 = class162.field2576;
        this.field7273 = -50;
        this.field7270 = -60;
        this.field7275 = -50;
        this.field7280 = class396.field5947;
        this.field7277 = 0;
        this.field7283 = 1.2F;
        this.field7286 = 0.69921875F;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lrg;)V", line = 172)
    public class511(class645 arg0) {
        int var2 = arg0.method3745(-6314);
        if (class63.field916.field10175.method1990(17503) == 1 && class729.field10214.method433() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7276 = class283.field4021;
            } else {
                this.field7276 = arg0.method3720(-19541);
            }
            if ((var2 & 0x2) == 0) {
                this.field7281 = 1.1523438F;
            } else {
                this.field7281 = (float) arg0.method3712((byte) 107) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7286 = 0.69921875F;
            } else {
                this.field7286 = (float) arg0.method3712((byte) 63) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7283 = 1.2F;
            } else {
                this.field7283 = (float) arg0.method3712((byte) 88) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3720(-19541);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3712((byte) 12);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3712((byte) -113);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3712((byte) 121);
            }
            this.field7286 = 0.69921875F;
            this.field7276 = class283.field4021;
            this.field7283 = 1.2F;
            this.field7281 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7275 = -50;
            this.field7273 = -50;
            this.field7270 = -60;
        } else {
            this.field7273 = arg0.method3756(65536);
            this.field7270 = arg0.method3756(65536);
            this.field7275 = arg0.method3756(65536);
        }
        if ((var2 & 0x20) == 0) {
            this.field7271 = class162.field2576;
        } else {
            this.field7271 = arg0.method3720(-19541);
        }
        if ((var2 & 0x40) == 0) {
            this.field7277 = 0;
        } else {
            this.field7277 = arg0.method3712((byte) 9);
        }
        if ((var2 & 0x80) == 0) {
            this.field7280 = class396.field5947;
        } else {
            int var3 = arg0.method3712((byte) -13);
            int var4 = arg0.method3712((byte) -112);
            int var5 = arg0.method3712((byte) -119);
            int var6 = arg0.method3712((byte) -6);
            int var7 = arg0.method3712((byte) 111);
            int var8 = arg0.method3712((byte) 3);
            this.field7280 = class336.method2128(var7, var6, var8, var4, (byte) 30, var3, var5);
        }
    }
}
