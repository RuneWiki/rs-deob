import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class186 extends class43 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field2148 = 0;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public int field2152 = -1;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[B")
    public static byte[] field2147 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Z")
    public static boolean field2151 = false;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
    public static int[] field2158;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[I")
    public static int[] field2160;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lbb;")
    public static class270 field2159;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lcq;")
    public static class72 field2161;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
    public static int[] field2162;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1151(int arg0, int arg1) {
        class54.field633 = arg1;
        field2146++;
        class157.field1832 = -1;
        class419.field5717 = arg0;
        class211.method1291(arg0 ^ 0xFFFDFFFF);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        int var1 = 1 / ((66 - arg0) / 54);
        field2162 = null;
        field2158 = null;
        field2159 = null;
        field2160 = null;
        field2161 = null;
        field2147 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
    public static final void method1153(int arg0, int arg1) {
        class316 var2 = class347.field4722[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class316 var4 = class347.field4722[var3][arg0][arg1] = class347.field4722[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4265--;
                for (class272 var5 = var4.field4256; var5 != null; var5 = var5.field3514) {
                    class133 var6 = var5.field3512;
                    if (var6.field1512 == arg0 && var6.field1518 == arg1) {
                        var6.field1528--;
                    }
                }
            }
        }
        if (class347.field4722[0][arg0][arg1] == null) {
            class347.field4722[0][arg0][arg1] = new class316(0, arg0, arg1);
            class347.field4722[0][arg0][arg1].field4250 = 1;
        }
        class347.field4722[0][arg0][arg1].field4271 = var2;
        class347.field4722[3][arg0][arg1] = null;
    }

    static {
        new class72("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field2158 = new int[50];
        field2160 = new int[2];
        field2159 = new class270();
        field2161 = new class72("Hidden", "Versteckt", "Caché", "Oculto");
        field2162 = new int[32];
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2162[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
