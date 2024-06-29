import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class678 implements class493 {

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public int field9605;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public int field9600;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "[F")
    public float[] field9602;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lpia;")
    public static class94 field9606 = new class94(11, -1);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V", line = 3)
    public static final void method3847(int arg0, int arg1, int arg2) {
        field9604++;
        class47 var3 = class258.method1546(14, arg1, (byte) 121);
        if (arg0 == -10700) {
            var3.method271((byte) 126);
            var3.field507 = arg2;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V", line = 20)
    public static void method3848(int arg0) {
        field9606 = null;
        if (arg0 != 320) {
            method3849(-37, 5, -111);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(III)Z", line = 30)
    public static final boolean method3849(int arg0, int arg1, int arg2) {
        field9601++;
        if (arg2 == -1) {
            return (arg1 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII)V", line = 42)
    public static final void method3850(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 24892) {
            field9603++;
            class71 var4 = class97.field1020[arg1][arg0];
            class508.method3010(var4 == null ? class13.field104 : var4, (byte) 40, arg2);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZJ)V", line = 57)
    public static final void method3851(boolean arg0, long arg1) {
        field9599++;
        int var3 = class175.field2062;
        if (class496.field7015 != var3) {
            int var4 = var3 - class496.field7015;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class496.field7015 += var5;
        }
        int var6 = class246.field2994;
        class227.field2590 += (float) arg1 * class144.field1602 / 40.0F * 8.0F;
        if (class559.field7986 != var6) {
            int var7 = var6 - class559.field7986;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class559.field7986 += var8;
        }
        class308.field3835 += (float) arg1 * class319.field4068 / 40.0F * 8.0F;
        if (!arg0) {
            field9606 = null;
        }
        class472.method2850(1536);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(II)V", line = 137)
    public class678(int arg0, int arg1) {
        this.field9605 = arg1;
        this.field9600 = arg0;
        this.field9602 = new float[arg0 * arg1];
    }
}
