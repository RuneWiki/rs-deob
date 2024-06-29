import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class238 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lud;")
    public static class279 field4166 = class130.method1024("mapflag", 255);

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4173 = 1;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field4174 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lhc;")
    public static class171 field4171 = new class171(64);

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lud;")
    public static class279 field4179 = class130.method1024(")2", 255);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lud;")
    public static class279 field4178 = class130.method1024("violet:", 255);

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lud;")
    private static class279 field4181 = class130.method1024("wishes to trade with you)3", 255);

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lud;")
    public static class279 field4180 = class130.method1024("", 255);

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lud;")
    public static class279 field4183 = field4181;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lud;")
    public static class279 field4177 = class130.method1024("gleiten:", 255);

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
    public static boolean field4184 = false;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4182 = new CRC32();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public static int[] field4176;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[[B")
    public static byte[][] field4170;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIIII)V", line = 6)
    public static final void method1713(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4165++;
        class86.field1651 = arg5;
        class113.field2083 = arg4;
        if (arg1) {
            return;
        }
        class171.field3094 = arg2;
        class184.field3364 = arg0;
        class185.field3394 = arg3;
        if (class171.field3094 >= 100) {
            int var6 = class113.field2083 * 128 + 64;
            int var7 = class86.field1651 * 128 + 64;
            int var8 = class130.method1025(var6, 1008652135, class287.field5134, var7) - class185.field3394;
            int var9 = var6 - class21.field589;
            int var10 = var8 - class306.field5438;
            int var11 = var7 - class92.field1747;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class62.field1278 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class5.field124 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class62.field1278 < 128) {
                class62.field1278 = 128;
            }
            if (class62.field1278 > 383) {
                class62.field1278 = 383;
            }
        }
        class122.field2191 = 2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)V", line = 59)
    public static final void method1714(int arg0, long arg1) {
        try {
            if (arg0 != -23227) {
                field4173 = -52;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field4169++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 88)
    public static void method1715(int arg0) {
        field4166 = null;
        field4179 = null;
        field4178 = null;
        field4181 = null;
        field4170 = (byte[][]) null;
        field4171 = null;
        field4182 = null;
        if (arg0 == 0) {
            field4177 = null;
            field4183 = null;
            field4176 = null;
            field4180 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lud;II)V", line = 163)
    public static final void method1716(class279 arg0, int arg1, int arg2) {
        field4175++;
        class104 var3 = class293.method2085(3, arg1, false);
        var3.method879(0);
        var3.field1958 = arg0;
        if (arg2 != 248) {
            field4171 = (class171) null;
        }
    }
}
