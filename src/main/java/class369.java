import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class369 {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field5649;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "F")
    public static float field5648;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIIZ)I", line = 7)
    public static final int method2283(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5650++;
        class138 var5 = class307.method1936((byte) 73, arg4, arg2);
        if (arg1 <= 23) {
            field5648 = -0.84741664F;
        }
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2079.length; var7++) {
            if (var5.field2079[var7] >= 0 && class294.field4196.field1171 > var5.field2079[var7]) {
                class339 var8 = class294.field4196.method453(0, var5.field2079[var7]);
                int var9 = var8.method2075((byte) -84, arg3, class381.field5778.method506(true, arg3).field1284);
                if (arg0) {
                    var6 += var5.field2081[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lic;I)I", line = 52)
    public static final int method2284(class491 arg0, int arg1) {
        field5646++;
        if (arg1 != -1) {
            method2284(null, 32);
        }
        int var2 = 0;
        if (arg0.method2924((byte) -125, class35.field366)) {
            var2++;
        }
        if (arg0.method2924((byte) -126, class331.field4692)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "toString", descriptor = "()Ljava/lang/String;", line = 74)
    public final String toString() {
        field5647++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 83)
    public class369(int arg0) {
        this.field5649 = arg0;
    }
}
