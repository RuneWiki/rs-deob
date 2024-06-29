import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class44 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "J")
    public static long field563 = 0L;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Llf;")
    public static class211 field562 = new class211(64);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method331(int arg0) {
        class55.method397(0, class243.field3885);
        field566++;
        class248.field3969++;
        if (class86.field1365 && class154.field2293) {
            int var1 = class31.field416;
            int var2 = class141.field2074;
            int var3 = var2 - class1.field12;
            int var4 = var1 - class1.field5;
            if (class17.field196 > var3) {
                var3 = class17.field196;
            }
            if (var3 + class243.field3885.field3369 > class17.field196 + class105.field1622.field3369) {
                var3 = class17.field196 + class105.field1622.field3369 - class243.field3885.field3369;
            }
            if (var4 < class3.field40) {
                var4 = class3.field40;
            }
            int var5 = var3 - class223.field3606;
            if (arg0 != -2) {
                method337(109, (byte) 12);
            }
            if (var4 + class243.field3885.field3473 > class3.field40 - -class105.field1622.field3473) {
                var4 = class3.field40 + class105.field1622.field3473 - class243.field3885.field3473;
            }
            int var6 = var4 - class2.field18;
            int var7 = class243.field3885.field3340;
            if (class243.field3885.field3349 < class248.field3969 && (var6 > var7 || var6 < -var7 || var5 > var7 || (-var7) > var5)) {
                class91.field1390 = true;
            }
            int var8 = class105.field1622.field3448 + var4 - class3.field40;
            int var9 = class105.field1622.field3455 + var3 - class17.field196;
            if (class243.field3885.field3395 != null && class91.field1390) {
                class142 var10 = new class142();
                var10.field2079 = class243.field3885;
                var10.field2078 = var9;
                var10.field2084 = var8;
                var10.field2086 = class243.field3885.field3395;
                class202.method1390(var10, (byte) -120);
            }
            if (class106.field1638 == 0) {
                if (class91.field1390) {
                    if (class243.field3885.field3456 != null) {
                        class142 var11 = new class142();
                        var11.field2086 = class243.field3885.field3456;
                        var11.field2078 = var9;
                        var11.field2079 = class243.field3885;
                        var11.field2084 = var8;
                        var11.field2081 = class136.field2036;
                        class202.method1390(var11, (byte) -79);
                    }
                    if (class136.field2036 != null && client.method1032(class243.field3885) != null) {
                        class218.field3552++;
                        class13.field165.method892(9, (byte) -106);
                        class13.field165.method210(class136.field2036.field3474, (byte) 72);
                        class13.field165.method178(arg0 + 130, class136.field2036.field3471);
                        class13.field165.method193((byte) 93, class243.field3885.field3471);
                        class13.field165.method210(class243.field3885.field3474, (byte) 72);
                    }
                } else if ((class190.field3017 == 1 || class90.method606(4626, class245.field3920 - 1)) && class245.field3920 > 2) {
                    class95.method632(87);
                } else if (class245.field3920 > 0) {
                    class73.method497((byte) 38);
                }
                class243.field3885 = null;
            }
        } else if (class248.field3969 > 1) {
            class243.field3885 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public abstract void method332(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public abstract void method333(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method334(int arg0) {
        field562 = null;
        if (arg0 != 0) {
            field568 = -91;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method335(String arg0, byte arg1, int arg2) {
        field561++;
        if (arg1 != 61) {
            field568 = 122;
        }
        class287 var3 = class261.method1786(arg2, false, 2);
        var3.method1914((byte) 46);
        var3.field4554 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
    public class44(int arg0, int arg1, int arg2) {
        this.field567 = arg2;
        this.field564 = arg0;
        this.field565 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)V")
    public abstract void method336(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
    public static final void method337(int arg0, byte arg1) {
        if (arg1 != 84) {
            method334(-44);
        }
        field569++;
        class287 var2 = class261.method1786(arg0, false, 8);
        var2.method1912((byte) -90);
    }
}
