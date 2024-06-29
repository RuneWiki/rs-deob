import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class620 {

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public int field8955 = 1;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
    public boolean field8951 = false;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field8949 = 64;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field8950 = 64;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public int field8958 = 2;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public int field8954 = -1;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Z")
    public boolean field8953 = false;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "Z")
    public static boolean field8959 = false;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFFI)F", line = 13)
    public static final float method3558(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != 64) {
            method3563(null, (byte) -40);
        }
        field8947++;
        return (arg1 - arg2) * arg0 + arg2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method3559(int arg0, byte arg1) {
        field8948++;
        if (class528.field7392 == arg0) {
            return;
        }
        class106.field1289 = class422.field5452 = class602.field8688[arg0];
        class589.method3416(697608907);
        class405.field5331 = new int[class106.field1289][class422.field5452];
        class415.field5397 = new int[4][class106.field1289 >> 3][class422.field5452 >> 3];
        class457.field6296 = new int[class106.field1289][class422.field5452];
        for (int var2 = 0; var2 < 4; var2++) {
            class309.field3939[var2] = class4.method25(-128, class422.field5452, class106.field1289);
        }
        class250.field3223 = new byte[4][class106.field1289][class422.field5452];
        class303.method1674(10417, class422.field5452, class106.field1289, 4);
        class426.method2401(class422.field5452 >> 3, class210.field2560, class106.field1289 >> 3, 26879);
        class528.field7392 = arg0;
        if (arg1 <= 1) {
            field8959 = false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Los;III)V", line = 62)
    private final void method3560(class374 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 5) {
            this.method3560(null, -15, -121, -57);
        }
        if (arg1 == 1) {
            this.field8954 = arg0.method2136(false);
            if (this.field8954 == 65535) {
                this.field8954 = -1;
            }
        } else if (arg1 == 2) {
            this.field8949 = arg0.method2136(false) + 1;
            this.field8950 = arg0.method2136(false) + 1;
        } else if (arg1 == 3) {
            arg0.method2124(-116);
        } else if (arg1 == 4) {
            this.field8958 = arg0.method2129(-106);
        } else if (arg1 == 5) {
            this.field8955 = arg0.method2129(-103);
        } else if (arg1 == 6) {
            this.field8951 = true;
        } else if (arg1 == 7) {
            this.field8953 = true;
        }
        field8956++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 115)
    public static final void method3561(String[] arg0, byte arg1, short[] arg2) {
        class170.method952(0, arg0, arg0.length - 1, arg2, 1);
        int var3 = -14 / ((arg1 - 39) / 62);
        field8957++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BILos;)V", line = 129)
    public final void method3562(byte arg0, int arg1, class374 arg2) {
        field8952++;
        if (arg0 != 65) {
            method3561(null, (byte) 71, null);
        }
        while (true) {
            int var4 = arg2.method2129(-117);
            if (var4 == 0) {
                return;
            }
            this.method3560(arg2, var4, 5, arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ldn;B)V", line = 163)
    public static final void method3563(class438 arg0, byte arg1) {
        class457.field6295 = 0;
        class372.field4892 = 0;
        field8960++;
        class388.field5129 = new class354();
        class295.field3807 = new class68[1024];
        class546.field8042 = new class455[class230.field2853[class557.field8210] + 1];
        class413.field5364 = 0;
        class48.field402 = 0;
        if (arg1 != -90) {
            field8959 = true;
        }
        class557.method3258((byte) 118, arg0);
        class348.method1940(arg0, -123);
    }
}
