import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class435 {

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public int field6064 = 128;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public int field6073 = 128;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public int field6071;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public int field6062;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public int field6061;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public int field6070;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Lsba;")
    public static class558 field6066;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
    public static boolean field6063;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILuu;)V", line = 6)
    public static final void method2682(int arg0, class237 arg1) {
        class199.field2664 = 0;
        if (arg0 < 1) {
            method2683(83, 7, -65);
        }
        field6072++;
        class485.field6767 = 0;
        client.field6236 = new class244();
        class223.field3012 = new class502[1024];
        class139.field1983 = new class689[class253.field3708[class709.field9896] + 1];
        class173.field2400 = 0;
        class409.field5846 = 0;
        class509.method3053(arg1, 26);
        class133.method832((byte) 71, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V", line = 25)
    public static final void method2683(int arg0, int arg1, int arg2) {
        field6067++;
        int var3 = class535.field7417.method1133(108, class155.field2143.method978(class120.field1576, (byte) -120));
        int var5;
        if (class17.field153) {
            for (class272 var7 = (class272) class176.field2411.method3828(99); var7 != null; var7 = (class272) class176.field2411.method3829(-29202)) {
                int var10;
                if (var7.field3953 == 1) {
                    var10 = class428.method2659((class558) var7.field3951.field9462.field33, 107);
                } else {
                    var10 = class607.method3454(var7, (byte) 110);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            class178.field2450 = (class484.field6743 ? 26 : 22) + class569.field7865 * 16;
            var5 = class569.field7865 * 16 + 21;
            var3 += 8;
        } else {
            for (class558 var4 = (class558) class290.field4161.method3618(-64); var4 != null; var4 = (class558) class290.field4161.method3619(0)) {
                int var6 = class428.method2659(var4, -116);
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class284.field4103 * 16 + 21;
            class178.field2450 = (class484.field6743 ? 26 : 22) + class284.field4103 * 16;
        }
        if (arg0 >= -59) {
            method2684(-31);
        }
        int var8 = arg1 - (var3 / 2);
        if ((var3 + var8) > class118.field1561) {
            var8 = class118.field1561 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (class553.field7716 < (var5 + arg2)) {
            var9 = class553.field7716 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class401.field5750 = var8;
        class746.field10270 = var3;
        class25.field320 = true;
        class686.field9524 = var9;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 110)
    public static void method2684(int arg0) {
        if (arg0 != -18387) {
            field6063 = false;
        }
        field6066 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lps;I)V", line = 123)
    public final void method2685(class435 arg0, int arg1) {
        field6069++;
        this.field6062 = arg0.field6062;
        this.field6073 = arg0.field6073;
        this.field6070 = arg0.field6070;
        this.field6071 = arg0.field6071;
        if (arg1 < -51) {
            this.field6064 = arg0.field6064;
            this.field6061 = arg0.field6061;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V", line = 161)
    public class435(int arg0) {
        this.field6071 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIII)V", line = 168)
    private class435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6064 = arg1;
        this.field6071 = arg0;
        this.field6062 = arg5;
        this.field6061 = arg3;
        this.field6070 = arg4;
        this.field6073 = arg2;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lps;", line = 148)
    public final class435 method2686(int arg0) {
        field6065++;
        if (arg0 != 17294) {
            this.field6062 = -45;
        }
        return new class435(this.field6071, this.field6064, this.field6073, this.field6061, this.field6070, this.field6062);
    }
}
