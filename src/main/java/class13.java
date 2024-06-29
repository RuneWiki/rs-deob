import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 extends class28 {

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public int field405 = -1;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public int field402 = 12800;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Z")
    public boolean field401 = true;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public int field404 = 0;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field412 = -1;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public int field416 = 12800;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public int field413 = 0;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Lvf;")
    public class265 field409;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lvf;")
    public class265 field410;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Lch;")
    public class117 field411;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Ldg;")
    public static class276 field417 = new class276(100);

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lvf;")
    public static class265 field419 = class87.method582(-46, "brillant1:");

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "Lvf;")
    public static class265 field420 = class87.method582(-46, "Memory after cleanup=");

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[Lcg;")
    public static class34[] field406;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public final void method100(byte arg0) {
        this.field413 = 0;
        this.field416 = 12800;
        this.field402 = 12800;
        this.field404 = 0;
        field414++;
        class107 var2 = (class107) this.field411.method789((byte) -125);
        if (arg0 != 25) {
            return;
        }
        while (var2 != null) {
            if (this.field413 < var2.field1888) {
                this.field413 = var2.field1888;
            }
            if (this.field404 < var2.field1886) {
                this.field404 = var2.field1886;
            }
            if (this.field402 > var2.field1892) {
                this.field402 = var2.field1892;
            }
            if (var2.field1887 < this.field416) {
                this.field416 = var2.field1887;
            }
            var2 = (class107) this.field411.method787((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static final int method101(int arg0, int arg1) {
        class48 var2 = class122.method817((byte) -74, arg1);
        int var3 = var2.field1030;
        int var4 = var2.field1028;
        field400++;
        int var5 = var2.field1024;
        if (arg0 != -1) {
            method101(-118, -97);
        }
        int var6 = class230.field4061[var4 - var5];
        return class256.field4385[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)Z")
    public final boolean method102(int arg0, byte arg1, int arg2) {
        field407++;
        int var4 = -29 % ((-arg1 - 7) / 47);
        if (this.field416 > arg0 || this.field404 < arg0 || arg2 < this.field402 || arg2 > this.field413) {
            return false;
        }
        for (class107 var5 = (class107) this.field411.method789((byte) -122); var5 != null; var5 = (class107) this.field411.method787((byte) -76)) {
            if (var5.method713(arg0, arg2, (byte) 106)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method103(int arg0) {
        if (arg0 != 0) {
            method103(64);
        }
        field420 = null;
        field406 = null;
        field417 = null;
        field419 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lvf;Lvf;IIIZI)V")
    public class13(class265 arg0, class265 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field408 = arg3;
        this.field412 = arg4;
        this.field415 = arg2;
        this.field409 = arg1;
        this.field401 = arg5;
        this.field405 = arg6;
        if (this.field405 == 255) {
            this.field405 = 0;
        }
        this.field410 = arg0;
        this.field411 = new class117();
    }
}
