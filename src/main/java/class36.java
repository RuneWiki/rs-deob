import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class36 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[Lss;")
    private class272[] field464;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field472 = -1;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
    public static boolean field473 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "J")
    private long field467;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lss;")
    private class272 field475;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lrp;Z)V")
    public static final void method240(class276 arg0, boolean arg1) {
        field468++;
        byte[] var2 = new byte[24];
        if (class307.field4373 != null) {
            try {
                class307.field4373.method506((byte) -122, 0L);
                class307.field4373.method510(var2, 18856);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1704((byte) -48, var2, 0, 24);
        if (!arg1) {
            method240((class276) null, true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(JLss;Z)V")
    public final void method241(long arg0, class272 arg1, boolean arg2) {
        field471++;
        if (arg1.field3964 != null) {
            arg1.method1673((byte) 27);
        }
        class272 var5 = this.field464[(int) ((long) (this.field470 - 1) & arg0)];
        arg1.field3968 = var5;
        arg1.field3964 = var5.field3964;
        arg1.field3964.field3968 = arg1;
        if (!arg2) {
            this.method242(-57L, -103);
        }
        arg1.field3960 = arg0;
        arg1.field3968.field3964 = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(JI)Lss;")
    public final class272 method242(long arg0, int arg1) {
        if (arg1 > -103) {
            return null;
        }
        this.field467 = arg0;
        field469++;
        class272 var4 = this.field464[(int) ((long) (this.field470 - 1) & arg0)];
        for (this.field475 = var4.field3968; this.field475 != var4; this.field475 = this.field475.field3968) {
            if (this.field475.field3960 == arg0) {
                class272 var5 = this.field475;
                this.field475 = this.field475.field3968;
                return var5;
            }
        }
        this.field475 = null;
        return null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lss;")
    public final class272 method243(int arg0) {
        field465++;
        if (this.field475 == null) {
            return null;
        }
        class272 var2 = this.field464[(int) (this.field467 & (long) (this.field470 + arg0))];
        while (this.field475 != var2) {
            if (this.field475.field3960 == this.field467) {
                class272 var3 = this.field475;
                this.field475 = this.field475.field3968;
                return var3;
            }
            this.field475 = this.field475.field3968;
        }
        this.field475 = null;
        return null;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field470 = arg0;
        this.field464 = new class272[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class272 var3 = this.field464[var2] = new class272();
            var3.field3964 = var3;
            var3.field3968 = var3;
        }
    }

    static {
        new class326("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
