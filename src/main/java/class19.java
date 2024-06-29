import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class19 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ltg;")
    public static class605 field197 = new class605();

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lda;")
    public static class400 field194;

    @OriginalMember(owner = "client!nf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field201++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)Z")
    public static boolean method112(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method113(int arg0) {
        field195++;
        if (class620.field8721 != null) {
            try {
                class620.field8721.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 <= 0) {
            method113(-50);
        }
        class620.field8721 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static void method114(int arg0) {
        field194 = null;
        field197 = null;
        if (arg0 != -26750) {
            method113(-96);
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Z")
    public final boolean method115(int arg0) {
        if (arg0 == 0) {
            field196++;
            return class138.field2162 == this | class290.field4455 == this;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lofa;I)V")
    public static final void method116(class301 arg0, int arg1) {
        field193++;
        if (arg0.field4543.length - arg0.field4534 < 1) {
            return;
        }
        int var2 = arg0.method1987(-126);
        if (var2 < 0 || var2 > 1 || (arg0.field4543.length - arg0.field4534) < 2) {
            return;
        }
        int var3 = arg0.method1989((byte) -37);
        if ((arg0.field4543.length - arg0.field4534) < (var3 * 6)) {
            return;
        }
        if (arg1 >= -45) {
            method113(112);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1989((byte) -34);
            int var6 = arg0.method1934(-2);
            if (var5 < class472.field6852.length && class618.field8712[var5] && (class193.field3333.method1480(var5, -113).field9967 != '1' || var6 >= -1 && var6 <= 1)) {
                class472.field6852[var5] = var6;
            }
        }
    }
}
