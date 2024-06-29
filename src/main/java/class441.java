import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class441 extends class402 {

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
    public boolean field6389 = false;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Z")
    public boolean field6385 = false;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public int field6393;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field6395;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lm;")
    public static class242 field6392 = new class242();

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
    public static int[] field6391;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lkg;I)V")
    public static final void method2757(class317 arg0, int arg1) {
        if (arg1 != 2436) {
            return;
        }
        field6387++;
        class144 var2 = (class144) class36.field553.method2826(false, (long) arg0.field2183);
        if (var2 == null) {
            class273.method1809(arg0.field2189[0], (class163) null, 0, (byte) -74, arg0.field2190[0], (class212) null, class268.field3973, arg0);
        } else {
            var2.method994(4860);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILir;IZI)V")
    public static final void method2758(int arg0, int arg1, int arg2, class185 arg3, int arg4, boolean arg5, int arg6) {
        class217.field3024 = 1;
        class195.field2697 = arg5;
        class264.field3890 = arg3;
        class223.field3074 = arg1;
        class305.field4566 = arg0;
        class444.field6414 = arg6;
        field6394++;
        if (arg4 <= 69) {
            field6388 = 54;
        }
        class144.field1824 = arg2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public static void method2759(boolean arg0) {
        field6391 = null;
        field6392 = null;
        if (arg0) {
            method2759(true);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
    public static final void method2760(int arg0, int arg1) {
        if (arg1 != 2937) {
            field6391 = null;
        }
        for (class418 var2 = class167.field2270.method2812(arg1 ^ 0x3627); var2 != null; var2 = class167.field2270.method2819((byte) 97)) {
            if ((var2.field6091 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method2632(true);
            }
        }
        field6390++;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIZZ)V")
    public class441(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field6393 = arg1;
        this.field6389 = arg4;
        this.field6395 = arg2;
        this.field6385 = arg3;
        this.field6386 = arg0;
    }
}
