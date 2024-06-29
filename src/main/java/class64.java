import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class64 extends class317 {

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field965 = 50;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
    public static int[] field956 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lwm;")
    public static class152 field963 = class157.method1048("Fichiers config charg-Bs", 125);

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
    public static int[] field967 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field954 = -1;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    public static int[] field955 = new int[500];

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Lwm;")
    public static class152 field970 = class157.method1048("Objet d(Wabonn-Bs", 121);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[Lwm;")
    public static class152[] field962 = new class152[field965];

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    public static int[] field966 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field969 = 1;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[I")
    public static int[] field960 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
    public static int[] field959 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public static int[] field958 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "[Lwm;")
    public static class152[] field971 = new class152[100];

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
    public static int[] field972 = new int[field965];

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lwm;")
    public static class152 field973 = class157.method1048("0", 120);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 48)
    public static void method410(boolean arg0) {
        field967 = null;
        field959 = null;
        field966 = null;
        if (!arg0) {
            field965 = 108;
        }
        field973 = null;
        field970 = null;
        field972 = null;
        field971 = null;
        field963 = null;
        field956 = null;
        field962 = null;
        field955 = null;
        field960 = null;
        field958 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZIII)V", line = 84)
    public static final void method411(boolean arg0, int arg1, int arg2, int arg3) {
        field961++;
        class303 var4 = class90.method589(arg0, arg1, 11);
        var4.method2117((byte) 115);
        var4.field5208 = arg3;
        var4.field5219 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lan;B)V", line = 95)
    public static final void method412(class320 arg0, byte arg1) {
        if (arg1 >= -82) {
            method413(108, (byte) 46);
        }
        field964++;
        class195.method1304(arg0, 200000, (byte) 111);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V", line = 117)
    public static final void method413(int arg0, byte arg1) {
        class84.field1158 = arg0;
        field957++;
        class208.field3392 = -1;
        if (arg1 < -106) {
            class208.field3392 = -1;
            class79.method521((byte) -92);
        }
    }
}
