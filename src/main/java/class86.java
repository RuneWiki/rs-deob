import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class86 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lnm;")
    public volatile class337[] field1580 = new class337[2];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public volatile boolean field1579 = false;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
    public volatile boolean field1581 = false;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
    public static int[] field1584 = new int[128];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lae;")
    public class40 field1582;

    static {
        for (int var0 = 0; var0 < field1584.length; var0++) {
            field1584[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field1584[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field1584[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field1584[var3] = var3 + 4;
        }
        field1584[45] = field1584[47] = 63;
        field1584[42] = field1584[43] = 62;
        new class567("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field1581 = true;
        field1583++;
        try {
            while (!this.field1579) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class337 var2 = this.field1580[var1];
                    if (var2 != null) {
                        var2.method2076((byte) -110);
                    }
                }
                class210.method1342(-96, 10L);
                class153.method1091(this.field1582, null, -118);
            }
        } catch (Exception var9) {
            class593.method3390(null, var9, 0);
        } finally {
            Object var6 = null;
            this.field1581 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljj;B)V", line = 44)
    public static final void method790(class66 arg0, byte arg1) {
        if (class285.field4159 == null) {
            class102 var2 = new class102();
            byte[] var3 = var2.method863(128, 16, (byte) 112, 128);
            class285.field4159 = class168.method1166(107, false, var3);
        }
        field1578++;
        if (class254.field3705 == null) {
            class636 var4 = new class636();
            byte[] var5 = var4.method3674(16, -128, 128, 128);
            class254.field3705 = class168.method1166(120, false, var5);
        }
        int var6 = -82 % ((arg1 + 24) / 58);
        class61 var7 = arg0.field1139;
        if (var7.method485(35632) && class596.field8492 == null) {
            byte[] var8 = class461.method2699(4.0F, 0.6F, 4.0F, 16, 128, new class325(419684), 0.5F, 8, 16.0F, 128, (byte) -23);
            class596.field8492 = class168.method1166(121, false, var8);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 88)
    public static void method791(byte arg0) {
        if (arg0 != -121) {
            method791((byte) 48);
        }
        field1584 = null;
    }
}
