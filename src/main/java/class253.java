import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class253 extends class134 {

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public int field4299 = 0;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
    public static volatile boolean field4283 = true;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field4282 = -1;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4286 = "Loaded wordpack";

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Z")
    public static boolean field4291 = false;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Ldl;")
    public class123 field4281;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Laj;")
    public static class151 field4288;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lah;")
    public class1 field4279;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lvd;")
    public class307 field4280;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lmj;")
    public class59 field4289;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lmj;")
    public class59 field4300;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Z")
    public boolean field4277;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[I")
    public int[] field4278;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static final void method1833(int arg0) {
        field4276++;
        if (arg0 != -2763) {
            field4283 = false;
        }
        class208.field3515 = new class207[class90.field1483.method1155((byte) -128)][];
        class169.field2730 = new boolean[class90.field1483.method1155((byte) -126)];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method1834(boolean arg0) {
        if (arg0) {
            field4286 = null;
        }
        field4286 = null;
        field4288 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIBI)Z")
    public static final boolean method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4295++;
        if (arg8 < (arg1 + arg6) && arg1 < arg8 + arg2) {
            int var9 = 59 % ((6 - arg7) / 54);
            return arg0 < arg3 + arg5 && arg0 + arg4 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public final void method1836(int arg0) {
        field4298++;
        int var2 = this.field4287;
        if (this.field4279 != null) {
            class1 var5 = this.field4279.method22((byte) 117);
            if (var5 == null) {
                this.field4274 = 0;
                this.field4287 = -1;
                this.field4278 = null;
                this.field4302 = 0;
                this.field4284 = 0;
                this.field4290 = 0;
            } else {
                this.field4302 = var5.field1;
                this.field4274 = var5.field42 * 128;
                this.field4287 = var5.field7;
                this.field4284 = var5.field79;
                this.field4290 = var5.field6;
                this.field4278 = var5.field66;
            }
        } else if (this.field4280 != null) {
            int var3 = class226.method1597((byte) 126, this.field4280);
            if (var2 != var3) {
                class54 var4 = this.field4280.field4960;
                this.field4287 = var3;
                if (var4.field904 != null) {
                    var4 = var4.method343(-1);
                }
                if (var4 == null) {
                    this.field4302 = this.field4274 = 0;
                } else {
                    this.field4274 = var4.field913 * 128;
                    this.field4302 = var4.field933;
                }
            }
        } else if (this.field4281 != null) {
            this.field4287 = class78.method550(15544, this.field4281);
            this.field4274 = this.field4281.field2091 * 128;
            this.field4302 = this.field4281.field2088;
        }
        if (arg0 > -117) {
            method1833(-65);
        }
        if (this.field4287 != var2 && this.field4289 != null) {
            class278.field4627.method113(this.field4289);
            this.field4289 = null;
        }
    }
}
