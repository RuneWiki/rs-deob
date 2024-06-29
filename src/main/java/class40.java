import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 {

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "I")
    public static int field506 = 500;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "La;")
    public static class1 field505 = class3.method36("sprites", -101);

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "La;")
    public static class1 field507 = class3.method36("Key", -104);

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "La;")
    public static class1 field510 = class3.method36("Altar", -95);

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "La;")
    public static class1 field514 = class3.method36("Loading", -117);

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "La;")
    public static class1 field513 = class3.method36("Archery Shop", -119);

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "La;")
    public static class1 field511 = class3.method36("Fishing Shop", -113);

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "La;")
    public static class1 field503 = class3.method36("Loom", -119);

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "I")
    public static volatile int field516 = 0;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Z")
    public static volatile boolean field502 = false;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "B")
    public byte field517;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field515;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Z")
    public static boolean field508;

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "[B")
    public byte[] field509;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 48)
    public final void method258(int arg0) {
        if (arg0 != 0) {
            method260(true);
        }
        boolean var2 = true;
        if (this.field509 == null) {
            return;
        }
        this.field517 = this.field509[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field509[var3] != this.field517) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field509 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)V", line = 91)
    public static final void method259(int arg0) {
        if (class10.field110[0][class28.field395][class4.field42] == null) {
            class3.field33 = null;
        } else {
            class3.field33 = class10.field110[0][class28.field395][class4.field42];
        }
        if (class10.field110[1][class28.field395][class4.field42] == null) {
            class2.field20 = null;
        } else {
            class2.field20 = class10.field110[1][class28.field395][class4.field42];
        }
        if (arg0 != 18508) {
            field507 = null;
        }
        if (class10.field110[2][class28.field395][class4.field42] == null) {
            class24.field230 = null;
        } else {
            class24.field230 = class10.field110[2][class28.field395][class4.field42];
        }
        if (class10.field110[3][class28.field395][class4.field42] == null) {
            class39.field494 = null;
        } else {
            class39.field494 = class10.field110[3][class28.field395][class4.field42];
        }
        if (class10.field110[4][class28.field395][class4.field42] == null) {
            class33.field450 = null;
        } else {
            class33.field450 = class10.field110[4][class28.field395][class4.field42];
        }
        if (class35.field473[class28.field395][class4.field42] == null) {
            class7.field74 = null;
        } else {
            class7.field74 = class35.field473[class28.field395][class4.field42];
        }
        if (class33.field459[class28.field395][class4.field42] == null) {
            class33.field464 = null;
        } else {
            class33.field464 = class33.field459[class28.field395][class4.field42];
        }
        if (class2.field17[class28.field395][class4.field42] == null) {
            class6.field60 = null;
        } else {
            class6.field60 = class2.field17[class28.field395][class4.field42];
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)V", line = 162)
    public static void method260(boolean arg0) {
        field505 = null;
        field507 = null;
        field510 = null;
        if (arg0) {
            return;
        }
        field515 = null;
        field511 = null;
        field514 = null;
        field513 = null;
        field503 = null;
    }
}
