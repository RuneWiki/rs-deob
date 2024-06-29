import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class292 {

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "Z")
    private boolean field4184;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Z")
    private boolean field4187;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "Z")
    public static boolean field4188 = false;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "Lkr;")
    public static class602 field4189 = new class602(117, 3);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "Lru;")
    public static class683 field4195;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Z")
    public final boolean method1932(int arg0) {
        if (arg0 == 16383) {
            field4196++;
            return this.field4187;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)I")
    public final int method1933(int arg0) {
        field4198++;
        if (arg0 != 0) {
            field4190 = -109;
        }
        return this.field4194;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)I")
    public final int method1934(int arg0) {
        if (arg0 != 10135) {
            method1936(82, -92);
        }
        field4183++;
        return this.field4193;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Z")
    public final boolean method1935(byte arg0) {
        field4191++;
        return arg0 == 123 ? this.field4184 : true;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)V")
    public static final void method1936(int arg0, int arg1) {
        if (arg0 == 32768) {
            field4192++;
            class522.field7267.method3896(1, arg1);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lni;Z)V")
    public static final void method1937(class515 arg0, boolean arg1) {
        field4185++;
        if (arg0.field7143 == null && arg0.field7128 == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < arg0.field7143.length; var3++) {
            int var4 = -1;
            if (arg0.field7143 != null) {
                var4 = arg0.field7143[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var10;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    int var9 = var7 & 0x3FFF;
                    var10 = arg0.field4410 - ((var8 - class113.field1509) * 512) - 256;
                    var11 = arg0.field4418 - ((var9 - class587.field7995) * 512) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class234 var12 = (class234) class372.field5245.method812(119, (long) var4);
                    if (var12 == null) {
                        arg0.method3074(var3, arg1, -1);
                        continue;
                    }
                    class679 var13 = var12.field3471;
                    var11 = arg0.field4418 - var13.field4418;
                    var10 = arg0.field4410 - var13.field4410;
                } else {
                    int var14 = var4 & 0x7FFF;
                    class96 var15 = class251.field3675[var14];
                    if (var15 == null) {
                        arg0.method3074(var3, true, -1);
                        continue;
                    }
                    var10 = arg0.field4410 - var15.field4410;
                    var11 = arg0.field4418 - var15.field4418;
                }
                if (var10 != 0 || var11 != 0) {
                    arg0.method3074(var3, arg1, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg0.method3074(var3, true, -1)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field7128 = null;
            arg0.field7143 = null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field4189 = null;
        if (arg0 != 0) {
            field4190 = -72;
        }
        field4195 = null;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(ZIIZ)V")
    public class292(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field4194 = arg2;
        this.field4184 = arg3;
        this.field4193 = arg1;
        this.field4187 = arg0;
    }
}
