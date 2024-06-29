import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class651 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lo;")
    public class29 field9074 = new class29();

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
    public boolean field9076 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9075;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    public static final void method3674(String arg0, byte arg1) {
        class270.method1616((byte) 52, 0, arg0, 0, "", "", "");
        int var2 = 74 % ((arg1 - 8) / 60);
        field9073++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 15)
    public final void method3675(int arg0) {
        while (true) {
            class62 var2 = (class62) this.field9074.method115((byte) -72);
            if (var2 == null) {
                field9071++;
                if (arg0 != 0) {
                    this.field9074 = null;
                    return;
                }
                return;
            }
            var2.method975((byte) -96);
            class614.method3456(var2, arg0 ^ 0xFFFFFF8A);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lni;I)V", line = 37)
    public static final void method3676(class522 arg0, int arg1) {
        class535.field7255 = arg0.method2890((byte) -62, "p11_full");
        field9070++;
        int var2 = 105 / ((arg1 + 25) / 51);
        class476.field6584 = arg0.method2890((byte) -122, "p12_full");
        class305.field4129 = arg0.method2890((byte) -91, "b12_full");
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 50)
    public static void method3677(int arg0) {
        field9075 = null;
        if (arg0 != 2169) {
            field9075 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILbd;)V", line = 60)
    public final void method3678(int arg0, class62 arg1) {
        field9072++;
        class176 var3 = arg1.field682;
        boolean var4 = true;
        class486[] var5 = arg1.field678;
        for (int var6 = arg0; var6 < var5.length; var6++) {
            if (var5[var6].field6676) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field9076) {
            for (class62 var7 = (class62) this.field9074.method113((byte) 15); var7 != null; var7 = (class62) this.field9074.method119(false)) {
                if (var7.field682 == var3) {
                    var7.method975((byte) 18);
                    class614.method3456(var7, -120);
                }
            }
        }
        for (class62 var8 = (class62) this.field9074.method113((byte) 15); var8 != null; var8 = (class62) this.field9074.method119(false)) {
            if (var8.field682.field2169 <= var3.field2169) {
                class213.method1188(arg1, var8, (byte) 27);
                return;
            }
        }
        this.field9074.method118(true, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Z)V", line = 136)
    public class651(boolean arg0) {
        this.field9076 = arg0;
    }
}
