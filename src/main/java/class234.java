import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class234 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public int field3509 = 0;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public int field3517 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field3521 = 2048;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field3513 = 2048;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field3516 = -1;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3520 = "shake:";

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lkh;")
    public static class7 field3507 = new class7(5000);

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field3525 = 128;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field3523;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[Lle;")
    public static class127[] field3510;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1605(boolean arg0) {
        if (arg0) {
            field3507 = null;
            field3510 = null;
            field3523 = null;
            field3520 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILre;B)V", line = 26)
    private final void method1606(int arg0, int arg1, class263 arg2, byte arg3) {
        int var5 = 113 / ((28 - arg3) / 41);
        field3518++;
        if (arg0 == 1) {
            this.field3517 = arg2.method1787(false);
        } else if (arg0 == 2) {
            this.field3513 = arg2.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field3521 = arg2.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field3509 = arg2.method1845((byte) -120);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lre;BI)V", line = 59)
    public final void method1607(class263 arg0, byte arg1, int arg2) {
        field3522++;
        if (arg1 != 108) {
            return;
        }
        while (true) {
            int var4 = arg0.method1787(false);
            if (var4 == 0) {
                return;
            }
            this.method1606(var4, arg2, arg0, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lbn;", line = 92)
    public static final class187 method1608(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = var3.field3364;
            var3.field3364 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Llm;Llm;B)V", line = 107)
    public static final void method1609(class210 arg0, class210 arg1, byte arg2) {
        if (arg2 == 123) {
            client.field1944 = arg1;
            class101.field1604 = arg0;
            field3519++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 120)
    public static final void method1610(int arg0) {
        class198.method1363(-1, false);
        if (arg0 <= -69) {
            field3524++;
            System.gc();
            class163.method1155(25, 10);
        }
    }
}
