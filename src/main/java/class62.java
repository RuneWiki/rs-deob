import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class62 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "F")
    public float field1094;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "F")
    public float field1091;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "F")
    public float field1087;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lke;")
    public static class256 field1092 = class316.method2202("Angreifen", 27626);

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lke;")
    public static class256 field1099 = class316.method2202("::fpson", 27626);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[J")
    public static long[] field1090 = new long[100];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lrj;")
    public static class254 field1098 = new class254(8);

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lke;")
    public static class256 field1104 = class316.method2202("Memory before cleanup=", 27626);

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "J")
    public static long field1103;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lta;")
    public static class82 field1096;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    public static int[] field1093;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 29)
    public static void method488(int arg0) {
        field1104 = null;
        field1093 = null;
        field1096 = null;
        field1090 = null;
        if (arg0 != 14920) {
            method489(32);
        }
        field1092 = null;
        field1099 = null;
        field1098 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 45)
    public class62() {
        this.field1088 = class169.field2997;
        this.field1094 = 1.1523438F;
        this.field1089 = 0;
        this.field1091 = 1.2F;
        this.field1100 = -50;
        this.field1087 = 0.69921875F;
        this.field1095 = class169.field2996;
        this.field1097 = -60;
        this.field1101 = -50;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lra;)V", line = 63)
    public class62(class41 arg0) {
        int var2 = arg0.method357(false);
        if ((var2 & 0x1) == 0) {
            this.field1088 = class169.field2997;
        } else {
            this.field1088 = arg0.method327(4);
        }
        if ((var2 & 0x2) == 0) {
            this.field1094 = 1.1523438F;
        } else {
            this.field1094 = (float) arg0.method346(-16) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1087 = 0.69921875F;
        } else {
            this.field1087 = (float) arg0.method346(-16) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1091 = 1.2F;
        } else {
            this.field1091 = (float) arg0.method346(-16) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1100 = -50;
            this.field1097 = -60;
            this.field1101 = -50;
        } else {
            this.field1100 = arg0.method309(2);
            this.field1097 = arg0.method309(2);
            this.field1101 = arg0.method309(2);
        }
        if ((var2 & 0x20) == 0) {
            this.field1095 = class169.field2996;
        } else {
            this.field1095 = arg0.method327(4);
        }
        if ((var2 & 0x40) == 0) {
            this.field1089 = 0;
        } else {
            this.field1089 = arg0.method346(-16);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 122)
    public static final void method489(int arg0) {
        field1102++;
        if (arg0 != -2) {
            field1098 = (class254) null;
        }
        if (class44.field830 == 0) {
            return;
        }
        try {
            if (++class248.field4222 > 1500) {
                if (class196.field3586 != null) {
                    class196.field3586.method1627(82);
                    class196.field3586 = null;
                }
                if (class102.field1839 >= 1) {
                    class44.field830 = 0;
                    class118.field2086 = -5;
                    return;
                }
                class44.field830 = 1;
                class248.field4222 = 0;
                if (class5.field89 == class320.field5490) {
                    class320.field5490 = class68.field1259;
                } else {
                    class320.field5490 = class5.field89;
                }
                class102.field1839++;
            }
            if (class44.field830 == 1) {
                class98.field1754 = class272.field4658.method32(class320.field5490, (byte) 123, class200.field3652);
                class44.field830 = 2;
            }
            if (class44.field830 == 2) {
                if (class98.field1754.field1500 == 2) {
                    throw new IOException();
                }
                if (class98.field1754.field1500 != 1) {
                    return;
                }
                class196.field3586 = new class243((Socket) class98.field1754.field1499, class272.field4658);
                class98.field1754 = null;
                class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, class308.field5322.field738);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                int var1 = class196.field3586.method1629(0);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                if (var1 != 101) {
                    class44.field830 = 0;
                    class118.field2086 = var1;
                    class196.field3586.method1627(arg0 + 121);
                    class196.field3586 = null;
                    return;
                }
                class44.field830 = 3;
            }
            if (class44.field830 == 3) {
                if (class196.field3586.method1633((byte) -5) >= 2) {
                    int var2 = class196.field3586.method1629(0) << 8 | class196.field3586.method1629(0);
                    class154.method1154(-107, var2);
                    if (class240.field4089 == -1) {
                        class118.field2086 = 6;
                        class44.field830 = 0;
                        class196.field3586.method1627(88);
                        class196.field3586 = null;
                        return;
                    }
                    class44.field830 = 0;
                    class196.field3586.method1627(82);
                    class196.field3586 = null;
                    class270.method1864(-1);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class196.field3586 != null) {
                class196.field3586.method1627(arg0 ^ 0xFFFFFF9E);
                class196.field3586 = null;
            }
            if (class102.field1839 >= 1) {
                class44.field830 = 0;
                class118.field2086 = -4;
            } else {
                class44.field830 = 1;
                if (class5.field89 == class320.field5490) {
                    class320.field5490 = class68.field1259;
                } else {
                    class320.field5490 = class5.field89;
                }
                class248.field4222 = 0;
                class102.field1839++;
            }
        }
    }
}
