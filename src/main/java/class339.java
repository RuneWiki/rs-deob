import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class339 {

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[I")
    public static int[] field5022 = new int[13];

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lqv;")
    public static class316 field5018 = new class316(7, 4);

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5024 = "";

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "Lrj;")
    public static class430 field5023 = new class430("LOCAL", 4);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILci;ZZIII)V")
    public static final void method2153(int arg0, class320 arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class479.field6987 = arg1;
        class133.field2069 = arg3;
        if (!arg2) {
            field5018 = null;
        }
        class92.field1478 = 1;
        class414.field5863 = arg5;
        field5016++;
        class18.field201 = arg4;
        class431.field6188 = arg6;
        class19.field211 = class336.field4972.method1443((byte) -69) / arg0;
        if (class19.field211 < 1) {
            class19.field211 = 1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method2154(int arg0) {
        int var1 = 50 % ((arg0 + 35) / 43);
        field5022 = null;
        field5024 = null;
        field5023 = null;
        field5018 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lwn;B)V")
    public final void method2155(class519 arg0, byte arg1) {
        field5017++;
        while (true) {
            int var3 = arg0.method3072((byte) -122);
            if (var3 == 0) {
                if (arg1 < 119) {
                    method2154(120);
                    return;
                } else {
                    return;
                }
            }
            this.method2156(79, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILwn;I)V")
    private final void method2156(int arg0, class519 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5015 = arg1.method3018(566990904);
            this.field5021 = arg1.method3072((byte) -125);
            this.field5019 = arg1.method3072((byte) -123);
        }
        if (arg0 <= 70) {
            field5023 = null;
        }
        field5020++;
    }
}
