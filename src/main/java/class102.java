import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public boolean field1536 = true;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1538 = new Object();

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public int[] field1543 = new int[500];

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    public int[] field1545 = new int[500];

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field1546 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lec;")
    public static class25 field1547 = new class25(64);

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method664(int arg0) {
        if (arg0 != 0) {
            field1548 = 119;
        }
        field1547 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lkk;IBIZI)V")
    public static final void method665(class254[] arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 <= 13) {
            method667(false, 109);
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class254 var7 = arg0[var6];
            if (var7 != null && var7.field4167 == arg1) {
                class219.method1532(arg4, var7, arg5, -1, arg3);
                class137.method917((byte) -98, var7, arg3, arg5);
                if (var7.field4125 > (var7.field4081 - var7.field4152)) {
                    var7.field4125 = var7.field4081 - var7.field4152;
                }
                if ((var7.field4186 - var7.field4085) < var7.field4175) {
                    var7.field4175 = var7.field4186 - var7.field4085;
                }
                if (var7.field4175 < 0) {
                    var7.field4175 = 0;
                }
                if (var7.field4125 < 0) {
                    var7.field4125 = 0;
                }
                if (var7.field4052 == 0) {
                    class58.method358(arg4, var7, (byte) -16);
                }
            }
        }
        field1540++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLfa;)V")
    public static final void method666(byte arg0, class273 arg1) {
        field1535++;
        if (arg0 >= -43) {
            field1548 = -17;
        }
        class277.field4598 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
    public final void run() {
        field1539++;
        while (this.field1536) {
            Object var1 = this.field1538;
            synchronized (this.field1538) {
                if (this.field1546 < 500) {
                    this.field1545[this.field1546] = class1.field1;
                    this.field1543[this.field1546] = class60.field924;
                    this.field1546++;
                }
            }
            class96.method614(0, 50L);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    public static final void method667(boolean arg0, int arg1) {
        field1534++;
        if (arg0) {
            field1537 = 117;
        }
        class36 var2 = class161.method1067(4, arg1, (byte) 81);
        var2.method220(122);
    }
}
