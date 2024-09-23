import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OOTLZHQB")
public class class46 {

    @OriginalMember(owner = "OOTLZHQB", name = "b", descriptor = "I")
    private int field1086 = 573;

    @OriginalMember(owner = "OOTLZHQB", name = "c", descriptor = "Z")
    private boolean field1087 = true;

    @OriginalMember(owner = "OOTLZHQB", name = "f", descriptor = "LAGCGSOQI;")
    private class1 field1090 = new class1();

    @OriginalMember(owner = "OOTLZHQB", name = "j", descriptor = "LBOZWYCIO;")
    private class6 field1094 = new class6(field1085);

    @OriginalMember(owner = "OOTLZHQB", name = "g", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "OOTLZHQB", name = "h", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "OOTLZHQB", name = "i", descriptor = "LBVBAURNI;")
    private class8 field1093;

    @OriginalMember(owner = "OOTLZHQB", name = "a", descriptor = "Z")
    private static boolean field1085 = true;

    @OriginalMember(owner = "OOTLZHQB", name = "d", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "OOTLZHQB", name = "e", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "OOTLZHQB", name = "<init>", descriptor = "(II)V")
    public class46(int arg0, int arg1) {
        this.field1091 = arg0;
        if (arg1 < 9 || arg1 > 9) {
            throw new NullPointerException();
        }
        this.field1092 = arg0;
        this.field1093 = new class8((byte) -87, 1024);
    }

    @OriginalMember(owner = "OOTLZHQB", name = "a", descriptor = "(J)LAGCGSOQI;")
    public class1 method386(long arg0) {
        class1 var3 = (class1) this.field1093.method60(arg0);
        if (var3 == null) {
            this.field1088++;
        } else {
            this.field1094.method42(var3);
            this.field1089++;
        }
        return var3;
    }

    @OriginalMember(owner = "OOTLZHQB", name = "a", descriptor = "(JLAGCGSOQI;B)V")
    public void method387(long arg0, class1 arg1, byte arg2) {
        if (arg2 == 8) {
            boolean var5 = false;
        } else {
            this.field1087 = !this.field1087;
        }
        if (this.field1092 == 0) {
            class1 var6 = this.field1094.method43();
            var6.method290();
            var6.method1();
            if (this.field1090 == var6) {
                class1 var7 = this.field1094.method43();
                var7.method290();
                var7.method1();
            }
        } else {
            this.field1092--;
        }
        this.field1093.method61(arg1, arg0, true);
        this.field1094.method42(arg1);
        if (class29.field878) {
        }
    }

    @OriginalMember(owner = "OOTLZHQB", name = "a", descriptor = "()V")
    public void method388() {
        while (true) {
            class1 var1 = this.field1094.method43();
            if (var1 == null) {
                this.field1092 = this.field1091;
                return;
            }
            var1.method290();
            var1.method1();
        }
    }
}
