import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class214 {

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lda;")
    public static class275 field3650 = class255.method1672(93, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Z")
    public static boolean field3652 = false;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3651 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
    public long field3645;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lak;")
    public class234 field3648;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
    public static final void method1375(boolean arg0, int arg1) {
        for (class249 var2 = (class249) class277.field4835.method550(-87); var2 != null; var2 = (class249) class277.field4835.method545(104)) {
            if (var2.field4380 != null) {
                class258.field4522.method1426(var2.field4380);
                var2.field4380 = null;
            }
            if (var2.field4396 != null) {
                class258.field4522.method1426(var2.field4396);
                var2.field4396 = null;
            }
            var2.method741(3);
        }
        if (arg1 != -8291) {
            return;
        }
        field3647++;
        if (!arg0) {
            return;
        }
        for (class249 var3 = (class249) class135.field2387.method550(arg1 + 8176); var3 != null; var3 = (class249) class135.field2387.method545(arg1 + 8395)) {
            if (var3.field4380 != null) {
                class258.field4522.method1426(var3.field4380);
                var3.field4380 = null;
            }
            var3.method741(3);
        }
        for (class249 var4 = (class249) class35.field566.method1864((byte) -111); var4 != null; var4 = (class249) class35.field566.method1869(-1)) {
            if (var4.field4380 != null) {
                class258.field4522.method1426(var4.field4380);
                var4.field4380 = null;
            }
            var4.method741(3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method1376(byte arg0) {
        field3654++;
        if (class89.field1501 == 5) {
            if (arg0 != -5) {
                method1377(-110, 69);
            }
            class89.field1501 = 6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public static final int method1377(int arg0, int arg1) {
        if (arg1 != 1830) {
            return 108;
        }
        field3653++;
        class94 var2 = class14.method71(true, arg0);
        int var3 = var2.field1614;
        int var4 = var2.field1618;
        int var5 = var2.field1616;
        int var6 = class262.field4548[var5 - var3];
        return var6 & class218.field3698[var4] >> var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1378(int arg0) {
        if (arg0 != 0) {
            method1378(5);
        }
        field3650 = null;
    }
}
