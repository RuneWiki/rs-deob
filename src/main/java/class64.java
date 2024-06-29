import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class64 extends class24 {

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "Ljava/lang/String;")
    private String field910;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "[Lcj;")
    public static class723[] field906;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lke;I)V", line = 8)
    public final void method190(class625 arg0, int arg1) {
        field905++;
        if (arg1 != 5) {
            this.method191(-97, null);
        }
        arg0.field8431 = this.field910;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 21)
    public static void method445(int arg0) {
        field906 = null;
        if (arg0 != 12) {
            field907 = -26;
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V", line = 39)
    public static final void method446(byte arg0) {
        field911++;
        for (class39 var1 = (class39) class255.field3809.method2551((byte) -108); var1 != null; var1 = (class39) class255.field3809.method2542(-118)) {
            if (var1.field624) {
                var1.method274((byte) 31);
            }
        }
        if (arg0 != -50) {
            field907 = -99;
        }
        for (class39 var2 = (class39) class573.field7696.method2551((byte) -108); var2 != null; var2 = (class39) class573.field7696.method2542(-119)) {
            if (var2.field624) {
                var2.method274((byte) 31);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjp;)V", line = 71)
    public final void method191(int arg0, class376 arg1) {
        if (arg0 > -56) {
            field906 = null;
        }
        field909++;
        this.field910 = arg1.method2379((byte) 85);
        arg1.method2384(5);
    }
}
