import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class187 implements class118 {

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Llr;")
    private class749 field2228;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
    public int[] field2221;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lufa;")
    private class678 field2222;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "[F")
    public float[] field2224;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field2223 = 0;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)Lkw;", line = 5)
    public static final class249 method1149(byte arg0) {
        field2220++;
        class249 var1 = class744.method4139(true);
        var1.field3020 = 0;
        if (arg0 != -126) {
            method1149((byte) -19);
        }
        var1.field3014 = null;
        var1.field3016 = new class179(5000);
        return var1;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(IIIIIIZZ)V", line = 23)
    public final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class591.method3386(this.field2227, arg3, arg0, arg1, arg6 ? this.field2221 : null, arg4, arg5, this.field2228.field10440.field1201, this.field2228.field10440.field1205, (byte) -120, arg7 ? this.field2224 : null, arg7 ? this.field2228.field10467 : null, arg2);
        field2226++;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIZZ)V", line = 42)
    public final void method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class591.method3386(this.field2228.field10440.field1201, arg3, arg0, arg1, arg6 ? this.field2228.field10440.field1205 : null, arg4, arg5, this.field2227, this.field2221, (byte) -120, arg7 ? this.field2228.field10467 : null, arg7 ? this.field2224 : null, arg2);
        field2225++;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Llr;Lhu;Lufa;)V", line = 50)
    public class187(class749 arg0, class131 arg1, class678 arg2) {
        this.field2228 = arg0;
        if (arg1 instanceof class455) {
            class455 var4 = (class455) arg1;
            this.field2227 = var4.field714;
            this.field2221 = var4.field6532;
            this.field2219 = var4.field713;
        } else if ((arg1 instanceof class639)) {
            class639 var5 = (class639) arg1;
            this.field2219 = var5.field713;
            this.field2221 = var5.field9173;
            this.field2227 = var5.field714;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field2222 = arg2;
            if (this.field2222.field9600 != this.field2227 || this.field2222.field9605 != this.field2219) {
                throw new RuntimeException();
            }
            this.field2224 = this.field2222.field9602;
        }
    }
}
