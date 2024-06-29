import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class30 extends class254 {

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public int field429 = 0;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[I")
    public static int[] field420 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Lj;")
    public class250 field434;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Loa;")
    public class252 field437;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Loa;")
    public class252 field438;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Lde;")
    public class53 field441;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lth;")
    public class72 field431;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Z")
    public boolean field435;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
    public int[] field424;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method215(byte arg0) {
        field417++;
        int var2 = this.field425;
        if (this.field434 != null) {
            class250 var3 = this.field434.method1639(-1);
            if (var3 == null) {
                this.field424 = null;
                this.field436 = 0;
                this.field425 = -1;
                this.field428 = 0;
                this.field440 = 0;
            } else {
                this.field424 = var3.field3800;
                this.field425 = var3.field3763;
                this.field428 = var3.field3781;
                this.field436 = var3.field3753;
                this.field440 = var3.field3789 * 128;
            }
        } else if (this.field431 != null) {
            int var4 = class219.method1407(-1159, this.field431);
            if (var2 != var4) {
                this.field425 = var4;
                class271 var5 = this.field431.field1119;
                if (var5.field4291 != null) {
                    var5 = var5.method1812(0);
                }
                if (var5 == null) {
                    this.field440 = 0;
                } else {
                    this.field440 = var5.field4263 * 128;
                }
            }
        } else if (this.field441 != null) {
            this.field425 = class279.method1880(this.field441, (byte) 110);
            this.field440 = this.field441.field793 * 128;
        }
        if (arg0 <= -59 && this.field425 != var2 && this.field438 != null) {
            class152.field2201.method279(this.field438);
            this.field438 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method216(int arg0) {
        field420 = null;
        if (arg0 != 5725) {
            field420 = null;
        }
    }
}
