import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class181 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Z")
    public static boolean field3170 = false;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lpj;")
    public static class237 field3172 = class33.method353("M", 41);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lpj;")
    public static class237 field3178 = class33.method353("Verbindung zum Update)2Server hergestellt)3", 113);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lpj;")
    public static class237 field3177 = null;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[Leh;")
    public static class80[] field3179 = new class80[27];

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
    public static boolean field3173;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lkf;")
    public static final class176 method1241(int arg0, int arg1) {
        field3175++;
        class176 var2 = (class176) class190.field3304.method940((long) arg1, 44);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3620.method1645(true, arg1, arg0);
        class176 var4 = new class176();
        if (var3 != null) {
            var4.method1215(126, new class32(var3));
        }
        class190.field3304.method937(arg0 - 126, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field3172 = null;
        field3178 = null;
        if (arg0 != 16) {
            field3169 = -120;
        }
        field3179 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    public static final void method1243(byte arg0, int arg1) {
        field3171++;
        class23.field414.method939(arg1, 1);
        class111.field1950.method939(arg1, 1);
        class114.field2007.method939(arg1, 1);
        if (arg0 <= 39) {
            field3172 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)J")
    public static final synchronized long method1244(byte arg0) {
        field3176++;
        long var1 = System.currentTimeMillis();
        if (class92.field1666 > var1) {
            class113.field1972 += class92.field1666 - var1;
        }
        if (arg0 >= -5) {
            method1242(-16);
        }
        class92.field1666 = var1;
        return class113.field1972 + var1;
    }
}
