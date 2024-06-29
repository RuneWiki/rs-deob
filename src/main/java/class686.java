import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class686 extends class272 {

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public int field9362;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public int field9366;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public int field9367;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Lnt;")
    public class209 field9364;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "Lpfa;")
    public static class275 field9369;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "[Lpo;")
    public class524[] field9361;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "[Z")
    public static boolean[] field9370;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
    public static void method3782(int arg0) {
        field9369 = null;
        if (arg0 >= -75) {
            field9370 = null;
        }
        field9370 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method3783(int arg0, int arg1, class650 arg2, int arg3) {
        field9371++;
        if (arg3 != 0) {
            this.field9362 = 110;
        }
        if (this.field9361 != null) {
            for (int var5 = 0; var5 < this.field9361.length; var5++) {
                if (this.field9361[var5].method2830(arg1, arg0) && this.field9364.method8((byte) -3, arg0, arg2, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Z")
    public static final boolean method3784(int arg0, int arg1, int arg2) {
        field9368++;
        if (arg0 != -1) {
            method3784(-37, 73, -32);
        }
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }
}
