import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class65 {

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[I")
    public static int[] field896 = new int[4];

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field897 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Ljava/lang/String;")
    public String field891;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field888;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 5)
    public static void method405(int arg0) {
        if (arg0 != 1) {
            method405(-78);
        }
        field896 = null;
        field888 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILss;ZI)V", line = 22)
    public static final void method406(int arg0, class295 arg1, boolean arg2, int arg3) {
        field889++;
        if (!arg2) {
            field893 = 43;
        }
        if (class297.field4101) {
            class89 var4 = class352.field4810 == -1 ? null : class284.field3819.method1088(class352.field4810, (byte) -120);
            if (client.method1191(arg1).method1224(26591) && (class450.field6497 & 0x20) != 0) {
                if (var4 == null || arg1.method1684(class352.field4810, -1, var4.field1220) != var4.field1220) {
                    class376.method2167(arg1.field3936, arg1.field4073, 0L, 5, class327.field4483, (byte) -90, arg1.field4072, false, class526.field7728 + " -> " + arg1.field3943, class344.field4734, true);
                    class120.field1653++;
                }
                return;
            }
            return;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class157.method972(var5, (byte) -114, arg1);
            if (var9 != null) {
                class376.method2167(arg1.field3936, arg1.field4073, (long) (var5 + 1), 1010, class63.method397(var5, arg1, (byte) 57), (byte) -90, arg1.field4072, false, arg1.field3943, var9, true);
                class448.field6480++;
            }
        }
        String var6 = class215.method1283(arg1, -26825);
        if (var6 != null) {
            class163.field2327++;
            class376.method2167(arg1.field3936, arg1.field4073, 0L, 57, arg1.field4057, (byte) -90, arg1.field4072, false, arg1.field3943, var6, true);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class157.method972(var7, (byte) -85, arg1);
            if (var8 != null) {
                class448.field6480++;
                class376.method2167(arg1.field3936, arg1.field4073, (long) (var7 + 1), 20, class63.method397(var7, arg1, (byte) 40), (byte) -90, arg1.field4072, false, arg1.field3943, var8, true);
            }
        }
        if (!client.method1191(arg1).method1225((byte) -62)) {
            return;
        }
        class161.field2297++;
        if (arg1.field4004 != null) {
            class376.method2167(arg1.field3936, arg1.field4073, 0L, 23, -1, (byte) -90, arg1.field4072, false, "", arg1.field4004, true);
            return;
        }
        class376.method2167(arg1.field3936, arg1.field4073, 0L, 23, -1, (byte) -90, arg1.field4072, false, "", class388.field5449.method590(class105.field1434, -22602), true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 106)
    public static final void method407(byte arg0) {
        class526.field7723 = new class20[50];
        class292.field3915 = 0;
        if (arg0 != -1) {
            method406(90, null, true, 116);
        }
        field890++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(CI)Z", line = 125)
    public static final boolean method408(char arg0, int arg1) {
        field892++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class307.method1740(arg0, false)) {
            return true;
        } else {
            char[] var2 = class388.field5454;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class23.field373;
            for (int var5 = arg1; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
