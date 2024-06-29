import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lod;")
    public static class101 field2726 = class46.method335(61, ")4l");

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lod;")
    public static class101 field2730 = class46.method335(103, "null");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lod;")
    public static class101 field2721 = class46.method335(-54, "<col=40ff00>");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "J")
    public long field2723;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ls;")
    public class125 field2724;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Ls;")
    public class125 field2731;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lnf;")
    public static class96 field2725;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
    public static int[][] field2732;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public final void method959(int arg0) {
        field2729++;
        if (this.field2724 == null) {
            return;
        }
        this.field2724.field2731 = this.field2731;
        this.field2731.field2724 = this.field2724;
        this.field2724 = null;
        if (arg0 != 11835) {
            this.method959(-21);
        }
        this.field2731 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method960(int arg0) {
        field2730 = null;
        field2721 = null;
        if (arg0 == -18390) {
            field2725 = null;
            field2732 = null;
            field2726 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZLod;)V")
    public static final void method961(int arg0, boolean arg1, class101 arg2) {
        int var3 = -29 / ((arg0 - 36) / 52);
        field2728++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = class157.field3625.method868(arg2, 250);
        int var7 = var4 + 6;
        int var8 = class157.field3625.method863(arg2, 250) * 13;
        class38.method275(var5 - var4, -var4 + var7, var4 + var6 + var4, var4 + var8 + var4, 0);
        class38.method276(var5 - var4, -var4 + var7, var4 + var6 + var4, var4 + var8 + var4, 16777215);
        class157.field3625.method858(arg2, var5, var7, var6, var8, 16777215, -1, 1, 1, 0);
        class119.method898(var7 - var4, var4 + var8 + var4, (byte) -73, var4 + var6 + var4, -var4 + var5);
        if (!arg1) {
            class111.method819(var8, var7, (byte) -122, var6, var5);
            return;
        }
        try {
            Graphics var9 = class134.field3062.getGraphics();
            class106.field2294.method156(var9, 0, 0, 0);
        } catch (Exception var10) {
            class134.field3062.repaint();
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Z")
    public final boolean method962(int arg0) {
        field2727++;
        if (arg0 == -31928) {
            return this.field2724 != null;
        } else {
            return false;
        }
    }
}
