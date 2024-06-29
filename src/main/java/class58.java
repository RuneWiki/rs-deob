import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class58 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lij;")
    public static class50 field1045 = class78.method578(124, ":trade:");

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1046 = 10;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1044;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
    public int[] field1047;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method452(int arg0, int arg1, int arg2, long arg3) {
        class65 var5 = class59.field1089[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1233 != null && var5.field1233.field982 == arg3) {
            return true;
        } else if (var5.field1235 != null && var5.field1235.field2425 == arg3) {
            return true;
        } else if (var5.field1251 != null && var5.field1251.field1868 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1244; var6++) {
                if (var5.field1236[var6].field1905 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public abstract void method453(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method454(int arg0) {
        field1048++;
        class158.method1117(this.field1047, this.field1042, this.field1040);
        if (arg0 < 119) {
            method456(true);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method455(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static final void method456(boolean arg0) {
        Object var1 = class217.field3632;
        synchronized (class217.field3632) {
            if (class164.field2807 != 0) {
                class164.field2807 = 1;
                try {
                    class217.field3632.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field1041++;
        if (!arg0) {
            field1045 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method457(int arg0) {
        field1045 = null;
        if (arg0 != 10) {
            method452(-6, -56, 18, -3L);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    protected class58() {
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method458(Component arg0, int arg1, byte arg2, int arg3);
}
