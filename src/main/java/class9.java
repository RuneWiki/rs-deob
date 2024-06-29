import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class9 extends class446 {

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "Lwg;")
    public class245 field161;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "Lcq;")
    public class274 field169;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Lkn;")
    public static class442 field170;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field175;

    static {
        new class442(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field170 = new class442("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 5)
    public static final void method146(int arg0) {
        class231.field3345 = true;
        if (arg0 != -22904) {
            field168 = 80;
        }
        field172++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lnq;BLnq;)V", line = 17)
    public static final void method147(class268 arg0, byte arg1, class268 arg2) {
        int var3 = -112 / ((-arg1 - 40) / 54);
        field175++;
        class415.field5892 = arg0;
        class297.field4157 = arg2;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 44)
    public static void method148(int arg0) {
        if (arg0 == -9589) {
            field170 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lwg;Le;)V", line = 55)
    public class9(class245 arg0, class313 arg1) {
        this.field161 = arg0;
        this.field169 = class360.method2311(arg0.field3463, 35);
        this.method150(false);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V", line = 67)
    public static final void method149(int arg0, boolean arg1) {
        field174++;
        if (arg1 == class395.field5660) {
            return;
        }
        class395.field5660 = arg1;
        class184.method1200((byte) -128);
        if (arg0 != -23639) {
            method149(-93, true);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 89)
    public final void method150(boolean arg0) {
        field166++;
        this.field171 = this.field161.field3465;
        this.field167 = this.field161.field3457;
        this.field162 = this.field161.field3456;
        if (arg0) {
            return;
        }
        if (this.field161.field3459 != null) {
            this.field161.field3459.method692(this.field169.field3809, this.field169.field3819, this.field169.field3805, class412.field5852);
        }
        this.field164 = class412.field5852[0];
        this.field163 = class412.field5852[2];
    }
}
