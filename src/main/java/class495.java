import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class495 extends class477 {

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    private int field6697;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "Lll;")
    public static class114 field6694 = new class114();

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Lcr;")
    public static class112 field6687;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "[Lwe;")
    public class423[] field6689;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "[[B")
    private byte[][] field6691;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method2791(int arg0, int arg1) {
        field6698++;
        if (arg0 != 9675) {
            this.method2792(-71, 96);
        }
        return this.field6689[arg1].field5885;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)Z", line = 19)
    public final boolean method2792(int arg0, int arg1) {
        field6695++;
        if (arg0 != 0) {
            method2794(-40, -127, -21);
        }
        return this.field6689[arg1].field5901;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(B)V", line = 34)
    public static void method2793(byte arg0) {
        field6694 = null;
        if (arg0 != 97) {
            field6694 = null;
        }
        field6687 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method2794(int arg0, int arg1, int arg2) {
        field6693++;
        if (arg1 == 4965) {
            return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(BLjava/lang/String;)V", line = 61)
    public static final void method2795(byte arg0, String arg1) {
        field6696++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class303.method1825(arg1, 1);
        if (arg0 != -126) {
            method2794(53, 123, -55);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class641.field8818; var3++) {
            String var4 = class353.field5147[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class303.method1825(var4, arg0 ^ 0xFFFFFF83);
            if (var5 != null && var5.equals(var2)) {
                class641.field8818--;
                for (int var6 = var3; var6 < class641.field8818; var6++) {
                    class353.field5147[var6] = class353.field5147[var6 + 1];
                    class207.field2698[var6] = class207.field2698[var6 + 1];
                    class291.field3892[var6] = class291.field3892[var6 + 1];
                    class623.field8473[var6] = class623.field8473[var6 + 1];
                    class42.field550[var6] = class42.field550[var6 + 1];
                }
                class307.field4122++;
                class309.field4142 = class141.field1800;
                class389.method2326((byte) 118, class683.field9706);
                class253.field3491.method951((byte) -82, class500.method2820(1, arg1));
                class253.field3491.method905(arg1, -44);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V", line = 124)
    public class495(int arg0) {
        this.field6697 = arg0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z", line = 132)
    public final boolean method2796(int arg0, byte arg1) {
        field6690++;
        if (arg1 != 38) {
            this.field6697 = 16;
        }
        return this.field6689[arg0].field5890;
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(B)Z", line = 143)
    public final boolean method2797(byte arg0) {
        field6688++;
        if (this.field6689 != null) {
            return true;
        }
        if (arg0 >= -98) {
            this.field6697 = -125;
        }
        if (this.field6691 == null) {
            if (!class689.field9734.method1069(31271, this.field6697)) {
                return false;
            }
            int[] var2 = class689.field9734.method1084((byte) -120, this.field6697);
            this.field6691 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6691[var3] = class689.field9734.method1087(this.field6697, var2[var3], 1);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6691.length; var5++) {
            byte[] var15 = this.field6691[var5];
            class138 var16 = new class138(var15);
            var16.field1745 = 1;
            int var17 = var16.method922((byte) -127);
            var4 &= class631.field8575.method1086((byte) 122, var17);
        }
        if (!var4) {
            return false;
        }
        class59 var6 = new class59();
        int var7 = class689.field9734.method1076(this.field6697, 0);
        this.field6689 = new class423[var7];
        int[] var8 = class689.field9734.method1084((byte) -123, this.field6697);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6691[var9];
            class138 var11 = new class138(var10);
            var11.field1745 = 1;
            int var12 = var11.method922((byte) -127);
            class154 var13 = null;
            for (class154 var14 = (class154) var6.method374((byte) 76); var14 != null; var14 = (class154) var6.method372(-20740)) {
                if (var14.field1912 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class154(var12, class631.field8575.method1082((byte) 33, var12));
                var6.method378(var13, 31316);
            }
            this.field6689[var8[var9]] = new class423(var10, var13);
        }
        this.field6691 = null;
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IC)Z", line = 245)
    public static final boolean method2798(int arg0, char arg1) {
        field6692++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class544.method3064(-91, arg1)) {
            return true;
        } else {
            char[] var2 = class307.field4119;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var8 = var2[var3];
                if (arg1 == var8) {
                    return true;
                }
            }
            char[] var4 = class172.field2155;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var7 = var4[var5];
                if (arg1 == var7) {
                    return true;
                }
            }
            int var6 = -116 / ((arg0 + 31) / 49);
            return false;
        }
    }
}
