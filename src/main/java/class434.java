import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class434 extends class496 {

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public int field6365 = 0;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "Lae;")
    public static class40 field6355 = new class40(1);

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public int field6350;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field6352;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public int field6354;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public int field6367;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public int field6369;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "Lih;")
    public class158 field6362;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "Lhca;")
    public class179 field6372;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lor;")
    public class217 field6348;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "Lor;")
    public class217 field6356;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Llk;")
    public class383 field6353;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "Z")
    public boolean field6358;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "[I")
    public int[] field6370;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 5)
    public final void method2648(int arg0) {
        field6360++;
        int var2 = this.field6351;
        if (this.field6362 != null) {
            class158 var3 = this.field6362.method923(-121, class406.field5823);
            if (var3 == null) {
                this.field6367 = 0;
                this.field6366 = 0;
                this.field6357 = 0;
                this.field6370 = null;
                this.field6349 = 0;
                this.field6351 = -1;
            } else {
                this.field6367 = var3.field2066 << 7;
                this.field6370 = var3.field2098;
                this.field6366 = var3.field2099;
                this.field6351 = var3.field2085;
                this.field6349 = var3.field2041;
                this.field6357 = var3.field2064;
            }
        } else if (this.field6353 != null) {
            int var4 = class153.method896(this.field6353, 122);
            if (var2 != var4) {
                this.field6351 = var4;
                class429 var5 = this.field6353.field5601;
                if (var5.field6238 != null) {
                    var5 = var5.method2629(class406.field5823, (byte) 114);
                }
                if (var5 == null) {
                    this.field6357 = this.field6367 = 0;
                } else {
                    this.field6367 = var5.field6264 << 7;
                    this.field6357 = var5.field6283;
                }
            }
        } else if (this.field6372 != null) {
            this.field6351 = class62.method388(this.field6372, 62);
            this.field6367 = this.field6372.field2722 << 7;
            this.field6357 = this.field6372.field2737;
        }
        if (arg0 != -7869) {
            this.field6371 = -13;
        }
        if (this.field6351 != var2 && this.field6356 != null) {
            class105.field1321.method2085(this.field6356);
            this.field6356 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 85)
    public static final void method2649(byte arg0) {
        field6368++;
        class461.field6670 = 0;
        class551.field8208 = 0;
        class259.field3802 = 0;
        class339.field4979 = 0;
        if (arg0 != -48) {
            method2649((byte) 127);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 102)
    public static void method2650(int arg0) {
        if (arg0 != 5704) {
            method2649((byte) 43);
        }
        field6355 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ldda;B)V", line = 127)
    public static final void method2651(class597 arg0, byte arg1) {
        field6359++;
        class147.field1904 = 0;
        class263.field3900 = 0;
        class585.field8699 = new class126();
        class154.field1977 = new class389[1024];
        class264.field3912 = new class96[class622.field9112[class588.field8730] + 1];
        if (arg1 <= 56) {
            field6364 = -7;
        }
        class626.field9182 = 0;
        class295.field4327 = 0;
        class586.method3422(-126, arg0);
        class609.method3543(16893, arg0);
    }
}
