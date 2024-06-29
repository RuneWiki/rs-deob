import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class273 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public int field4082 = 8;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public int field4087 = 128;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public int field4095 = 0;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
    public boolean field4086 = true;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
    public boolean field4094 = false;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Z")
    public boolean field4092 = true;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public int field4097 = -1;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public int field4099 = 1190717;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public int field4089 = -1;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public int field4098 = 16;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
    public static int[] field4083 = new int[2500];

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4090 = "Walk here";

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "F")
    public static float field4084;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 4)
    public static void method1879(int arg0) {
        if (arg0 == 1190717) {
            field4083 = null;
            field4090 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILcg;I)V", line = 39)
    private final void method1880(byte arg0, int arg1, class316 arg2, int arg3) {
        field4093++;
        if (arg3 == 1) {
            this.field4095 = class253.method1732(arg2.method2210((byte) -5), (byte) -71);
        } else if (arg3 == 2) {
            this.field4097 = arg2.method2219(16448);
        } else if (arg3 == 3) {
            this.field4097 = arg2.method2220((byte) 70);
            if (this.field4097 == 65535) {
                this.field4097 = -1;
            }
        } else if (arg3 == 5) {
            this.field4086 = false;
        } else if (arg3 == 7) {
            this.field4089 = class253.method1732(arg2.method2210((byte) -5), (byte) -71);
        } else if (arg3 == 8) {
            class151.field2092 = arg1;
        } else if (arg3 == 9) {
            this.field4087 = arg2.method2220((byte) 56);
        } else if (arg3 == 10) {
            this.field4092 = false;
        } else if (arg3 == 11) {
            this.field4082 = arg2.method2219(arg0 ^ 0x4047);
        } else if (arg3 == 12) {
            this.field4094 = true;
        } else if (arg3 == 13) {
            this.field4099 = arg2.method2210((byte) -5);
        } else if (arg3 == 14) {
            this.field4098 = arg2.method2219(16448);
        }
        if (arg0 != 7) {
            this.field4097 = -74;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILcg;)V", line = 119)
    public final void method1881(int arg0, int arg1, class316 arg2) {
        if (arg0 > -84) {
            this.method1881(-72, -29, (class316) null);
        }
        while (true) {
            int var4 = arg2.method2219(16448);
            if (var4 == 0) {
                field4096++;
                return;
            }
            this.method1880((byte) 7, arg1, arg2, var4);
        }
    }
}
