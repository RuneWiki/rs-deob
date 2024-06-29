import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "J")
    public static long field77 = 0L;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Z")
    public static boolean field81 = false;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[[[I")
    public static int[][][] field80;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lmh;I)Lmh;")
    public abstract class444 method1(class444 arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method44(int arg0, int arg1) {
        field78++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 <= 13) {
            field82 = 31;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method45(int arg0) {
        field80 = null;
        if (arg0 != 1244216161) {
            method45(50);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)Z")
    public static final boolean method46(boolean arg0, int arg1) {
        field79++;
        class166 var2 = class498.method2990(arg1, (byte) -126);
        if (var2 == null) {
            return false;
        } else if (class419.field6188 == 3) {
            String var3 = "";
            if (class365.field5281 != class297.field4260) {
                var3 = ":" + (var2.field2350 + 7000);
            }
            String var4 = "";
            if (class307.field4365 != null) {
                var4 = "/p=" + class307.field4365;
            }
            String var5 = "http://" + var2.field2354 + var3 + "/l=" + class377.field5585 + "/a=" + class401.field5950 + var4 + "/j" + (class436.field6386 ? "1" : "0") + ",o" + (field81 ? "1" : "0") + ",a2";
            try {
                class164.field2319.getAppletContext().showDocument(new URL(var5), "_self");
                if (arg0) {
                    field81 = true;
                }
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class77.field1046 = var2.field2350;
            class521.field7650 = var2.field2354;
            if (class365.field5281 != class297.field4260) {
                class69.field883 = class77.field1046 + 50000;
                class310.field4422 = class77.field1046 + 40000;
                class291.field4193 = class310.field4422;
            }
            return true;
        }
    }

    static {
        new class331("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field82 = 0;
    }
}
