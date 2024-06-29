import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class327 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lgu;")
    public static class412 field4919 = new class412(8);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
    public static boolean field4926 = false;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lak;")
    public static class234 field4927 = new class234("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lak;")
    public static class234 field4928 = new class234(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lak;")
    public static class234 field4929 = new class234("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lob;")
    public static class521 field4932 = new class521(65, 0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lub;")
    public static class18 field4930;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lbg;")
    public class327 field4922;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Llq;")
    public class389 field4921;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2081(int arg0) {
        field4927 = null;
        int var1 = -75 % ((-arg0 - 70) / 56);
        field4930 = null;
        field4928 = null;
        field4929 = null;
        field4932 = null;
        field4919 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public final void method2082(boolean arg0) {
        field4924++;
        if (class367.field5397 >= 500) {
            return;
        }
        this.field4920 = 0;
        this.field4922 = class169.field2492;
        this.field4921 = null;
        if (arg0) {
            class367.field5397++;
            class169.field2492 = this;
        }
    }
}
