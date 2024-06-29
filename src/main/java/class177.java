import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class177 extends class235 {

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public int field2315 = 0;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    public int field2323 = 12800;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "I")
    public int field2324 = -1;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    public int field2332 = 0;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    public int field2322 = 12800;

    @OriginalMember(owner = "client!as", name = "V", descriptor = "I")
    public int field2334 = -1;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "Z")
    public boolean field2317 = true;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "Ljava/lang/String;")
    public String field2325;

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Ljava/lang/String;")
    public String field2314;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "Lmi;")
    public class408 field2330;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2313 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    public static int field2326 = -1;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field2331 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!as", name = "U", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!as", name = "W", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!as", name = "X", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        field2336++;
        class278.field4076 = new class408();
        if (arg0 != 4120) {
            method1080(38, -34, -113);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lro;B)Lro;")
    public static final class249 method1078(class249 arg0, byte arg1) {
        field2327++;
        if (arg0.field3623 != -1) {
            return class107.method746(arg0.field3623, -14);
        }
        int var2 = arg0.field3622 >>> 16;
        int var3 = -97 % ((75 - arg1) / 35);
        class355 var4 = new class355(class269.field3933);
        for (class158 var5 = (class158) var4.method2333(24056); var5 != null; var5 = (class158) var4.method2332((byte) 105)) {
            if (var5.field2075 == var2) {
                return class107.method746((int) var5.field5903, -105);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method1079(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2328++;
        int var6 = -57 % ((arg0 - 39) / 51);
        for (class329 var7 = (class329) this.field2330.method2649(0); var7 != null; var7 = (class329) this.field2330.method2656(0)) {
            if (var7.method2016(false, arg1, arg2, arg3)) {
                var7.method2022((byte) -116, arg1, arg3, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
    public static final void method1080(int arg0, int arg1, int arg2) {
        field2316++;
        if (arg0 == -1) {
            class256 var3 = class363.method2385(7, arg2, (byte) 1);
            var3.method1614(0);
            var3.field3756 = arg1;
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)V")
    public final void method1081(byte arg0) {
        field2320++;
        this.field2323 = 12800;
        this.field2322 = 12800;
        this.field2332 = 0;
        this.field2315 = 0;
        if (arg0 > -43) {
            field2333 = -38;
        }
        for (class329 var2 = (class329) this.field2330.method2649(0); var2 != null; var2 = (class329) this.field2330.method2656(0)) {
            if (this.field2323 > var2.field4730) {
                this.field2323 = var2.field4730;
            }
            if (var2.field4724 < this.field2322) {
                this.field2322 = var2.field4724;
            }
            if (this.field2332 < var2.field4733) {
                this.field2332 = var2.field4733;
            }
            if (this.field2315 < var2.field4729) {
                this.field2315 = var2.field4729;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIB)Z")
    public final boolean method1082(int arg0, int arg1, byte arg2) {
        if (arg2 != 109) {
            return false;
        }
        field2335++;
        for (class329 var4 = (class329) this.field2330.method2649(0); var4 != null; var4 = (class329) this.field2330.method2656(0)) {
            if (var4.method2019((byte) -124, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[III)Z")
    public final boolean method1083(int arg0, int[] arg1, int arg2, int arg3) {
        field2318++;
        if (arg3 != -1) {
            this.field2317 = true;
        }
        for (class329 var5 = (class329) this.field2330.method2649(arg3 + 1); var5 != null; var5 = (class329) this.field2330.method2656(0)) {
            if (var5.method2019((byte) -60, arg0, arg2)) {
                var5.method2022((byte) -76, arg0, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
    public static void method1084(int arg0) {
        if (arg0 != -1) {
            field2331 = null;
        }
        field2331 = null;
        field2313 = null;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class177(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2319 = arg0;
        this.field2325 = arg1;
        this.field2317 = arg5;
        this.field2329 = arg3;
        this.field2314 = arg2;
        this.field2324 = arg4;
        this.field2334 = arg6;
        if (this.field2334 == 255) {
            this.field2334 = 0;
        }
        this.field2330 = new class408();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method1085(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg3 > -96) {
            return false;
        }
        field2321++;
        for (class329 var5 = (class329) this.field2330.method2649(0); var5 != null; var5 = (class329) this.field2330.method2656(0)) {
            if (var5.method2018(arg0, arg2, -112)) {
                var5.method2020(arg1, arg2, (byte) -110, arg0);
                return true;
            }
        }
        return false;
    }
}
