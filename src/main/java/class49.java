import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class49 extends class130 {

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lsd;")
    private static class166 field901 = class135.method935("Please try again)3", 0);

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Lsd;")
    public static class166 field909 = class135.method935("<col=ffff00>", 0);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lsd;")
    public static class166 field908 = field901;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field907 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Z")
    public static boolean field913 = false;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lsd;")
    public static class166 field912 = class135.method935(":duelreq:", 0);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lsd;ILff;)I")
    public static final int method375(class166 arg0, int arg1, class53 arg2) {
        field900++;
        int var3 = arg2.field1000;
        arg2.method434((byte) -98, arg0.field3187);
        if (arg1 != 4) {
            field912 = null;
        }
        arg2.field1000 += class127.field2502.method922(arg0.field3187, arg2.field988, (byte) -21, arg0.field3162, 0, arg2.field1000);
        return arg2.field1000 - var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
    public static final int method376(byte arg0) {
        int var1 = class119.method864(class38.field690, class22.field385, class165.field3130, true);
        field906++;
        if (arg0 != 104) {
            method377(-8);
        }
        return var1 - class61.field1242 >= 800 || (class122.field2387[class165.field3130][class38.field690 >> 7][class22.field385 >> 7] & 0x4) == 0 ? 3 : class165.field3130;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static void method377(int arg0) {
        field907 = null;
        field912 = null;
        field901 = null;
        field908 = null;
        if (arg0 == 26885) {
            field909 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
    public class49(int arg0, int arg1) {
        this.field903 = arg0;
        this.field904 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
    public static final void method378(byte arg0, boolean arg1) {
        field902++;
        if (class156.field2997 == null) {
            return;
        }
        try {
            class53 var2 = new class53(4);
            var2.method429(arg1 ? 2 : 3, (byte) 111);
            if (arg0 != -122) {
                method377(15);
            }
            var2.method392(-114, 0);
            class156.field2997.method15(4, 0, (byte) -102, var2.field988);
        } catch (IOException var4) {
            try {
                class156.field2997.method12((byte) -90);
            } catch (Exception var3) {
            }
            class156.field2997 = null;
            class58.field1193++;
        }
    }
}
