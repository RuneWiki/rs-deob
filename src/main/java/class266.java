import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class266 {

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "[I")
    public static int[] field3807 = new int[3];

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method1735(boolean arg0) {
        field3809++;
        return arg0 ? class228.field3061 == this | class125.field1519 == this : true;
    }

    @OriginalMember(owner = "client!tia", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field3808++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZIIIIB)V", line = 25)
    public static final void method1736(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3806++;
        if (class272.field3891 != null && (arg2 != 3 || class466.field6607 != arg4 || class756.field10514 != arg1)) {
            class3.method13(class202.field2644, (byte) -104, class272.field3891);
            class272.field3891 = null;
        }
        if (arg2 == 3 && class272.field3891 == null) {
            class272.field3891 = class140.method987(class202.field2644, arg4, 0, 0, arg1, arg5 ^ 0x6B);
            if (class272.field3891 != null) {
                class756.field10514 = arg1;
                class466.field6607 = arg4;
                class90.method681(10343);
            }
        }
        if (arg2 == 3 && class272.field3891 == null) {
            method1736(true, -1, class557.field7812.field6551.method290(false), arg3, -1, (byte) -102);
            return;
        }
        Container var7;
        if (class272.field3891 != null) {
            var7 = class272.field3891;
            class494.field7122 = arg4;
            class261.field3756 = arg1;
        } else if (class387.field5484 == null) {
            if (class213.field2800 == null) {
                var7 = class125.field1524;
            } else {
                var7 = class213.field2800;
            }
            class494.field7122 = var7.getSize().width;
            class261.field3756 = var7.getSize().height;
        } else {
            Insets var6 = class387.field5484.getInsets();
            int var10001 = var6.right + var6.left;
            class494.field7122 = class387.field5484.getSize().width - var10001;
            int var10 = var6.top + var6.bottom;
            class261.field3756 = class387.field5484.getSize().height - var10;
            var7 = class387.field5484;
        }
        if (arg2 == 1) {
            class446.field6323 = class192.field2561;
            class172.field2348 = class191.field2553;
            class633.field8741 = (class494.field7122 - class192.field2561) / 2;
            class657.field9009 = 0;
        } else {
            class438.method2645((byte) -27);
        }
        if (class408.field5781 != class277.field3922) {
            boolean var10000;
            if (class446.field6323 < 1024 && class172.field2348 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class95.method701((byte) -74);
        } else {
            class366.field5196.setSize(class446.field6323, class172.field2348);
            if (class589.field8295) {
                class272.method1772(-127, class366.field5196);
            } else {
                class268.field3831.method385(class366.field5196, class446.field6323, class172.field2348);
            }
            if (class387.field5484 == var7) {
                Insets var8 = class387.field5484.getInsets();
                class366.field5196.setLocation(var8.left + class633.field8741, var8.top - -class657.field9009);
            } else {
                class366.field5196.setLocation(class633.field8741, class657.field9009);
            }
        }
        if (arg2 >= 2) {
            class245.field3279 = true;
        } else {
            class245.field3279 = false;
        }
        if (arg5 != -102) {
            method1740(null, -109);
        }
        if (class457.field6447 != -1) {
            class364.method2320(true, -14543);
        }
        if (class333.field4663 != null && class349.method2250((byte) 35, class222.field2897)) {
            class383.method2433(-116);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class583.field8210[var9] = true;
        }
        class202.field2642 = true;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)V", line = 158)
    public static final void method1737(int arg0, int arg1) {
        class165 var2 = class553.field7776[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class165 var4 = class553.field7776[var3][arg0][arg1] = class553.field7776[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class356 var5 = var4.field2270; var5 != null; var5 = var5.field5066) {
                    class524 var6 = var5.field5067;
                    if (var6.field7415 == arg0 && var6.field7418 == arg1) {
                        var6.field1266--;
                    }
                }
                if (var4.field2266 != null) {
                    var4.field2266.field1266--;
                }
                if (var4.field2269 != null) {
                    var4.field2269.field1266--;
                }
                if (var4.field2265 != null) {
                    var4.field2265.field1266--;
                }
                if (var4.field2267 != null) {
                    var4.field2267.field1266--;
                }
                if (var4.field2278 != null) {
                    var4.field2278.field1266--;
                }
            }
        }
        if (class553.field7776[0][arg0][arg1] == null) {
            class553.field7776[0][arg0][arg1] = new class165(0);
            class553.field7776[0][arg0][arg1].field2274 = 1;
        }
        class553.field7776[0][arg0][arg1].field2272 = var2;
        class553.field7776[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 211)
    public static void method1738(int arg0) {
        field3807 = null;
        if (arg0 != 11677) {
            method1739(68, null);
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILml;)V", line = 225)
    public static final void method1739(int arg0, class387 arg1) {
        arg1.field5483 = null;
        field3804++;
        int var2 = arg1.field5482.length;
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1.field5482[var3].field1987 = false;
        }
        class360[] var4 = class239.field3195;
        synchronized (class239.field3195) {
            if (class239.field3195.length > var2 && class95.field1115[var2] < 200) {
                class239.field3195[var2].method2307(arg0, arg1);
                int var10002 = class95.field1115[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 255)
    public static final boolean method1740(String arg0, int arg1) {
        field3805++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class215.field2828; var2++) {
            if (arg0.equalsIgnoreCase(class703.field9786[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class660.field9039.field3965);
    }
}
