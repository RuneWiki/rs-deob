import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class299 extends class184 {

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public int field5217 = 0;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field5191 = 0;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field5202 = 0;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Lsf;")
    public static class108 field5195 = class140.method973(255, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Lt;")
    public static class257 field5207 = null;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "[I")
    public static int[] field5199 = new int[25];

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[I")
    public static int[] field5198 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field5200;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public int field5203;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public int field5212;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "Lkj;")
    public class179 field5220;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lkj;")
    public class179 field5222;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lik;")
    public static class262 field5214;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Lqd;")
    public class45 field5194;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Llj;")
    public class51 field5211;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "Lfb;")
    public class60 field5205;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Z")
    public boolean field5210;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
    public int[] field5213;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 51)
    public static void method2108(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5207 = null;
        field5198 = null;
        field5195 = null;
        field5199 = null;
        field5214 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V", line = 71)
    public static final void method2109(int arg0, byte arg1) {
        class327.field5579.method637(arg0, 119);
        if (arg1 == 26) {
            field5201++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 86)
    public final void method2110(int arg0) {
        int var2 = -125 / ((75 - arg0) / 51);
        int var3 = this.field5193;
        field5221++;
        if (this.field5205 != null) {
            class60 var6 = this.field5205.method409(0);
            if (var6 == null) {
                this.field5213 = null;
                this.field5192 = 0;
                this.field5206 = 0;
                this.field5209 = 0;
                this.field5193 = -1;
            } else {
                this.field5193 = var6.field934;
                this.field5213 = var6.field941;
                this.field5206 = var6.field940 * 128;
                this.field5209 = var6.field932;
                this.field5192 = var6.field943;
            }
        } else if (this.field5194 != null) {
            int var4 = class277.method1995(this.field5194, (byte) -122);
            if (var3 != var4) {
                this.field5193 = var4;
                class136 var5 = this.field5194.field646;
                if (var5.field2396 != null) {
                    var5 = var5.method938((byte) -35);
                }
                if (var5 == null) {
                    this.field5206 = 0;
                } else {
                    this.field5206 = var5.field2382 * 128;
                }
            }
        } else if (this.field5211 != null) {
            this.field5193 = class22.method153(this.field5211, false);
            this.field5206 = this.field5211.field753 * 128;
        }
        if (this.field5193 != var3 && this.field5220 != null) {
            class213.field3789.method2186(this.field5220);
            this.field5220 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZ)V", line = 160)
    public static final void method2111(int arg0, int arg1, boolean arg2) {
        class120 var3 = class248.method1704(13, 53, arg1);
        var3.method844((byte) -28);
        if (arg2) {
            method2113(124);
        }
        var3.field2066 = arg0;
        field5204++;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 181)
    public static final void method2112(int arg0) {
        field5215++;
        if (arg0 != -22356) {
            method2112(-87);
        }
        class184.field3381++;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 192)
    public static final void method2113(int arg0) {
        if (arg0 < 46) {
            field5207 = (class257) null;
        }
        class106.field1837 = null;
        class138.method947();
        field5219++;
    }
}
