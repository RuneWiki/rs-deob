import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class class244 extends class673 {

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lpr;")
    public static class407 field3162 = new class407(7, -2);

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)V", line = 5)
    public static final void method1415(int arg0) {
        if (class453.field6284 != null) {
            class435.field5854.method85(25042);
            class397.method2172();
            class622.method3488(6065);
            class566.method3200(-10);
            class351.method1945(0);
            class301.method1704((byte) 115);
            if (class309.field4008 != null) {
                class309.field4008.method2197((byte) 66);
            }
            class508.method2918((byte) 72);
            class99.method612(-28086);
            class623.method3490((byte) -122);
            class246.method1421(-1232);
            class526.method2994(32130, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class455 var5 = class362.field4726[var1];
                if (var5 != null) {
                    var5.field3834 = null;
                    for (int var6 = 0; var6 < var5.field3836.length; var6++) {
                        var5.field3836[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class208.field2528; var2++) {
                class625 var3 = class609.field8605[var2].field6107;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3836.length; var4++) {
                        var3.field3836[var4] = null;
                    }
                }
            }
            class617.field8679 = null;
            class139.field1593 = null;
            class453.field6284.method3548(false);
            class453.field6284 = null;
        }
        field3157++;
        if (arg0 >= -51) {
            method1416(109);
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V", line = 83)
    public static void method1416(int arg0) {
        if (arg0 != 26211) {
            field3162 = null;
        }
        field3162 = null;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIII)V", line = 94)
    public class244(int arg0, int arg1, int arg2, int arg3) {
        this.field3161 = arg2;
        this.field3160 = arg0;
        this.field3159 = arg1;
        this.field3158 = arg3;
    }
}
