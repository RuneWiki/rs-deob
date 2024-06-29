import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class55 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field972 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lmd;")
    public static class273 field974;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method347(boolean arg0, Component arg1) {
        if (arg0) {
            method350(-84);
        }
        field977++;
        arg1.removeKeyListener(class32.field523);
        arg1.removeFocusListener(class32.field523);
        class23.field424 = -1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lkm;")
    public static final class230 method348(int arg0) {
        class230 var1 = new class230(class134.field2214, class253.field4293, class49.field842[0], class73.field1283[0], class297.field4859[0], class43.field656[0], class289.field4758[0], class185.field2952);
        if (arg0 == -32766) {
            field976++;
            class155.method1175(arg0 ^ 0x7FD0);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Z")
    public static final boolean method349(int arg0) {
        int var1 = -119 / ((-arg0 - 64) / 40);
        field980++;
        if (class147.field2425) {
            try {
                class288.method2005(class142.field2344.field1380, (byte) 100, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static final void method350(int arg0) {
        if (arg0 >= -10) {
            field972 = 78;
        }
        field978++;
        class248.field4139.method94(34);
        class279.field4629.method94(34);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method351(boolean arg0) {
        if (!arg0) {
            field972 = -31;
        }
        field974 = null;
    }
}
