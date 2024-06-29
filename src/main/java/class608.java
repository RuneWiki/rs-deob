import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class608 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3453(int arg0) {
        field8179++;
        int[] var1 = new int[class121.field1555.field6786];
        int var2 = 0;
        for (int var3 = arg0; var3 < class121.field1555.field6786; var3++) {
            class340 var5 = class121.field1555.method2882(var3, -22087);
            if (var5.field4198 >= 0 || var5.field4191 >= 0) {
                var1[var2++] = var3;
            }
        }
        class721.field10126 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class721.field10126[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1618(int arg0);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1620(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I[B)V")
    public abstract void method1619(int arg0, byte[] arg1);
}
