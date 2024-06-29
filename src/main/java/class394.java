import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class394 extends class85 {

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lml;")
    public class26 field5144;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "[I")
    public static int[] field5145 = new int[4096];

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2339(int arg0) {
        field5146++;
        int[] var1 = new int[class89.field1238.field306];
        int var2 = arg0;
        for (int var3 = 0; var3 < class89.field1238.field306; var3++) {
            class497 var5 = class89.field1238.method111(var3, -120);
            if (var5.field7324 >= 0 || var5.field7306 >= 0) {
                var1[var2++] = var3;
            }
        }
        class345.field4394 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class345.field4394[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V", line = 38)
    public static void method2340(byte arg0) {
        if (arg0 != 74) {
            method2339(17);
        }
        field5145 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lml;)V", line = 47)
    public class394(class26 arg0) {
        this.field5144 = arg0;
    }
}
