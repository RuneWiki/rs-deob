import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class43 extends class35 {

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public int field593 = 0;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "Lsh;")
    public static class472 field596 = new class472(79, 1);

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lbg;")
    public class257 field576;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Lvc;")
    public class271 field579;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Lh;")
    public class349 field582;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Lui;")
    public static class451 field598;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lib;")
    public class7 field580;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Lib;")
    public class7 field584;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
    public boolean field591;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "[I")
    public int[] field597;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method315(int arg0, String arg1) {
        field588++;
        if (arg0 != 15154) {
            method319(-36);
        }
        return class451.method2669(arg1, true, 10, (byte) 125);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method316(boolean arg0) {
        if (arg0) {
            this.method316(true);
        }
        field595++;
        int var2 = this.field589;
        if (this.field579 != null) {
            class271 var5 = this.field579.method1759(class315.field4736, true);
            if (var5 == null) {
                this.field581 = 0;
                this.field589 = -1;
                this.field592 = 0;
                this.field574 = 0;
                this.field578 = 0;
                this.field597 = null;
            } else {
                this.field578 = var5.field4071;
                this.field597 = var5.field4050;
                this.field592 = var5.field4051;
                this.field574 = var5.field4021 * 128;
                this.field581 = var5.field4085;
                this.field589 = var5.field4018;
            }
        } else if (this.field582 != null) {
            int var3 = class50.method366(this.field582, -1);
            if (var2 != var3) {
                this.field589 = var3;
                class273 var4 = this.field582.field5309;
                if (var4.field4107 != null) {
                    var4 = var4.method1781(class315.field4736, true);
                }
                if (var4 == null) {
                    this.field592 = this.field574 = 0;
                } else {
                    this.field574 = var4.field4151 * 128;
                    this.field592 = var4.field4158;
                }
            }
        } else if (this.field576 != null) {
            this.field589 = class182.method1252(this.field576, -1);
            this.field574 = this.field576.field3808 * 128;
            this.field592 = this.field576.field3844;
        }
        if (this.field589 != var2 && this.field580 != null) {
            class452.field6419.method2415(this.field580);
            this.field580 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
    public static final void method317(int arg0, int arg1, int arg2, int arg3) {
        field590++;
        if (arg3 != 1) {
            field596 = null;
        }
        class484 var4 = class401.field5864[arg2][arg0];
        class83.method680(arg1, -14061, var4 == null ? class95.field1337 : var4);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method318(byte arg0) {
        field598 = null;
        if (arg0 < 6) {
            field598 = null;
        }
        field596 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)Lso;")
    public static final class187 method319(int arg0) {
        class281.field4252 = arg0;
        field586++;
        return class237.method1539(0);
    }
}
