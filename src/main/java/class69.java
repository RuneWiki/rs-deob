import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class69 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "J")
    public long field962 = 0L;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field967 = 64;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    public static boolean field974 = false;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lbk;")
    public static class20 field977;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lhi;")
    public class219 field963;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lhi;")
    public class219 field965;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public static final void method468(int arg0, int arg1, int arg2) {
        field971++;
        class94.field1463 = class120.field1751 + class104.field1611 - arg0 - 1;
        class57.field804 = arg1 - class47.field599;
        int var3 = (int) ((float) class72.field1015.field3473 / class7.field106) + class57.field804;
        int var4 = class57.field804 - (int) ((float) class72.field1015.field3473 / class7.field106);
        if (arg2 > var4) {
            class57.field804 = (int) ((float) class72.field1015.field3473 / class7.field106);
        }
        int var5 = class94.field1463 - ((int) ((float) class72.field1015.field3369 / class7.field106));
        if (class165.field2565 < var3) {
            class57.field804 = class165.field2565 - ((int) ((float) class72.field1015.field3473 / class7.field106));
        }
        int var6 = (int) ((float) class72.field1015.field3369 / class7.field106) + class94.field1463;
        if (var5 < 0) {
            class94.field1463 = (int) ((float) class72.field1015.field3369 / class7.field106);
        }
        if (class104.field1611 < var6) {
            class94.field1463 = class104.field1611 - ((int) ((float) class72.field1015.field3369 / class7.field106));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method469(byte arg0) {
        if (arg0 != 93) {
            method472((byte) -46, -2);
        }
        field977 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public static final void method470(int arg0, int arg1) {
        class190.field2998.method1425(arg0, -120);
        if (arg1 <= 108) {
            field968 = 83;
        }
        class116.field1720.method1425(arg0, -123);
        field972++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILdl;)V")
    public static final void method471(int arg0, class123 arg1) {
        field973++;
        if (arg0 > -94) {
            method471(107, (class123) null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)V")
    public static final void method472(byte arg0, int arg1) {
        if (arg0 != -116) {
            field967 = 103;
        }
        field966++;
        class287 var2 = class261.method1786(arg1, false, 6);
        var2.method1912((byte) -68);
    }
}
