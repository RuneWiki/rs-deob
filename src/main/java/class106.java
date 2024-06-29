import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class106 extends RuntimeException {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1512;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/lang/String;")
    public String field1505;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lwm;")
    private static class152 field1510 = class157.method1048("Please remove ", 119);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lwm;")
    public static class152 field1513 = field1510;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lwm;")
    public static class152 field1514 = null;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Lwm;")
    public static class152 field1515 = field1510;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    public static int[] field1506 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lne;")
    public static class235 field1507 = new class235(64);

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[I")
    public static int[] field1516 = new int[50];

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 4)
    public static void method705(int arg0) {
        field1507 = null;
        field1513 = null;
        field1516 = null;
        if (arg0 != 0) {
            field1510 = (class152) null;
        }
        field1515 = null;
        field1506 = null;
        field1510 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLwm;)V", line = 23)
    public static final void method706(byte arg0, class152 arg1) {
        field1509++;
        if (class225.field3656 == null) {
            return;
        }
        long var2 = arg1.method1013(arg0 ^ 0x48C4);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class225.field3656.length > var4 && class225.field3656[var4].field4689 != var2) {
            var4++;
        }
        if (class225.field3656.length <= var4 || class225.field3656[var4] == null) {
            return;
        }
        if (arg0 != -54) {
            field1510 = (class152) null;
        }
        class121.field1714++;
        class245.field4102.method1065(192, 126);
        class245.field4102.method1988(class225.field3656[var4].field4689, arg0 + 154);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 59)
    public static final void method707(int arg0, int arg1) {
        if (arg0 < 108) {
            method705(49);
        }
        class136.field2087[1] = (float) (class34.method251(65311, arg1) >> 8) / 255.0F;
        class136.field2087[0] = (float) (class34.method251(16714489, arg1) >> 16) / 255.0F;
        class136.field2087[2] = (float) class34.method251(255, arg1) / 255.0F;
        field1511++;
        class113.method758(3, -1);
        class113.method758(4, -1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Ldc;", line = 99)
    public static final class109 method708(boolean arg0) {
        field1508++;
        int var1 = class8.field106[0] * class253.field4383[0];
        byte[] var2 = class23.field403[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class134.field2070[class34.method251(var2[var4], 255)];
        }
        if (!arg0) {
            method706((byte) -32, (class152) null);
        }
        class109 var5 = new class109(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], var3);
        class132.method841((byte) -122);
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 124)
    public class106(Throwable arg0, String arg1) {
        this.field1512 = arg0;
        this.field1505 = arg1;
    }
}
