import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class576 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lrl;")
    public static class672 field8211 = new class672(70, 7);

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lrl;")
    public static class672 field8213 = new class672(38, 4);

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field8218 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field8207;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field8209;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field8210;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field8214;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lpt;")
    public static class491 field8216;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[Lica;")
    public static class615[] field8217;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3376(int arg0, int arg1) {
        if (arg1 != -6347) {
            field8217 = null;
        }
        field8208++;
        for (class295 var2 = (class295) class307.field4831.method3465((byte) 102); var2 != null; var2 = (class295) class307.field4831.method3469(0)) {
            if (class511.method3098(false, var2.field4631) && ((long) arg0) == var2.field4627) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 27)
    public static void method3377(int arg0) {
        if (arg0 != 7) {
            field8217 = null;
        }
        field8217 = null;
        field8213 = null;
        field8216 = null;
        field8211 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)I", line = 40)
    public static final int method3378(int arg0, int arg1) {
        if (arg1 != 127) {
            method3379(-48, (byte) 28);
        }
        field8212++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Lmh;", line = 52)
    public static final class585 method3379(int arg0, byte arg1) {
        field8215++;
        class585 var2 = (class585) class661.field9216.method560(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field1071.method926(1, -127, arg0);
        int var4 = -25 / ((arg1 - 12) / 55);
        class585 var5 = new class585();
        var5.field8338 = arg0;
        if (var3 != null) {
            var5.method3427(0, new class6(var3));
        }
        var5.method3430((byte) -111);
        if (var5.field8318 == 2 && class140.field2364.method1558((long) arg0, (byte) -93) == null) {
            class140.field2364.method1564((long) arg0, new class160(class458.field6859), (byte) 90);
            class565.field8115[class458.field6859++] = var5;
        }
        class661.field9216.method559(var5, (long) arg0, 0);
        return var5;
    }
}
