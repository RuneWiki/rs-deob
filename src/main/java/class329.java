import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class329 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Ljava/lang/String;")
    public String field4374;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4370 = -1;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Lkp;", line = 6)
    public static final class312 method1831(boolean arg0) {
        field4372++;
        try {
            if (!arg0) {
                method1832((byte) -114);
            }
            return (class312) Class.forName("m").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field4371++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class329(String arg0, int arg1) {
        this.field4374 = arg0;
        this.field4375 = arg1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)[Loi;", line = 47)
    public static final class49[] method1832(byte arg0) {
        int var1 = -72 / ((44 - arg0) / 60);
        if (class208.field2810 == null) {
            class49[] var2 = class206.method1174(class251.field3359, 102);
            class49[] var3 = new class49[var2.length];
            int var4 = 0;
            label63: for (int var5 = 0; var5 < var2.length; var5++) {
                class49 var9 = var2[var5];
                if ((var9.field653 <= 0 || var9.field653 >= 24) && var9.field651 >= 800 && var9.field650 >= 600 && (class428.field5792 >= 96 || class222.field2958 != 0 || var9.field651 <= 1024 && var9.field650 <= 768)) {
                    for (int var10 = 0; var10 < var4; var10++) {
                        class49 var11 = var3[var10];
                        if (var9.field651 == var11.field651 && var9.field650 == var11.field650) {
                            if (var9.field653 > var11.field653) {
                                var3[var10] = var9;
                            }
                            continue label63;
                        }
                    }
                    var3[var4] = var9;
                    var4++;
                }
            }
            class208.field2810 = new class49[var4];
            class380.method2336(var3, 0, class208.field2810, 0, var4);
            int[] var6 = new int[class208.field2810.length];
            for (int var7 = 0; var7 < class208.field2810.length; var7++) {
                class49 var8 = class208.field2810[var7];
                var6[var7] = var8.field651 * var8.field650;
            }
            class34.method258(class208.field2810, var6, -16473);
        }
        field4373++;
        return class208.field2810;
    }
}
