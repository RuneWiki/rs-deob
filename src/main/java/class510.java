import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class510 implements class208 {

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public int field7071;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "[F")
    public float[] field7067;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lcu;")
    public static class203 field7070;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "[I")
    public static int[] field7069;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method3054(String arg0, int arg1) {
        field7068++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class673.method3805(arg1, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class97.field1370; var3++) {
            String var4 = class438.field6108[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class673.method3805(1, var4);
            if (var5 != null && var5.equals(var2)) {
                class97.field1370--;
                for (int var6 = var3; var6 < class97.field1370; var6++) {
                    class438.field6108[var6] = class438.field6108[var6 + 1];
                    class532.field7393[var6] = class532.field7393[var6 + 1];
                    class747.field10288[var6] = class747.field10288[var6 + 1];
                    class557.field7749[var6] = class557.field7749[var6 + 1];
                    class315.field4362[var6] = class315.field4362[var6 + 1];
                }
                class557.field7747 = class320.field4449;
                class131.field1837++;
                class583 var7 = class54.method400(class213.field2800, (byte) 109, class523.field7276);
                var7.field7963.method444(class712.method4007(arg0, arg1 + 4926), 128);
                var7.field7963.method510(arg0, (byte) 61);
                class463.method2838(var7, (byte) 120);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 70)
    public static void method3055(int arg0) {
        if (arg0 != 14821) {
            method3055(-20);
        }
        field7069 = null;
        field7070 = null;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V", line = 80)
    public class510(int arg0, int arg1) {
        this.field7071 = arg1;
        this.field7072 = arg0;
        this.field7067 = new float[arg0 * arg1];
    }
}
