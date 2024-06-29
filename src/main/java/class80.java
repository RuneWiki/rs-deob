import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class80 extends class499 {

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "Ljm;")
    public static class485 field1139;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "J")
    public long field1140;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Lut;")
    public class80 field1135;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "Lut;")
    public class80 field1142;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "[Lvn;")
    public static class203[] field1136;

    static {
        new class19("", 73);
        field1139 = new class485(16, 4);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method580(byte arg0, int arg1) {
        class9 var2 = class383.field5390;
        synchronized (class383.field5390) {
            class383.field5390.method61((byte) -67, arg1);
        }
        field1141++;
        class9 var3 = class223.field3137;
        synchronized (class223.field3137) {
            int var4 = 2 / ((41 - arg0) / 57);
            class223.field3137.method61((byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V", line = 19)
    public final void method581(int arg0) {
        field1138++;
        if (this.field1142 == null) {
            return;
        }
        this.field1142.field1135 = this.field1135;
        this.field1135.field1142 = this.field1142;
        if (arg0 == 4) {
            this.field1142 = null;
            this.field1135 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)Z", line = 38)
    public final boolean method582(int arg0) {
        field1137++;
        if (arg0 == 4072) {
            return this.field1142 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)V", line = 63)
    public static void method583(int arg0) {
        field1136 = null;
        if (arg0 >= -92) {
            field1136 = null;
        }
        field1139 = null;
    }
}
