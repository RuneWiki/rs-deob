import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class552 {

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Ljn;")
    private class117 field8092 = new class117(256);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lfa;")
    private class615 field8089;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lkfa;")
    private class382 field8087;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3234(int arg0) {
        field8093++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class430.field6136; var2++) {
            for (int var3 = 0; var3 < class580.field8504; var3++) {
                if (class563.method3291(true, var2, class541.field7946, var1, var3, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 37)
    public final void method3235(byte arg0) {
        this.field8092.method936(-116);
        field8090++;
        int var2 = 115 % ((10 - arg0) / 48);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Lil;", line = 48)
    public final class586 method3236(int arg0, int arg1) {
        field8091++;
        int var3 = -125 % ((82 - arg1) / 40);
        Object var4 = this.field8092.method941((long) arg0, 0);
        if (var4 != null) {
            return (class586) var4;
        } else if (this.field8089.method2363((byte) -122, arg0)) {
            class377 var5 = this.field8089.method2359(-124, arg0);
            int var6 = var5.field5222 ? 64 : this.field8087.field5437;
            class586 var8;
            if (var5.field5235 && this.field8087.method95()) {
                float[] var7 = this.field8089.method2361(false, 0.7F, (byte) 107, var6, var6, arg0);
                var8 = new class586(this.field8087, 3553, 34842, var6, var6, var5.field5231 != 0, var7, 6408);
            } else {
                int[] var9;
                if (!var5.field5225 && class348.method2118(var5.field5217, -2)) {
                    var9 = this.field8089.method2360(var6, true, arg0, (byte) 118, 0.7F, var6);
                } else {
                    var9 = this.field8089.method2365(var6, arg0, false, -68, 0.7F, var6);
                }
                var8 = new class586(this.field8087, 3553, 6408, var6, var6, var5.field5231 != 0, var9, 0, 0, false);
            }
            var8.method3379((byte) 102, var5.field5234, var5.field5221);
            this.field8092.method949((long) arg0, true, var8);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 96)
    public final void method3237(int arg0) {
        if (arg0 != -15994) {
            this.field8087 = null;
        }
        this.field8092.method939(28093, 5);
        field8088++;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lkfa;Lfa;)V", line = 115)
    public class552(class382 arg0, class615 arg1) {
        this.field8089 = arg1;
        this.field8087 = arg0;
    }
}
