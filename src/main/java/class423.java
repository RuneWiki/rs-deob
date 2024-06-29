import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class423 extends class484 {

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "S")
    public short field6423;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "S")
    public short field6424;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "S")
    public short field6418;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "B")
    public byte field6416;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "B")
    public byte field6419;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Z")
    public boolean field6413;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "S")
    public short field6420;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lru;")
    public static class177 field6414 = new class177(8);

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lss;")
    public static class213 field6421 = new class213(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
    public static void method2691(int arg0) {
        if (arg0 != 8) {
            field6422 = -49;
        }
        field6421 = null;
        field6414 = null;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)I")
    public abstract int method1596(boolean arg0);

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public void method423(int arg0) {
        field6415++;
        if (arg0 > -116) {
            this.method1596(true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6423 = (short) arg4;
        this.field6424 = (short) arg6;
        this.field6412 = arg2;
        this.field6418 = (short) arg7;
        this.field6410 = arg3;
        this.field6416 = arg9;
        this.field6419 = (byte) arg0;
        this.field6413 = arg8;
        this.field6417 = arg1;
        this.field6420 = (short) arg5;
    }
}
