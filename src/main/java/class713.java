import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class713 {

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "F")
    public float field10068 = 1.0F;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "F")
    public float field10059 = 1.0F;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "F")
    public float field10062 = 0.25F;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "F")
    public float field10065;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public int field10056;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "F")
    public float field10067;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public int field10061;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field10069;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field10064;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lag;")
    public class710 field10053;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public int field10057;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "F")
    public float field10058;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public int field10052;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Laba;")
    public static class185 field10051 = new class185();

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field10066 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "[[I")
    public static int[][] field10063;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method4034(int arg0, int arg1, int arg2) {
        field10050++;
        int var3 = -43 / ((81 - arg0) / 38);
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lrv;B)V", line = 20)
    public final void method4035(class120 arg0, byte arg1) {
        this.field10068 = (float) (arg0.method842(2384) * 8) / 255.0F;
        if (arg1 != -1) {
            method4038((byte) 105, -117, null);
        }
        field10054++;
        this.field10062 = (float) (arg0.method842(2384) * 8) / 255.0F;
        this.field10059 = (float) (arg0.method842(2384) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lvm;B)Z", line = 39)
    public final boolean method4036(class713 arg0, byte arg1) {
        field10070++;
        if (arg1 == 124) {
            return this.field10057 == arg0.field10057 && this.field10058 == arg0.field10058 && this.field10067 == arg0.field10067 && this.field10065 == arg0.field10065 && this.field10062 == arg0.field10062 && this.field10068 == arg0.field10068 && this.field10059 == arg0.field10059 && this.field10061 == arg0.field10061 && this.field10069 == arg0.field10069 && this.field10053 == arg0.field10053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 53)
    public static final void method4037(byte arg0) {
        class731.field10209.method435(class553.field7874, class145.field1852.field8996.method1488((byte) -67) == 1 ? class566.field8014 + 256 << 2 : -1, 0);
        field10060++;
        if (arg0 != 110) {
            field10063 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILha;)V", line = 71)
    public static final void method4038(byte arg0, int arg1, class66 arg2) {
        field10055++;
        if (!class74.field991 || !class790.field10837) {
            class546.field7709 = 0;
            return;
        }
        if (class657.field9271) {
            class111.field1407 = class458.field6568.method274((byte) 80);
        }
        class73.field986 = 0;
        class550.field7818 = 0;
        class422.field5967 = 0;
        int[] var3 = arg2.method469();
        class684.field9711 = (int) ((float) var3[3] / 3.0F);
        class421.field5955 = (int) ((float) var3[2] / 3.0F);
        arg2.method470(class22.field331);
        if ((int) ((float) class22.field331[0] / 3.0F) != class286.field4384 || ((int) ((float) class22.field331[1] / 3.0F)) != class718.field10099) {
            class286.field4384 = (int) ((float) class22.field331[0] / 3.0F);
            class718.field10099 = (int) ((float) class22.field331[1] / 3.0F);
            class519.field7408 = class718.field10099 >> 1;
            class12.field248 = new int[class718.field10099 * class286.field4384];
            class709.field9997 = class286.field4384 >> 1;
        }
        class241.field3463 = arg2.method493();
        class546.field7709 = 0;
        for (int var4 = 0; var4 < class395.field5607; var4++) {
            class288.method1922(arg2, (byte) 108, arg1, class679.field9654[var4]);
        }
        if (arg0 >= -119) {
            field10066 = 14;
        }
        for (int var5 = 0; var5 < class115.field1451; var5++) {
            class288.method1922(arg2, (byte) 108, arg1, class498.field7080[var5]);
        }
        for (int var6 = 0; var6 < class445.field6329; var6++) {
            class288.method1922(arg2, (byte) 108, arg1, class359.field5221[var6]);
        }
        class683.field9698 = 0;
        if (class546.field7709 > 0) {
            int var7 = class12.field248.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
                class12.field248[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class12.field248[var9++] = Integer.MAX_VALUE;
            }
            class572.field8104 = 1;
            for (int var10 = 0; var10 < class546.field7709; var10++) {
                class302 var11 = class487.field6897[var10];
                class464.method2751(var11.field4531[1], (byte) -106, var11.field4531[0], var11.field4524[1], var11.field4531[3], var11.field4533[1], var11.field4524[0], var11.field4533[0], var11.field4524[3], var11.field4533[3]);
                class464.method2751(var11.field4531[2], (byte) -105, var11.field4531[1], var11.field4524[2], var11.field4531[3], var11.field4533[2], var11.field4524[1], var11.field4533[1], var11.field4524[3], var11.field4533[3]);
            }
            class572.field8104 = 2;
        }
        if (class657.field9271) {
            class666.field9379 = class458.field6568.method274((byte) 80) - class111.field1407;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 180)
    public static void method4039(int arg0) {
        if (arg0 == 0) {
            field10063 = null;
            field10051 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 205)
    public class713() {
        this.field10065 = 1.2F;
        this.field10056 = -50;
        this.field10067 = 0.69921875F;
        this.field10061 = class771.field10626;
        this.field10069 = 0;
        this.field10064 = -60;
        this.field10053 = class514.field7344;
        this.field10057 = class573.field8112;
        this.field10058 = 1.1523438F;
        this.field10052 = -50;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lrv;)V", line = 221)
    public class713(class120 arg0) {
        int var2 = arg0.method842(2384);
        if (class145.field1852.field8986.method968((byte) -112) == 1 && class731.field10209.method471() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field10057 = class573.field8112;
            } else {
                this.field10057 = arg0.method871(23995);
            }
            if ((var2 & 0x2) == 0) {
                this.field10058 = 1.1523438F;
            } else {
                this.field10058 = (float) arg0.method898((byte) -126) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field10067 = 0.69921875F;
            } else {
                this.field10067 = (float) arg0.method898((byte) -94) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field10065 = 1.2F;
            } else {
                this.field10065 = (float) arg0.method898((byte) -105) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method871(23995);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method898((byte) -116);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method898((byte) -104);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method898((byte) -104);
            }
            this.field10057 = class573.field8112;
            this.field10065 = 1.2F;
            this.field10067 = 0.69921875F;
            this.field10058 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field10064 = -60;
            this.field10056 = -50;
            this.field10052 = -50;
        } else {
            this.field10052 = arg0.method838(true);
            this.field10064 = arg0.method838(true);
            this.field10056 = arg0.method838(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field10061 = class771.field10626;
        } else {
            this.field10061 = arg0.method871(23995);
        }
        if ((var2 & 0x40) == 0) {
            this.field10069 = 0;
        } else {
            this.field10069 = arg0.method898((byte) -110);
        }
        if ((var2 & 0x80) == 0) {
            this.field10053 = class514.field7344;
        } else {
            int var3 = arg0.method898((byte) -96);
            int var4 = arg0.method898((byte) -98);
            int var5 = arg0.method898((byte) -88);
            int var6 = arg0.method898((byte) -121);
            int var7 = arg0.method898((byte) -125);
            int var8 = arg0.method898((byte) -115);
            this.field10053 = class250.method1672(var8, var7, (byte) 127, var4, var6, var3, var5);
        }
    }
}
