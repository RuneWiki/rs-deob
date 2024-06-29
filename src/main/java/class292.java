import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class292 extends class197 {

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "[I")
    private int[] field4352 = new int[this.field2781];

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Lui;")
    public static class375 field4349 = new class375("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "Z")
    public static boolean field4351 = false;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "[B")
    private byte[] field4347;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method1889(boolean arg0) {
        ++field4355;
        if (!arg0) {
            field4350 = 123;
        }
        if (~class16.field266 != -1) {
            try {
                if (~(++class152.field2186) < -2001) {
                    if (class81.field1092 != null) {
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                    }
                    if (class35.field567 >= 1) {
                        class16.field266 = 0;
                        class443.field6602 = -5;
                        return;
                    }
                    class152.field2186 = 0;
                    if (class529.field7815 == class391.field5947) {
                        class529.field7815 = class116.field1635;
                    } else {
                        class529.field7815 = class391.field5947;
                    }
                    class16.field266 = 1;
                    ++class35.field567;
                }
                if (~class16.field266 == -2) {
                    class170.field2472 = class419.field6254.method2814(class529.field7815, class244.field3414, 0);
                    class16.field266 = 2;
                }
                if (class16.field266 == 2) {
                    if (~class170.field2472.field1791 == -3) {
                        throw new IOException();
                    }
                    if (~class170.field2472.field1791 != -2) {
                        return;
                    }
                    class81.field1092 = new class501((Socket) class170.field2472.field1793, class419.field6254);
                    class170.field2472 = null;
                    class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                    class273.method1740(true);
                    int var1 = class81.field1092.method3000((byte) 125);
                    class273.method1740(true);
                    if (var1 != 21) {
                        class16.field266 = 0;
                        class443.field6602 = var1;
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                        return;
                    }
                    class16.field266 = 3;
                }
                if (class16.field266 == 3) {
                    if (class81.field1092.method2995((byte) 81) < 1) {
                        return;
                    }
                    class64.field899 = new String[class81.field1092.method3000((byte) 78)];
                    class16.field266 = 4;
                }
                if (~class16.field266 == -5) {
                    if (~class81.field1092.method2995((byte) 123) <= ~(class64.field899.length * 8)) {
                        class486.field7134.field1292 = 0;
                        class81.field1092.method2997(class486.field7134.field1277, class64.field899.length * 8, (byte) 98, 0);
                        for (int var2 = 0; ~var2 > ~class64.field899.length; ++var2) {
                            class64.field899[var2] = class192.method1352((byte) -38, class486.field7134.method607(-76));
                        }
                        class443.field6602 = 21;
                        class16.field266 = 0;
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                    }
                }
            } catch (IOException var3) {
                if (class81.field1092 != null) {
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                }
                if (class35.field567 >= 1) {
                    class16.field266 = 0;
                    class443.field6602 = -4;
                } else {
                    class152.field2186 = 0;
                    ++class35.field567;
                    if (~class529.field7815 == ~class391.field5947) {
                        class529.field7815 = class116.field1635;
                    } else {
                        class529.field7815 = class391.field5947;
                    }
                    class16.field266 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLbo;)Z", line = 148)
    public static final boolean method1890(byte arg0, class24 arg1) {
        ++field4344;
        if (arg0 >= -12) {
            method1891(38);
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field378) {
            return false;
        } else if (!arg1.method194((byte) 99, class135.field1954)) {
            return false;
        } else if (class396.field6016.method943((long) arg1.field387, -1) != null) {
            return false;
        } else {
            return class169.field2459.method943((long) arg1.field393, -1) == null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V", line = 176)
    public final void method12(byte arg0) {
        this.field4343 = Math.abs(this.field4343);
        ++field4345;
        if (~this.field4343 <= -4097) {
            this.field4343 = 4095;
        }
        if (arg0 > 87) {
            this.method485((byte) (this.field4343 >> 4), this.field4348++, false);
            this.field4343 = 0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIZ)V", line = 197)
    public void method485(byte arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method485((byte) 74, -16, false);
        }
        ++field4354;
        this.field4347[this.field4348++] = (byte) (127 + class494.method2942(arg0 >> 1, 127));
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 208)
    public final void method1(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            ++field4356;
            this.field4343 += this.field4352[arg1] * arg0 >> 12;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIF)V", line = 220)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field2781 < ~var7; ++var7) {
            this.field4352[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 243)
    public final void method8(int arg0) {
        this.field4348 = 0;
        ++field4346;
        this.field4343 = 0;
        if (arg0 > -45) {
            field4350 = 126;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 258)
    public static void method1891(int arg0) {
        int var1 = -71 % ((arg0 - -57) / 63);
        field4349 = null;
    }
}
